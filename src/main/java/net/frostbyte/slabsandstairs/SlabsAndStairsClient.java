package net.frostbyte.slabsandstairs;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.frostbyte.slabsandstairs.screen.ModScreenHandlers;
import net.frostbyte.slabsandstairs.screen.SawmillScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class SlabsAndStairsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAWMILL, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandlers.SAWMILL_SCREEN_HANDLER, SawmillScreen::new);
    }
}