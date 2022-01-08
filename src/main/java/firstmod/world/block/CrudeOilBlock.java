package firstmod.world.block;

import firstmod.init.ModFluids;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class CrudeOilBlock extends LiquidBlock {

	public CrudeOilBlock() {
		super(ModFluids.CRUDE_OIL_SOURCE, BlockBehaviour.Properties.of(Material.WATER).strength(100f).noDrops());
	}
	
}
