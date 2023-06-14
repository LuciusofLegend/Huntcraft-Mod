package net.lucius.huntcraft;

import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import net.lucius.huntcraft.item.HuntcraftItems;

public class Huntcraft implements ModInitializer {
	public static final String MODID = "huntcraft";

	@Override
	public void onInitialize() {
		PolymerResourcePackUtils.addModAssets("huntcraft");
		HuntcraftItems.registerModItems();
	}
}