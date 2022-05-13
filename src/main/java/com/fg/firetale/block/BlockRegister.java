package com.fg.firetale.block;

import com.fg.firetale.firetale;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegister {
    //blocks
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, firetale.MODID);

    public static final RegistryObject<Block> darkStone = BLOCKS.register("dark_stone", DarkStone::new);
    public static final RegistryObject<Block> fireIntensifyTable = BLOCKS.register("fire_intensifytable", ()->new FireIntensifyTable());
    public static final RegistryObject<Block> blockOfFanqieqwq = BLOCKS.register("block_of_fanqieqwq",BlockOfFanqieqwq::new);
}
