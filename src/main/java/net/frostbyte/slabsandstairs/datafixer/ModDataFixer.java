package net.frostbyte.slabsandstairs.datafixer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.chunk.Chunk;

import java.util.Map;

public class ModDataFixer implements ServerTickEvents.StartTick {
    private final Map<Block, Block> BLOCK_CONVERSION = Map.of(
        ModBlocks.TUFF_SLAB, Blocks.TUFF_SLAB,
        ModBlocks.TUFF_STAIRS, Blocks.TUFF_STAIRS,
        ModBlocks.TUFF_WALL, Blocks.TUFF_WALL,
        ModBlocks.SAWMILL, Blocks.STONECUTTER
    );

    @Override
    public void onStartTick(MinecraftServer server) {
        for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
            for (int i = 0; i < player.getInventory().size(); i++) {
                if (player.getInventory().getStack(i).getItem() instanceof BlockItem blockItem && BLOCK_CONVERSION.containsKey(blockItem.getBlock())) {
                    player.getInventory().setStack(i, new ItemStack(BLOCK_CONVERSION.get(blockItem.getBlock()), player.getInventory().getStack(i).getCount()));
                }
            }
            Chunk chunk = player.getServerWorld().getChunk(player.getBlockPos());
            chunk.forEachBlockMatchingPredicate(
                blockState -> BLOCK_CONVERSION.containsKey(blockState.getBlock()),
                (blockPos, blockState) -> player.getServerWorld().setBlockState(blockPos, BLOCK_CONVERSION.get(blockState.getBlock()).getStateWithProperties(blockState))
            );
        }
    }
}
