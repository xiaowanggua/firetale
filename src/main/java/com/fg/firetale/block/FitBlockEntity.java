package com.fg.firetale.block;

import com.mojang.datafixers.types.Type;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Set;

public class FitBlockEntity extends BlockEntity {


    public FitBlockEntity( BlockPos pWorldPosition, BlockState pBlockState) {
        super(BlockEntityReg.fitBlockEntity.get(), pWorldPosition, pBlockState);
    }
}
