package net.monstertrex.recraft.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static FoodComponent GOLDEN_BAKED_POTATO = new FoodComponent.Builder()
            .hunger(8).saturationModifier(1.2f)
            .build();

    public static FoodComponent GOLDEN_BEETROOT = new FoodComponent.Builder()
            .hunger(4).saturationModifier(0.4f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 400), 1f)
            .build();

    public static FoodComponent GOLDEN_BEETROOT_SOUP = new FoodComponent.Builder()
            .hunger(12).saturationModifier(1.4f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2400), 1f)
            .build();

    public static FoodComponent GOLDEN_BREAD = new FoodComponent.Builder()
            .hunger(10).saturationModifier(1.0f)
            .build();

    public static FoodComponent GOLDEN_CHORUS_FRUIT = new FoodComponent.Builder()
            .hunger(6).saturationModifier(0.6f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 500), 1f)
            .build();

    public static FoodComponent GOLDEN_COOKED_BEEF = new FoodComponent.Builder()
            .hunger(10).saturationModifier(1.4f)
            .build();

    public static FoodComponent GOLDEN_COOKED_CHICKEN = new FoodComponent.Builder()
            .hunger(8).saturationModifier(0.8f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 800), 1f)
            .build();

    public static FoodComponent GOLDEN_COOKED_COD = new FoodComponent.Builder()
            .hunger(6).saturationModifier(0.8f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 600), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 600), 1f)
            .build();

    public static FoodComponent GOLDEN_COOKED_MUTTON = new FoodComponent.Builder()
            .hunger(8).saturationModifier(1.4f)
            .build();

    public static FoodComponent GOLDEN_COOKED_PORKCHOP = new FoodComponent.Builder()
            .hunger(10).saturationModifier(1.4f)
            .build();

    public static FoodComponent GOLDEN_COOKED_RABBIT = new FoodComponent.Builder()
            .hunger(7).saturationModifier(0.8f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 900), 1f)
            .build();

    public static FoodComponent GOLDEN_COOKED_SALMON = new FoodComponent.Builder()
            .hunger(7).saturationModifier(1.0f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 900), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 900), 1f)
            .build();

    public static FoodComponent GOLDEN_GLOW_BERRIES = new FoodComponent.Builder()
            .hunger(4).saturationModifier(0.4f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 300), 1f)
            .build();

    public static FoodComponent GOLDEN_PUMPKIN_PIE = new FoodComponent.Builder()
            .hunger(10).saturationModifier(0.8f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 3600), 1f)
            .build();

    public static FoodComponent GOLDEN_SWEET_BERRIES = new FoodComponent.Builder()
            .hunger(4).saturationModifier(0.4f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600), 1f)
            .build();

}
