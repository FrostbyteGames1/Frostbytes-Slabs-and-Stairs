package net.frostbyte.slabsandstairs.block.custom.ice;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.Nullable;

public class IceWallBlock extends WallBlock {

    public IceWallBlock(final BlockBehaviour.Properties properties) {
        super(properties);
    }

    public static BlockState meltsInto() {
        return Blocks.WATER.defaultBlockState();
    }

    @SuppressWarnings({"NullableProblems", "deprecation"})
    public void playerDestroy(final Level level, final Player player, final BlockPos pos, final BlockState state, final @Nullable BlockEntity blockEntity, final ItemStack destroyedWith) {
        super.playerDestroy(level, player, pos, state, blockEntity, destroyedWith);
        if (!EnchantmentHelper.hasTag(destroyedWith, EnchantmentTags.PREVENTS_ICE_MELTING)) {
            if (level.environmentAttributes().getValue(EnvironmentAttributes.WATER_EVAPORATES, pos)) {
                level.removeBlock(pos, false);
                return;
            }

            BlockState belowState = level.getBlockState(pos.below());
            if (belowState.blocksMotion() || belowState.liquid()) {
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

    protected void melt(final BlockState state, final Level level, final BlockPos pos) {
        if (level.environmentAttributes().getValue(EnvironmentAttributes.WATER_EVAPORATES, pos)) {
            level.removeBlock(pos, false);
        } else {
            level.setBlockAndUpdate(pos, meltsInto());
            level.neighborChanged(pos, meltsInto().getBlock(), null);
        }
    }

    @SuppressWarnings("NullableProblems")
    @Override
    protected boolean skipRendering(BlockState state, BlockState neighborState, Direction direction) {
        return IceRenderUtil.shouldSkipRendering(state, neighborState, direction) || super.skipRendering(state, neighborState, direction);
    }
}
