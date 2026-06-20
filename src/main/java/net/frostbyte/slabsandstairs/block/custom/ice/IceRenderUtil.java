package net.frostbyte.slabsandstairs.block.custom.ice;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.IceBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public final class IceRenderUtil {

    public static boolean shouldSkipRendering(BlockState state, BlockState neighborState, Direction direction) {
        if (!isIceBlock(state) || !isIceBlock(neighborState)) {
            return false;
        }

        VoxelShape face = getFaceShape(state, direction);
        VoxelShape neighborFace = getFaceShape(neighborState, direction.getOpposite());

        // Cull only if the neighbor completely covers this face.
        return !Shapes.joinIsNotEmpty(face, neighborFace, BooleanOp.ONLY_FIRST);
    }

    private static VoxelShape getFaceShape(BlockState state, Direction direction) {
        return state.getShape(null, null);
    }

    private static boolean isIceBlock(BlockState state) {
        return state.getBlock() instanceof IceBlock || state.getBlock() instanceof IceSlabBlock || state.getBlock() instanceof IceStairsBlock || state.getBlock() instanceof IceWallBlock;
    }
}
