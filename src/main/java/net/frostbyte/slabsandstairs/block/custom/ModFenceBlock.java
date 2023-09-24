package net.frostbyte.slabsandstairs.block.custom;

import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.HashMap;
import java.util.Map;

public class ModFenceBlock extends FenceBlock {

    private static final Map<Block, Block> STRIPPED_BLOCKS = new HashMap<>();
    public ModFenceBlock(Settings settings) {
        super(settings);
        STRIPPED_BLOCKS.put(ModBlocks.ACACIA_WOOD_FENCE, ModBlocks.STRIPPED_ACACIA_FENCE);
        STRIPPED_BLOCKS.put(ModBlocks.BIRCH_WOOD_FENCE, ModBlocks.STRIPPED_BIRCH_FENCE);
        STRIPPED_BLOCKS.put(ModBlocks.CRIMSON_HYPHAE_FENCE, ModBlocks.STRIPPED_CRIMSON_FENCE);
        STRIPPED_BLOCKS.put(ModBlocks.CHERRY_WOOD_FENCE, ModBlocks.STRIPPED_CHERRY_FENCE);
        STRIPPED_BLOCKS.put(ModBlocks.DARK_OAK_WOOD_FENCE, ModBlocks.STRIPPED_DARK_OAK_FENCE);
        STRIPPED_BLOCKS.put(ModBlocks.MANGROVE_WOOD_FENCE, ModBlocks.STRIPPED_MANGROVE_FENCE);
        STRIPPED_BLOCKS.put(ModBlocks.OAK_WOOD_FENCE, ModBlocks.STRIPPED_OAK_FENCE);
        STRIPPED_BLOCKS.put(ModBlocks.SPRUCE_WOOD_FENCE, ModBlocks.STRIPPED_SPRUCE_FENCE);
        STRIPPED_BLOCKS.put(ModBlocks.WARPED_HYPHAE_FENCE, ModBlocks.STRIPPED_WARPED_FENCE);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getStackInHand(hand).getItem() instanceof AxeItem) {
            Block stripped = STRIPPED_BLOCKS.get(state.getBlock());
            if (stripped != null) {
                world.setBlockState(pos, stripped.getStateWithProperties(state));
                world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, this.getStateWithProperties(state)));
                if (player != null) {
                    player.getStackInHand(hand).damage(1, player, (p) -> {p.sendToolBreakStatus(hand);});
                }
                return ActionResult.success(world.isClient);
            }
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }
}
