package net.monstertrex.vanillaexpanded;

import net.fabricmc.api.ModInitializer;
import net.monstertrex.vanillaexpanded.block.ModBlocks;
import net.monstertrex.vanillaexpanded.item.ModItems;
import net.monstertrex.vanillaexpanded.util.ModLootTableModifiers;
import net.monstertrex.vanillaexpanded.util.ModRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VanillaExpanded implements ModInitializer {
	public static final String MOD_ID = "vanillaexpanded";
	public static final Logger LOGGER = LogManager.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

		ModLootTableModifiers.modifyLootTables();
		ModRegistries.registerModStuffs();

	}
}
