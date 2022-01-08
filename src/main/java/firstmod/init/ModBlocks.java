package firstmod.init;

import java.util.function.Supplier;

import firstmod.core.FirstMod;
import firstmod.world.block.BurnableBlockItem;
import firstmod.world.block.CopperHopperBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
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
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);

	/*** CUSTOM GENERATED ORES ***/
	// OVERWORLD //
	public static final RegistryObject<Block> DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4.5F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(8F, 6F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> STONE_ALUMINUM_ORE = registerBlock("stone_aluminum_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> STONE_LEAD_ORE = registerBlock("stone_lead_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> STONE_NICKEL_ORE = registerBlock("stone_nickel_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> STONE_PLATINUM_ORE = registerBlock("stone_platinum_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> STONE_RUBY_ORE = registerBlock("stone_ruby_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> STONE_SILVER_ORE = registerBlock("stone_silver_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> STONE_TIN_ORE = registerBlock("stone_tin_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> STONE_TITANIUM_ORE = registerBlock("stone_titanium_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6F, 6F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	// NETHER //
	public static final RegistryObject<Block> NETHERRACK_BORITE_ORE = registerBlock("netherrack_borite_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6F, 6F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> NETHERRACK_COBALT_ORE = registerBlock("netherrack_cobalt_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6F, 6F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> NETHERRACK_RADIUM_ORE = registerBlock("netherrack_radium_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6F, 6F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> NETHERRACK_SULFUR_ORE = registerBlock("netherrack_sulfur_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.EXPLOSIVE).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	// THE END //
	public static final RegistryObject<Block> ENDERITE_ORE = registerBlock("enderite_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6F, 5F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
	/*** END OF ORES ***/
	
	// Functional blocks
	public static final RegistryObject<Block> COPPER_BUTTON = registerBlock("copper_button",
			() -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(1F)), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Block> COPPER_DOOR = registerBlock("copper_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(3F).noOcclusion()), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Block> COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate",
			() -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.of(Material.METAL).strength(1F)), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Block> COPPER_TRAPDOOR = registerBlock("copper_trapdoor",
			() -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(3F).noOcclusion()), CreativeModeTab.TAB_REDSTONE);

	// Blocks with inventories
	public static final RegistryObject<Block> COPPER_HOPPER = registerBlock("copper_hopper",
			() -> new CopperHopperBlock(BlockBehaviour.Properties.of(Material.METAL).strength(2F, 4F).sound(SoundType.STONE)), CreativeModeTab.TAB_REDSTONE);
	
	// Decorative blocks
	public static final RegistryObject<Block> COPPER_BARS = registerBlock("copper_bars",
			() -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4F).sound(SoundType.METAL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> COPPER_CHAIN = registerBlock("copper_chain",
			() -> new ChainBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4F).sound(SoundType.METAL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> CHARCOAL_BLOCK = registerBlock("charcoal_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	
	// Raw ore blocks
	public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5F, 10F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	
	// Ore blocks
	public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("nickel_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3F, 10F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS);
	
	// Light sources
	public static final RegistryObject<Block> COPPER_LANTERN = registerBlock("copper_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).strength(1F, 1.5F).sound(SoundType.LANTERN).noOcclusion().lightLevel(BlockState -> 15)), CreativeModeTab.TAB_DECORATIONS);
	
	private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn, tab);
		return toReturn;
	}
	
	private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
		if ( name == "charcoal_block" )
			ModItems.ITEMS.register(name, () -> new BurnableBlockItem(block.get(),
				new Item.Properties().tab(tab)));
		else
			ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
				new Item.Properties().tab(tab)));
	}
	
//	public static void register(IEventBus eventBus) {
//		BLOCKS.register(eventBus);
//	}
}
