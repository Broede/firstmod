package firstmod.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.extensions.IForgeBlock;

public class ModLeavesBlock extends LeavesBlock implements IForgeBlock {

	private int flammability, fireSpreadSpeed;

	public ModLeavesBlock(Properties p_54422_, int flammability, int fireSpreadSpeed) {
		super(p_54422_);
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
    }}
