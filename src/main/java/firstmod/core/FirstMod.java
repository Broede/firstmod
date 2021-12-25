package firstmod.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import firstmod.init.ModBlockEntities;
import firstmod.init.ModBlocks;
import firstmod.init.ModContainers;
import firstmod.init.ModEntities;
import firstmod.init.ModItems;
import firstmod.init.ModLootModifiers;
import firstmod.world.OreGeneration;
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

		MinecraftForge.EVENT_BUS.register(this);
	}

    @SubscribeEvent
	public void onCommonSetup(final FMLCommonSetupEvent event) {
    	OreGeneration.registerOres();
	}
    
    @SubscribeEvent
    public void onGatherData(GatherDataEvent event) {
    	;
    }
}
