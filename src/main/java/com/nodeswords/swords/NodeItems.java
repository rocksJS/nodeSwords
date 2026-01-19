package com.nodeswords.swords;

import com.nodeswords.NodeSwords;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class NodeItems {

    // Стеклянный меч
    public static final Item GLASS_SWORD = register(
            new SwordItem(
                    Tiers.NETHERITE, // материал меча
                    45, // дополнительный урон
                    -2.4f, // скорость атаки
                    new Item.Properties().stacksTo(1) // свойства предмета
            ),
            "glass_sword");

    // Регистрация предмета
    private static Item register(Item item, String id) {
        ResourceLocation itemID = ResourceLocation.tryParse(NodeSwords.MOD_ID + ":" + id);
        if (itemID == null) {
            throw new IllegalArgumentException("Invalid item ID: " + id);
        }
        return Registry.register(BuiltInRegistries.ITEM, itemID, item);
    }

    // Инициализация
    public static void init() {
        System.out.println("NodeItems initialized!");
    }
}
