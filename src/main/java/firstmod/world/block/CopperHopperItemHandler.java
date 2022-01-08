package firstmod.world.block;

import javax.annotation.Nonnull;

import firstmod.world.block.entity.CopperHopperBlockEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

public class CopperHopperItemHandler extends SidedInvWrapper {
	private final CopperHopperBlockEntity hopper;
	
	public CopperHopperItemHandler(CopperHopperBlockEntity hopper) {
		super(hopper, null);
		this.hopper = hopper;
	}
	
	@Override
	@Nonnull
	public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
		if ( simulate ) {
			return super.insertItem(slot, stack, true);
		} else {
			boolean wasEmpty = this.inv.isEmpty();
			int originalStackSize = stack.getCount();
			stack = super.insertItem(slot, stack, false);
			if ( wasEmpty && originalStackSize > stack.getCount() ) {
				if ( !this.hopper.isCoolingDown() ) {
					this.hopper.setTransferCooldown(hopper.getTransferSpeed());
				}
			}
			return stack;
		}
	}
}
