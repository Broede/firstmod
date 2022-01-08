package firstmod.events;

import java.util.List;
import java.util.Random;

import com.google.gson.JsonObject;

import firstmod.init.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;

public class HoovedAnimalLootModifier extends LootModifier {
	
    protected HoovedAnimalLootModifier(LootItemCondition[] conditionsIn) {
		super(conditionsIn);
	}

	@Override
	protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
		int lootLevel = context.getLootingModifier();
		float chance = 0.175F * (float)((lootLevel+1) * 2);
		int rolls = (int)chance + 1, local_chance = ((int)(chance * 100.0F) % 100), count = 0;
		
		Random rand = new Random();
		for ( ; rolls > 0; rolls-- ) {
			if ( (rolls > 1) )
				count++;
			else {
				if ( rand.nextInt(100) < local_chance )
					count++;
			}
			if ( count >= 4 ) {
				count = 4;
				break;
			}
		}
		
		generatedLoot.add(new ItemStack(ModItems.HOOF.get(), count));
		return generatedLoot;
	}
    
	public static class Serializer extends GlobalLootModifierSerializer<HoovedAnimalLootModifier> {
		@Override
		public HoovedAnimalLootModifier read(ResourceLocation location, JsonObject object,
				LootItemCondition[] ailootcondition) {
			return new HoovedAnimalLootModifier(ailootcondition);
		}

		@Override
		public JsonObject write(HoovedAnimalLootModifier instance) {
			return makeConditions(instance.conditions);
		}
    }
}
