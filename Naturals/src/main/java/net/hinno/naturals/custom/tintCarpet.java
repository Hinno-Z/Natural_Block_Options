package net.hinno.naturals.custom;

import net.hinno.naturals.block.modBlocks;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;

public class tintCarpet extends CarpetBlock {
    public tintCarpet(BlockBehaviour.Properties p_49795_) {
        super(p_49795_);
    }

	@OnlyIn(Dist.CLIENT)
	public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
		event.getBlockColors().register((bs, world, pos, index) -> {
			return world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.get(0.5D, 1.0D);
		}, modBlocks.GRASS_CARPET.get());
	}

	@OnlyIn(Dist.CLIENT)
	public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
		event.getItemColors().register((stack, index) -> {
			return GrassColor.get(0.5D, 1.0D);
		}, modBlocks.GRASS_CARPET.get());
	}
}
