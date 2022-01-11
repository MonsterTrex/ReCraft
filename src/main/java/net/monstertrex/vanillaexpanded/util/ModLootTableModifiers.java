package net.monstertrex.vanillaexpanded.util;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.monstertrex.vanillaexpanded.item.ModItems;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {


        // Block ID's defined //

    private static final Identifier GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/glass");

    private static final Identifier GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/glass_pane");

    private static final Identifier BLACK_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/black_stained_glass");

    private static final Identifier BLACK_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/black_stained_glass_pane");

    private static final Identifier BLUE_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/blue_stained_glass");

    private static final Identifier BLUE_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/blue_stained_glass_pane");

    private static final Identifier BROWN_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/brown_stained_glass");

    private static final Identifier BROWN_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/brown_stained_glass_pane");

    private static final Identifier CYAN_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/cyan_stained_glass");

    private static final Identifier CYAN_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/cyan_stained_glass_pane");

    private static final Identifier GREEN_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/green_stained_glass");

    private static final Identifier GREEN_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/green_stained_glass_pane");

    private static final Identifier LIGHT_BLUE_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/light_blue_stained_glass");

    private static final Identifier LIGHT_BLUE_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/light_blue_stained_glass_pane");

    private static final Identifier LIGHT_GREY_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/light_grey_stained_glass");

    private static final Identifier LIGHT_GREY_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/light_grey_stained_glass_pane");

    private static final Identifier LIME_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/lime_stained_glass");

    private static final Identifier LIME_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/lime_stained_glass_pane");

    private static final Identifier MAGENTA_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/magenta_stained_glass");

    private static final Identifier MAGENTA_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/magenta_stained_glass_pane");

    private static final Identifier ORANGE_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/orange_stained_glass");

    private static final Identifier ORANGE_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/orange_stained_glass_pane");

    private static final Identifier PINK_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/pink_stained_glass");

    private static final Identifier PINK_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/pink_stained_glass_pane");

    private static final Identifier PURPLE_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/purple_stained_glass");

    private static final Identifier PURPLE_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/purple_stained_glass_pane");

    private static final Identifier RED_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/red_stained_glass");

    private static final Identifier RED_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/red_stained_glass_pane");

    private static final Identifier WHITE_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/white_stained_glass");

    private static final Identifier WHITE_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/white_stained_glass_pane");

    private static final Identifier YELLOW_STAINED_GLASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/yellow_stained_glass");

    private static final Identifier YELLOW_STAINED_GLASS_PANE_BLOCK_ID
            = new Identifier("minecraft", "blocks/yellow_stained_glass_pane");


        // Block ID added Look Tables //

    public static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if(GLASS_BLOCK_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1))
                        .with(ItemEntry.builder(ModItems.GLASS_SHARD))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());
                supplier.withPool(poolBuilder.build());
            }



        }));
    }
}
