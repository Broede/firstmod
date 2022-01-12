package firstmod.world.level.block;

import javax.annotation.Nullable;

import firstmod.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
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

	@Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, Level world, BlockPos pos, Player player,
                                           ItemStack stack, ToolAction toolAction) {
        if(stack.getItem() instanceof AxeItem) {
            if(state.is(ModBlocks.SHARINGA_LOG.get())) {
                return ModBlocks.STRIPPED_SHARINGA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.SHARINGA_WOOD.get())) {
                return ModBlocks.STRIPPED_SHARINGA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, world, pos, player, stack, toolAction);
    }}
