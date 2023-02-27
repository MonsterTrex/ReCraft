package net.monstertrex.recraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.monstertrex.recraft.Recraft;
import net.monstertrex.recraft.block.custom.*;
import net.monstertrex.recraft.block.custom.RedstoneLampBlock;
import net.monstertrex.recraft.item.ModItemGroups;

public class ModBlocks {

    //------------------------------------------ Block List ------------------------------------------//

       //--- Compressed Blocks ---//

    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block", new Block(FabricBlockSettings
            .of(Material.STONE).strength(5,6).sounds(BlockSoundGroup.STONE)), ModItemGroups.RECRAFT);

    public static final Block APPLE_CRATE = registerBlock("apple_crate", new Block(FabricBlockSettings
            .of(Material.WOOD).strength(2,2).sounds(BlockSoundGroup.NETHER_WART)), ModItemGroups.RECRAFT);

    public static final Block BEETROOT_CRATE = registerBlock("beetroot_crate", new Block(FabricBlockSettings
            .of(Material.WOOD).strength(2,2).sounds(BlockSoundGroup.NETHER_WART)), ModItemGroups.RECRAFT);

    public static final Block CARROT_CRATE = registerBlock("carrot_crate", new Block(FabricBlockSettings
            .of(Material.WOOD).strength(2,2).sounds(BlockSoundGroup.NETHER_WART)), ModItemGroups.RECRAFT);

    public static final Block CHORUS_FRUIT_CRATE = registerBlock("chorus_fruit_crate", new Block(FabricBlockSettings
            .of(Material.WOOD).strength(2,2).sounds(BlockSoundGroup.NETHER_WART)), ModItemGroups.RECRAFT);

    public static final Block GLOW_BERRY_CRATE = registerBlock("glow_berry_crate", new Block(FabricBlockSettings
            .of(Material.WOOD).strength(2,2).sounds(BlockSoundGroup.NETHER_WART)), ModItemGroups.RECRAFT);

    public static final Block POTATO_CRATE = registerBlock("potato_crate", new Block(FabricBlockSettings
            .of(Material.WOOD).strength(2,2).sounds(BlockSoundGroup.NETHER_WART)), ModItemGroups.RECRAFT);

    public static final Block SWEET_BERRY_CRATE = registerBlock("sweet_berry_crate", new Block(FabricBlockSettings
            .of(Material.WOOD).strength(2,2).sounds(BlockSoundGroup.NETHER_WART)), ModItemGroups.RECRAFT);



    //--- Rose Gold Blocks ---//

    public static final Block ROSE_GOLD_BLOCK = registerBlock("rose_gold_block", new Block(FabricBlockSettings
            .of(Material.METAL).strength(5,6).requiresTool().sounds(BlockSoundGroup.METAL)), ModItemGroups.RECRAFT);



    //--- Steel Blocks ---//

    public static final Block STEEL_BLOCK = registerBlock("steel_block", new Block(FabricBlockSettings
            .of(Material.METAL).strength(5,6).requiresTool().sounds(BlockSoundGroup.METAL)), ModItemGroups.RECRAFT);

    public static final Block STEEL_DOOR = registerBlock("steel_door", new ModDoorBlock(FabricBlockSettings
            .of(Material.METAL).strength(5,6).requiresTool().sounds(BlockSoundGroup.METAL).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block STEEL_TRAPDOOR = registerBlock("steel_trapdoor", new ModTrapdoorBlock(FabricBlockSettings
            .of(Material.METAL).strength(5,6).requiresTool().sounds(BlockSoundGroup.METAL).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block NETHER_STEEL_ORE = registerBlock("nether_steel_ore", new OreBlock(FabricBlockSettings
            .of(Material.STONE).strength(3,3).requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE), UniformIntProvider.create(0,1)), ModItemGroups.RECRAFT);



    //--- Bamboo Blocks ---//

    public static final Block BAMBOO_STACK = registerBlock("bamboo_stack", new PillarBlock(FabricBlockSettings
            .copy(Blocks.OAK_LOG)), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_STAIRS = registerBlock("bamboo_stairs", new ModStairsBlock
            (ModBlocks.BAMBOO_STACK.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.OAK_STAIRS)), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_SLAB = registerBlock("bamboo_slab", new SlabBlock(FabricBlockSettings
            .copy(Blocks.OAK_SLAB)), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_PLANKS = registerBlock("bamboo_planks", new Block(FabricBlockSettings
            .copy(Blocks.OAK_PLANKS)), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_PLANK_STAIRS = registerBlock("bamboo_plank_stairs", new ModStairsBlock
            (ModBlocks.BAMBOO_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.OAK_STAIRS)), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_PLANK_SLAB = registerBlock("bamboo_plank_slab", new SlabBlock(FabricBlockSettings
            .copy(Blocks.OAK_SLAB)), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_MOSAIC = registerBlock("bamboo_mosaic", new Block(FabricBlockSettings
            .copy(Blocks.OAK_PLANKS)), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_MOSAIC_STAIRS = registerBlock("bamboo_mosaic_stairs", new ModStairsBlock
            (ModBlocks.BAMBOO_MOSAIC.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.OAK_STAIRS)), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_MOSAIC_SLAB = registerBlock("bamboo_mosaic_slab", new SlabBlock(FabricBlockSettings
            .copy(Blocks.OAK_SLAB)), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_FENCE = registerBlock("bamboo_fence", new FenceBlock(FabricBlockSettings
            .copy(Blocks.OAK_FENCE)), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_FENCE_GATE = registerBlock("bamboo_fence_gate", new FenceGateBlock(FabricBlockSettings
            .copy(Blocks.OAK_FENCE_GATE)), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_DOOR = registerBlock("bamboo_door", new ModDoorBlock(FabricBlockSettings
            .copy(Blocks.OAK_DOOR).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor", new ModTrapdoorBlock(FabricBlockSettings
            .copy(Blocks.OAK_TRAPDOOR).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_BUTTON = registerBlock("bamboo_button", new ModWoodButtonBlock(FabricBlockSettings
            .copy(Blocks.OAK_BUTTON)), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_PRESSURE_PLATE = registerBlock("bamboo_pressure_plate", new ModPressurePlateBlock
            (PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings
                    .copy(Blocks.OAK_PRESSURE_PLATE)), ModItemGroups.RECRAFT);

    public static final Block BAMBOO_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("bamboo_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.BAMBOO));

    public static final Block BAMBOO_SIGN_BLOCK = registerBlockWithoutBlockItem("bamboo_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.BAMBOO));


    public static final Block DRIED_BAMBOO_STACK = registerBlock("dried_bamboo_stack", new PillarBlock(FabricBlockSettings
            .copy(Blocks.OAK_LOG)), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_STAIRS = registerBlock("dried_bamboo_stairs", new ModStairsBlock
            (ModBlocks.DRIED_BAMBOO_STACK.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.OAK_STAIRS)), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_SLAB = registerBlock("dried_bamboo_slab", new SlabBlock(FabricBlockSettings
            .copy(Blocks.OAK_SLAB)), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_PLANKS = registerBlock("dried_bamboo_planks", new Block(FabricBlockSettings
            .copy(Blocks.OAK_PLANKS)), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_PLANK_STAIRS = registerBlock("dried_bamboo_plank_stairs", new ModStairsBlock
            (ModBlocks.DRIED_BAMBOO_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.OAK_STAIRS)), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_PLANK_SLAB = registerBlock("dried_bamboo_plank_slab", new SlabBlock(FabricBlockSettings
            .copy(Blocks.OAK_SLAB)), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_MOSAIC = registerBlock("dried_bamboo_mosaic", new Block(FabricBlockSettings
            .copy(Blocks.OAK_PLANKS)), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_MOSAIC_STAIRS = registerBlock("dried_bamboo_mosaic_stairs", new ModStairsBlock
            (ModBlocks.DRIED_BAMBOO_MOSAIC.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.OAK_STAIRS)), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_MOSAIC_SLAB = registerBlock("dried_bamboo_mosaic_slab", new SlabBlock(FabricBlockSettings
            .copy(Blocks.OAK_SLAB)), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_FENCE = registerBlock("dried_bamboo_fence", new FenceBlock(FabricBlockSettings
            .copy(Blocks.OAK_FENCE)), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_FENCE_GATE = registerBlock("dried_bamboo_fence_gate", new FenceGateBlock(FabricBlockSettings
            .copy(Blocks.OAK_FENCE_GATE)), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_DOOR = registerBlock("dried_bamboo_door", new ModDoorBlock(FabricBlockSettings
            .copy(Blocks.OAK_DOOR).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_TRAPDOOR = registerBlock("dried_bamboo_trapdoor", new ModTrapdoorBlock(FabricBlockSettings
            .copy(Blocks.OAK_TRAPDOOR).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_BUTTON = registerBlock("dried_bamboo_button", new ModWoodButtonBlock(FabricBlockSettings
            .copy(Blocks.OAK_BUTTON)), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_PRESSURE_PLATE = registerBlock("dried_bamboo_pressure_plate", new ModPressurePlateBlock
            (PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings
                    .copy(Blocks.OAK_PRESSURE_PLATE)), ModItemGroups.RECRAFT);

    public static final Block DRIED_BAMBOO_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("dried_bamboo_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.DRIED_BAMBOO));

    public static final Block DRIED_BAMBOO_SIGN_BLOCK = registerBlockWithoutBlockItem("dried_bamboo_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.DRIED_BAMBOO));



        //--- Glass Blocks ---//

    public static final Block CRACKED_GLASS = registerBlock("cracked_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_BLACK_STAINED_GLASS = registerBlock("cracked_black_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_BLUE_STAINED_GLASS = registerBlock("cracked_blue_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_BROWN_STAINED_GLASS = registerBlock("cracked_brown_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_CYAN_STAINED_GLASS = registerBlock("cracked_cyan_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_GRAY_STAINED_GLASS = registerBlock("cracked_gray_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_GREEN_STAINED_GLASS = registerBlock("cracked_green_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_LIGHT_BLUE_STAINED_GLASS = registerBlock("cracked_light_blue_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_LIGHT_GRAY_STAINED_GLASS = registerBlock("cracked_light_gray_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_LIME_STAINED_GLASS = registerBlock("cracked_lime_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_MAGENTA_STAINED_GLASS = registerBlock("cracked_magenta_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_ORANGE_STAINED_GLASS = registerBlock("cracked_orange_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_PINK_STAINED_GLASS = registerBlock("cracked_pink_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_PURPLE_STAINED_GLASS = registerBlock("cracked_purple_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_RED_STAINED_GLASS = registerBlock("cracked_red_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_WHITE_STAINED_GLASS = registerBlock("cracked_white_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_YELLOW_STAINED_GLASS = registerBlock("cracked_yellow_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);


    public static final Block FRAMED_GLASS = registerBlock("framed_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_BLACK_STAINED_GLASS = registerBlock("framed_black_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_BLUE_STAINED_GLASS = registerBlock("framed_blue_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_BROWN_STAINED_GLASS = registerBlock("framed_brown_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_CYAN_STAINED_GLASS = registerBlock("framed_cyan_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_GRAY_STAINED_GLASS = registerBlock("framed_gray_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_GREEN_STAINED_GLASS = registerBlock("framed_green_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS = registerBlock("framed_light_blue_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS = registerBlock("framed_light_gray_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_LIME_STAINED_GLASS = registerBlock("framed_lime_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_MAGENTA_STAINED_GLASS = registerBlock("framed_magenta_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_ORANGE_STAINED_GLASS = registerBlock("framed_orange_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_PINK_STAINED_GLASS = registerBlock("framed_pink_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_PURPLE_STAINED_GLASS = registerBlock("framed_purple_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_RED_STAINED_GLASS = registerBlock("framed_red_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_WHITE_STAINED_GLASS = registerBlock("framed_white_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_YELLOW_STAINED_GLASS = registerBlock("framed_yellow_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);


    public static final Block FROSTED_GLASS = registerBlock("frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block BLACK_FROSTED_GLASS = registerBlock("black_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block BLUE_FROSTED_GLASS = registerBlock("blue_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block BROWN_FROSTED_GLASS = registerBlock("brown_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CYAN_FROSTED_GLASS = registerBlock("cyan_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block GRAY_FROSTED_GLASS = registerBlock("gray_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block GREEN_FROSTED_GLASS = registerBlock("green_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block LIGHT_BLUE_FROSTED_GLASS = registerBlock("light_blue_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block LIGHT_GRAY_FROSTED_GLASS = registerBlock("light_gray_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block LIME_FROSTED_GLASS = registerBlock("lime_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block MAGENTA_FROSTED_GLASS = registerBlock("magenta_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block ORANGE_FROSTED_GLASS = registerBlock("orange_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block PINK_FROSTED_GLASS = registerBlock("pink_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block PURPLE_FROSTED_GLASS = registerBlock("purple_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block RED_FROSTED_GLASS = registerBlock("red_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block WHITE_FROSTED_GLASS = registerBlock("white_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block YELLOW_FROSTED_GLASS = registerBlock("yellow_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);


    public static final Block FRAMED_FROSTED_GLASS = registerBlock("framed_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_BLACK_FROSTED_GLASS = registerBlock("framed_black_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_BLUE_FROSTED_GLASS = registerBlock("framed_blue_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_BROWN_FROSTED_GLASS = registerBlock("framed_brown_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_CYAN_FROSTED_GLASS = registerBlock("framed_cyan_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_GRAY_FROSTED_GLASS = registerBlock("framed_gray_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_GREEN_FROSTED_GLASS = registerBlock("framed_green_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_LIGHT_BLUE_FROSTED_GLASS = registerBlock("framed_light_blue_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_LIGHT_GRAY_FROSTED_GLASS = registerBlock("framed_light_gray_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_LIME_FROSTED_GLASS = registerBlock("framed_lime_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_MAGENTA_FROSTED_GLASS = registerBlock("framed_magenta_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_ORANGE_FROSTED_GLASS = registerBlock("framed_orange_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_PINK_FROSTED_GLASS = registerBlock("framed_pink_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_PURPLE_FROSTED_GLASS = registerBlock("framed_purple_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_RED_FROSTED_GLASS = registerBlock("framed_red_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_WHITE_FROSTED_GLASS = registerBlock("framed_white_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_YELLOW_FROSTED_GLASS = registerBlock("framed_yellow_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);


    public static final Block CRACKED_FROSTED_GLASS = registerBlock("cracked_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_BLACK_FROSTED_GLASS = registerBlock("cracked_black_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_BLUE_FROSTED_GLASS = registerBlock("cracked_blue_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_BROWN_FROSTED_GLASS = registerBlock("cracked_brown_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_CYAN_FROSTED_GLASS = registerBlock("cracked_cyan_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_GRAY_FROSTED_GLASS = registerBlock("cracked_gray_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_GREEN_FROSTED_GLASS = registerBlock("cracked_green_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_LIGHT_BLUE_FROSTED_GLASS = registerBlock("cracked_light_blue_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_LIGHT_GRAY_FROSTED_GLASS = registerBlock("cracked_light_gray_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_LIME_FROSTED_GLASS = registerBlock("cracked_lime_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_MAGENTA_FROSTED_GLASS = registerBlock("cracked_magenta_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_ORANGE_FROSTED_GLASS = registerBlock("cracked_orange_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_PINK_FROSTED_GLASS = registerBlock("cracked_pink_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_PURPLE_FROSTED_GLASS = registerBlock("cracked_purple_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_RED_FROSTED_GLASS = registerBlock("cracked_red_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_WHITE_FROSTED_GLASS = registerBlock("cracked_white_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_YELLOW_FROSTED_GLASS = registerBlock("cracked_yellow_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);


    public static final Block CRACKED_GLASS_PANE = registerBlock("cracked_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_BLACK_STAINED_GLASS_PANE = registerBlock("cracked_black_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_BLUE_STAINED_GLASS_PANE = registerBlock("cracked_blue_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_BROWN_STAINED_GLASS_PANE = registerBlock("cracked_brown_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_CYAN_STAINED_GLASS_PANE = registerBlock("cracked_cyan_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_GRAY_STAINED_GLASS_PANE = registerBlock("cracked_gray_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_GREEN_STAINED_GLASS_PANE = registerBlock("cracked_green_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("cracked_light_blue_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("cracked_light_gray_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_LIME_STAINED_GLASS_PANE = registerBlock("cracked_lime_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_MAGENTA_STAINED_GLASS_PANE = registerBlock("cracked_magenta_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_ORANGE_STAINED_GLASS_PANE = registerBlock("cracked_orange_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_PINK_STAINED_GLASS_PANE = registerBlock("cracked_pink_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_PURPLE_STAINED_GLASS_PANE = registerBlock("cracked_purple_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_RED_STAINED_GLASS_PANE = registerBlock("cracked_red_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_WHITE_STAINED_GLASS_PANE = registerBlock("cracked_white_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_YELLOW_STAINED_GLASS_PANE = registerBlock("cracked_yellow_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);


    public static final Block FRAMED_GLASS_PANE = registerBlock("framed_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_BLACK_STAINED_GLASS_PANE = registerBlock("framed_black_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_BLUE_STAINED_GLASS_PANE = registerBlock("framed_blue_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_BROWN_STAINED_GLASS_PANE = registerBlock("framed_brown_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_CYAN_STAINED_GLASS_PANE = registerBlock("framed_cyan_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_GRAY_STAINED_GLASS_PANE = registerBlock("framed_gray_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_GREEN_STAINED_GLASS_PANE = registerBlock("framed_green_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("framed_light_blue_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("framed_light_gray_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_LIME_STAINED_GLASS_PANE = registerBlock("framed_lime_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_MAGENTA_STAINED_GLASS_PANE = registerBlock("framed_magenta_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_ORANGE_STAINED_GLASS_PANE = registerBlock("framed_orange_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_PINK_STAINED_GLASS_PANE = registerBlock("framed_pink_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_PURPLE_STAINED_GLASS_PANE = registerBlock("framed_purple_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_RED_STAINED_GLASS_PANE = registerBlock("framed_red_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_WHITE_STAINED_GLASS_PANE = registerBlock("framed_white_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_YELLOW_STAINED_GLASS_PANE = registerBlock("framed_yellow_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);


    public static final Block FROSTED_GLASS_PANE = registerBlock("frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block BLACK_FROSTED_GLASS_PANE = registerBlock("black_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block BLUE_FROSTED_GLASS_PANE = registerBlock("blue_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block BROWN_FROSTED_GLASS_PANE = registerBlock("brown_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CYAN_FROSTED_GLASS_PANE = registerBlock("cyan_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block GRAY_FROSTED_GLASS_PANE = registerBlock("gray_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block GREEN_FROSTED_GLASS_PANE = registerBlock("green_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block LIGHT_BLUE_FROSTED_GLASS_PANE = registerBlock("light_blue_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block LIGHT_GRAY_FROSTED_GLASS_PANE = registerBlock("light_gray_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block LIME_FROSTED_GLASS_PANE = registerBlock("lime_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block MAGENTA_FROSTED_GLASS_PANE = registerBlock("magenta_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block ORANGE_FROSTED_GLASS_PANE = registerBlock("orange_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block PINK_FROSTED_GLASS_PANE = registerBlock("pink_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block PURPLE_FROSTED_GLASS_PANE = registerBlock("purple_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block RED_FROSTED_GLASS_PANE = registerBlock("red_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block WHITE_FROSTED_GLASS_PANE = registerBlock("white_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block YELLOW_FROSTED_GLASS_PANE = registerBlock("yellow_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);


    public static final Block FRAMED_FROSTED_GLASS_PANE = registerBlock("framed_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_BLACK_FROSTED_GLASS_PANE = registerBlock("framed_black_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_BLUE_FROSTED_GLASS_PANE = registerBlock("framed_blue_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_BROWN_FROSTED_GLASS_PANE = registerBlock("framed_brown_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_CYAN_FROSTED_GLASS_PANE = registerBlock("framed_cyan_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_GRAY_FROSTED_GLASS_PANE = registerBlock("framed_gray_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_GREEN_FROSTED_GLASS_PANE = registerBlock("framed_green_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_LIGHT_BLUE_FROSTED_GLASS_PANE = registerBlock("framed_light_blue_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_LIGHT_GRAY_FROSTED_GLASS_PANE = registerBlock("framed_light_gray_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_LIME_FROSTED_GLASS_PANE = registerBlock("framed_lime_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_MAGENTA_FROSTED_GLASS_PANE = registerBlock("framed_magenta_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_ORANGE_FROSTED_GLASS_PANE = registerBlock("framed_orange_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_PINK_FROSTED_GLASS_PANE = registerBlock("framed_pink_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_PURPLE_FROSTED_GLASS_PANE = registerBlock("framed_purple_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_RED_FROSTED_GLASS_PANE = registerBlock("framed_red_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_WHITE_FROSTED_GLASS_PANE = registerBlock("framed_white_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block FRAMED_YELLOW_FROSTED_GLASS_PANE = registerBlock("framed_yellow_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);


    public static final Block CRACKED_FROSTED_GLASS_PANE = registerBlock("cracked_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_BLACK_FROSTED_GLASS_PANE = registerBlock("cracked_black_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_BLUE_FROSTED_GLASS_PANE = registerBlock("cracked_blue_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_BROWN_FROSTED_GLASS_PANE = registerBlock("cracked_brown_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_CYAN_FROSTED_GLASS_PANE = registerBlock("cracked_cyan_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_GRAY_FROSTED_GLASS_PANE = registerBlock("cracked_gray_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_GREEN_FROSTED_GLASS_PANE = registerBlock("cracked_green_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_LIGHT_BLUE_FROSTED_GLASS_PANE = registerBlock("cracked_light_blue_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_LIGHT_GRAY_FROSTED_GLASS_PANE = registerBlock("cracked_light_gray_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_LIME_FROSTED_GLASS_PANE = registerBlock("cracked_lime_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_MAGENTA_FROSTED_GLASS_PANE = registerBlock("cracked_magenta_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_ORANGE_FROSTED_GLASS_PANE = registerBlock("cracked_orange_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_PINK_FROSTED_GLASS_PANE = registerBlock("cracked_pink_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_PURPLE_FROSTED_GLASS_PANE = registerBlock("cracked_purple_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_RED_FROSTED_GLASS_PANE = registerBlock("cracked_red_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_WHITE_FROSTED_GLASS_PANE = registerBlock("cracked_white_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);

    public static final Block CRACKED_YELLOW_FROSTED_GLASS_PANE = registerBlock("cracked_yellow_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.RECRAFT);



    // --- Light Blocks --- //

    public static final Block GLOWGLASS = registerBlock("glowglass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);

//    public static final Block BLACK_GLOWGLASS = registerBlock("black_glowglass", new GlassBlock(FabricBlockSettings
//            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(10)), ModItemGroups.RECRAFT);

    public static final Block BLUE_GLOWGLASS = registerBlock("blue_glowglass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);

//    public static final Block BROWN_GLOWGLASS = registerBlock("brown_glowglass", new GlassBlock(FabricBlockSettings
//            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);

    public static final Block CYAN_GLOWGLASS = registerBlock("cyan_glowglass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);

//    public static final Block GRAY_GLOWGLASS = registerBlock("gray_glowglass", new GlassBlock(FabricBlockSettings
//            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(14)), ModItemGroups.RECRAFT);

    public static final Block GREEN_GLOWGLASS = registerBlock("green_glowglass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);

    public static final Block LIGHT_BLUE_GLOWGLASS = registerBlock("light_blue_glowglass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);

//    public static final Block LIGHT_GRAY_GLOWGLASS = registerBlock("light_gray_glowglass", new GlassBlock(FabricBlockSettings
//            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);

    public static final Block LIME_GLOWGLASS = registerBlock("lime_glowglass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);

    public static final Block MAGENTA_GLOWGLASS = registerBlock("magenta_glowglass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);

    public static final Block ORANGE_GLOWGLASS = registerBlock("orange_glowglass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);

    public static final Block PINK_GLOWGLASS = registerBlock("pink_glowglass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);

    public static final Block PURPLE_GLOWGLASS = registerBlock("purple_glowglass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);

    public static final Block RED_GLOWGLASS = registerBlock("red_glowglass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);

    public static final Block WHITE_GLOWGLASS = registerBlock("white_glowglass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);

    public static final Block YELLOW_GLOWGLASS = registerBlock("yellow_glowglass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.RECRAFT);



//    public static final Block BLACK_GLOWSTONE = registerBlock("black_glowstone", new GlassBlock(FabricBlockSettings
//            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(10)), ModItemGroups.RECRAFT);

    public static final Block BLUE_GLOWSTONE = registerBlock("blue_glowstone", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

//    public static final Block BROWN_GLOWSTONE = registerBlock("brown_glowstone", new GlassBlock(FabricBlockSettings
//            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block CYAN_GLOWSTONE = registerBlock("cyan_glowstone", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

//    public static final Block GRAY_GLOWSTONE = registerBlock("gray_glowstone", new GlassBlock(FabricBlockSettings
//            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block GREEN_GLOWSTONE = registerBlock("green_glowstone", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block LIGHT_BLUE_GLOWSTONE = registerBlock("light_blue_glowstone", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

//    public static final Block LIGHT_GRAY_GLOWSTONE = registerBlock("light_gray_glowstone", new GlassBlock(FabricBlockSettings
//            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block LIME_GLOWSTONE = registerBlock("lime_glowstone", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block MAGENTA_GLOWSTONE = registerBlock("magenta_glowstone", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block ORANGE_GLOWSTONE = registerBlock("orange_glowstone", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block PINK_GLOWSTONE = registerBlock("pink_glowstone", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block PURPLE_GLOWSTONE = registerBlock("purple_glowstone", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block RED_GLOWSTONE = registerBlock("red_glowstone", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block WHITE_GLOWSTONE = registerBlock("white_glowstone", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block YELLOW_GLOWSTONE = registerBlock("yellow_glowstone", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);



//    public static final Block BLACK_REDSTONE_LAMP = registerBlock("black_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
//            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
//            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 10 : 0)), ModItemGroups.RECRAFT);

    public static final Block BLUE_REDSTONE_LAMP = registerBlock("blue_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ModItemGroups.RECRAFT);

//    public static final Block BROWN_REDSTONE_LAMP = registerBlock("brown_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
//            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
//            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ModItemGroups.RECRAFT);

    public static final Block CYAN_REDSTONE_LAMP = registerBlock("cyan_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ModItemGroups.RECRAFT);

//    public static final Block GRAY_REDSTONE_LAMP = registerBlock("gray_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
//            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
//            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 14 : 0)), ModItemGroups.RECRAFT);

    public static final Block GREEN_REDSTONE_LAMP = registerBlock("green_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ModItemGroups.RECRAFT);

    public static final Block LIGHT_BLUE_REDSTONE_LAMP = registerBlock("light_blue_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ModItemGroups.RECRAFT);

//    public static final Block LIGHT_GRAY_REDSTONE_LAMP = registerBlock("light_gray_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
//            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
//            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ModItemGroups.RECRAFT);

    public static final Block LIME_REDSTONE_LAMP = registerBlock("lime_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ModItemGroups.RECRAFT);

    public static final Block MAGENTA_REDSTONE_LAMP = registerBlock("magenta_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ModItemGroups.RECRAFT);

    public static final Block ORANGE_REDSTONE_LAMP = registerBlock("orange_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ModItemGroups.RECRAFT);

    public static final Block PINK_REDSTONE_LAMP = registerBlock("pink_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ModItemGroups.RECRAFT);

    public static final Block PURPLE_REDSTONE_LAMP = registerBlock("purple_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ModItemGroups.RECRAFT);

    public static final Block RED_REDSTONE_LAMP = registerBlock("red_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ModItemGroups.RECRAFT);

    public static final Block WHITE_REDSTONE_LAMP = registerBlock("white_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ModItemGroups.RECRAFT);

    public static final Block YELLOW_REDSTONE_LAMP = registerBlock("yellow_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .of(Material.REDSTONE_LAMP).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS)
            .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ModItemGroups.RECRAFT);



//    public static final Block BLACK_SEA_LANTERN = registerBlock("black_sea_lantern", new GlassBlock(FabricBlockSettings
//                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(10)), ModItemGroups.RECRAFT);

    public static final Block BLUE_SEA_LANTERN = registerBlock("blue_sea_lantern", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

//    public static final Block BROWN_SEA_LANTERN = registerBlock("brown_sea_lantern", new GlassBlock(FabricBlockSettings
//                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block CYAN_SEA_LANTERN = registerBlock("cyan_sea_lantern", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

//    public static final Block GRAY_SEA_LANTERN = registerBlock("gray_sea_lantern", new GlassBlock(FabricBlockSettings
//                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(14)), ModItemGroups.RECRAFT);

    public static final Block GREEN_SEA_LANTERN = registerBlock("green_sea_lantern", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block LIGHT_BLUE_SEA_LANTERN = registerBlock("light_blue_sea_lantern", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

//    public static final Block LIGHT_GRAY_SEA_LANTERN = registerBlock("light_gray_sea_lantern", new GlassBlock(FabricBlockSettings
//                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block LIME_SEA_LANTERN = registerBlock("lime_sea_lantern", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block MAGENTA_SEA_LANTERN = registerBlock("magenta_sea_lantern", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block ORANGE_SEA_LANTERN = registerBlock("orange_sea_lantern", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block PINK_SEA_LANTERN = registerBlock("pink_sea_lantern", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block PURPLE_SEA_LANTERN = registerBlock("purple_sea_lantern", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block RED_SEA_LANTERN = registerBlock("red_sea_lantern", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block WHITE_SEA_LANTERN = registerBlock("white_sea_lantern", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);

    public static final Block YELLOW_SEA_LANTERN = registerBlock("yellow_sea_lantern", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)), ModItemGroups.RECRAFT);



    // --- xxx --- //



    //------------------------------------ Registering Block List ------------------------------------//

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Recraft.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Recraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Recraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        System.out.println("Registering ModBlocks for " + Recraft.MOD_ID);
    }
}
