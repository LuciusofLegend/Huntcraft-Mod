package net.lucius.huntcraft.item;

import eu.pb4.polymer.core.api.item.PolymerItem;
import eu.pb4.polymer.resourcepack.api.PolymerModelData;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.lucius.huntcraft.Huntcraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class HuntcraftItem extends Item implements PolymerItem {

    PolymerModelData model;

    public HuntcraftItem(Settings settings, Item polymerItem, String path) {
        super(settings);
        this.model = PolymerResourcePackUtils.requestModel(polymerItem, new Identifier(Huntcraft.MODID, path));
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return this.model.item();
    }

    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return model.value();
    }
}
