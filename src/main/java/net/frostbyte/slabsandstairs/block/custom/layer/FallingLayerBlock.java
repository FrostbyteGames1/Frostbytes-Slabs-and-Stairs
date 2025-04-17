package net.frostbyte.slabsandstairs.block.custom.layer;

import net.minecraft.block.*;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.item.AutomaticItemPlacementContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ColorCode;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.block.ConcretePowderBlock.shouldHarden;

public class FallingLayerBlock extends ModLayerBlock implements Falling {

    protected static ColorCode color;
    protected final Block hardenedBlock;

    public FallingLayerBlock(ColorCode color, Block baseBlock, Settings settings) {
        this(color, baseBlock, null, settings);
    }

    public FallingLayerBlock(ColorCode color, Block baseBlock, @Nullable Block hardenedBlock, Settings settings) {
        super(baseBlock, settings);
        FallingLayerBlock.color = color;
        this.hardenedBlock = hardenedBlock;
    }

    protected void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        world.scheduleBlockTick(pos, this, this.getFallDelay());
    }

    @SuppressWarnings("DataFlowIssue")
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState placementState = super.getPlacementState(ctx);
        if (placementState.getBlock() instanceof FallingLayerBlock fallingLayerBlock && fallingLayerBlock.getHardenedBlock() != null) {
            BlockView blockView = ctx.getWorld();
            BlockPos blockPos = ctx.getBlockPos();
            BlockState blockState = blockView.getBlockState(blockPos);
            if (shouldHarden(blockView, blockPos, blockState)) {
                if (this.getHardenedBlock().getDefaultState().contains(Properties.LAYERS)) {
                    return this.getHardenedBlock().getDefaultState().with(Properties.LAYERS, placementState.get(Properties.LAYERS));
                }
                return this.getHardenedBlock().getDefaultState();
            }
        }
        return placementState;
    }

    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        tickView.scheduleBlockTick(pos, this, this.getFallDelay());
        BlockState blockState = super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
        if (blockState.getBlock() instanceof FallingLayerBlock fallingLayerBlock && fallingLayerBlock.getHardenedBlock() != null && ConcretePowderBlock.hardensOnAnySide(world, pos)) {
            if (this.getHardenedBlock().getDefaultState().contains(Properties.LAYERS)) {
                return this.getHardenedBlock().getDefaultState().with(Properties.LAYERS, blockState.get(Properties.LAYERS));
            }
            return this.getHardenedBlock().getDefaultState();
        }
        return blockState;
    }

    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (canFallThrough(world.getBlockState(pos.down())) && pos.getY() >= world.getBottomY()) {
            FallingBlockEntity fallingBlockEntity = FallingBlockEntity.spawnFromBlock(world, pos, state);
            this.configureFallingBlockEntity(fallingBlockEntity);
        }
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.dropItem = false;
        entity.setDestroyedOnLanding();
    }

    protected int getFallDelay() {
        return 2;
    }

    @SuppressWarnings("deprecation")
    public static boolean canFallThrough(BlockState state) {
        return state.isAir() || state.isIn(BlockTags.FIRE) || state.isLiquid() || state.isReplaceable();
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(16) == 0) {
            BlockPos blockPos = pos.down();
            if (canFallThrough(world.getBlockState(blockPos))) {
                ParticleUtil.spawnParticle(world, pos, random, new BlockStateParticleEffect(ParticleTypes.FALLING_DUST, state));
            }
        }
    }

    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        if (this.getHardenedBlock() != null && shouldHarden(world, pos, currentStateInPos)) {
            if (this.getHardenedBlock().getDefaultState().contains(Properties.LAYERS)) {
                world.setBlockState(pos, this.getHardenedBlock().getDefaultState().with(Properties.LAYERS, fallingBlockState.get(Properties.LAYERS)), 3);
            } else {
                world.setBlockState(pos, this.getHardenedBlock().getDefaultState(), 3);
            }
        }
    }

    @Override
    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        if (world.getBlockState(pos).getBlock() == fallingBlockEntity.getBlockState().getBlock()) {
            int groundLayers = world.getBlockState(pos).get(Properties.LAYERS);
            int fallingLayers = fallingBlockEntity.getBlockState().get(Properties.LAYERS);
            if (groundLayers + fallingLayers < MAX_LAYERS) {
                world.setBlockState(pos, fallingBlockEntity.getBlockState().with(Properties.LAYERS, groundLayers + fallingLayers));
            } else if (groundLayers + fallingLayers == MAX_LAYERS) {
                world.setBlockState(pos, this.getBaseBlock().getDefaultState());
            } else if (groundLayers + fallingLayers > MAX_LAYERS) {
                world.setBlockState(pos, this.getBaseBlock().getDefaultState());
                world.setBlockState(pos.up(), fallingBlockEntity.getBlockState().getBlock().getDefaultState().with(Properties.LAYERS, groundLayers + fallingLayers - MAX_LAYERS));
            }
        } else if (world.getBlockState(pos).canReplace(new AutomaticItemPlacementContext(world, pos, Direction.DOWN, ItemStack.EMPTY, Direction.UP)) && !FallingBlock.canFallThrough(world.getBlockState(pos.down()))) {
            world.setBlockState(pos, fallingBlockEntity.getBlockState());
        } else if (world.getServer() != null && world.getServer().getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS)) {
            dropStack(world, pos, new ItemStack(fallingBlockEntity.getBlockState().getBlock(), fallingBlockEntity.getBlockState().get(Properties.LAYERS)));
        }
    }

    public Block getHardenedBlock() {
        return this.hardenedBlock;
    }

    @SuppressWarnings("unused")
    public int getColor(BlockState state, BlockView world, BlockPos pos) {
        return color.rgba();
    }

}
