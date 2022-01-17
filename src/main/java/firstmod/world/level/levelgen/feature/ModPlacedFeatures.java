package firstmod.world.level.levelgen.feature;

import firstmod.data.worldgen.features.ModConfiguredFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
	public static final PlacedFeature SHARINGA_TREE_PLACED_ULTRA_RARE =
			PlacementUtils.register("sharinga_tree_placed_ultra_rare",
					ModConfiguredFeatures.SHARINGA_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
							PlacementUtils.countExtra(0, 0.01f, 1))));

	public static final PlacedFeature SHARINGA_TREE_PLACED_RARE =
			PlacementUtils.register("sharinga_tree_placed_rare",
					ModConfiguredFeatures.SHARINGA_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
							PlacementUtils.countExtra(0, 0.05f, 1))));

	public static final PlacedFeature SHARINGA_TREE_PLACED_COMMON =
			PlacementUtils.register("sharinga_tree_placed_common",
					ModConfiguredFeatures.SHARINGA_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
							PlacementUtils.countExtra(1, 0.1f, 2))));

	public static final PlacedFeature SAKURA_TREE_PLACED_ULTRA_RARE =
			PlacementUtils.register("sakura_tree_placed_ultra_rare",
					ModConfiguredFeatures.SAKURA_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
							PlacementUtils.countExtra(0, 0.01f, 1))));
	
	public static final PlacedFeature SAKURA_TREE_PLACED_RARE =
			PlacementUtils.register("sakura_tree_placed_rare",
					ModConfiguredFeatures.SAKURA_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
							PlacementUtils.countExtra(0, 0.05f, 1))));

	public static final PlacedFeature SAKURA_TREE_PLACED_COMMON =
			PlacementUtils.register("sakura_tree_placed_common",
					ModConfiguredFeatures.SAKURA_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
							PlacementUtils.countExtra(1, 0.1f, 2))));

	public static final PlacedFeature MAPLE_TREE_PLACED_ULTRA_RARE =
			PlacementUtils.register("maple_tree_placed_ultra_rare",
					ModConfiguredFeatures.MAPLE_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
							PlacementUtils.countExtra(0, 0.01f, 1))));
	
	public static final PlacedFeature MAPLE_TREE_PLACED_RARE =
			PlacementUtils.register("maple_tree_placed_rare",
					ModConfiguredFeatures.MAPLE_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
							PlacementUtils.countExtra(0, 0.05f, 1))));

	public static final PlacedFeature MAPLE_TREE_PLACED_COMMON =
			PlacementUtils.register("maple_tree_placed_common",
					ModConfiguredFeatures.MAPLE_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
							PlacementUtils.countExtra(1, 0.1f, 2))));

	public static final PlacedFeature WILLOW_TREE_PLACED_ULTRA_RARE =
			PlacementUtils.register("willow_tree_placed_ultra_rare",
					ModConfiguredFeatures.WILLOW_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
							PlacementUtils.countExtra(0, 0.01f, 1))));
	
	public static final PlacedFeature WILLOW_TREE_PLACED_RARE =
			PlacementUtils.register("willow_tree_placed_rare",
					ModConfiguredFeatures.WILLOW_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
							PlacementUtils.countExtra(0, 0.05f, 1))));

	public static final PlacedFeature WILLOW_TREE_PLACED_UNCOMMON =
			PlacementUtils.register("willow_tree_placed_uncommon",
					ModConfiguredFeatures.WILLOW_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
							PlacementUtils.countExtra(0, 0.2f, 1))));

	public static final PlacedFeature WILLOW_TREE_PLACED_COMMON =
			PlacementUtils.register("willow_tree_placed_common",
					ModConfiguredFeatures.WILLOW_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
							PlacementUtils.countExtra(1, 0.1f, 2))));
}
