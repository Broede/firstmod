package firstmod.init;

import java.util.function.Supplier;

import firstmod.core.FirstMod;
import firstmod.tileentity.CopperHopperBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
	
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, FirstMod.MOD_ID);

	public static final RegistryObject<BlockEntityType<CopperHopperBlockEntity>> COPPER_HOPPER = register("copper_hopper", CopperHopperBlockEntity::new, () -> new Block[] {ModBlocks.COPPER_HOPPER.get()});
	
	private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String name, BlockEntityType.BlockEntitySupplier<T> supplier, Supplier<Block[]> validBlocksSupplier) {
		return BLOCK_ENTITIES.register(name, () -> BlockEntityType.Builder.of(supplier, validBlocksSupplier.get()).build(null));
	}
}
