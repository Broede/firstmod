package firstmod.world.block.entity;

import javax.annotation.Nonnull;

import firstmod.init.ModContainers;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class CopperHopperMenu extends AbstractContainerMenu {
	private final Container hopperInventory;

	public CopperHopperMenu(int windowId, Inventory playerInventory) {
		this(windowId, playerInventory, new SimpleContainer(1));
	}
	
	public CopperHopperMenu(int windowId, Inventory playerInventory, Container hopperInventory) {
		super(ModContainers.COPPER_HOPPER.get(), windowId);
		this.hopperInventory = hopperInventory;
		checkContainerSize(hopperInventory, 1);
		hopperInventory.startOpen(playerInventory.player);

		this.addSlot(new Slot(hopperInventory, 0, 80, 20));
		
		for ( int i = 0; i < 3; ++i ) {
			for ( int j = 0; j < 9; ++j ) {
				this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, i * 18 + 51));
			}
		}
		
		for ( int i = 0; i < 9; ++i ) {
			this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 109));
		}
		return;
	}

	@Override
	public boolean stillValid(@Nonnull Player player) {
		return this.hopperInventory.stillValid(player);
	}
	
	@Override
	@Nonnull
	public ItemStack quickMoveStack(@Nonnull Player playerIn, int index) {
		ItemStack result = ItemStack.EMPTY;
		Slot slot = this.slots.get(index);
		if ( slot != null && slot.hasItem() ) {
			ItemStack copystack = slot.getItem();
			result = copystack.copy();
			if ( index < this.hopperInventory.getContainerSize() ) {
				if ( !this.moveItemStackTo(copystack, this.hopperInventory.getContainerSize(), this.slots.size(), true) ) {
					return ItemStack.EMPTY;
				}
			} else if ( !this.moveItemStackTo(copystack, 0, this.hopperInventory.getContainerSize(), false) ) {
				return ItemStack.EMPTY;
			}
			
			if ( copystack.isEmpty() ) {
				slot.set(ItemStack.EMPTY);
			} else {
				slot.setChanged();
			}
		}
		return result;
	}
	
	@Override
	public void removed(@Nonnull Player player) {
		super.removed(player);
		this.hopperInventory.stopOpen(player);
	}
}
