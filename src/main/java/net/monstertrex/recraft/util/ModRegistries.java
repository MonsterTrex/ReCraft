package net.monstertrex.recraft.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.monstertrex.recraft.Recraft;
import net.monstertrex.recraft.block.ModBlocks;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();

    }

    private static void registerFuels(){
        System.out.println("Registering Fuels for + " + Recraft.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

            // 16000/20 = 800s, 80 items
        registry.add(ModBlocks.CHARCOAL_BLOCK,16000);

    }

}
