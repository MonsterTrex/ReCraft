package net.monstertrex.vanillaexpanded.world.feature;

import net.monstertrex.vanillaexpanded.VanillaExpanded;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;


public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> STEEL_ORE_PLACED_KEY = registerKey("steel_ore_placed");



    public static final PlacedFeature STEEL_ORE_PLACED = registerPlacedFeature("steel_ore_placed",
            ModConfiguredFeatures.NETHER_STEEL_ORE.withPlacement(ModOreFeatures.modifiersWithCount(6,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(10), YOffset.belowTop(10)))));






    private static PlacedFeature registerPlacedFeature(String name, PlacedFeature placedFeature) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(VanillaExpanded.MOD_ID, name), placedFeature);
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(VanillaExpanded.MOD_ID, name));
    }
}
