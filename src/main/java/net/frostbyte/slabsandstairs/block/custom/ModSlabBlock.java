package net.frostbyte.slabsandstairs.block.custom;

import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
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

public class ModSlabBlock extends SlabBlock {

    private static final Map<Block, Block> STRIPPED_BLOCKS = new HashMap<>();

    public ModSlabBlock(Settings settings) {
        super(settings);
        STRIPPED_BLOCKS.put(ModBlocks.ACACIA_WOOD_SLAB, ModBlocks.STRIPPED_ACACIA_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.BIRCH_WOOD_SLAB, ModBlocks.STRIPPED_BIRCH_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.CRIMSON_HYPHAE_SLAB, ModBlocks.STRIPPED_CRIMSON_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.CHERRY_WOOD_SLAB, ModBlocks.STRIPPED_CHERRY_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.DARK_OAK_WOOD_SLAB, ModBlocks.STRIPPED_DARK_OAK_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.MANGROVE_WOOD_SLAB, ModBlocks.STRIPPED_MANGROVE_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.OAK_WOOD_SLAB, ModBlocks.STRIPPED_OAK_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.SPRUCE_WOOD_SLAB, ModBlocks.STRIPPED_SPRUCE_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.WARPED_HYPHAE_SLAB, ModBlocks.STRIPPED_WARPED_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.ACACIA_LOG_SLAB, ModBlocks.STRIPPED_ACACIA_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.BIRCH_LOG_SLAB, ModBlocks.STRIPPED_BIRCH_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.CRIMSON_STEM_SLAB, ModBlocks.STRIPPED_CRIMSON_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.CHERRY_LOG_SLAB, ModBlocks.STRIPPED_CHERRY_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.DARK_OAK_LOG_SLAB, ModBlocks.STRIPPED_DARK_OAK_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.MANGROVE_LOG_SLAB, ModBlocks.STRIPPED_MANGROVE_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.OAK_LOG_SLAB, ModBlocks.STRIPPED_OAK_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.SPRUCE_LOG_SLAB, ModBlocks.STRIPPED_SPRUCE_SLAB);
        STRIPPED_BLOCKS.put(ModBlocks.WARPED_STEM_SLAB, ModBlocks.STRIPPED_WARPED_SLAB);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getStackInHand(hand).getItem() instanceof AxeItem && !player.isSneaking()) {
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
