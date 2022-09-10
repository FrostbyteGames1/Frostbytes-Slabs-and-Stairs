package net.frostbyte.slabsandstairs.screen;

import net.frostbyte.slabsandstairs.SlabsAndStairs;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModScreenHandlers {
    public static ScreenHandlerType<SawmillScreenHandler> SAWMILL_SCREEN_HANDLER =
            new ScreenHandlerType<>(SawmillScreenHandler::new);

    public static void registerAllScreenHandlers() {
        Registry.register(Registry.SCREEN_HANDLER, new Identifier(SlabsAndStairs.MOD_ID, "sawmill"),
                SAWMILL_SCREEN_HANDLER);
    }
}