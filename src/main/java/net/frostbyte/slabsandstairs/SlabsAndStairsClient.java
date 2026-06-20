package net.frostbyte.slabsandstairs;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;
import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.minecraft.client.color.block.BlockTintSource;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

public class SlabsAndStairsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : -12012264, ModBlocks.OAK_LEAF_LAYER);
        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @SuppressWarnings("NullableProblems")
            @Override
            public int color(BlockState state) {
                return -12012264;
            }
            @SuppressWarnings("NullableProblems")
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                return BiomeColors.getAverageFoliageColor(level, pos);
            }
        }), ModBlocks.OAK_LEAF_LAYER);

        //ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> -10380959, ModBlocks.SPRUCE_LEAF_LAYER);
        BlockColorRegistry.register(List.of(state -> -10380959), ModBlocks.SPRUCE_LEAF_LAYER);

        //ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> -8345771, ModBlocks.BIRCH_LEAF_LAYER);
        BlockColorRegistry.register(List.of(state -> -8345771), ModBlocks.BIRCH_LEAF_LAYER);

        //ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : -12012264, ModBlocks.JUNGLE_LEAF_LAYER);
        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @SuppressWarnings("NullableProblems")
            @Override
            public int color(BlockState state) {
                return -12012264;
            }
            @SuppressWarnings("NullableProblems")
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                return BiomeColors.getAverageFoliageColor(level, pos);
            }
        }), ModBlocks.JUNGLE_LEAF_LAYER);

        //ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : -12012264, ModBlocks.ACACIA_LEAF_LAYER);
        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @SuppressWarnings("NullableProblems")
            @Override
            public int color(BlockState state) {
                return -12012264;
            }
            @SuppressWarnings("NullableProblems")
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                return BiomeColors.getAverageFoliageColor(level, pos);
            }
        }), ModBlocks.ACACIA_LEAF_LAYER);

        //ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : -12012264, ModBlocks.DARK_OAK_LEAF_LAYER);
        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @SuppressWarnings("NullableProblems")
            @Override
            public int color(BlockState state) {
                return -12012264;
            }
            @SuppressWarnings("NullableProblems")
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                return BiomeColors.getAverageFoliageColor(level, pos);
            }
        }), ModBlocks.DARK_OAK_LEAF_LAYER);

        //ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : -12012264, ModBlocks.MANGROVE_LEAF_LAYER);
        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @SuppressWarnings("NullableProblems")
            @Override
            public int color(BlockState state) {
                return -12012264;
            }
            @SuppressWarnings("NullableProblems")
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                return BiomeColors.getAverageFoliageColor(level, pos);
            }
        }), ModBlocks.MANGROVE_LEAF_LAYER);
    }
}
