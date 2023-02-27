package net.monstertrex.recraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.monstertrex.recraft.Recraft;
import net.monstertrex.recraft.block.ModBlocks;
import net.monstertrex.recraft.item.custom.*;

public class ModItems{

    //------------------------------------------- Item List -------------------------------------------//

    public static final Item STITCHED_ROTTEN_FLESH = registerItem("stitched_rotten_flesh",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT)));



        //--- Glass Items ---//
    public static final Item GLASS_SHARD = registerItem("glass_shard",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT)));

    public static final Item GLASS_DUST = registerItem("glass_dust",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT)));



        //--- Golden Food ---//
    public static final Item GOLDEN_BAKED_POTATO = registerItem("golden_baked_potato",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_BAKED_POTATO)));

    public static final Item GOLDEN_BEETROOT = registerItem("golden_beetroot",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_BEETROOT)));

    public static final Item GOLDEN_BEETROOT_SOUP = registerItem("golden_beetroot_soup",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_BEETROOT_SOUP)));

    public static final Item GOLDEN_BREAD = registerItem("golden_bread",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_BREAD)));

    public static final Item GOLDEN_CHORUS_FRUIT = registerItem("golden_chorus_fruit",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_CHORUS_FRUIT)));

    public static final Item GOLDEN_COOKED_BEEF = registerItem("golden_cooked_beef",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_COOKED_BEEF)));

    public static final Item GOLDEN_COOKED_CHICKEN = registerItem("golden_cooked_chicken",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_COOKED_CHICKEN)));

    public static final Item GOLDEN_COOKED_COD = registerItem("golden_cooked_cod",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_COOKED_COD)));

    public static final Item GOLDEN_COOKED_MUTTON = registerItem("golden_cooked_mutton",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_COOKED_MUTTON)));

    public static final Item GOLDEN_COOKED_PORKCHOP = registerItem("golden_cooked_porkchop",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_COOKED_PORKCHOP)));

    public static final Item GOLDEN_COOKED_RABBIT = registerItem("golden_cooked_rabbit",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_COOKED_RABBIT)));

    public static final Item GOLDEN_COOKED_SALMON = registerItem("golden_cooked_salmon",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_COOKED_SALMON)));

    public static final Item GOLDEN_GLOW_BERRIES = registerItem("golden_glow_berries",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_GLOW_BERRIES)));

    public static final Item GOLDEN_PUMPKIN_PIE = registerItem("golden_pumpkin_pie",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_PUMPKIN_PIE)));

    public static final Item GOLDEN_SWEET_BERRIES = registerItem("golden_sweet_berries",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT).food(ModFoodComponents.GOLDEN_SWEET_BERRIES)));



        //--- Copper Items ---//
    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item COPPER_PLATING = registerItem("copper_plating",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT)));

    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new ModPickaxeItem(ModToolMaterial.COPPER, 2, -2.8f,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new ModAxeItem(ModToolMaterial.COPPER, 7f, -3.1f,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ModShovelItem(ModToolMaterial.COPPER, 2.5f, -3f,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new ModHoeItem(ModToolMaterial.COPPER, 0, -1f,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new ModSwordItem(ModToolMaterial.COPPER, 3, -2.4f,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));

    public static final Item COPPER_HORSE_ARMOR = registerItem("copper_horse_armor",
            new HorseArmorItem(5, "copper",
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));



        //--- Copper Plated Items ---//
    public static final Item MIXED_RAW_COPPER_GOLD = registerItem("mixed_raw_copper_gold",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT)));

    public static final Item COPPER_GOLD_MIXED_INGOT = registerItem("copper_gold_mixed_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT)));

    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item ROSE_GOLD_NUGGET = registerItem("rose_gold_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT)));

    public static final Item ROSE_GOLD_PICKAXE = registerItem("rose_gold_pickaxe",
            new ModPickaxeItem(ModToolMaterial.ROSE_GOLD, 2, -2.8f,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item ROSE_GOLD_AXE = registerItem("rose_gold_axe",
            new ModAxeItem(ModToolMaterial.ROSE_GOLD, 7f, -3,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item ROSE_GOLD_SHOVEL = registerItem("rose_gold_shovel",
            new ModShovelItem(ModToolMaterial.ROSE_GOLD, 2.5f, -3f,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item ROSE_GOLD_HOE = registerItem("rose_gold_hoe",
            new ModHoeItem(ModToolMaterial.ROSE_GOLD,  0, -2f,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item ROSE_GOLD_SWORD = registerItem("rose_gold_sword",
            new ModSwordItem(ModToolMaterial.ROSE_GOLD, 4, -2.4f,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));

    public static final Item ROSE_GOLD_HELMET = registerItem("rose_gold_helmet",
            new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item ROSE_GOLD_CHESTPLATE = registerItem("rose_gold_chestplate",
            new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item ROSE_GOLD_LEGGINGS = registerItem("rose_gold_leggings",
            new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item ROSE_GOLD_BOOTS = registerItem("rose_gold_boots",
            new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));

    public static final Item ROSE_GOLD_HORSE_ARMOR = registerItem("rose_gold_horse_armor",
            new HorseArmorItem(8, "rose_gold",
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));



        //--- Steel Items ---//
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.RECRAFT)));

    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new ModPickaxeItem(ModToolMaterial.STEEL, 3, -2.8f,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new ModAxeItem(ModToolMaterial.STEEL, 8f, -3.1f,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ModShovelItem(ModToolMaterial.STEEL, 4f, -3f,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new ModHoeItem(ModToolMaterial.STEEL, 0, -1f,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new ModSwordItem(ModToolMaterial.STEEL, 5, -2.4f,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));

    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));

    public static final Item STEEL_HORSE_ARMOR = registerItem("steel_horse_armor",
            new HorseArmorItem(7, "steel",
                    new FabricItemSettings().group(ModItemGroups.RECRAFT)));


    //--- Bamboo Blocks ---//

    public static final Item BAMBOO_SIGN = registerItem("bamboo_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroups.RECRAFT).maxCount(16),
                    ModBlocks.BAMBOO_SIGN_BLOCK, ModBlocks.BAMBOO_WALL_SIGN_BLOCK));

    public static final Item DRIED_BAMBOO_SIGN = registerItem("dried_bamboo_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroups.RECRAFT).maxCount(16),
                    ModBlocks.DRIED_BAMBOO_SIGN_BLOCK, ModBlocks.DRIED_BAMBOO_WALL_SIGN_BLOCK));



    //------------------------------------ Registering Item List ------------------------------------//

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Recraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + Recraft.MOD_ID);
    }

}
