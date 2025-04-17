package net.frostbyte.slabsandstairs.block.custom.layer;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Waterloggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.EntityEffectParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;

public class LeafLayerBlock extends ModLayerBlock implements Waterloggable {

    public static final BooleanProperty WATERLOGGED;
    public final float leafParticleChance;

    public LeafLayerBlock(float leafParticleChance, Block baseBlock, AbstractBlock.Settings settings) {
        super(baseBlock, settings);
        this.leafParticleChance = leafParticleChance;
        this.setDefaultState(super.getDefaultState().with(WATERLOGGED, false));
    }

    protected void spawnLeafParticle(World world, BlockPos pos, Random random) {
        EntityEffectParticleEffect entityEffectParticleEffect = EntityEffectParticleEffect.create(ParticleTypes.TINTED_LEAVES, world.getBlockColor(pos));
        ParticleUtil.spawnParticle(world, pos, random, entityEffectParticleEffect);
    }

    protected int getOpacity(BlockState state) {
        return 1;
    }

    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        if (state.get(WATERLOGGED)) {
            tickView.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return state;
    }

    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        spawnWaterParticle(world, pos, random, blockState, blockPos);
        this.spawnLeafParticle(world, pos, random, blockState, blockPos);
    }

    private static void spawnWaterParticle(World world, BlockPos pos, Random random, BlockState state, BlockPos posBelow) {
        if (world.hasRain(pos.up())) {
            if (random.nextInt(15) == 1) {
                if (!state.isOpaque() || !state.isSideSolidFullSquare(world, posBelow, Direction.UP)) {
                    ParticleUtil.spawnParticle(world, pos, random, ParticleTypes.DRIPPING_WATER);
                }
            }
        }
    }

    private void spawnLeafParticle(World world, BlockPos pos, Random random, BlockState state, BlockPos posBelow) {
        if (!(random.nextFloat() >= leafParticleChance)) {
            if (!isFaceFullSquare(state.getCollisionShape(world, posBelow), Direction.UP)) {
                this.spawnLeafParticle(world, pos, random);
            }
        }
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(WATERLOGGED);
    }

    @SuppressWarnings("DataFlowIssue")
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        BlockState blockState = super.getPlacementState(ctx).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
        if (blockState.isOf(this.getBaseBlock())) {
            blockState = blockState.with(Properties.PERSISTENT, true);
        }
        return blockState;
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
    }
}
