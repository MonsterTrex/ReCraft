package net.monstertrex.recraft;

import net.fabricmc.api.ModInitializer;
import net.monstertrex.recraft.block.ModBlocks;
import net.monstertrex.recraft.item.ModItems;
import net.monstertrex.recraft.util.ModLootTableModifiers;
import net.monstertrex.recraft.util.ModRegistries;
import net.monstertrex.recraft.world.feature.ModConfiguredFeatures;
import net.monstertrex.recraft.world.gen.ModWorldGen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Recraft implements ModInitializer {
	public static final String MOD_ID = "recraft";
	public static final Logger LOGGER = LogManager.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

		ModLootTableModifiers.modifyLootTables();
		ModRegistries.registerModStuffs();

		ModWorldGen.generateModWorldGen();

	}
}
