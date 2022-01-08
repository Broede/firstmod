package firstmod.world.block;

import javax.annotation.Nullable;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class BurnableBlockItem extends BlockItem {

	public BurnableBlockItem(Block block, Properties properties) {
		super(block, properties);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType)
    {
        return 14400;
    }
}
