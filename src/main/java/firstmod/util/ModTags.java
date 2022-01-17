package firstmod.util;

import firstmod.core.FirstMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
	public static final Tag.Named<Block> END_ORE_REPLACEABLES = bind("end_ore_replaceables");
	public static final Tag.Named<Block> MAPLE_LOGS = bind("maple_logs");
	public static final Tag.Named<Block> SAKURA_LOGS = bind("maple_logs");
	public static final Tag.Named<Block> SHARINGA_LOGS = bind("maple_logs");
	public static final Tag.Named<Block> WILLOW_LOGS = bind("maple_logs");

	public static Tag.Named<Block> bind(String p_13117_) {
		return BlockTags.bind(p_13117_);
	}
	
	public static class EntityTypes {
		public static final Tags.IOptionalNamedTag<EntityType<?>> HOOVED_ANIMALS = createTag("entity_types/hooved_animals");
		public static final Tags.IOptionalNamedTag<EntityType<?>> ARROW_DROPPERS = createTag("entity_types/arrow_droppers");
		
		private static Tags.IOptionalNamedTag<EntityType<?>> createTag(String name) {
			return EntityTypeTags.createOptional(new ResourceLocation(FirstMod.MOD_ID, name));
		}
	}
	
	public static class Items {
		public static final Tags.IOptionalNamedTag<Item> STICKIES = createTag("items/stickies");
		public static final Tags.IOptionalNamedTag<Item> TOOLKITS = createTag("items/toolkits");
		
		private static Tags.IOptionalNamedTag<Item> createTag(String name) {
			return ItemTags.createOptional(new ResourceLocation(FirstMod.MOD_ID, name));
		}
	}
}
