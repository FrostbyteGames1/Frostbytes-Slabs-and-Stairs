package net.frostbyte.slabsandstairs.block.custom;

import net.frostbyte.slabsandstairs.screen.SawmillScreenHandler;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Property;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SawmillBlock extends Block {
    private static final Text TITLE = Text.translatable("container.slabsandstairs.sawmill");
    public static final DirectionProperty FACING;
    protected static final VoxelShape SHAPE;

    public SawmillBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        } else {
            player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
            return ActionResult.CONSUME;
        }
    }

    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, playerInventory, player) -> {
            return new SawmillScreenHandler(syncId, playerInventory, ScreenHandlerContext.create(world, pos));
        }, TITLE);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate((Direction)state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation((Direction)state.get(FACING)));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    static {
        FACING = HorizontalFacingBlock.FACING;
        SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D);
    }
}
