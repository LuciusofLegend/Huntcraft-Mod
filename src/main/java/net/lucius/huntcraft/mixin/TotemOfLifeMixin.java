package net.lucius.huntcraft.mixin;


import net.lucius.huntcraft.item.HuntcraftItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.PlayerManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import org.apache.logging.log4j.core.jmx.Server;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
import java.util.function.BooleanSupplier;

import static com.google.common.collect.Iterables.size;

@Mixin(MinecraftServer.class)
public class TotemOfLifeMixin {

    MinecraftServer server = (MinecraftServer) (Object) this;
    List<ServerPlayerEntity> players = server.getPlayerManager().getPlayerList();

    @Inject(method = "tick", at = @At("TAIL"))
    public void tick(BooleanSupplier shouldKeepTicking, CallbackInfo ci) {
        for(int i = 0; i < size(players); i++) {
            ServerPlayerEntity player = players.get(i);
            if(!hasTotem(player)) {
                if(player.getMaxHealth() == 20) {
                    return;
                }
                // set max health to 20
            }
            if(player.getMaxHealth() != 20) {
                return;
            }
            // set max health to 26
        }
    };

    private static boolean hasTotem(ServerPlayerEntity player) {
        Inventory inv = player.getInventory();

        ItemStack totemstack = null;
        for(int i = 0; i < 50; i++) {
            ItemStack stack = inv.getStack(i);
            if (stack.getItem().equals(HuntcraftItems.TOTEM_OF_LIFE)) {
                totemstack = stack;
                break;
            }
        }

        if (totemstack == null) {
            return true;
        }
        return false;
    }
}
