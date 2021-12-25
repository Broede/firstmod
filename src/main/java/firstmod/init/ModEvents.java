package firstmod.init;

import firstmod.core.FirstMod;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FirstMod.MOD_ID)
public class ModEvents {

	@SubscribeEvent
	public static void shearWoolIntoString(PlayerInteractEvent.RightClickBlock event) {
		if ( !event.getSide().isClient() ) {
			Level level = event.getWorld();
			BlockPos blockPos = event.getHitVec().getBlockPos();
			BlockState blockState = level.getBlockState(blockPos);
			if ( blockState.getMaterial() == Material.WOOL ) {
				Player player = event.getPlayer();
				ItemStack item = player.getMainHandItem();
				if ( item.getItem() == Items.SHEARS || item.getItem() == ModItems.COPPER_SHEARS.get() ) {
					item.setDamageValue(item.getDamageValue()+1);
					level.playSound(null, player.getX(), player.getY(), player.getZ(), new SoundEvent(new ResourceLocation("minecraft:entity.sheep.shear")),
							SoundSource.NEUTRAL, 1F, 1F);
					level.destroyBlock(blockPos, false);
					ItemStack string = new ItemStack(Items.STRING);
					string.setCount(4);
					player.drop(string, false);
				}
			}
		}
	}
}
