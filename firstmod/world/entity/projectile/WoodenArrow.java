package firstmod.world.entity.projectile;

import firstmod.init.ModEntities;
import firstmod.init.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class WoodenArrow extends AbstractArrow {
	private final Item referenceItem;
	
	public WoodenArrow(EntityType<? extends AbstractArrow> type, Level level) {
		super(type, level);
		this.referenceItem = ModItems.WOODEN_ARROW.get();
	}
	
	public WoodenArrow(LivingEntity shooter, Level level, Item referenceItem) {
		super(ModEntities.WOODEN_ARROW.get(), shooter, level);
		this.referenceItem = referenceItem;
	}

	@Override
	public ItemStack getPickupItem() {
		return new ItemStack(this.referenceItem);
	}
}
