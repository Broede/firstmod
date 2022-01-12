package firstmod.client;

import firstmod.client.renderer.entity.CopperArrowRenderer;
import firstmod.client.renderer.entity.FlintArrowRenderer;
import firstmod.client.renderer.entity.IronArrowRenderer;
import firstmod.client.renderer.entity.ModFishingHookRenderer;
import firstmod.client.renderer.entity.TitaniumArrowRenderer;
import firstmod.client.renderer.entity.WoodenArrowRenderer;
import firstmod.client.renderer.item.ModItemProperties;
import firstmod.core.FirstMod;
import firstmod.init.ModBlocks;
import firstmod.init.ModEntities;
import firstmod.init.ModItems;
import firstmod.init.ModTextures;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {

	@SubscribeEvent
	public static void onEntityRendererRegistry(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ModEntities.WOODEN_ARROW.get(), WoodenArrowRenderer::new);
		event.registerEntityRenderer(ModEntities.FLINT_ARROW.get(), FlintArrowRenderer::new);
		event.registerEntityRenderer(ModEntities.COPPER_ARROW.get(), CopperArrowRenderer::new);
		event.registerEntityRenderer(ModEntities.IRON_ARROW.get(), IronArrowRenderer::new);
		event.registerEntityRenderer(ModEntities.TITANIUM_ARROW.get(), TitaniumArrowRenderer::new);
		event.registerEntityRenderer(ModEntities.MOD_FISHING_BOBBER.get(), ModFishingHookRenderer::new);
	}
	
	@SubscribeEvent
	public static void onStitchEvent(TextureStitchEvent.Pre event) {
		event.addSprite(ModTextures.LOCATION_BUCKLER.texture());
	}
}
