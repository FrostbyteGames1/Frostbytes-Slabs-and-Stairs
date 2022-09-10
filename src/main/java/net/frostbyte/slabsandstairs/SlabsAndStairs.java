package net.frostbyte.slabsandstairs;

import net.fabricmc.api.ModInitializer;
import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.frostbyte.slabsandstairs.item.ModItems;
import net.frostbyte.slabsandstairs.recipe.ModRecipes;
import net.frostbyte.slabsandstairs.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlabsAndStairs implements ModInitializer {

	public static final String MOD_ID = "slabsandstairs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModScreenHandlers.registerAllScreenHandlers();
		ModRecipes.register();
	}

}
