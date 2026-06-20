package net.frostbyte.slabsandstairs.block.custom.layer;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ColorRGBA;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.DirectionalPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ConcretePowderBlock;
import net.minecraft.world.level.block.Fallable;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.gamerules.GameRules;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.world.level.block.ConcretePowderBlock.shouldSolidify;

public class FallingLayerBlock extends ModLayerBlock implements Fallable {

    protected static ColorRGBA color;
    protected final Block hardenedBlock;

    public FallingLayerBlock(ColorRGBA color, Block baseBlock, Properties settings) {
        this(color, baseBlock, null, settings);
    }

    public FallingLayerBlock(ColorRGBA color, Block baseBlock, @Nullable Block hardenedBlock, Properties settings) {
        super(baseBlock, settings);
        FallingLayerBlock.color = color;
        this.hardenedBlock = hardenedBlock;
    }

    protected void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean notify) {
        world.scheduleTick(pos, this, this.getFallDelay());
    }

    @SuppressWarnings("DataFlowIssue")
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        BlockState placementState = super.getStateForPlacement(ctx);
        if (placementState.getBlock() instanceof FallingLayerBlock fallingLayerBlock && fallingLayerBlock.getHardenedBlock() != null) {
            BlockGetter blockView = ctx.getLevel();
            BlockPos blockPos = ctx.getClickedPos();
            BlockState blockState = blockView.getBlockState(blockPos);
            if (shouldSolidify(blockView, blockPos, blockState)) {
                if (this.getHardenedBlock().defaultBlockState().hasProperty(BlockStateProperties.LAYERS)) {
                    return this.getHardenedBlock().defaultBlockState().setValue(BlockStateProperties.LAYERS, placementState.getValue(BlockStateProperties.LAYERS));
                }
                return this.getHardenedBlock().defaultBlockState();
            }
        }
        return placementState;
    }

    protected BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        tickView.scheduleTick(pos, this, this.getFallDelay());
        BlockState blockState = super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
        if (blockState.getBlock() instanceof FallingLayerBlock fallingLayerBlock && fallingLayerBlock.getHardenedBlock() != null && ConcretePowderBlock.touchesLiquid(world, pos)) {
            if (this.getHardenedBlock().defaultBlockState().hasProperty(BlockStateProperties.LAYERS)) {
                return this.getHardenedBlock().defaultBlockState().setValue(BlockStateProperties.LAYERS, blockState.getValue(BlockStateProperties.LAYERS));
            }
            return this.getHardenedBlock().defaultBlockState();
        }
        return blockState;
    }

    protected void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (canFallThrough(world.getBlockState(pos.below())) && pos.getY() >= world.getMinY()) {
            FallingBlockEntity fallingBlockEntity = FallingBlockEntity.fall(world, pos, state);
            this.configureFallingBlockEntity(fallingBlockEntity);
        }
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.dropItem = false;
        entity.disableDrop();
    }

    protected int getFallDelay() {
        return 2;
    }

    @SuppressWarnings("deprecation")
    public static boolean canFallThrough(BlockState state) {
        return state.isAir() || state.is(BlockTags.FIRE) || state.liquid() || state.canBeReplaced();
    }

    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        if (random.nextInt(16) == 0) {
            BlockPos blockPos = pos.below();
            if (canFallThrough(world.getBlockState(blockPos))) {
                ParticleUtils.spawnParticleBelow(world, pos, random, new BlockParticleOption(ParticleTypes.FALLING_DUST, state));
            }
        }
    }

    public void onLand(Level world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        if (this.getHardenedBlock() != null && shouldSolidify(world, pos, currentStateInPos)) {
            if (this.getHardenedBlock().defaultBlockState().hasProperty(BlockStateProperties.LAYERS)) {
                world.setBlock(pos, this.getHardenedBlock().defaultBlockState().setValue(BlockStateProperties.LAYERS, fallingBlockState.getValue(BlockStateProperties.LAYERS)), 3);
            } else {
                world.setBlock(pos, this.getHardenedBlock().defaultBlockState(), 3);
            }
        }
    }

    @Override
    public void onBrokenAfterFall(Level world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        if (world.getBlockState(pos).getBlock() == fallingBlockEntity.getBlockState().getBlock()) {
            int groundLayers = world.getBlockState(pos).getValue(BlockStateProperties.LAYERS);
            int fallingLayers = fallingBlockEntity.getBlockState().getValue(BlockStateProperties.LAYERS);
            if (groundLayers + fallingLayers < MAX_LAYERS) {
                world.setBlockAndUpdate(pos, fallingBlockEntity.getBlockState().setValue(BlockStateProperties.LAYERS, groundLayers + fallingLayers));
            } else if (groundLayers + fallingLayers == MAX_LAYERS) {
                world.setBlockAndUpdate(pos, this.getBaseBlock().defaultBlockState());
            } else if (groundLayers + fallingLayers > MAX_LAYERS) {
                world.setBlockAndUpdate(pos, this.getBaseBlock().defaultBlockState());
                world.setBlockAndUpdate(pos.above(), fallingBlockEntity.getBlockState().getBlock().defaultBlockState().setValue(BlockStateProperties.LAYERS, groundLayers + fallingLayers - MAX_LAYERS));
            }
        } else if (world.getBlockState(pos).canBeReplaced(new DirectionalPlaceContext(world, pos, Direction.DOWN, ItemStack.EMPTY, Direction.UP)) && !FallingBlock.isFree(world.getBlockState(pos.below()))) {
            world.setBlockAndUpdate(pos, fallingBlockEntity.getBlockState());
        } else if (world.getServer() != null && world.getServer().getGameRules().get(GameRules.ENTITY_DROPS)) {
            popResource(world, pos, new ItemStack(fallingBlockEntity.getBlockState().getBlock(), fallingBlockEntity.getBlockState().getValue(BlockStateProperties.LAYERS)));
        }
    }

    public Block getHardenedBlock() {
        return this.hardenedBlock;
    }

    @SuppressWarnings("unused")
    public int getColor(BlockState state, BlockGetter world, BlockPos pos) {
        return color.rgba();
    }

}
