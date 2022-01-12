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
    	ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
    	Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

    	if(types.contains(BiomeDictionary.Type.PLAINS)
    	|| types.contains(BiomeDictionary.Type.DRY)
    	|| types.contains(BiomeDictionary.Type.HOT)
    	|| types.contains(BiomeDictionary.Type.JUNGLE)
    	|| types.contains(BiomeDictionary.Type.MESA)
    	|| types.contains(BiomeDictionary.Type.PLATEAU)
    	|| types.contains(BiomeDictionary.Type.SAVANNA)
    	|| types.contains(BiomeDictionary.Type.SWAMP) 
    			) {
    		List<Supplier<PlacedFeature>> base =
    				event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

    		base.add(() -> ModPlacedFeatures.SHARINGA_TREE_PLACED);
    	}
    }
}
