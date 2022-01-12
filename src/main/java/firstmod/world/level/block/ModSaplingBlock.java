package firstmod.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.extensions.IForgeBlock;

public class ModSaplingBlock extends SaplingBlock implements IForgeBlock {
	private int flammability, fireSpreadSpeed;

	public ModSaplingBlock(AbstractTreeGrower p_55978_, Properties p_55979_, int flammability, int fireSpreadSpeed) {
		super(p_55978_, p_55979_);
		this.flammability = flammability;
		this.fireSpreadSpeed = fireSpreadSpeed;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face)
    {
		return this.flammability;
    }

	@Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face)
    {
		return this.fireSpreadSpeed;
    }
}
