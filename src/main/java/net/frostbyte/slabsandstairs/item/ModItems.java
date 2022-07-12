package net.frostbyte.slabsandstairs.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.frostbyte.slabsandstairs.SlabsAndStairs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SlabsAndStairs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SlabsAndStairs.LOGGER.debug("Registering Mod Items for " + SlabsAndStairs.MOD_ID);
    }

}
