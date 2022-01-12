package firstmod.data.worldgen.features;

import firstmod.init.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {

	public static final ConfiguredFeature<?, ?> SHARINGA = register("sharinga", Feature.TREE.configured(new TreeConfiguration.TreeConfigurationBuilder(
			BlockStateProvider.simple(ModBlocks.SHARINGA_LOG.get().defaultBlockState()),
			new StraightTrunkPlacer(8, 4, 3),
			BlockStateProvider.simple(ModBlocks.SHARINGA_LEAVES.get().defaultBlockState()),
			new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
			new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build()));
	
	private static <FC extends FeatureConfiguration>ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
		return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, name, configuredFeature);
	}
}
