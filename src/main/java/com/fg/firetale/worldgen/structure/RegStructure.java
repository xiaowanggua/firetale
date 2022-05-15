package com.fg.firetale.worldgen.structure;

import com.fg.firetale.firetale;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.structure.StructureSet;

public class RegStructure {
    public static final ResourceLocation DARKWORLD_DIMENSION_SET = new ResourceLocation(firetale.MODID, "darkworld_structureset");
    public static final TagKey<StructureSet> DARKWORLD_DIMENSION_STRUCTURE_SET = TagKey.create(Registry.STRUCTURE_SET_REGISTRY, DARKWORLD_DIMENSION_SET);

}
