package firstmod.client.gui.screens.inventory;

import javax.annotation.Nonnull;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import firstmod.core.FirstMod;
import firstmod.world.inventory.BasicToolkitMenu;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BasicToolkitScreen extends AbstractContainerScreen<BasicToolkitMenu> {

	private static final ResourceLocation BASIC_TOOLKIT_TEXTURE = new ResourceLocation(FirstMod.MOD_ID, "textures/gui/container/basic_toolkit_crafting_menu.png");

	public BasicToolkitScreen(BasicToolkitMenu p_97741_, Inventory p_97742_, Component p_97743_) {
		super(p_97741_, p_97742_, p_97743_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(@Nonnull PoseStack matrixStack, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(matrixStack);
		super.render(matrixStack, mouseX, mouseY, partialTicks);
		this.renderTooltip(matrixStack, mouseX, mouseY);
	}
	
	@Override
	protected void renderBg(@Nonnull PoseStack matrixStack, float partialTicks, int x, int y) {
		if ( this.minecraft != null ) {
			RenderSystem.setShader(GameRenderer::getPositionTexShader);
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.setShaderTexture(0, BASIC_TOOLKIT_TEXTURE);
			int i = (this.width - this.imageWidth) / 2;
			int j = (this.height - this.imageHeight) / 2;
			this.blit(matrixStack, i, j, 0, 0, this.imageWidth, this.imageHeight);
		}
	}
}
