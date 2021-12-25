package firstmod.world;

import firstmod.core.FirstMod;
import firstmod.init.ModBlocks;

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
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
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
    private static final HashSet<PlacedFeature> NETHER_FEATURES = new HashSet<>();

    public static void registerOres() { // called in onCommonSetup(FMLCommonSetupEvent event)
    	int orePerVein = 6, veinsPerChunk = 8, maxY = 128, minY = 0;
    	
		BlockState netherrackSulfurOre = ModBlocks.NETHERRACK_SULFUR_ORE.get().defaultBlockState();

		List<TargetBlockState> targetBlockStates = List.of(OreConfiguration.target(OreFeatures.NETHERRACK, netherrackSulfurOre));

		ConfiguredFeature<?, ?> feature = FeatureUtils.register("block/netherrack_sulfor_ore", Feature.ORE.configured(
    			new OreConfiguration(targetBlockStates, orePerVein)));

		PlacedFeature placed = PlacementUtils.register("ore/netherrack_sulfur_ore", feature.placed(List.of(
				CountPlacement.of((int)(veinsPerChunk)), InSquarePlacement.spread(),
				HeightRangePlacement.triangle(VerticalAnchor.absolute(minY), VerticalAnchor.absolute(maxY)), BiomeFilter.biome())));
		
	    NETHER_FEATURES.add(placed);
    }

    @SubscribeEvent
    public static void gen(BiomeLoadingEvent event) {
		BiomeGenerationSettingsBuilder gen = event.getGeneration();

		if (event.getCategory() == BiomeCategory.NETHER) {
		    for (PlacedFeature feature : NETHER_FEATURES) {
		    	gen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, feature);
		    }
		}
    }
}
