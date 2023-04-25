package net.lucius.huntcraft.mixin;

import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BrewingRecipeRegistry.class)
public class PotionWhitelistMixin {
    @Overwrite
    private static void registerDefaults() {
        BrewingRecipeRegistry.registerPotionType(Items.POTION);
        BrewingRecipeRegistry.registerPotionType(Items.SPLASH_POTION);
        BrewingRecipeRegistry.registerPotionType(Items.LINGERING_POTION);
        BrewingRecipeRegistry.registerItemRecipe(Items.POTION, Items.GUNPOWDER, Items.SPLASH_POTION);
        BrewingRecipeRegistry.registerItemRecipe(Items.SPLASH_POTION, Items.DRAGON_BREATH, Items.LINGERING_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.GLISTERING_MELON_SLICE, Potions.MUNDANE);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.GHAST_TEAR, Potions.MUNDANE);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.RABBIT_FOOT, Potions.MUNDANE);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.BLAZE_POWDER, Potions.MUNDANE);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.SPIDER_EYE, Potions.MUNDANE);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.SUGAR, Potions.MUNDANE);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.MAGMA_CREAM, Potions.MUNDANE);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.GLOWSTONE_DUST, Potions.THICK);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.REDSTONE, Potions.MUNDANE);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.NETHER_WART, Potions.AWKWARD);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.GOLDEN_CARROT, Potions.NIGHT_VISION);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.NIGHT_VISION, Items.REDSTONE, Potions.LONG_NIGHT_VISION);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.NIGHT_VISION, Items.FERMENTED_SPIDER_EYE, Potions.INVISIBILITY);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.LONG_NIGHT_VISION, Items.FERMENTED_SPIDER_EYE, Potions.LONG_INVISIBILITY);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.INVISIBILITY, Items.REDSTONE, Potions.LONG_INVISIBILITY);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.MAGMA_CREAM, Potions.FIRE_RESISTANCE);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.FIRE_RESISTANCE, Items.REDSTONE, Potions.LONG_FIRE_RESISTANCE);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.RABBIT_FOOT, Potions.LEAPING);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.LEAPING, Items.REDSTONE, Potions.LONG_LEAPING);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.LEAPING, Items.GLOWSTONE_DUST, Potions.STRONG_LEAPING);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.LEAPING, Items.FERMENTED_SPIDER_EYE, Potions.SLOWNESS);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.LONG_LEAPING, Items.FERMENTED_SPIDER_EYE, Potions.LONG_SLOWNESS);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.SLOWNESS, Items.REDSTONE, Potions.LONG_SLOWNESS);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.SLOWNESS, Items.GLOWSTONE_DUST, Potions.STRONG_SLOWNESS);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.TURTLE_HELMET, Potions.TURTLE_MASTER);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.TURTLE_MASTER, Items.REDSTONE, Potions.LONG_TURTLE_MASTER);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.TURTLE_MASTER, Items.GLOWSTONE_DUST, Potions.STRONG_TURTLE_MASTER);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.SWIFTNESS, Items.FERMENTED_SPIDER_EYE, Potions.SLOWNESS);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.LONG_SWIFTNESS, Items.FERMENTED_SPIDER_EYE, Potions.LONG_SLOWNESS);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.SUGAR, Potions.SWIFTNESS);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.SWIFTNESS, Items.REDSTONE, Potions.LONG_SWIFTNESS);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.SWIFTNESS, Items.GLOWSTONE_DUST, Potions.STRONG_SWIFTNESS);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.PUFFERFISH, Potions.WATER_BREATHING);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER_BREATHING, Items.REDSTONE, Potions.LONG_WATER_BREATHING);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.SPIDER_EYE, Potions.POISON);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.POISON, Items.REDSTONE, Potions.LONG_POISON);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.POISON, Items.GLOWSTONE_DUST, Potions.STRONG_POISON);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.GHAST_TEAR, Potions.REGENERATION);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.REGENERATION, Items.REDSTONE, Potions.LONG_REGENERATION);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.REGENERATION, Items.GLOWSTONE_DUST, Potions.STRONG_REGENERATION);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Items.FERMENTED_SPIDER_EYE, Potions.WEAKNESS);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WEAKNESS, Items.REDSTONE, Potions.LONG_WEAKNESS);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.PHANTOM_MEMBRANE, Potions.SLOW_FALLING);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.SLOW_FALLING, Items.REDSTONE, Potions.LONG_SLOW_FALLING);
    }
}