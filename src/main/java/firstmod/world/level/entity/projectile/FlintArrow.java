package firstmod.world.level.entity.projectile;

import firstmod.init.ModEntities;
import firstmod.init.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class FlintArrow extends AbstractArrow {
	private final Item referenceItem;
	
	public FlintArrow(EntityType<? extends AbstractArrow> type, Level level) {
		super(type, level);
		this.referenceItem = ModItems.FLINT_ARROW.get();
	}
	
	public FlintArrow(LivingEntity shooter, Level level, Item referenceItem) {
		super(ModEntities.FLINT_ARROW.get(), shooter, level);
		this.referenceItem = referenceItem;
	}

	@Override
	public ItemStack getPickupItem() {
		return new ItemStack(this.referenceItem);
	}
}
