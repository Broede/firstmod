package firstmod.data.worldgen.features;

import java.util.List;

import firstmod.init.ModBlocks;
import firstmod.world.level.levelgen.feature.foliageplacers.StraightFoliagePlacer;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {

	public static final ConfiguredFeature<?, ?> SHARINGA_TREE = register("sharinga", Feature.TREE.configured(new TreeConfiguration.TreeConfigurationBuilder(
			BlockStateProvider.simple(ModBlocks.SHARINGA_LOG.get().defaultBlockState()),
			new StraightTrunkPlacer(10, 4, 0),
			BlockStateProvider.simple(ModBlocks.SHARINGA_LEAVES.get().defaultBlockState()),
			new StraightFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 8),
			new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build()));

    public static final ConfiguredFeature<RandomFeatureConfiguration, ?> SHARINGA_TREE_CHECKED =
            FeatureUtils.register("sharinga_tree_feature",
                    Feature.RANDOM_SELECTOR.configured(new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                            SHARINGA_TREE.filteredByBlockSurvival(ModBlocks.SHARINGA_SAPLING.get()), 0.1f)),
                            SHARINGA_TREE.filteredByBlockSurvival(ModBlocks.SHARINGA_SAPLING.get()))));
	
	private static <FC extends FeatureConfiguration>ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
		return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, name, configuredFeature);
	}
}
