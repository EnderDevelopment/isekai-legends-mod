package com.enderdevelopment.isekai.weapons;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item.Properties;

public class AnimeWeapons {
    public static final Item KATANA = new SwordItem(Tier.IRON, 3, -2.4F, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    public static final Item GREAT_SWORD = new SwordItem(Tier.DIAMOND, 5, -3.0F, new Properties().tab(CreativeModeTab.TAB_COMBAT));

    public static void register(IEventBus eventBus) {
        eventBus.register(KATANA);
        eventBus.register(GREAT_SWORD);
    }
}