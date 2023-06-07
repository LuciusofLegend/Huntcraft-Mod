package net.lucius.huntcraft.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.EndCrystalItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndCrystalItem.class)
public class EndCrystalItemMixin {

    @Inject(at = @At("TAIL"), method = "useOnBlock")
    public void addCrystalCooldown(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
        final PlayerEntity user = context.getPlayer();
        assert user != null;
        user.getItemCooldownManager().set(context.getStack().getItem(), 15); // Cooldown time should be config variable
    }
}

