package net.frostbyte.slabsandstairs.block.custom.ice;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jspecify.annotations.Nullable;

public class IceSlabBlock extends SlabBlock {
    public IceSlabBlock(final BlockBehaviour.Properties properties) {
        super(properties);
    }

    public static BlockState meltsInto() {
        return Blocks.WATER.defaultBlockState();
    }

    @SuppressWarnings({"NullableProblems", "deprecation", "DuplicatedCode"})
    public void playerDestroy(final ServerLevel level, final ServerPlayer player, final BlockPos pos, final BlockState state, final @Nullable BlockEntity blockEntity, final ItemStack destroyedWith) {
        super.playerDestroy(level, player, pos, state, blockEntity, destroyedWith);
        if (!EnchantmentHelper.hasTag(destroyedWith, EnchantmentTags.PREVENTS_ICE_MELTING)) {
            if (level.environmentAttributes().getValue(EnvironmentAttributes.WATER_EVAPORATES, pos)) {
                level.removeBlock(pos, false);
                return;
            }

            BlockState belowState = level.getBlockState(pos.below());
            if (belowState.is(BlockTags.ICE_MELTS_WHEN_DESTROYED_ABOVE) || belowState.liquid()) {
                level.setBlockAndUpdate(pos, meltsInto());
            }
        }

    }

    @SuppressWarnings("NullableProblems")
    protected void randomTick(final BlockState state, final ServerLevel level, final BlockPos pos, final RandomSource random) {
        if (level.getBrightness(LightLayer.BLOCK, pos) > 11 - state.getLightDampening()) {
            this.melt(state, level, pos);
        }

    }

    @SuppressWarnings("DuplicatedCode")
    protected void melt(final BlockState state, final Level level, final BlockPos pos) {
        if (level.environmentAttributes().getValue(EnvironmentAttributes.WATER_EVAPORATES, pos)) {
            level.removeBlock(pos, false);
        } else {
            level.setBlockAndUpdate(pos, meltsInto());
            level.neighborChanged(pos, meltsInto().getBlock(), null);
            level.gameEvent(GameEvent.BLOCK_DESTROY, pos, GameEvent.Context.of(state));
        }
    }

    @SuppressWarnings("NullableProblems")
    @Override
    protected boolean skipRendering(BlockState state, BlockState neighborState, Direction direction) {
        return IceRenderUtil.shouldSkipRendering(state, neighborState, direction) || super.skipRendering(state, neighborState, direction);
    }
}
