package firstmod.blocks;

import javax.annotation.Nullable;

import firstmod.init.ModBlockEntities;
import firstmod.tileentity.AbstractHopperBlockEntity;
import firstmod.tileentity.CopperHopperBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CopperHopperBlock extends AbstractHopperBlock {
	public CopperHopperBlock(Block.Properties properties) {
		super(properties);
	}
	
	@Nullable
	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new CopperHopperBlockEntity(pos, state);
	}
	
	@Override
	protected BlockEntityType<? extends AbstractHopperBlockEntity> getBlockEntityType() {
		return ModBlockEntities.COPPER_HOPPER.get();
	}
}