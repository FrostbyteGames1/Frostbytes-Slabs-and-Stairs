package net.frostbyte.slabsandstairs.block.custom.layer;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

public class LeafLayerBlock extends ModLayerBlock implements SimpleWaterloggedBlock {

    public static final BooleanProperty WATERLOGGED;
    public final float leafParticleChance;

    public LeafLayerBlock(float leafParticleChance, Block baseBlock, BlockBehaviour.Properties settings) {
        super(baseBlock, settings);
        this.leafParticleChance = leafParticleChance;
        this.registerDefaultState(super.defaultBlockState().setValue(WATERLOGGED, false));
    }

    protected void spawnLeafParticle(Level world, BlockPos pos, RandomSource random) {
        if (baseBlock instanceof LeavesBlock leavesBlock) {
            leavesBlock.spawnFallingLeavesParticle(world, pos, random);
        }
    }

    protected int getLightBlock(BlockState state) {
        return 1;
    }

    protected BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        if (state.getValue(WATERLOGGED)) {
            tickView.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        return state;
    }

    protected FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        super.animateTick(state, world, pos, random);
        BlockPos blockPos = pos.below();
        BlockState blockState = world.getBlockState(blockPos);
        spawnWaterParticle(world, pos, random, blockState, blockPos);
        this.spawnLeafParticle(world, pos, random, blockState, blockPos);
    }

    private static void spawnWaterParticle(Level world, BlockPos pos, RandomSource random, BlockState state, BlockPos posBelow) {
        if (world.isRainingAt(pos.above())) {
            if (random.nextInt(15) == 1) {
                if (!state.canOcclude() || !state.isFaceSturdy(world, posBelow, Direction.UP)) {
                    ParticleUtils.spawnParticleBelow(world, pos, random, ParticleTypes.DRIPPING_WATER);
                }
            }
        }
    }

    private void spawnLeafParticle(Level world, BlockPos pos, RandomSource random, BlockState state, BlockPos posBelow) {
        if (!(random.nextFloat() >= leafParticleChance)) {
            if (!isFaceFull(state.getCollisionShape(world, posBelow), Direction.UP)) {
                this.spawnLeafParticle(world, pos, random);
            }
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(WATERLOGGED);
    }

    @SuppressWarnings("DataFlowIssue")
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        FluidState fluidState = ctx.getLevel().getFluidState(ctx.getClickedPos());
        BlockState blockState = super.getStateForPlacement(ctx).setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
        if (blockState.is(this.getBaseBlock())) {
            blockState = blockState.setValue(BlockStateProperties.PERSISTENT, true);
        }
        return blockState;
    }

    static {
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }
}
