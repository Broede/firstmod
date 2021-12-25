package firstmod.client;

import firstmod.client.gui.screens.inventory.CopperHopperScreen;
import firstmod.client.renderer.entity.CopperArrowRenderer;
import firstmod.client.renderer.entity.FlintArrowRenderer;
import firstmod.client.renderer.entity.IronArrowRenderer;
import firstmod.client.renderer.entity.WoodenArrowRenderer;
import firstmod.core.FirstMod;
import firstmod.init.ModBlocks;
import firstmod.init.ModContainers;
import firstmod.init.ModEntityTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {

	@SubscribeEvent
	public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ModEntityTypes.WOODEN_ARROW.get(), WoodenArrowRenderer::new);
		event.registerEntityRenderer(ModEntityTypes.FLINT_ARROW.get(), FlintArrowRenderer::new);
		event.registerEntityRenderer(ModEntityTypes.COPPER_ARROW.get(), CopperArrowRenderer::new);
		event.registerEntityRenderer(ModEntityTypes.IRON_ARROW.get(), IronArrowRenderer::new);

		ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_DOOR.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_TRAPDOOR.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_BARS.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_CHAIN.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_LANTERN.get(), RenderType.cutout());

    	MenuScreens.register(ModContainers.COPPER_HOPPER.get(), CopperHopperScreen::new);
	}
}
