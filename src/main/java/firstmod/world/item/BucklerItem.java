package firstmod.world.item;

import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;

public class BucklerItem extends Item {
	public static final int EFFECTIVE_BLOCK_DELAY = 5;
	public static final float MINIMUM_DURABILITY_DAMAGE = 3.0F;

	public BucklerItem(Item.Properties properties) {
		super(properties);
		DispenserBlock.registerBehavior(this, ArmorItem.DISPENSE_ITEM_BEHAVIOR);
	}
	
	public UseAnim getUseAnimation(ItemStack itemStack) {
		return UseAnim.BLOCK;
	}
	
	public int getUseDuration(ItemStack itemStack) {
		return 72000;
	}

	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		ItemStack itemStack = player.getItemInHand(hand);
		player.startUsingItem(hand);
		return InteractionResultHolder.consume(itemStack);
	}
	
	public boolean isValidRepairItem(ItemStack item1, ItemStack item2) {
		return item2.is(ItemTags.PLANKS) || super.isValidRepairItem(item1, item2);
	}
	
	/* ******************** FORGE START ******************** */

	@Override
	public boolean canPerformAction(ItemStack stack, net.minecraftforge.common.ToolAction toolAction) {
		return net.minecraftforge.common.ToolActions.DEFAULT_SHIELD_ACTIONS.contains(toolAction);
	}
}
