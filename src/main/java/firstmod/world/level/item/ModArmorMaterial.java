package firstmod.world.level.item;

import java.util.function.Supplier;

import firstmod.init.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

@SuppressWarnings("deprecation")
public enum ModArmorMaterial implements ArmorMaterial {

	COPPER("copper", 8, new int[] {2, 3, 4, 2}, 8, SoundEvents.ARMOR_EQUIP_GENERIC, 0F, 0F, () -> {
		return Ingredient.of(Items.COPPER_INGOT);
	}),
	TITANIUM("titanium", 40, new int[] {3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_IRON, 4F, 0F, () -> {
		return Ingredient.of(ModItems.TITANIUM_INGOT.get());
	});

/*	
	   LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
		      return Ingredient.of(Items.LEATHER);
		   }),
		   CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
		      return Ingredient.of(Items.IRON_INGOT);
		   }),
		   IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
		      return Ingredient.of(Items.IRON_INGOT);
		   }),
		   GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
		      return Ingredient.of(Items.GOLD_INGOT);
		   }),
		   DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
		      return Ingredient.of(Items.DIAMOND);
		   }),
		   TURTLE("turtle", 25, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
		      return Ingredient.of(Items.SCUTE);
		   }),
		   NETHERITE("netherite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
		      return Ingredient.of(Items.NETHERITE_INGOT);
		   });
*/	
   private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
   private final String name;
   private final int durabilityMultiplier;
   private final int[] slotProtections;
   private final int enchantmentValue;
   private final SoundEvent sound;
   private final float toughness;
   private final float knockbackResistance;
   private final LazyLoadedValue<Ingredient> repairIngredient;

   private ModArmorMaterial(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> ingredient) {
	      this.name = name;
	      this.durabilityMultiplier = durabilityMultiplier;
	      this.slotProtections = slotProtections;
	      this.enchantmentValue = enchantmentValue;
	      this.sound = sound;
	      this.toughness = toughness;
	      this.knockbackResistance = knockbackResistance;
	      this.repairIngredient = new LazyLoadedValue<>(ingredient);
    }

	@Override
	public int getDurabilityForSlot(EquipmentSlot slot) {
		return HEALTH_PER_SLOT[slot.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot slot) {
		return this.slotProtections[slot.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.sound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}

	@Override
	public String getName() {
		return "firstmod:" + this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
}
