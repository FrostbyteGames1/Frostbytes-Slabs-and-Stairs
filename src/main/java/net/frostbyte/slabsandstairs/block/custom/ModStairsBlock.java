package net.frostbyte.slabsandstairs.block.custom;

import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.HashMap;
import java.util.Map;

public class ModStairsBlock extends StairsBlock {

    private static final Map<Block, Block> STRIPPED_BLOCKS = new HashMap<>();

    public ModStairsBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
        STRIPPED_BLOCKS.put(ModBlocks.ACACIA_LOG_STAIRS, ModBlocks.STRIPPED_ACACIA_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.ACACIA_WOOD_STAIRS, ModBlocks.STRIPPED_ACACIA_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.BIRCH_LOG_STAIRS, ModBlocks.STRIPPED_BIRCH_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.BIRCH_WOOD_STAIRS, ModBlocks.STRIPPED_BIRCH_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.CRIMSON_STEM_STAIRS, ModBlocks.STRIPPED_CRIMSON_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.CRIMSON_HYPHAE_STAIRS, ModBlocks.STRIPPED_CRIMSON_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.CHERRY_LOG_STAIRS, ModBlocks.STRIPPED_CHERRY_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.CHERRY_WOOD_STAIRS, ModBlocks.STRIPPED_CHERRY_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.DARK_OAK_LOG_STAIRS, ModBlocks.STRIPPED_DARK_OAK_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.DARK_OAK_WOOD_STAIRS, ModBlocks.STRIPPED_DARK_OAK_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.JUNGLE_WOOD_STAIRS, ModBlocks.STRIPPED_JUNGLE_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.JUNGLE_LOG_STAIRS, ModBlocks.STRIPPED_JUNGLE_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.MANGROVE_LOG_STAIRS, ModBlocks.STRIPPED_MANGROVE_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.MANGROVE_WOOD_STAIRS, ModBlocks.STRIPPED_MANGROVE_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.OAK_LOG_STAIRS, ModBlocks.STRIPPED_OAK_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.OAK_WOOD_STAIRS, ModBlocks.STRIPPED_OAK_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.SPRUCE_LOG_STAIRS, ModBlocks.STRIPPED_SPRUCE_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.SPRUCE_WOOD_STAIRS, ModBlocks.STRIPPED_SPRUCE_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.WARPED_STEM_STAIRS, ModBlocks.STRIPPED_WARPED_STAIRS);
        STRIPPED_BLOCKS.put(ModBlocks.WARPED_HYPHAE_STAIRS, ModBlocks.STRIPPED_WARPED_STAIRS);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if ((player.getMainHandStack().getItem() instanceof AxeItem || player.getOffHandStack().getItem() instanceof AxeItem) && !player.isSneaking()) {
            Block stripped = STRIPPED_BLOCKS.get(state.getBlock());
            if (stripped != null) {
                world.setBlockState(pos, stripped.getStateWithProperties(state));
                world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, this.getStateWithProperties(state)));
                if (player.getMainHandStack().getItem() instanceof AxeItem) {
                    player.getMainHandStack().damage(1, player, EquipmentSlot.MAINHAND);
                } else {
                    player.getOffHandStack().damage(1, player, EquipmentSlot.OFFHAND);
                }
                return ActionResult.success(world.isClient);
            }
        }
        return super.onUse(state, world, pos, player, hit);
    }
}
