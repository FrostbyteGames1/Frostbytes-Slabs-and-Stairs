package net.frostbyte.slabsandstairs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.frostbyte.slabsandstairs.SlabsAndStairs;
import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup SLABSANDSTAIRS = FabricItemGroup.builder(new Identifier(SlabsAndStairs.MOD_ID, "slabsandstairs"))
            .icon(() -> new ItemStack(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS))
            .build();
}
