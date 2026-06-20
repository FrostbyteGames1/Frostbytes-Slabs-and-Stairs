package net.frostbyte.slabsandstairs.item;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.frostbyte.slabsandstairs.SlabsAndStairs;
import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ModItemGroup {

    public static CreativeModeTab SLABSANDSTAIRS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(SlabsAndStairs.MOD_ID, "slabsandstairs"),
            FabricCreativeModeTab.builder().title(Component.translatable("itemgroup.slabsandstairs"))
                    .icon(() -> new ItemStack(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS)).displayItems((displayContext, entries) -> {
                        for (Field field : ModBlocks.class.getDeclaredFields()) {
                            if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers()) && field.getType() == Block.class && !field.getName().equalsIgnoreCase("MIXED_SLAB_BLOCK")) {
                                try {
                                    entries.accept((Block) field.get(null));
                                } catch (IllegalAccessException e) {
                                    SlabsAndStairs.LOGGER.error("Failed to add {} to {} item group", field.getName(), Component.translatable("itemgroup.slabsandstairs"));
                                }
                            }
                        }
                    }).build());

    public static void registerModItemGroup() {
        SLABSANDSTAIRS.shouldDisplay();
    }
}
