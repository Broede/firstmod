package firstmod.init;

import firstmod.core.FirstMod;
import firstmod.world.inventory.BasicToolkitMenu;
import firstmod.world.inventory.CopperHopperMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModContainers {

	public static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, FirstMod.MOD_ID);
	
	public static final RegistryObject<MenuType<CopperHopperMenu>> COPPER_HOPPER = register("copper_hopper", CopperHopperMenu::new);
	public static final RegistryObject<MenuType<BasicToolkitMenu>> BASIC_TOOLKIT = register("basic_toolkit", BasicToolkitMenu::new);

	private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> register(String name, MenuType.MenuSupplier<T> factory) {
		return CONTAINERS.register(name, () -> new MenuType<>(factory));
	}
}
