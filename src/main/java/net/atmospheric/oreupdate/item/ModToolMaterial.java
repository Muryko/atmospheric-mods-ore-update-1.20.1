package net.atmospheric.oreupdate.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.MinecartItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    TIN(1, 200, 5.0F, 0.0F, 10, () -> {
        return Ingredient.ofItems(ModItems.TIN_INGOT);
    }),

    COPPER(1, 200, 5.0F, 0.0F, 10, () -> {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }),

    BRONZE(2, 250, 5.0F, 0.0F, 18, () -> {
        return Ingredient.ofItems(ModItems.TIN_INGOT);
    }),

    CUSTOM5(5, 250, 5.0F, 0.0F, 18, () -> {
        return Ingredient.ofItems(ModItems.TIN_INGOT);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed,
                            float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
