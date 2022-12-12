package net.frostbyte.slabsandstairs.recipe;

import net.frostbyte.slabsandstairs.SlabsAndStairs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void register(){
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(SlabsAndStairs.MOD_ID, SawmillRecipe.Serializer.ID),
                SawmillRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(SlabsAndStairs.MOD_ID, SawmillRecipe.Type.ID),
                SawmillRecipe.Type.INSTANCE);
    }
}