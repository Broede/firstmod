package firstmod.client.renderer;

import java.util.List;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import firstmod.client.model.BucklerModel;
import firstmod.init.ModItems;
import firstmod.init.ModTextures;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ModBlockEntityWithoutLevelRenderer extends BlockEntityWithoutLevelRenderer {
	private BucklerModel bucklerModel;
	@SuppressWarnings("unused")
	private final BlockEntityRenderDispatcher blockEntityRenderDispatcher;
	private final EntityModelSet entityModelSet;

	public ModBlockEntityWithoutLevelRenderer(BlockEntityRenderDispatcher dispatcher, EntityModelSet modelSet) {
		super(dispatcher, modelSet);
		blockEntityRenderDispatcher = dispatcher;
		entityModelSet = modelSet;
	}

	@Override
	public void onResourceManagerReload(ResourceManager p_172555_) {
		this.bucklerModel = new BucklerModel(this.entityModelSet.bakeLayer(ModelLayers.SHIELD));
	}
	
	@Override
	public void renderByItem(ItemStack itemToRender, ItemTransforms.TransformType transformType, PoseStack poseStack, MultiBufferSource multiBufferSource, int p_108834_, int p_108835_) {
		if (itemToRender.is(ModItems.BUCKLER.get())) {
//			boolean flag = BlockItem.getBlockEntityData(itemToRender) != null;
			poseStack.pushPose();
			poseStack.scale(1.0F, -1.0F, -1.0F);
//			Material material = flag ? ModelBakery.SHIELD_BASE : ModelBakery.NO_PATTERN_SHIELD;
			Material material = ModTextures.LOCATION_BUCKLER;
			VertexConsumer vertexconsumer = material.sprite().wrap(ItemRenderer.getFoilBufferDirect(multiBufferSource, this.bucklerModel.renderType(material.atlasLocation()), true, itemToRender.hasFoil()));
			this.bucklerModel.handle().render(poseStack, vertexconsumer, p_108834_, p_108835_, 1.0F, 1.0F, 1.0F, 1.0F);
//			if (flag) {
//				List<Pair<BannerPattern, DyeColor>> list = BannerBlockEntity.createPatterns(ShieldItem.getColor(itemToRender), BannerBlockEntity.getItemPatterns(itemToRender));
//				BannerRenderer.renderPatterns(poseStack, multiBufferSource, p_108834_, p_108835_, this.bucklerModel.plate(), material, false, list, itemToRender.hasFoil());
//			} else {
				this.bucklerModel.plate().render(poseStack, vertexconsumer, p_108834_, p_108835_, 1.0F, 1.0F, 1.0F, 1.0F);
//			}

			poseStack.popPose();
		} else {
			super.renderByItem(itemToRender, transformType, poseStack, multiBufferSource, p_108834_, p_108835_);
		}
		
	}
}
