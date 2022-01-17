package firstmod.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import firstmod.client.gui.screens.inventory.BasicToolkitScreen;
import firstmod.client.gui.screens.inventory.CopperHopperScreen;
import firstmod.client.renderer.item.ModItemProperties;
import firstmod.data.worldgen.OreGeneration;
import firstmod.init.ModBlockEntities;
import firstmod.init.ModBlocks;
import firstmod.init.ModContainers;
import firstmod.init.ModEntities;
import firstmod.init.ModItems;
import firstmod.init.ModLootModifiers;
import firstmod.init.ModRecipes;
import firstmod.world.level.block.ModWoodTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod(FirstMod.MOD_ID)
@EventBusSubscriber(modid = FirstMod.MOD_ID, bus = Bus.MOD)
public class FirstMod {
	public static final Logger LOGGER = LogManager.getLogger();
	
	public static final String MOD_ID = "firstmod";
	
	public FirstMod() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		eventBus.addListener(this::onCommonSetup);
		eventBus.addListener(this::onGatherData);
		
		ModBlocks.BLOCKS.register(eventBus);
		ModBlockEntities.BLOCK_ENTITIES.register(eventBus);
		ModContainers.CONTAINERS.register(eventBus);
		ModEntities.ENTITIES.register(eventBus);
		ModItems.ITEMS.register(eventBus);
		ModLootModifiers.GLM.register(eventBus);
		ModRecipes.register(eventBus);

		MinecraftForge.EVENT_BUS.register(this);
	}

    @SubscribeEvent
	public void onCommonSetup(final FMLCommonSetupEvent event) {
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_DOOR.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_TRAPDOOR.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_BARS.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_CHAIN.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_LANTERN.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAPLE_DOOR.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAPLE_LEAVES.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAPLE_SAPLING.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAPLE_TRAPDOOR.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAKURA_DOOR.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAKURA_LEAVES.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAKURA_SAPLING.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAKURA_TRAPDOOR.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.SHARINGA_DOOR.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.SHARINGA_LEAVES.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.SHARINGA_SAPLING.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.SHARINGA_TRAPDOOR.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.WILLOW_DOOR.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.WILLOW_LEAVES.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.WILLOW_SAPLING.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(ModBlocks.WILLOW_TRAPDOOR.get(), RenderType.cutout());

    	ModItemProperties.fishingRodStates(ModItems.COPPER_FISHING_ROD.get());
    	ModItemProperties.fishingRodStates(ModItems.TITANIUM_FISHING_ROD.get());
    	ModItemProperties.shieldStates(ModItems.BUCKLER.get());

    	event.enqueueWork(() -> MenuScreens.register(ModContainers.COPPER_HOPPER.get(), CopperHopperScreen::new));
    	event.enqueueWork(() -> MenuScreens.register(ModContainers.BASIC_TOOLKIT.get(), BasicToolkitScreen::new));
    	
    	WoodType.register(ModWoodTypes.MAPLE);
    	WoodType.register(ModWoodTypes.SAKURA);
    	WoodType.register(ModWoodTypes.SHARINGA);
    	WoodType.register(ModWoodTypes.WILLOW);
    	
    	OreGeneration.registerOres();
	}
    
    @SubscribeEvent
    public void onGatherData(GatherDataEvent event) {
    	;
    }
}
