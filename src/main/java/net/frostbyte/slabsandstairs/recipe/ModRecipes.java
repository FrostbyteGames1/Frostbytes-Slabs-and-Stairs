package net.frostbyte.slabsandstairs.recipe;

import net.minecraft.recipe.CuttingRecipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;

public class ModRecipes {

    public static RecipeType<SawmillRecipe> SAWMILL_RECIPE;
    public static final RecipeSerializer<SawmillRecipe> SAWMILL_SERIALIZER =
            RecipeSerializer.register("slabsandstairs:sawmill", new CuttingRecipe.Serializer<>(SawmillRecipe::new));

    public static void register(){
        SAWMILL_RECIPE = RecipeType.register("slabsandstairs:sawmill");
    }
}