package firstmod.data.worldgen.features;

import java.util.List;

import firstmod.init.ModBlocks;
import firstmod.world.level.levelgen.feature.foliageplacers.StraightFoliagePlacer;
import firstmod.world.level.levelgen.feature.trunkplacers.DoubleForkedTrunkPlacer;
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
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {

	public static final ConfiguredFeature<?, ?> WILLOW_TREE = register("willow", Feature.TREE.configured(new TreeConfiguration.TreeConfigurationBuilder(
			BlockStateProvider.simple(ModBlocks.WILLOW_LOG.get().defaultBlockState()),
			new DoubleForkedTrunkPlacer(6, 4, 2),
			BlockStateProvider.simple(ModBlocks.WILLOW_LEAVES.get().defaultBlockState()),
			new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
			new TwoLayersFeatureSize(2, 0, 1)).ignoreVines().build()));
	
	public static final ConfiguredFeature<RandomFeatureConfiguration, ?> WILLOW_TREE_CHECKED =
			FeatureUtils.register("willow_tree_feature",
					Feature.RANDOM_SELECTOR.configured(new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
							WILLOW_TREE.filteredByBlockSurvival(ModBlocks.WILLOW_SAPLING.get()), 0.2f)),
							WILLOW_TREE.filteredByBlockSurvival(ModBlocks.WILLOW_SAPLING.get()))));
	
	public static final ConfiguredFeature<?, ?> MAPLE_TREE = register("maple", Feature.TREE.configured(new TreeConfiguration.TreeConfigurationBuilder(
			BlockStateProvider.simple(ModBlocks.MAPLE_LOG.get().defaultBlockState()),
			new StraightTrunkPlacer(6, 3, 3),
			BlockStateProvider.simple(ModBlocks.MAPLE_LEAVES.get().defaultBlockState()),
			new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 5),
			new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build()));
	
	public static final ConfiguredFeature<RandomFeatureConfiguration, ?> MAPLE_TREE_CHECKED =
			FeatureUtils.register("maple_tree_feature",
					Feature.RANDOM_SELECTOR.configured(new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
							MAPLE_TREE.filteredByBlockSurvival(ModBlocks.MAPLE_SAPLING.get()), 0.1f)),
							MAPLE_TREE.filteredByBlockSurvival(ModBlocks.MAPLE_SAPLING.get()))));
	
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
    
    public static final ConfiguredFeature<?, ?> SAKURA_TREE = register("sakura", Feature.TREE.configured(new TreeConfiguration.TreeConfigurationBuilder(
    		BlockStateProvider.simple(ModBlocks.SAKURA_LOG.get().defaultBlockState()),
    		new ForkingTrunkPlacer(3, 3, 1),
    		BlockStateProvider.simple(ModBlocks.SAKURA_LEAVES.get().defaultBlockState()),
    		new AcaciaFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0)),
    		new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build()));
    
    public static final ConfiguredFeature<RandomFeatureConfiguration, ?> SAKURA_TREE_CHECKED =
    		FeatureUtils.register("sakura_tree_feature",
    				Feature.RANDOM_SELECTOR.configured(new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
    						SAKURA_TREE.filteredByBlockSurvival(ModBlocks.SAKURA_SAPLING.get()), 0.1f)),
    						SAKURA_TREE.filteredByBlockSurvival(ModBlocks.SAKURA_SAPLING.get()))));

	private static <FC extends FeatureConfiguration>ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
		return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, name, configuredFeature);
	}
}
