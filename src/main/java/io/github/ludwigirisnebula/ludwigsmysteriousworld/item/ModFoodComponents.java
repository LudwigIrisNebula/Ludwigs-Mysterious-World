package io.github.ludwigirisnebula.ludwigsmysteriousworld.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFoodComponents {
    public static final FoodComponent GREEN_APPLE = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.3F)
            .build();

    public static final FoodComponent IDUNNS_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.2F)
            .alwaysEdible()
            .build();
    public static final ConsumableComponent IDUNNS_APPLE_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(
                    StatusEffects.REGENERATION, 200, 0), 1.0f))
            .build();

    public static final FoodComponent ENCHANTED_IDUNNS_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.2F)
            .alwaysEdible()
            .build();
    public static final ConsumableComponent ENCHANTED_IDUNNS_APPLE_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(
                    StatusEffects.REGENERATION, 200, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(
                    StatusEffects.ABSORPTION, 2400, 1), 1.0f))
            .build();
}
