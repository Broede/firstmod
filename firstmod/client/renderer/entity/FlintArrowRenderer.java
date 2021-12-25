package firstmod.client.renderer.entity;

import firstmod.core.FirstMod;
import firstmod.world.entity.projectile.FlintArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class FlintArrowRenderer extends ArrowRenderer<FlintArrow> {

	public FlintArrowRenderer(Context context) {
		super(context);
	}

	@Override
	public ResourceLocation getTextureLocation(FlintArrow pEntity) {
		Item referenceItem = pEntity.getPickupItem().getItem();
		return new ResourceLocation(FirstMod.MOD_ID, "textures/entity/projectiles/" + referenceItem.getRegistryName().getPath() + ".png");
	}
}
