package firstmod.init;

import firstmod.core.FirstMod;
import firstmod.items.CopperArrowItem;
import firstmod.items.FlintArrowItem;
import firstmod.items.IronArrowItem;
import firstmod.items.ModArmorMaterial;
import firstmod.items.ModTiers;
import firstmod.items.WoodenArrowItem;
import firstmod.ui.FirstModCreativeTab;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

	// New copper tools!
	public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel",
			() -> new ShovelItem(ModTiers.COPPER, 1.5F, -3.0F, (new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB))));
	public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
			() -> new PickaxeItem(ModTiers.COPPER, 1, -2.8F, (new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB))));
	public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe",
			() -> new AxeItem(ModTiers.COPPER, 6.0F, -3.1F, (new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB))));
	public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe",
			() -> new HoeItem(ModTiers.COPPER, -2, -1.0F, (new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB))));
	public static final RegistryObject<FishingRodItem> COPPER_FISHING_ROD = ITEMS.register("copper_fishing_rod",
			() -> new FishingRodItem((new Item.Properties()).durability(190).tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<ShearsItem> COPPER_SHEARS = ITEMS.register("copper_shears",
			() -> new ShearsItem((new Item.Properties()).durability(150).tab(FirstModCreativeTab.BROEDES_TAB)));
	
	// New copper weapons!
	public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword",
			() -> new SwordItem(ModTiers.COPPER, 3, -2.4F, new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<Item> WOODEN_ARROW = ITEMS.register("wooden_arrow",
			() -> new WoodenArrowItem(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB), 1.33F));
	public static final RegistryObject<Item> FLINT_ARROW = ITEMS.register("flint_arrow",
			() -> new FlintArrowItem(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB), 2.0F));
	public static final RegistryObject<Item> COPPER_ARROW = ITEMS.register("copper_arrow",
			() -> new CopperArrowItem(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB), 2.5F));
	public static final RegistryObject<Item> IRON_ARROW = ITEMS.register("iron_arrow",
			() -> new IronArrowItem(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB), 3.25F));
	
	// New copper armor!
	public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
			() -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.HEAD,
					new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
			() -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.CHEST,
					new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
			() -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.LEGS,
					new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
			() -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.FEET,
					new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	
	// Entity armor!
	public static final RegistryObject<Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor",
			() -> new HorseArmorItem(4, "copper", new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	
	// New food items!
	public static final RegistryObject<Item> ZOMBIE_JERKY = ITEMS.register("zombie_jerky",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)
					.food(new FoodProperties.Builder().nutrition(1).fast().meat().build())));
	
	// New mob drops!
	public static final RegistryObject<Item> HOOF = ITEMS.register("hoof",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	
	// New crafting materials!
	public static final RegistryObject<Item> LEATHER_SCRAPS = ITEMS.register("leather_scraps",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<Item> GLUE = ITEMS.register("glue",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<Item> FLINT_ARROWHEAD = ITEMS.register("flint_arrowhead",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<Item> COPPER_ARROWHEAD = ITEMS.register("copper_arrowhead",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<Item> IRON_ARROWHEAD = ITEMS.register("iron_arrowhead",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<Item> UNCUT_RUBY = ITEMS.register("uncut_ruby",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<Item> FEATHER_FLETCHING = ITEMS.register("feather_fletching",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	
	// Ring components!
	public static final RegistryObject<Item> COPPER_SHANK = ITEMS.register("copper_shank",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<Item> COPPER_SETTING = ITEMS.register("copper_setting",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	public static final RegistryObject<Item> RUBY_GEMSTONE = ITEMS.register("ruby_gemstone",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	
	
	// Diamond rings get special properties.
	public static final RegistryObject<Item> DIAMOND_RING = ITEMS.register("diamond_ring",
			() -> new Item(new Item.Properties().tab(FirstModCreativeTab.BROEDES_TAB)));
	
}
