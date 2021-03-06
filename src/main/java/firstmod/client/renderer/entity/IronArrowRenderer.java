package firstmod.client.renderer.entity;

import firstmod.core.FirstMod;
import firstmod.world.level.entity.projectile.IronArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class IronArrowRenderer extends ArrowRenderer<IronArrow>{

	public IronArrowRenderer(Context context) {
		super(context);
	}

	@Override
	public ResourceLocation getTextureLocation(IronArrow pEntity) {
		Item referenceItem = pEntity.getPickupItem().getItem();
		return new ResourceLocation(FirstMod.MOD_ID, "textures/entity/projectiles/" + referenceItem.getRegistryName().getPath() + ".png");
	}
}
