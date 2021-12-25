package firstmod.init;

import java.util.function.Supplier;

import firstmod.blocks.CopperHopperBlock;
import firstmod.core.FirstMod;
import firstmod.ui.FirstModCreativeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StoneButtonBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);

	// Custom generated ores
	public static final RegistryObject<Block> NETHERRACK_SULFUR_ORE = registerBlock("netherrack_sulfur_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.EXPLOSIVE).strength(3F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> STONE_RUBY_ORE = registerBlock("stone_ruby_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6F).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6F).requiresCorrectToolForDrops()));
	
	// Functional blocks
	public static final RegistryObject<Block> COPPER_BUTTON = registerBlock("copper_button",
			() -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4F)));
	public static final RegistryObject<Block> COPPER_DOOR = registerBlock("copper_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4F).noOcclusion()));
	public static final RegistryObject<Block> COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate",
			() -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.of(Material.METAL).strength(4F)));
	public static final RegistryObject<Block> COPPER_TRAPDOOR = registerBlock("copper_trapdoor",
			() -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4F).noOcclusion()));

	// Blocks with inventories
	public static final RegistryObject<Block> COPPER_HOPPER = registerBlock("copper_hopper",
			() -> new CopperHopperBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4F).sound(SoundType.STONE)));
	
	// Decorative blocks
	public static final RegistryObject<Block> COPPER_BARS = registerBlock("copper_bars",
			() -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4F).sound(SoundType.METAL).noOcclusion()));
	public static final RegistryObject<Block> COPPER_CHAIN = registerBlock("copper_chain",
			() -> new ChainBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4F).sound(SoundType.METAL).noOcclusion()));
	
	// Light sources
	public static final RegistryObject<Block> COPPER_LANTERN = registerBlock("copper_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4F).sound(SoundType.LANTERN).noOcclusion().lightLevel(BlockState -> 15)));
	
	private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}
	
	private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
				new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	}
	
//	public static void register(IEventBus eventBus) {
//		BLOCKS.register(eventBus);
//	}
}
