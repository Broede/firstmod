package firstmod.world.level.item;

import firstmod.world.level.entity.projectile.ModFishingHook;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;

public class ModFishingRodItem extends FishingRodItem {

	public ModFishingRodItem(Item.Properties properties) {
		super(properties);
	}

	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		ItemStack itemStack = player.getItemInHand(hand);
		if ( player.fishing != null ) {
			if ( !level.isClientSide ) {
				int i = player.fishing.retrieve(itemStack);
				itemStack.hurtAndBreak(i, player, (param) -> {
					param.broadcastBreakEvent(hand);
				});
			}

			level.playSound((Player)null, player.getX(), player.getY(), player.getZ(), SoundEvents.FISHING_BOBBER_RETRIEVE, SoundSource.NEUTRAL, 1.0F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
			level.gameEvent(player, GameEvent.FISHING_ROD_REEL_IN, player);
		} else {
			level.playSound((Player)null, player.getX(), player.getY(), player.getZ(), SoundEvents.FISHING_BOBBER_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
			if ( !level.isClientSide ) {
				int k = EnchantmentHelper.getFishingSpeedBonus(itemStack);
				int j = EnchantmentHelper.getFishingLuckBonus(itemStack);
				level.addFreshEntity(new ModFishingHook(player, level, j, k));
			}
			
			player.awardStat(Stats.ITEM_USED.get(this));
			level.gameEvent(player, GameEvent.FISHING_ROD_CAST, player);
		}
		
		return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide());
	}
	
	public int getEnchantmentValue() {
		return 1;
	}
}
