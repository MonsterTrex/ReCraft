package net.monstertrex.vanillaexpanded;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VanillaExpanded implements ModInitializer {
	public static final String MOD_ID = "vanillaexpanded";
	public static final Logger LOGGER = LogManager.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}
