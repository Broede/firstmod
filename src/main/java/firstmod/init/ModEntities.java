package firstmod.init;

import firstmod.core.FirstMod;
import firstmod.world.level.entity.projectile.CopperArrow;
import firstmod.world.level.entity.projectile.FlintArrow;
import firstmod.world.level.entity.projectile.IronArrow;
import firstmod.world.level.entity.projectile.ModFishingHook;
import firstmod.world.level.entity.projectile.TitaniumArrow;
import firstmod.world.level.entity.projectile.WoodenArrow;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, FirstMod.MOD_ID);
	
	public static final RegistryObject<EntityType<WoodenArrow>> WOODEN_ARROW = ENTITIES.register("wooden_arrow",
			() -> EntityType.Builder.<WoodenArrow>of(WoodenArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
					new ResourceLocation(FirstMod.MOD_ID, "wooden_arrow").toString()));

	public static final RegistryObject<EntityType<FlintArrow>> FLINT_ARROW = ENTITIES.register("flint_arrow",
			() -> EntityType.Builder.<FlintArrow>of(FlintArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
					new ResourceLocation(FirstMod.MOD_ID, "flint_arrow").toString()));
	
	public static final RegistryObject<EntityType<CopperArrow>> COPPER_ARROW = ENTITIES.register("copper_arrow",
			() -> EntityType.Builder.<CopperArrow>of(CopperArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
					new ResourceLocation(FirstMod.MOD_ID, "copper_arrow").toString()));
	
	public static final RegistryObject<EntityType<IronArrow>> IRON_ARROW = ENTITIES.register("iron_arrow",
			() -> EntityType.Builder.<IronArrow>of(IronArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
					new ResourceLocation(FirstMod.MOD_ID, "iron_arrow").toString()));
	
	public static final RegistryObject<EntityType<TitaniumArrow>> TITANIUM_ARROW = ENTITIES.register("titanium_arrow",
			() -> EntityType.Builder.<TitaniumArrow>of(TitaniumArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
					new ResourceLocation(FirstMod.MOD_ID, "titanium_arrow").toString()));
	
	public static final RegistryObject<EntityType<ModFishingHook>> MOD_FISHING_BOBBER = ENTITIES.register("fishing_hook",
			() -> EntityType.Builder.<ModFishingHook>of(ModFishingHook::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(5).build(
					new ResourceLocation("fishing_hook").toString()));
}
