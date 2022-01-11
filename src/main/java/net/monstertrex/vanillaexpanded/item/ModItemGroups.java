package net.monstertrex.vanillaexpanded.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.monstertrex.vanillaexpanded.VanillaExpanded;

public class ModItemGroups {
    public static final ItemGroup VANILLAEXPANDED = FabricItemGroupBuilder.build(new Identifier(VanillaExpanded.MOD_ID, "vanillaexpanded"),
    () -> new ItemStack(ModItems.GLASS_SHARD));
}
