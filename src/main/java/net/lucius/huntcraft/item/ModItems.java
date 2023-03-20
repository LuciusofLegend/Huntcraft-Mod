package net.lucius.huntcraft.item;

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
    public static final HuntcraftItem AIR_RUNE = registerItem("air_rune",
            new HuntcraftItem(new FabricItemSettings(), Items.ECHO_SHARD, "item/air_rune"));
    public static final HuntcraftItem EARTH_RUNE = registerItem("earth_rune",
            new HuntcraftItem(new FabricItemSettings(), Items.ECHO_SHARD, "item/earth_rune"));
    public static final HuntcraftItem FIRE_RUNE = registerItem("fire_rune",
            new HuntcraftItem(new FabricItemSettings(), Items.ECHO_SHARD, "item/fire_rune"));
    public static final HuntcraftItem WATER_RUNE = registerItem("water_rune",
            new HuntcraftItem(new FabricItemSettings(), Items.ECHO_SHARD, "item/water_rune"));
    public static final HuntcraftItem RUNE_MANAGER = registerItem("rune_manager",
            new HuntcraftItem(new FabricItemSettings(), Items.HEART_OF_THE_SEA, "item/rune_manager"));

    public static HuntcraftItem registerItem(String name, HuntcraftItem item) {
      return Registry.register(Registries.ITEM, new Identifier(Huntcraft.MODID, name), item);
    }

    public static void addItemsToGroup() {
        addToItemGroup(ItemGroups.COMBAT, AIR_RUNE);
        addToItemGroup(ItemGroups.COMBAT, EARTH_RUNE);
        addToItemGroup(ItemGroups.COMBAT, FIRE_RUNE);
        addToItemGroup(ItemGroups.COMBAT, WATER_RUNE);
        addToItemGroup(ItemGroups.COMBAT, RUNE_MANAGER);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        Huntcraft.LOGGER.info("Registering Items for " + Huntcraft.MODID);
        addItemsToGroup();
    }
}
