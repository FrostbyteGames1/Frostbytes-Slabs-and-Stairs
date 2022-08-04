package net.frostbyte.slabsandstairs.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.frostbyte.slabsandstairs.SlabsAndStairs;
import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {

    public static BlockEntityType<SawmillBlockEntity> SAWMILL;

    public static void registerBlockEntities(){
        SAWMILL = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(SlabsAndStairs.MOD_ID, "sawmill"),
                FabricBlockEntityTypeBuilder.create(SawmillBlockEntity::new,
                        ModBlocks.SAWMILL).build(null));
    }
}
