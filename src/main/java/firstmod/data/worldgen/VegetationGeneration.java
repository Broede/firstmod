package firstmod.data.worldgen;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import firstmod.core.FirstMod;
import firstmod.world.level.levelgen.feature.ModPlacedFeatures;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = FirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class VegetationGeneration {

	@SubscribeEvent
    public static void generateTrees(final BiomeLoadingEvent event) {
		List<Supplier<PlacedFeature>> base =
				event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
    	ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
    	Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

    	// Red maple tree.
    	if (types.contains(BiomeDictionary.Type.COLD) || types.contains(BiomeDictionary.Type.MOUNTAIN) ) {
    		base.add(() -> ModPlacedFeatures.MAPLE_TREE_PLACED_COMMON);
		} else if (types.contains(BiomeDictionary.Type.HILLS)
    			|| types.contains(BiomeDictionary.Type.WET)
    			|| types.contains(BiomeDictionary.Type.LUSH) ) {
    		base.add(() -> ModPlacedFeatures.MAPLE_TREE_PLACED_RARE);
    	} else if (types.contains(BiomeDictionary.Type.DRY)
    			|| types.contains(BiomeDictionary.Type.MUSHROOM) ) {
    		base.add(() -> ModPlacedFeatures.MAPLE_TREE_PLACED_ULTRA_RARE);
    	}
    	// Sharinga tree.
    	if (types.contains(BiomeDictionary.Type.SAVANNA) || types.contains(BiomeDictionary.Type.HOT) ) {
    		base.add(() -> ModPlacedFeatures.SHARINGA_TREE_PLACED_COMMON);
    	} else if (types.contains(BiomeDictionary.Type.JUNGLE)
    			|| types.contains(BiomeDictionary.Type.MESA)
    			|| types.contains(BiomeDictionary.Type.PLATEAU) ) {
    		base.add(() -> ModPlacedFeatures.SHARINGA_TREE_PLACED_RARE);
    	} else if (types.contains(BiomeDictionary.Type.PLAINS)
    			|| types.contains(BiomeDictionary.Type.DRY) ) {
    		base.add(() -> ModPlacedFeatures.SHARINGA_TREE_PLACED_ULTRA_RARE);
    	}
    	
    	// Sakura tree
    	if (types.contains(BiomeDictionary.Type.LUSH) || types.contains(BiomeDictionary.Type.HILLS) ) {
    		base.add(() -> ModPlacedFeatures.SAKURA_TREE_PLACED_COMMON);
    	} else if (types.contains(BiomeDictionary.Type.FOREST) || types.contains(BiomeDictionary.Type.PLAINS) ) {
    		base.add(() -> ModPlacedFeatures.SAKURA_TREE_PLACED_RARE);
    	} else if (types.contains(BiomeDictionary.Type.MOUNTAIN) ) {
    		base.add(() -> ModPlacedFeatures.SAKURA_TREE_PLACED_ULTRA_RARE);
    	}
    	
    	// Weeping willow tree
    	if (types.contains(BiomeDictionary.Type.WET) || types.contains(BiomeDictionary.Type.SWAMP) ) {
    		base.add(() -> ModPlacedFeatures.WILLOW_TREE_PLACED_COMMON);
    	} else if (types.contains(BiomeDictionary.Type.FOREST) || types.contains(BiomeDictionary.Type.OCEAN) ) {
    		base.add(() -> ModPlacedFeatures.WILLOW_TREE_PLACED_UNCOMMON);
    	} else if (types.contains(BiomeDictionary.Type.SPARSE) || types.contains(BiomeDictionary.Type.SPOOKY) ) {
    		base.add(() -> ModPlacedFeatures.WILLOW_TREE_PLACED_RARE);
    	} else if (types.contains(BiomeDictionary.Type.RIVER) || types.contains(BiomeDictionary.Type.WATER) ) {
    		base.add(() -> ModPlacedFeatures.WILLOW_TREE_PLACED_ULTRA_RARE);
    	}
    }
}
