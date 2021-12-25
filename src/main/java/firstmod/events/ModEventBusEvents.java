package firstmod.events;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

import firstmod.core.FirstMod;

@Mod.EventBusSubscriber(modid = FirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
	@SubscribeEvent
	public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
		event.getRegistry().registerAll(
				new HoovedAnimalLootModifier.Serializer().setRegistryName
					(new ResourceLocation(FirstMod.MOD_ID, "add_hooves")),
				new ArrowDroppersLootModifier.Serializer().setRegistryName
					(new ResourceLocation(FirstMod.MOD_ID, "swap_arrows"))
						);
	}
}
