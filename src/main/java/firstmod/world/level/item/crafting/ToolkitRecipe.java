package firstmod.world.level.item.crafting;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import firstmod.core.FirstMod;
import firstmod.init.ModItems;
import firstmod.init.ModRecipes;
import it.unimi.dsi.fastutil.ints.IntList;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.entity.player.StackedContents;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.Level;

public class ToolkitRecipe implements CraftingRecipe {
	private static int MAX_SIZE = 3; // Temporarily hard-coded
	private final ResourceLocation id;
	final String group;
	final ItemStack result;
	final NonNullList<Ingredient> ingredients;
	private final boolean isSimple;
	final ItemStack toolkit = null;

	public ToolkitRecipe(ResourceLocation p_44246_, String p_44247_, ItemStack p_44248_, NonNullList<Ingredient> p_44249_) {
		this.id = p_44246_;
		this.group = p_44247_;
		this.result = p_44248_;
		this.ingredients = p_44249_;
		this.isSimple = p_44249_.stream().allMatch(Ingredient::isSimple);
	}

	@Override
	public RecipeType<?> getType() {
		return ModRecipes.TOOLKIT_CRAFTING;
	}

	public ResourceLocation getId() {
		return this.id;
	}

	public RecipeSerializer<ToolkitRecipe> getSerializer() {
		return ModRecipes.TOOLKIT_RECIPE.get();
	}
	
	public ItemStack getToastSymbol() {
		return new ItemStack(ModItems.BASIC_TOOLKIT.get());
	}

	public String getGroup() {
		return this.group;
	}

	public ItemStack getResultItem() {
		return this.result;
	}

	public NonNullList<Ingredient> getIngredients() {
		return this.ingredients;
	}

	public boolean matches(CraftingContainer p_44262_, Level p_44263_) {
		StackedContents stackedcontents = new StackedContents();
		java.util.List<ItemStack> inputs = new java.util.ArrayList<>();
		int i = 0;

		for(int j = 0; j < p_44262_.getContainerSize(); ++j) {
			ItemStack itemstack = p_44262_.getItem(j);
			if (!itemstack.isEmpty()) {
				++i;
				if (isSimple)
					stackedcontents.accountStack(itemstack, 1);
				else inputs.add(itemstack);
			}
		}

		return i == this.ingredients.size() && (isSimple ? stackedcontents.canCraft(this, (IntList)null) : net.minecraftforge.common.util.RecipeMatcher.findMatches(inputs,  this.ingredients) != null);
	}

	public ItemStack assemble(CraftingContainer p_44260_) {
		return this.result.copy();
	}

	public boolean canCraftInDimensions(int p_44252_, int p_44253_) {
		return p_44252_ * p_44253_ >= this.ingredients.size();
	}
	
	public static class Type implements RecipeType<ToolkitRecipe> {
		private Type() { }
		public static final Type INSTANCE = new Type();
		public static final String ID = "toolkit_crafting";
	}

	public static class Serializer extends net.minecraftforge.registries.ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<ToolkitRecipe> {
		public static final Serializer INSTANCE = new Serializer();
		public static final ResourceLocation NAME = new ResourceLocation(FirstMod.MOD_ID, "toolkit_crafting");
		
		@Override
		public ToolkitRecipe fromJson(ResourceLocation p_44290_, JsonObject p_44291_) {
			String s = GsonHelper.getAsString(p_44291_, "group", "");
			NonNullList<Ingredient> nonnulllist = itemsFromJson(GsonHelper.getAsJsonArray(p_44291_, "ingredients"));
			if (nonnulllist.isEmpty()) {
				throw new JsonParseException("No ingredients for toolkit recipe");
			} else if (nonnulllist.size() > MAX_SIZE) {
				throw new JsonParseException("Too many ingredients for toolkit recipe. The maximum is " + MAX_SIZE);
			} else {
				ItemStack itemstack = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(p_44291_, "result"));
				return new ToolkitRecipe(p_44290_, s, itemstack, nonnulllist);
			}
		}

		private static NonNullList<Ingredient> itemsFromJson(JsonArray p_44276_) {
			NonNullList<Ingredient> nonnulllist = NonNullList.create();

			for(int i = 0; i < p_44276_.size(); ++i) {
				Ingredient ingredient = Ingredient.fromJson(p_44276_.get(i));
				if (!ingredient.isEmpty()) {
					nonnulllist.add(ingredient);
				}
			}

			return nonnulllist;
		}

		public ToolkitRecipe fromNetwork(ResourceLocation p_44293_, FriendlyByteBuf p_44294_) {
			String s = p_44294_.readUtf();
			int i = p_44294_.readVarInt();
			NonNullList<Ingredient> nonnulllist = NonNullList.withSize(i, Ingredient.EMPTY);

			for(int j = 0; j < nonnulllist.size(); ++j) {
				nonnulllist.set(j, Ingredient.fromNetwork(p_44294_));
			}

			ItemStack itemstack = p_44294_.readItem();
			return new ToolkitRecipe(p_44293_, s, itemstack, nonnulllist);
		}

		public void toNetwork(FriendlyByteBuf p_44281_, ToolkitRecipe p_44282_) {
			p_44281_.writeUtf(p_44282_.group);
			p_44281_.writeVarInt(p_44282_.ingredients.size());

			for(Ingredient ingredient : p_44282_.ingredients) {
				ingredient.toNetwork(p_44281_);
			}

			p_44281_.writeItem(p_44282_.result);
		}
	}
}
