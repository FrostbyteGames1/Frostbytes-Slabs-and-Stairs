package net.frostbyte.slabsandstairs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.BlockTransformerHelper;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.frostbyte.slabsandstairs.block.ModBlocks;
import net.frostbyte.slabsandstairs.item.ModItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlabsAndStairs implements ModInitializer {

	public static final String MOD_ID = "slabsandstairs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroup.registerModItemGroup();

		// region Strippable Blocks

		BlockTransformerHelper.registerStripping(ModBlocks.ACACIA_WOOD_BUTTON, ModBlocks.STRIPPED_ACACIA_BUTTON);
		BlockTransformerHelper.registerStripping(ModBlocks.BIRCH_WOOD_BUTTON, ModBlocks.STRIPPED_BIRCH_BUTTON);
		BlockTransformerHelper.registerStripping(ModBlocks.CRIMSON_HYPHAE_BUTTON, ModBlocks.STRIPPED_CRIMSON_BUTTON);
		BlockTransformerHelper.registerStripping(ModBlocks.CHERRY_WOOD_BUTTON, ModBlocks.STRIPPED_CHERRY_BUTTON);
		BlockTransformerHelper.registerStripping(ModBlocks.DARK_OAK_WOOD_BUTTON, ModBlocks.STRIPPED_DARK_OAK_BUTTON);
		BlockTransformerHelper.registerStripping(ModBlocks.JUNGLE_WOOD_BUTTON, ModBlocks.STRIPPED_JUNGLE_BUTTON);
		BlockTransformerHelper.registerStripping(ModBlocks.MANGROVE_WOOD_BUTTON, ModBlocks.STRIPPED_MANGROVE_BUTTON);
		BlockTransformerHelper.registerStripping(ModBlocks.OAK_WOOD_BUTTON, ModBlocks.STRIPPED_OAK_BUTTON);
		BlockTransformerHelper.registerStripping(ModBlocks.SPRUCE_WOOD_BUTTON, ModBlocks.STRIPPED_SPRUCE_BUTTON);
		BlockTransformerHelper.registerStripping(ModBlocks.WARPED_HYPHAE_BUTTON, ModBlocks.STRIPPED_WARPED_BUTTON);
		BlockTransformerHelper.registerStripping(ModBlocks.PALE_OAK_WOOD_BUTTON, ModBlocks.STRIPPED_PALE_OAK_BUTTON);
		BlockTransformerHelper.registerStripping(ModBlocks.POPLAR_WOOD_BUTTON, ModBlocks.STRIPPED_POPLAR_BUTTON);

		BlockTransformerHelper.registerStripping(ModBlocks.ACACIA_WOOD_FENCE, ModBlocks.STRIPPED_ACACIA_FENCE);
		BlockTransformerHelper.registerStripping(ModBlocks.BIRCH_WOOD_FENCE, ModBlocks.STRIPPED_BIRCH_FENCE);
		BlockTransformerHelper.registerStripping(ModBlocks.CRIMSON_HYPHAE_FENCE, ModBlocks.STRIPPED_CRIMSON_FENCE);
		BlockTransformerHelper.registerStripping(ModBlocks.CHERRY_WOOD_FENCE, ModBlocks.STRIPPED_CHERRY_FENCE);
		BlockTransformerHelper.registerStripping(ModBlocks.DARK_OAK_WOOD_FENCE, ModBlocks.STRIPPED_DARK_OAK_FENCE);
		BlockTransformerHelper.registerStripping(ModBlocks.JUNGLE_WOOD_FENCE, ModBlocks.STRIPPED_JUNGLE_FENCE);
		BlockTransformerHelper.registerStripping(ModBlocks.MANGROVE_WOOD_FENCE, ModBlocks.STRIPPED_MANGROVE_FENCE);
		BlockTransformerHelper.registerStripping(ModBlocks.OAK_WOOD_FENCE, ModBlocks.STRIPPED_OAK_FENCE);
		BlockTransformerHelper.registerStripping(ModBlocks.SPRUCE_WOOD_FENCE, ModBlocks.STRIPPED_SPRUCE_FENCE);
		BlockTransformerHelper.registerStripping(ModBlocks.WARPED_HYPHAE_FENCE, ModBlocks.STRIPPED_WARPED_FENCE);
		BlockTransformerHelper.registerStripping(ModBlocks.PALE_OAK_WOOD_FENCE, ModBlocks.STRIPPED_PALE_OAK_FENCE);
		BlockTransformerHelper.registerStripping(ModBlocks.POPLAR_WOOD_FENCE, ModBlocks.STRIPPED_POPLAR_FENCE);

		BlockTransformerHelper.registerStripping(ModBlocks.ACACIA_WOOD_FENCE_GATE, ModBlocks.STRIPPED_ACACIA_FENCE_GATE);
		BlockTransformerHelper.registerStripping(ModBlocks.BIRCH_WOOD_FENCE_GATE, ModBlocks.STRIPPED_BIRCH_FENCE_GATE);
		BlockTransformerHelper.registerStripping(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE, ModBlocks.STRIPPED_CRIMSON_FENCE_GATE);
		BlockTransformerHelper.registerStripping(ModBlocks.CHERRY_WOOD_FENCE_GATE, ModBlocks.STRIPPED_CHERRY_FENCE_GATE);
		BlockTransformerHelper.registerStripping(ModBlocks.DARK_OAK_WOOD_FENCE_GATE, ModBlocks.STRIPPED_DARK_OAK_FENCE_GATE);
		BlockTransformerHelper.registerStripping(ModBlocks.JUNGLE_WOOD_FENCE_GATE, ModBlocks.STRIPPED_JUNGLE_FENCE_GATE);
		BlockTransformerHelper.registerStripping(ModBlocks.MANGROVE_WOOD_FENCE_GATE, ModBlocks.STRIPPED_MANGROVE_FENCE_GATE);
		BlockTransformerHelper.registerStripping(ModBlocks.OAK_WOOD_FENCE_GATE, ModBlocks.STRIPPED_OAK_FENCE_GATE);
		BlockTransformerHelper.registerStripping(ModBlocks.SPRUCE_WOOD_FENCE_GATE, ModBlocks.STRIPPED_SPRUCE_FENCE_GATE);
		BlockTransformerHelper.registerStripping(ModBlocks.WARPED_HYPHAE_FENCE_GATE, ModBlocks.STRIPPED_WARPED_FENCE_GATE);
		BlockTransformerHelper.registerStripping(ModBlocks.PALE_OAK_WOOD_FENCE_GATE, ModBlocks.STRIPPED_PALE_OAK_FENCE_GATE);
		BlockTransformerHelper.registerStripping(ModBlocks.POPLAR_WOOD_FENCE_GATE, ModBlocks.STRIPPED_POPLAR_FENCE_GATE);

		BlockTransformerHelper.registerStripping(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_ACACIA_PRESSURE_PLATE);
		BlockTransformerHelper.registerStripping(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_BIRCH_PRESSURE_PLATE);
		BlockTransformerHelper.registerStripping(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE, ModBlocks.STRIPPED_CRIMSON_PRESSURE_PLATE);
		BlockTransformerHelper.registerStripping(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_CHERRY_PRESSURE_PLATE);
		BlockTransformerHelper.registerStripping(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_DARK_OAK_PRESSURE_PLATE);
		BlockTransformerHelper.registerStripping(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_JUNGLE_PRESSURE_PLATE);
		BlockTransformerHelper.registerStripping(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_MANGROVE_PRESSURE_PLATE);
		BlockTransformerHelper.registerStripping(ModBlocks.OAK_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_OAK_PRESSURE_PLATE);
		BlockTransformerHelper.registerStripping(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_SPRUCE_PRESSURE_PLATE);
		BlockTransformerHelper.registerStripping(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE, ModBlocks.STRIPPED_WARPED_PRESSURE_PLATE);
		BlockTransformerHelper.registerStripping(ModBlocks.PALE_OAK_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_PALE_OAK_PRESSURE_PLATE);
		BlockTransformerHelper.registerStripping(ModBlocks.POPLAR_WOOD_PRESSURE_PLATE, ModBlocks.STRIPPED_POPLAR_PRESSURE_PLATE);

		BlockTransformerHelper.registerStripping(ModBlocks.ACACIA_WOOD_SLAB, ModBlocks.STRIPPED_ACACIA_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.BIRCH_WOOD_SLAB, ModBlocks.STRIPPED_BIRCH_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.CRIMSON_HYPHAE_SLAB, ModBlocks.STRIPPED_CRIMSON_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.CHERRY_WOOD_SLAB, ModBlocks.STRIPPED_CHERRY_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.DARK_OAK_WOOD_SLAB, ModBlocks.STRIPPED_DARK_OAK_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.JUNGLE_WOOD_SLAB, ModBlocks.STRIPPED_JUNGLE_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.MANGROVE_WOOD_SLAB, ModBlocks.STRIPPED_MANGROVE_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.OAK_WOOD_SLAB, ModBlocks.STRIPPED_OAK_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.SPRUCE_WOOD_SLAB, ModBlocks.STRIPPED_SPRUCE_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.WARPED_HYPHAE_SLAB, ModBlocks.STRIPPED_WARPED_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.PALE_OAK_WOOD_SLAB, ModBlocks.STRIPPED_PALE_OAK_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.POPLAR_WOOD_SLAB, ModBlocks.STRIPPED_POPLAR_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.ACACIA_LOG_SLAB, ModBlocks.STRIPPED_ACACIA_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.BIRCH_LOG_SLAB, ModBlocks.STRIPPED_BIRCH_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.CRIMSON_STEM_SLAB, ModBlocks.STRIPPED_CRIMSON_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.CHERRY_LOG_SLAB, ModBlocks.STRIPPED_CHERRY_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.DARK_OAK_LOG_SLAB, ModBlocks.STRIPPED_DARK_OAK_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.JUNGLE_LOG_SLAB, ModBlocks.STRIPPED_JUNGLE_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.MANGROVE_LOG_SLAB, ModBlocks.STRIPPED_MANGROVE_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.OAK_LOG_SLAB, ModBlocks.STRIPPED_OAK_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.SPRUCE_LOG_SLAB, ModBlocks.STRIPPED_SPRUCE_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.WARPED_STEM_SLAB, ModBlocks.STRIPPED_WARPED_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.PALE_OAK_LOG_SLAB, ModBlocks.STRIPPED_PALE_OAK_SLAB);
		BlockTransformerHelper.registerStripping(ModBlocks.POPLAR_LOG_SLAB, ModBlocks.STRIPPED_POPLAR_SLAB);

		BlockTransformerHelper.registerStripping(ModBlocks.ACACIA_LOG_STAIRS, ModBlocks.STRIPPED_ACACIA_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.ACACIA_WOOD_STAIRS, ModBlocks.STRIPPED_ACACIA_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.BIRCH_LOG_STAIRS, ModBlocks.STRIPPED_BIRCH_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.BIRCH_WOOD_STAIRS, ModBlocks.STRIPPED_BIRCH_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.CRIMSON_STEM_STAIRS, ModBlocks.STRIPPED_CRIMSON_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.CRIMSON_HYPHAE_STAIRS, ModBlocks.STRIPPED_CRIMSON_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.CHERRY_LOG_STAIRS, ModBlocks.STRIPPED_CHERRY_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.CHERRY_WOOD_STAIRS, ModBlocks.STRIPPED_CHERRY_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.DARK_OAK_LOG_STAIRS, ModBlocks.STRIPPED_DARK_OAK_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.DARK_OAK_WOOD_STAIRS, ModBlocks.STRIPPED_DARK_OAK_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.JUNGLE_WOOD_STAIRS, ModBlocks.STRIPPED_JUNGLE_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.JUNGLE_LOG_STAIRS, ModBlocks.STRIPPED_JUNGLE_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.MANGROVE_LOG_STAIRS, ModBlocks.STRIPPED_MANGROVE_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.MANGROVE_WOOD_STAIRS, ModBlocks.STRIPPED_MANGROVE_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.OAK_LOG_STAIRS, ModBlocks.STRIPPED_OAK_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.OAK_WOOD_STAIRS, ModBlocks.STRIPPED_OAK_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.SPRUCE_LOG_STAIRS, ModBlocks.STRIPPED_SPRUCE_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.SPRUCE_WOOD_STAIRS, ModBlocks.STRIPPED_SPRUCE_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.WARPED_STEM_STAIRS, ModBlocks.STRIPPED_WARPED_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.WARPED_HYPHAE_STAIRS, ModBlocks.STRIPPED_WARPED_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.PALE_OAK_LOG_STAIRS, ModBlocks.STRIPPED_PALE_OAK_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.PALE_OAK_WOOD_STAIRS, ModBlocks.STRIPPED_PALE_OAK_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.POPLAR_LOG_STAIRS, ModBlocks.STRIPPED_POPLAR_STAIRS);
		BlockTransformerHelper.registerStripping(ModBlocks.POPLAR_WOOD_STAIRS, ModBlocks.STRIPPED_POPLAR_STAIRS);

		BlockTransformerHelper.registerStripping(ModBlocks.OAK_WOOD_WALL, ModBlocks.STRIPPED_OAK_WALL);
		BlockTransformerHelper.registerStripping(ModBlocks.SPRUCE_WOOD_WALL, ModBlocks.STRIPPED_SPRUCE_WALL);
		BlockTransformerHelper.registerStripping(ModBlocks.BIRCH_WOOD_WALL, ModBlocks.STRIPPED_BIRCH_WALL);
		BlockTransformerHelper.registerStripping(ModBlocks.JUNGLE_WOOD_WALL, ModBlocks.STRIPPED_JUNGLE_WALL);
		BlockTransformerHelper.registerStripping(ModBlocks.ACACIA_WOOD_WALL, ModBlocks.STRIPPED_ACACIA_WALL);
		BlockTransformerHelper.registerStripping(ModBlocks.DARK_OAK_WOOD_WALL, ModBlocks.STRIPPED_DARK_OAK_WALL);
		BlockTransformerHelper.registerStripping(ModBlocks.MANGROVE_WOOD_WALL, ModBlocks.STRIPPED_MANGROVE_WALL);
		BlockTransformerHelper.registerStripping(ModBlocks.CHERRY_WOOD_WALL, ModBlocks.STRIPPED_CHERRY_WALL);
		BlockTransformerHelper.registerStripping(ModBlocks.BAMBOO_BLOCK_WALL, ModBlocks.STRIPPED_BAMBOO_WALL);
		BlockTransformerHelper.registerStripping(ModBlocks.WARPED_HYPHAE_WALL, ModBlocks.STRIPPED_WARPED_WALL);
		BlockTransformerHelper.registerStripping(ModBlocks.CRIMSON_HYPHAE_WALL, ModBlocks.STRIPPED_CRIMSON_WALL);
		BlockTransformerHelper.registerStripping(ModBlocks.PALE_OAK_WOOD_WALL, ModBlocks.STRIPPED_PALE_OAK_WALL);
		BlockTransformerHelper.registerStripping(ModBlocks.POPLAR_WOOD_WALL, ModBlocks.STRIPPED_POPLAR_WALL);

		// endregion

		// region Oxidizable Blocks

		OxidizableBlocksRegistry.registerWaxable(ModBlocks.COPPER_BUTTON, ModBlocks.WAXED_COPPER_BUTTON);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.COPPER_BUTTON, ModBlocks.EXPOSED_COPPER_BUTTON);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.EXPOSED_COPPER_BUTTON, ModBlocks.WAXED_EXPOSED_COPPER_BUTTON);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.EXPOSED_COPPER_BUTTON, ModBlocks.WEATHERED_COPPER_BUTTON);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.WEATHERED_COPPER_BUTTON, ModBlocks.WAXED_WEATHERED_COPPER_BUTTON);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.WEATHERED_COPPER_BUTTON, ModBlocks.OXIDIZED_COPPER_BUTTON);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.OXIDIZED_COPPER_BUTTON, ModBlocks.WAXED_OXIDIZED_COPPER_BUTTON);

		OxidizableBlocksRegistry.registerWaxable(ModBlocks.COPPER_PRESSURE_PLATE, ModBlocks.WAXED_COPPER_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.COPPER_PRESSURE_PLATE, ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.EXPOSED_COPPER_PRESSURE_PLATE, ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.WEATHERED_COPPER_PRESSURE_PLATE, ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, ModBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);

		OxidizableBlocksRegistry.registerWaxable(ModBlocks.COPPER_WALL, ModBlocks.WAXED_COPPER_WALL);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.COPPER_WALL, ModBlocks.EXPOSED_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.EXPOSED_COPPER_WALL, ModBlocks.WAXED_EXPOSED_COPPER_WALL);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.EXPOSED_COPPER_WALL, ModBlocks.WEATHERED_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.WEATHERED_COPPER_WALL, ModBlocks.WAXED_WEATHERED_COPPER_WALL);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.WEATHERED_COPPER_WALL, ModBlocks.OXIDIZED_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.OXIDIZED_COPPER_WALL, ModBlocks.WAXED_OXIDIZED_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.CUT_COPPER_WALL, ModBlocks.WAXED_CUT_COPPER_WALL);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.CUT_COPPER_WALL, ModBlocks.EXPOSED_CUT_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.EXPOSED_CUT_COPPER_WALL, ModBlocks.WAXED_EXPOSED_CUT_COPPER_WALL);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.EXPOSED_CUT_COPPER_WALL, ModBlocks.WEATHERED_CUT_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.WEATHERED_CUT_COPPER_WALL, ModBlocks.WAXED_WEATHERED_CUT_COPPER_WALL);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.WEATHERED_CUT_COPPER_WALL, ModBlocks.OXIDIZED_CUT_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.OXIDIZED_CUT_COPPER_WALL, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.CHISELED_COPPER_WALL, ModBlocks.WAXED_CHISELED_COPPER_WALL);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.CHISELED_COPPER_WALL, ModBlocks.EXPOSED_CHISELED_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.EXPOSED_CHISELED_COPPER_WALL, ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_WALL);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.EXPOSED_CHISELED_COPPER_WALL, ModBlocks.WEATHERED_CHISELED_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.WEATHERED_CHISELED_COPPER_WALL, ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_WALL);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.WEATHERED_CHISELED_COPPER_WALL, ModBlocks.OXIDIZED_CHISELED_COPPER_WALL);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.OXIDIZED_CHISELED_COPPER_WALL, ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_WALL);

		OxidizableBlocksRegistry.registerWaxable(ModBlocks.COPPER_SLAB, ModBlocks.WAXED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.COPPER_SLAB, ModBlocks.EXPOSED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.EXPOSED_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.EXPOSED_COPPER_SLAB, ModBlocks.WEATHERED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.WEATHERED_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.WEATHERED_COPPER_SLAB, ModBlocks.OXIDIZED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.OXIDIZED_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.CHISELED_COPPER_SLAB, ModBlocks.WAXED_CHISELED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.CHISELED_COPPER_SLAB, ModBlocks.EXPOSED_CHISELED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.EXPOSED_CHISELED_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.EXPOSED_CHISELED_COPPER_SLAB, ModBlocks.WEATHERED_CHISELED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.WEATHERED_CHISELED_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.WEATHERED_CHISELED_COPPER_SLAB, ModBlocks.OXIDIZED_CHISELED_COPPER_SLAB);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.OXIDIZED_CHISELED_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_SLAB);

		OxidizableBlocksRegistry.registerWaxable(ModBlocks.COPPER_STAIRS, ModBlocks.WAXED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.COPPER_STAIRS, ModBlocks.EXPOSED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.EXPOSED_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.EXPOSED_COPPER_STAIRS, ModBlocks.WEATHERED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.WEATHERED_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.WEATHERED_COPPER_STAIRS, ModBlocks.OXIDIZED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.OXIDIZED_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.CHISELED_COPPER_STAIRS, ModBlocks.WAXED_CHISELED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.CHISELED_COPPER_STAIRS, ModBlocks.EXPOSED_CHISELED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.EXPOSED_CHISELED_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_CHISELED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.EXPOSED_CHISELED_COPPER_STAIRS, ModBlocks.WEATHERED_CHISELED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.WEATHERED_CHISELED_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_CHISELED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerNextStage(ModBlocks.WEATHERED_CHISELED_COPPER_STAIRS, ModBlocks.OXIDIZED_CHISELED_COPPER_STAIRS);
		OxidizableBlocksRegistry.registerWaxable(ModBlocks.OXIDIZED_CHISELED_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER_STAIRS);

		// endregion
	}

}
