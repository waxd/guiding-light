package dev.waxd.lighthouse.client;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class LighthouseController extends Block {
    public LighthouseController() {
        super(Properties.create(Material.ANVIL, MaterialColor.BLACK_TERRACOTTA));
    }
}
