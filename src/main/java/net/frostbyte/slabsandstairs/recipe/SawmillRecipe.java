package net.frostbyte.slabsandstairs.recipe;

import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.*;
import net.minecraft.world.World;

import static net.frostbyte.slabsandstairs.recipe.ModRecipes.*;

public class SawmillRecipe extends CuttingRecipe {
    public SawmillRecipe(String group, Ingredient ingredient, ItemStack result) {
        super(SAWMILL_RECIPE, SAWMILL_SERIALIZER, group, ingredient, result);
    }

    public boolean matches(Inventory inventory, World world) {
        return this.ingredient.test(inventory.getStack(0));
    }

    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.SAWMILL);
    }
}