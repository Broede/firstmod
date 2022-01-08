package firstmod.init;

import firstmod.core.FirstMod;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ModTextures {
	public static final Material LOCATION_BUCKLER = material("entity/buckler/base");
	
	@SuppressWarnings("deprecation")
	private static Material material(String path) {
		return new Material(TextureAtlas.LOCATION_BLOCKS, new ResourceLocation(FirstMod.MOD_ID, path));
	}
}
