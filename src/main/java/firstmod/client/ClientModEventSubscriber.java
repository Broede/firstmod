package firstmod.client;

import firstmod.client.gui.screens.inventory.CopperHopperScreen;
import firstmod.client.renderer.entity.CopperArrowRenderer;
import firstmod.client.renderer.entity.FlintArrowRenderer;
import firstmod.client.renderer.entity.IronArrowRenderer;
import firstmod.client.renderer.entity.ModFishingHookRenderer;
import firstmod.client.renderer.entity.TitaniumArrowRenderer;
import firstmod.client.renderer.entity.WoodenArrowRenderer;
import firstmod.client.renderer.item.ModItemProperties;
import firstmod.core.FirstMod;
import firstmod.init.ModBlocks;
import firstmod.init.ModContainers;
import firstmod.init.ModEntities;
import firstmod.init.ModFluids;
import firstmod.init.ModItems;
import firstmod.init.ModTextures;
import net.minecraft.client.gui.screens.MenuScreens;
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
	public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ModEntities.WOODEN_ARROW.get(), WoodenArrowRenderer::new);
		event.registerEntityRenderer(ModEntities.FLINT_ARROW.get(), FlintArrowRenderer::new);
		event.registerEntityRenderer(ModEntities.COPPER_ARROW.get(), CopperArrowRenderer::new);
		event.registerEntityRenderer(ModEntities.IRON_ARROW.get(), IronArrowRenderer::new);
		event.registerEntityRenderer(ModEntities.TITANIUM_ARROW.get(), TitaniumArrowRenderer::new);
		event.registerEntityRenderer(ModEntities.MOD_FISHING_BOBBER.get(), ModFishingHookRenderer::new);

		ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_DOOR.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_TRAPDOOR.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_BARS.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_CHAIN.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_LANTERN.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModFluids.CRUDE_OIL_BLOCK.get(), RenderType.translucent());
    	ItemBlockRenderTypes.setRenderLayer(ModFluids.CRUDE_OIL_SOURCE.get(), RenderType.translucent());
    	ItemBlockRenderTypes.setRenderLayer(ModFluids.CRUDE_OIL_FLOWING.get(), RenderType.translucent());

    	MenuScreens.register(ModContainers.COPPER_HOPPER.get(), CopperHopperScreen::new);
    	
    	ModItemProperties.fishingRodStates(ModItems.COPPER_FISHING_ROD.get());
    	ModItemProperties.fishingRodStates(ModItems.TITANIUM_FISHING_ROD.get());
    	ModItemProperties.shieldStates(ModItems.BUCKLER.get());
    	
    	
	}
	
	@SubscribeEvent
	public static void onStitchEvent(TextureStitchEvent.Pre event) {
		event.addSprite(ModTextures.LOCATION_BUCKLER.texture());
	}
}
