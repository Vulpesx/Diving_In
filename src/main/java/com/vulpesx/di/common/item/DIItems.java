package com.vulpesx.di.common.item;

import com.vulpesx.di.Mod;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DIItems {
    public static final Item VILLAGER_NOSE = new Item(
            new Item.Settings()
                    .food(
                            new FoodComponent.Builder()
                                    .saturationModifier(9)
                                    .hunger(9)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 240), 0.5f)
                                    .build()).group(ItemGroup.FOOD));

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(Mod.MODID, "villager_nose"), VILLAGER_NOSE);
    }
}
