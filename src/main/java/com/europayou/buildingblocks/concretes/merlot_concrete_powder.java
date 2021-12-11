package com.europayou.buildingblocks.concretes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class merlot_concrete_powder extends FallingBlock {
    public merlot_concrete_powder(){
        super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.SAND).strength(0.5F, 0.5f).breakByTool(FabricToolTags.SHOVELS, 1));
    }
}
