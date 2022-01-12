package firstmod.data.worldgen.features;

import java.util.Random;

import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class SharingaTreeGrower extends AbstractTreeGrower {

	@Override
	protected ConfiguredFeature<?, ?> getConfiguredFeature(Random p_60014_, boolean p_60015_) {
		// TODO Auto-generated method stub
		return ModConfiguredFeatures.SHARINGA_TREE;
	}

}
