package net.ko71k.yummod.item;

import net.ko71k.yummod.YumMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = YumMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab MYFOOD;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MYFOOD = event.registerCreativeModeTab(new ResourceLocation(YumMod.MOD_ID, "my_food_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.TOMATO.get()))
                        .title(Component.translatable("creativemodetab.my_food_tab")));
    }
}
