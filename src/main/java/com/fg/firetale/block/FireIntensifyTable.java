package com.fg.firetale.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class FireIntensifyTable extends Block{
    public FireIntensifyTable(){
        super(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F,8.0F));
    }
}
