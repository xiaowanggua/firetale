package com.fg.firetale.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;


public class DarkStone extends Block {
    public DarkStone() {
        super(Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F,8.0F));
    }
}
