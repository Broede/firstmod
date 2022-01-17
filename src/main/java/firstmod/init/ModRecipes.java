package firstmod.init;

import firstmod.core.FirstMod;
import firstmod.world.level.item.crafting.ToolkitRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
	public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, FirstMod.MOD_ID);

	public static final RegistryObject<RecipeSerializer<ToolkitRecipe>> TOOLKIT_RECIPE = RECIPE_SERIALIZERS.register("toolkit_crafting", () -> ToolkitRecipe.Serializer.INSTANCE);

	public static final RecipeType<ToolkitRecipe> TOOLKIT_CRAFTING = net.minecraft.world.item.crafting.RecipeType.register("toolkit_crafting");
	
    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
    }
}
