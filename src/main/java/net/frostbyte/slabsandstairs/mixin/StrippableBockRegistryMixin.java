package net.frostbyte.slabsandstairs.mixin;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

@Mixin(StrippableBlockRegistry.class)
public abstract class StrippableBockRegistryMixin {

    @Inject(method = "requireNonNullAndAxisProperty", at = @At("HEAD"), cancellable = true)
    private static void requireNonNullAndAxisProperty(Block block, String name, CallbackInfo ci) {
        Objects.requireNonNull(block, name + " cannot be null");
        ci.cancel();
    }

}
