package net.lucius.huntcraft.item;

import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.lucius.huntcraft.Huntcraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class RunicWandItem extends HuntcraftItem {

    public RunicWandItem(Settings settings, Item polymerItem, String path) {
        super(settings, polymerItem, path);
        this.model = PolymerResourcePackUtils.requestModel(polymerItem, new Identifier(Huntcraft.MODID, path));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return TypedActionResult.pass(user.getStackInHand(hand));
    }
}
