package firstmod.data.worldgen;

import firstmod.core.FirstMod;

import java.util.HashSet;
import java.util.List;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.biome.Biome.BiomeCategory;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration.TargetBlockState;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = FirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OreGeneration {
	private static final HashSet<PlacedFeature> OVERWORLD_FEATURES = new HashSet<>();
	private static final HashSet<PlacedFeature> NETHER_FEATURES = new HashSet<>();
	private static final HashSet<PlacedFeature> END_FEATURES = new HashSet<>();

    public static void registerOres() { // called in onCommonSetup(FMLCommonSetupEvent event)
    	{ // Overworld ores section
    		for ( OverworldOreTypes ore : OverworldOreTypes.values() ) {
    			BlockState stoneOreBlockState = ore.getBlock().get().defaultBlockState(), deepslateOreBlockState = ore.getDeepslateBlock().get().defaultBlockState();
    			List<TargetBlockState> targetBlockStates = List.of(
    					OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, stoneOreBlockState),
    					OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, deepslateOreBlockState));
    			ConfiguredFeature<?, ?> feature = FeatureUtils.register(ore.getLocalizedBlockName(), Feature.ORE.configured(
    					new OreConfiguration(targetBlockStates, ore.getMaxVeinSize())));
    			PlacedFeature placed = PlacementUtils.register(ore.getLocalizedOreName(), feature.placed(List.of(
    					CountPlacement.of((int)(ore.getRollsPerChunk())),
    					InSquarePlacement.spread(),
    					HeightRangePlacement.triangle(
    							VerticalAnchor.absolute(ore.getMinHeight()),
    							VerticalAnchor.absolute(ore.getMaxHeight()))
    					)));
    			OVERWORLD_FEATURES.add(placed);
    		}
    	}

    	{ // Nether ores section
    		for ( NetherOreTypes ore : NetherOreTypes.values() ) {
				BlockState oreBlockState = ore.getNetherrackBlock().get().defaultBlockState();
				List<TargetBlockState> targetBlockStates = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, oreBlockState));
    			
				ConfiguredFeature<?, ?> feature = FeatureUtils.register(ore.getLocalizedBlockName(), Feature.ORE.configured(
		    			new OreConfiguration(targetBlockStates, ore.getMaxVeinSize())));
				PlacedFeature placed = PlacementUtils.register(ore.getLocalizedOreName(), feature.placed(List.of(
						CountPlacement.of((int)(ore.getRollsPerChunk())), InSquarePlacement.spread(),
						HeightRangePlacement.triangle(
								VerticalAnchor.absolute(ore.getMinHeight()),
								VerticalAnchor.absolute(ore.getMaxHeight()))
						)));
			    NETHER_FEATURES.add(placed);
    		}
    	}
    	
    	{ // End ores section
    		for ( EndOreTypes ore : EndOreTypes.values() ) {
    			ConfiguredFeature<?, ?> feature = FeatureUtils.register(ore.getLocalizedBlockName(), Feature.ORE.configured(
    					new OreConfiguration(ore.getTargetList(), ore.getMaxVeinSize())));
    			PlacedFeature placed = PlacementUtils.register(ore.getLocalizedOreName(), feature.placed(List.of(
    					CountPlacement.of((int)(ore.getRollsPerChunk())), InSquarePlacement.spread(),
    					HeightRangePlacement.uniform(
    							VerticalAnchor.absolute(ore.getMinHeight()),
    							VerticalAnchor.absolute(ore.getMaxHeight()))
    					)));
    			END_FEATURES.add(placed);
    		}
    	}
    }

    @SubscribeEvent
    public static void generateOres(final BiomeLoadingEvent event) {
		BiomeGenerationSettingsBuilder gen = event.getGeneration();

		if ( event.getCategory() == BiomeCategory.THEEND ) {
		    for ( PlacedFeature feature : END_FEATURES ) {
		    	gen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, feature);
		    }
		} else if ( event.getCategory() == BiomeCategory.NETHER) {
		    for ( PlacedFeature feature : NETHER_FEATURES ) {
		    	gen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, feature);
		    }
		} else {
			for ( PlacedFeature feature : OVERWORLD_FEATURES ) {
				gen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, feature);
			}
		}
    }
}
