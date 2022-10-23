package net.monstertrex.recraft.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.monstertrex.recraft.Recraft;
import net.monstertrex.recraft.block.ModBlocks;
import net.monstertrex.recraft.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();

    }

    private static void registerFuels(){
        System.out.println("Registering Fuels for + " + Recraft.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

            // 200/20 = 10 seconds, 1 item
        registry.add(ModBlocks.CHARCOAL_BLOCK,16000);
        registry.add(ModBlocks.DRIED_BAMBOO_STACK,300);
        registry.add(ModBlocks.DRIED_BAMBOO_SLAB,150);
        registry.add(ModBlocks.DRIED_BAMBOO_STAIRS,300);
        registry.add(ModBlocks.DRIED_BAMBOO_PLANKS,300);
        registry.add(ModBlocks.DRIED_BAMBOO_PLANK_SLAB,150);
        registry.add(ModBlocks.DRIED_BAMBOO_PLANK_STAIRS,300);
        registry.add(ModBlocks.DRIED_BAMBOO_MOSAIC,300);
        registry.add(ModBlocks.DRIED_BAMBOO_MOSAIC_SLAB,150);
        registry.add(ModBlocks.DRIED_BAMBOO_MOSAIC_STAIRS,300);
        registry.add(ModBlocks.DRIED_BAMBOO_FENCE,300);
        registry.add(ModBlocks.DRIED_BAMBOO_FENCE_GATE,300);
        registry.add(ModBlocks.DRIED_BAMBOO_DOOR,200);
        registry.add(ModBlocks.DRIED_BAMBOO_TRAPDOOR,300);
        registry.add(ModBlocks.DRIED_BAMBOO_BUTTON,100);
        registry.add(ModBlocks.DRIED_BAMBOO_PRESSURE_PLATE,300);
        registry.add(ModItems.DRIED_BAMBOO_SIGN,200);
        //registry.add(ModBlocks.DRIED_BAMBOO_RAFT,400 );

    }
}
