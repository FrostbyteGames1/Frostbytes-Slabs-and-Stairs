package net.frostbyte.slabsandstairs.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.frostbyte.slabsandstairs.SlabsAndStairs;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup SLABSANDSTAIRS = FabricItemGroupBuilder.build(
            new Identifier(SlabsAndStairs.MOD_ID, "slabsandstairs"), () -> new ItemStack(Items.CRAFTING_TABLE));
}
