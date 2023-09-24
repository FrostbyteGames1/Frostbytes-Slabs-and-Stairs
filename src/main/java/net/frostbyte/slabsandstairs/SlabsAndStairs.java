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

		StrippableBlockRegistry.register(ModBlocks.ACACIA_LOG_SLAB, ModBlocks.STRIPPED_ACACIA_SLAB);
		StrippableBlockRegistry.register(ModBlocks.ACACIA_LOG_STAIRS, ModBlocks.STRIPPED_ACACIA_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.ACACIA_WOOD_SLAB, ModBlocks.STRIPPED_ACACIA_SLAB);
		StrippableBlockRegistry.register(ModBlocks.ACACIA_WOOD_STAIRS, ModBlocks.STRIPPED_ACACIA_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.ACACIA_WOOD_BUTTON, ModBlocks.STRIPPED_ACACIA_BUTTON);
		StrippableBlockRegistry.register(ModBlocks.ACACIA_WOOD_FENCE, ModBlocks.STRIPPED_ACACIA_FENCE);
		StrippableBlockRegistry.register(ModBlocks.ACACIA_WOOD_FENCE_GATE, ModBlocks.STRIPPED_ACACIA_FENCE_GATE);
		StrippableBlockRegistry.register(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_ACACIA_PRESSURE_PLATE);

		StrippableBlockRegistry.register(ModBlocks.BIRCH_LOG_SLAB, ModBlocks.STRIPPED_BIRCH_SLAB);
		StrippableBlockRegistry.register(ModBlocks.BIRCH_LOG_STAIRS, ModBlocks.STRIPPED_BIRCH_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.BIRCH_WOOD_SLAB, ModBlocks.STRIPPED_BIRCH_SLAB);
		StrippableBlockRegistry.register(ModBlocks.BIRCH_WOOD_STAIRS, ModBlocks.STRIPPED_BIRCH_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.BIRCH_WOOD_BUTTON, ModBlocks.STRIPPED_BIRCH_BUTTON);
		StrippableBlockRegistry.register(ModBlocks.BIRCH_WOOD_FENCE, ModBlocks.STRIPPED_BIRCH_FENCE);
		StrippableBlockRegistry.register(ModBlocks.BIRCH_WOOD_FENCE_GATE, ModBlocks.STRIPPED_BIRCH_FENCE_GATE);
		StrippableBlockRegistry.register(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_BIRCH_PRESSURE_PLATE);

		StrippableBlockRegistry.register(ModBlocks.CRIMSON_STEM_SLAB, ModBlocks.STRIPPED_CRIMSON_SLAB);
		StrippableBlockRegistry.register(ModBlocks.CRIMSON_STEM_STAIRS, ModBlocks.STRIPPED_CRIMSON_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.CRIMSON_HYPHAE_SLAB, ModBlocks.STRIPPED_CRIMSON_SLAB);
		StrippableBlockRegistry.register(ModBlocks.CRIMSON_HYPHAE_STAIRS, ModBlocks.STRIPPED_CRIMSON_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.CRIMSON_HYPHAE_BUTTON, ModBlocks.STRIPPED_CRIMSON_BUTTON);
		StrippableBlockRegistry.register(ModBlocks.CRIMSON_HYPHAE_FENCE, ModBlocks.STRIPPED_CRIMSON_FENCE);
		StrippableBlockRegistry.register(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE, ModBlocks.STRIPPED_CRIMSON_FENCE_GATE);
		StrippableBlockRegistry.register(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE, ModBlocks.STRIPPED_CRIMSON_PRESSURE_PLATE);

		StrippableBlockRegistry.register(ModBlocks.CHERRY_LOG_SLAB, ModBlocks.STRIPPED_CHERRY_SLAB);
		StrippableBlockRegistry.register(ModBlocks.CHERRY_LOG_STAIRS, ModBlocks.STRIPPED_CHERRY_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.CHERRY_WOOD_SLAB, ModBlocks.STRIPPED_CHERRY_SLAB);
		StrippableBlockRegistry.register(ModBlocks.CHERRY_WOOD_STAIRS, ModBlocks.STRIPPED_CHERRY_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.CHERRY_WOOD_BUTTON, ModBlocks.STRIPPED_CHERRY_BUTTON);
		StrippableBlockRegistry.register(ModBlocks.CHERRY_WOOD_FENCE, ModBlocks.STRIPPED_CHERRY_FENCE);
		StrippableBlockRegistry.register(ModBlocks.CHERRY_WOOD_FENCE_GATE, ModBlocks.STRIPPED_CHERRY_FENCE_GATE);
		StrippableBlockRegistry.register(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_CHERRY_PRESSURE_PLATE);

		StrippableBlockRegistry.register(ModBlocks.DARK_OAK_LOG_SLAB, ModBlocks.STRIPPED_DARK_OAK_SLAB);
		StrippableBlockRegistry.register(ModBlocks.DARK_OAK_LOG_STAIRS, ModBlocks.STRIPPED_DARK_OAK_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.DARK_OAK_WOOD_SLAB, ModBlocks.STRIPPED_DARK_OAK_SLAB);
		StrippableBlockRegistry.register(ModBlocks.DARK_OAK_WOOD_STAIRS, ModBlocks.STRIPPED_DARK_OAK_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.DARK_OAK_WOOD_BUTTON, ModBlocks.STRIPPED_DARK_OAK_BUTTON);
		StrippableBlockRegistry.register(ModBlocks.DARK_OAK_WOOD_FENCE, ModBlocks.STRIPPED_DARK_OAK_FENCE);
		StrippableBlockRegistry.register(ModBlocks.DARK_OAK_WOOD_FENCE_GATE, ModBlocks.STRIPPED_DARK_OAK_FENCE_GATE);
		StrippableBlockRegistry.register(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_DARK_OAK_PRESSURE_PLATE);

		StrippableBlockRegistry.register(ModBlocks.MANGROVE_LOG_SLAB, ModBlocks.STRIPPED_MANGROVE_SLAB);
		StrippableBlockRegistry.register(ModBlocks.MANGROVE_LOG_STAIRS, ModBlocks.STRIPPED_MANGROVE_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.MANGROVE_WOOD_SLAB, ModBlocks.STRIPPED_MANGROVE_SLAB);
		StrippableBlockRegistry.register(ModBlocks.MANGROVE_WOOD_STAIRS, ModBlocks.STRIPPED_MANGROVE_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.MANGROVE_WOOD_BUTTON, ModBlocks.STRIPPED_MANGROVE_BUTTON);
		StrippableBlockRegistry.register(ModBlocks.MANGROVE_WOOD_FENCE, ModBlocks.STRIPPED_MANGROVE_FENCE);
		StrippableBlockRegistry.register(ModBlocks.MANGROVE_WOOD_FENCE_GATE, ModBlocks.STRIPPED_MANGROVE_FENCE_GATE);
		StrippableBlockRegistry.register(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_MANGROVE_PRESSURE_PLATE);

		StrippableBlockRegistry.register(ModBlocks.OAK_LOG_SLAB, ModBlocks.STRIPPED_OAK_SLAB);
		StrippableBlockRegistry.register(ModBlocks.OAK_LOG_STAIRS, ModBlocks.STRIPPED_OAK_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.OAK_WOOD_SLAB, ModBlocks.STRIPPED_OAK_SLAB);
		StrippableBlockRegistry.register(ModBlocks.OAK_WOOD_STAIRS, ModBlocks.STRIPPED_OAK_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.OAK_WOOD_BUTTON, ModBlocks.STRIPPED_OAK_BUTTON);
		StrippableBlockRegistry.register(ModBlocks.OAK_WOOD_FENCE, ModBlocks.STRIPPED_OAK_FENCE);
		StrippableBlockRegistry.register(ModBlocks.OAK_WOOD_FENCE_GATE, ModBlocks.STRIPPED_OAK_FENCE_GATE);
		StrippableBlockRegistry.register(ModBlocks.OAK_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_OAK_PRESSURE_PLATE);

		StrippableBlockRegistry.register(ModBlocks.SPRUCE_LOG_SLAB, ModBlocks.STRIPPED_SPRUCE_SLAB);
		StrippableBlockRegistry.register(ModBlocks.SPRUCE_LOG_STAIRS, ModBlocks.STRIPPED_SPRUCE_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.SPRUCE_WOOD_SLAB, ModBlocks.STRIPPED_SPRUCE_SLAB);
		StrippableBlockRegistry.register(ModBlocks.SPRUCE_WOOD_STAIRS, ModBlocks.STRIPPED_SPRUCE_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.SPRUCE_WOOD_BUTTON, ModBlocks.STRIPPED_SPRUCE_BUTTON);
		StrippableBlockRegistry.register(ModBlocks.SPRUCE_WOOD_FENCE, ModBlocks.STRIPPED_SPRUCE_FENCE);
		StrippableBlockRegistry.register(ModBlocks.SPRUCE_WOOD_FENCE_GATE, ModBlocks.STRIPPED_SPRUCE_FENCE_GATE);
		StrippableBlockRegistry.register(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_SPRUCE_PRESSURE_PLATE);

		StrippableBlockRegistry.register(ModBlocks.WARPED_STEM_SLAB, ModBlocks.STRIPPED_WARPED_SLAB);
		StrippableBlockRegistry.register(ModBlocks.WARPED_STEM_STAIRS, ModBlocks.STRIPPED_WARPED_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.WARPED_HYPHAE_SLAB, ModBlocks.STRIPPED_WARPED_SLAB);
		StrippableBlockRegistry.register(ModBlocks.WARPED_HYPHAE_STAIRS, ModBlocks.STRIPPED_WARPED_STAIRS);
		StrippableBlockRegistry.register(ModBlocks.WARPED_HYPHAE_BUTTON, ModBlocks.STRIPPED_WARPED_BUTTON);
		StrippableBlockRegistry.register(ModBlocks.WARPED_HYPHAE_FENCE, ModBlocks.STRIPPED_WARPED_FENCE);
		StrippableBlockRegistry.register(ModBlocks.WARPED_HYPHAE_FENCE_GATE, ModBlocks.STRIPPED_WARPED_FENCE_GATE);
		StrippableBlockRegistry.register(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE, ModBlocks.STRIPPED_WARPED_PRESSURE_PLATE);

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
