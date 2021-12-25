package firstmod.init;

import java.util.Iterator;
import java.util.List;

import com.google.gson.JsonObject;

import firstmod.core.FirstMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(FirstMod.MOD_ID)
public class ModLootModifiers {
    public static final DeferredRegister<GlobalLootModifierSerializer<?>> GLM = DeferredRegister.create(ForgeRegistries.LOOT_MODIFIER_SERIALIZERS, FirstMod.MOD_ID);
    
	public static final RegistryObject<DungeonLootModifier.Serializer> DUNGEON_LOOT = GLM.register("chest_arrows", DungeonLootModifier.Serializer::new);

    private static class DungeonLootModifier extends LootModifier {

    	public DungeonLootModifier(final LootItemCondition[] conditionsIn) {
            super(conditionsIn);
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

        @EventBusSubscriber(modid = FirstMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
        public static class EventHandlers {
        	
            @SubscribeEvent
            public static void runData(GatherDataEvent event)
            {
                event.getGenerator().addProvider(new DataProvider(event.getGenerator(), FirstMod.MOD_ID));
            }
        }

        private static class DataProvider extends GlobalLootModifierProvider
        {
            public DataProvider(DataGenerator gen, String modid)
            {
                super(gen, modid);
            }

            @Override
            protected void start()
            {
                add("chest_arrows", DUNGEON_LOOT.get(), new DungeonLootModifier(new LootItemCondition[] {LootTableIdCondition.builder(new ResourceLocation("chests/village/village_fletcher")).build()}));
                add("chest_arrows", DUNGEON_LOOT.get(), new DungeonLootModifier(new LootItemCondition[] {LootTableIdCondition.builder(new ResourceLocation("chests/bastion_bridge")).build()}));
                add("chest_arrows", DUNGEON_LOOT.get(), new DungeonLootModifier(new LootItemCondition[] {LootTableIdCondition.builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}));
                add("chest_arrows", DUNGEON_LOOT.get(), new DungeonLootModifier(new LootItemCondition[] {LootTableIdCondition.builder(new ResourceLocation("chests/bastion_other")).build()}));
                add("chest_arrows", DUNGEON_LOOT.get(), new DungeonLootModifier(new LootItemCondition[] {LootTableIdCondition.builder(new ResourceLocation("chests/jungle_temple_dispenser")).build()}));
                add("chest_arrows", DUNGEON_LOOT.get(), new DungeonLootModifier(new LootItemCondition[] {LootTableIdCondition.builder(new ResourceLocation("chests/pillager_outpost")).build()}));
                add("chest_arrows", DUNGEON_LOOT.get(), new DungeonLootModifier(new LootItemCondition[] {LootTableIdCondition.builder(new ResourceLocation("gameplay/hero_of_the_village/gift_fletcher")).build()}));
            }
        }
        
        private static class Serializer extends GlobalLootModifierSerializer<DungeonLootModifier> {
            @Override
            public DungeonLootModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] conditions) {
                return new DungeonLootModifier(conditions);
            }

            @Override
            public JsonObject write(DungeonLootModifier instance) {
                final JsonObject obj = this.makeConditions(instance.conditions);
                return obj;
            }
        }
    }
}
