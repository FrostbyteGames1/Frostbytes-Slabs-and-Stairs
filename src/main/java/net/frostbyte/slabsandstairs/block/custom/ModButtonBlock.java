package net.frostbyte.slabsandstairs.block.custom;

import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ButtonBlock;
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

public class ModButtonBlock extends ButtonBlock {

    private static final Map<Block, Block> STRIPPED_BLOCKS = new HashMap<>();

    public ModButtonBlock(Settings settings, BlockSetType blockSetType, int pressTicks) {
        super(blockSetType, pressTicks, settings);
        STRIPPED_BLOCKS.put(ModBlocks.ACACIA_WOOD_BUTTON, ModBlocks.STRIPPED_ACACIA_BUTTON);
        STRIPPED_BLOCKS.put(ModBlocks.BIRCH_WOOD_BUTTON, ModBlocks.STRIPPED_BIRCH_BUTTON);
        STRIPPED_BLOCKS.put(ModBlocks.CRIMSON_HYPHAE_BUTTON, ModBlocks.STRIPPED_CRIMSON_BUTTON);
        STRIPPED_BLOCKS.put(ModBlocks.CHERRY_WOOD_BUTTON, ModBlocks.STRIPPED_CHERRY_BUTTON);
        STRIPPED_BLOCKS.put(ModBlocks.DARK_OAK_WOOD_BUTTON, ModBlocks.STRIPPED_DARK_OAK_BUTTON);
        STRIPPED_BLOCKS.put(ModBlocks.JUNGLE_WOOD_BUTTON, ModBlocks.STRIPPED_JUNGLE_BUTTON);
        STRIPPED_BLOCKS.put(ModBlocks.MANGROVE_WOOD_BUTTON, ModBlocks.STRIPPED_MANGROVE_BUTTON);
        STRIPPED_BLOCKS.put(ModBlocks.OAK_WOOD_BUTTON, ModBlocks.STRIPPED_OAK_BUTTON);
        STRIPPED_BLOCKS.put(ModBlocks.SPRUCE_WOOD_BUTTON, ModBlocks.STRIPPED_SPRUCE_BUTTON);
        STRIPPED_BLOCKS.put(ModBlocks.WARPED_HYPHAE_BUTTON, ModBlocks.STRIPPED_WARPED_BUTTON);
        STRIPPED_BLOCKS.put(ModBlocks.PALE_OAK_WOOD_BUTTON, ModBlocks.STRIPPED_PALE_OAK_BUTTON);
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
                return ActionResult.SUCCESS;
            } else if (state.isOf(ModBlocks.PALE_OAK_WOOD_BUTTON)) {
                world.setBlockState(pos, ModBlocks.STRIPPED_PALE_OAK_BUTTON.getStateWithProperties(state));
                world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, this.getStateWithProperties(state)));
                if (player.getMainHandStack().getItem() instanceof AxeItem) {
                    player.getMainHandStack().damage(1, player, EquipmentSlot.MAINHAND);
                } else {
                    player.getOffHandStack().damage(1, player, EquipmentSlot.OFFHAND);
                }
                return ActionResult.SUCCESS;
            }
        }
        return super.onUse(state, world, pos, player, hit);
    }
}
