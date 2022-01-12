package firstmod.init;

import firstmod.core.FirstMod;
import firstmod.world.level.item.BucklerItem;
import firstmod.world.level.item.CopperArrowItem;
import firstmod.world.level.item.FlintArrowItem;
import firstmod.world.level.item.IronArrowItem;
import firstmod.world.level.item.ModArmorMaterial;
import firstmod.world.level.item.ModFishingRodItem;
import firstmod.world.level.item.ModTiers;
import firstmod.world.level.item.TitaniumArrowItem;
import firstmod.world.level.item.ToughOreItem;
import firstmod.world.level.item.WoodenArrowItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

	// List of NEW ORES!
	public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> RAW_BORITE = ITEMS.register("raw_borite",
			() -> new ToughOreItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
			() -> new ToughOreItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> RAW_ENDERITE = ITEMS.register("raw_enderite",
			() -> new ToughOreItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> RAW_RADIUM = ITEMS.register("raw_radium",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
			() -> new ToughOreItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	
	// All the new INGOTS here!
	public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	
	// New copper tools!
	public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe",
			() -> new AxeItem(ModTiers.COPPER, 6.0F, -3.1F, (new Item.Properties().tab(CreativeModeTab.TAB_TOOLS))));
	public static final RegistryObject<ModFishingRodItem> COPPER_FISHING_ROD = ITEMS.register("copper_fishing_rod",
			() -> new ModFishingRodItem((new Item.Properties()).durability(190).tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe",
			() -> new HoeItem(ModTiers.COPPER, -2, -1.0F, (new Item.Properties().tab(CreativeModeTab.TAB_TOOLS))));
	public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
			() -> new PickaxeItem(ModTiers.COPPER, 1, -2.8F, (new Item.Properties().tab(CreativeModeTab.TAB_TOOLS))));
	public static final RegistryObject<ShearsItem> COPPER_SHEARS = ITEMS.register("copper_shears",
			() -> new ShearsItem((new Item.Properties()).durability(150).tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel",
			() -> new ShovelItem(ModTiers.COPPER, 1.5F, -3.0F, (new Item.Properties().tab(CreativeModeTab.TAB_TOOLS))));
	public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword",
			() -> new SwordItem(ModTiers.COPPER, 3, -2.4F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	// New TITANIUM tools!
	public static final RegistryObject<AxeItem> TITANIUM_AXE = ITEMS.register("titanium_axe",
			() -> new AxeItem(ModTiers.TITANIUM, 6.0F, -3.1F, (new Item.Properties().tab(CreativeModeTab.TAB_TOOLS))));
	public static final RegistryObject<ModFishingRodItem> TITANIUM_FISHING_ROD = ITEMS.register("titanium_fishing_rod",
			() -> new ModFishingRodItem((new Item.Properties()).durability(2000).tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<HoeItem> TITANIUM_HOE = ITEMS.register("titanium_hoe",
			() -> new HoeItem(ModTiers.TITANIUM, -2, -1.0F, (new Item.Properties().tab(CreativeModeTab.TAB_TOOLS))));
	public static final RegistryObject<PickaxeItem> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
			() -> new PickaxeItem(ModTiers.TITANIUM, 1, -2.8F, (new Item.Properties().tab(CreativeModeTab.TAB_TOOLS))));
	public static final RegistryObject<ShearsItem> TITANIUM_SHEARS = ITEMS.register("titanium_shears",
			() -> new ShearsItem((new Item.Properties()).durability(2000).tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<ShovelItem> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
			() -> new ShovelItem(ModTiers.TITANIUM, 1.5F, -3.0F, (new Item.Properties().tab(CreativeModeTab.TAB_TOOLS))));
	public static final RegistryObject<SwordItem> TITANIUM_SWORD = ITEMS.register("titanium_sword",
			() -> new SwordItem(ModTiers.TITANIUM, 3, -2.4F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	// New arrow types!
	public static final RegistryObject<Item> COPPER_ARROW = ITEMS.register("copper_arrow",
			() -> new CopperArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT), 2.5F));
	public static final RegistryObject<Item> FLINT_ARROW = ITEMS.register("flint_arrow",
			() -> new FlintArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT), 2.0F));
	public static final RegistryObject<Item> IRON_ARROW = ITEMS.register("iron_arrow",
			() -> new IronArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT), 3.25F));
	public static final RegistryObject<Item> TITANIUM_ARROW = ITEMS.register("titanium_arrow",
			() -> new TitaniumArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT), 5.0F));
	public static final RegistryObject<Item> WOODEN_ARROW = ITEMS.register("wooden_arrow",
			() -> new WoodenArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT), 1.33F));
	
	// New copper armor!
	public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
			() -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.FEET,
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
			() -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.CHEST,
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
			() -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.HEAD,
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
			() -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.LEGS,
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	// New TITANIUM armor!
	public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
			() -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.FEET,
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
			() -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.CHEST,
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
			() -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.HEAD,
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
			() -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.LEGS,
					new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

	// New shield types!
	public static final RegistryObject<Item> BUCKLER = ITEMS.register("buckler",
			() -> new BucklerItem(new Item.Properties().durability(224).tab(CreativeModeTab.TAB_COMBAT)));

	// Entity armor!
	public static final RegistryObject<Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor",
			() -> new HorseArmorItem(4, "copper", new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	
	// New food items!
	public static final RegistryObject<Item> ZOMBIE_JERKY = ITEMS.register("zombie_jerky",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
					.food(new FoodProperties.Builder().nutrition(1).fast().meat().build())));
	
	// New mob drops!
	public static final RegistryObject<Item> HOOF = ITEMS.register("hoof",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	
	// New crafting materials!
	public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> COPPER_ARROWHEAD = ITEMS.register("copper_arrowhead",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> FEATHER_FLETCHING = ITEMS.register("feather_fletching",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> FLINT_ARROWHEAD = ITEMS.register("flint_arrowhead",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> GLUE = ITEMS.register("glue",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> IRON_ARROWHEAD = ITEMS.register("iron_arrowhead",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> LEATHER_SCRAPS = ITEMS.register("leather_scraps",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> RAW_LATEX = ITEMS.register("raw_latex",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> TITANIUM_ARROWHEAD = ITEMS.register("titanium_arrowhead",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> UNCUT_RUBY = ITEMS.register("uncut_ruby",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	
	// Ring components!
	public static final RegistryObject<Item> COPPER_SETTING = ITEMS.register("copper_setting",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> COPPER_SHANK = ITEMS.register("copper_shank",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> RUBY_GEMSTONE = ITEMS.register("ruby_gemstone",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	
	
	// Diamond rings get special properties.
	public static final RegistryObject<Item> DIAMOND_RING = ITEMS.register("diamond_ring",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
}
