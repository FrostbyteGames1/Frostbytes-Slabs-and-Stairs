package net.frostbyte.slabsandstairs.recipe;

import net.frostbyte.slabsandstairs.SlabsAndStairs;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void register(){
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(SlabsAndStairs.MOD_ID, SawmillRecipe.Serializer.ID),
                SawmillRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(SlabsAndStairs.MOD_ID, SawmillRecipe.Type.ID),
                SawmillRecipe.Type.INSTANCE);
    }
}