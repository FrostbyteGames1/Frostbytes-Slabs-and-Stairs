package net.frostbyte.slabsandstairs.block.custom;

import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.WoodType;
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

public class ModFenceGateBlock extends FenceGateBlock {
    private static final Map<Block, Block> STRIPPED_BLOCKS = new HashMap<>();
    public ModFenceGateBlock(Settings settings, WoodType type) {
        super(type, settings);
        STRIPPED_BLOCKS.put(ModBlocks.ACACIA_WOOD_FENCE_GATE, ModBlocks.STRIPPED_ACACIA_FENCE_GATE);
        STRIPPED_BLOCKS.put(ModBlocks.BIRCH_WOOD_FENCE_GATE, ModBlocks.STRIPPED_BIRCH_FENCE_GATE);
        STRIPPED_BLOCKS.put(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE, ModBlocks.STRIPPED_CRIMSON_FENCE_GATE);
        STRIPPED_BLOCKS.put(ModBlocks.CHERRY_WOOD_FENCE_GATE, ModBlocks.STRIPPED_CHERRY_FENCE_GATE);
        STRIPPED_BLOCKS.put(ModBlocks.DARK_OAK_WOOD_FENCE_GATE, ModBlocks.STRIPPED_DARK_OAK_FENCE_GATE);
        STRIPPED_BLOCKS.put(ModBlocks.JUNGLE_WOOD_FENCE_GATE, ModBlocks.STRIPPED_JUNGLE_FENCE_GATE);
        STRIPPED_BLOCKS.put(ModBlocks.MANGROVE_WOOD_FENCE_GATE, ModBlocks.STRIPPED_MANGROVE_FENCE_GATE);
        STRIPPED_BLOCKS.put(ModBlocks.OAK_WOOD_FENCE_GATE, ModBlocks.STRIPPED_OAK_FENCE_GATE);
        STRIPPED_BLOCKS.put(ModBlocks.SPRUCE_WOOD_FENCE_GATE, ModBlocks.STRIPPED_SPRUCE_FENCE_GATE);
        STRIPPED_BLOCKS.put(ModBlocks.WARPED_HYPHAE_FENCE_GATE, ModBlocks.STRIPPED_WARPED_FENCE_GATE);
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
