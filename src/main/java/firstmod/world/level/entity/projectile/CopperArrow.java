package firstmod.world.level.entity.projectile;

import firstmod.init.ModEntities;
import firstmod.init.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CopperArrow extends AbstractArrow {
	
	private final Item referenceItem;
	
	public CopperArrow(EntityType<? extends AbstractArrow> type, Level level) {
		super(type, level);
		this.referenceItem = ModItems.COPPER_ARROW.get();
	}
	
	public CopperArrow(LivingEntity shooter, Level level, Item referenceItem) {
		super(ModEntities.COPPER_ARROW.get(), shooter, level);
		this.referenceItem = referenceItem;
	}

	@Override
	public ItemStack getPickupItem() {
		return new ItemStack(this.referenceItem);
	}
}
