package net.monstertrex.vanillaexpanded.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.monstertrex.vanillaexpanded.VanillaExpanded;
import net.monstertrex.vanillaexpanded.block.ModBlocks;
import net.monstertrex.vanillaexpanded.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();

    }

    private static void registerFuels(){
        System.out.println("Registering Fuels for + " + VanillaExpanded.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

            // 16000/20 = 800s, 80 items
        registry.add(ModBlocks.CHARCOAL_BLOCK,16000);

    }

}
