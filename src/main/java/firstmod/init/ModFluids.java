package firstmod.init;

import firstmod.core.FirstMod;
import firstmod.world.block.CrudeOilBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {

	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, FirstMod.MOD_ID);
	
	public static final ResourceLocation CRUDE_OIL_STILL_RL = new ResourceLocation(FirstMod.MOD_ID, "block/fluid/crude_oil_still");
	public static final ResourceLocation CRUDE_OIL_FLOWING_RL = new ResourceLocation(FirstMod.MOD_ID, "block/fluid/crude_oil_flow");
	public static final ResourceLocation CRUDE_OIL_OVERLAY_RL = new ResourceLocation(FirstMod.MOD_ID, "block/fluid/crude_oil_overlay");
	
	public static final RegistryObject<FlowingFluid> CRUDE_OIL_SOURCE = FLUIDS.register("crude_oil_fluid",
			() -> new ForgeFlowingFluid.Source(ModFluids.CRUDE_OIL_PROPERTIES));
	public static final RegistryObject<FlowingFluid> CRUDE_OIL_FLOWING = FLUIDS.register("crude_oil_flowing",
			() -> new ForgeFlowingFluid.Flowing(ModFluids.CRUDE_OIL_PROPERTIES));
	
	public static final ForgeFlowingFluid.Properties CRUDE_OIL_PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> CRUDE_OIL_SOURCE.get(), () -> CRUDE_OIL_FLOWING.get(), FluidAttributes.builder(CRUDE_OIL_STILL_RL, CRUDE_OIL_FLOWING_RL)
			.density(2000)
			.luminosity(0)
			.viscosity(2000)
			.sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY)
			.overlay(CRUDE_OIL_OVERLAY_RL)
			.color(0x00000000))
			.slopeFindDistance(3)
			.levelDecreasePerBlock(2)
			.block(() -> ModFluids.CRUDE_OIL_BLOCK.get())
			.bucket(() -> ModItems.CRUDE_OIL_BUCKET.get());
	
	public static final RegistryObject<LiquidBlock> CRUDE_OIL_BLOCK = ModBlocks.BLOCKS.register("crude_oil",
			() -> new CrudeOilBlock());
}
