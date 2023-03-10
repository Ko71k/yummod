package net.ko71k.yummod;

import com.mojang.logging.LogUtils;
import net.ko71k.yummod.block.ModBlocks;
import net.ko71k.yummod.item.ModCreativeModeTabs;
import net.ko71k.yummod.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(YumMod.MOD_ID)
public class YumMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "yummod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public YumMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.WHEAT_WRAP);
            event.accept(ModItems.BUN);
            event.accept(ModItems.BUN_SLICE);
            event.accept(ModItems.TOMATO);
            event.accept(ModItems.TOMATO_SLICE);
            event.accept(ModItems.CHEESE);
            event.accept(ModItems.CHEESE_SLICE);
            event.accept(ModItems.CUCUMBER);
            event.accept(ModItems.CUCUMBER_SLICE);
            event.accept(ModItems.LETTUCE);
            event.accept(ModItems.LETTUCE_LEAF);
            event.accept(ModItems.CERAMIC_BOWL);
            event.accept(ModItems.CERAMIC_PLATE);
    }
        if(event.getTab() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(ModBlocks.KITCHEN_BLOCK);
            event.accept(ModBlocks.KITCHEN_BLOCK_2);
        }

        if (event.getTab() == ModCreativeModeTabs.MYFOOD) {
            event.accept(ModBlocks.KITCHEN_BLOCK_2);
            event.accept(ModBlocks.KITCHEN_BLOCK);
            event.accept(ModItems.WHEAT_WRAP);
            event.accept(ModItems.BUN);
            event.accept(ModItems.BUN_SLICE);
            event.accept(ModItems.TOMATO);
            event.accept(ModItems.TOMATO_SLICE);
            event.accept(ModItems.CHEESE);
            event.accept(ModItems.CHEESE_SLICE);
            event.accept(ModItems.CUCUMBER);
            event.accept(ModItems.CUCUMBER_SLICE);
            event.accept(ModItems.LETTUCE);
            event.accept(ModItems.LETTUCE_LEAF);
            event.accept(ModItems.CERAMIC_BOWL);
            event.accept(ModItems.CERAMIC_PLATE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
