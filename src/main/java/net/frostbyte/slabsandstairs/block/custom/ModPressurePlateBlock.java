package net.frostbyte.slabsandstairs.block.custom;

import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.PressurePlateBlock;
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

public class ModPressurePlateBlock extends PressurePlateBlock {
    private static final Map<Block, Block> STRIPPED_BLOCKS = new HashMap<>();
    public ModPressurePlateBlock(ActivationRule type, Settings settings, BlockSetType blockSetType) {
        super(type, settings, blockSetType);
        STRIPPED_BLOCKS.put(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_ACACIA_PRESSURE_PLATE);
        STRIPPED_BLOCKS.put(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_BIRCH_PRESSURE_PLATE);
        STRIPPED_BLOCKS.put(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE, ModBlocks.STRIPPED_CRIMSON_PRESSURE_PLATE);
        STRIPPED_BLOCKS.put(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_CHERRY_PRESSURE_PLATE);
        STRIPPED_BLOCKS.put(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_DARK_OAK_PRESSURE_PLATE);
        STRIPPED_BLOCKS.put(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_MANGROVE_PRESSURE_PLATE);
        STRIPPED_BLOCKS.put(ModBlocks.OAK_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_OAK_PRESSURE_PLATE);
        STRIPPED_BLOCKS.put(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_SPRUCE_PRESSURE_PLATE);
        STRIPPED_BLOCKS.put(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE, ModBlocks.STRIPPED_WARPED_PRESSURE_PLATE);
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
