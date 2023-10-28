package net.hinno.naturals.block;


import net.hinno.naturals.custom.tintBlock;
import net.hinno.naturals.custom.tintCarpet;
import net.hinno.naturals.custom.tintSlab;
import net.hinno.naturals.custom.tintStair;
import net.hinno.naturals.item.modCreativeTab;
import net.hinno.naturals.item.modItems;
import net.hinno.naturals.naturals;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class modBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create (ForgeRegistries.BLOCKS, naturals.MODID);


    public static final RegistryObject<Block> DIRT_PATH_FULL_BLOCK = registerBlock ("dirt_path_full_block",
            ()->new Block (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));

    public static final RegistryObject<Block> PODZOL_FULL_BLOCK = registerBlock ("podzol_full_block",
            ()->new Block (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> MYCELIUM_FULL_BLOCK = registerBlock ("mycelium_full_block",
            ()->new Block (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));

    public static final RegistryObject<Block> MYCELIUM_CARPET = registerBlock ("mycelium_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.MOSS_CARPET)));
    public static final RegistryObject<Block> PODZOL_CARPET = registerBlock ("podzol_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.MOSS_CARPET)));
    public static final RegistryObject<Block> DIRT_PATH_CARPET = registerBlock ("dirt_path_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.MOSS_CARPET)));
    public static final RegistryObject<Block> DIRT_CARPET = registerBlock ("dirt_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.MOSS_CARPET)));
    public static final RegistryObject<Block> NETHER_WART_CARPET = registerBlock ("nether_wart_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.MOSS_CARPET)));
    public static final RegistryObject<Block> WARPED_WART_CARPET = registerBlock ("warped_wart_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.MOSS_CARPET)));
    public static final RegistryObject<Block> COARSE_DIRT_CARPET = registerBlock ("coarse_dirt_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> ROOTED_DIRT_CARPET = registerBlock ("rooted_dirt_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.ROOTED_DIRT)));
    public static final RegistryObject<Block> CLAY_CARPET = registerBlock ("clay_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> GRAVEL_CARPET = registerBlock ("gravel_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.GRAVEL)));
    public static final RegistryObject<Block> MUD_CARPET = registerBlock ("mud_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.MUD)));
    public static final RegistryObject<Block> PACKED_MUD_CARPET = registerBlock ("packed_mud_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.PACKED_MUD)));
    public static final RegistryObject<Block> SOUL_SAND_CARPET = registerBlock ("soul_sand_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.SOUL_SAND)));
    public static final RegistryObject<Block> SOUL_SOIL_CARPET = registerBlock ("soul_soil_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.SOUL_SOIL)));
    public static final RegistryObject<Block> SAND_CARPET = registerBlock ("sand_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.SAND)));
    public static final RegistryObject<Block> RED_SAND_CARPET = registerBlock ("red_sand_carpet",
            ()->new CarpetBlock (BlockBehaviour.Properties.copy (Blocks.BLACK_CARPET).sound (SoundType.SAND)));
    //slab blocks:
    public static final RegistryObject<Block> DIRT_PATH_SLAB = registerBlock ("dirt_path_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> DIRT_SLAB = registerBlock ("dirt_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> ROOTED_DIRT_SLAB = registerBlock ("rooted_dirt_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.ROOTED_DIRT)));
    public static final RegistryObject<Block> PACKED_MUD_SLAB = registerBlock ("packed_mud_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.PACKED_MUD)));
    public static final RegistryObject<Block> COARSE_DIRT_SLAB = registerBlock ("coarse_dirt_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> MOSS_SLAB = registerBlock ("moss_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.MOSS)));
    public static final RegistryObject<Block> SAND_SLAB = registerBlock ("sand_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.SAND)));
    public static final RegistryObject<Block> GRAVEL_SLAB = registerBlock ("gravel_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRAVEL)));
    public static final RegistryObject<Block> CLAY_SLAB = registerBlock ("clay_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> MYCELIUM_SLAB = registerBlock ("mycelium_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> MUD_SLAB = registerBlock ("mud_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.MUD)));
    public static final RegistryObject<Block> RED_SAND_SLAB = registerBlock ("red_sand_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.SAND)));
    public static final RegistryObject<Block> NETHER_WART_SLAB = registerBlock ("nether_wart_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.WART_BLOCK)));
    public static final RegistryObject<Block> WARPED_WART_SLAB = registerBlock ("warped_wart_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.WART_BLOCK)));
    public static final RegistryObject<Block> PODZOL_SLAB = registerBlock ("podzol_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> SOUL_SAND_SLAB = registerBlock ("soul_sand_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.SOUL_SAND)));
    public static final RegistryObject<Block> SOUL_SOIL_SLAB = registerBlock ("soul_soil_slab",
            ()->new SlabBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.SOUL_SOIL)));
    //Stairs Blocks:
    public static final RegistryObject<Block> DIRT_PATH_STAIRS = registerBlock ("dirt_path_stairs",
            ()->new StairBlock (()->modBlocks.DIRT_PATH_FULL_BLOCK.get ().defaultBlockState (), BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> DIRT_STAIRS = registerBlock ("dirt_stairs",
            ()->new StairBlock (Blocks.DIRT::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> ROOTED_DIRT_STAIRS = registerBlock ("rooted_dirt_stairs",
            ()->new StairBlock (Blocks.ROOTED_DIRT::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.ROOTED_DIRT)));
    public static final RegistryObject<Block> PACKED_MUD_STAIRS = registerBlock ("packed_mud_stairs",
            ()->new StairBlock (Blocks.PACKED_MUD::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.PACKED_MUD)));
    public static final RegistryObject<Block> COARSE_DIRT_STAIRS = registerBlock ("coarse_dirt_stairs",
            ()->new StairBlock (Blocks.COARSE_DIRT::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> MOSS_STAIRS = registerBlock ("moss_stairs",
            ()->new StairBlock (Blocks.MOSS_BLOCK::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.MOSS)));
    public static final RegistryObject<Block> SAND_STAIRS = registerBlock ("sand_stairs",
            ()->new StairBlock (Blocks.SAND::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.SAND)));
    public static final RegistryObject<Block> GRAVEL_STAIRS = registerBlock ("gravel_stairs",
            ()->new StairBlock (Blocks.GRAVEL::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> CLAY_STAIRS = registerBlock ("clay_stairs",
            ()->new StairBlock (Blocks.CLAY::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> MYCELIUM_STAIRS = registerBlock ("mycelium_stairs",
            ()->new StairBlock (()->modBlocks.MYCELIUM_FULL_BLOCK.get ().defaultBlockState (), BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> MUD_STAIRS = registerBlock ("mud_stairs",
            ()->new StairBlock (Blocks.MUD::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.MUD)));
    public static final RegistryObject<Block> RED_SAND_STAIRS = registerBlock ("red_sand_stairs",
            ()->new StairBlock (Blocks.RED_SAND::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.SAND)));
    public static final RegistryObject<Block> NETHER_WART_STAIRS = registerBlock ("nether_wart_stairs",
            ()->new StairBlock (Blocks.NETHER_WART_BLOCK::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.WART_BLOCK)));
    public static final RegistryObject<Block> WARPED_WART_STAIRS = registerBlock ("warped_wart_stairs",
            ()->new StairBlock (Blocks.WARPED_WART_BLOCK::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.WART_BLOCK)));
    public static final RegistryObject<Block> PODZOL_STAIRS = registerBlock ("podzol_stairs",
            ()->new StairBlock (()->modBlocks.PODZOL_FULL_BLOCK.get ().defaultBlockState (), BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> SOUL_SAND_STAIRS = registerBlock ("soul_sand_stairs",
            ()->new StairBlock (Blocks.SOUL_SAND::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.SOUL_SAND)));
    public static final RegistryObject<Block> SOUL_SOIL_STAIRS = registerBlock ("soul_soil_stairs",
            ()->new StairBlock (Blocks.SOUL_SOIL::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).sound (SoundType.SOUL_SOIL)));

    //grass blocks

    public static final RegistryObject<Block> GRASS_FULL_BLOCK = registerBlock ("grass_full_block",
            ()->new tintBlock (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).strength (0.6F).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> GRASS_STAIRS = registerBlock ("grass_stairs",
            ()->new tintStair (()->GRASS_FULL_BLOCK.get ().defaultBlockState (), BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).strength (0.6F).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> GRASS_SLAB = registerBlock ("grass_slab",
            ()->new tintSlab (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).strength (0.6F).sound (SoundType.GRASS)));
    public static final RegistryObject<Block> GRASS_CARPET = registerBlock ("grass_carpet",
            ()->new tintCarpet (BlockBehaviour.Properties.copy (Blocks.GRASS_BLOCK).strength (0.6F).sound (SoundType.GRASS).dynamicShape ()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register (name, block);
        registerBlockItem (name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return modItems.ITEMS.register (name, ()->new BlockItem (block.get (), new Item.Properties ().tab (modCreativeTab.MOD_TAB)));
    }



    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientSideHandler {
        @SubscribeEvent
        public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
            tintBlock.blockColorLoad (event);
            tintCarpet.blockColorLoad (event);
            tintSlab.blockColorLoad (event);
            tintStair.blockColorLoad (event);
        }

        @SubscribeEvent
        public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
            tintBlock.itemColorLoad (event);
            tintCarpet.itemColorLoad (event);
            tintSlab.itemColorLoad (event);
            tintStair.itemColorLoad (event);
        }
    }
}
