package com.enderdevelopment.isekai.fightingstyles;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;

public class EpicFightMode {
    public static void activateEpicFightMode(Player player) {
        ItemStack mainHandItem = player.getMainHandItem();
        if (mainHandItem.getItem() instanceof SwordItem) {
            // Apply epic fight mode effects
            player.getAbilities().mayfly = true;
            player.getAbilities().invulnerable = true;
            player.setHealth(player.getMaxHealth());
        }
    }

    public static void deactivateEpicFightMode(Player player) {
        player.getAbilities().mayfly = false;
        player.getAbilities().invulnerable = false;
    }
}