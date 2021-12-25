package firstmod.tileentity;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import javax.annotation.Nonnull;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import firstmod.blocks.CopperHopperItemHandler;
import firstmod.init.ModBlockEntities;
import firstmod.world.block.entity.CopperHopperMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.util.Mth;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.WorldlyContainerHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HopperBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.Hopper;
import net.minecraft.world.level.block.entity.HopperBlockEntity;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

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
