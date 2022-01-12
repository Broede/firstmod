package firstmod.world.level.levelgen.feature;

import firstmod.data.worldgen.features.ModConfiguredFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
	public static final PlacedFeature SHARINGA_TREE_PLACED =
			PlacementUtils.register("sharinga_tree_placed",
					ModConfiguredFeatures.SHARINGA_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
							PlacementUtils.countExtra(1, 0.1f, 2))));
}
