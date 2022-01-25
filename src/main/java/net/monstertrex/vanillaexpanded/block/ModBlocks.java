package net.monstertrex.vanillaexpanded.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.monstertrex.vanillaexpanded.VanillaExpanded;
import net.monstertrex.vanillaexpanded.block.custom.ModPaneBlock;
import net.monstertrex.vanillaexpanded.item.ModItemGroups;

public class ModBlocks {

    //------------------------------------------ Block List ------------------------------------------//

    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block", new Block(FabricBlockSettings
            .of(Material.STONE).strength(6,6).requiresTool().sounds(BlockSoundGroup.STONE)), ModItemGroups.VANILLAEXPANDED);

        //--- Glass Blocks ---//
    public static final Block CRACKED_GLASS = registerBlock("cracked_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_BLACK_STAINED_GLASS = registerBlock("cracked_black_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_BLUE_STAINED_GLASS = registerBlock("cracked_blue_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_BROWN_STAINED_GLASS = registerBlock("cracked_brown_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_CYAN_STAINED_GLASS = registerBlock("cracked_cyan_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_GRAY_STAINED_GLASS = registerBlock("cracked_gray_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_GREEN_STAINED_GLASS = registerBlock("cracked_green_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_LIGHT_BLUE_STAINED_GLASS = registerBlock("cracked_light_blue_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_LIGHT_GRAY_STAINED_GLASS = registerBlock("cracked_light_gray_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_LIME_STAINED_GLASS = registerBlock("cracked_lime_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_MAGENTA_STAINED_GLASS = registerBlock("cracked_magenta_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_ORANGE_STAINED_GLASS = registerBlock("cracked_orange_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_PINK_STAINED_GLASS = registerBlock("cracked_pink_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_PURPLE_STAINED_GLASS = registerBlock("cracked_purple_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_RED_STAINED_GLASS = registerBlock("cracked_red_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_WHITE_STAINED_GLASS = registerBlock("cracked_white_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_YELLOW_STAINED_GLASS = registerBlock("cracked_yellow_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);


    public static final Block FRAMED_GLASS = registerBlock("framed_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_BLACK_STAINED_GLASS = registerBlock("framed_black_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_BLUE_STAINED_GLASS = registerBlock("framed_blue_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_BROWN_STAINED_GLASS = registerBlock("framed_brown_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_CYAN_STAINED_GLASS = registerBlock("framed_cyan_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_GRAY_STAINED_GLASS = registerBlock("framed_gray_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_GREEN_STAINED_GLASS = registerBlock("framed_green_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS = registerBlock("framed_light_blue_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS = registerBlock("framed_light_gray_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_LIME_STAINED_GLASS = registerBlock("framed_lime_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_MAGENTA_STAINED_GLASS = registerBlock("framed_magenta_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_ORANGE_STAINED_GLASS = registerBlock("framed_orange_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_PINK_STAINED_GLASS = registerBlock("framed_pink_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_PURPLE_STAINED_GLASS = registerBlock("framed_purple_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_RED_STAINED_GLASS = registerBlock("framed_red_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_WHITE_STAINED_GLASS = registerBlock("framed_white_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_YELLOW_STAINED_GLASS = registerBlock("framed_yellow_stained_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);


    public static final Block FROSTED_GLASS = registerBlock("frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block BLACK_FROSTED_GLASS = registerBlock("black_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block BLUE_FROSTED_GLASS = registerBlock("blue_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block BROWN_FROSTED_GLASS = registerBlock("brown_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CYAN_FROSTED_GLASS = registerBlock("cyan_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block GRAY_FROSTED_GLASS = registerBlock("gray_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block GREEN_FROSTED_GLASS = registerBlock("green_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block LIGHT_BLUE_FROSTED_GLASS = registerBlock("light_blue_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block LIGHT_GRAY_FROSTED_GLASS = registerBlock("light_gray_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block LIME_FROSTED_GLASS = registerBlock("lime_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block MAGENTA_FROSTED_GLASS = registerBlock("magenta_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block ORANGE_FROSTED_GLASS = registerBlock("orange_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block PINK_FROSTED_GLASS = registerBlock("pink_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block PURPLE_FROSTED_GLASS = registerBlock("purple_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block RED_FROSTED_GLASS = registerBlock("red_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block WHITE_FROSTED_GLASS = registerBlock("white_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block YELLOW_FROSTED_GLASS = registerBlock("yellow_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);


    public static final Block FRAMED_FROSTED_GLASS = registerBlock("framed_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_BLACK_FROSTED_GLASS = registerBlock("framed_black_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_BLUE_FROSTED_GLASS = registerBlock("framed_blue_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_BROWN_FROSTED_GLASS = registerBlock("framed_brown_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_CYAN_FROSTED_GLASS = registerBlock("framed_cyan_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_GRAY_FROSTED_GLASS = registerBlock("framed_gray_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_GREEN_FROSTED_GLASS = registerBlock("framed_green_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_LIGHT_BLUE_FROSTED_GLASS = registerBlock("framed_light_blue_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_LIGHT_GRAY_FROSTED_GLASS = registerBlock("framed_light_gray_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_LIME_FROSTED_GLASS = registerBlock("framed_lime_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_MAGENTA_FROSTED_GLASS = registerBlock("framed_magenta_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_ORANGE_FROSTED_GLASS = registerBlock("framed_orange_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_PINK_FROSTED_GLASS = registerBlock("framed_pink_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_PURPLE_FROSTED_GLASS = registerBlock("framed_purple_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_RED_FROSTED_GLASS = registerBlock("framed_red_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_WHITE_FROSTED_GLASS = registerBlock("framed_white_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_YELLOW_FROSTED_GLASS = registerBlock("framed_yellow_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);


    public static final Block CRACKED_FROSTED_GLASS = registerBlock("cracked_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_BLACK_FROSTED_GLASS = registerBlock("cracked_black_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_BLUE_FROSTED_GLASS = registerBlock("cracked_blue_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_BROWN_FROSTED_GLASS = registerBlock("cracked_brown_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_CYAN_FROSTED_GLASS = registerBlock("cracked_cyan_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_GRAY_FROSTED_GLASS = registerBlock("cracked_gray_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_GREEN_FROSTED_GLASS = registerBlock("cracked_green_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_LIGHT_BLUE_FROSTED_GLASS = registerBlock("cracked_light_blue_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_LIGHT_GRAY_FROSTED_GLASS = registerBlock("cracked_light_gray_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_LIME_FROSTED_GLASS = registerBlock("cracked_lime_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_MAGENTA_FROSTED_GLASS = registerBlock("cracked_magenta_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_ORANGE_FROSTED_GLASS = registerBlock("cracked_orange_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_PINK_FROSTED_GLASS = registerBlock("cracked_pink_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_PURPLE_FROSTED_GLASS = registerBlock("cracked_purple_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_RED_FROSTED_GLASS = registerBlock("cracked_red_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_WHITE_FROSTED_GLASS = registerBlock("cracked_white_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_YELLOW_FROSTED_GLASS = registerBlock("cracked_yellow_frosted_glass", new GlassBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);


    public static final Block CRACKED_GLASS_PANE = registerBlock("cracked_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_BLACK_STAINED_GLASS_PANE = registerBlock("cracked_black_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_BLUE_STAINED_GLASS_PANE = registerBlock("cracked_blue_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_BROWN_STAINED_GLASS_PANE = registerBlock("cracked_brown_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_CYAN_STAINED_GLASS_PANE = registerBlock("cracked_cyan_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_GRAY_STAINED_GLASS_PANE = registerBlock("cracked_gray_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_GREEN_STAINED_GLASS_PANE = registerBlock("cracked_green_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("cracked_light_blue_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("cracked_light_gray_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_LIME_STAINED_GLASS_PANE = registerBlock("cracked_lime_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_MAGENTA_STAINED_GLASS_PANE = registerBlock("cracked_magenta_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_ORANGE_STAINED_GLASS_PANE = registerBlock("cracked_orange_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_PINK_STAINED_GLASS_PANE = registerBlock("cracked_pink_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_PURPLE_STAINED_GLASS_PANE = registerBlock("cracked_purple_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_RED_STAINED_GLASS_PANE = registerBlock("cracked_red_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_WHITE_STAINED_GLASS_PANE = registerBlock("cracked_white_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_YELLOW_STAINED_GLASS_PANE = registerBlock("cracked_yellow_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);


    public static final Block FRAMED_GLASS_PANE = registerBlock("framed_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_BLACK_STAINED_GLASS_PANE = registerBlock("framed_black_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_BLUE_STAINED_GLASS_PANE = registerBlock("framed_blue_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_BROWN_STAINED_GLASS_PANE = registerBlock("framed_brown_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_CYAN_STAINED_GLASS_PANE = registerBlock("framed_cyan_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_GRAY_STAINED_GLASS_PANE = registerBlock("framed_gray_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_GREEN_STAINED_GLASS_PANE = registerBlock("framed_green_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("framed_light_blue_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("framed_light_gray_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_LIME_STAINED_GLASS_PANE = registerBlock("framed_lime_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_MAGENTA_STAINED_GLASS_PANE = registerBlock("framed_magenta_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_ORANGE_STAINED_GLASS_PANE = registerBlock("framed_orange_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_PINK_STAINED_GLASS_PANE = registerBlock("framed_pink_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_PURPLE_STAINED_GLASS_PANE = registerBlock("framed_purple_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_RED_STAINED_GLASS_PANE = registerBlock("framed_red_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_WHITE_STAINED_GLASS_PANE = registerBlock("framed_white_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_YELLOW_STAINED_GLASS_PANE = registerBlock("framed_yellow_stained_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);


    public static final Block FROSTED_GLASS_PANE = registerBlock("frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block BLACK_FROSTED_GLASS_PANE = registerBlock("black_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block BLUE_FROSTED_GLASS_PANE = registerBlock("blue_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block BROWN_FROSTED_GLASS_PANE = registerBlock("brown_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CYAN_FROSTED_GLASS_PANE = registerBlock("cyan_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block GRAY_FROSTED_GLASS_PANE = registerBlock("gray_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block GREEN_FROSTED_GLASS_PANE = registerBlock("green_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block LIGHT_BLUE_FROSTED_GLASS_PANE = registerBlock("light_blue_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block LIGHT_GRAY_FROSTED_GLASS_PANE = registerBlock("light_gray_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block LIME_FROSTED_GLASS_PANE = registerBlock("lime_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block MAGENTA_FROSTED_GLASS_PANE = registerBlock("magenta_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block ORANGE_FROSTED_GLASS_PANE = registerBlock("orange_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block PINK_FROSTED_GLASS_PANE = registerBlock("pink_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block PURPLE_FROSTED_GLASS_PANE = registerBlock("purple_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block RED_FROSTED_GLASS_PANE = registerBlock("red_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block WHITE_FROSTED_GLASS_PANE = registerBlock("white_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block YELLOW_FROSTED_GLASS_PANE = registerBlock("yellow_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);


    public static final Block FRAMED_FROSTED_GLASS_PANE = registerBlock("framed_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_BLACK_FROSTED_GLASS_PANE = registerBlock("framed_black_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_BLUE_FROSTED_GLASS_PANE = registerBlock("framed_blue_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_BROWN_FROSTED_GLASS_PANE = registerBlock("framed_brown_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_CYAN_FROSTED_GLASS_PANE = registerBlock("framed_cyan_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_GRAY_FROSTED_GLASS_PANE = registerBlock("framed_gray_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_GREEN_FROSTED_GLASS_PANE = registerBlock("framed_green_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_LIGHT_BLUE_FROSTED_GLASS_PANE = registerBlock("framed_light_blue_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_LIGHT_GRAY_FROSTED_GLASS_PANE = registerBlock("framed_light_gray_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_LIME_FROSTED_GLASS_PANE = registerBlock("framed_lime_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_MAGENTA_FROSTED_GLASS_PANE = registerBlock("framed_magenta_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_ORANGE_FROSTED_GLASS_PANE = registerBlock("framed_orange_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_PINK_FROSTED_GLASS_PANE = registerBlock("framed_pink_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_PURPLE_FROSTED_GLASS_PANE = registerBlock("framed_purple_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_RED_FROSTED_GLASS_PANE = registerBlock("framed_red_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_WHITE_FROSTED_GLASS_PANE = registerBlock("framed_white_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block FRAMED_YELLOW_FROSTED_GLASS_PANE = registerBlock("framed_yellow_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.6f,1.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);


    public static final Block CRACKED_FROSTED_GLASS_PANE = registerBlock("cracked_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_BLACK_FROSTED_GLASS_PANE = registerBlock("cracked_black_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_BLUE_FROSTED_GLASS_PANE = registerBlock("cracked_blue_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_BROWN_FROSTED_GLASS_PANE = registerBlock("cracked_brown_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_CYAN_FROSTED_GLASS_PANE = registerBlock("cracked_cyan_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_GRAY_FROSTED_GLASS_PANE = registerBlock("cracked_gray_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_GREEN_FROSTED_GLASS_PANE = registerBlock("cracked_green_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_LIGHT_BLUE_FROSTED_GLASS_PANE = registerBlock("cracked_light_blue_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_LIGHT_GRAY_FROSTED_GLASS_PANE = registerBlock("cracked_light_gray_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_LIME_FROSTED_GLASS_PANE = registerBlock("cracked_lime_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_MAGENTA_FROSTED_GLASS_PANE = registerBlock("cracked_magenta_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_ORANGE_FROSTED_GLASS_PANE = registerBlock("cracked_orange_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_PINK_FROSTED_GLASS_PANE = registerBlock("cracked_pink_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_PURPLE_FROSTED_GLASS_PANE = registerBlock("cracked_purple_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_RED_FROSTED_GLASS_PANE = registerBlock("cracked_red_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_WHITE_FROSTED_GLASS_PANE = registerBlock("cracked_white_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);

    public static final Block CRACKED_YELLOW_FROSTED_GLASS_PANE = registerBlock("cracked_yellow_frosted_glass_pane", new ModPaneBlock(FabricBlockSettings
            .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque()), ModItemGroups.VANILLAEXPANDED);


    public static final Block GLOWGLASS = registerBlock("glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);

    public static final Block BLACK_GLOWGLASS = registerBlock("black_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(10)), ModItemGroups.VANILLAEXPANDED);

    public static final Block BLUE_GLOWGLASS = registerBlock("blue_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);

    public static final Block BROWN_GLOWGLASS = registerBlock("brown_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);

    public static final Block CYAN_GLOWGLASS = registerBlock("cyan_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);

    public static final Block GREEN_GLOWGLASS = registerBlock("gray_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(14)), ModItemGroups.VANILLAEXPANDED);

    public static final Block GRAY_GLOWGLASS = registerBlock("green_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);

    public static final Block LIGHT_BLUE_GLOWGLASS = registerBlock("light_blue_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);

    public static final Block LIGHT_GRAY_GLOWGLASS = registerBlock("light_gray_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);

    public static final Block LIME_GLOWGLASS = registerBlock("lime_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);

    public static final Block MAGENTA_GLOWGLASS = registerBlock("magenta_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);

    public static final Block ORANGE_GLOWGLASS = registerBlock("orange_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);

    public static final Block PINK_GLOWGLASS = registerBlock("pink_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);

    public static final Block PURPLE_GLOWGLASS = registerBlock("purple_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);

    public static final Block RED_GLOWGLASS = registerBlock("red_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);

    public static final Block WHITE_GLOWGLASS = registerBlock("white_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);

    public static final Block YELLOW_GLOWGLASS = registerBlock("yellow_glowglass", new GlassBlock(FabricBlockSettings
                    .of(Material.GLASS).strength(0.3f,0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(15)), ModItemGroups.VANILLAEXPANDED);






    //------------------------------------ Registering Block List ------------------------------------//

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(VanillaExpanded.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaExpanded.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        System.out.println("Registering ModBlocks for " + VanillaExpanded.MOD_ID);
    }
}
