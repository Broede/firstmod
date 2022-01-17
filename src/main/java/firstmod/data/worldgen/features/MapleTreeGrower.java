package firstmod.data.worldgen.features;

import java.util.Random;

import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class MapleTreeGrower extends AbstractTreeGrower {

	@Override
	protected ConfiguredFeature<?, ?> getConfiguredFeature(Random p_60014_, boolean p_60015_) {
		return ModConfiguredFeatures.MAPLE_TREE;
	}

}
