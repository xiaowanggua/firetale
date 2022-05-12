package com.fg.firetale.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class FireIntensifyTable<E extends BlockEntity> extends BaseEntityBlock {


    public FireIntensifyTable(){
        super(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F,8.0F));
    }


    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new FitBlockEntity(blockPos,blockState);
    }
}
