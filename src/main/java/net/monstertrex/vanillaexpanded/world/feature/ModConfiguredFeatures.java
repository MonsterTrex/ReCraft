package net.monstertrex.vanillaexpanded.world.feature;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.monstertrex.vanillaexpanded.VanillaExpanded;
import net.monstertrex.vanillaexpanded.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {


    public static final List<OreFeatureConfig.Target> NETHER_NETHER_STEEL_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHER_STEEL_ORE.getDefaultState()));

    public static final ConfiguredFeature<?, ?> NETHER_STEEL_ORE = register("nether_steel_ore",
            Feature.ORE.configure(new OreFeatureConfig(NETHER_NETHER_STEEL_ORE, 6)));






    public static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(VanillaExpanded.MOD_ID, name),
                configuredFeature);
    }

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries,
                Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(block)).withInAirFilter());
    }

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + VanillaExpanded.MOD_ID);
    }
}
