package net.lucius.huntcraft.item;

import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lucius.huntcraft.Huntcraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // Add elemental runes
    public static final SimplePolymerItem AIR_RUNE = registerItem("air_rune",
            new SimplePolymerItem(new FabricItemSettings(), Items.DIAMOND));
    public static final SimplePolymerItem EARTH_RUNE = registerItem("earth_rune",
            new SimplePolymerItem(new FabricItemSettings(), Items.DIAMOND));
    public static final SimplePolymerItem FIRE_RUNE = registerItem("fire_rune",
            new SimplePolymerItem(new FabricItemSettings(), Items.DIAMOND));
    public static final SimplePolymerItem WATER_RUNE = registerItem("water_rune",
            new SimplePolymerItem(new FabricItemSettings(), Items.DIAMOND));

    private static SimplePolymerItem registerItem(String name, SimplePolymerItem item) {
      return Registry.register(Registries.ITEM, new Identifier(Huntcraft.MODID, name), item);
    }

    public static void addItemsToGroup() {
        addToItemGroup(ItemGroups.COMBAT, AIR_RUNE);
        addToItemGroup(ItemGroups.COMBAT, EARTH_RUNE);
        addToItemGroup(ItemGroups.COMBAT, FIRE_RUNE);
        addToItemGroup(ItemGroups.COMBAT, WATER_RUNE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    private static void registerModItems() {
        Huntcraft.LOGGER.info("Registering Items for " + Huntcraft.MODID);
    }
}
