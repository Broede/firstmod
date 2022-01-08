package firstmod.events;

import java.util.Iterator;
import java.util.List;

import com.google.gson.JsonObject;

import firstmod.init.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;

public class ArrowDroppersLootModifier extends LootModifier {
	
	protected  ArrowDroppersLootModifier(LootItemCondition[] conditionsIn) {
		super(conditionsIn);
	}
	
	public static class Serializer extends GlobalLootModifierSerializer<ArrowDroppersLootModifier> {
		@Override
		public ArrowDroppersLootModifier read(ResourceLocation location, JsonObject object,
				LootItemCondition[] ailootcondition) {
			return new ArrowDroppersLootModifier(ailootcondition);
		}

		@Override
		public JsonObject write(ArrowDroppersLootModifier instance) {
			return makeConditions(instance.conditions);
		}
    }
	
	@Override
	protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
		Iterator<ItemStack> iterator = generatedLoot.iterator();
		while ( iterator.hasNext() ) {
			ItemStack itemStack = iterator.next();
			if ( itemStack.getItem() == Items.ARROW ) {
				ItemStack replacementStack = new ItemStack(ModItems.FLINT_ARROW.get());
				replacementStack.setCount(itemStack.getCount());
				generatedLoot.remove(itemStack);
				generatedLoot.add(replacementStack);
				break;
			}
		}
		return generatedLoot;
	}
}
 