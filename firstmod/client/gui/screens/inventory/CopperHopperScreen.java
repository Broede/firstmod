package firstmod.client.gui.screens.inventory;

import javax.annotation.Nonnull;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import firstmod.core.FirstMod;
import firstmod.world.block.entity.CopperHopperMenu;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CopperHopperScreen extends AbstractContainerScreen<CopperHopperMenu> {
	
	private static final ResourceLocation HOPPER_GUI_TEXTURE = new ResourceLocation(FirstMod.MOD_ID, "textures/gui/container/copper_hopper.png");
	
	public CopperHopperScreen(CopperHopperMenu screen, Inventory inv, Component titleIn) {
		super(screen, inv, titleIn);
		this.passEvents = false;
		this.imageHeight = 133;
		this.inventoryLabelY = this.imageHeight - 94;
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
			RenderSystem.setShaderTexture(0, HOPPER_GUI_TEXTURE);
			int i = (this.width - this.imageWidth) / 2;
			int j = (this.height - this.imageHeight) / 2;
			this.blit(matrixStack, i, j, 0, 0, this.imageWidth, this.imageHeight);
		}
	}
}
