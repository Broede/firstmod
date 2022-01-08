package firstmod.world.block.entity;

import firstmod.init.ModBlockEntities;
import firstmod.world.block.CopperHopperItemHandler;
import firstmod.world.inventory.CopperHopperMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;

public class CopperHopperBlockEntity extends AbstractHopperBlockEntity implements WorldlyContainer {
	private static final int TRANSFER_COOLDOWN = 8;
	private static final int CONTAINER_SIZE = 1;
	
	public CopperHopperBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlockEntities.COPPER_HOPPER.get(), pos, state, TRANSFER_COOLDOWN);
	}
	
	@Override
	public int getContainerSize() {
		return CONTAINER_SIZE;
	}

	@Override
	protected Component getDefaultName() {
		return new TranslatableComponent("container.firstmod.copper_hopper");
	}
	
	@Override
	protected AbstractContainerMenu createMenu(int windowId, Inventory playerInventory) {
		return new CopperHopperMenu(windowId, playerInventory, this);
	}
	
	@Override
	protected net.minecraftforge.items.IItemHandler createUnSidedHandler() {
		return new CopperHopperItemHandler(this);
	}
	
	@Override
	public int[] getSlotsForFace(Direction side) {
		return this.getTransferableSlots();
	}

	@Override
	public boolean canPlaceItemThroughFace(int p_19235_, ItemStack p_19236_, Direction p_19237_) {
		return true;
	}

	@Override
	public boolean canTakeItemThroughFace(int p_19239_, ItemStack p_19240_, Direction p_19241_) {
		return true;
	}
}
