package firstmod.util;

import firstmod.core.FirstMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;

public class ModTags {

	public static class EntityTypes {

		public static final Tags.IOptionalNamedTag<EntityType<?>> HOOVED_ANIMALS = createTag("entity_types/hooved_animals");

		public static final Tags.IOptionalNamedTag<EntityType<?>> ARROW_DROPPERS = createTag("entity_types/arrow_droppers");
		
		
		private static Tags.IOptionalNamedTag<EntityType<?>> createTag(String name) {
			return EntityTypeTags.createOptional(new ResourceLocation(FirstMod.MOD_ID, name));
		}
	}
	
	public static class Items {
		public static final Tags.IOptionalNamedTag<Item> STICKIES = createTag("items/stickies");
		
		private static Tags.IOptionalNamedTag<Item> createTag(String name) {
			return ItemTags.createOptional(new ResourceLocation(FirstMod.MOD_ID, name));
		}
	}
}
