package firstmod.world;

import java.util.List;

import firstmod.init.ModBlocks;
import firstmod.util.ModTags;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModOreFeatures extends OreFeatures {
	   public static final RuleTest END_ORE_REPLACEABLES = new TagMatchTest(ModTags.END_ORE_REPLACEABLES);
	   public static final List<OreConfiguration.TargetBlockState> ORE_ENDERITE_TARGET_LIST = List.of(OreConfiguration.target(END_ORE_REPLACEABLES, ModBlocks.ENDERITE_ORE.get().defaultBlockState()));
}
