package io.github.thebusybiscuit.slimefun4.testing.mocks;


import io.github.thebusybiscuit.slimefun4.core.attributes.DamageableItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class DamageableMock extends SlimefunItem implements DamageableItem {
    boolean itemDamageable;

    public DamageableMock(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, boolean damageable) {
        super(category, item, recipeType, recipe);
        itemDamageable = damageable;
    }

    @Override
    public boolean isDamageable() {
        return itemDamageable;
    }

    @Override
    public void damageItem(@Nonnull Player p, @Nullable ItemStack item) {
        DamageableItem.super.damageItem(p, item);
    }
}
