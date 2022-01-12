package firstmod.client.renderer.item;

import firstmod.core.FirstMod;
import firstmod.world.level.item.ModFishingRodItem;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class ModItemProperties {
	
	public static void fishingRodStates(Item item) {
		ItemProperties.register(item, new ResourceLocation(FirstMod.MOD_ID + ":cast"), (itemStack, p_174626_, player, p_174628) -> {
			if ( player == null ) {
				return 0.0F;
			} else {
				boolean flag = player.getMainHandItem() == itemStack;
				boolean flag1 = player.getOffhandItem() == itemStack;
				if ( player.getMainHandItem().getItem() instanceof ModFishingRodItem ) {
					flag1 = false;
				}
				
				return ( flag || flag1 ) && player instanceof Player && ((Player)player).fishing != null ? 1.0F : 0.0F;
			}
		});
	}

	public static void shieldStates(Item item) {
		ItemProperties.register(item, new ResourceLocation(FirstMod.MOD_ID + ":blocking"), (p_174590_, p_174591_, p_174592_, p_174593) -> {
			return p_174592_ != null && p_174592_.isUsingItem() && p_174592_.getUseItem() == p_174590_ ? 1.0F : 0.0F;
		});
	}
}
