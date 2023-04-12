package net.lucius.huntcraft;

import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import net.lucius.huntcraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Huntcraft implements ModInitializer {
	public static final String MODID = "huntcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger("huntcraft");

	@Override
	public void onInitialize() {
		PolymerResourcePackUtils.addModAssets("huntcraft");
		Items.registerModItems();
	}
}