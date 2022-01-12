package firstmod.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.extensions.IForgeBlock;
import net.minecraft.world.level.block.Block;

public class ModBlock extends Block implements IForgeBlock {

	private int flammability, fireSpreadSpeed;

	public ModBlock(Properties p_49795_, int flammability, int fireSpreadSpeed) {
		super(p_49795_);
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
