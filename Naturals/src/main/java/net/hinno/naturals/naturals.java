package net.hinno.naturals;

import com.mojang.logging.LogUtils;
import net.hinno.naturals.block.modBlocks;
import net.hinno.naturals.item.modCreativeTabs;
import net.hinno.naturals.item.modItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(naturals.MODID)
public class naturals
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "naturals";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public naturals()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modItems.register (modEventBus);
        modBlocks.BLOCKS.register (modEventBus);


        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab () == modCreativeTabs.NAT_TAB){
            event.accept (modBlocks.DIRT_PATH_FULL_BLOCK.get ());
            event.accept (Blocks.DIRT);
            event.accept (Blocks.ROOTED_DIRT);
            event.accept (Blocks.PACKED_MUD);
            event.accept (Blocks.COARSE_DIRT);
            event.accept (modBlocks.GRASS_FULL_BLOCK.get ());
            event.accept (Blocks.MOSS_BLOCK);
            event.accept (Blocks.SAND);
            event.accept (Blocks.GRAVEL);
            event.accept (modBlocks.DIRT_PATH_CARPET.get ());
            event.accept (modBlocks.DIRT_CARPET.get ());
            event.accept (modBlocks.ROOTED_DIRT_CARPET.get ());
            event.accept (modBlocks.PACKED_MUD_CARPET.get ());
            event.accept (modBlocks.COARSE_DIRT_CARPET.get ());
            event.accept (modBlocks.GRASS_CARPET.get ());
            event.accept (Blocks.MOSS_CARPET);
            event.accept (modBlocks.SAND_CARPET.get ());
            event.accept (modBlocks.GRAVEL_CARPET.get ());
            event.accept (modBlocks.DIRT_PATH_SLAB.get ());
            event.accept (modBlocks.DIRT_SLAB.get ());
            event.accept (modBlocks.ROOTED_DIRT_SLAB.get ());
            event.accept (modBlocks.PACKED_MUD_SLAB.get ());
            event.accept (modBlocks.COARSE_DIRT_SLAB.get ());
            event.accept (modBlocks.GRASS_SLAB.get ());
            event.accept (modBlocks.MOSS_SLAB.get ());
            event.accept (modBlocks.SAND_SLAB.get ());
            event.accept (modBlocks.GRAVEL_SLAB.get ());
            event.accept (modBlocks.DIRT_PATH_STAIRS.get ());
            event.accept (modBlocks.DIRT_STAIRS.get ());
            event.accept (modBlocks.ROOTED_DIRT_STAIRS.get ());
            event.accept (modBlocks.PACKED_MUD_STAIRS.get ());
            event.accept (modBlocks.COARSE_DIRT_STAIRS.get ());
            event.accept (modBlocks.GRASS_STAIRS.get ());
            event.accept (modBlocks.MOSS_STAIRS.get ());
            event.accept (modBlocks.SAND_STAIRS.get ());
            event.accept (modBlocks.GRAVEL_STAIRS.get ());
            event.accept (Blocks.CLAY);
            event.accept (modBlocks.MYCELIUM_FULL_BLOCK.get ());
            event.accept (Blocks.MUD);
            event.accept (Blocks.RED_SAND);
            event.accept (Blocks.NETHER_WART_BLOCK);
            event.accept (Blocks.WARPED_WART_BLOCK);
            event.accept (modBlocks.PODZOL_FULL_BLOCK.get ());
            event.accept (Blocks.SOUL_SAND);
            event.accept (Blocks.SOUL_SOIL);
            event.accept (modBlocks.CLAY_CARPET.get ());
            event.accept (modBlocks.MYCELIUM_CARPET.get ());
            event.accept (modBlocks.MUD_CARPET.get ());
            event.accept (modBlocks.RED_SAND_CARPET.get ());
            event.accept (modBlocks.NETHER_WART_CARPET.get ());
            event.accept (modBlocks.WARPED_WART_CARPET.get ());
            event.accept (modBlocks.PODZOL_CARPET.get ());
            event.accept (modBlocks.SOUL_SAND_CARPET.get ());
            event.accept (modBlocks.SOUL_SOIL_CARPET.get ());
            event.accept (modBlocks.CLAY_SLAB.get ());
            event.accept (modBlocks.MYCELIUM_SLAB.get ());
            event.accept (modBlocks.MUD_SLAB.get ());
            event.accept (modBlocks.RED_SAND_SLAB.get ());
            event.accept (modBlocks.NETHER_WART_SLAB.get ());
            event.accept (modBlocks.WARPED_WART_SLAB.get ());
            event.accept (modBlocks.PODZOL_SLAB.get ());
            event.accept (modBlocks.SOUL_SAND_SLAB.get ());
            event.accept (modBlocks.SOUL_SOIL_SLAB.get ());
            event.accept (modBlocks.CLAY_STAIRS.get ());
            event.accept (modBlocks.MYCELIUM_STAIRS.get ());
            event.accept (modBlocks.MUD_STAIRS.get ());
            event.accept (modBlocks.RED_SAND_STAIRS.get ());
            event.accept (modBlocks.NETHER_WART_STAIRS.get ());
            event.accept (modBlocks.WARPED_WART_STAIRS.get ());
            event.accept (modBlocks.PODZOL_STAIRS.get ());
            event.accept (modBlocks.SOUL_SAND_STAIRS.get ());
            event.accept (modBlocks.SOUL_SOIL_STAIRS.get ());
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
         @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
