package net.lucius.huntcraft;

import eu.pb4.polymer.resourcepack.api.PolymerModelData;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import net.lucius.huntcraft.item.ModItems;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils.addModAssets;

public class Huntcraft implements ModInitializer {
	public static final String MODID = "huntcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger("huntcraft");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		PolymerResourcePackUtils.addModAssets("huntcraft");
		ModItems.registerModItems();
	}
}