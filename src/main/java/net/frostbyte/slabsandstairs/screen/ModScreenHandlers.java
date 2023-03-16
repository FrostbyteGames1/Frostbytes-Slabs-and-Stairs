package net.frostbyte.slabsandstairs.screen;

import net.frostbyte.slabsandstairs.SlabsAndStairs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<SawmillScreenHandler> SAWMILL_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        Registry.register(Registries.SCREEN_HANDLER, new Identifier(SlabsAndStairs.MOD_ID, "sawmill"),
                SAWMILL_SCREEN_HANDLER);
    }
}