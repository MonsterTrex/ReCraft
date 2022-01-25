package net.monstertrex.vanillaexpanded.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.monstertrex.vanillaexpanded.VanillaExpanded;

public class ModItems{

    //------------------------------------------- Item List -------------------------------------------//

    public static final Item STITCHED_ROTTEN_FLESH = registerItem("stitched_rotten_flesh",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED)));



        //--- Glass Items ---//
    public static final Item GLASS_SHARD = registerItem("glass_shard",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED)));

    public static final Item GLASS_DUST = registerItem("glass_dust",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED)));



        //--- Golden Food ---//
    public static final Item GOLDEN_BAKED_POTATO = registerItem("golden_baked_potato",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_BAKED_POTATO)));

    public static final Item GOLDEN_BEETROOT = registerItem("golden_beetroot",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_BEETROOT)));

    public static final Item GOLDEN_BEETROOT_SOUP = registerItem("golden_beetroot_soup",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_BEETROOT_SOUP)));

    public static final Item GOLDEN_BREAD = registerItem("golden_bread",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_BREAD)));

    public static final Item GOLDEN_CHORUS_FRUIT = registerItem("golden_chorus_fruit",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_CHORUS_FRUIT)));

    public static final Item GOLDEN_COOKED_BEEF = registerItem("golden_cooked_beef",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_COOKED_BEEF)));

    public static final Item GOLDEN_COOKED_CHICKEN = registerItem("golden_cooked_chicken",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_COOKED_CHICKEN)));

    public static final Item GOLDEN_COOKED_COD = registerItem("golden_cooked_cod",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_COOKED_COD)));

    public static final Item GOLDEN_COOKED_MUTTON = registerItem("golden_cooked_mutton",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_COOKED_MUTTON)));

    public static final Item GOLDEN_COOKED_PORKCHOP = registerItem("golden_cooked_porkchop",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_COOKED_PORKCHOP)));

    public static final Item GOLDEN_COOKED_RABBIT = registerItem("golden_cooked_rabbit",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_COOKED_RABBIT)));

    public static final Item GOLDEN_COOKED_SALMON = registerItem("golden_cooked_salmon",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_COOKED_SALMON)));

    public static final Item GOLDEN_GLOW_BERRIES = registerItem("golden_glow_berries",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_GLOW_BERRIES)));

    public static final Item GOLDEN_PUMPKIN_PIE = registerItem("golden_pumpkin_pie",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_PUMPKIN_PIE)));

    public static final Item GOLDEN_SWEET_BERRIES = registerItem("golden_sweet_berries",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED).food(ModFoodComponents.GOLDEN_SWEET_BERRIES)));



    //------------------------------------ Registering Item List ------------------------------------//

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaExpanded.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + VanillaExpanded.MOD_ID);
    }

}
