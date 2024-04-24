package net.frostbyte.slabsandstairs.block;

import net.frostbyte.slabsandstairs.SlabsAndStairs;
import net.frostbyte.slabsandstairs.block.custom.*;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.*;

public class ModBlocks {
    public static final Block SAWMILL = registerBlock("sawmill",
            new SawmillBlock(OAK_PLANKS.getSettings().requiresTool().strength(3.5F)));

    // region BUTTONS:

    // region Metal

    public static final Block COPPER_BUTTON = registerBlock("copper_button",
            new OxidizableButtonBlock(
                    Oxidizable.OxidationLevel.UNAFFECTED, STONE_BUTTON.getSettings(), 10));

    public static final Block WAXED_COPPER_BUTTON = registerBlock("waxed_copper_button",
            new ButtonBlock(
                    BlockSetType.GOLD,
                    10,
                    STONE_BUTTON.getSettings()
            ));

    public static final Block EXPOSED_COPPER_BUTTON = registerBlock("exposed_copper_button",
            new OxidizableButtonBlock(
                    Oxidizable.OxidationLevel.EXPOSED, STONE_BUTTON.getSettings(), 20));

    public static final Block WAXED_EXPOSED_COPPER_BUTTON = registerBlock("waxed_exposed_copper_button",
            new ButtonBlock(
                    BlockSetType.GOLD,
                    20,
                    STONE_BUTTON.getSettings()
            ));

    public static final Block WEATHERED_COPPER_BUTTON = registerBlock("weathered_copper_button",
            new OxidizableButtonBlock(
                    Oxidizable.OxidationLevel.WEATHERED, STONE_BUTTON.getSettings(), 30));

    public static final Block WAXED_WEATHERED_COPPER_BUTTON = registerBlock("waxed_weathered_copper_button",
            new ButtonBlock(
                    BlockSetType.GOLD,
                    30,
                    STONE_BUTTON.getSettings()
            ));

    public static final Block OXIDIZED_COPPER_BUTTON = registerBlock("oxidized_copper_button",
            new OxidizableButtonBlock(
                    Oxidizable.OxidationLevel.OXIDIZED, STONE_BUTTON.getSettings(), 40));

    public static final Block WAXED_OXIDIZED_COPPER_BUTTON = registerBlock("waxed_oxidized_copper_button",
            new ButtonBlock(
                    BlockSetType.GOLD,
                    40,
                    STONE_BUTTON.getSettings()
            ));

    public static final Block IRON_BUTTON = registerBlock("iron_button",
            new ButtonBlock(
                    BlockSetType.GOLD,
                    35,
                    STONE_BUTTON.getSettings()
            ));

    public static final Block GOLD_BUTTON = registerBlock("gold_button",
            new ButtonBlock(
                    BlockSetType.GOLD,
                    15,
                    STONE_BUTTON.getSettings()
            ));

    // endregion

    // region Wood

    public static final Block OAK_WOOD_BUTTON = registerBlock("oak_wood_button",
            new ModButtonBlock(
                    OAK_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.OAK, 15));

    public static final Block SPRUCE_WOOD_BUTTON = registerBlock("spruce_wood_button",
            new ModButtonBlock(
                    SPRUCE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.SPRUCE, 15));

    public static final Block BIRCH_WOOD_BUTTON = registerBlock("birch_wood_button",
            new ModButtonBlock(
                    BIRCH_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.BIRCH, 15));

    public static final Block JUNGLE_WOOD_BUTTON = registerBlock("jungle_wood_button",
            new ModButtonBlock(
                    JUNGLE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.JUNGLE, 15));

    public static final Block ACACIA_WOOD_BUTTON = registerBlock("acacia_wood_button",
            new ModButtonBlock(
                    ACACIA_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.ACACIA, 15));

    public static final Block DARK_OAK_WOOD_BUTTON = registerBlock("dark_oak_wood_button",
            new ModButtonBlock(
                    DARK_OAK_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.DARK_OAK, 15));

    public static final Block MANGROVE_WOOD_BUTTON = registerBlock("mangrove_wood_button",
            new ModButtonBlock(
                    MANGROVE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.MANGROVE, 15));

    public static final Block CHERRY_WOOD_BUTTON = registerBlock("cherry_wood_button",
            new ModButtonBlock(
                    CHERRY_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.CHERRY, 15));

    public static final Block BAMBOO_BLOCK_BUTTON = registerBlock("bamboo_block_button",
            new ModButtonBlock(
                    BAMBOO_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.BAMBOO, 15));

    public static final Block WARPED_HYPHAE_BUTTON = registerBlock("warped_hyphae_button",
            new ModButtonBlock(
                    WARPED_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.WARPED, 15));

    public static final Block CRIMSON_HYPHAE_BUTTON = registerBlock("crimson_hyphae_button",
            new ModButtonBlock(
                    CRIMSON_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.CRIMSON, 15));

    public static final Block STRIPPED_OAK_BUTTON = registerBlock("stripped_oak_button",
            new ModButtonBlock(
                    OAK_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.OAK, 15));

    public static final Block STRIPPED_SPRUCE_BUTTON = registerBlock("stripped_spruce_button",
            new ModButtonBlock(
                    SPRUCE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.SPRUCE, 15));

    public static final Block STRIPPED_BIRCH_BUTTON = registerBlock("stripped_birch_button",
            new ModButtonBlock(
                    BIRCH_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.BIRCH, 15));

    public static final Block STRIPPED_JUNGLE_BUTTON = registerBlock("stripped_jungle_button",
            new ModButtonBlock(
                    JUNGLE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.JUNGLE, 15));

    public static final Block STRIPPED_ACACIA_BUTTON = registerBlock("stripped_acacia_button",
            new ModButtonBlock(
                    ACACIA_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.ACACIA, 15));

    public static final Block STRIPPED_DARK_OAK_BUTTON = registerBlock("stripped_dark_oak_button",
            new ModButtonBlock(
                    DARK_OAK_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.DARK_OAK, 15));

    public static final Block STRIPPED_MANGROVE_BUTTON = registerBlock("stripped_mangrove_button",
            new ModButtonBlock(
                    MANGROVE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.MANGROVE, 15));

    public static final Block STRIPPED_CHERRY_BUTTON = registerBlock("stripped_cherry_button",
            new ModButtonBlock(
                    CHERRY_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.CHERRY, 15));

    public static final Block STRIPPED_WARPED_BUTTON = registerBlock("stripped_warped_button",
            new ModButtonBlock(
                    WARPED_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.WARPED, 15));

    public static final Block STRIPPED_CRIMSON_BUTTON = registerBlock("stripped_crimson_button",
            new ModButtonBlock(
                    CRIMSON_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision(),
                    BlockSetType.CRIMSON, 15));

    // endregion

    // region Stone

    public static final Block DIORITE_BUTTON = registerBlock("diorite_button",
            new ButtonBlock(
                    BlockSetType.STONE,
                    10,
                    STONE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block ANDESITE_BUTTON = registerBlock("andesite_button",
            new ButtonBlock(
                    BlockSetType.STONE,
                    10,
                    STONE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block GRANITE_BUTTON = registerBlock("granite_button",
            new ButtonBlock(
                    BlockSetType.STONE,
                    10,
                    STONE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block SANDSTONE_BUTTON = registerBlock("sandstone_button",
            new ButtonBlock(
                    BlockSetType.STONE,
                    10,
                    STONE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block RED_SANDSTONE_BUTTON = registerBlock("red_sandstone_button",
            new ButtonBlock(
                    BlockSetType.STONE,
                    10,
                    STONE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block BASALT_BUTTON = registerBlock("basalt_button",
            new ButtonBlock(
                    BlockSetType.STONE,
                    10,
                    STONE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block BLACKSTONE_BUTTON = registerBlock("blackstone_button",
            new ButtonBlock(
                    BlockSetType.POLISHED_BLACKSTONE,
                    10,
                    POLISHED_BLACKSTONE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block CALCITE_BUTTON = registerBlock("calcite_button",
            new ButtonBlock(
                    BlockSetType.STONE,
                    10,
                    STONE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block TUFF_BUTTON = registerBlock("tuff_button",
            new ButtonBlock(
                    BlockSetType.STONE,
                    10,
                    STONE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block DEEPSLATE_BUTTON = registerBlock("deepslate_button",
            new ButtonBlock(
                    BlockSetType.STONE,
                    10,
                    STONE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block DRIPSTONE_BUTTON = registerBlock("dripstone_button",
            new ButtonBlock(
                    BlockSetType.STONE,
                    10,
                    STONE_BUTTON.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    // endregion

    // endregion

    // region PRESSURE PLATES:

    // region Metal

    public static final Block COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate",
            new OxidizablePressurePlateBlock(
                    Oxidizable.OxidationLevel.UNAFFECTED,
                    BlockSetType.GOLD,
                    OAK_PRESSURE_PLATE.getSettings())
            );
    public static final Block WAXED_COPPER_PRESSURE_PLATE = registerBlock("waxed_copper_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.GOLD,
                    LIGHT_WEIGHTED_PRESSURE_PLATE.getSettings())
            );

    public static final Block EXPOSED_COPPER_PRESSURE_PLATE = registerBlock("exposed_copper_pressure_plate",
            new OxidizablePressurePlateBlock(
                    Oxidizable.OxidationLevel.EXPOSED,
                    BlockSetType.GOLD,
                    LIGHT_WEIGHTED_PRESSURE_PLATE.getSettings())
            );

    public static final Block WAXED_EXPOSED_COPPER_PRESSURE_PLATE = registerBlock("waxed_exposed_copper_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.GOLD,
                    LIGHT_WEIGHTED_PRESSURE_PLATE.getSettings())
            );

    public static final Block WEATHERED_COPPER_PRESSURE_PLATE = registerBlock("weathered_copper_pressure_plate",
            new OxidizablePressurePlateBlock(
                    Oxidizable.OxidationLevel.WEATHERED,
                    BlockSetType.GOLD,
                    HEAVY_WEIGHTED_PRESSURE_PLATE.getSettings())
            );

    public static final Block WAXED_WEATHERED_COPPER_PRESSURE_PLATE = registerBlock("waxed_weathered_copper_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.GOLD,
                    HEAVY_WEIGHTED_PRESSURE_PLATE.getSettings())
            );

    public static final Block OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock("oxidized_copper_pressure_plate",
            new OxidizablePressurePlateBlock(
                    Oxidizable.OxidationLevel.OXIDIZED,
                    BlockSetType.GOLD,
                    HEAVY_WEIGHTED_PRESSURE_PLATE.getSettings())
            );

    public static final Block WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock("waxed_oxidized_copper_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.GOLD,
                    HEAVY_WEIGHTED_PRESSURE_PLATE.getSettings())
            );

    // endregion

    // region Wood

    public static final Block OAK_WOOD_PRESSURE_PLATE = registerBlock("oak_wood_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.OAK,
                    OAK_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block SPRUCE_WOOD_PRESSURE_PLATE = registerBlock("spruce_wood_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.SPRUCE,
                    SPRUCE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block BIRCH_WOOD_PRESSURE_PLATE = registerBlock("birch_wood_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.BIRCH,
                    BIRCH_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block JUNGLE_WOOD_PRESSURE_PLATE = registerBlock("jungle_wood_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.JUNGLE,
                    JUNGLE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block ACACIA_WOOD_PRESSURE_PLATE = registerBlock("acacia_wood_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.ACACIA,
                    ACACIA_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block DARK_OAK_WOOD_PRESSURE_PLATE = registerBlock("dark_oak_wood_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.DARK_OAK,
                    DARK_OAK_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block MANGROVE_WOOD_PRESSURE_PLATE = registerBlock("mangrove_wood_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.MANGROVE,
                    MANGROVE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block CHERRY_WOOD_PRESSURE_PLATE = registerBlock("cherry_wood_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.CHERRY,
                    CHERRY_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block BAMBOO_BLOCK_PRESSURE_PLATE = registerBlock("bamboo_block_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.BAMBOO,
                    BAMBOO_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block WARPED_HYPHAE_PRESSURE_PLATE = registerBlock("warped_hyphae_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.WARPED,
                    WARPED_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block CRIMSON_HYPHAE_PRESSURE_PLATE = registerBlock("crimson_hyphae_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.CRIMSON,
                    CRIMSON_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block STRIPPED_OAK_PRESSURE_PLATE = registerBlock("stripped_oak_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.OAK,
                    OAK_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block STRIPPED_SPRUCE_PRESSURE_PLATE = registerBlock("stripped_spruce_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.SPRUCE,
                    SPRUCE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block STRIPPED_BIRCH_PRESSURE_PLATE = registerBlock("stripped_birch_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.BIRCH,
                    BIRCH_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block STRIPPED_JUNGLE_PRESSURE_PLATE = registerBlock("stripped_jungle_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.JUNGLE,
                    JUNGLE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block STRIPPED_ACACIA_PRESSURE_PLATE = registerBlock("stripped_acacia_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.ACACIA,
                    ACACIA_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block STRIPPED_DARK_OAK_PRESSURE_PLATE = registerBlock("stripped_dark_oak_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.DARK_OAK,
                    DARK_OAK_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block STRIPPED_MANGROVE_PRESSURE_PLATE = registerBlock("stripped_mangrove_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.MANGROVE,
                    MANGROVE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block STRIPPED_CHERRY_PRESSURE_PLATE = registerBlock("stripped_cherry_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.CHERRY,
                    CHERRY_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block STRIPPED_WARPED_PRESSURE_PLATE = registerBlock("stripped_warped_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.WARPED,
                    WARPED_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block STRIPPED_CRIMSON_PRESSURE_PLATE = registerBlock("stripped_crimson_pressure_plate",
            new ModPressurePlateBlock(
                    BlockSetType.CRIMSON,
                    CRIMSON_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    // endregion

    // region Stone

    public static final Block DIORITE_PRESSURE_PLATE = registerBlock("diorite_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.STONE,
                    STONE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block ANDESITE_PRESSURE_PLATE = registerBlock("andesite_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.STONE,
                    STONE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block GRANITE_PRESSURE_PLATE = registerBlock("granite_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.STONE,
                    STONE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block SANDSTONE_PRESSURE_PLATE = registerBlock("sandstone_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.STONE,
                    STONE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block RED_SANDSTONE_PRESSURE_PLATE = registerBlock("red_sandstone_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.STONE,
                    STONE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block BASALT_PRESSURE_PLATE = registerBlock("basalt_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.STONE,
                    STONE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block BLACKSTONE_PRESSURE_PLATE = registerBlock("blackstone_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.POLISHED_BLACKSTONE,
                    STONE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block CALCITE_PRESSURE_PLATE = registerBlock("calcite_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.STONE,
                    STONE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block TUFF_PRESSURE_PLATE = registerBlock("tuff_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.STONE,
                    STONE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block DEEPSLATE_PRESSURE_PLATE = registerBlock("deepslate_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.STONE,
                    STONE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    public static final Block DRIPSTONE_PRESSURE_PLATE = registerBlock("dripstone_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.STONE,
                    STONE_PRESSURE_PLATE.getSettings().strength(0.5f).requiresTool().noCollision()
            ));

    // endregion

    // endregion

    // region FENCES:

    // region Wood

    public static final Block OAK_WOOD_FENCE = registerBlock("oak_wood_fence",
            new ModFenceBlock(OAK_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block SPRUCE_WOOD_FENCE = registerBlock("spruce_wood_fence",
            new ModFenceBlock(SPRUCE_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block BIRCH_WOOD_FENCE = registerBlock("birch_wood_fence",
            new ModFenceBlock(BIRCH_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block JUNGLE_WOOD_FENCE = registerBlock("jungle_wood_fence",
            new ModFenceBlock(JUNGLE_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block ACACIA_WOOD_FENCE = registerBlock("acacia_wood_fence",
            new ModFenceBlock(ACACIA_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block DARK_OAK_WOOD_FENCE = registerBlock("dark_oak_wood_fence",
            new ModFenceBlock(DARK_OAK_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block MANGROVE_WOOD_FENCE = registerBlock("mangrove_wood_fence",
            new ModFenceBlock(MANGROVE_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block CHERRY_WOOD_FENCE = registerBlock("cherry_wood_fence",
            new ModFenceBlock(CHERRY_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block BAMBOO_BLOCK_FENCE = registerBlock("bamboo_block_fence",
            new ModFenceBlock(BAMBOO_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block WARPED_HYPHAE_FENCE = registerBlock("warped_hyphae_fence",
            new ModFenceBlock(WARPED_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block CRIMSON_HYPHAE_FENCE = registerBlock("crimson_hyphae_fence",
            new ModFenceBlock(CRIMSON_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block STRIPPED_OAK_FENCE = registerBlock("stripped_oak_fence",
            new ModFenceBlock(OAK_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block STRIPPED_SPRUCE_FENCE = registerBlock("stripped_spruce_fence",
            new ModFenceBlock(SPRUCE_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block STRIPPED_BIRCH_FENCE = registerBlock("stripped_birch_fence",
            new ModFenceBlock(BIRCH_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block STRIPPED_JUNGLE_FENCE = registerBlock("stripped_jungle_fence",
            new ModFenceBlock(JUNGLE_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block STRIPPED_ACACIA_FENCE = registerBlock("stripped_acacia_fence",
            new ModFenceBlock(ACACIA_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block STRIPPED_DARK_OAK_FENCE = registerBlock("stripped_dark_oak_fence",
            new ModFenceBlock(DARK_OAK_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block STRIPPED_MANGROVE_FENCE = registerBlock("stripped_mangrove_fence",
            new ModFenceBlock(MANGROVE_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block STRIPPED_CHERRY_FENCE = registerBlock("stripped_cherry_fence",
            new ModFenceBlock(CHERRY_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block STRIPPED_WARPED_FENCE = registerBlock("stripped_warped_fence",
            new ModFenceBlock(WARPED_FENCE.getSettings().strength(2.0f).requiresTool()));

    public static final Block STRIPPED_CRIMSON_FENCE = registerBlock("stripped_crimson_fence",
            new ModFenceBlock(CRIMSON_FENCE.getSettings().strength(2.0f).requiresTool()));

    // endregion

    // region Stone

    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(NETHER_BRICK_FENCE.getSettings().strength(2.0f).requiresTool()));

    // endregion

    // endregion

    // region FENCE GATES:

    // region Wood

    public static final Block OAK_WOOD_FENCE_GATE = registerBlock("oak_wood_fence_gate",
            new ModFenceGateBlock(OAK_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.OAK));

    public static final Block SPRUCE_WOOD_FENCE_GATE = registerBlock("spruce_wood_fence_gate",
            new ModFenceGateBlock(SPRUCE_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.SPRUCE));

    public static final Block BIRCH_WOOD_FENCE_GATE = registerBlock("birch_wood_fence_gate",
            new ModFenceGateBlock(BIRCH_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.BIRCH));

    public static final Block JUNGLE_WOOD_FENCE_GATE = registerBlock("jungle_wood_fence_gate",
            new ModFenceGateBlock(JUNGLE_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.JUNGLE));

    public static final Block ACACIA_WOOD_FENCE_GATE = registerBlock("acacia_wood_fence_gate",
            new ModFenceGateBlock(ACACIA_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.ACACIA));

    public static final Block DARK_OAK_WOOD_FENCE_GATE = registerBlock("dark_oak_wood_fence_gate",
            new ModFenceGateBlock(DARK_OAK_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.DARK_OAK));

    public static final Block MANGROVE_WOOD_FENCE_GATE = registerBlock("mangrove_wood_fence_gate",
            new ModFenceGateBlock(MANGROVE_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.MANGROVE));

    public static final Block CHERRY_WOOD_FENCE_GATE = registerBlock("cherry_wood_fence_gate",
            new ModFenceGateBlock(CHERRY_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.CHERRY));

    public static final Block BAMBOO_BLOCK_FENCE_GATE = registerBlock("bamboo_block_fence_gate",
            new ModFenceGateBlock(BAMBOO_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.BAMBOO));

    public static final Block WARPED_HYPHAE_FENCE_GATE = registerBlock("warped_hyphae_fence_gate",
            new ModFenceGateBlock(WARPED_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.WARPED));

    public static final Block CRIMSON_HYPHAE_FENCE_GATE = registerBlock("crimson_hyphae_fence_gate",
            new ModFenceGateBlock(CRIMSON_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.CRIMSON));

    public static final Block STRIPPED_OAK_FENCE_GATE = registerBlock("stripped_oak_fence_gate",
            new ModFenceGateBlock(OAK_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.OAK));

    public static final Block STRIPPED_SPRUCE_FENCE_GATE = registerBlock("stripped_spruce_fence_gate",
            new ModFenceGateBlock(SPRUCE_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.SPRUCE));

    public static final Block STRIPPED_BIRCH_FENCE_GATE = registerBlock("stripped_birch_fence_gate",
            new ModFenceGateBlock(BIRCH_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.BIRCH));

    public static final Block STRIPPED_JUNGLE_FENCE_GATE = registerBlock("stripped_jungle_fence_gate",
            new ModFenceGateBlock(JUNGLE_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.JUNGLE));

    public static final Block STRIPPED_ACACIA_FENCE_GATE = registerBlock("stripped_acacia_fence_gate",
            new ModFenceGateBlock(ACACIA_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.ACACIA));

    public static final Block STRIPPED_DARK_OAK_FENCE_GATE = registerBlock("stripped_dark_oak_fence_gate",
            new ModFenceGateBlock(DARK_OAK_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.DARK_OAK));

    public static final Block STRIPPED_MANGROVE_FENCE_GATE = registerBlock("stripped_mangrove_fence_gate",
            new ModFenceGateBlock(MANGROVE_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.MANGROVE));

    public static final Block STRIPPED_CHERRY_FENCE_GATE = registerBlock("stripped_cherry_fence_gate",
            new ModFenceGateBlock(CHERRY_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.CHERRY));

    public static final Block STRIPPED_WARPED_FENCE_GATE = registerBlock("stripped_warped_fence_gate",
            new ModFenceGateBlock(WARPED_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.WARPED));

    public static final Block STRIPPED_CRIMSON_FENCE_GATE = registerBlock("stripped_crimson_fence_gate",
            new ModFenceGateBlock(CRIMSON_FENCE_GATE.getSettings().strength(2.0f).requiresTool(), WoodType.CRIMSON));

    // endregion

    // region Stone

    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new FenceGateBlock(WoodType.CRIMSON, NETHER_BRICKS.getSettings().strength(2.0f).requiresTool()));

    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate",
            new FenceGateBlock(WoodType.CRIMSON, RED_NETHER_BRICKS.getSettings().strength(2.0f).requiresTool()));

    // endregion

    // endregion

    // region WALLS:

    // region Metal

    public static final Block COPPER_WALL = registerBlock("copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, COPPER_BLOCK.getSettings()));

    public static final Block WAXED_COPPER_WALL = registerBlock("waxed_copper_wall",
            new WallBlock(COPPER_BLOCK.getSettings()));

    public static final Block EXPOSED_COPPER_WALL = registerBlock("exposed_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, EXPOSED_COPPER.getSettings()));

    public static final Block WAXED_EXPOSED_COPPER_WALL = registerBlock("waxed_exposed_copper_wall",
            new WallBlock(EXPOSED_COPPER.getSettings()));

    public static final Block WEATHERED_COPPER_WALL = registerBlock("weathered_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, WEATHERED_COPPER.getSettings()));

    public static final Block WAXED_WEATHERED_COPPER_WALL = registerBlock("waxed_weathered_copper_wall",
            new WallBlock(WEATHERED_COPPER.getSettings()));

    public static final Block OXIDIZED_COPPER_WALL = registerBlock("oxidized_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, OXIDIZED_COPPER.getSettings()));

    public static final Block WAXED_OXIDIZED_COPPER_WALL = registerBlock("waxed_oxidized_copper_wall",
            new WallBlock(OXIDIZED_COPPER.getSettings()));

    public static final Block CUT_COPPER_WALL = registerBlock("cut_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, CUT_COPPER.getSettings()));

    public static final Block WAXED_CUT_COPPER_WALL = registerBlock("waxed_cut_copper_wall",
            new WallBlock(CUT_COPPER.getSettings()));

    public static final Block EXPOSED_CUT_COPPER_WALL = registerBlock("exposed_cut_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, EXPOSED_CUT_COPPER.getSettings()));

    public static final Block WAXED_EXPOSED_CUT_COPPER_WALL = registerBlock("waxed_exposed_cut_copper_wall",
            new WallBlock(EXPOSED_CUT_COPPER.getSettings()));

    public static final Block WEATHERED_CUT_COPPER_WALL = registerBlock("weathered_cut_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, WEATHERED_CUT_COPPER.getSettings()));

    public static final Block WAXED_WEATHERED_CUT_COPPER_WALL = registerBlock("waxed_weathered_cut_copper_wall",
            new WallBlock(WEATHERED_CUT_COPPER.getSettings()));

    public static final Block OXIDIZED_CUT_COPPER_WALL = registerBlock("oxidized_cut_copper_wall",
            new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, OXIDIZED_CUT_COPPER.getSettings()));

    public static final Block WAXED_OXIDIZED_CUT_COPPER_WALL = registerBlock("waxed_oxidized_cut_copper_wall",
            new WallBlock(OXIDIZED_CUT_COPPER.getSettings()));

    public static final Block IRON_WALL = registerBlock("iron_wall",
            new WallBlock(IRON_BLOCK.getSettings()));

    public static final Block GOLD_WALL = registerBlock("gold_wall",
            new WallBlock(GOLD_BLOCK.getSettings()));

    // endregion

    // region Stone

    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(STONE.getSettings()));

    public static final Block CHISELED_STONE_BRICK_WALL = registerBlock("chiseled_stone_brick_wall",
            new WallBlock(CHISELED_STONE_BRICKS.getSettings()));

    public static final Block CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            new WallBlock(CRACKED_STONE_BRICKS.getSettings()));

    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(SMOOTH_STONE.getSettings()));

    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(POLISHED_DIORITE.getSettings()));

    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(POLISHED_ANDESITE.getSettings()));

    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(POLISHED_GRANITE.getSettings()));

    public static final Block CHISELED_SANDSTONE_WALL = registerBlock("chiseled_sandstone_wall",
            new WallBlock(CHISELED_SANDSTONE.getSettings()));

    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            new WallBlock(CUT_SANDSTONE.getSettings()));

    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(SMOOTH_SANDSTONE.getSettings()));

    public static final Block CHISELED_RED_SANDSTONE_WALL = registerBlock("chiseled_red_sandstone_wall",
            new WallBlock(CHISELED_RED_SANDSTONE.getSettings()));

    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            new WallBlock(CUT_RED_SANDSTONE.getSettings()));

    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(SMOOTH_RED_SANDSTONE.getSettings()));

    public static final Block BASALT_WALL = registerBlock("basalt_wall",
            new WallBlock(BASALT.getSettings()));

    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(SMOOTH_BASALT.getSettings()));

    public static final Block POLISHED_BASALT_WALL = registerBlock("polished_basalt_wall",
            new WallBlock(POLISHED_BASALT.getSettings()));

    public static final Block CHISELED_POLISHED_BLACKSTONE_WALL = registerBlock("chiseled_polished_blackstone_wall",
            new WallBlock(CHISELED_POLISHED_BLACKSTONE.getSettings()));

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            new WallBlock(CRACKED_POLISHED_BLACKSTONE_BRICKS.getSettings()));

    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(CALCITE.getSettings()));

    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(TUFF.getSettings()));

    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            new WallBlock(DEEPSLATE.getSettings()));

    public static final Block CHISELED_DEEPSLATE_WALL = registerBlock("chiseled_deepslate_wall",
            new WallBlock(CHISELED_DEEPSLATE.getSettings()));

    public static final Block CRACKED_DEEPSLATE_BRICK_WALL = registerBlock("cracked_deepslate_brick_wall",
            new WallBlock(CRACKED_DEEPSLATE_BRICKS.getSettings()));

    public static final Block CRACKED_DEEPSLATE_TILE_WALL = registerBlock("cracked_deepslate_tile_wall",
            new WallBlock(CRACKED_DEEPSLATE_TILES.getSettings()));

    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(DRIPSTONE_BLOCK.getSettings()));

    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new WallBlock(PRISMARINE_BRICKS.getSettings()));

    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new WallBlock(DARK_PRISMARINE.getSettings()));

    public static final Block CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall",
            new WallBlock(CRACKED_NETHER_BRICKS.getSettings()));

    public static final Block CHISELED_NETHER_BRICK_WALL = registerBlock("chiseled_nether_brick_wall",
            new WallBlock(CHISELED_NETHER_BRICKS.getSettings()));

    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            new WallBlock(QUARTZ_BLOCK.getSettings()));

    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(QUARTZ_BRICKS.getSettings()));

    public static final Block CHISELED_QUARTZ_WALL = registerBlock("chiseled_quartz_wall",
            new WallBlock(CHISELED_QUARTZ_BLOCK.getSettings()));

    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(SMOOTH_QUARTZ.getSettings()));

    public static final Block QUARTZ_PILLAR_WALL = registerBlock("quartz_pillar_wall",
            new WallBlock(QUARTZ_PILLAR.getSettings()));

    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(END_STONE.getSettings()));

    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            new WallBlock(PURPUR_BLOCK.getSettings()));

    public static final Block PURPUR_PILLAR_WALL = registerBlock("purpur_pillar_wall",
            new WallBlock(PURPUR_PILLAR.getSettings()));

    // endregion

    // region Concrete

    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(BLACK_CONCRETE.getSettings()));

    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(BLUE_CONCRETE.getSettings()));

    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(BROWN_CONCRETE.getSettings()));

    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(CYAN_CONCRETE.getSettings()));

    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(GRAY_CONCRETE.getSettings()));

    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(GREEN_CONCRETE.getSettings()));

    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(LIGHT_BLUE_CONCRETE.getSettings()));

    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(LIGHT_GRAY_CONCRETE.getSettings()));

    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(LIME_CONCRETE.getSettings()));

    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(MAGENTA_CONCRETE.getSettings()));

    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(ORANGE_CONCRETE.getSettings()));

    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(PINK_CONCRETE.getSettings()));

    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(PURPLE_CONCRETE.getSettings()));

    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(RED_CONCRETE.getSettings()));

    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(WHITE_CONCRETE.getSettings()));

    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(YELLOW_CONCRETE.getSettings()));

    // endregion

    // region Terracotta

    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            new WallBlock(TERRACOTTA.getSettings()));

    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            new WallBlock(BLACK_TERRACOTTA.getSettings()));

    public static final Block BLACK_GLAZED_TERRACOTTA_WALL = registerBlock("black_glazed_terracotta_wall",
            new WallBlock(BLACK_GLAZED_TERRACOTTA.getSettings()));

    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            new WallBlock(BLUE_TERRACOTTA.getSettings()));

    public static final Block BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("blue_glazed_terracotta_wall",
            new WallBlock(BLUE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            new WallBlock(BROWN_TERRACOTTA.getSettings()));

    public static final Block BROWN_GLAZED_TERRACOTTA_WALL = registerBlock("brown_glazed_terracotta_wall",
            new WallBlock(BROWN_GLAZED_TERRACOTTA.getSettings()));

    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            new WallBlock(CYAN_TERRACOTTA.getSettings()));

    public static final Block CYAN_GLAZED_TERRACOTTA_WALL = registerBlock("cyan_glazed_terracotta_wall",
            new WallBlock(CYAN_GLAZED_TERRACOTTA.getSettings()));

    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            new WallBlock(GRAY_TERRACOTTA.getSettings()));

    public static final Block GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("gray_glazed_terracotta_wall",
            new WallBlock(GRAY_GLAZED_TERRACOTTA.getSettings()));

    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            new WallBlock(GREEN_TERRACOTTA.getSettings()));

    public static final Block GREEN_GLAZED_TERRACOTTA_WALL = registerBlock("green_glazed_terracotta_wall",
            new WallBlock(GREEN_GLAZED_TERRACOTTA.getSettings()));

    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            new WallBlock(LIGHT_BLUE_TERRACOTTA.getSettings()));

    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("light_blue_glazed_terracotta_wall",
            new WallBlock(LIGHT_BLUE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            new WallBlock(LIGHT_GRAY_TERRACOTTA.getSettings()));

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("light_gray_glazed_terracotta_wall",
            new WallBlock(LIGHT_GRAY_GLAZED_TERRACOTTA.getSettings()));

    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            new WallBlock(LIME_TERRACOTTA.getSettings()));

    public static final Block LIME_GLAZED_TERRACOTTA_WALL = registerBlock("lime_glazed_terracotta_wall",
            new WallBlock(LIME_GLAZED_TERRACOTTA.getSettings()));

    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            new WallBlock(MAGENTA_TERRACOTTA.getSettings()));

    public static final Block MAGENTA_GLAZED_TERRACOTTA_WALL = registerBlock("magenta_glazed_terracotta_wall",
            new WallBlock(MAGENTA_GLAZED_TERRACOTTA.getSettings()));

    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            new WallBlock(ORANGE_TERRACOTTA.getSettings()));

    public static final Block ORANGE_GLAZED_TERRACOTTA_WALL = registerBlock("orange_glazed_terracotta_wall",
            new WallBlock(ORANGE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            new WallBlock(PINK_TERRACOTTA.getSettings()));

    public static final Block PINK_GLAZED_TERRACOTTA_WALL = registerBlock("pink_glazed_terracotta_wall",
            new WallBlock(PINK_GLAZED_TERRACOTTA.getSettings()));

    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            new WallBlock(PURPLE_TERRACOTTA.getSettings()));

    public static final Block PURPLE_GLAZED_TERRACOTTA_WALL = registerBlock("purple_glazed_terracotta_wall",
            new WallBlock(PURPLE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            new WallBlock(RED_TERRACOTTA.getSettings()));

    public static final Block RED_GLAZED_TERRACOTTA_WALL = registerBlock("red_glazed_terracotta_wall",
            new WallBlock(RED_GLAZED_TERRACOTTA.getSettings()));

    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            new WallBlock(WHITE_TERRACOTTA.getSettings()));

    public static final Block WHITE_GLAZED_TERRACOTTA_WALL = registerBlock("white_glazed_terracotta_wall",
            new WallBlock(WHITE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            new WallBlock(YELLOW_TERRACOTTA.getSettings()));

    public static final Block YELLOW_GLAZED_TERRACOTTA_WALL = registerBlock("yellow_glazed_terracotta_wall",
            new WallBlock(YELLOW_GLAZED_TERRACOTTA.getSettings()));

    // endregion

    // endregion

    // region SLABS:

    // region Metal

    public static final Block COPPER_SLAB = registerBlock("copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, COPPER_BLOCK.getSettings()));

    public static final Block WAXED_COPPER_SLAB = registerBlock("waxed_copper_slab",
            new SlabBlock(COPPER_BLOCK.getSettings()));

    public static final Block EXPOSED_COPPER_SLAB = registerBlock("exposed_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, EXPOSED_COPPER.getSettings()));

    public static final Block WAXED_EXPOSED_COPPER_SLAB = registerBlock("waxed_exposed_copper_slab",
            new SlabBlock(EXPOSED_COPPER.getSettings()));

    public static final Block WEATHERED_COPPER_SLAB = registerBlock("weathered_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, WEATHERED_COPPER.getSettings()));

    public static final Block WAXED_WEATHERED_COPPER_SLAB = registerBlock("waxed_weathered_copper_slab",
            new SlabBlock(WEATHERED_COPPER.getSettings()));

    public static final Block OXIDIZED_COPPER_SLAB = registerBlock("oxidized_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, OXIDIZED_COPPER.getSettings()));

    public static final Block WAXED_OXIDIZED_COPPER_SLAB = registerBlock("waxed_oxidized_copper_slab",
            new SlabBlock(OXIDIZED_COPPER.getSettings()));

    public static final Block IRON_SLAB = registerBlock("iron_slab",
            new SlabBlock(IRON_BLOCK.getSettings()));

    public static final Block GOLD_SLAB = registerBlock("gold_slab",
            new SlabBlock(GOLD_BLOCK.getSettings()));

    // endregion

    // region Wood

    public static final Block OAK_LOG_SLAB = registerBlock("oak_log_slab",
            new ModSlabBlock(OAK_PLANKS.getSettings()));

    public static final Block SPRUCE_LOG_SLAB = registerBlock("spruce_log_slab",
            new ModSlabBlock(SPRUCE_PLANKS.getSettings()));

    public static final Block BIRCH_LOG_SLAB = registerBlock("birch_log_slab",
            new ModSlabBlock(BIRCH_PLANKS.getSettings()));

    public static final Block JUNGLE_LOG_SLAB = registerBlock("jungle_log_slab",
            new ModSlabBlock(JUNGLE_PLANKS.getSettings()));

    public static final Block ACACIA_LOG_SLAB = registerBlock("acacia_log_slab",
            new ModSlabBlock(ACACIA_PLANKS.getSettings()));

    public static final Block DARK_OAK_LOG_SLAB = registerBlock("dark_oak_log_slab",
            new ModSlabBlock(DARK_OAK_PLANKS.getSettings()));

    public static final Block MANGROVE_LOG_SLAB = registerBlock("mangrove_log_slab",
            new ModSlabBlock(MANGROVE_PLANKS.getSettings()));

    public static final Block CHERRY_LOG_SLAB = registerBlock("cherry_log_slab",
            new ModSlabBlock(CHERRY_PLANKS.getSettings()));

    public static final Block WARPED_STEM_SLAB = registerBlock("warped_stem_slab",
            new ModSlabBlock(WARPED_STEM.getSettings()));

    public static final Block CRIMSON_STEM_SLAB = registerBlock("crimson_stem_slab",
            new ModSlabBlock(CRIMSON_STEM.getSettings()));

    public static final Block OAK_WOOD_SLAB = registerBlock("oak_wood_slab",
            new ModSlabBlock(OAK_WOOD.getSettings()));

    public static final Block SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab",
            new ModSlabBlock(SPRUCE_WOOD.getSettings()));

    public static final Block BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab",
            new ModSlabBlock(BIRCH_WOOD.getSettings()));

    public static final Block JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab",
            new ModSlabBlock(JUNGLE_WOOD.getSettings()));

    public static final Block ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab",
            new ModSlabBlock(ACACIA_WOOD.getSettings()));

    public static final Block DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab",
            new ModSlabBlock(DARK_OAK_WOOD.getSettings()));

    public static final Block MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab",
            new ModSlabBlock(MANGROVE_WOOD.getSettings()));

    public static final Block CHERRY_WOOD_SLAB = registerBlock("cherry_wood_slab",
            new ModSlabBlock(CHERRY_WOOD.getSettings()));

    public static final Block BAMBOO_BLOCK_SLAB = registerBlock("bamboo_block_slab",
            new ModSlabBlock(BAMBOO_PLANKS.getSettings()));

    public static final Block WARPED_HYPHAE_SLAB = registerBlock("warped_hyphae_slab",
            new ModSlabBlock(WARPED_STEM.getSettings()));

    public static final Block CRIMSON_HYPHAE_SLAB = registerBlock("crimson_hyphae_slab",
            new ModSlabBlock(CRIMSON_STEM.getSettings()));

    public static final Block STRIPPED_OAK_SLAB = registerBlock("stripped_oak_slab",
            new ModSlabBlock(STRIPPED_OAK_WOOD.getSettings()));

    public static final Block STRIPPED_SPRUCE_SLAB = registerBlock("stripped_spruce_slab",
            new ModSlabBlock(STRIPPED_SPRUCE_WOOD.getSettings()));

    public static final Block STRIPPED_BIRCH_SLAB = registerBlock("stripped_birch_slab",
            new ModSlabBlock(STRIPPED_BIRCH_WOOD.getSettings()));

    public static final Block STRIPPED_JUNGLE_SLAB = registerBlock("stripped_jungle_slab",
            new ModSlabBlock(STRIPPED_JUNGLE_WOOD.getSettings()));

    public static final Block STRIPPED_ACACIA_SLAB = registerBlock("stripped_acacia_slab",
            new ModSlabBlock(STRIPPED_ACACIA_WOOD.getSettings()));

    public static final Block STRIPPED_DARK_OAK_SLAB = registerBlock("stripped_dark_oak_slab",
            new ModSlabBlock(STRIPPED_DARK_OAK_WOOD.getSettings()));

    public static final Block STRIPPED_MANGROVE_SLAB = registerBlock("stripped_mangrove_slab",
            new ModSlabBlock(MANGROVE_WOOD.getSettings()));

    public static final Block STRIPPED_CHERRY_SLAB = registerBlock("stripped_cherry_slab",
            new ModSlabBlock(CHERRY_WOOD.getSettings()));

    public static final Block STRIPPED_WARPED_SLAB = registerBlock("stripped_warped_slab",
            new ModSlabBlock(STRIPPED_WARPED_HYPHAE.getSettings()));

    public static final Block STRIPPED_CRIMSON_SLAB = registerBlock("stripped_crimson_slab",
            new ModSlabBlock(STRIPPED_CRIMSON_HYPHAE.getSettings()));

    // endregion

    // region Stone

    public static final Block CHISELED_STONE_BRICK_SLAB = registerBlock("chiseled_stone_brick_slab",
            new SlabBlock(CHISELED_STONE_BRICKS.getSettings()));

    public static final Block CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            new SlabBlock(CRACKED_STONE_BRICKS.getSettings()));

    public static final Block CHISELED_SANDSTONE_SLAB = registerBlock("chiseled_sandstone_slab",
            new SlabBlock(CHISELED_SANDSTONE.getSettings()));

    public static final Block CHISELED_RED_SANDSTONE_SLAB = registerBlock("chiseled_red_sandstone_slab",
            new SlabBlock(CHISELED_RED_SANDSTONE.getSettings()));

    public static final Block BASALT_SLAB = registerBlock("basalt_slab",
            new SlabBlock(BASALT.getSettings()));

    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(SMOOTH_BASALT.getSettings()));

    public static final Block POLISHED_BASALT_SLAB = registerBlock("polished_basalt_slab",
            new SlabBlock(POLISHED_BASALT.getSettings()));

    public static final Block CHISELED_POLISHED_BLACKSTONE_SLAB = registerBlock("chiseled_polished_blackstone_slab",
            new SlabBlock(CHISELED_POLISHED_BLACKSTONE.getSettings()));

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            new SlabBlock(CRACKED_POLISHED_BLACKSTONE_BRICKS.getSettings()));

    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(CALCITE.getSettings()));

    public static final Block TUFF_SLAB = registerBlock("tuff_slab",
            new SlabBlock(TUFF.getSettings()));

    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            new SlabBlock(DEEPSLATE.getSettings()));

    public static final Block CHISELED_DEEPSLATE_SLAB = registerBlock("chiseled_deepslate_slab",
            new SlabBlock(CHISELED_DEEPSLATE.getSettings()));

    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            new SlabBlock(CRACKED_DEEPSLATE_BRICKS.getSettings()));

    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            new SlabBlock(CRACKED_DEEPSLATE_TILES.getSettings()));

    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock(DRIPSTONE_BLOCK.getSettings()));

    public static final Block CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab",
            new SlabBlock(CRACKED_NETHER_BRICKS.getSettings()));

    public static final Block CHISELED_NETHER_BRICK_SLAB = registerBlock("chiseled_nether_brick_slab",
            new SlabBlock(CHISELED_NETHER_BRICKS.getSettings()));

    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(QUARTZ_BRICKS.getSettings()));

    public static final Block CHISELED_QUARTZ_SLAB = registerBlock("chiseled_quartz_slab",
            new SlabBlock(CHISELED_QUARTZ_BLOCK.getSettings()));

    public static final Block QUARTZ_PILLAR_SLAB = registerBlock("quartz_pillar_slab",
            new SlabBlock(QUARTZ_PILLAR.getSettings()));

    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock(END_STONE.getSettings()));

    public static final Block PURPUR_PILLAR_SLAB = registerBlock("purpur_pillar_slab",
            new SlabBlock(PURPUR_PILLAR.getSettings()));

    // endregion

    // region Concrete

    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(BLACK_CONCRETE.getSettings()));

    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(BLUE_CONCRETE.getSettings()));

    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(BROWN_CONCRETE.getSettings()));

    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(CYAN_CONCRETE.getSettings()));

    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(GRAY_CONCRETE.getSettings()));

    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(GREEN_CONCRETE.getSettings()));

    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(LIGHT_BLUE_CONCRETE.getSettings()));

    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(LIGHT_GRAY_CONCRETE.getSettings()));

    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(LIME_CONCRETE.getSettings()));

    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(MAGENTA_CONCRETE.getSettings()));

    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(ORANGE_CONCRETE.getSettings()));

    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(PINK_CONCRETE.getSettings()));

    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(PURPLE_CONCRETE.getSettings()));

    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(RED_CONCRETE.getSettings()));

    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(WHITE_CONCRETE.getSettings()));

    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(YELLOW_CONCRETE.getSettings()));

    // endregion

    // region Terracotta

    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            new SlabBlock(TERRACOTTA.getSettings()));

    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            new SlabBlock(BLACK_TERRACOTTA.getSettings()));

    public static final Block BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("black_glazed_terracotta_slab",
            new SlabBlock(BLACK_GLAZED_TERRACOTTA.getSettings()));

    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            new SlabBlock(BLUE_TERRACOTTA.getSettings()));

    public static final Block BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("blue_glazed_terracotta_slab",
            new SlabBlock(BLUE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            new SlabBlock(BROWN_TERRACOTTA.getSettings()));

    public static final Block BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("brown_glazed_terracotta_slab",
            new SlabBlock(BROWN_GLAZED_TERRACOTTA.getSettings()));

    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            new SlabBlock(CYAN_TERRACOTTA.getSettings()));

    public static final Block CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("cyan_glazed_terracotta_slab",
            new SlabBlock(CYAN_GLAZED_TERRACOTTA.getSettings()));

    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            new SlabBlock(GRAY_TERRACOTTA.getSettings()));

    public static final Block GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("gray_glazed_terracotta_slab",
            new SlabBlock(GRAY_GLAZED_TERRACOTTA.getSettings()));

    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            new SlabBlock(GREEN_TERRACOTTA.getSettings()));

    public static final Block GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("green_glazed_terracotta_slab",
            new SlabBlock(GREEN_GLAZED_TERRACOTTA.getSettings()));

    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            new SlabBlock(LIGHT_BLUE_TERRACOTTA.getSettings()));

    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("light_blue_glazed_terracotta_slab",
            new SlabBlock(LIGHT_BLUE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            new SlabBlock(LIGHT_GRAY_TERRACOTTA.getSettings()));

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("light_gray_glazed_terracotta_slab",
            new SlabBlock(LIGHT_GRAY_GLAZED_TERRACOTTA.getSettings()));

    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            new SlabBlock(LIME_TERRACOTTA.getSettings()));

    public static final Block LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("lime_glazed_terracotta_slab",
            new SlabBlock(LIME_GLAZED_TERRACOTTA.getSettings()));

    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            new SlabBlock(MAGENTA_TERRACOTTA.getSettings()));

    public static final Block MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("magenta_glazed_terracotta_slab",
            new SlabBlock(MAGENTA_GLAZED_TERRACOTTA.getSettings()));

    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            new SlabBlock(ORANGE_TERRACOTTA.getSettings()));

    public static final Block ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("orange_glazed_terracotta_slab",
            new SlabBlock(ORANGE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            new SlabBlock(PINK_TERRACOTTA.getSettings()));

    public static final Block PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("pink_glazed_terracotta_slab",
            new SlabBlock(PINK_GLAZED_TERRACOTTA.getSettings()));

    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            new SlabBlock(PURPLE_TERRACOTTA.getSettings()));

    public static final Block PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("purple_glazed_terracotta_slab",
            new SlabBlock(PURPLE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            new SlabBlock(RED_TERRACOTTA.getSettings()));

    public static final Block RED_GLAZED_TERRACOTTA_SLAB = registerBlock("red_glazed_terracotta_slab",
            new SlabBlock(RED_GLAZED_TERRACOTTA.getSettings()));

    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            new SlabBlock(WHITE_TERRACOTTA.getSettings()));

    public static final Block WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("white_glazed_terracotta_slab",
            new SlabBlock(WHITE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            new SlabBlock(YELLOW_TERRACOTTA.getSettings()));

    public static final Block YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("yellow_glazed_terracotta_slab",
            new SlabBlock(YELLOW_GLAZED_TERRACOTTA.getSettings()));

     // endregion

     // endregion

    // region STAIRS:

    // region Metal

    public static final Block COPPER_STAIRS = registerBlock("copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, COPPER_BLOCK.getDefaultState(), COPPER_BLOCK.getSettings()));

    public static final Block WAXED_COPPER_STAIRS = registerBlock("waxed_copper_stairs",
            new StairsBlock(COPPER_BLOCK.getDefaultState(), COPPER_BLOCK.getSettings()));

    public static final Block EXPOSED_COPPER_STAIRS = registerBlock("exposed_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, EXPOSED_COPPER.getDefaultState(), EXPOSED_COPPER.getSettings()));

    public static final Block WAXED_EXPOSED_COPPER_STAIRS = registerBlock("waxed_exposed_copper_stairs",
            new StairsBlock(EXPOSED_COPPER.getDefaultState(), EXPOSED_COPPER.getSettings()));

    public static final Block WEATHERED_COPPER_STAIRS = registerBlock("weathered_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, WEATHERED_COPPER.getDefaultState(), WEATHERED_COPPER.getSettings()));

    public static final Block WAXED_WEATHERED_COPPER_STAIRS = registerBlock("waxed_weathered_copper_stairs",
            new StairsBlock(WEATHERED_COPPER.getDefaultState(), WEATHERED_COPPER.getSettings()));

    public static final Block OXIDIZED_COPPER_STAIRS = registerBlock("oxidized_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, OXIDIZED_COPPER.getDefaultState(), OXIDIZED_COPPER.getSettings()));

    public static final Block WAXED_OXIDIZED_COPPER_STAIRS = registerBlock("waxed_oxidized_copper_stairs",
            new StairsBlock(OXIDIZED_COPPER.getDefaultState(), OXIDIZED_COPPER.getSettings()));

    public static final Block IRON_STAIRS = registerBlock("iron_stairs",
            new StairsBlock(IRON_BLOCK.getDefaultState(), IRON_BLOCK.getSettings()));

    public static final Block GOLD_STAIRS = registerBlock("gold_stairs",
            new StairsBlock(GOLD_BLOCK.getDefaultState(), IRON_BLOCK.getSettings()));

    // endregion

    // region Wood

    public static final Block OAK_LOG_STAIRS = registerBlock("oak_log_stairs",
            new ModStairsBlock(OAK_PLANKS.getDefaultState(), OAK_PLANKS.getSettings()));

    public static final Block SPRUCE_LOG_STAIRS = registerBlock("spruce_log_stairs",
            new ModStairsBlock(SPRUCE_PLANKS.getDefaultState(), SPRUCE_PLANKS.getSettings()));

    public static final Block BIRCH_LOG_STAIRS = registerBlock("birch_log_stairs",
            new ModStairsBlock(BIRCH_PLANKS.getDefaultState(), BIRCH_PLANKS.getSettings()));

    public static final Block JUNGLE_LOG_STAIRS = registerBlock("jungle_log_stairs",
            new ModStairsBlock(JUNGLE_PLANKS.getDefaultState(), JUNGLE_PLANKS.getSettings()));

    public static final Block ACACIA_LOG_STAIRS = registerBlock("acacia_log_stairs",
            new ModStairsBlock(ACACIA_PLANKS.getDefaultState(), ACACIA_PLANKS.getSettings()));

    public static final Block DARK_OAK_LOG_STAIRS = registerBlock("dark_oak_log_stairs",
            new ModStairsBlock(DARK_OAK_PLANKS.getDefaultState(), DARK_OAK_PLANKS.getSettings()));

    public static final Block MANGROVE_LOG_STAIRS = registerBlock("mangrove_log_stairs",
            new ModStairsBlock(MANGROVE_PLANKS.getDefaultState(), MANGROVE_PLANKS.getSettings()));

    public static final Block CHERRY_LOG_STAIRS = registerBlock("cherry_log_stairs",
            new ModStairsBlock(CHERRY_PLANKS.getDefaultState(), CHERRY_PLANKS.getSettings()));

    public static final Block WARPED_STEM_STAIRS = registerBlock("warped_stem_stairs",
            new ModStairsBlock(WARPED_STEM.getDefaultState(), WARPED_STEM.getSettings()));

    public static final Block CRIMSON_STEM_STAIRS = registerBlock("crimson_stem_stairs",
            new ModStairsBlock(CRIMSON_STEM.getDefaultState(), CRIMSON_STEM.getSettings()));

    public static final Block OAK_WOOD_STAIRS = registerBlock("oak_wood_stairs",
            new ModStairsBlock(OAK_WOOD.getDefaultState(), OAK_WOOD.getSettings()));

    public static final Block SPRUCE_WOOD_STAIRS = registerBlock("spruce_wood_stairs",
            new ModStairsBlock(SPRUCE_WOOD.getDefaultState(), SPRUCE_WOOD.getSettings()));

    public static final Block BIRCH_WOOD_STAIRS = registerBlock("birch_wood_stairs",
            new ModStairsBlock(BIRCH_WOOD.getDefaultState(), BIRCH_WOOD.getSettings()));

    public static final Block JUNGLE_WOOD_STAIRS = registerBlock("jungle_wood_stairs",
            new ModStairsBlock(JUNGLE_WOOD.getDefaultState(), JUNGLE_WOOD.getSettings()));

    public static final Block ACACIA_WOOD_STAIRS = registerBlock("acacia_wood_stairs",
            new ModStairsBlock(ACACIA_WOOD.getDefaultState(), ACACIA_WOOD.getSettings()));

    public static final Block DARK_OAK_WOOD_STAIRS = registerBlock("dark_oak_wood_stairs",
            new ModStairsBlock(DARK_OAK_WOOD.getDefaultState(), DARK_OAK_WOOD.getSettings()));

    public static final Block MANGROVE_WOOD_STAIRS = registerBlock("mangrove_wood_stairs",
            new ModStairsBlock(MANGROVE_WOOD.getDefaultState(), MANGROVE_WOOD.getSettings()));

    public static final Block CHERRY_WOOD_STAIRS = registerBlock("cherry_wood_stairs",
            new ModStairsBlock(CHERRY_WOOD.getDefaultState(), CHERRY_WOOD.getSettings()));

    public static final Block BAMBOO_BLOCK_STAIRS = registerBlock("bamboo_block_stairs",
            new ModStairsBlock(BAMBOO_PLANKS.getDefaultState(), BAMBOO_PLANKS.getSettings()));

    public static final Block WARPED_HYPHAE_STAIRS = registerBlock("warped_hyphae_stairs",
            new ModStairsBlock(WARPED_HYPHAE.getDefaultState(), WARPED_HYPHAE.getSettings()));

    public static final Block CRIMSON_HYPHAE_STAIRS = registerBlock("crimson_hyphae_stairs",
            new ModStairsBlock(CRIMSON_HYPHAE.getDefaultState(), CRIMSON_HYPHAE.getSettings()));

    public static final Block STRIPPED_OAK_STAIRS = registerBlock("stripped_oak_stairs",
            new ModStairsBlock(STRIPPED_OAK_WOOD.getDefaultState(), STRIPPED_OAK_WOOD.getSettings()));

    public static final Block STRIPPED_SPRUCE_STAIRS = registerBlock("stripped_spruce_stairs",
            new ModStairsBlock(STRIPPED_SPRUCE_WOOD.getDefaultState(), STRIPPED_SPRUCE_WOOD.getSettings()));

    public static final Block STRIPPED_BIRCH_STAIRS = registerBlock("stripped_birch_stairs",
            new ModStairsBlock(STRIPPED_BIRCH_WOOD.getDefaultState(), STRIPPED_BIRCH_WOOD.getSettings()));

    public static final Block STRIPPED_JUNGLE_STAIRS = registerBlock("stripped_jungle_stairs",
            new ModStairsBlock(STRIPPED_JUNGLE_WOOD.getDefaultState(), STRIPPED_JUNGLE_WOOD.getSettings()));

    public static final Block STRIPPED_ACACIA_STAIRS = registerBlock("stripped_acacia_stairs",
            new ModStairsBlock(STRIPPED_ACACIA_WOOD.getDefaultState(), STRIPPED_ACACIA_WOOD.getSettings()));

    public static final Block STRIPPED_DARK_OAK_STAIRS = registerBlock("stripped_dark_oak_stairs",
            new ModStairsBlock(STRIPPED_DARK_OAK_WOOD.getDefaultState(), STRIPPED_DARK_OAK_WOOD.getSettings()));

    public static final Block STRIPPED_MANGROVE_STAIRS = registerBlock("stripped_mangrove_stairs",
            new ModStairsBlock(MANGROVE_WOOD.getDefaultState(), MANGROVE_WOOD.getSettings()));

    public static final Block STRIPPED_CHERRY_STAIRS = registerBlock("stripped_cherry_stairs",
            new ModStairsBlock(CHERRY_WOOD.getDefaultState(), CHERRY_WOOD.getSettings()));

    public static final Block STRIPPED_WARPED_STAIRS = registerBlock("stripped_warped_stairs",
            new ModStairsBlock(STRIPPED_WARPED_HYPHAE.getDefaultState(), STRIPPED_WARPED_HYPHAE.getSettings()));

    public static final Block STRIPPED_CRIMSON_STAIRS = registerBlock("stripped_crimson_stairs",
            new ModStairsBlock(STRIPPED_CRIMSON_HYPHAE.getDefaultState(), STRIPPED_CRIMSON_HYPHAE.getSettings()));

    // endregion

    // region Stone

    public static final Block CHISELED_STONE_BRICK_STAIRS = registerBlock("chiseled_stone_brick_stairs",
            new StairsBlock(CHISELED_STONE_BRICKS.getDefaultState(), CHISELED_STONE_BRICKS.getSettings()));

    public static final Block CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            new StairsBlock(CRACKED_STONE_BRICKS.getDefaultState(), CRACKED_STONE_BRICKS.getSettings()));

    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(SMOOTH_STONE.getDefaultState(), SMOOTH_STONE.getSettings()));

    public static final Block CHISELED_SANDSTONE_STAIRS = registerBlock("chiseled_sandstone_stairs",
            new StairsBlock(CHISELED_SANDSTONE.getDefaultState(), CHISELED_SANDSTONE.getSettings()));

    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            new StairsBlock(CUT_SANDSTONE.getDefaultState(), CUT_SANDSTONE.getSettings()));

    public static final Block CHISELED_RED_SANDSTONE_STAIRS = registerBlock("chiseled_red_sandstone_stairs",
            new StairsBlock(CHISELED_RED_SANDSTONE.getDefaultState(), CHISELED_RED_SANDSTONE.getSettings()));

    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            new StairsBlock(CUT_RED_SANDSTONE.getDefaultState(), CUT_RED_SANDSTONE.getSettings()));

    public static final Block BASALT_STAIRS = registerBlock("basalt_stairs",
            new StairsBlock(BASALT.getDefaultState(), BASALT.getSettings()));

    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(SMOOTH_BASALT.getDefaultState(), SMOOTH_BASALT.getSettings()));

    public static final Block POLISHED_BASALT_STAIRS = registerBlock("polished_basalt_stairs",
            new StairsBlock(POLISHED_BASALT.getDefaultState(), POLISHED_BASALT.getSettings()));

    public static final Block CHISELED_POLISHED_BLACKSTONE_STAIRS = registerBlock("chiseled_polished_blackstone_stairs",
            new StairsBlock(CHISELED_POLISHED_BLACKSTONE.getDefaultState(), CHISELED_POLISHED_BLACKSTONE.getSettings()));

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs",
            new StairsBlock(CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), CRACKED_POLISHED_BLACKSTONE_BRICKS.getSettings()));

    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(CALCITE.getDefaultState(), CALCITE.getSettings()));

    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new StairsBlock(TUFF.getDefaultState(), TUFF.getSettings()));

    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new StairsBlock(DEEPSLATE.getDefaultState(), DEEPSLATE.getSettings()));

    public static final Block CHISELED_DEEPSLATE_STAIRS = registerBlock("chiseled_deepslate_stairs",
            new StairsBlock(CHISELED_DEEPSLATE.getDefaultState(), CHISELED_DEEPSLATE.getSettings()));

    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            new StairsBlock(CRACKED_DEEPSLATE_BRICKS.getDefaultState(), CRACKED_DEEPSLATE_BRICKS.getSettings()));

    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs",
            new StairsBlock(CRACKED_DEEPSLATE_TILES.getDefaultState(), CRACKED_DEEPSLATE_TILES.getSettings()));

    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(DRIPSTONE_BLOCK.getDefaultState(), DRIPSTONE_BLOCK.getSettings()));

    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs",
            new StairsBlock(CRACKED_NETHER_BRICKS.getDefaultState(), CRACKED_NETHER_BRICKS.getSettings()));

    public static final Block CHISELED_NETHER_BRICK_STAIRS = registerBlock("chiseled_nether_brick_stairs",
            new StairsBlock(CHISELED_NETHER_BRICKS.getDefaultState(), CHISELED_NETHER_BRICKS.getSettings()));

    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(QUARTZ_BRICKS.getDefaultState(), QUARTZ_BRICKS.getSettings()));

    public static final Block CHISELED_QUARTZ_STAIRS = registerBlock("chiseled_quartz_stairs",
            new StairsBlock(CHISELED_QUARTZ_BLOCK.getDefaultState(), CHISELED_QUARTZ_BLOCK.getSettings()));

    public static final Block QUARTZ_PILLAR_STAIRS = registerBlock("quartz_pillar_stairs",
            new StairsBlock(QUARTZ_PILLAR.getDefaultState(), QUARTZ_PILLAR.getSettings()));

    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            new StairsBlock(END_STONE.getDefaultState(), END_STONE.getSettings()));

    public static final Block PURPUR_PILLAR_STAIRS = registerBlock("purpur_pillar_stairs",
            new StairsBlock(PURPUR_PILLAR.getDefaultState(), PURPUR_PILLAR.getSettings()));

    // endregion

    // region Concrete

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(BLACK_CONCRETE.getDefaultState(), BLACK_CONCRETE.getSettings()));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(BLUE_CONCRETE.getDefaultState(), BLUE_CONCRETE.getSettings()));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(BROWN_CONCRETE.getDefaultState(), BROWN_CONCRETE.getSettings()));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(CYAN_CONCRETE.getDefaultState(), CYAN_CONCRETE.getSettings()));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(GRAY_CONCRETE.getDefaultState(), GRAY_CONCRETE.getSettings()));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(GREEN_CONCRETE.getDefaultState(), GREEN_CONCRETE.getSettings()));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), LIGHT_BLUE_CONCRETE.getSettings()));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), LIGHT_GRAY_CONCRETE.getSettings()));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(LIME_CONCRETE.getDefaultState(), LIME_CONCRETE.getSettings()));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(MAGENTA_CONCRETE.getDefaultState(), MAGENTA_CONCRETE.getSettings()));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(ORANGE_CONCRETE.getDefaultState(), ORANGE_CONCRETE.getSettings()));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(PINK_CONCRETE.getDefaultState(), PINK_CONCRETE.getSettings()));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(PURPLE_CONCRETE.getDefaultState(), PURPLE_CONCRETE.getSettings()));

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(RED_CONCRETE.getDefaultState(), RED_CONCRETE.getSettings()));

    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(WHITE_CONCRETE.getDefaultState(), WHITE_CONCRETE.getSettings()));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(YELLOW_CONCRETE.getDefaultState(), YELLOW_CONCRETE.getSettings()));

    // endregion

    // region Terracotta

    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            new StairsBlock(TERRACOTTA.getDefaultState(), TERRACOTTA.getSettings()));

    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            new StairsBlock(BLACK_TERRACOTTA.getDefaultState(), BLACK_TERRACOTTA.getSettings()));

    public static final Block BLACK_GLAZED_TERRACOTTA_STAIRS = registerBlock("black_glazed_terracotta_stairs",
            new StairsBlock(BLACK_GLAZED_TERRACOTTA.getDefaultState(), BLACK_GLAZED_TERRACOTTA.getSettings()));

    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            new StairsBlock(BLUE_TERRACOTTA.getDefaultState(), BLUE_TERRACOTTA.getSettings()));

    public static final Block BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("blue_glazed_terracotta_stairs",
            new StairsBlock(BLUE_GLAZED_TERRACOTTA.getDefaultState(), BLUE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            new StairsBlock(BROWN_TERRACOTTA.getDefaultState(), BROWN_TERRACOTTA.getSettings()));

    public static final Block BROWN_GLAZED_TERRACOTTA_STAIRS = registerBlock("brown_glazed_terracotta_stairs",
            new StairsBlock(BROWN_GLAZED_TERRACOTTA.getDefaultState(), BROWN_GLAZED_TERRACOTTA.getSettings()));

    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            new StairsBlock(CYAN_TERRACOTTA.getDefaultState(), CYAN_TERRACOTTA.getSettings()));

    public static final Block CYAN_GLAZED_TERRACOTTA_STAIRS = registerBlock("cyan_glazed_terracotta_stairs",
            new StairsBlock(CYAN_GLAZED_TERRACOTTA.getDefaultState(), CYAN_GLAZED_TERRACOTTA.getSettings()));

    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            new StairsBlock(GRAY_TERRACOTTA.getDefaultState(), GRAY_TERRACOTTA.getSettings()));

    public static final Block GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("gray_glazed_terracotta_stairs",
            new StairsBlock(GRAY_GLAZED_TERRACOTTA.getDefaultState(), GRAY_GLAZED_TERRACOTTA.getSettings()));

    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            new StairsBlock(GREEN_TERRACOTTA.getDefaultState(), GREEN_TERRACOTTA.getSettings()));

    public static final Block GREEN_GLAZED_TERRACOTTA_STAIRS = registerBlock("green_glazed_terracotta_stairs",
            new StairsBlock(GREEN_GLAZED_TERRACOTTA.getDefaultState(), GREEN_GLAZED_TERRACOTTA.getSettings()));

    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            new StairsBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), LIGHT_BLUE_TERRACOTTA.getSettings()));

    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_blue_glazed_terracotta_stairs",
            new StairsBlock(LIGHT_BLUE_GLAZED_TERRACOTTA.getDefaultState(), LIGHT_BLUE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            new StairsBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), LIGHT_GRAY_TERRACOTTA.getSettings()));

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_gray_glazed_terracotta_stairs",
            new StairsBlock(LIGHT_GRAY_GLAZED_TERRACOTTA.getDefaultState(), LIGHT_GRAY_GLAZED_TERRACOTTA.getSettings()));

    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            new StairsBlock(LIME_TERRACOTTA.getDefaultState(), LIME_TERRACOTTA.getSettings()));

    public static final Block LIME_GLAZED_TERRACOTTA_STAIRS = registerBlock("lime_glazed_terracotta_stairs",
            new StairsBlock(LIME_GLAZED_TERRACOTTA.getDefaultState(), LIME_GLAZED_TERRACOTTA.getSettings()));

    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            new StairsBlock(MAGENTA_TERRACOTTA.getDefaultState(), MAGENTA_TERRACOTTA.getSettings()));

    public static final Block MAGENTA_GLAZED_TERRACOTTA_STAIRS = registerBlock("magenta_glazed_terracotta_stairs",
            new StairsBlock(MAGENTA_GLAZED_TERRACOTTA.getDefaultState(), MAGENTA_GLAZED_TERRACOTTA.getSettings()));

    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            new StairsBlock(ORANGE_TERRACOTTA.getDefaultState(), ORANGE_TERRACOTTA.getSettings()));

    public static final Block ORANGE_GLAZED_TERRACOTTA_STAIRS = registerBlock("orange_glazed_terracotta_stairs",
            new StairsBlock(ORANGE_GLAZED_TERRACOTTA.getDefaultState(), ORANGE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            new StairsBlock(PINK_TERRACOTTA.getDefaultState(), PINK_TERRACOTTA.getSettings()));

    public static final Block PINK_GLAZED_TERRACOTTA_STAIRS = registerBlock("pink_glazed_terracotta_stairs",
            new StairsBlock(PINK_GLAZED_TERRACOTTA.getDefaultState(), PINK_GLAZED_TERRACOTTA.getSettings()));

    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            new StairsBlock(PURPLE_TERRACOTTA.getDefaultState(), PURPLE_TERRACOTTA.getSettings()));

    public static final Block PURPLE_GLAZED_TERRACOTTA_STAIRS = registerBlock("purple_glazed_terracotta_stairs",
            new StairsBlock(PURPLE_GLAZED_TERRACOTTA.getDefaultState(), PURPLE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            new StairsBlock(RED_TERRACOTTA.getDefaultState(), RED_TERRACOTTA.getSettings()));

    public static final Block RED_GLAZED_TERRACOTTA_STAIRS = registerBlock("red_glazed_terracotta_stairs",
            new StairsBlock(RED_GLAZED_TERRACOTTA.getDefaultState(), RED_GLAZED_TERRACOTTA.getSettings()));

    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            new StairsBlock(WHITE_TERRACOTTA.getDefaultState(), WHITE_TERRACOTTA.getSettings()));

    public static final Block WHITE_GLAZED_TERRACOTTA_STAIRS = registerBlock("white_glazed_terracotta_stairs",
            new StairsBlock(WHITE_GLAZED_TERRACOTTA.getDefaultState(), WHITE_GLAZED_TERRACOTTA.getSettings()));

    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            new StairsBlock(YELLOW_TERRACOTTA.getDefaultState(), YELLOW_TERRACOTTA.getSettings()));

    public static final Block YELLOW_GLAZED_TERRACOTTA_STAIRS = registerBlock("yellow_glazed_terracotta_stairs",
            new StairsBlock(YELLOW_GLAZED_TERRACOTTA.getDefaultState(), YELLOW_GLAZED_TERRACOTTA.getSettings()));

    // endregion

    // endregion

    // region REGISTRY METHODS:

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SlabsAndStairs.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(SlabsAndStairs.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        SlabsAndStairs.LOGGER.debug("Registering Mod Blocks for " + SlabsAndStairs.MOD_ID);
    }

    // endregion
}