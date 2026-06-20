package net.frostbyte.slabsandstairs.block.custom.layer;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class ModLayerBlock extends Block {
    public static final MapCodec<ModLayerBlock> CODEC = RecordCodecBuilder.mapCodec((instance) ->
            instance.group(BuiltInRegistries.BLOCK.byNameCodec().fieldOf("turns_into").forGetter(ModLayerBlock::getBaseBlock), propertiesCodec())
                    .apply(instance, ModLayerBlock::new)
    );
    public static final int MAX_LAYERS = 8;
    public static final IntegerProperty LAYERS;
    private static final VoxelShape[] SHAPES_BY_LAYERS;
    public static final int field_31248 = 5;
    protected final Block baseBlock;

    public MapCodec<ModLayerBlock> codec() {
        return CODEC;
    }

    public ModLayerBlock(Block baseBlock, BlockBehaviour.Properties settings) {
        super(settings);
        this.baseBlock = baseBlock;
        this.registerDefaultState(this.stateDefinition.any().setValue(LAYERS, 1));
    }

    protected boolean isPathfindable(BlockState state, PathComputationType type) {
        if (type == PathComputationType.LAND) {
            return state.getValue(LAYERS) < field_31248;
        } else {
            return false;
        }
    }

    protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPES_BY_LAYERS[state.getValue(LAYERS)];
    }

    protected VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPES_BY_LAYERS[state.getValue(LAYERS) - 1];
    }

    protected VoxelShape getBlockSupportShape(BlockState state, BlockGetter world, BlockPos pos) {
        return SHAPES_BY_LAYERS[state.getValue(LAYERS)];
    }

    protected VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPES_BY_LAYERS[state.getValue(LAYERS)];
    }

    protected boolean useShapeForLightOcclusion(BlockState state) {
        return true;
    }

    protected float getShadeBrightness(BlockState state, BlockGetter world, BlockPos pos) {
        return state.getValue(LAYERS) == MAX_LAYERS ? 0.2F : 1.0F;
    }

    protected boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        return true;
    }

    protected BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        return !state.canSurvive(world, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
        int i = state.getValue(LAYERS);
        if (context.getItemInHand().is(this.asItem()) && i < MAX_LAYERS) {
            if (context.replacingClickedOnBlock()) {
                return context.getClickedFace() == Direction.UP;
            } else {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        BlockState blockState = ctx.getLevel().getBlockState(ctx.getClickedPos());
        if (blockState.is(this)) {
            int i = blockState.getValue(LAYERS);
            if (Math.min(8, i + 1) < 8) {
                return blockState.setValue(LAYERS, Math.min(8, i + 1));
            }
            return this.getBaseBlock().defaultBlockState();
        } else {
            return this.defaultBlockState();
        }
    }

    public Block getBaseBlock() {
        return this.baseBlock;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LAYERS);
    }

    static {
        LAYERS = BlockStateProperties.LAYERS;
        SHAPES_BY_LAYERS = Block.boxes(MAX_LAYERS, (layers) -> Block.column(16.0, 0.0, layers * 2));
    }
}
