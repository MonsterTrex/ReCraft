package net.monstertrex.recraft.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;


public class ModPlacedFeatures {



    public static final RegistryEntry<PlacedFeature> STEEL_ORE_PLACED = PlacedFeatures.register("steel_ore_placed",
            ModConfiguredFeatures.NETHER_STEEL_ORE, ModOreFeatures.modifiersWithCount(6,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(10), YOffset.belowTop(10))));





}
