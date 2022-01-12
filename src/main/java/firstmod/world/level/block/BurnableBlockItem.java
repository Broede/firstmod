package firstmod.world.level.block;

import javax.annotation.Nullable;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class BurnableBlockItem extends BlockItem {
	private int burntime;

	public BurnableBlockItem(Block block, Properties properties, int burntime) {
		super(block, properties);
		this.burntime = burntime;
	}

	@Override
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType)
    {
        return this.burntime;
    }
}
