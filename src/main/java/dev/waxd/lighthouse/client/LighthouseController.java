package dev.waxd.lighthouse.client;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class LighthouseController extends Block {
    public LighthouseController() {
        super(Properties.create(Material.GLASS));
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
