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
    public static final RegistryObject<Item> TOMATO_SLICE = ITEMS.register("tomato_slice",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHEESE_SLICE = ITEMS.register("cheese_slice",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUN = ITEMS.register("bun",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUN_SLICE = ITEMS.register("bun_slice",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CUCUMBER_SLICE = ITEMS.register("cucumber_slice",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LETTUCE_LEAF = ITEMS.register("lettuce_leaf",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CERAMIC_BOWL = ITEMS.register("ceramic_bowl",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CERAMIC_PLATE = ITEMS.register("ceramic_plate",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
