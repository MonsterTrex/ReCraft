package net.monstertrex.recraft.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.monstertrex.recraft.Recraft;

public class ModItemGroups {
    public static final ItemGroup RECRAFT = FabricItemGroupBuilder.build(new Identifier(Recraft.MOD_ID, "recraft"),
    () -> new ItemStack(ModItems.GLASS_SHARD));
}
