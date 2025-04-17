package net.frostbyte.slabsandstairs;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;

public class SlabsAndStairsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_LEAF_LAYER, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : -12012264, ModBlocks.OAK_LEAF_LAYER);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRUCE_LEAF_LAYER, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> -10380959, ModBlocks.SPRUCE_LEAF_LAYER);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIRCH_LEAF_LAYER, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> -8345771, ModBlocks.BIRCH_LEAF_LAYER);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLE_LEAF_LAYER, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : -12012264, ModBlocks.JUNGLE_LEAF_LAYER);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ACACIA_LEAF_LAYER, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : -12012264, ModBlocks.ACACIA_LEAF_LAYER);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_OAK_LEAF_LAYER, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : -12012264, ModBlocks.DARK_OAK_LEAF_LAYER);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGROVE_LEAF_LAYER, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : -12012264, ModBlocks.MANGROVE_LEAF_LAYER);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_LEAF_LAYER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALE_OAK_LEAF_LAYER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AZALEA_LEAF_LAYER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLOWERING_AZALEA_LEAF_LAYER, RenderLayer.getCutout());
    }
}
