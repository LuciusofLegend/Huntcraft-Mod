package net.lucius.huntcraft.mixin;


import net.lucius.huntcraft.item.HuntcraftItems;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.PlayerManager;
import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
import java.util.UUID;
import java.util.function.BooleanSupplier;

import static com.google.common.collect.Iterables.size;

@Mixin(MinecraftServer.class)
public class TotemOfLifeMixin {

    @Shadow
    private PlayerManager playerManager;

    private static final UUID TOTEM_HEALTH_BOOST_ID = UUID.fromString("033fe710-eff0-11ed-a05b-0242ac120003");

    @Inject(method = "tick", at = @At("TAIL"))
    public void tick(BooleanSupplier shouldKeepTicking, CallbackInfo ci) {
        List<ServerPlayerEntity> players = playerManager.getPlayerList();

        for(int i = 0; i < size(players); i++) {
            ServerPlayerEntity player = players.get(i);
            checkTotemEffect(player);
        }
    }

    public boolean hasTotem(ServerPlayerEntity player) {
        Inventory inv = player.getInventory();

        for(int i = 0; i < 50; i++) {
            ItemStack stack = inv.getStack(i);
            if (stack.getItem().equals(HuntcraftItems.TOTEM_OF_LIFE)) {
                return true;
            }
        }
        return false;
    }

    public void checkTotemEffect(ServerPlayerEntity player) {
        boolean hasTotem = hasTotem(player);
        EntityAttributeInstance maxHealthAttribute = player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);
        EntityAttributeModifier modifier = new EntityAttributeModifier(TOTEM_HEALTH_BOOST_ID, "Totem health boost", 6, EntityAttributeModifier.Operation.ADDITION);

        if(hasTotem) {
            assert maxHealthAttribute != null;
            if (!maxHealthAttribute.hasModifier(modifier)) {
                maxHealthAttribute.addPersistentModifier(modifier);
                return;
            }
        }

        if(!hasTotem) {
            assert maxHealthAttribute != null;
            if (maxHealthAttribute.hasModifier(modifier)) {
                maxHealthAttribute.removeModifier(modifier);

                if(player.getHealth() > player.getMaxHealth()) {
                    player.setHealth(player.getMaxHealth());
                }
            }
        }
    }
}