package firstmod.events;

import java.util.Iterator;

import firstmod.core.FirstMod;
import firstmod.world.level.item.ModArmorMaterial;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModifyLivingHurtEvent {

	@SubscribeEvent
	public static void onLivingHurtEvent(LivingHurtEvent event) {
		/*
		 *  Here we check to see if a LivingEntity is hurt by an explosion with full titanium armor.
		 *  If so, we reduce damage.
		 */
		
		LivingEntity victim = event.getEntityLiving();
		DamageSource dmgSource = event.getSource();
		if ( dmgSource.isExplosion() ) {
			Iterable<ItemStack> armorSlots = victim.getArmorSlots();
			Iterator<ItemStack> iter = armorSlots.iterator();
			float blastRedux = 1.0F;
			//int titaniumPieces = 0;
			for ( ; iter.hasNext(); ) {
				Object obj = iter.next();
				FirstMod.LOGGER.info("object class:  " + obj.getClass().toString());
				if ( obj instanceof ItemStack ) {
					ItemStack armorStack = (ItemStack)obj;
					if ( armorStack.getItem() instanceof ArmorItem ) {
						ArmorItem armor = (ArmorItem)armorStack.getItem(); 
						FirstMod.LOGGER.info("Armor Material:  " + armor.getMaterial().toString());
						if ( armor.getMaterial().equals(ModArmorMaterial.TITANIUM) )  {
							//titaniumPieces++;
							if ( armor.getSlot().equals(EquipmentSlot.HEAD) ) {
								FirstMod.LOGGER.info("Titanium helmet detected!");
								blastRedux -= 0.05F;
							}
							else if ( armor.getSlot().equals(EquipmentSlot.FEET) ) {
								FirstMod.LOGGER.info("Titanium boots detected!");
								blastRedux -= 0.05F;
							}
							else if ( armor.getSlot().equals(EquipmentSlot.LEGS) ) {
								FirstMod.LOGGER.info("Titanium leggings detected!");
								blastRedux -= 0.15F;
							}
							else if ( armor.getSlot().equals(EquipmentSlot.CHEST) ) {
								FirstMod.LOGGER.info("Titanium chestplate detected!");
								blastRedux -= 0.25F;
							}
						}
					}
				}
			}
			float damage = event.getAmount();
			float newDamage = damage * blastRedux;
			event.setAmount(newDamage);
			FirstMod.LOGGER.info("LivingHurtEvent fired with DamageSource.EXPLOSION");
			FirstMod.LOGGER.info("Damage reduction:  " + blastRedux);
			FirstMod.LOGGER.info("Old damage:  " + damage);
			FirstMod.LOGGER.info("New damage:  " + newDamage);
			return;
		}
	}}
