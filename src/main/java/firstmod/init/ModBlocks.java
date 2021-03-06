package firstmod.init;

import java.util.function.Supplier;

import firstmod.core.FirstMod;
import firstmod.data.worldgen.features.MapleTreeGrower;
import firstmod.data.worldgen.features.SakuraTreeGrower;
import firstmod.data.worldgen.features.SharingaTreeGrower;
import firstmod.data.worldgen.features.WillowTreeGrower;
import firstmod.world.level.block.BurnableBlockItem;
import firstmod.world.level.block.CopperHopperBlock;
import firstmod.world.level.block.ModBlock;
import firstmod.world.level.block.ModLeavesBlock;
import firstmod.world.level.block.ModRotatedPillarBlock;
import firstmod.world.level.block.ModSaplingBlock;
import firstmod.world.level.block.ModWoodTypes;
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
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.StoneButtonBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.WoodButtonBlock;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
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
	// Maple tree
	public static final RegistryObject<Block> MAPLE_LEAVES = registerBlock("maple_leaves", () -> leaves(), CreativeModeTab.TAB_DECORATIONS, -1);
	public static final RegistryObject<Block> MAPLE_LOG = registerBlock("maple_log", () -> log(MaterialColor.COLOR_LIGHT_GRAY, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> MAPLE_PLANKS = registerBlock("maple_planks", () -> plank(), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> MAPLE_SAPLING = registerBlock("maple_sapling", () -> sapling(new MapleTreeGrower()), CreativeModeTab.TAB_DECORATIONS, FUEL_TIME_SAPLING);
	public static final RegistryObject<Block> MAPLE_WOOD = registerBlock("maple_wood", () -> log(MaterialColor.COLOR_LIGHT_GRAY, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", () -> log(MaterialColor.COLOR_BROWN, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", () -> log(MaterialColor.COLOR_BROWN, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	// Sakura tree -- also known as the cherry blossom; pure aesthetic
	public static final RegistryObject<Block> SAKURA_LEAVES = registerBlock("sakura_leaves", () -> leaves(), CreativeModeTab.TAB_DECORATIONS, -1);
	public static final RegistryObject<Block> SAKURA_LOG = registerBlock("sakura_log", () -> log(MaterialColor.COLOR_LIGHT_BLUE, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SAKURA_PLANKS = registerBlock("sakura_planks", () -> plank(), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SAKURA_SAPLING = registerBlock("sakura_sapling", () -> sapling(new SakuraTreeGrower()), CreativeModeTab.TAB_DECORATIONS, FUEL_TIME_SAPLING);
	public static final RegistryObject<Block> SAKURA_WOOD = registerBlock("sakura_wood", () -> log(MaterialColor.COLOR_LIGHT_BLUE, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> STRIPPED_SAKURA_LOG = registerBlock("stripped_sakura_log", () -> log(MaterialColor.COLOR_BROWN, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> STRIPPED_SAKURA_WOOD = registerBlock("stripped_sakura_wood", () -> log(MaterialColor.COLOR_BROWN, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	// Sharinga tree -- for obtaining rubber naturally
	public static final RegistryObject<Block> SHARINGA_LEAVES = registerBlock("sharinga_leaves", () -> leaves(), CreativeModeTab.TAB_DECORATIONS, -1);
	public static final RegistryObject<Block> SHARINGA_LOG = registerBlock("sharinga_log", () -> log(MaterialColor.COLOR_LIGHT_BLUE, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SHARINGA_PLANKS = registerBlock("sharinga_planks", () -> plank(), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SHARINGA_SAPLING = registerBlock("sharinga_sapling", () -> sapling(new SharingaTreeGrower()), CreativeModeTab.TAB_DECORATIONS, FUEL_TIME_SAPLING);
	public static final RegistryObject<Block> SHARINGA_WOOD = registerBlock("sharinga_wood", () -> log(MaterialColor.COLOR_LIGHT_BLUE, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> STRIPPED_SHARINGA_LOG = registerBlock("stripped_sharinga_log", () -> log(MaterialColor.COLOR_BROWN, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> STRIPPED_SHARINGA_WOOD = registerBlock("stripped_sharinga_wood", () -> log(MaterialColor.COLOR_BROWN, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	// Weeping willow tree
	public static final RegistryObject<Block> WILLOW_LEAVES = registerBlock("willow_leaves", () -> leaves(), CreativeModeTab.TAB_DECORATIONS, 1);
	public static final RegistryObject<Block> WILLOW_LOG = registerBlock("willow_log", () -> log(MaterialColor.COLOR_LIGHT_GRAY, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow_planks", () -> plank(), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> WILLOW_SAPLING = registerBlock("willow_sapling", () -> sapling(new WillowTreeGrower()), CreativeModeTab.TAB_DECORATIONS, FUEL_TIME_SAPLING);
	public static final RegistryObject<Block> WILLOW_WOOD = registerBlock("willow_wood", () -> log(MaterialColor.COLOR_LIGHT_BLUE, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log", () -> log(MaterialColor.COLOR_BROWN, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood", () -> log(MaterialColor.COLOR_BROWN, MaterialColor.WOOD), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);

	/*** New wood blocks ***/
	// Red maple tree blocks
	public static final RegistryObject<Block> MAPLE_BUTTON = registerBlock("maple_button", () -> wood_button(), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> MAPLE_DOOR = registerBlock("maple_door", () -> wood_door(ModBlocks.MAPLE_PLANKS.get()), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> MAPLE_FENCE = registerBlock("maple_fence", () -> fence(ModBlocks.MAPLE_PLANKS.get()), CreativeModeTab.TAB_DECORATIONS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> MAPLE_FENCE_GATE = registerBlock("maple_fence_gate", () -> fence_gate(ModBlocks.MAPLE_PLANKS.get()), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate", () -> wood_pressure_plate(ModBlocks.MAPLE_PLANKS.get()), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> MAPLE_SLAB = registerBlock("maple_slab", () -> slab(ModBlocks.MAPLE_PLANKS.get()), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> MAPLE_STAIRS = registerBlock("maple_stairs", () -> stair(ModBlocks.MAPLE_PLANKS.get()), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> MAPLE_TRAPDOOR = registerBlock("maple_trapdoor", () -> wood_trapdoor(), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	// Sakura tree (i.e. cherry blossom)
	public static final RegistryObject<Block> SAKURA_BUTTON = registerBlock("sakura_button", () -> wood_button(), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SAKURA_DOOR = registerBlock("sakura_door", () -> wood_door(ModBlocks.SAKURA_PLANKS.get()), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SAKURA_FENCE = registerBlock("sakura_fence", () -> fence(ModBlocks.SAKURA_PLANKS.get()), CreativeModeTab.TAB_DECORATIONS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SAKURA_FENCE_GATE = registerBlock("sakura_fence_gate", () -> fence_gate(ModBlocks.SAKURA_PLANKS.get()), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SAKURA_PRESSURE_PLATE = registerBlock("sakura_pressure_plate", () -> wood_pressure_plate(ModBlocks.SAKURA_PLANKS.get()), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SAKURA_SLAB = registerBlock("sakura_slab", () -> slab(ModBlocks.SAKURA_PLANKS.get()), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SAKURA_STAIRS = registerBlock("sakura_stairs", () -> stair(ModBlocks.SAKURA_PLANKS.get()), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SAKURA_TRAPDOOR = registerBlock("sakura_trapdoor", () -> wood_trapdoor(), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	// Sharinga tree (i.e. rubber tree)
	public static final RegistryObject<Block> SHARINGA_BUTTON = registerBlock("sharinga_button", () -> wood_button(), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SHARINGA_DOOR = registerBlock("sharinga_door", () -> wood_door(ModBlocks.SHARINGA_PLANKS.get()), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SHARINGA_FENCE = registerBlock("sharinga_fence", () -> fence(ModBlocks.SHARINGA_PLANKS.get()), CreativeModeTab.TAB_DECORATIONS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SHARINGA_FENCE_GATE = registerBlock("sharinga_fence_gate", () -> fence_gate(ModBlocks.SHARINGA_PLANKS.get()), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SHARINGA_PRESSURE_PLATE = registerBlock("sharinga_pressure_plate", () -> wood_pressure_plate(ModBlocks.SHARINGA_PLANKS.get()), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SHARINGA_SLAB = registerBlock("sharinga_slab", () -> slab(ModBlocks.SHARINGA_PLANKS.get()), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SHARINGA_STAIRS = registerBlock("sharinga_stairs", () -> stair(ModBlocks.SHARINGA_PLANKS.get()), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> SHARINGA_TRAPDOOR = registerBlock("sharinga_trapdoor", () -> wood_trapdoor(), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	// Weeping willow wood blocks
	public static final RegistryObject<Block> WILLOW_BUTTON = registerBlock("willow_button", () -> wood_button(), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> WILLOW_DOOR = registerBlock("willow_door", () -> wood_door(ModBlocks.WILLOW_PLANKS.get()), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> WILLOW_FENCE = registerBlock("willow_fence", () -> fence(ModBlocks.WILLOW_PLANKS.get()), CreativeModeTab.TAB_DECORATIONS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> WILLOW_FENCE_GATE = registerBlock("willow_fence_gate", () -> fence_gate(ModBlocks.WILLOW_PLANKS.get()), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate", () -> wood_pressure_plate(ModBlocks.WILLOW_PLANKS.get()), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> WILLOW_SLAB = registerBlock("willow_slab", () -> slab(ModBlocks.WILLOW_PLANKS.get()), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> WILLOW_STAIRS = registerBlock("willow_stairs", () -> stair(ModBlocks.WILLOW_PLANKS.get()), CreativeModeTab.TAB_BUILDING_BLOCKS, FUEL_TIME_WOOD);
	public static final RegistryObject<Block> WILLOW_TRAPDOOR = registerBlock("willow_trapdoor", () -> wood_trapdoor(), CreativeModeTab.TAB_REDSTONE, FUEL_TIME_WOOD);
	
	private static SaplingBlock sapling(AbstractTreeGrower grower) {
		return new ModSaplingBlock(grower, BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS), BURN_TIME_PLANKS, SPREAD_TIME_PLANKS);
	}

	@SuppressWarnings("deprecation")
	private static WallSignBlock wood_wall_sign(Block signBlock, WoodType woodType) {
		return new WallSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(signBlock), woodType);
	}
	
	private static StandingSignBlock wood_sign(WoodType woodType) {
		return new StandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), woodType);
	}
	
	private static TrapDoorBlock wood_trapdoor() {
		return new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(ModBlocks::never));
	}
	
	private static PressurePlateBlock wood_pressure_plate(Block block) {
		return new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, block.defaultMaterialColor()).noCollission().strength(0.5F).sound(SoundType.WOOD));
	}
	
	private static DoorBlock wood_door(Block block) {
		return new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, block.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion());
	}
	
	private static WoodButtonBlock wood_button() {
		return new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD));
	}
	
	@SuppressWarnings("deprecation")
	private static StairBlock stair(Block block) {
		return new StairBlock(block.defaultBlockState(), BlockBehaviour.Properties.copy(block));
	}

	private static SlabBlock slab(Block block) {
		return new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD));
	}
	
	private static FenceBlock fence(Block block) {
		return new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, block.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD));
	}
	
	private static FenceGateBlock fence_gate(Block block) {
		return new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, block.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD));
	}
	
	private static Block plank() {
		return new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD), BURN_TIME_PLANKS, SPREAD_TIME_PLANKS);
	}
	
	private static RotatedPillarBlock log(MaterialColor color1, MaterialColor color2) {
		return new ModRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, (p_152624_) -> {
			return p_152624_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? color1 : color2;
		}).strength(2.0F).sound(SoundType.WOOD), BURN_TIME_LOGS, SPREAD_TIME_LOGS);
	}

	private static LeavesBlock leaves() {
		return new ModLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(ModBlocks::ocelotOrParrot).isSuffocating(ModBlocks::never).isViewBlocking(ModBlocks::never), BURN_TIME_LEAVES, SPREAD_TIME_LEAVES);
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
	
	private static boolean never(BlockState p_50806_, BlockGetter p_50807_, BlockPos p_50808_, EntityType<?> p_50825_) {
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
