package net.frostbyte.slabsandstairs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.frostbyte.slabsandstairs.item.ModItemGroup;
import net.frostbyte.slabsandstairs.recipe.ModRecipes;
import net.frostbyte.slabsandstairs.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlabsAndStairs implements ModInitializer {

	public static final String MOD_ID = "slabsandstairs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroup.registerModItemGroup();
		ModScreenHandlers.registerAllScreenHandlers();
		ModRecipes.register();

		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_BUTTON, ModBlocks.WAXED_COPPER_BUTTON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_BUTTON, ModBlocks.EXPOSED_COPPER_BUTTON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_BUTTON, ModBlocks.WAXED_EXPOSED_COPPER_BUTTON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_BUTTON, ModBlocks.WEATHERED_COPPER_BUTTON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_BUTTON, ModBlocks.WAXED_WEATHERED_COPPER_BUTTON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_BUTTON, ModBlocks.OXIDIZED_COPPER_BUTTON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_BUTTON, ModBlocks.WAXED_OXIDIZED_COPPER_BUTTON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_PRESSURE_PLATE, ModBlocks.WAXED_COPPER_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_PRESSURE_PLATE, ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE, ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE, ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);

		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_WALL, ModBlocks.WAXED_COPPER_WALL);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_WALL, ModBlocks.EXPOSED_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_WALL, ModBlocks.WAXED_EXPOSED_COPPER_WALL);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_WALL, ModBlocks.WEATHERED_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_WALL, ModBlocks.WAXED_WEATHERED_COPPER_WALL);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_WALL, ModBlocks.OXIDIZED_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_WALL, ModBlocks.WAXED_OXIDIZED_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_COPPER_WALL, ModBlocks.WAXED_CUT_COPPER_WALL);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CUT_COPPER_WALL, ModBlocks.EXPOSED_CUT_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_WALL, ModBlocks.WAXED_EXPOSED_CUT_COPPER_WALL);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CUT_COPPER_WALL, ModBlocks.WEATHERED_CUT_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_WALL, ModBlocks.WAXED_WEATHERED_CUT_COPPER_WALL);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CUT_COPPER_WALL, ModBlocks.OXIDIZED_CUT_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_CUT_COPPER_WALL, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL);

		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_SLAB, ModBlocks.WAXED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_SLAB, ModBlocks.EXPOSED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_SLAB, ModBlocks.WEATHERED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_SLAB, ModBlocks.OXIDIZED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_COPPER_SLAB);

		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_STAIRS, ModBlocks.WAXED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_STAIRS, ModBlocks.EXPOSED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_STAIRS, ModBlocks.WEATHERED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_STAIRS, ModBlocks.OXIDIZED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
	}

}
