package firstmod.world.level.entity.projectile;

import javax.annotation.Nullable;

import firstmod.init.ModEntities;
import firstmod.world.level.item.ModFishingRodItem;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import net.minecraft.world.phys.Vec3;

public class ModFishingHook extends FishingHook {
	@Nullable
	public ModFishingHook(EntityType<? extends ModFishingHook> entityType, Level level, int luck, int lureSpeed) {
		super(entityType, level);
		this.noCulling = true;
	}
	
	public ModFishingHook(EntityType<? extends ModFishingHook> entityType, Level level) {
		this(entityType, level, 0, 0);
	}
	
	public ModFishingHook(Player player, Level level, int luck, int lureSpeed) {
		this(ModEntities.MOD_FISHING_BOBBER.get(), level, luck, lureSpeed);
		this.setOwner(player);
		float f = player.getXRot();
		float f1 = player.getYRot();
		float f2 = Mth.cos(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
		float f3 = Mth.sin(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
		float f4 = -Mth.cos(-f * ((float)Math.PI / 180F));
		float f5 = Mth.sin(-f * ((float)Math.PI / 180F));
		double d0 = player.getX() - (double)f3 * 0.3D;
		double d1 = player.getEyeY();
		double d2 = player.getZ() - (double)f2 * 0.3D;
		this.moveTo(d0, d1, d2, f1, f);
		Vec3 vec3 = new Vec3((double)(-f3), (double)Mth.clamp(-(f5 / f4), -5.0F, 5.0F), (double)(-f2));
		double d3 = vec3.length();
		vec3 = vec3.multiply(0.6D / d3 + 0.5D + this.random.nextGaussian() * 0.0045D, 0.6D / d3 + 0.5D + this.random.nextGaussian() * 0.0045D, 0.6D / d3 + 0.5D + this.random.nextGaussian() * 0.0045D);
		this.setDeltaMovement(vec3);
		this.setYRot((float)(Mth.atan2(vec3.x, vec3.z) * (double)(180F / (float)Math.PI)));
		this.setXRot((float)(Mth.atan2(vec3.y, vec3.horizontalDistance()) * (double)(180F / (float)Math.PI)));
		this.yRotO = this.getYRot();
		this.xRotO = this.getXRot();
	}
	
	@Override
	protected boolean shouldStopFishing(Player player) {
		ItemStack itemMain = player.getMainHandItem();
		ItemStack itemOff = player.getOffhandItem();
		boolean flagMain = itemMain.getItem() instanceof ModFishingRodItem;
		boolean flagOff = itemOff.getItem() instanceof ModFishingRodItem;
		if ( !player.isRemoved() && player.isAlive() && (flagMain || flagOff) && !(this.distanceToSqr(player) > 1024.0D)) {
			return false;
		} else {
			this.discard();
			return true;
		}
	}

}
