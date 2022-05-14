package com.fg.firetale.worldgen.dimensions;

import com.fg.firetale.firetale;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class Dimensions {
    public static final ResourceKey<Level> MYSTERIOUS = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(firetale.MODID, "darkworld"));

    public static void register() {
        Registry.register(Registry.CHUNK_GENERATOR, new ResourceLocation(firetale.MODID, "darkworld_chunkgen"),
                darkWorldChunkGenerator.CODEC);
        Registry.register(Registry.BIOME_SOURCE, new ResourceLocation(firetale.MODID, "biomes"),
                darkBiome.CODEC);
    }
}
