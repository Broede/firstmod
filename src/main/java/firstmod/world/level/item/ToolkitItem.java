package firstmod.world.level.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ToolkitItem extends Item {
	
	public ToolkitItem(int durability) {
		super(new Item.Properties().stacksTo(1).durability(durability).tab(CreativeModeTab.TAB_TOOLS));
	}

	public ToolkitType getToolkitType() {
		return null;
	}
}
