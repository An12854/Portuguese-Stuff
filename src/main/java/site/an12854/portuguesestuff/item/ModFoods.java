package site.an12854.portuguesestuff.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    // Should the food name be in portuguese or english? I scream, for I do not know.
    public static final FoodProperties LUPIN_BEAN = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.1F).effect(new MobEffectInstance(MobEffects.LUCK, 200, 0), 0.1F).build();
    public static final FoodProperties RAW_LUPIN_BEAN = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).effect(new MobEffectInstance(MobEffects.POISON, 200, 0), 0.9F).effect(new MobEffectInstance(MobEffects.HUNGER, 300, 0), 1.0F).effect(new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 1.0F).build();
    // Note: the method for cooking lupin beans is way too simplified i know, but i do not have the patience nor the expertise for now to implement a new recipe method
    // Note 2: nor it would be fun to cook, this is a simple mod not gregtech, also the reason the comments are here are because JSON files don't support comments
}
