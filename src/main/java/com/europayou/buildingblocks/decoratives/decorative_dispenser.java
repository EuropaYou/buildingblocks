package com.europayou.buildingblocks.decoratives;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class decorative_dispenser extends HorizontalFacingBlock {
    public decorative_dispenser() {
        super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(3.5f, 3.5f).breakByTool(FabricToolTags.PICKAXES,1).breakByHand(false));
    }
}