package firstmod.init;

import java.util.function.Supplier;

import firstmod.core.FirstMod;
import firstmod.world.level.block.BurnableBlockItem;
import firstmod.world.level.block.CopperHopperBlock;
import firstmod.world.level.block.ModBlock;
import firstmod.world.level.block.ModLeavesBlock;
import firstmod.world.level.block.ModRotatedPillarBlock;
import firstmod.world.level.block.ModSaplingBlock;
import firstmod.world.level.block.SharingaTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StoneButtonBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.grower.OakTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
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
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4.5F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(8F, 6F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> STONE_ALUMINUM_ORE = registerBlock("stone_aluminum_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> STONE_LEAD_ORE = registerBlock("stone_lead_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> STONE_NICKEL_ORE = registerBlock("stone_nickel_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> STONE_PLATINUM_ORE = registerBlock("stone_platinum_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> STONE_RUBY_ORE = registerBlock("stone_ruby_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> STONE_SILVER_ORE = registerBlock("stone_silver_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> STONE_TIN_ORE = registerBlock("stone_tin_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> STONE_TITANIUM_ORE = registerBlock("stone_titanium_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6F, 6F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	// NETHER //
	public static final RegistryObject<Block> NETHERRACK_BORITE_ORE = registerBlock("netherrack_borite_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6F, 6F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> NETHERRACK_COBALT_ORE = registerBlock("netherrack_cobalt_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6F, 6F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> NETHERRACK_RADIUM_ORE = registerBlock("netherrack_radium_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6F, 6F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> NETHERRACK_SULFUR_ORE = registerBlock("netherrack_sulfur_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.EXPLOSIVE).strength(3F, 3F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	// THE END //
	public static final RegistryObject<Block> ENDERITE_ORE = registerBlock("enderite_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6F, 5F).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	/*** END OF ORES ***/
	
	// Functional blocks
	public static final RegistryObject<Block> COPPER_BUTTON = registerBlock("copper_button",
			() -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(1F)), CreativeModeTab.TAB_REDSTONE, -1);
	public static final RegistryObject<Block> COPPER_DOOR = registerBlock("copper_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(3F).noOcclusion()), CreativeModeTab.TAB_REDSTONE, -1);
	public static final RegistryObject<Block> COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate",
			() -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.of(Material.METAL).strength(1F)), CreativeModeTab.TAB_REDSTONE, -1);
	public static final RegistryObject<Block> COPPER_TRAPDOOR = registerBlock("copper_trapdoor",
			() -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(3F).noOcclusion()), CreativeModeTab.TAB_REDSTONE, -1);

	// Blocks with inventories
	public static final RegistryObject<Block> COPPER_HOPPER = registerBlock("copper_hopper",
			() -> new CopperHopperBlock(BlockBehaviour.Properties.of(Material.METAL).strength(2F, 4F).sound(SoundType.STONE)), CreativeModeTab.TAB_REDSTONE, -1);
	
	// Decorative blocks
	public static final RegistryObject<Block> COPPER_BARS = registerBlock("copper_bars",
			() -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4F).sound(SoundType.METAL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS, -1);
	public static final RegistryObject<Block> COPPER_CHAIN = registerBlock("copper_chain",
			() -> new ChainBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4F).sound(SoundType.METAL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS, -1);
	public static final RegistryObject<Block> CHARCOAL_BLOCK = registerBlock("charcoal_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, 16000);
	
	// Raw ore blocks
	public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5F, 10F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	
	// Ore blocks
	public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("nickel_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3F, 6F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3F, 10F)),
					CreativeModeTab.TAB_BUILDING_BLOCKS, -1);
	
	// Light sources
	public static final RegistryObject<Block> COPPER_LANTERN = registerBlock("copper_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).strength(1F, 1.5F).sound(SoundType.LANTERN).noOcclusion().lightLevel(BlockState -> 15)), CreativeModeTab.TAB_DECORATIONS, -1);

	/** Static times for fuel categories **/
	public static final int FUEL_TIME_WOOD = 300;
	public static final int FUEL_TIME_SAPLING = 100;

	/** Static times for flammable blocks **/
	public static final int BURN_TIME_LOGS = 5;
	public static final int BURN_TIME_LEAVES = 60;
	public static final int BURN_TIME_PLANKS = 20;
	public static final int SPREAD_TIME_LOGS = 5;
	public static final int SPREAD_TIME_LEAVES = 30;
	public static final int SPREAD_TIME_PLANKS = 5;
	
	/*** New tree blocks ***/
	// Sharinga tree -- for obtaining rubber naturally
	public static final RegistryObject<Block> SHARINGA_LOG = registerBlock("sharinga_log", () -> log(MaterialColor.COLOR_LIGHT_BLUE, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> STRIPPED_SHARINGA_LOG = registerBlock("stripped_sharinga_log", () -> log(MaterialColor.COLOR_BROWN, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SHARINGA_LEAVES = registerBlock("sharinga_leaves", () -> leaves(SoundType.GRASS), CreativeModeTab.TAB_DECORATIONS, -1);
	public static final RegistryObject<Block> SHARINGA_SAPLING = registerBlock("sharinga_sapling", () -> sapling(new SharingaTreeGrower()), CreativeModeTab.TAB_DECORATIONS, FUEL_TIME_SAPLING);
	public static final RegistryObject<Block> SHARINGA_WOOD = registerBlock("sharinga_wood", () -> log(MaterialColor.COLOR_LIGHT_BLUE, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> STRIPPED_SHARINGA_WOOD = registerBlock("stripped_sharinga_wood", () -> log(MaterialColor.COLOR_BROWN, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SHARINGA_PLANKS = registerBlock("sharinga_planks", () -> plank(), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	
	private static SaplingBlock sapling(AbstractTreeGrower grower) {
		return new ModSaplingBlock(grower, BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS), BURN_TIME_PLANKS, SPREAD_TIME_PLANKS);
	}

	private static Block plank() {
		return new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD), BURN_TIME_PLANKS, SPREAD_TIME_PLANKS);
	}
	
	private static RotatedPillarBlock log(MaterialColor color1, MaterialColor color2) {
		return new ModRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (p_152624_) -> {
			return p_152624_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? color1 : color2;
		}).strength(2.0F).sound(SoundType.WOOD), BURN_TIME_LOGS, SPREAD_TIME_LOGS);
	}

	private static LeavesBlock leaves(SoundType p_152615_) {
		return new ModLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(p_152615_).noOcclusion().isValidSpawn(ModBlocks::ocelotOrParrot).isSuffocating(ModBlocks::never).isViewBlocking(ModBlocks::never), BURN_TIME_LEAVES, SPREAD_TIME_LEAVES);
	}

	private static Boolean ocelotOrParrot(BlockState p_50822_, BlockGetter p_50823_, BlockPos p_50824_, EntityType<?> p_50825_) {
		return p_50825_ == EntityType.OCELOT || p_50825_ == EntityType.PARROT;
	}

//	private static boolean always(BlockState p_50775_, BlockGetter p_50776_, BlockPos p_50777_) {
//		return true;
//	}

	private static boolean never(BlockState p_50806_, BlockGetter p_50807_, BlockPos p_50808_) {
		return false;
	}

	/*** Finally, registration methods for the blocks and their corresponding items. ***/
	private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, int fueltime) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn, tab, fueltime);
		return toReturn;
	}
	
	private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, int fueltime) {
		if ( fueltime > 0 )
			ModItems.ITEMS.register(name, () -> new BurnableBlockItem(block.get(), new Item.Properties().tab(tab), fueltime));
		else
			ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
