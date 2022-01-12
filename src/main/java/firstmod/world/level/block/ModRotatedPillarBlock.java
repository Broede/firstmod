package firstmod.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.extensions.IForgeBlock;

public class ModRotatedPillarBlock extends RotatedPillarBlock implements IForgeBlock {

	private int flammability, fireSpreadSpeed;

	public ModRotatedPillarBlock(Properties p_55926_, int flammability, int fireSpreadSpeed) {
		super(p_55926_);
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
