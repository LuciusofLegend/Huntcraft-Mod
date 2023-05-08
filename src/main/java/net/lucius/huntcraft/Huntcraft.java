package net.lucius.huntcraft;

import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.lucius.huntcraft.command.PrintServerPathCommand;
import net.lucius.huntcraft.item.HuntcraftItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Huntcraft implements ModInitializer {
	public static final String MODID = "huntcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger("huntcraft");

	@Override
	public void onInitialize() {
		PolymerResourcePackUtils.addModAssets("huntcraft");
		HuntcraftItems.registerModItems();
		registerCommands();
	}

	private static void registerCommands() {
		CommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess, environment) -> PrintServerPathCommand.register(dispatcher)));
	}
}