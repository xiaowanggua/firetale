package com.fg.firetale.block;

import com.fg.firetale.firetale;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityReg {
    public final static DeferredRegister<BlockEntityType<?>> BlockEntity=DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, firetale.MODID);
    public final static RegistryObject<BlockEntityType<FitBlockEntity>> fitBlockEntity=BlockEntity.register("fit_block_entity",()->BlockEntityType.Builder.of(FitBlockEntity::new, BlockRegister.fireIntensifyTable.get()).build(null));
}
