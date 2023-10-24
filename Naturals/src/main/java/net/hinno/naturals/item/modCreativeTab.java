package net.hinno.naturals.item;
import net.hinno.naturals.block.modBlocks;
import net.hinno.naturals.naturals;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;



public class modCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create (Registries.CREATIVE_MODE_TAB, naturals.MODID);


    public static final RegistryObject<CreativeModeTab> NAT_TAB = CREATIVE_MODE_TAB.register ("tutorial_tab",
            () -> CreativeModeTab.builder ().icon (() -> new ItemStack (modBlocks.MOSS_STAIRS.get ()))
                    .title (Component.translatable ("creativetab.nat_tab"))

                    .displayItems ((pParameters, pOutput) -> {
                        pOutput.accept (modBlocks.DIRT_PATH_FULL_BLOCK.get ());
                        pOutput.accept (Blocks.DIRT);
                        pOutput.accept (Blocks.ROOTED_DIRT);
                        pOutput.accept (Blocks.PACKED_MUD);
                        pOutput.accept (Blocks.COARSE_DIRT);
                        pOutput.accept (modBlocks.GRASS_FULL_BLOCK.get ());
                        pOutput.accept (Blocks.MOSS_BLOCK);
                        pOutput.accept (Blocks.SAND);
                        pOutput.accept (Blocks.GRAVEL);


                        pOutput.accept (modBlocks.DIRT_PATH_CARPET.get ());
                        pOutput.accept (modBlocks.DIRT_CARPET.get ());
                        pOutput.accept (modBlocks.ROOTED_DIRT_CARPET.get ());
                        pOutput.accept (modBlocks.PACKED_MUD_CARPET.get ());
                        pOutput.accept (modBlocks.COARSE_DIRT_CARPET.get ());
                        pOutput.accept (modBlocks.GRASS_CARPET.get ());
                        pOutput.accept (Blocks.MOSS_CARPET);
                        pOutput.accept (modBlocks.SAND_CARPET.get ());
                        pOutput.accept (modBlocks.GRAVEL_CARPET.get ());

                        pOutput.accept (modBlocks.DIRT_PATH_SLAB.get ());
                        pOutput.accept (modBlocks.DIRT_SLAB.get ());
                        pOutput.accept (modBlocks.ROOTED_DIRT_SLAB.get ());
                        pOutput.accept (modBlocks.PACKED_MUD_SLAB.get ());
                        pOutput.accept (modBlocks.COARSE_DIRT_SLAB.get ());
                        pOutput.accept (modBlocks.GRASS_SLAB.get ());
                        pOutput.accept (modBlocks.MOSS_SLAB.get ());
                        pOutput.accept (modBlocks.SAND_SLAB.get ());
                        pOutput.accept (modBlocks.GRAVEL_SLAB.get ());

                        pOutput.accept (modBlocks.DIRT_PATH_STAIRS.get ());
                        pOutput.accept (modBlocks.DIRT_STAIRS.get ());
                        pOutput.accept (modBlocks.ROOTED_DIRT_STAIRS.get ());
                        pOutput.accept (modBlocks.PACKED_MUD_STAIRS.get ());
                        pOutput.accept (modBlocks.COARSE_DIRT_STAIRS.get ());
                        pOutput.accept (modBlocks.GRASS_STAIRS.get ());
                        pOutput.accept (modBlocks.MOSS_STAIRS.get ());
                        pOutput.accept (modBlocks.SAND_STAIRS.get ());
                        pOutput.accept (modBlocks.GRAVEL_STAIRS.get ());



                        pOutput.accept (Blocks.CLAY);
                        pOutput.accept (modBlocks.MYCELIUM_FULL_BLOCK.get ());
                        pOutput.accept (Blocks.MUD);
                        pOutput.accept (Blocks.RED_SAND);
                        pOutput.accept (Blocks.NETHER_WART_BLOCK);
                        pOutput.accept (Blocks.WARPED_WART_BLOCK);
                        pOutput.accept (modBlocks.PODZOL_FULL_BLOCK.get ());
                        pOutput.accept (Blocks.SOUL_SAND);
                        pOutput.accept (Blocks.SOUL_SOIL);

                        pOutput.accept (modBlocks.CLAY_CARPET.get ());
                        pOutput.accept (modBlocks.MYCELIUM_CARPET.get ());
                        pOutput.accept (modBlocks.MUD_CARPET.get ());
                        pOutput.accept (modBlocks.RED_SAND_CARPET.get ());
                        pOutput.accept (modBlocks.NETHER_WART_CARPET.get ());
                        pOutput.accept (modBlocks.WARPED_WART_CARPET.get ());
                        pOutput.accept (modBlocks.PODZOL_CARPET.get ());
                        pOutput.accept (modBlocks.SOUL_SAND_CARPET.get ());
                        pOutput.accept (modBlocks.SOUL_SOIL_CARPET.get ());

                        pOutput.accept (modBlocks.CLAY_SLAB.get ());
                        pOutput.accept (modBlocks.MYCELIUM_SLAB.get ());
                        pOutput.accept (modBlocks.MUD_SLAB.get ());
                        pOutput.accept (modBlocks.RED_SAND_SLAB.get ());
                        pOutput.accept (modBlocks.NETHER_WART_SLAB.get ());
                        pOutput.accept (modBlocks.WARPED_WART_SLAB.get ());
                        pOutput.accept (modBlocks.PODZOL_SLAB.get ());
                        pOutput.accept (modBlocks.SOUL_SAND_SLAB.get ());
                        pOutput.accept (modBlocks.SOUL_SOIL_SLAB.get ());


                        pOutput.accept (modBlocks.CLAY_STAIRS.get ());
                        pOutput.accept (modBlocks.MYCELIUM_STAIRS.get ());
                        pOutput.accept (modBlocks.MUD_STAIRS.get ());
                        pOutput.accept (modBlocks.RED_SAND_STAIRS.get ());
                        pOutput.accept (modBlocks.NETHER_WART_STAIRS.get ());
                        pOutput.accept (modBlocks.WARPED_WART_STAIRS.get ());
                        pOutput.accept (modBlocks.PODZOL_STAIRS.get ());
                        pOutput.accept (modBlocks.SOUL_SAND_STAIRS.get ());
                        pOutput.accept (modBlocks.SOUL_SOIL_STAIRS.get ());
                    })
                    .build ());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register (eventBus);

    }
}
