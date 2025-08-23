package net.frostbyte.slabsandstairs.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.AxeItem;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;
import java.util.Optional;

@Mixin(AxeItem.class)
public abstract class AxeItemMixin {

    @Shadow
    @Final
    protected static Map<Block, Block> STRIPPED_BLOCKS;

    @Inject(method = "getStrippedState", at = @At("HEAD"), cancellable = true)
    private void getStrippedState(BlockState state, CallbackInfoReturnable<Optional<BlockState>> cir) {
        cir.setReturnValue(Optional.ofNullable(STRIPPED_BLOCKS.get(state.getBlock())).map((block) -> block.getStateWithProperties(state)));
    }

}
