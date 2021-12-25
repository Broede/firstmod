package firstmod.world.entity.projectile;

import firstmod.init.ModEntityTypes;
import firstmod.init.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class IronArrow extends AbstractArrow {

	private final Item referenceItem;
	
	public IronArrow(EntityType<? extends AbstractArrow> type, Level level) {
		super(type, level);
		this.referenceItem = ModItems.IRON_ARROW.get();
	}
	
	public IronArrow(LivingEntity shooter, Level level, Item referenceItem) {
		super(ModEntityTypes.IRON_ARROW.get(), shooter, level);
		this.referenceItem = referenceItem;
	}

	@Override
	public ItemStack getPickupItem() {
		return new ItemStack(this.referenceItem);
	}
}
