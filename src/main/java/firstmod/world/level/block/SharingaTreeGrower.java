package firstmod.world.level.block;

import java.util.Random;

import firstmod.data.worldgen.features.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;

public class SharingaTreeGrower extends AbstractTreeGrower {

	@SuppressWarnings("unchecked")
	@Override
	protected ConfiguredFeature<TreeConfiguration, ?> getConfiguredFeature(Random p_60014_, boolean p_60015_) {
		// TODO Auto-generated method stub
		return (ConfiguredFeature<TreeConfiguration, ?>) ModConfiguredFeatures.SHARINGA;
	}

}
