package firstmod.ui;

import firstmod.init.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FirstModCreativeTab {

	public static final CreativeModeTab BROEDES_TAB = new CreativeModeTab("firstmodCreativeTab") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ModItems.COPPER_FISHING_ROD.get());
		}
	};
}
