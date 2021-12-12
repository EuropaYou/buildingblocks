package com.europayou.buildingblocks.decoratives;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class decorative_note_block extends Block {
    public decorative_note_block() {
        super(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(0.8f, 0.8f).breakByTool(FabricToolTags.AXES,1).breakByHand(true));
    }
}
