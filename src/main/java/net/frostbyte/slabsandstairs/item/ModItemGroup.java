package net.frostbyte.slabsandstairs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.frostbyte.slabsandstairs.SlabsAndStairs;
import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ModItemGroup {

    public static ItemGroup SLABSANDSTAIRS = Registry.register(Registries.ITEM_GROUP, Identifier.of(SlabsAndStairs.MOD_ID, "slabsandstairs"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.slabsandstairs"))
            .icon(() -> new ItemStack(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS)).entries((displayContext, entries) -> {
                for (Field field : ModBlocks.class.getDeclaredFields()) {
                    if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers()) && field.getType() == Block.class && !field.getName().equalsIgnoreCase("MIXED_SLAB_BLOCK")) {
                        try {
                            entries.add((Block) field.get(null));
                        } catch (IllegalAccessException e) {
                            SlabsAndStairs.LOGGER.error("Failed to add {} to {} item group", field.getName(), Text.translatable("itemgroup.slabsandstairs"));
                        }
                    }
                }
            }).build());

    public static void registerModItemGroup() {
        SLABSANDSTAIRS.shouldDisplay();
    }
}
