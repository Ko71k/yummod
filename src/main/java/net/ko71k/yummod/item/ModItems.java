package net.ko71k.yummod.item;

import net.ko71k.yummod.YumMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, YumMod.MOD_ID);

    //adding a wheat wrap item
    public static final RegistryObject<Item> WHEAT_WRAP = ITEMS.register("wheat_wrap",
            () -> new Item(new Item.Properties()));
    //adding a tomato item
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
