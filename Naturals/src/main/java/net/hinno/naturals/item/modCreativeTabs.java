package net.hinno.naturals.item;

import net.hinno.naturals.block.modBlocks;
import net.hinno.naturals.naturals;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = naturals.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class modCreativeTabs {
    public static CreativeModeTab NAT_TAB;


    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        NAT_TAB = event.registerCreativeModeTab (new ResourceLocation (naturals.MODID, "creative_tab"),
            builder -> builder
                .icon (() -> new ItemStack (modBlocks.MOSS_STAIRS.get ()))
                .title (Component.translatable ("creativemodetab.nat_tab"))
                    .build ()
        );
    }
}
