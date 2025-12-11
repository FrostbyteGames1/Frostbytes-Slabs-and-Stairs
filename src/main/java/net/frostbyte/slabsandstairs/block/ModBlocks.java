package net.frostbyte.slabsandstairs.block;

import net.frostbyte.slabsandstairs.SlabsAndStairs;
import net.frostbyte.slabsandstairs.block.custom.ice.IceSlabBlock;
import net.frostbyte.slabsandstairs.block.custom.ice.IceStairsBlock;
import net.frostbyte.slabsandstairs.block.custom.ice.IceWallBlock;
import net.frostbyte.slabsandstairs.block.custom.layer.FallingLayerBlock;
import net.frostbyte.slabsandstairs.block.custom.layer.LeafLayerBlock;
import net.frostbyte.slabsandstairs.block.custom.layer.ModLayerBlock;
import net.frostbyte.slabsandstairs.block.custom.oxidizable.OxidizableButtonBlock;
import net.frostbyte.slabsandstairs.block.custom.oxidizable.OxidizablePressurePlateBlock;
import net.frostbyte.slabsandstairs.block.custom.oxidizable.OxidizableWallBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.*;

@SuppressWarnings("unused")
public class ModBlocks {

    // region LAYERS:

    // region Leaves

    public static final Block OAK_LEAF_LAYER = register("oak_leaf_layer",
        new LeafLayerBlock(0.01F, OAK_LEAVES, OAK_LEAVES.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oak_leaf_layer")))
        )
    );

    public static final Block SPRUCE_LEAF_LAYER = register("spruce_leaf_layer",
        new LeafLayerBlock(0, SPRUCE_LEAVES, SPRUCE_LEAVES.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "spruce_leaf_layer")))
        )
    );

    public static final Block BIRCH_LEAF_LAYER = register("birch_leaf_layer",
        new LeafLayerBlock(0.01F, BIRCH_LEAVES, BIRCH_LEAVES.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "birch_leaf_layer")))
        )
    );

    public static final Block JUNGLE_LEAF_LAYER = register("jungle_leaf_layer",
        new LeafLayerBlock(0.01F, JUNGLE_LEAVES, JUNGLE_LEAVES.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "jungle_leaf_layer")))
        )
    );

    public static final Block ACACIA_LEAF_LAYER = register("acacia_leaf_layer",
        new LeafLayerBlock(0.01F, ACACIA_LEAVES, ACACIA_LEAVES.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "acacia_leaf_layer")))
        )
    );

    public static final Block DARK_OAK_LEAF_LAYER = register("dark_oak_leaf_layer",
        new LeafLayerBlock(0.01F, DARK_OAK_LEAVES, DARK_OAK_LEAVES.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dark_oak_leaf_layer")))
        )
    );

    public static final Block MANGROVE_LEAF_LAYER = register("mangrove_leaf_layer",
        new LeafLayerBlock(0.01F, MANGROVE_LEAVES, MANGROVE_LEAVES.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "mangrove_leaf_layer")))
        )
    );

    public static final Block CHERRY_LEAF_LAYER = register("cherry_leaf_layer",
        new LeafLayerBlock(0.01F, CHERRY_LEAVES, CHERRY_LEAVES.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cherry_leaf_layer")))
        )
    );

    public static final Block PALE_OAK_LEAF_LAYER = register("pale_oak_leaf_layer",
        new LeafLayerBlock(0.01F, PALE_OAK_LEAVES, PALE_OAK_LEAVES.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pale_oak_leaf_layer")))
        )
    );

    public static final Block AZALEA_LEAF_LAYER = register("azalea_leaf_layer",
        new LeafLayerBlock(0.01F, AZALEA_LEAVES, AZALEA_LEAVES.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "azalea_leaf_layer")))
        )
    );

    public static final Block FLOWERING_AZALEA_LEAF_LAYER = register("flowering_azalea_leaf_layer",
        new LeafLayerBlock(0.01F, FLOWERING_AZALEA_LEAVES, FLOWERING_AZALEA_LEAVES.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "flowering_azalea_leaf_layer")))
        )
    );

    // endregion

    // region Concrete

    public static final Block BLACK_CONCRETE_LAYER = register("black_concrete_layer",
        new ModLayerBlock(BLACK_CONCRETE, BLACK_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "black_concrete_layer")))
        )
    );

    public static final Block BLUE_CONCRETE_LAYER = register("blue_concrete_layer",
        new ModLayerBlock(BLUE_CONCRETE, BLUE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blue_concrete_layer")))
        )
    );

    public static final Block BROWN_CONCRETE_LAYER = register("brown_concrete_layer",
        new ModLayerBlock(BROWN_CONCRETE, BROWN_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "brown_concrete_layer")))
        )
    );

    public static final Block CYAN_CONCRETE_LAYER = register("cyan_concrete_layer",
        new ModLayerBlock(CYAN_CONCRETE, CYAN_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cyan_concrete_layer")))
        )
    );

    public static final Block GRAY_CONCRETE_LAYER = register("gray_concrete_layer",
        new ModLayerBlock(GRAY_CONCRETE, GRAY_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gray_concrete_layer")))
        )
    );

    public static final Block GREEN_CONCRETE_LAYER = register("green_concrete_layer",
        new ModLayerBlock(GREEN_CONCRETE, GREEN_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "green_concrete_layer")))
        )
    );

    public static final Block LIGHT_BLUE_CONCRETE_LAYER = register("light_blue_concrete_layer",
        new ModLayerBlock(LIGHT_BLUE_CONCRETE, LIGHT_BLUE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_blue_concrete_layer")))
        )
    );

    public static final Block LIGHT_GRAY_CONCRETE_LAYER = register("light_gray_concrete_layer",
        new ModLayerBlock(LIGHT_GRAY_CONCRETE, LIGHT_GRAY_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_gray_concrete_layer")))
        )
    );

    public static final Block LIME_CONCRETE_LAYER = register("lime_concrete_layer",
        new ModLayerBlock(LIME_CONCRETE, LIME_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "lime_concrete_layer")))
        )
    );

    public static final Block MAGENTA_CONCRETE_LAYER = register("magenta_concrete_layer",
        new ModLayerBlock(MAGENTA_CONCRETE, MAGENTA_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "magenta_concrete_layer")))
        )
    );

    public static final Block ORANGE_CONCRETE_LAYER = register("orange_concrete_layer",
        new ModLayerBlock(ORANGE_CONCRETE, ORANGE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "orange_concrete_layer")))
        )
    );

    public static final Block PINK_CONCRETE_LAYER = register("pink_concrete_layer",
        new ModLayerBlock(PINK_CONCRETE, PINK_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pink_concrete_layer")))
        )
    );

    public static final Block PURPLE_CONCRETE_LAYER = register("purple_concrete_layer",
        new ModLayerBlock(PURPLE_CONCRETE, PURPLE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purple_concrete_layer")))
        )
    );

    public static final Block RED_CONCRETE_LAYER = register("red_concrete_layer",
        new ModLayerBlock(RED_CONCRETE, RED_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_concrete_layer")))
        )
    );

    public static final Block WHITE_CONCRETE_LAYER = register("white_concrete_layer",
        new ModLayerBlock(WHITE_CONCRETE, WHITE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "white_concrete_layer")))
        )
    );

    public static final Block YELLOW_CONCRETE_LAYER = register("yellow_concrete_layer",
        new ModLayerBlock(YELLOW_CONCRETE, YELLOW_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "yellow_concrete_layer")))
        )
    );

    // endregion

    // region Sand, Gravel, & Concrete Powder

    public static final Block SAND_LAYER = register("sand_layer",
        new FallingLayerBlock(new ColorCode(14406560), SAND, SAND.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "sand_layer")))
        )
    );

    public static final Block GRAVEL_LAYER = register("gravel_layer",
        new FallingLayerBlock(new ColorCode(-8356741), GRAVEL, GRAVEL.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gravel_layer")))
        )
    );

    public static final Block BLACK_CONCRETE_POWDER_LAYER = register("black_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(BLACK_CONCRETE_POWDER.getDefaultMapColor().color), BLACK_CONCRETE_POWDER, BLACK_CONCRETE_LAYER, BLACK_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "black_concrete_powder_layer")))
        )
    );

    public static final Block BLUE_CONCRETE_POWDER_LAYER = register("blue_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(BLUE_CONCRETE_POWDER.getDefaultMapColor().color), BLUE_CONCRETE_POWDER, BLUE_CONCRETE_LAYER, BLUE_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blue_concrete_powder_layer")))
        )
    );

    public static final Block BROWN_CONCRETE_POWDER_LAYER = register("brown_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(BROWN_CONCRETE_POWDER.getDefaultMapColor().color), BROWN_CONCRETE_POWDER, BROWN_CONCRETE_LAYER, BROWN_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "brown_concrete_powder_layer")))
        )
    );

    public static final Block CYAN_CONCRETE_POWDER_LAYER = register("cyan_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(CYAN_CONCRETE_POWDER.getDefaultMapColor().color), CYAN_CONCRETE_POWDER, CYAN_CONCRETE_LAYER, CYAN_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cyan_concrete_powder_layer")))
        )
    );

    public static final Block GRAY_CONCRETE_POWDER_LAYER = register("gray_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(GRAY_CONCRETE_POWDER.getDefaultMapColor().color), GRAY_CONCRETE_POWDER, GRAY_CONCRETE_LAYER, GRAY_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gray_concrete_powder_layer")))
        )
    );

    public static final Block GREEN_CONCRETE_POWDER_LAYER = register("green_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(GREEN_CONCRETE_POWDER.getDefaultMapColor().color), GREEN_CONCRETE_POWDER, GREEN_CONCRETE_LAYER, GREEN_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "green_concrete_powder_layer")))
        )
    );

    public static final Block LIGHT_BLUE_CONCRETE_POWDER_LAYER = register("light_blue_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(LIGHT_BLUE_CONCRETE_POWDER.getDefaultMapColor().color), LIGHT_BLUE_CONCRETE_POWDER, LIGHT_BLUE_CONCRETE_LAYER, LIGHT_BLUE_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_blue_concrete_powder_layer")))
        )
    );

    public static final Block LIGHT_GRAY_CONCRETE_POWDER_LAYER = register("light_gray_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(LIGHT_GRAY_CONCRETE_POWDER.getDefaultMapColor().color), LIGHT_GRAY_CONCRETE_POWDER, LIGHT_GRAY_CONCRETE_LAYER, LIGHT_GRAY_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_gray_concrete_powder_layer")))
        )
    );

    public static final Block LIME_CONCRETE_POWDER_LAYER = register("lime_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(LIME_CONCRETE_POWDER.getDefaultMapColor().color), LIME_CONCRETE_POWDER, LIME_CONCRETE_LAYER, LIME_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "lime_concrete_powder_layer")))
        )
    );

    public static final Block MAGENTA_CONCRETE_POWDER_LAYER = register("magenta_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(MAGENTA_CONCRETE_POWDER.getDefaultMapColor().color), MAGENTA_CONCRETE_POWDER, MAGENTA_CONCRETE_LAYER, MAGENTA_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "magenta_concrete_powder_layer")))
        )
    );

    public static final Block ORANGE_CONCRETE_POWDER_LAYER = register("orange_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(ORANGE_CONCRETE_POWDER.getDefaultMapColor().color), ORANGE_CONCRETE_POWDER, ORANGE_CONCRETE_LAYER, ORANGE_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "orange_concrete_powder_layer")))
        )
    );

    public static final Block PINK_CONCRETE_POWDER_LAYER = register("pink_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(PINK_CONCRETE_POWDER.getDefaultMapColor().color), PINK_CONCRETE_POWDER, PINK_CONCRETE_LAYER, PINK_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pink_concrete_powder_layer")))
        )
    );

    public static final Block PURPLE_CONCRETE_POWDER_LAYER = register("purple_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(PURPLE_CONCRETE_POWDER.getDefaultMapColor().color), PURPLE_CONCRETE_POWDER, PURPLE_CONCRETE_LAYER, PURPLE_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purple_concrete_powder_layer")))
        )
    );

    public static final Block RED_CONCRETE_POWDER_LAYER = register("red_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(RED_CONCRETE_POWDER.getDefaultMapColor().color), RED_CONCRETE_POWDER, RED_CONCRETE_LAYER, RED_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_concrete_powder_layer")))
        )
    );

    public static final Block WHITE_CONCRETE_POWDER_LAYER = register("white_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(WHITE_CONCRETE_POWDER.getDefaultMapColor().color), WHITE_CONCRETE_POWDER, WHITE_CONCRETE_LAYER, WHITE_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "white_concrete_powder_layer")))
        )
    );

    public static final Block YELLOW_CONCRETE_POWDER_LAYER = register("yellow_concrete_powder_layer",
        new FallingLayerBlock(new ColorCode(YELLOW_CONCRETE_POWDER.getDefaultMapColor().color), YELLOW_CONCRETE_POWDER, YELLOW_CONCRETE_LAYER, YELLOW_CONCRETE_POWDER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "yellow_concrete_powder_layer")))
        )
    );

    // endregion

    // endregion

    // region BUTTONS:

    // region Metal

    public static final Block COPPER_BUTTON = register("copper_button",
        new OxidizableButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "copper_button"))),
            10
        )
    );

    public static final Block WAXED_COPPER_BUTTON = register("waxed_copper_button",
        new ButtonBlock(BlockSetType.GOLD, 10, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_copper_button")))
        )
    );

    public static final Block EXPOSED_COPPER_BUTTON = register("exposed_copper_button",
        new OxidizableButtonBlock(Oxidizable.OxidationLevel.EXPOSED, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "exposed_copper_button"))), 
            20
        )
    );

    public static final Block WAXED_EXPOSED_COPPER_BUTTON = register("waxed_exposed_copper_button",
        new ButtonBlock(BlockSetType.GOLD, 20, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_exposed_copper_button")))
        )
    );

    public static final Block WEATHERED_COPPER_BUTTON = register("weathered_copper_button",
        new OxidizableButtonBlock(Oxidizable.OxidationLevel.WEATHERED, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "weathered_copper_button"))), 
            30
        )
    );

    public static final Block WAXED_WEATHERED_COPPER_BUTTON = register("waxed_weathered_copper_button",
        new ButtonBlock(BlockSetType.GOLD, 30, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_weathered_copper_button")))
        )
    );

    public static final Block OXIDIZED_COPPER_BUTTON = register("oxidized_copper_button",
        new OxidizableButtonBlock(Oxidizable.OxidationLevel.OXIDIZED, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oxidized_copper_button"))), 
            40
        )
    );

    public static final Block WAXED_OXIDIZED_COPPER_BUTTON = register("waxed_oxidized_copper_button",
        new ButtonBlock(BlockSetType.GOLD, 40, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_oxidized_copper_button")))
        )
    );

    public static final Block IRON_BUTTON = register("iron_button",
        new ButtonBlock(BlockSetType.GOLD, 35, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "iron_button")))
        )
    );

    public static final Block GOLD_BUTTON = register("gold_button",
        new ButtonBlock(BlockSetType.GOLD, 15, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gold_button")))
        )
    );

    public static final Block NETHERITE_BUTTON = register("netherite_button",
        new ButtonBlock(BlockSetType.GOLD, 50, NETHERITE_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "netherite_button")))
        )
    );

    // endregion

    // region Wood

    public static final Block OAK_WOOD_BUTTON = register("oak_wood_button",
        new ButtonBlock(BlockSetType.OAK, 15, OAK_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oak_wood_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block SPRUCE_WOOD_BUTTON = register("spruce_wood_button",
        new ButtonBlock(BlockSetType.SPRUCE, 15, SPRUCE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "spruce_wood_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block BIRCH_WOOD_BUTTON = register("birch_wood_button",
        new ButtonBlock(BlockSetType.BIRCH, 15, BIRCH_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "birch_wood_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block JUNGLE_WOOD_BUTTON = register("jungle_wood_button",
        new ButtonBlock(BlockSetType.JUNGLE, 15, JUNGLE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "jungle_wood_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block ACACIA_WOOD_BUTTON = register("acacia_wood_button",
        new ButtonBlock(BlockSetType.ACACIA, 15, ACACIA_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "acacia_wood_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block DARK_OAK_WOOD_BUTTON = register("dark_oak_wood_button",
        new ButtonBlock(BlockSetType.DARK_OAK, 15, DARK_OAK_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dark_oak_wood_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block MANGROVE_WOOD_BUTTON = register("mangrove_wood_button",
        new ButtonBlock(BlockSetType.MANGROVE, 15, MANGROVE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "mangrove_wood_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block CHERRY_WOOD_BUTTON = register("cherry_wood_button",
        new ButtonBlock(BlockSetType.CHERRY, 15, CHERRY_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cherry_wood_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block BAMBOO_BLOCK_BUTTON = register("bamboo_block_button",
        new ButtonBlock(BlockSetType.BAMBOO, 15, BAMBOO_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "bamboo_block_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block WARPED_HYPHAE_BUTTON = register("warped_hyphae_button",
        new ButtonBlock(BlockSetType.WARPED, 15, WARPED_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "warped_hyphae_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block CRIMSON_HYPHAE_BUTTON = register("crimson_hyphae_button",
        new ButtonBlock(BlockSetType.CRIMSON, 15, CRIMSON_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "crimson_hyphae_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block PALE_OAK_WOOD_BUTTON = register("pale_oak_wood_button",
        new ButtonBlock(BlockSetType.PALE_OAK, 15, PALE_OAK_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pale_oak_wood_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_OAK_BUTTON = register("stripped_oak_button",
        new ButtonBlock(BlockSetType.OAK, 15, OAK_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_oak_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_SPRUCE_BUTTON = register("stripped_spruce_button",
        new ButtonBlock(BlockSetType.SPRUCE, 15, SPRUCE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_spruce_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );
    
    public static final Block STRIPPED_BIRCH_BUTTON = register("stripped_birch_button",
        new ButtonBlock(BlockSetType.BIRCH, 15, BIRCH_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_birch_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_JUNGLE_BUTTON = register("stripped_jungle_button",
        new ButtonBlock(BlockSetType.JUNGLE, 15, JUNGLE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_jungle_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_ACACIA_BUTTON = register("stripped_acacia_button",
        new ButtonBlock(BlockSetType.ACACIA, 15, ACACIA_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_acacia_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );
    
    public static final Block STRIPPED_DARK_OAK_BUTTON = register("stripped_dark_oak_button",
        new ButtonBlock(BlockSetType.DARK_OAK, 15, DARK_OAK_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_dark_oak_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );
    
    public static final Block STRIPPED_MANGROVE_BUTTON = register("stripped_mangrove_button",
        new ButtonBlock(BlockSetType.MANGROVE, 15, MANGROVE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_mangrove_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );
    
    public static final Block STRIPPED_CHERRY_BUTTON = register("stripped_cherry_button",
        new ButtonBlock(BlockSetType.CHERRY, 15, CHERRY_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_cherry_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );
    
    public static final Block STRIPPED_WARPED_BUTTON = register("stripped_warped_button",
        new ButtonBlock(BlockSetType.WARPED, 15, WARPED_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_warped_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );
    
    public static final Block STRIPPED_CRIMSON_BUTTON = register("stripped_crimson_button",
        new ButtonBlock(BlockSetType.CRIMSON, 15, CRIMSON_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_crimson_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );
    
    public static final Block STRIPPED_PALE_OAK_BUTTON = register("stripped_pale_oak_button",
        new ButtonBlock(BlockSetType.PALE_OAK, 15, PALE_OAK_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_pale_oak_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );
    
    // endregion

    // region Stone

    public static final Block DIORITE_BUTTON = register("diorite_button",
        new ButtonBlock(BlockSetType.STONE, 10, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "diorite_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block ANDESITE_BUTTON = register("andesite_button",
        new ButtonBlock(BlockSetType.STONE, 10, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "andesite_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block GRANITE_BUTTON = register("granite_button",
        new ButtonBlock(BlockSetType.STONE, 10, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "granite_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block SANDSTONE_BUTTON = register("sandstone_button",
        new ButtonBlock(BlockSetType.STONE, 10, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "sandstone_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block RED_SANDSTONE_BUTTON = register("red_sandstone_button",
        new ButtonBlock(BlockSetType.STONE, 10, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_sandstone_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block BASALT_BUTTON = register("basalt_button",
        new ButtonBlock(BlockSetType.STONE, 10, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "basalt_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block BLACKSTONE_BUTTON = register("blackstone_button",
        new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 10, POLISHED_BLACKSTONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blackstone_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block CALCITE_BUTTON = register("calcite_button",
        new ButtonBlock(BlockSetType.STONE, 10, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "calcite_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block TUFF_BUTTON = register("tuff_button",
        new ButtonBlock(BlockSetType.STONE, 10, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "tuff_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block DEEPSLATE_BUTTON = register("deepslate_button",
        new ButtonBlock(BlockSetType.STONE, 10, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "deepslate_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block DRIPSTONE_BUTTON = register("dripstone_button",
        new ButtonBlock(BlockSetType.STONE, 10, STONE_BUTTON.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dripstone_button")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    // endregion

    // endregion

    // region PRESSURE PLATES:

    // region Metal

    public static final Block COPPER_PRESSURE_PLATE = register("copper_pressure_plate",
        new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.GOLD, OAK_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "copper_pressure_plate")))
        )
    );

    public static final Block WAXED_COPPER_PRESSURE_PLATE = register("waxed_copper_pressure_plate",
        new PressurePlateBlock(BlockSetType.GOLD, LIGHT_WEIGHTED_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_copper_pressure_plate")))
        )
    );

    public static final Block EXPOSED_COPPER_PRESSURE_PLATE = register("exposed_copper_pressure_plate",
        new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.GOLD, LIGHT_WEIGHTED_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "exposed_copper_pressure_plate")))
        )
    );

    public static final Block WAXED_EXPOSED_COPPER_PRESSURE_PLATE = register("waxed_exposed_copper_pressure_plate",
        new PressurePlateBlock(BlockSetType.GOLD, LIGHT_WEIGHTED_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_exposed_copper_pressure_plate")))
        )
    );

    public static final Block WEATHERED_COPPER_PRESSURE_PLATE = register("weathered_copper_pressure_plate",
        new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.GOLD, HEAVY_WEIGHTED_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "weathered_copper_pressure_plate")))
        )
    );

    public static final Block WAXED_WEATHERED_COPPER_PRESSURE_PLATE = register("waxed_weathered_copper_pressure_plate",
        new PressurePlateBlock(BlockSetType.GOLD, HEAVY_WEIGHTED_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_weathered_copper_pressure_plate")))
        )
    );

    public static final Block OXIDIZED_COPPER_PRESSURE_PLATE = register("oxidized_copper_pressure_plate",
        new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.GOLD, HEAVY_WEIGHTED_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oxidized_copper_pressure_plate")))
        )
    );

    public static final Block WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = register("waxed_oxidized_copper_pressure_plate",
        new PressurePlateBlock(BlockSetType.GOLD, HEAVY_WEIGHTED_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_oxidized_copper_pressure_plate")))
        )
    );

    public static final Block NETHERITE_PRESSURE_PLATE = register("netherite_pressure_plate",
        new PressurePlateBlock(BlockSetType.GOLD, NETHERITE_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "netherite_pressure_plate")))
        )
    );

    // endregion

    // region Wood

    public static final Block OAK_WOOD_PRESSURE_PLATE = register("oak_wood_pressure_plate",
        new PressurePlateBlock(BlockSetType.OAK, OAK_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oak_wood_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block SPRUCE_WOOD_PRESSURE_PLATE = register("spruce_wood_pressure_plate",
        new PressurePlateBlock(BlockSetType.SPRUCE, SPRUCE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "spruce_wood_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block BIRCH_WOOD_PRESSURE_PLATE = register("birch_wood_pressure_plate",
        new PressurePlateBlock(BlockSetType.BIRCH, BIRCH_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "birch_wood_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block JUNGLE_WOOD_PRESSURE_PLATE = register("jungle_wood_pressure_plate",
        new PressurePlateBlock(BlockSetType.JUNGLE, JUNGLE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "jungle_wood_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block ACACIA_WOOD_PRESSURE_PLATE = register("acacia_wood_pressure_plate",
        new PressurePlateBlock(BlockSetType.ACACIA, ACACIA_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "acacia_wood_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block DARK_OAK_WOOD_PRESSURE_PLATE = register("dark_oak_wood_pressure_plate",
        new PressurePlateBlock(BlockSetType.DARK_OAK, DARK_OAK_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dark_oak_wood_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block MANGROVE_WOOD_PRESSURE_PLATE = register("mangrove_wood_pressure_plate",
        new PressurePlateBlock(BlockSetType.MANGROVE, MANGROVE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "mangrove_wood_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block CHERRY_WOOD_PRESSURE_PLATE = register("cherry_wood_pressure_plate",
        new PressurePlateBlock(BlockSetType.CHERRY, CHERRY_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cherry_wood_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block BAMBOO_BLOCK_PRESSURE_PLATE = register("bamboo_block_pressure_plate",
        new PressurePlateBlock(BlockSetType.BAMBOO, BAMBOO_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "bamboo_block_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block WARPED_HYPHAE_PRESSURE_PLATE = register("warped_hyphae_pressure_plate",
        new PressurePlateBlock(BlockSetType.WARPED, WARPED_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "warped_hyphae_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block CRIMSON_HYPHAE_PRESSURE_PLATE = register("crimson_hyphae_pressure_plate",
        new PressurePlateBlock(BlockSetType.CRIMSON, CRIMSON_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "crimson_hyphae_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block PALE_OAK_WOOD_PRESSURE_PLATE = register("pale_oak_wood_pressure_plate",
        new PressurePlateBlock(BlockSetType.PALE_OAK, PALE_OAK_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pale_oak_wood_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_OAK_PRESSURE_PLATE = register("stripped_oak_pressure_plate",
        new PressurePlateBlock(BlockSetType.OAK, OAK_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_oak_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_SPRUCE_PRESSURE_PLATE = register("stripped_spruce_pressure_plate",
        new PressurePlateBlock(BlockSetType.SPRUCE, SPRUCE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_spruce_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_BIRCH_PRESSURE_PLATE = register("stripped_birch_pressure_plate",
        new PressurePlateBlock(BlockSetType.BIRCH, BIRCH_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_birch_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_JUNGLE_PRESSURE_PLATE = register("stripped_jungle_pressure_plate",
        new PressurePlateBlock(BlockSetType.JUNGLE, JUNGLE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_jungle_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_ACACIA_PRESSURE_PLATE = register("stripped_acacia_pressure_plate",
        new PressurePlateBlock(BlockSetType.ACACIA, ACACIA_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_acacia_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_DARK_OAK_PRESSURE_PLATE = register("stripped_dark_oak_pressure_plate",
        new PressurePlateBlock(BlockSetType.DARK_OAK, DARK_OAK_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_dark_oak_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_MANGROVE_PRESSURE_PLATE = register("stripped_mangrove_pressure_plate",
        new PressurePlateBlock(BlockSetType.MANGROVE, MANGROVE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_mangrove_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_CHERRY_PRESSURE_PLATE = register("stripped_cherry_pressure_plate",
        new PressurePlateBlock(BlockSetType.CHERRY, CHERRY_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_cherry_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_WARPED_PRESSURE_PLATE = register("stripped_warped_pressure_plate",
        new PressurePlateBlock(BlockSetType.WARPED, WARPED_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_warped_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_CRIMSON_PRESSURE_PLATE = register("stripped_crimson_pressure_plate",
        new PressurePlateBlock(BlockSetType.CRIMSON, CRIMSON_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_crimson_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block STRIPPED_PALE_OAK_PRESSURE_PLATE = register("stripped_pale_oak_pressure_plate",
        new PressurePlateBlock(BlockSetType.PALE_OAK, PALE_OAK_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_pale_oak_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    // endregion

    // region Stone

    public static final Block DIORITE_PRESSURE_PLATE = register("diorite_pressure_plate",
        new PressurePlateBlock(BlockSetType.STONE, STONE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "diorite_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block ANDESITE_PRESSURE_PLATE = register("andesite_pressure_plate",
        new PressurePlateBlock(BlockSetType.STONE, STONE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "andesite_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block GRANITE_PRESSURE_PLATE = register("granite_pressure_plate",
        new PressurePlateBlock(BlockSetType.STONE, STONE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "granite_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block SANDSTONE_PRESSURE_PLATE = register("sandstone_pressure_plate",
        new PressurePlateBlock(BlockSetType.STONE, STONE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "sandstone_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block RED_SANDSTONE_PRESSURE_PLATE = register("red_sandstone_pressure_plate",
        new PressurePlateBlock(BlockSetType.STONE, STONE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_sandstone_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block BASALT_PRESSURE_PLATE = register("basalt_pressure_plate",
        new PressurePlateBlock(BlockSetType.STONE, STONE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "basalt_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block BLACKSTONE_PRESSURE_PLATE = register("blackstone_pressure_plate",
        new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, STONE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blackstone_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block CALCITE_PRESSURE_PLATE = register("calcite_pressure_plate",
        new PressurePlateBlock(BlockSetType.STONE, STONE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "calcite_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block TUFF_PRESSURE_PLATE = register("tuff_pressure_plate",
        new PressurePlateBlock(BlockSetType.STONE, STONE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "tuff_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block DEEPSLATE_PRESSURE_PLATE = register("deepslate_pressure_plate",
        new PressurePlateBlock(BlockSetType.STONE, STONE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "deepslate_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    public static final Block DRIPSTONE_PRESSURE_PLATE = register("dripstone_pressure_plate",
        new PressurePlateBlock(BlockSetType.STONE, STONE_PRESSURE_PLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dripstone_pressure_plate")))
            .strength(0.5f)
            .requiresTool()
            .noCollision()
        )
    );

    // endregion

    // endregion

    // region FENCES:

    // region Wood

    public static final Block OAK_WOOD_FENCE = register("oak_wood_fence",
        new FenceBlock(OAK_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oak_wood_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block SPRUCE_WOOD_FENCE = register("spruce_wood_fence",
        new FenceBlock(SPRUCE_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "spruce_wood_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block BIRCH_WOOD_FENCE = register("birch_wood_fence",
        new FenceBlock(BIRCH_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "birch_wood_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block JUNGLE_WOOD_FENCE = register("jungle_wood_fence",
        new FenceBlock(JUNGLE_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "jungle_wood_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block ACACIA_WOOD_FENCE = register("acacia_wood_fence",
        new FenceBlock(ACACIA_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "acacia_wood_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block DARK_OAK_WOOD_FENCE = register("dark_oak_wood_fence",
        new FenceBlock(DARK_OAK_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dark_oak_wood_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block MANGROVE_WOOD_FENCE = register("mangrove_wood_fence",
        new FenceBlock(MANGROVE_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "mangrove_wood_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block CHERRY_WOOD_FENCE = register("cherry_wood_fence",
        new FenceBlock(CHERRY_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cherry_wood_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block BAMBOO_BLOCK_FENCE = register("bamboo_block_fence",
        new FenceBlock(BAMBOO_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "bamboo_block_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block WARPED_HYPHAE_FENCE = register("warped_hyphae_fence",
        new FenceBlock(WARPED_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "warped_hyphae_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block CRIMSON_HYPHAE_FENCE = register("crimson_hyphae_fence",
        new FenceBlock(CRIMSON_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "crimson_hyphae_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block PALE_OAK_WOOD_FENCE = register("pale_oak_wood_fence",
        new FenceBlock(PALE_OAK_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pale_oak_wood_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_OAK_FENCE = register("stripped_oak_fence",
        new FenceBlock(OAK_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_oak_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_SPRUCE_FENCE = register("stripped_spruce_fence",
        new FenceBlock(SPRUCE_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_spruce_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_BIRCH_FENCE = register("stripped_birch_fence",
        new FenceBlock(BIRCH_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_birch_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_JUNGLE_FENCE = register("stripped_jungle_fence",
        new FenceBlock(JUNGLE_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_jungle_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_ACACIA_FENCE = register("stripped_acacia_fence",
        new FenceBlock(ACACIA_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_acacia_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_DARK_OAK_FENCE = register("stripped_dark_oak_fence",
        new FenceBlock(DARK_OAK_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_dark_oak_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_MANGROVE_FENCE = register("stripped_mangrove_fence",
        new FenceBlock(MANGROVE_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_mangrove_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_CHERRY_FENCE = register("stripped_cherry_fence",
        new FenceBlock(CHERRY_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_cherry_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_WARPED_FENCE = register("stripped_warped_fence",
        new FenceBlock(WARPED_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_warped_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_CRIMSON_FENCE = register("stripped_crimson_fence",
        new FenceBlock(CRIMSON_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_crimson_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_PALE_OAK_FENCE = register("stripped_pale_oak_fence",
        new FenceBlock(PALE_OAK_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_pale_oak_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );

// Stone Fences:

    public static final Block RED_NETHER_BRICK_FENCE = register("red_nether_brick_fence",
        new FenceBlock(NETHER_BRICK_FENCE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_nether_brick_fence")))
            .strength(2.0f)
            .requiresTool()
        )
    );


// Fence Gates:

    public static final Block OAK_WOOD_FENCE_GATE = register("oak_wood_fence_gate",
        new FenceGateBlock(WoodType.OAK, OAK_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oak_wood_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block SPRUCE_WOOD_FENCE_GATE = register("spruce_wood_fence_gate",
        new FenceGateBlock(WoodType.SPRUCE, SPRUCE_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "spruce_wood_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block BIRCH_WOOD_FENCE_GATE = register("birch_wood_fence_gate",
        new FenceGateBlock(WoodType.BIRCH, BIRCH_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "birch_wood_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block JUNGLE_WOOD_FENCE_GATE = register("jungle_wood_fence_gate",
        new FenceGateBlock(WoodType.JUNGLE, JUNGLE_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "jungle_wood_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block ACACIA_WOOD_FENCE_GATE = register("acacia_wood_fence_gate",
        new FenceGateBlock(WoodType.ACACIA, ACACIA_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "acacia_wood_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block DARK_OAK_WOOD_FENCE_GATE = register("dark_oak_wood_fence_gate",
        new FenceGateBlock(WoodType.DARK_OAK, DARK_OAK_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dark_oak_wood_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block MANGROVE_WOOD_FENCE_GATE = register("mangrove_wood_fence_gate",
        new FenceGateBlock(WoodType.MANGROVE, MANGROVE_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "mangrove_wood_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block CHERRY_WOOD_FENCE_GATE = register("cherry_wood_fence_gate",
        new FenceGateBlock(WoodType.CHERRY, CHERRY_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cherry_wood_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block BAMBOO_BLOCK_FENCE_GATE = register("bamboo_block_fence_gate",
        new FenceGateBlock(WoodType.BAMBOO, BAMBOO_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "bamboo_block_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block WARPED_HYPHAE_FENCE_GATE = register("warped_hyphae_fence_gate",
        new FenceGateBlock(WoodType.WARPED, WARPED_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "warped_hyphae_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block CRIMSON_HYPHAE_FENCE_GATE = register("crimson_hyphae_fence_gate",
        new FenceGateBlock(WoodType.CRIMSON, CRIMSON_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "crimson_hyphae_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block PALE_OAK_WOOD_FENCE_GATE = register("pale_oak_wood_fence_gate",
        new FenceGateBlock(WoodType.PALE_OAK, PALE_OAK_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pale_oak_wood_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_OAK_FENCE_GATE = register("stripped_oak_fence_gate",
        new FenceGateBlock(WoodType.OAK, OAK_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_oak_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_SPRUCE_FENCE_GATE = register("stripped_spruce_fence_gate",
        new FenceGateBlock(WoodType.SPRUCE, SPRUCE_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_spruce_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_BIRCH_FENCE_GATE = register("stripped_birch_fence_gate",
        new FenceGateBlock(WoodType.BIRCH, BIRCH_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_birch_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_JUNGLE_FENCE_GATE = register("stripped_jungle_fence_gate",
        new FenceGateBlock(WoodType.JUNGLE, JUNGLE_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_jungle_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_ACACIA_FENCE_GATE = register("stripped_acacia_fence_gate",
        new FenceGateBlock(WoodType.ACACIA, ACACIA_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_acacia_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_DARK_OAK_FENCE_GATE = register("stripped_dark_oak_fence_gate",
        new FenceGateBlock(WoodType.DARK_OAK, DARK_OAK_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_dark_oak_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_MANGROVE_FENCE_GATE = register("stripped_mangrove_fence_gate",
        new FenceGateBlock(WoodType.MANGROVE, MANGROVE_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_mangrove_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_CHERRY_FENCE_GATE = register("stripped_cherry_fence_gate",
        new FenceGateBlock(WoodType.CHERRY, CHERRY_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_cherry_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_WARPED_FENCE_GATE = register("stripped_warped_fence_gate",
        new FenceGateBlock(WoodType.WARPED, WARPED_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_warped_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_CRIMSON_FENCE_GATE = register("stripped_crimson_fence_gate",
        new FenceGateBlock(WoodType.CRIMSON, CRIMSON_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_crimson_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block STRIPPED_PALE_OAK_FENCE_GATE = register("stripped_pale_oak_fence_gate",
        new FenceGateBlock(WoodType.PALE_OAK, PALE_OAK_FENCE_GATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_pale_oak_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    // endregion

    // region Stone

    public static final Block NETHER_BRICK_FENCE_GATE = register("nether_brick_fence_gate",
        new FenceGateBlock(WoodType.CRIMSON, NETHER_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "nether_brick_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    public static final Block RED_NETHER_BRICK_FENCE_GATE = register("red_nether_brick_fence_gate",
        new FenceGateBlock(WoodType.CRIMSON, RED_NETHER_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_nether_brick_fence_gate")))
            .strength(2.0f)
            .requiresTool()
        )
    );

    // endregion

    // endregion

    // region WALLS:

    // region Wood

    public static final Block OAK_WALL = register("oak_wall",
        new WallBlock(OAK_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oak_wall")))
        )
    );

    public static final Block SPRUCE_WALL = register("spruce_wall",
        new WallBlock(SPRUCE_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "spruce_wall")))
        )
    );

    public static final Block BIRCH_WALL = register("birch_wall",
        new WallBlock(BIRCH_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "birch_wall")))
        )
    );

    public static final Block JUNGLE_WALL = register("jungle_wall",
        new WallBlock(JUNGLE_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "jungle_wall")))
        )
    );

    public static final Block ACACIA_WALL = register("acacia_wall",
        new WallBlock(ACACIA_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "acacia_wall")))
        )
    );

    public static final Block DARK_OAK_WALL = register("dark_oak_wall",
        new WallBlock(DARK_OAK_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dark_oak_wall")))
        )
    );

    public static final Block MANGROVE_WALL = register("mangrove_wall",
        new WallBlock(MANGROVE_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "mangrove_wall")))
        )
    );

    public static final Block CHERRY_WALL = register("cherry_wall",
        new WallBlock(CHERRY_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cherry_wall")))
        )
    );

    public static final Block BAMBOO_WALL = register("bamboo_wall",
        new WallBlock(BAMBOO_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "bamboo_wall")))
        )
    );

    public static final Block WARPED_WALL = register("warped_wall",
        new WallBlock(WARPED_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "warped_wall")))
        )
    );

    public static final Block CRIMSON_WALL = register("crimson_wall",
        new WallBlock(CRIMSON_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "crimson_wall")))
        )
    );

    public static final Block PALE_OAK_WALL = register("pale_oak_wall",
        new WallBlock(PALE_OAK_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pale_oak_wall")))
        )
    );

    public static final Block OAK_WOOD_WALL = register("oak_wood_wall",
        new WallBlock(OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oak_wood_wall")))
        )
    );

    public static final Block SPRUCE_WOOD_WALL = register("spruce_wood_wall",
        new WallBlock(SPRUCE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "spruce_wood_wall")))
        )
    );

    public static final Block BIRCH_WOOD_WALL = register("birch_wood_wall",
        new WallBlock(BIRCH_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "birch_wood_wall")))
        )
    );

    public static final Block JUNGLE_WOOD_WALL = register("jungle_wood_wall",
        new WallBlock(JUNGLE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "jungle_wood_wall")))
        )
    );

    public static final Block ACACIA_WOOD_WALL = register("acacia_wood_wall",
        new WallBlock(ACACIA_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "acacia_wood_wall")))
        )
    );

    public static final Block DARK_OAK_WOOD_WALL = register("dark_oak_wood_wall",
        new WallBlock(DARK_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dark_oak_wood_wall")))
        )
    );

    public static final Block MANGROVE_WOOD_WALL = register("mangrove_wood_wall",
        new WallBlock(MANGROVE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "mangrove_wood_wall")))
        )
    );

    public static final Block CHERRY_WOOD_WALL = register("cherry_wood_wall",
        new WallBlock(CHERRY_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cherry_wood_wall")))
        )
    );

    public static final Block BAMBOO_BLOCK_WALL = register("bamboo_block_wall",
        new WallBlock(BAMBOO_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "bamboo_block_wall")))
        )
    );

    public static final Block WARPED_HYPHAE_WALL = register("warped_hyphae_wall",
        new WallBlock(WARPED_HYPHAE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "warped_hyphae_wall")))
        )
    );

    public static final Block CRIMSON_HYPHAE_WALL = register("crimson_hyphae_wall",
        new WallBlock(CRIMSON_HYPHAE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "crimson_hyphae_wall")))
        )
    );

    public static final Block PALE_OAK_WOOD_WALL = register("pale_oak_wood_wall",
        new WallBlock(PALE_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pale_oak_wood_wall")))
        )
    );

    public static final Block STRIPPED_OAK_WALL = register("stripped_oak_wall",
        new WallBlock(STRIPPED_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_oak_wall")))
        )
    );

    public static final Block STRIPPED_SPRUCE_WALL = register("stripped_spruce_wall",
        new WallBlock(STRIPPED_SPRUCE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_spruce_wall")))
        )
    );

    public static final Block STRIPPED_BIRCH_WALL = register("stripped_birch_wall",
        new WallBlock(STRIPPED_BIRCH_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_birch_wall")))
        )
    );

    public static final Block STRIPPED_JUNGLE_WALL = register("stripped_jungle_wall",
        new WallBlock(STRIPPED_JUNGLE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_jungle_wall")))
        )
    );

    public static final Block STRIPPED_ACACIA_WALL = register("stripped_acacia_wall",
        new WallBlock(STRIPPED_ACACIA_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_acacia_wall")))
        )
    );

    public static final Block STRIPPED_DARK_OAK_WALL = register("stripped_dark_oak_wall",
        new WallBlock(STRIPPED_DARK_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_dark_oak_wall")))
        )
    );

    public static final Block STRIPPED_MANGROVE_WALL = register("stripped_mangrove_wall",
        new WallBlock(MANGROVE_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_mangrove_wall")))
        )
    );

    public static final Block STRIPPED_CHERRY_WALL = register("stripped_cherry_wall",
        new WallBlock(STRIPPED_CHERRY_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_cherry_wall")))
        )
    );

    public static final Block STRIPPED_BAMBOO_WALL = register("stripped_bamboo_wall",
        new WallBlock(BAMBOO_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_bamboo_wall")))
        )
    );

    public static final Block STRIPPED_WARPED_WALL = register("stripped_warped_wall",
        new WallBlock(STRIPPED_WARPED_HYPHAE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_warped_wall")))
        )
    );

    public static final Block STRIPPED_CRIMSON_WALL = register("stripped_crimson_wall",
        new WallBlock(STRIPPED_CRIMSON_HYPHAE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_crimson_wall")))
        )
    );

    public static final Block STRIPPED_PALE_OAK_WALL = register("stripped_pale_oak_wall",
        new WallBlock(STRIPPED_PALE_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_pale_oak_wall")))
        )
    );

    // endregion

    // region Ice

    public static final Block ICE_WALL = register("ice_wall",
        new IceWallBlock(ICE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "ice_wall")))
        )
    );

    public static final Block PACKED_ICE_WALL = register("packed_ice_wall",
        new WallBlock(PACKED_ICE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "packed_ice_wall")))
        )
    );

    public static final Block BLUE_ICE_WALL = register("blue_ice_wall",
        new WallBlock(BLUE_ICE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blue_ice_wall")))
        )
    );

    // endregion

    // region Metal

    public static final Block COPPER_WALL = register("copper_wall",
        new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, COPPER_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "copper_wall")))
        )
    );

    public static final Block WAXED_COPPER_WALL = register("waxed_copper_wall",
        new WallBlock(COPPER_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_copper_wall")))
        )
    );

    public static final Block EXPOSED_COPPER_WALL = register("exposed_copper_wall",
        new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, EXPOSED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "exposed_copper_wall")))
        )
    );

    public static final Block WAXED_EXPOSED_COPPER_WALL = register("waxed_exposed_copper_wall",
        new WallBlock(EXPOSED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_exposed_copper_wall")))
        )
    );

    public static final Block WEATHERED_COPPER_WALL = register("weathered_copper_wall",
        new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, WEATHERED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "weathered_copper_wall")))
        )
    );

    public static final Block WAXED_WEATHERED_COPPER_WALL = register("waxed_weathered_copper_wall",
        new WallBlock(WEATHERED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_weathered_copper_wall")))
        )
    );

    public static final Block OXIDIZED_COPPER_WALL = register("oxidized_copper_wall",
        new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, OXIDIZED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oxidized_copper_wall")))
        )
    );

    public static final Block WAXED_OXIDIZED_COPPER_WALL = register("waxed_oxidized_copper_wall",
        new WallBlock(OXIDIZED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_oxidized_copper_wall")))
        )
    );

    public static final Block CUT_COPPER_WALL = register("cut_copper_wall",
        new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, CUT_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cut_copper_wall")))
        )
    );

    public static final Block WAXED_CUT_COPPER_WALL = register("waxed_cut_copper_wall",
        new WallBlock(CUT_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_cut_copper_wall")))
        )
    );

    public static final Block EXPOSED_CUT_COPPER_WALL = register("exposed_cut_copper_wall",
        new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, EXPOSED_CUT_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "exposed_cut_copper_wall")))
        )
    );

    public static final Block WAXED_EXPOSED_CUT_COPPER_WALL = register("waxed_exposed_cut_copper_wall",
        new WallBlock(EXPOSED_CUT_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_exposed_cut_copper_wall")))
        )
    );

    public static final Block WEATHERED_CUT_COPPER_WALL = register("weathered_cut_copper_wall",
        new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, WEATHERED_CUT_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "weathered_cut_copper_wall")))
        )
    );

    public static final Block WAXED_WEATHERED_CUT_COPPER_WALL = register("waxed_weathered_cut_copper_wall",
        new WallBlock(WEATHERED_CUT_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_weathered_cut_copper_wall")))
        )
    );

    public static final Block OXIDIZED_CUT_COPPER_WALL = register("oxidized_cut_copper_wall",
        new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, OXIDIZED_CUT_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oxidized_cut_copper_wall")))
        )
    );

    public static final Block WAXED_OXIDIZED_CUT_COPPER_WALL = register("waxed_oxidized_cut_copper_wall",
        new WallBlock(OXIDIZED_CUT_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_oxidized_cut_copper_wall")))
        )
    );

    public static final Block CHISELED_COPPER_WALL = register("chiseled_copper_wall",
        new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, COPPER_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_copper_wall")))
        )
    );

    public static final Block WAXED_CHISELED_COPPER_WALL = register("waxed_chiseled_copper_wall",
        new WallBlock(COPPER_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_chiseled_copper_wall")))
        )
    );

    public static final Block EXPOSED_CHISELED_COPPER_WALL = register("exposed_chiseled_copper_wall",
        new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, EXPOSED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "exposed_chiseled_copper_wall")))
        )
    );

    public static final Block WAXED_EXPOSED_CHISELED_COPPER_WALL = register("waxed_exposed_chiseled_copper_wall",
        new WallBlock(EXPOSED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_exposed_chiseled_copper_wall")))
        )
    );

    public static final Block WEATHERED_CHISELED_COPPER_WALL = register("weathered_chiseled_copper_wall",
        new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, WEATHERED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "weathered_chiseled_copper_wall")))
        )
    );

    public static final Block WAXED_WEATHERED_CHISELED_COPPER_WALL = register("waxed_weathered_chiseled_copper_wall",
        new WallBlock(WEATHERED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_weathered_chiseled_copper_wall")))
        )
    );

    public static final Block OXIDIZED_CHISELED_COPPER_WALL = register("oxidized_chiseled_copper_wall",
        new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, OXIDIZED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oxidized_chiseled_copper_wall")))
        )
    );

    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_WALL = register("waxed_oxidized_chiseled_copper_wall",
        new WallBlock(OXIDIZED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_oxidized_chiseled_copper_wall")))
        )
    );

    public static final Block IRON_WALL = register("iron_wall",
        new WallBlock(IRON_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "iron_wall")))
        )
    );

    public static final Block GOLD_WALL = register("gold_wall",
        new WallBlock(GOLD_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gold_wall")))
        )
    );

    public static final Block NETHERITE_WALL = register("netherite_wall",
        new WallBlock(NETHERITE_BLOCK.getSettings().sounds(BlockSoundGroup.NETHERITE)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "netherite_wall")))
        )
    );

    // endregion

    // region Stone

    public static final Block STONE_WALL = register("stone_wall",
        new WallBlock(STONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stone_wall")))
        )
    );

    public static final Block CHISELED_STONE_BRICK_WALL = register("chiseled_stone_brick_wall",
        new WallBlock(CHISELED_STONE_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_stone_brick_wall")))
        )
    );

    public static final Block CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall",
        new WallBlock(CRACKED_STONE_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_stone_brick_wall")))
        )
    );

    public static final Block SMOOTH_STONE_WALL = register("smooth_stone_wall",
        new WallBlock(SMOOTH_STONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "smooth_stone_wall")))
        )
    );

    public static final Block POLISHED_DIORITE_WALL = register("polished_diorite_wall",
        new WallBlock(POLISHED_DIORITE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "polished_diorite_wall")))
        )
    );

    public static final Block POLISHED_ANDESITE_WALL = register("polished_andesite_wall",
        new WallBlock(POLISHED_ANDESITE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "polished_andesite_wall")))
        )
    );

    public static final Block POLISHED_GRANITE_WALL = register("polished_granite_wall",
        new WallBlock(POLISHED_GRANITE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "polished_granite_wall")))
        )
    );

    public static final Block CHISELED_SANDSTONE_WALL = register("chiseled_sandstone_wall",
        new WallBlock(CHISELED_SANDSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_sandstone_wall")))
        )
    );

    public static final Block CUT_SANDSTONE_WALL = register("cut_sandstone_wall",
        new WallBlock(CUT_SANDSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cut_sandstone_wall")))
        )
    );

    public static final Block SMOOTH_SANDSTONE_WALL = register("smooth_sandstone_wall",
        new WallBlock(SMOOTH_SANDSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "smooth_sandstone_wall")))
        )
    );

    public static final Block CHISELED_RED_SANDSTONE_WALL = register("chiseled_red_sandstone_wall",
        new WallBlock(CHISELED_RED_SANDSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_red_sandstone_wall")))
        )
    );

    public static final Block CUT_RED_SANDSTONE_WALL = register("cut_red_sandstone_wall",
        new WallBlock(CUT_RED_SANDSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cut_red_sandstone_wall")))
        )
    );

    public static final Block SMOOTH_RED_SANDSTONE_WALL = register("smooth_red_sandstone_wall",
        new WallBlock(SMOOTH_RED_SANDSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "smooth_red_sandstone_wall")))
        )
    );

    public static final Block BASALT_WALL = register("basalt_wall",
        new WallBlock(BASALT.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "basalt_wall")))
        )
    );

    public static final Block SMOOTH_BASALT_WALL = register("smooth_basalt_wall",
        new WallBlock(SMOOTH_BASALT.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "smooth_basalt_wall")))
        )
    );

    public static final Block POLISHED_BASALT_WALL = register("polished_basalt_wall",
        new WallBlock(POLISHED_BASALT.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "polished_basalt_wall")))
        )
    );

    public static final Block CHISELED_POLISHED_BLACKSTONE_WALL = register("chiseled_polished_blackstone_wall",
        new WallBlock(CHISELED_POLISHED_BLACKSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_polished_blackstone_wall")))
        )
    );

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = register("cracked_polished_blackstone_brick_wall",
        new WallBlock(CRACKED_POLISHED_BLACKSTONE_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_polished_blackstone_brick_wall")))
        )
    );

    public static final Block CALCITE_WALL = register("calcite_wall",
        new WallBlock(CALCITE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "calcite_wall")))
        )
    );

    public static final Block CHISELED_TUFF_WALL = register("chiseled_tuff_wall",
        new WallBlock(CHISELED_TUFF.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_tuff_wall")))
        )
    );

    public static final Block CHISELED_TUFF_BRICK_WALL = register("chiseled_tuff_brick_wall",
        new WallBlock(CHISELED_TUFF_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_tuff_brick_wall")))
        )
    );

    public static final Block DEEPSLATE_WALL = register("deepslate_wall",
        new WallBlock(DEEPSLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "deepslate_wall")))
        )
    );

    public static final Block CHISELED_DEEPSLATE_WALL = register("chiseled_deepslate_wall",
        new WallBlock(CHISELED_DEEPSLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_deepslate_wall")))
        )
    );

    public static final Block CRACKED_DEEPSLATE_BRICK_WALL = register("cracked_deepslate_brick_wall",
        new WallBlock(CRACKED_DEEPSLATE_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_deepslate_brick_wall")))
        )
    );

    public static final Block CRACKED_DEEPSLATE_TILE_WALL = register("cracked_deepslate_tile_wall",
        new WallBlock(CRACKED_DEEPSLATE_TILES.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_deepslate_tile_wall")))
        )
    );

    public static final Block DRIPSTONE_WALL = register("dripstone_wall",
        new WallBlock(DRIPSTONE_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dripstone_wall")))
        )
    );

    public static final Block PRISMARINE_BRICK_WALL = register("prismarine_brick_wall",
        new WallBlock(PRISMARINE_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "prismarine_brick_wall")))
        )
    );

    public static final Block DARK_PRISMARINE_WALL = register("dark_prismarine_wall",
        new WallBlock(DARK_PRISMARINE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dark_prismarine_wall")))
        )
    );

    public static final Block CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall",
        new WallBlock(CRACKED_NETHER_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_nether_brick_wall")))
        )
    );

    public static final Block CHISELED_NETHER_BRICK_WALL = register("chiseled_nether_brick_wall",
        new WallBlock(CHISELED_NETHER_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_nether_brick_wall")))
        )
    );

    public static final Block QUARTZ_WALL = register("quartz_wall",
        new WallBlock(QUARTZ_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "quartz_wall")))
        )
    );

    public static final Block QUARTZ_BRICK_WALL = register("quartz_brick_wall",
        new WallBlock(QUARTZ_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "quartz_brick_wall")))
        )
    );

    public static final Block CHISELED_QUARTZ_WALL = register("chiseled_quartz_wall",
        new WallBlock(CHISELED_QUARTZ_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_quartz_wall")))
        )
    );

    public static final Block SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall",
        new WallBlock(SMOOTH_QUARTZ.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "smooth_quartz_wall")))
        )
    );

    public static final Block QUARTZ_PILLAR_WALL = register("quartz_pillar_wall",
        new WallBlock(QUARTZ_PILLAR.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "quartz_pillar_wall")))
        )
    );

    public static final Block END_STONE_WALL = register("end_stone_wall",
        new WallBlock(END_STONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "end_stone_wall")))
        )
    );

    public static final Block PURPUR_WALL = register("purpur_wall",
        new WallBlock(PURPUR_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purpur_wall")))
        )
    );

    public static final Block PURPUR_PILLAR_WALL = register("purpur_pillar_wall",
        new WallBlock(PURPUR_PILLAR.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purpur_pillar_wall")))
        )
    );

    public static final Block OBSIDIAN_WALL = register("obsidian_wall",
        new WallBlock(OBSIDIAN.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "obsidian_wall")))
        )
    );

    public static final Block CRYING_OBSIDIAN_WALL = register("crying_obsidian_wall",
        new WallBlock(CRYING_OBSIDIAN.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "crying_obsidian_wall")))
        )
    );

    // endregion

    // region Concrete

    public static final Block BLACK_CONCRETE_WALL = register("black_concrete_wall",
        new WallBlock(BLACK_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "black_concrete_wall")))
        )
    );

    public static final Block BLUE_CONCRETE_WALL = register("blue_concrete_wall",
        new WallBlock(BLUE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blue_concrete_wall")))
        )
    );

    public static final Block BROWN_CONCRETE_WALL = register("brown_concrete_wall",
        new WallBlock(BROWN_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "brown_concrete_wall")))
        )
    );

    public static final Block CYAN_CONCRETE_WALL = register("cyan_concrete_wall",
        new WallBlock(CYAN_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cyan_concrete_wall")))
        )
    );

    public static final Block GRAY_CONCRETE_WALL = register("gray_concrete_wall",
        new WallBlock(GRAY_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gray_concrete_wall")))
        )
    );

    public static final Block GREEN_CONCRETE_WALL = register("green_concrete_wall",
        new WallBlock(GREEN_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "green_concrete_wall")))
        )
    );

    public static final Block LIGHT_BLUE_CONCRETE_WALL = register("light_blue_concrete_wall",
        new WallBlock(LIGHT_BLUE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_blue_concrete_wall")))
        )
    );

    public static final Block LIGHT_GRAY_CONCRETE_WALL = register("light_gray_concrete_wall",
        new WallBlock(LIGHT_GRAY_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_gray_concrete_wall")))
        )
    );

    public static final Block LIME_CONCRETE_WALL = register("lime_concrete_wall",
        new WallBlock(LIME_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "lime_concrete_wall")))
        )
    );

    public static final Block MAGENTA_CONCRETE_WALL = register("magenta_concrete_wall",
        new WallBlock(MAGENTA_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "magenta_concrete_wall")))
        )
    );

    public static final Block ORANGE_CONCRETE_WALL = register("orange_concrete_wall",
        new WallBlock(ORANGE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "orange_concrete_wall")))
        )
    );

    public static final Block PINK_CONCRETE_WALL = register("pink_concrete_wall",
        new WallBlock(PINK_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pink_concrete_wall")))
        )
    );

    public static final Block PURPLE_CONCRETE_WALL = register("purple_concrete_wall",
        new WallBlock(PURPLE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purple_concrete_wall")))
        )
    );

    public static final Block RED_CONCRETE_WALL = register("red_concrete_wall",
        new WallBlock(RED_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_concrete_wall")))
        )
    );

    public static final Block WHITE_CONCRETE_WALL = register("white_concrete_wall",
        new WallBlock(WHITE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "white_concrete_wall")))
        )
    );

    public static final Block YELLOW_CONCRETE_WALL = register("yellow_concrete_wall",
        new WallBlock(YELLOW_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "yellow_concrete_wall")))
        )
    );

    // endregion

    // region Terracotta

    public static final Block TERRACOTTA_WALL = register("terracotta_wall",
        new WallBlock(TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "terracotta_wall")))
        )
    );

    public static final Block BLACK_TERRACOTTA_WALL = register("black_terracotta_wall",
        new WallBlock(BLACK_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "black_terracotta_wall")))
        )
    );

    public static final Block BLACK_GLAZED_TERRACOTTA_WALL = register("black_glazed_terracotta_wall",
        new WallBlock(BLACK_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "black_glazed_terracotta_wall")))
        )
    );

    public static final Block BLUE_TERRACOTTA_WALL = register("blue_terracotta_wall",
        new WallBlock(BLUE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blue_terracotta_wall")))
        )
    );

    public static final Block BLUE_GLAZED_TERRACOTTA_WALL = register("blue_glazed_terracotta_wall",
        new WallBlock(BLUE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blue_glazed_terracotta_wall")))
        )
    );

    public static final Block BROWN_TERRACOTTA_WALL = register("brown_terracotta_wall",
        new WallBlock(BROWN_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "brown_terracotta_wall")))
        )
    );

    public static final Block BROWN_GLAZED_TERRACOTTA_WALL = register("brown_glazed_terracotta_wall",
        new WallBlock(BROWN_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "brown_glazed_terracotta_wall")))
        )
    );

    public static final Block CYAN_TERRACOTTA_WALL = register("cyan_terracotta_wall",
        new WallBlock(CYAN_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cyan_terracotta_wall")))
        )
    );

    public static final Block CYAN_GLAZED_TERRACOTTA_WALL = register("cyan_glazed_terracotta_wall",
        new WallBlock(CYAN_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cyan_glazed_terracotta_wall")))
        )
    );

    public static final Block GRAY_TERRACOTTA_WALL = register("gray_terracotta_wall",
        new WallBlock(GRAY_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gray_terracotta_wall")))
        )
    );

    public static final Block GRAY_GLAZED_TERRACOTTA_WALL = register("gray_glazed_terracotta_wall",
        new WallBlock(GRAY_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gray_glazed_terracotta_wall")))
        )
    );

    public static final Block GREEN_TERRACOTTA_WALL = register("green_terracotta_wall",
        new WallBlock(GREEN_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "green_terracotta_wall")))
        )
    );

    public static final Block GREEN_GLAZED_TERRACOTTA_WALL = register("green_glazed_terracotta_wall",
        new WallBlock(GREEN_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "green_glazed_terracotta_wall")))
        )
    );

    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = register("light_blue_terracotta_wall",
        new WallBlock(LIGHT_BLUE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_blue_terracotta_wall")))
        )
    );

    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = register("light_blue_glazed_terracotta_wall",
        new WallBlock(LIGHT_BLUE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_blue_glazed_terracotta_wall")))
        )
    );

    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = register("light_gray_terracotta_wall",
        new WallBlock(LIGHT_GRAY_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_gray_terracotta_wall")))
        )
    );

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = register("light_gray_glazed_terracotta_wall",
        new WallBlock(LIGHT_GRAY_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_gray_glazed_terracotta_wall")))
        )
    );

    public static final Block LIME_TERRACOTTA_WALL = register("lime_terracotta_wall",
        new WallBlock(LIME_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "lime_terracotta_wall")))
        )
    );

    public static final Block LIME_GLAZED_TERRACOTTA_WALL = register("lime_glazed_terracotta_wall",
        new WallBlock(LIME_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "lime_glazed_terracotta_wall")))
        )
    );

    public static final Block MAGENTA_TERRACOTTA_WALL = register("magenta_terracotta_wall",
        new WallBlock(MAGENTA_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "magenta_terracotta_wall")))
        )
    );

    public static final Block MAGENTA_GLAZED_TERRACOTTA_WALL = register("magenta_glazed_terracotta_wall",
        new WallBlock(MAGENTA_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "magenta_glazed_terracotta_wall")))
        )
    );

    public static final Block ORANGE_TERRACOTTA_WALL = register("orange_terracotta_wall",
        new WallBlock(ORANGE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "orange_terracotta_wall")))
        )
    );

    public static final Block ORANGE_GLAZED_TERRACOTTA_WALL = register("orange_glazed_terracotta_wall",
        new WallBlock(ORANGE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "orange_glazed_terracotta_wall")))
        )
    );

    public static final Block PINK_TERRACOTTA_WALL = register("pink_terracotta_wall",
        new WallBlock(PINK_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pink_terracotta_wall")))
        )
    );

    public static final Block PINK_GLAZED_TERRACOTTA_WALL = register("pink_glazed_terracotta_wall",
        new WallBlock(PINK_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pink_glazed_terracotta_wall")))
        )
    );

    public static final Block PURPLE_TERRACOTTA_WALL = register("purple_terracotta_wall",
        new WallBlock(PURPLE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purple_terracotta_wall")))
        )
    );

    public static final Block PURPLE_GLAZED_TERRACOTTA_WALL = register("purple_glazed_terracotta_wall",
        new WallBlock(PURPLE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purple_glazed_terracotta_wall")))
        )
    );

    public static final Block RED_TERRACOTTA_WALL = register("red_terracotta_wall",
        new WallBlock(RED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_terracotta_wall")))
        )
    );

    public static final Block RED_GLAZED_TERRACOTTA_WALL = register("red_glazed_terracotta_wall",
        new WallBlock(RED_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_glazed_terracotta_wall")))
        )
    );

    public static final Block WHITE_TERRACOTTA_WALL = register("white_terracotta_wall",
        new WallBlock(WHITE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "white_terracotta_wall")))
        )
    );

    public static final Block WHITE_GLAZED_TERRACOTTA_WALL = register("white_glazed_terracotta_wall",
        new WallBlock(WHITE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "white_glazed_terracotta_wall")))
        )
    );

    public static final Block YELLOW_TERRACOTTA_WALL = register("yellow_terracotta_wall",
        new WallBlock(YELLOW_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "yellow_terracotta_wall")))
        )
    );

    public static final Block YELLOW_GLAZED_TERRACOTTA_WALL = register("yellow_glazed_terracotta_wall",
        new WallBlock(YELLOW_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "yellow_glazed_terracotta_wall")))
        )
    );

    // endregion

    // endregion

    // region SLABS:

    // region Metal

    public static final Block COPPER_SLAB = register("copper_slab",
        new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, COPPER_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "copper_slab")))
        )
    );

    public static final Block WAXED_COPPER_SLAB = register("waxed_copper_slab",
        new SlabBlock(COPPER_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_copper_slab")))
        )
    );

    public static final Block EXPOSED_COPPER_SLAB = register("exposed_copper_slab",
        new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, EXPOSED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "exposed_copper_slab")))
        )
    );

    public static final Block WAXED_EXPOSED_COPPER_SLAB = register("waxed_exposed_copper_slab",
        new SlabBlock(EXPOSED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_exposed_copper_slab")))
        )
    );

    public static final Block WEATHERED_COPPER_SLAB = register("weathered_copper_slab",
        new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, WEATHERED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "weathered_copper_slab")))
        )
    );

    public static final Block WAXED_WEATHERED_COPPER_SLAB = register("waxed_weathered_copper_slab",
        new SlabBlock(WEATHERED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_weathered_copper_slab")))
        )
    );

    public static final Block OXIDIZED_COPPER_SLAB = register("oxidized_copper_slab",
        new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, OXIDIZED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oxidized_copper_slab")))
        )
    );

    public static final Block WAXED_OXIDIZED_COPPER_SLAB = register("waxed_oxidized_copper_slab",
        new SlabBlock(OXIDIZED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_oxidized_copper_slab")))
        )
    );

    public static final Block CHISELED_COPPER_SLAB = register("chiseled_copper_slab",
        new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, COPPER_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_copper_slab")))
        )
    );

    public static final Block WAXED_CHISELED_COPPER_SLAB = register("waxed_chiseled_copper_slab",
        new SlabBlock(COPPER_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_chiseled_copper_slab")))
        )
    );

    public static final Block EXPOSED_CHISELED_COPPER_SLAB = register("exposed_chiseled_copper_slab",
        new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, EXPOSED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "exposed_chiseled_copper_slab")))
        )
    );

    public static final Block WAXED_EXPOSED_CHISELED_COPPER_SLAB = register("waxed_exposed_chiseled_copper_slab",
        new SlabBlock(EXPOSED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_exposed_chiseled_copper_slab")))
        )
    );

    public static final Block WEATHERED_CHISELED_COPPER_SLAB = register("weathered_chiseled_copper_slab",
        new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, WEATHERED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "weathered_chiseled_copper_slab")))
        )
    );

    public static final Block WAXED_WEATHERED_CHISELED_COPPER_SLAB = register("waxed_weathered_chiseled_copper_slab",
        new SlabBlock(WEATHERED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_weathered_chiseled_copper_slab")))
        )
    );

    public static final Block OXIDIZED_CHISELED_COPPER_SLAB = register("oxidized_chiseled_copper_slab",
        new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, OXIDIZED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oxidized_chiseled_copper_slab")))
        )
    );

    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_SLAB = register("waxed_oxidized_chiseled_copper_slab",
        new SlabBlock(OXIDIZED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_oxidized_chiseled_copper_slab")))
        )
    );

    public static final Block IRON_SLAB = register("iron_slab",
        new SlabBlock(IRON_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "iron_block")))
        )
    );

    public static final Block GOLD_SLAB = register("gold_slab",
        new SlabBlock(GOLD_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gold_block")))
        )
    );

    public static final Block NETHERITE_SLAB = register("netherite_slab",
        new SlabBlock(NETHERITE_BLOCK.getSettings().sounds(BlockSoundGroup.NETHERITE)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "netherite_block")))
        )
    );

    // endregion

    // region Wood

    public static final Block OAK_LOG_SLAB = register("oak_log_slab",
        new SlabBlock(OAK_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oak_log")))
        )
    );

    public static final Block SPRUCE_LOG_SLAB = register("spruce_log_slab",
        new SlabBlock(SPRUCE_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "spruce_log")))
        )
    );

    public static final Block BIRCH_LOG_SLAB = register("birch_log_slab",
        new SlabBlock(BIRCH_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "birch_log")))
        )
    );

    public static final Block JUNGLE_LOG_SLAB = register("jungle_log_slab",
        new SlabBlock(JUNGLE_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "jungle_log")))
        )
    );

    public static final Block ACACIA_LOG_SLAB = register("acacia_log_slab",
        new SlabBlock(ACACIA_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "acacia_log")))
        )
    );

    public static final Block DARK_OAK_LOG_SLAB = register("dark_oak_log_slab",
        new SlabBlock(DARK_OAK_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dark_oak_log")))
        )
    );

    public static final Block MANGROVE_LOG_SLAB = register("mangrove_log_slab",
        new SlabBlock(MANGROVE_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "mangrove_log")))
        )
    );

    public static final Block CHERRY_LOG_SLAB = register("cherry_log_slab",
        new SlabBlock(CHERRY_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cherry_log")))
        )
    );

    public static final Block WARPED_STEM_SLAB = register("warped_stem_slab",
        new SlabBlock(WARPED_STEM.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "warped_stem")))
        )
    );

    public static final Block CRIMSON_STEM_SLAB = register("crimson_stem_slab",
        new SlabBlock(CRIMSON_STEM.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "crimson_stem")))
        )
    );

    public static final Block PALE_OAK_LOG_SLAB = register("pale_oak_log_slab",
        new SlabBlock(PALE_OAK_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pale_oak_log")))
        )
    );

    public static final Block OAK_WOOD_SLAB = register("oak_wood_slab",
        new SlabBlock(OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oak_wood")))
        )
    );

    public static final Block SPRUCE_WOOD_SLAB = register("spruce_wood_slab",
        new SlabBlock(SPRUCE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "spruce_wood")))
        )
    );

    public static final Block BIRCH_WOOD_SLAB = register("birch_wood_slab",
        new SlabBlock(BIRCH_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "birch_wood")))
        )
    );

    public static final Block JUNGLE_WOOD_SLAB = register("jungle_wood_slab",
        new SlabBlock(JUNGLE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "jungle_wood")))
        )
    );

    public static final Block ACACIA_WOOD_SLAB = register("acacia_wood_slab",
        new SlabBlock(ACACIA_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "acacia_wood")))
        )
    );

    public static final Block DARK_OAK_WOOD_SLAB = register("dark_oak_wood_slab",
        new SlabBlock(DARK_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dark_oak_wood")))
        )
    );

    public static final Block MANGROVE_WOOD_SLAB = register("mangrove_wood_slab",
        new SlabBlock(MANGROVE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "mangrove_wood")))
        )
    );

    public static final Block CHERRY_WOOD_SLAB = register("cherry_wood_slab",
        new SlabBlock(CHERRY_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cherry_wood")))
        )
    );

    public static final Block BAMBOO_BLOCK_SLAB = register("bamboo_block_slab",
        new SlabBlock(BAMBOO_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "bamboo_block")))
        )
    );

    public static final Block WARPED_HYPHAE_SLAB = register("warped_hyphae_slab",
        new SlabBlock(WARPED_STEM.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "warped_hyphae")))
        )
    );

    public static final Block CRIMSON_HYPHAE_SLAB = register("crimson_hyphae_slab",
        new SlabBlock(CRIMSON_STEM.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "crimson_hyphae")))
        )
    );

    public static final Block PALE_OAK_WOOD_SLAB = register("pale_oak_wood_slab",
        new SlabBlock(PALE_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pale_oak_wood")))
        )
    );

    public static final Block STRIPPED_OAK_SLAB = register("stripped_oak_slab",
        new SlabBlock(STRIPPED_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_oak")))
        )
    );

    public static final Block STRIPPED_SPRUCE_SLAB = register("stripped_spruce_slab",
        new SlabBlock(STRIPPED_SPRUCE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_spruce")))
        )
    );

    public static final Block STRIPPED_BIRCH_SLAB = register("stripped_birch_slab",
        new SlabBlock(STRIPPED_BIRCH_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_birch")))
        )
    );

    public static final Block STRIPPED_JUNGLE_SLAB = register("stripped_jungle_slab",
        new SlabBlock(STRIPPED_JUNGLE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_jungle")))
        )
    );

    public static final Block STRIPPED_ACACIA_SLAB = register("stripped_acacia_slab",
        new SlabBlock(STRIPPED_ACACIA_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_acacia")))
        )
    );

    public static final Block STRIPPED_DARK_OAK_SLAB = register("stripped_dark_oak_slab",
        new SlabBlock(STRIPPED_DARK_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_dark_oak")))
        )
    );

    public static final Block STRIPPED_MANGROVE_SLAB = register("stripped_mangrove_slab",
        new SlabBlock(MANGROVE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_mangrove")))
        )
    );

    public static final Block STRIPPED_CHERRY_SLAB = register("stripped_cherry_slab",
        new SlabBlock(CHERRY_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_cherry")))
        )
    );

    public static final Block STRIPPED_WARPED_SLAB = register("stripped_warped_slab",
        new SlabBlock(STRIPPED_WARPED_HYPHAE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_warped")))
        )
    );

    public static final Block STRIPPED_CRIMSON_SLAB = register("stripped_crimson_slab",
        new SlabBlock(STRIPPED_CRIMSON_HYPHAE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_crimson")))
        )
    );

    public static final Block STRIPPED_PALE_OAK_SLAB = register("stripped_pale_oak_slab",
        new SlabBlock(STRIPPED_PALE_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_pale_oak")))
        )
    );

    // endregion

    // region Ice

    public static final Block ICE_SLAB = register("ice_slab",
        new IceSlabBlock(ICE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "ice_slab")))
        )
    );

    public static final Block PACKED_ICE_SLAB = register("packed_ice_slab",
        new SlabBlock(PACKED_ICE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "packed_ice_slab")))
        )
    );

    public static final Block BLUE_ICE_SLAB = register("blue_ice_slab",
        new SlabBlock(BLUE_ICE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blue_ice_slab")))
        )
    );

    // endregion

    // region Stone

    public static final Block CHISELED_STONE_BRICK_SLAB = register("chiseled_stone_brick_slab",
        new SlabBlock(CHISELED_STONE_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_stone_brick_slab")))
        )
    );

    public static final Block CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab",
        new SlabBlock(CRACKED_STONE_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_stone_brick_slab")))
        )
    );

    public static final Block CHISELED_SANDSTONE_SLAB = register("chiseled_sandstone_slab",
        new SlabBlock(CHISELED_SANDSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_sandstone_slab")))
        )
    );

    public static final Block CHISELED_RED_SANDSTONE_SLAB = register("chiseled_red_sandstone_slab",
        new SlabBlock(CHISELED_RED_SANDSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_red_sandstone_slab")))
        )
    );

    public static final Block BASALT_SLAB = register("basalt_slab",
        new SlabBlock(BASALT.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "basalt_slab")))
        )
    );

    public static final Block SMOOTH_BASALT_SLAB = register("smooth_basalt_slab",
        new SlabBlock(SMOOTH_BASALT.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "smooth_basalt_slab")))
        )
    );

    public static final Block POLISHED_BASALT_SLAB = register("polished_basalt_slab",
        new SlabBlock(POLISHED_BASALT.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "polished_basalt_slab")))
        )
    );

    public static final Block CHISELED_POLISHED_BLACKSTONE_SLAB = register("chiseled_polished_blackstone_slab",
        new SlabBlock(CHISELED_POLISHED_BLACKSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_polished_blackstone_slab")))
        )
    );

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = register("cracked_polished_blackstone_brick_slab",
        new SlabBlock(CRACKED_POLISHED_BLACKSTONE_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_polished_blackstone_brick_slab")))
        )
    );

    public static final Block CALCITE_SLAB = register("calcite_slab",
        new SlabBlock(CALCITE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "calcite_slab")))
        )
    );

    public static final Block CHISELED_TUFF_SLAB = register("chiseled_tuff_slab",
        new SlabBlock(CHISELED_TUFF.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_tuff_slab")))
        )
    );

    public static final Block CHISELED_TUFF_BRICK_SLAB = register("chiseled_tuff_brick_slab",
        new SlabBlock(CHISELED_TUFF_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_tuff_brick_slab")))
        )
    );

    public static final Block DEEPSLATE_SLAB = register("deepslate_slab",
        new SlabBlock(DEEPSLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "deepslate_slab")))
        )
    );

    public static final Block CHISELED_DEEPSLATE_SLAB = register("chiseled_deepslate_slab",
        new SlabBlock(CHISELED_DEEPSLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_deepslate_slab")))
        )
    );

    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = register("cracked_deepslate_brick_slab",
        new SlabBlock(CRACKED_DEEPSLATE_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_deepslate_brick_slab")))
        )
    );

    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = register("cracked_deepslate_tile_slab",
        new SlabBlock(CRACKED_DEEPSLATE_TILES.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_deepslate_tile_slab")))
        )
    );

    public static final Block DRIPSTONE_SLAB = register("dripstone_slab",
        new SlabBlock(DRIPSTONE_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dripstone_slab")))
        )
    );

    public static final Block CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab",
        new SlabBlock(CRACKED_NETHER_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_nether_brick_slab")))
        )
    );

    public static final Block CHISELED_NETHER_BRICK_SLAB = register("chiseled_nether_brick_slab",
        new SlabBlock(CHISELED_NETHER_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_nether_brick_slab")))
        )
    );

    public static final Block QUARTZ_BRICK_SLAB = register("quartz_brick_slab",
        new SlabBlock(QUARTZ_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "quartz_brick_slab")))
        )
    );

    public static final Block CHISELED_QUARTZ_SLAB = register("chiseled_quartz_slab",
        new SlabBlock(CHISELED_QUARTZ_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_quartz_slab")))
        )
    );

    public static final Block QUARTZ_PILLAR_SLAB = register("quartz_pillar_slab",
        new SlabBlock(QUARTZ_PILLAR.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "quartz_pillar_slab")))
        )
    );

    public static final Block END_STONE_SLAB = register("end_stone_slab",
        new SlabBlock(END_STONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "end_stone_slab")))
        )
    );

    public static final Block PURPUR_PILLAR_SLAB = register("purpur_pillar_slab",
        new SlabBlock(PURPUR_PILLAR.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purpur_pillar_slab")))
        )
    );

    public static final Block OBSIDIAN_SLAB = register("obsidian_slab",
        new SlabBlock(OBSIDIAN.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "obsidian_slab")))
        )
    );

    public static final Block CRYING_OBSIDIAN_SLAB = register("crying_obsidian_slab",
        new SlabBlock(CRYING_OBSIDIAN.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "crying_obsidian_slab")))
        )
    );

    // endregion

    // region Concrete

    public static final Block BLACK_CONCRETE_SLAB = register("black_concrete_slab",
        new SlabBlock(BLACK_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "black_concrete_slab")))
        )
    );

    public static final Block BLUE_CONCRETE_SLAB = register("blue_concrete_slab",
        new SlabBlock(BLUE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blue_concrete_slab")))
        )
    );

    public static final Block BROWN_CONCRETE_SLAB = register("brown_concrete_slab",
        new SlabBlock(BROWN_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "brown_concrete_slab")))
        )
    );

    public static final Block CYAN_CONCRETE_SLAB = register("cyan_concrete_slab",
        new SlabBlock(CYAN_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cyan_concrete_slab")))
        )
    );

    public static final Block GRAY_CONCRETE_SLAB = register("gray_concrete_slab",
        new SlabBlock(GRAY_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gray_concrete_slab")))
        )
    );

    public static final Block GREEN_CONCRETE_SLAB = register("green_concrete_slab",
        new SlabBlock(GREEN_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "green_concrete_slab")))
        )
    );

    public static final Block LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab",
        new SlabBlock(LIGHT_BLUE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_blue_concrete_slab")))
        )
    );

    public static final Block LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab",
        new SlabBlock(LIGHT_GRAY_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_gray_concrete_slab")))
        )
    );

    public static final Block LIME_CONCRETE_SLAB = register("lime_concrete_slab",
        new SlabBlock(LIME_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "lime_concrete_slab")))
        )
    );

    public static final Block MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab",
        new SlabBlock(MAGENTA_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "magenta_concrete_slab")))
        )
    );

    public static final Block ORANGE_CONCRETE_SLAB = register("orange_concrete_slab",
        new SlabBlock(ORANGE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "orange_concrete_slab")))
        )
    );

    public static final Block PINK_CONCRETE_SLAB = register("pink_concrete_slab",
        new SlabBlock(PINK_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pink_concrete_slab")))
        )
    );

    public static final Block PURPLE_CONCRETE_SLAB = register("purple_concrete_slab",
        new SlabBlock(PURPLE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purple_concrete_slab")))
        )
    );

    public static final Block RED_CONCRETE_SLAB = register("red_concrete_slab",
        new SlabBlock(RED_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_concrete_slab")))
        )
    );

    public static final Block WHITE_CONCRETE_SLAB = register("white_concrete_slab",
        new SlabBlock(WHITE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "white_concrete_slab")))
        )
    );

    public static final Block YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab",
        new SlabBlock(YELLOW_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "yellow_concrete_slab")))
        )
    );

    // endregion

    // region Terracotta

    public static final Block TERRACOTTA_SLAB = register("terracotta_slab",
        new SlabBlock(TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "terracotta_slab")))
        )
    );

    public static final Block BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab",
        new SlabBlock(BLACK_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "black_terracotta_slab")))
        )
    );

    public static final Block BLACK_GLAZED_TERRACOTTA_SLAB = register("black_glazed_terracotta_slab",
        new SlabBlock(BLACK_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "black_glazed_terracotta_slab")))
        )
    );

    public static final Block BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab",
        new SlabBlock(BLUE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blue_terracotta_slab")))
        )
    );

    public static final Block BLUE_GLAZED_TERRACOTTA_SLAB = register("blue_glazed_terracotta_slab",
        new SlabBlock(BLUE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blue_glazed_terracotta_slab")))
        )
    );

    public static final Block BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab",
        new SlabBlock(BROWN_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "brown_terracotta_slab")))
        )
    );

    public static final Block BROWN_GLAZED_TERRACOTTA_SLAB = register("brown_glazed_terracotta_slab",
        new SlabBlock(BROWN_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "brown_glazed_terracotta_slab")))
        )
    );

    public static final Block CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab",
        new SlabBlock(CYAN_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cyan_terracotta_slab")))
        )
    );

    public static final Block CYAN_GLAZED_TERRACOTTA_SLAB = register("cyan_glazed_terracotta_slab",
        new SlabBlock(CYAN_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cyan_glazed_terracotta_slab")))
        )
    );

    public static final Block GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab",
        new SlabBlock(GRAY_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gray_terracotta_slab")))
        )
    );

    public static final Block GRAY_GLAZED_TERRACOTTA_SLAB = register("gray_glazed_terracotta_slab",
        new SlabBlock(GRAY_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gray_glazed_terracotta_slab")))
        )
    );

    public static final Block GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab",
        new SlabBlock(GREEN_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "green_terracotta_slab")))
        )
    );

    public static final Block GREEN_GLAZED_TERRACOTTA_SLAB = register("green_glazed_terracotta_slab",
        new SlabBlock(GREEN_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "green_glazed_terracotta_slab")))
        )
    );

    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab",
        new SlabBlock(LIGHT_BLUE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_blue_terracotta_slab")))
        )
    );

    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = register("light_blue_glazed_terracotta_slab",
        new SlabBlock(LIGHT_BLUE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_blue_glazed_terracotta_slab")))
        )
    );

    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab",
        new SlabBlock(LIGHT_GRAY_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_gray_terracotta_slab")))
        )
    );

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = register("light_gray_glazed_terracotta_slab",
        new SlabBlock(LIGHT_GRAY_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_gray_glazed_terracotta_slab")))
        )
    );

    public static final Block LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab",
        new SlabBlock(LIME_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "lime_terracotta_slab")))
        )
    );

    public static final Block LIME_GLAZED_TERRACOTTA_SLAB = register("lime_glazed_terracotta_slab",
        new SlabBlock(LIME_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "lime_glazed_terracotta_slab")))
        )
    );

    public static final Block MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab",
        new SlabBlock(MAGENTA_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "magenta_terracotta_slab")))
        )
    );

    public static final Block MAGENTA_GLAZED_TERRACOTTA_SLAB = register("magenta_glazed_terracotta_slab",
        new SlabBlock(MAGENTA_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "magenta_glazed_terracotta_slab")))
        )
    );

    public static final Block ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab",
        new SlabBlock(ORANGE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "orange_terracotta_slab")))
        )
    );

    public static final Block ORANGE_GLAZED_TERRACOTTA_SLAB = register("orange_glazed_terracotta_slab",
        new SlabBlock(ORANGE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "orange_glazed_terracotta_slab")))
        )
    );

    public static final Block PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab",
        new SlabBlock(PINK_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pink_terracotta_slab")))
        )
    );

    public static final Block PINK_GLAZED_TERRACOTTA_SLAB = register("pink_glazed_terracotta_slab",
        new SlabBlock(PINK_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pink_glazed_terracotta_slab")))
        )
    );

    public static final Block PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab",
        new SlabBlock(PURPLE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purple_terracotta_slab")))
        )
    );

    public static final Block PURPLE_GLAZED_TERRACOTTA_SLAB = register("purple_glazed_terracotta_slab",
        new SlabBlock(PURPLE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purple_glazed_terracotta_slab")))
        )
    );

    public static final Block RED_TERRACOTTA_SLAB = register("red_terracotta_slab",
        new SlabBlock(RED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_terracotta_slab")))
        )
    );

    public static final Block RED_GLAZED_TERRACOTTA_SLAB = register("red_glazed_terracotta_slab",
        new SlabBlock(RED_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_glazed_terracotta_slab")))
        )
    );

    public static final Block WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab",
        new SlabBlock(WHITE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "white_terracotta_slab")))
        )
    );

    public static final Block WHITE_GLAZED_TERRACOTTA_SLAB = register("white_glazed_terracotta_slab",
        new SlabBlock(WHITE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "white_glazed_terracotta_slab")))
        )
    );

    public static final Block YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab",
        new SlabBlock(YELLOW_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "yellow_terracotta_slab")))
        )
    );

    public static final Block YELLOW_GLAZED_TERRACOTTA_SLAB = register("yellow_glazed_terracotta_slab",
        new SlabBlock(YELLOW_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "yellow_glazed_terracotta_slab")))
        )
    );

    // endregion

     // endregion

    // region STAIRS:

    // region Metal

    public static final Block COPPER_STAIRS = register("copper_stairs",
        new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, COPPER_BLOCK.getDefaultState(), COPPER_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "copper_stairs")))
        )
    );

    public static final Block WAXED_COPPER_STAIRS = register("waxed_copper_stairs",
        new StairsBlock(COPPER_BLOCK.getDefaultState(), COPPER_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_copper_stairs")))
        )
    );

    public static final Block EXPOSED_COPPER_STAIRS = register("exposed_copper_stairs",
        new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, EXPOSED_COPPER.getDefaultState(), EXPOSED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "exposed_copper_stairs")))
        )
    );

    public static final Block WAXED_EXPOSED_COPPER_STAIRS = register("waxed_exposed_copper_stairs",
        new StairsBlock(EXPOSED_COPPER.getDefaultState(), EXPOSED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_exposed_copper_stairs")))
        )
    );

    public static final Block WEATHERED_COPPER_STAIRS = register("weathered_copper_stairs",
        new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, WEATHERED_COPPER.getDefaultState(), WEATHERED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "weathered_copper_stairs")))
        )
    );

    public static final Block WAXED_WEATHERED_COPPER_STAIRS = register("waxed_weathered_copper_stairs",
        new StairsBlock(WEATHERED_COPPER.getDefaultState(), WEATHERED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_weathered_copper_stairs")))
        )
    );

    public static final Block OXIDIZED_COPPER_STAIRS = register("oxidized_copper_stairs",
        new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, OXIDIZED_COPPER.getDefaultState(), OXIDIZED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oxidized_copper_stairs")))
        )
    );

    public static final Block WAXED_OXIDIZED_COPPER_STAIRS = register("waxed_oxidized_copper_stairs",
        new StairsBlock(OXIDIZED_COPPER.getDefaultState(), OXIDIZED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_oxidized_copper_stairs")))
        )
    );

    public static final Block CHISELED_COPPER_STAIRS = register("chiseled_copper_stairs",
        new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, COPPER_BLOCK.getDefaultState(), COPPER_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_copper_stairs")))
        )
    );

    public static final Block WAXED_CHISELED_COPPER_STAIRS = register("waxed_chiseled_copper_stairs",
        new StairsBlock(COPPER_BLOCK.getDefaultState(), COPPER_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_chiseled_copper_stairs")))
        )
    );

    public static final Block EXPOSED_CHISELED_COPPER_STAIRS = register("exposed_chiseled_copper_stairs",
        new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, EXPOSED_COPPER.getDefaultState(), EXPOSED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "exposed_chiseled_copper_stairs")))
        )
    );

    public static final Block WAXED_EXPOSED_CHISELED_COPPER_STAIRS = register("waxed_exposed_chiseled_copper_stairs",
        new StairsBlock(EXPOSED_COPPER.getDefaultState(), EXPOSED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_exposed_chiseled_copper_stairs")))
        )
    );

    public static final Block WEATHERED_CHISELED_COPPER_STAIRS = register("weathered_chiseled_copper_stairs",
        new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, WEATHERED_COPPER.getDefaultState(), WEATHERED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "weathered_chiseled_copper_stairs")))
        )
    );

    public static final Block WAXED_WEATHERED_CHISELED_COPPER_STAIRS = register("waxed_weathered_chiseled_copper_stairs",
        new StairsBlock(WEATHERED_COPPER.getDefaultState(), WEATHERED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_weathered_chiseled_copper_stairs")))
        )
    );

    public static final Block OXIDIZED_CHISELED_COPPER_STAIRS = register("oxidized_chiseled_copper_stairs",
        new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, OXIDIZED_COPPER.getDefaultState(), OXIDIZED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oxidized_chiseled_copper_stairs")))
        )
    );

    public static final Block WAXED_OXIDIZED_CHISELED_COPPER_STAIRS = register("waxed_oxidized_chiseled_copper_stairs",
        new StairsBlock(OXIDIZED_COPPER.getDefaultState(), OXIDIZED_COPPER.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "waxed_oxidized_chiseled_copper_stairs")))
        )
    );

    public static final Block IRON_STAIRS = register("iron_stairs",
        new StairsBlock(IRON_BLOCK.getDefaultState(), IRON_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "iron_stairs")))
        )
    );

    public static final Block GOLD_STAIRS = register("gold_stairs",
        new StairsBlock(GOLD_BLOCK.getDefaultState(), GOLD_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gold_stairs")))
        )
    );

    public static final Block NETHERITE_STAIRS = register("netherite_stairs",
        new StairsBlock(NETHERITE_BLOCK.getDefaultState(), NETHERITE_BLOCK.getSettings().sounds(BlockSoundGroup.NETHERITE)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "netherite_stairs")))
        )
    );

    // endregion

    // region Wood

    public static final Block OAK_LOG_STAIRS = register("oak_log_stairs",
        new StairsBlock(OAK_PLANKS.getDefaultState(), OAK_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oak_log_stairs")))
        )
    );

    public static final Block SPRUCE_LOG_STAIRS = register("spruce_log_stairs",
        new StairsBlock(SPRUCE_PLANKS.getDefaultState(), SPRUCE_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "spruce_log_stairs")))
        )
    );

    public static final Block BIRCH_LOG_STAIRS = register("birch_log_stairs",
        new StairsBlock(BIRCH_PLANKS.getDefaultState(), BIRCH_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "birch_log_stairs")))
        )
    );

    public static final Block JUNGLE_LOG_STAIRS = register("jungle_log_stairs",
        new StairsBlock(JUNGLE_PLANKS.getDefaultState(), JUNGLE_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "jungle_log_stairs")))
        )
    );

    public static final Block ACACIA_LOG_STAIRS = register("acacia_log_stairs",
        new StairsBlock(ACACIA_PLANKS.getDefaultState(), ACACIA_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "acacia_log_stairs")))
        )
    );

    public static final Block DARK_OAK_LOG_STAIRS = register("dark_oak_log_stairs",
        new StairsBlock(DARK_OAK_PLANKS.getDefaultState(), DARK_OAK_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dark_oak_log_stairs")))
        )
    );

    public static final Block MANGROVE_LOG_STAIRS = register("mangrove_log_stairs",
        new StairsBlock(MANGROVE_PLANKS.getDefaultState(), MANGROVE_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "mangrove_log_stairs")))
        )
    );

    public static final Block CHERRY_LOG_STAIRS = register("cherry_log_stairs",
        new StairsBlock(CHERRY_PLANKS.getDefaultState(), CHERRY_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cherry_log_stairs")))
        )
    );

    public static final Block WARPED_STEM_STAIRS = register("warped_stem_stairs",
        new StairsBlock(WARPED_STEM.getDefaultState(), WARPED_STEM.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "warped_stem_stairs")))
        )
    );

    public static final Block CRIMSON_STEM_STAIRS = register("crimson_stem_stairs",
        new StairsBlock(CRIMSON_STEM.getDefaultState(), CRIMSON_STEM.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "crimson_stem_stairs")))
        )
    );

    public static final Block PALE_OAK_LOG_STAIRS = register("pale_oak_log_stairs",
        new StairsBlock(PALE_OAK_PLANKS.getDefaultState(), PALE_OAK_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pale_oak_log_stairs")))
        )
    );

    public static final Block OAK_WOOD_STAIRS = register("oak_wood_stairs",
        new StairsBlock(OAK_WOOD.getDefaultState(), OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "oak_wood_stairs")))
        )
    );

    public static final Block SPRUCE_WOOD_STAIRS = register("spruce_wood_stairs",
        new StairsBlock(SPRUCE_WOOD.getDefaultState(), SPRUCE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "spruce_wood_stairs")))
        )
    );

    public static final Block BIRCH_WOOD_STAIRS = register("birch_wood_stairs",
        new StairsBlock(BIRCH_WOOD.getDefaultState(), BIRCH_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "birch_wood_stairs")))
        )
    );

    public static final Block JUNGLE_WOOD_STAIRS = register("jungle_wood_stairs",
        new StairsBlock(JUNGLE_WOOD.getDefaultState(), JUNGLE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "jungle_wood_stairs")))
        )
    );

    public static final Block ACACIA_WOOD_STAIRS = register("acacia_wood_stairs",
        new StairsBlock(ACACIA_WOOD.getDefaultState(), ACACIA_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "acacia_wood_stairs")))
        )
    );

    public static final Block DARK_OAK_WOOD_STAIRS = register("dark_oak_wood_stairs",
        new StairsBlock(DARK_OAK_WOOD.getDefaultState(), DARK_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dark_oak_wood_stairs")))
        )
    );

    public static final Block MANGROVE_WOOD_STAIRS = register("mangrove_wood_stairs",
        new StairsBlock(MANGROVE_WOOD.getDefaultState(), MANGROVE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "mangrove_wood_stairs")))
        )
    );

    public static final Block CHERRY_WOOD_STAIRS = register("cherry_wood_stairs",
        new StairsBlock(CHERRY_WOOD.getDefaultState(), CHERRY_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cherry_wood_stairs")))
        )
    );

    public static final Block BAMBOO_BLOCK_STAIRS = register("bamboo_block_stairs",
        new StairsBlock(BAMBOO_PLANKS.getDefaultState(), BAMBOO_PLANKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "bamboo_block_stairs")))
        )
    );

    public static final Block WARPED_HYPHAE_STAIRS = register("warped_hyphae_stairs",
        new StairsBlock(WARPED_HYPHAE.getDefaultState(), WARPED_HYPHAE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "warped_hyphae_stairs")))
        )
    );

    public static final Block CRIMSON_HYPHAE_STAIRS = register("crimson_hyphae_stairs",
        new StairsBlock(CRIMSON_HYPHAE.getDefaultState(), CRIMSON_HYPHAE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "crimson_hyphae_stairs")))
        )
    );

    public static final Block PALE_OAK_WOOD_STAIRS = register("pale_oak_wood_stairs",
        new StairsBlock(PALE_OAK_WOOD.getDefaultState(), PALE_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pale_oak_wood_stairs")))
        )
    );

    public static final Block STRIPPED_OAK_STAIRS = register("stripped_oak_stairs",
        new StairsBlock(STRIPPED_OAK_WOOD.getDefaultState(), STRIPPED_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_oak_stairs")))
        )
    );

    public static final Block STRIPPED_SPRUCE_STAIRS = register("stripped_spruce_stairs",
        new StairsBlock(STRIPPED_SPRUCE_WOOD.getDefaultState(), STRIPPED_SPRUCE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_spruce_stairs")))
        )
    );

    public static final Block STRIPPED_BIRCH_STAIRS = register("stripped_birch_stairs",
        new StairsBlock(STRIPPED_BIRCH_WOOD.getDefaultState(), STRIPPED_BIRCH_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_birch_stairs")))
        )
    );

    public static final Block STRIPPED_JUNGLE_STAIRS = register("stripped_jungle_stairs",
        new StairsBlock(STRIPPED_JUNGLE_WOOD.getDefaultState(), STRIPPED_JUNGLE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_jungle_stairs")))
        )
    );

    public static final Block STRIPPED_ACACIA_STAIRS = register("stripped_acacia_stairs",
        new StairsBlock(STRIPPED_ACACIA_WOOD.getDefaultState(), STRIPPED_ACACIA_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_acacia_stairs")))
        )
    );

    public static final Block STRIPPED_DARK_OAK_STAIRS = register("stripped_dark_oak_stairs",
        new StairsBlock(STRIPPED_DARK_OAK_WOOD.getDefaultState(), STRIPPED_DARK_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_dark_oak_stairs")))
        )
    );

    public static final Block STRIPPED_MANGROVE_STAIRS = register("stripped_mangrove_stairs",
        new StairsBlock(MANGROVE_WOOD.getDefaultState(), MANGROVE_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_mangrove_stairs")))
        )
    );

    public static final Block STRIPPED_CHERRY_STAIRS = register("stripped_cherry_stairs",
        new StairsBlock(CHERRY_WOOD.getDefaultState(), CHERRY_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_cherry_stairs")))
        )
    );

    public static final Block STRIPPED_WARPED_STAIRS = register("stripped_warped_stairs",
        new StairsBlock(STRIPPED_WARPED_HYPHAE.getDefaultState(), STRIPPED_WARPED_HYPHAE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_warped_stairs")))
        )
    );

    public static final Block STRIPPED_CRIMSON_STAIRS = register("stripped_crimson_stairs",
        new StairsBlock(STRIPPED_CRIMSON_HYPHAE.getDefaultState(), STRIPPED_CRIMSON_HYPHAE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_crimson_stairs")))
        )
    );

    public static final Block STRIPPED_PALE_OAK_STAIRS = register("stripped_pale_oak_stairs",
        new StairsBlock(STRIPPED_PALE_OAK_WOOD.getDefaultState(), STRIPPED_PALE_OAK_WOOD.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "stripped_pale_oak_stairs")))
        )
    );

    // endregion

    // region Ice

    public static final Block ICE_STAIRS = register("ice_stairs",
        new IceStairsBlock(ICE.getDefaultState(), ICE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "ice_stairs")))
        )
    );

    public static final Block PACKED_ICE_STAIRS = register("packed_ice_stairs",
        new StairsBlock(PACKED_ICE.getDefaultState(), PACKED_ICE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "packed_ice_stairs")))
        )
    );

    public static final Block BLUE_ICE_STAIRS = register("blue_ice_stairs",
        new StairsBlock(BLUE_ICE.getDefaultState(), BLUE_ICE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blue_ice_stairs")))
        )
    );

    // endregion

    // region Stone

    public static final Block CHISELED_STONE_BRICK_STAIRS = register("chiseled_stone_brick_stairs",
        new StairsBlock(CHISELED_STONE_BRICKS.getDefaultState(), CHISELED_STONE_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_stone_brick_stairs")))
        )
    );

    public static final Block CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs",
        new StairsBlock(CRACKED_STONE_BRICKS.getDefaultState(), CRACKED_STONE_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_stone_brick_stairs")))
        )
    );

    public static final Block SMOOTH_STONE_STAIRS = register("smooth_stone_stairs",
        new StairsBlock(SMOOTH_STONE.getDefaultState(), SMOOTH_STONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "smooth_stone_stairs")))
        )
    );

    public static final Block CHISELED_SANDSTONE_STAIRS = register("chiseled_sandstone_stairs",
        new StairsBlock(CHISELED_SANDSTONE.getDefaultState(), CHISELED_SANDSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_sandstone_stairs")))
        )
    );

    public static final Block CUT_SANDSTONE_STAIRS = register("cut_sandstone_stairs",
        new StairsBlock(CUT_SANDSTONE.getDefaultState(), CUT_SANDSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cut_sandstone_stairs")))
        )
    );

    public static final Block CHISELED_RED_SANDSTONE_STAIRS = register("chiseled_red_sandstone_stairs",
        new StairsBlock(CHISELED_RED_SANDSTONE.getDefaultState(), CHISELED_RED_SANDSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_red_sandstone_stairs")))
        )
    );

    public static final Block CUT_RED_SANDSTONE_STAIRS = register("cut_red_sandstone_stairs",
        new StairsBlock(CUT_RED_SANDSTONE.getDefaultState(), CUT_RED_SANDSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cut_red_sandstone_stairs")))
        )
    );

    public static final Block BASALT_STAIRS = register("basalt_stairs",
        new StairsBlock(BASALT.getDefaultState(), BASALT.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "basalt_stairs")))
        )
    );

    public static final Block SMOOTH_BASALT_STAIRS = register("smooth_basalt_stairs",
        new StairsBlock(SMOOTH_BASALT.getDefaultState(), SMOOTH_BASALT.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "smooth_basalt_stairs")))
        )
    );

    public static final Block POLISHED_BASALT_STAIRS = register("polished_basalt_stairs",
        new StairsBlock(POLISHED_BASALT.getDefaultState(), POLISHED_BASALT.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "polished_basalt_stairs")))
        )
    );

    public static final Block CHISELED_POLISHED_BLACKSTONE_STAIRS = register("chiseled_polished_blackstone_stairs",
        new StairsBlock(CHISELED_POLISHED_BLACKSTONE.getDefaultState(), CHISELED_POLISHED_BLACKSTONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_polished_blackstone_stairs")))
        )
    );

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = register("cracked_polished_blackstone_brick_stairs",
        new StairsBlock(CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), CRACKED_POLISHED_BLACKSTONE_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_polished_blackstone_brick_stairs")))
        )
    );

    public static final Block CALCITE_STAIRS = register("calcite_stairs",
        new StairsBlock(CALCITE.getDefaultState(), CALCITE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "calcite_stairs")))
        )
    );

    public static final Block CHISELED_TUFF_STAIRS = register("chiseled_tuff_stairs",
        new StairsBlock(CHISELED_TUFF.getDefaultState(), CHISELED_TUFF.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_tuff_stairs")))
        )
    );

    public static final Block CHISELED_TUFF_BRICK_STAIRS = register("chiseled_tuff_brick_stairs",
        new StairsBlock(CHISELED_TUFF_BRICKS.getDefaultState(), CHISELED_TUFF_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_tuff_brick_stairs")))
        )
    );

    public static final Block DEEPSLATE_STAIRS = register("deepslate_stairs",
        new StairsBlock(DEEPSLATE.getDefaultState(), DEEPSLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "deepslate_stairs")))
        )
    );

    public static final Block CHISELED_DEEPSLATE_STAIRS = register("chiseled_deepslate_stairs",
        new StairsBlock(CHISELED_DEEPSLATE.getDefaultState(), CHISELED_DEEPSLATE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_deepslate_stairs")))
        )
    );

    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = register("cracked_deepslate_brick_stairs",
        new StairsBlock(CRACKED_DEEPSLATE_BRICKS.getDefaultState(), CRACKED_DEEPSLATE_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_deepslate_brick_stairs")))
        )
    );

    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = register("cracked_deepslate_tile_stairs",
        new StairsBlock(CRACKED_DEEPSLATE_TILES.getDefaultState(), CRACKED_DEEPSLATE_TILES.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_deepslate_tile_stairs")))
        )
    );

    public static final Block DRIPSTONE_STAIRS = register("dripstone_stairs",
        new StairsBlock(DRIPSTONE_BLOCK.getDefaultState(), DRIPSTONE_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "dripstone_stairs")))
        )
    );

    public static final Block CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs",
        new StairsBlock(CRACKED_NETHER_BRICKS.getDefaultState(), CRACKED_NETHER_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cracked_nether_brick_stairs")))
        )
    );

    public static final Block CHISELED_NETHER_BRICK_STAIRS = register("chiseled_nether_brick_stairs",
        new StairsBlock(CHISELED_NETHER_BRICKS.getDefaultState(), CHISELED_NETHER_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_nether_brick_stairs")))
        )
    );

    public static final Block QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs",
        new StairsBlock(QUARTZ_BRICKS.getDefaultState(), QUARTZ_BRICKS.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "quartz_brick_stairs")))
        )
    );

    public static final Block CHISELED_QUARTZ_STAIRS = register("chiseled_quartz_stairs",
        new StairsBlock(CHISELED_QUARTZ_BLOCK.getDefaultState(), CHISELED_QUARTZ_BLOCK.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "chiseled_quartz_stairs")))
        )
    );

    public static final Block QUARTZ_PILLAR_STAIRS = register("quartz_pillar_stairs",
        new StairsBlock(QUARTZ_PILLAR.getDefaultState(), QUARTZ_PILLAR.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "quartz_pillar_stairs")))
        )
    );

    public static final Block END_STONE_STAIRS = register("end_stone_stairs",
        new StairsBlock(END_STONE.getDefaultState(), END_STONE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "end_stone_stairs")))
        )
    );

    public static final Block PURPUR_PILLAR_STAIRS = register("purpur_pillar_stairs",
        new StairsBlock(PURPUR_PILLAR.getDefaultState(), PURPUR_PILLAR.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purpur_pillar_stairs")))
        )
    );

    public static final Block OBSIDIAN_STAIRS = register("obsidian_stairs",
        new StairsBlock(OBSIDIAN.getDefaultState(), OBSIDIAN.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "obsidian_stairs")))
        )
    );

    public static final Block CRYING_OBSIDIAN_STAIRS = register("crying_obsidian_stairs",
        new StairsBlock(CRYING_OBSIDIAN.getDefaultState(), CRYING_OBSIDIAN.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "crying_obsidian_stairs")))
        )
    );

    // endregion

    // region Concrete

    public static final Block BLACK_CONCRETE_STAIRS = register("black_concrete_stairs",
        new StairsBlock(BLACK_CONCRETE.getDefaultState(), BLACK_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "black_concrete_stairs")))
        )
    );

    public static final Block BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs",
        new StairsBlock(BLUE_CONCRETE.getDefaultState(), BLUE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blue_concrete_stairs")))
        )
    );

    public static final Block BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs",
        new StairsBlock(BROWN_CONCRETE.getDefaultState(), BROWN_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "brown_concrete_stairs")))
        )
    );

    public static final Block CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs",
        new StairsBlock(CYAN_CONCRETE.getDefaultState(), CYAN_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cyan_concrete_stairs")))
        )
    );

    public static final Block GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs",
        new StairsBlock(GRAY_CONCRETE.getDefaultState(), GRAY_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gray_concrete_stairs")))
        )
    );

    public static final Block GREEN_CONCRETE_STAIRS = register("green_concrete_stairs",
        new StairsBlock(GREEN_CONCRETE.getDefaultState(), GREEN_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "green_concrete_stairs")))
        )
    );

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs",
        new StairsBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), LIGHT_BLUE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_blue_concrete_stairs")))
        )
    );

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs",
        new StairsBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), LIGHT_GRAY_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_gray_concrete_stairs")))
        )
    );

    public static final Block LIME_CONCRETE_STAIRS = register("lime_concrete_stairs",
        new StairsBlock(LIME_CONCRETE.getDefaultState(), LIME_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "lime_concrete_stairs")))
        )
    );

    public static final Block MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs",
        new StairsBlock(MAGENTA_CONCRETE.getDefaultState(), MAGENTA_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "magenta_concrete_stairs")))
        )
    );

    public static final Block ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs",
        new StairsBlock(ORANGE_CONCRETE.getDefaultState(), ORANGE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "orange_concrete_stairs")))
        )
    );

    public static final Block PINK_CONCRETE_STAIRS = register("pink_concrete_stairs",
        new StairsBlock(PINK_CONCRETE.getDefaultState(), PINK_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pink_concrete_stairs")))
        )
    );

    public static final Block PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs",
        new StairsBlock(PURPLE_CONCRETE.getDefaultState(), PURPLE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purple_concrete_stairs")))
        )
    );

    public static final Block RED_CONCRETE_STAIRS = register("red_concrete_stairs",
        new StairsBlock(RED_CONCRETE.getDefaultState(), RED_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_concrete_stairs")))
        )
    );

    public static final Block WHITE_CONCRETE_STAIRS = register("white_concrete_stairs",
        new StairsBlock(WHITE_CONCRETE.getDefaultState(), WHITE_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "white_concrete_stairs")))
        )
    );

    public static final Block YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs",
        new StairsBlock(YELLOW_CONCRETE.getDefaultState(), YELLOW_CONCRETE.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "yellow_concrete_stairs")))
        )
    );

    // endregion

    // region Terracotta

    public static final Block TERRACOTTA_STAIRS = register("terracotta_stairs",
        new StairsBlock(TERRACOTTA.getDefaultState(), TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "terracotta_stairs")))
        )
    );

    public static final Block BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs",
        new StairsBlock(BLACK_TERRACOTTA.getDefaultState(), BLACK_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "black_terracotta_stairs")))
        )
    );

    public static final Block BLACK_GLAZED_TERRACOTTA_STAIRS = register("black_glazed_terracotta_stairs",
        new StairsBlock(BLACK_GLAZED_TERRACOTTA.getDefaultState(), BLACK_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "black_glazed_terracotta_stairs")))
        )
    );

    public static final Block BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs",
        new StairsBlock(BLUE_TERRACOTTA.getDefaultState(), BLUE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blue_terracotta_stairs")))
        )
    );

    public static final Block BLUE_GLAZED_TERRACOTTA_STAIRS = register("blue_glazed_terracotta_stairs",
        new StairsBlock(BLUE_GLAZED_TERRACOTTA.getDefaultState(), BLUE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "blue_glazed_terracotta_stairs")))
        )
    );

    public static final Block BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs",
        new StairsBlock(BROWN_TERRACOTTA.getDefaultState(), BROWN_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "brown_terracotta_stairs")))
        )
    );

    public static final Block BROWN_GLAZED_TERRACOTTA_STAIRS = register("brown_glazed_terracotta_stairs",
        new StairsBlock(BROWN_GLAZED_TERRACOTTA.getDefaultState(), BROWN_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "brown_glazed_terracotta_stairs")))
        )
    );

    public static final Block CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs",
        new StairsBlock(CYAN_TERRACOTTA.getDefaultState(), CYAN_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cyan_terracotta_stairs")))
        )
    );

    public static final Block CYAN_GLAZED_TERRACOTTA_STAIRS = register("cyan_glazed_terracotta_stairs",
        new StairsBlock(CYAN_GLAZED_TERRACOTTA.getDefaultState(), CYAN_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "cyan_glazed_terracotta_stairs")))
        )
    );

    public static final Block GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs",
        new StairsBlock(GRAY_TERRACOTTA.getDefaultState(), GRAY_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gray_terracotta_stairs")))
        )
    );

    public static final Block GRAY_GLAZED_TERRACOTTA_STAIRS = register("gray_glazed_terracotta_stairs",
        new StairsBlock(GRAY_GLAZED_TERRACOTTA.getDefaultState(), GRAY_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "gray_glazed_terracotta_stairs")))
        )
    );

    public static final Block GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs",
        new StairsBlock(GREEN_TERRACOTTA.getDefaultState(), GREEN_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "green_terracotta_stairs")))
        )
    );

    public static final Block GREEN_GLAZED_TERRACOTTA_STAIRS = register("green_glazed_terracotta_stairs",
        new StairsBlock(GREEN_GLAZED_TERRACOTTA.getDefaultState(), GREEN_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "green_glazed_terracotta_stairs")))
        )
    );

    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs",
        new StairsBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), LIGHT_BLUE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_blue_terracotta_stairs")))
        )
    );

    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = register("light_blue_glazed_terracotta_stairs",
        new StairsBlock(LIGHT_BLUE_GLAZED_TERRACOTTA.getDefaultState(), LIGHT_BLUE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_blue_glazed_terracotta_stairs")))
        )
    );

    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs",
        new StairsBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), LIGHT_GRAY_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_gray_terracotta_stairs")))
        )
    );

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = register("light_gray_glazed_terracotta_stairs",
        new StairsBlock(LIGHT_GRAY_GLAZED_TERRACOTTA.getDefaultState(), LIGHT_GRAY_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "light_gray_glazed_terracotta_stairs")))
        )
    );

    public static final Block LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs",
        new StairsBlock(LIME_TERRACOTTA.getDefaultState(), LIME_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "lime_terracotta_stairs")))
        )
    );

    public static final Block LIME_GLAZED_TERRACOTTA_STAIRS = register("lime_glazed_terracotta_stairs",
        new StairsBlock(LIME_GLAZED_TERRACOTTA.getDefaultState(), LIME_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "lime_glazed_terracotta_stairs")))
        )
    );

    public static final Block MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs",
        new StairsBlock(MAGENTA_TERRACOTTA.getDefaultState(), MAGENTA_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "magenta_terracotta_stairs")))
        )
    );

    public static final Block MAGENTA_GLAZED_TERRACOTTA_STAIRS = register("magenta_glazed_terracotta_stairs",
        new StairsBlock(MAGENTA_GLAZED_TERRACOTTA.getDefaultState(), MAGENTA_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "magenta_glazed_terracotta_stairs")))
        )
    );

    public static final Block ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs",
        new StairsBlock(ORANGE_TERRACOTTA.getDefaultState(), ORANGE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "orange_terracotta_stairs")))
        )
    );

    public static final Block ORANGE_GLAZED_TERRACOTTA_STAIRS = register("orange_glazed_terracotta_stairs",
        new StairsBlock(ORANGE_GLAZED_TERRACOTTA.getDefaultState(), ORANGE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "orange_glazed_terracotta_stairs")))
        )
    );

    public static final Block PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs",
        new StairsBlock(PINK_TERRACOTTA.getDefaultState(), PINK_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pink_terracotta_stairs")))
        )
    );

    public static final Block PINK_GLAZED_TERRACOTTA_STAIRS = register("pink_glazed_terracotta_stairs",
        new StairsBlock(PINK_GLAZED_TERRACOTTA.getDefaultState(), PINK_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "pink_glazed_terracotta_stairs")))
        )
    );

    public static final Block PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs",
        new StairsBlock(PURPLE_TERRACOTTA.getDefaultState(), PURPLE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purple_terracotta_stairs")))
        )
    );

    public static final Block PURPLE_GLAZED_TERRACOTTA_STAIRS = register("purple_glazed_terracotta_stairs",
        new StairsBlock(PURPLE_GLAZED_TERRACOTTA.getDefaultState(), PURPLE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "purple_glazed_terracotta_stairs")))
        )
    );

    public static final Block RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs",
        new StairsBlock(RED_TERRACOTTA.getDefaultState(), RED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_terracotta_stairs")))
        )
    );

    public static final Block RED_GLAZED_TERRACOTTA_STAIRS = register("red_glazed_terracotta_stairs",
        new StairsBlock(RED_GLAZED_TERRACOTTA.getDefaultState(), RED_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "red_glazed_terracotta_stairs")))
        )
    );

    public static final Block WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs",
        new StairsBlock(WHITE_TERRACOTTA.getDefaultState(), WHITE_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "white_terracotta_stairs")))
        )
    );

    public static final Block WHITE_GLAZED_TERRACOTTA_STAIRS = register("white_glazed_terracotta_stairs",
        new StairsBlock(WHITE_GLAZED_TERRACOTTA.getDefaultState(), WHITE_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "white_glazed_terracotta_stairs")))
        )
    );

    public static final Block YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs",
        new StairsBlock(YELLOW_TERRACOTTA.getDefaultState(), YELLOW_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "yellow_terracotta_stairs")))
        )
    );

    public static final Block YELLOW_GLAZED_TERRACOTTA_STAIRS = register("yellow_glazed_terracotta_stairs",
        new StairsBlock(YELLOW_GLAZED_TERRACOTTA.getDefaultState(), YELLOW_GLAZED_TERRACOTTA.getSettings()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, "yellow_glazed_terracotta_stairs")))
        )
    );

    // endregion

    // endregion

    // region REGISTRY METHODS:

    public static Block register(String name, Block block) {
        Identifier id = Identifier.of(SlabsAndStairs.MOD_ID, name);
        BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, id)));
        Registry.register(Registries.ITEM, id, blockItem);
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static Block registerWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(SlabsAndStairs.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        SlabsAndStairs.LOGGER.debug("Registering Mod Blocks for " + SlabsAndStairs.MOD_ID);
    }

    // endregion
}