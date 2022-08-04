package net.frostbyte.slabsandstairs.block.entity;

import net.frostbyte.slabsandstairs.recipe.SawmillRecipe;
import net.frostbyte.slabsandstairs.screen.SawmillScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class SawmillBlockEntity extends BlockEntity implements NamedScreenHandlerFactory {
    public SawmillBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SAWMILL, pos, state);
    }

    @Override
    public Text getDisplayName() {
        return null;
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new SawmillScreenHandler(syncId, inv, (ScreenHandlerContext) this);
    }
}
