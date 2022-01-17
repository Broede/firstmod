package firstmod.world.inventory;

import java.util.Optional;

import firstmod.init.ModContainers;
import firstmod.init.ModItems;
import firstmod.init.ModRecipes;
import firstmod.world.level.item.BasicToolkitItem;
import firstmod.world.level.item.crafting.ToolkitRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.protocol.game.ClientboundContainerSetSlotPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.Container;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.StackedContents;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.RecipeBookMenu;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.inventory.ResultContainer;
import net.minecraft.world.inventory.ResultSlot;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.Level;

public class BasicToolkitMenu extends RecipeBookMenu<CraftingContainer> implements MenuProvider {
	private final CraftingContainer craftSlots = new CraftingContainer(this, 1, 3);
	private final ResultContainer resultSlots = new ResultContainer();
	private final ContainerLevelAccess access;
	private final Player player;

	protected BasicToolkitMenu(MenuType<?> p_38851_, int p_38852_) {
		super(p_38851_, p_38852_);
		this.access = null;
		this.player = null;
	}
	
	public BasicToolkitMenu(int windowId, Inventory playerInventory) {
		this(windowId, playerInventory, ContainerLevelAccess.NULL);
	}

	public BasicToolkitMenu(int p_39356_, Inventory p_39357_, ContainerLevelAccess p_39358_) {
		super(ModContainers.BASIC_TOOLKIT.get(), p_39356_);
		this.access = p_39358_;
		this.player = p_39357_.player;
		this.addSlot(new ResultSlot(p_39357_.player, this.craftSlots, this.resultSlots, 0, 126, 20));

		for(int i = 0; i < 3; ++i) {
			this.addSlot(new Slot(this.craftSlots, i, 35 + i * 18, 20));
		}

		for(int k = 0; k < 3; ++k) {
			for(int i1 = 0; i1 < 9; ++i1) {
				this.addSlot(new Slot(p_39357_, i1 + k * 9 + 9, 8 + i1 * 18, 51 + k * 18));
			}
		}

		for(int l = 0; l < 9; ++l) {
			this.addSlot(new Slot(p_39357_, l, 8 + l * 18, 109));
		}

	}

	@Override
	public boolean stillValid(Player p_38874_) {
		return p_38874_ != null && this.getToolkit(p_38874_) != null && this.getToolkit(p_38874_).getItem() instanceof BasicToolkitItem;
	}
	
	public ItemStack getToolkit(Player player) {
		return player.getItemInHand(InteractionHand.MAIN_HAND);
	}

	protected static void slotChangedCraftingGrid(AbstractContainerMenu p_150547_, Level p_150548_, Player p_150549_, CraftingContainer p_150550_, ResultContainer p_150551_) {
		if (!p_150548_.isClientSide) {
			boolean broken = false;
			ServerPlayer serverplayer = (ServerPlayer)p_150549_;
			ItemStack itemstack = ItemStack.EMPTY;
			Optional<ToolkitRecipe> optional = p_150548_.getServer().getRecipeManager().getRecipeFor(ModRecipes.TOOLKIT_CRAFTING, p_150550_, p_150548_);
			if (optional.isPresent()) {
				ToolkitRecipe toolkitRecipe = optional.get();
				itemstack = toolkitRecipe.assemble(p_150550_);
				ItemStack toolkit = serverplayer.getItemInHand(InteractionHand.MAIN_HAND);
				toolkit.setDamageValue(toolkit.getDamageValue() + itemstack.getCount());
				if ( toolkit.getDamageValue() <= 0 ) {
					ItemStack emptyToolbox = new ItemStack(ModItems.EMPTY_TOOLBOX.get());
					serverplayer.setItemInHand(InteractionHand.MAIN_HAND, emptyToolbox);
					broken = true;
				}
			}

			p_150551_.setItem(0, itemstack);
			p_150547_.setRemoteSlot(0, itemstack);
			serverplayer.connection.send(new ClientboundContainerSetSlotPacket(p_150547_.containerId, p_150547_.incrementStateId(), 0, itemstack));
			if ( broken ) {
				serverplayer.playSound(new SoundEvent(new ResourceLocation("minecraft:entity.item.break")), 1F, 1F);
				serverplayer.closeContainer();
			}
		}
	}

	public void slotsChanged(Container p_39366_) {
		this.access.execute((p_39386_, p_39387_) -> {
			slotChangedCraftingGrid(this, p_39386_, this.player, this.craftSlots, this.resultSlots);
		});
	}

	public void fillCraftSlotsStackedContents(StackedContents p_39374_) {
		this.craftSlots.fillStackedContents(p_39374_);
	}

	public void clearCraftingContent() {
		this.craftSlots.clearContent();
		this.resultSlots.clearContent();
	}

	public boolean recipeMatches(Recipe<? super CraftingContainer> p_39384_) {
		return p_39384_.matches(this.craftSlots, this.player.level);
	}

	public void removed(Player p_39389_) {
		super.removed(p_39389_);
		this.access.execute((p_39371_, p_39372_) -> {
			this.clearContainer(p_39389_, this.craftSlots);
		});
	}

	public ItemStack quickMoveStack(Player p_39391_, int p_39392_) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = this.slots.get(p_39392_);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (p_39392_ == 0) {
				this.access.execute((p_39378_, p_39379_) -> {
					itemstack1.getItem().onCraftedBy(itemstack1, p_39378_, p_39391_);
				});
				if (!this.moveItemStackTo(itemstack1, 4, 40, true)) {
					return ItemStack.EMPTY;
				}

				slot.onQuickCraft(itemstack1, itemstack);
			} else if (p_39392_ >= 4 && p_39392_ < 40) {
				if (!this.moveItemStackTo(itemstack1, 1, 3, false)) {
					if (p_39392_ < 37) {
						if (!this.moveItemStackTo(itemstack1, 31, 40, false)) {
							return ItemStack.EMPTY;
						}
					} else if (!this.moveItemStackTo(itemstack1, 4, 31, false)) {
						return ItemStack.EMPTY;
					}
				}
			} else if (!this.moveItemStackTo(itemstack1, 4, 40, false)) {
				return ItemStack.EMPTY;
			}

			if (itemstack1.isEmpty()) {
				slot.set(ItemStack.EMPTY);
			} else {
				slot.setChanged();
			}

			if (itemstack1.getCount() == itemstack.getCount()) {
				return ItemStack.EMPTY;
			}

			slot.onTake(p_39391_, itemstack1);
			if (p_39392_ == 0) {
				p_39391_.drop(itemstack1, false);
			}
		}

		return itemstack;
	}

	public boolean canTakeItemForPickAll(ItemStack p_39381_, Slot p_39382_) {
		return p_39382_.container != this.resultSlots && super.canTakeItemForPickAll(p_39381_, p_39382_);
	}

	public int getResultSlotIndex() {
		return 0;
	}

	public int getGridWidth() {
		return this.craftSlots.getWidth();
	}

	public int getGridHeight() {
		return this.craftSlots.getHeight();
	}

	public int getSize() {
		return 4;
	}

	public RecipeBookType getRecipeBookType() {
		return RecipeBookType.CRAFTING;
	}

	public boolean shouldMoveToInventory(int p_150553_) {
		return p_150553_ != this.getResultSlotIndex();
	}

	@Override
	public AbstractContainerMenu createMenu(int p_39954_, Inventory p_39955_, Player p_39956_) {
		return new BasicToolkitMenu(p_39954_, p_39955_);
	}

	@Override
	public Component getDisplayName() {
		return new TranslatableComponent("menu.firstmod.display_name.basic_toolkit");
	}
}
