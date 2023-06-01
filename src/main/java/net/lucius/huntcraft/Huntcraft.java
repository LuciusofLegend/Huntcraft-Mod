package net.lucius.huntcraft;

import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.lucius.huntcraft.item.HuntcraftItems;

public class Huntcraft implements ModInitializer {
	public static final String MODID = "huntcraft";

	@Override
	public void onInitialize() {
		PolymerResourcePackUtils.addModAssets("huntcraft");
		HuntcraftItems.registerModItems();
		registerCommands();
	}

	private static void registerCommands() {

	}
}