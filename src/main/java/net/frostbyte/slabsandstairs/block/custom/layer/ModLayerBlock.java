package net.frostbyte.slabsandstairs.block.custom.layer;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.Registries;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;
import org.jetbrains.annotations.Nullable;

public class ModLayerBlock extends Block {
    public static final MapCodec<ModLayerBlock> CODEC = RecordCodecBuilder.mapCodec((instance) ->
        instance.group(Registries.BLOCK.getCodec().fieldOf("turns_into").forGetter(ModLayerBlock::getBaseBlock), createSettingsCodec())
            .apply(instance, ModLayerBlock::new)
    );
    public static final int MAX_LAYERS = 8;
    public static final IntProperty LAYERS;
    private static final VoxelShape[] SHAPES_BY_LAYERS;
    public static final int field_31248 = 5;
    protected final Block baseBlock;

    public MapCodec<ModLayerBlock> getCodec() {
        return CODEC;
    }

    public ModLayerBlock(Block baseBlock, AbstractBlock.Settings settings) {
        super(settings);
        this.baseBlock = baseBlock;
        this.setDefaultState(this.stateManager.getDefaultState().with(LAYERS, 1));
    }

    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        if (type == NavigationType.LAND) {
            return state.get(LAYERS) < field_31248;
        } else {
            return false;
        }
    }

    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPES_BY_LAYERS[state.get(LAYERS)];
    }

    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPES_BY_LAYERS[state.get(LAYERS) - 1];
    }

    protected VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
        return SHAPES_BY_LAYERS[state.get(LAYERS)];
    }

    protected VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPES_BY_LAYERS[state.get(LAYERS)];
    }

    protected boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    protected float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return state.get(LAYERS) == MAX_LAYERS ? 0.2F : 1.0F;
    }

    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return true;
    }

    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        return !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected boolean canReplace(BlockState state, ItemPlacementContext context) {
        int i = state.get(LAYERS);
        if (context.getStack().isOf(this.asItem()) && i < MAX_LAYERS) {
            if (context.canReplaceExisting()) {
                return context.getSide() == Direction.UP;
            } else {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos());
        if (blockState.isOf(this)) {
            int i = blockState.get(LAYERS);
            if (Math.min(8, i + 1) < 8) {
                return blockState.with(LAYERS, Math.min(8, i + 1));
            }
            return this.getBaseBlock().getDefaultState();
        } else {
            return this.getDefaultState();
        }
    }

    public Block getBaseBlock() {
        return this.baseBlock;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LAYERS);
    }

    static {
        LAYERS = Properties.LAYERS;
        SHAPES_BY_LAYERS = Block.createShapeArray(MAX_LAYERS, (layers) -> Block.createColumnShape(16.0, 0.0, layers * 2));
    }
}
