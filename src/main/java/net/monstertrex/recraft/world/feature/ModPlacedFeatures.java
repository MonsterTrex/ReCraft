package net.monstertrex.recraft.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;


public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> STEEL_ORE_PLACED = PlacedFeatures.register("steel_ore_placed",
            ModConfiguredFeatures.NETHER_STEEL_ORE, ModOreFeatures.modifiersWithCount(9,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(20), YOffset.belowTop(10))));

    public static final RegistryEntry<PlacedFeature> STEEL_ORE_BOTTOM_PLACED = PlacedFeatures.register("steel_ore_placed_bottom",
            ModConfiguredFeatures.NETHER_STEEL_ORE_BOTTOM, ModOreFeatures.modifiersWithCount(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(4), YOffset.belowTop(100))));

}
