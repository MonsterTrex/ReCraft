package net.monstertrex.vanillaexpanded.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.monstertrex.vanillaexpanded.VanillaExpanded;

public class ModItems{

    //------------------------------------------- Item List -------------------------------------------//

        //--- Glass Items ---//
    public static final Item GLASS_SHARD = registerItem("glass_shard",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED)));

    public static final Item GLASS_DUST = registerItem("glass_dust",
            new Item(new FabricItemSettings().group(ModItemGroups.VANILLAEXPANDED)));



    //------------------------------------ Registering Item List ------------------------------------//

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaExpanded.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + VanillaExpanded.MOD_ID);
    }

}
