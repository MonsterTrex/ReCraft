package net.monstertrex.recraft.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.monstertrex.recraft.Recraft;
import net.monstertrex.recraft.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {


    public static final List<OreFeatureConfig.Target> NETHER_NETHER_STEEL_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHER_STEEL_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_STEEL_ORE = ConfiguredFeatures.register ("nether_steel_ore",
            Feature.ORE, new OreFeatureConfig(NETHER_NETHER_STEEL_ORE, 6));



    public static final List<OreFeatureConfig.Target> NETHER_NETHER_STEEL_ORE_BOTTOM = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHER_STEEL_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_STEEL_ORE_BOTTOM = ConfiguredFeatures.register ("nether_steel_ore_bottom",
            Feature.ORE, new OreFeatureConfig(NETHER_NETHER_STEEL_ORE_BOTTOM, 10));






    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + Recraft.MOD_ID);
    }
}
