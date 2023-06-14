package net.lucius.huntcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lucius.huntcraft.Huntcraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class HuntcraftItems {

    public static HuntcraftItem registerItem(String name, HuntcraftItem item) {
      return Registry.register(Registries.ITEM, new Identifier(Huntcraft.MODID, name), item);
    }

    public static final HuntcraftItem AIR_RUNE = registerItem("air_rune",
            new HuntcraftItem(new FabricItemSettings(), net.minecraft.item.Items.FEATHER, "item/air_rune"));
    public static final HuntcraftItem EARTH_RUNE = registerItem("earth_rune",
            new HuntcraftItem(new FabricItemSettings(), net.minecraft.item.Items.DIAMOND, "item/earth_rune"));
    public static final HuntcraftItem FIRE_RUNE = registerItem("fire_rune",
            new HuntcraftItem(new FabricItemSettings(), net.minecraft.item.Items.BLAZE_POWDER, "item/fire_rune"));
    public static final HuntcraftItem WATER_RUNE = registerItem("water_rune",
            new HuntcraftItem(new FabricItemSettings(), net.minecraft.item.Items.HEART_OF_THE_SEA, "item/water_rune"));

    public static final HuntcraftItem RUNIC_WAND = registerItem("runic_wand",
            new RunicWandItem(new FabricItemSettings(), net.minecraft.item.Items.BLAZE_ROD, "item/runic_wand"));
    public static final HuntcraftItem SOUL_BAG = registerItem("soul_bag",
            new HuntcraftItem(new FabricItemSettings(), net.minecraft.item.Items.NAUTILUS_SHELL, "item/soul_bag"));
    public static final HuntcraftItem TOTEM_OF_LIFE = registerItem("totem_of_life",
            new HuntcraftItem(new FabricItemSettings(), net.minecraft.item.Items.TOTEM_OF_UNDYING, "item/totem_of_life"));

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void addItemsToGroup() {
        addToItemGroup(ItemGroups.COMBAT, AIR_RUNE);
        addToItemGroup(ItemGroups.COMBAT, EARTH_RUNE);
        addToItemGroup(ItemGroups.COMBAT, FIRE_RUNE);
        addToItemGroup(ItemGroups.COMBAT, WATER_RUNE);
        addToItemGroup(ItemGroups.COMBAT, RUNIC_WAND);
        addToItemGroup(ItemGroups.FUNCTIONAL, SOUL_BAG);
        addToItemGroup(ItemGroups.COMBAT, TOTEM_OF_LIFE);
    }


    public static void registerModItems() {
        addItemsToGroup();
    }
}
