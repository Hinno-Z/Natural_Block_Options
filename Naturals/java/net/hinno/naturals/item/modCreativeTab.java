package net.hinno.naturals.item;

import com.google.common.collect.Ordering;
import net.hinno.naturals.block.modBlocks;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class modCreativeTab {
    public static final CreativeModeTab MOD_TAB = new CreativeModeTab (12, "mod_creative_tab") {

        @Override
        public @NotNull ItemStack makeIcon() {

            return new ItemStack (modBlocks.GRASS_STAIRS.get ());
        }

        @Override
        public void fillItemList(@NotNull NonNullList<ItemStack> list) {
            super.fillItemList (list);
            list.add (new ItemStack (Items.DIRT));
            list.add (new ItemStack (Items.ROOTED_DIRT));
            list.add (new ItemStack (Items.PACKED_MUD));
            list.add (new ItemStack (Items.COARSE_DIRT));
            list.add (new ItemStack (Items.MOSS_BLOCK));
            list.add (new ItemStack (Items.SAND));
            list.add (new ItemStack (Items.GRAVEL));
            list.add (new ItemStack (Items.CLAY));
            list.add (new ItemStack (Items.MUD));
            list.add (new ItemStack (Items.RED_SAND));
            list.add (new ItemStack (Items.NETHER_WART_BLOCK));
            list.add (new ItemStack (Items.WARPED_WART_BLOCK));
            list.add (new ItemStack (Items.SOUL_SAND));
            list.add (new ItemStack (Items.SOUL_SOIL));
            list.add (new ItemStack (Items.MOSS_CARPET));

            List<ItemLike> definedOrder = Arrays.asList (modBlocks.DIRT_PATH_FULL_BLOCK.get ().asItem (), Items.DIRT.asItem (), Items.ROOTED_DIRT.asItem (), Items.PACKED_MUD.asItem (), Items.COARSE_DIRT.asItem (), modBlocks.GRASS_FULL_BLOCK.get ().asItem (), Items.MOSS_BLOCK.asItem (), Items.SAND.asItem (), Items.GRAVEL.asItem (),
                    modBlocks.DIRT_PATH_CARPET.get ().asItem (), modBlocks.DIRT_CARPET.get ().asItem (), modBlocks.ROOTED_DIRT_CARPET.get ().asItem (), modBlocks.PACKED_MUD_CARPET.get ().asItem (), modBlocks.COARSE_DIRT_CARPET.get ().asItem (), modBlocks.GRASS_CARPET.get ().asItem (), Items.MOSS_CARPET.asItem (), modBlocks.SAND_CARPET.get ().asItem (), modBlocks.GRAVEL_CARPET.get ().asItem (),
                    modBlocks.DIRT_PATH_SLAB.get ().asItem (), modBlocks.DIRT_SLAB.get ().asItem (), modBlocks.ROOTED_DIRT_SLAB.get ().asItem (), modBlocks.PACKED_MUD_SLAB.get ().asItem (), modBlocks.COARSE_DIRT_SLAB.get ().asItem (), modBlocks.GRASS_SLAB.get ().asItem (), modBlocks.MOSS_SLAB.get ().asItem (), modBlocks.SAND_SLAB.get ().asItem (), modBlocks.GRAVEL_SLAB.get ().asItem (),
                    modBlocks.DIRT_PATH_STAIRS.get ().asItem (), modBlocks.DIRT_STAIRS.get ().asItem (), modBlocks.ROOTED_DIRT_STAIRS.get ().asItem (), modBlocks.PACKED_MUD_STAIRS.get ().asItem (), modBlocks.COARSE_DIRT_STAIRS.get ().asItem (), modBlocks.GRASS_STAIRS.get ().asItem (), modBlocks.MOSS_STAIRS.get ().asItem (), modBlocks.SAND_STAIRS.get ().asItem (), modBlocks.GRAVEL_STAIRS.get ().asItem (), Items.CLAY.asItem (),
                    modBlocks.MYCELIUM_FULL_BLOCK.get ().asItem (), Items.MUD.asItem (), Items.RED_SAND.asItem (), Items.NETHER_WART_BLOCK.asItem (), Items.WARPED_WART_BLOCK.asItem (), modBlocks.PODZOL_FULL_BLOCK.get ().asItem (), Items.SOUL_SAND.asItem (), Items.SOUL_SOIL.asItem (),
                    modBlocks.CLAY_CARPET.get ().asItem (), modBlocks.MYCELIUM_CARPET.get ().asItem (), modBlocks.MUD_CARPET.get ().asItem (), modBlocks.RED_SAND_CARPET.get ().asItem (), modBlocks.NETHER_WART_CARPET.get ().asItem (), modBlocks.WARPED_WART_CARPET.get ().asItem (), modBlocks.PODZOL_CARPET.get ().asItem (), modBlocks.SOUL_SAND_CARPET.get ().asItem (), modBlocks.SOUL_SOIL_CARPET.get ().asItem (),
                    modBlocks.CLAY_SLAB.get ().asItem (), modBlocks.MYCELIUM_SLAB.get ().asItem (), modBlocks.MUD_SLAB.get ().asItem (), modBlocks.RED_SAND_SLAB.get ().asItem (), modBlocks.NETHER_WART_SLAB.get ().asItem (), modBlocks.WARPED_WART_SLAB.get ().asItem (), modBlocks.PODZOL_SLAB.get ().asItem (), modBlocks.SOUL_SAND_SLAB.get ().asItem (), modBlocks.SOUL_SOIL_SLAB.get ().asItem (),
                    modBlocks.CLAY_STAIRS.get ().asItem (), modBlocks.MYCELIUM_STAIRS.get ().asItem (), modBlocks.MUD_STAIRS.get ().asItem (), modBlocks.RED_SAND_STAIRS.get ().asItem (), modBlocks.NETHER_WART_STAIRS.get ().asItem (), modBlocks.WARPED_WART_STAIRS.get ().asItem (), modBlocks.PODZOL_STAIRS.get ().asItem (), modBlocks.SOUL_SAND_STAIRS.get ().asItem (), modBlocks.SOUL_SOIL_STAIRS.get ().asItem ());
            Comparator<ItemStack> tabSorter;
            tabSorter = Ordering.explicit (definedOrder).onResultOf (ItemStack::getItem);
            list.sort (tabSorter);
        }
    };

}
