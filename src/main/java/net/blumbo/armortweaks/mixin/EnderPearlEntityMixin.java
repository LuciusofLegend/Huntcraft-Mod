package net.blumbo.armortweaks.mixin;

import net.blumbo.armortweaks.ArmorTweaks;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(EnderPearlEntity.class)
public class EnderPearlEntityMixin {

    @ModifyArg(method = "onCollision", index = 1, at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    private float setDamage(float amount) {
        if (ArmorTweaks.vanillaDamage()) return 5.0f;
        return 4.0f;
    }
}
