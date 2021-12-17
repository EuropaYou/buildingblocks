package com.europayou.buildingblocks;

import com.europayou.buildingblocks.concretes.*;
import com.europayou.buildingblocks.decoratives.*;
import com.europayou.buildingblocks.vertical_blocks.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class buildingblocks implements ModInitializer {

	public static final Block DARK_BLUE_CONCRETE = new dark_blue_concrete();
	public static final Block DARK_BLUE_CONCRETE_POWDER = new dark_blue_concrete_powder();
	public static final Block GRAPE_CONCRETE = new grape_concrete();
	public static final Block GRAPE_CONCRETE_POWDER = new grape_concrete_powder();
	public static final Block MERLOT_CONCRETE = new merlot_concrete();
	public static final Block MERLOT_CONCRETE_POWDER = new merlot_concrete_powder();
	public static final Block MORMALADE_CONCRETE = new mormalade_concrete();
	public static final Block MORMALADE_CONCRETE_POWDER = new mormalade_concrete_powder();
	public static final Block OLIVE_CONCRETE = new olive_concrete();
	public static final Block OLIVE_CONCRETE_POWDER = new olive_concrete_powder();
	public static final Block PUNCH_CONCRETE = new punch_concrete();
	public static final Block PUNCH_CONCRETE_POWDER = new punch_concrete_powder();
	public static final Block VIOLET_CONCRETE = new violet_concrete();
	public static final Block VIOLET_CONCRETE_POWDER = new violet_concrete_powder();

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier("buildingblocks", "general"),() -> new ItemStack(Blocks.COBBLESTONE));

	public static final Block VERTICAL_STONE_SLAB = new vertical_stone_slab();
	public static final Block VERTICAL_COBBLESTONE_SLAB = new vertical_cobblestone_slab();
	public static final Block VERTICAL_OAK_PLANK_SLAB = new vertical_oak_plank_slab();
	public static final Block VERTICAL_SPRUCE_PLANK_SLAB = new vertical_spruce_plank_slab();
	public static final Block VERTICAL_BIRCH_PLANK_SLAB = new vertical_birch_plank_slab();
	public static final Block VERTICAL_JUNGLE_PLANK_SLAB = new vertical_jungle_plank_slab();

	public static final Block DECORATIVE_FURNACE = new decorative_furnace();
	public static final Block DECORATIVE_BLAST_FURNACE = new decorative_blast_furnace();
	public static final Block DECORATIVE_DISPENSER = new decorative_dispenser();
	public static final Block DECORATIVE_NOTE_BLOCK = new decorative_note_block();
	public static final Block DECORATIVE_SMOKER = new decorative_smoker();
	public static final Block DECORATIVE_BEENEST = new decorative_beenest();
	public static final Block DECORATIVE_BEEHIVE = new decorative_beehive();
	public static final Block DECORATIVE_OBSERVER = new decorative_observer();
	public static final Block DECORATIVE_DROPPER = new decorative_dropper();

	//public static final Block DECORATIVE_DISPENSER = new decorative_dispenser();
	@Override
	public void onInitialize() {
		String id = "buildingblocks";
/*
        Registry.register(Registry.BLOCK, new Identifier(id, "vertical_oak_plank_slab"), VERTICAL_OAK_PLANK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(id, "vertical_oak_plank_slab"), new BlockItem(VERTICAL_OAK_PLANK_SLAB, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "vertical_spruce_plank_slab"), VERTICAL_SPRUCE_PLANK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(id, "vertical_spruce_plank_slab"), new BlockItem(VERTICAL_SPRUCE_PLANK_SLAB, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "vertical_birch_plank_slab"), VERTICAL_BIRCH_PLANK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(id, "vertical_birch_plank_slab"), new BlockItem(VERTICAL_BIRCH_PLANK_SLAB, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "vertical_jungle_plank_slab"), VERTICAL_JUNGLE_PLANK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(id, "vertical_jungle_plank_slab"), new BlockItem(VERTICAL_JUNGLE_PLANK_SLAB, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "vertical_stone_slab"), VERTICAL_STONE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(id, "vertical_stone_slab"), new BlockItem(VERTICAL_STONE_SLAB, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "vertical_cobblestone_slab"), VERTICAL_COBBLESTONE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(id, "vertical_cobblestone_slab"), new BlockItem(VERTICAL_COBBLESTONE_SLAB, new Item.Settings().group(ITEM_GROUP)));*/

        /*Europa's Building Blocks"
        Registry.register(Registry.BLOCK, new Identifier(id, "dark_blue_concrete"), DARK_BLUE_CONCRETE);
        Registry.register(Registry.ITEM, new Identifier(id, "dark_blue_concrete"), new BlockItem(DARK_BLUE_CONCRETE, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "dark_blue_concrete_powder"), DARK_BLUE_CONCRETE_POWDER);
        Registry.register(Registry.ITEM, new Identifier(id, "dark_blue_concrete_powder"), new BlockItem(DARK_BLUE_CONCRETE_POWDER, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "grape_concrete"), GRAPE_CONCRETE);
        Registry.register(Registry.ITEM, new Identifier(id, "grape_concrete"), new BlockItem(GRAPE_CONCRETE, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "grape_concrete_powder"), GRAPE_CONCRETE_POWDER);
        Registry.register(Registry.ITEM, new Identifier(id, "grape_concrete_powder"), new BlockItem(GRAPE_CONCRETE_POWDER, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "merlot_concrete"), MERLOT_CONCRETE);
        Registry.register(Registry.ITEM, new Identifier(id, "merlot_concrete"), new BlockItem(MERLOT_CONCRETE, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "merlot_concrete_powder"), MERLOT_CONCRETE_POWDER);
        Registry.register(Registry.ITEM, new Identifier(id, "merlot_concrete_powder"), new BlockItem(MERLOT_CONCRETE_POWDER, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "mormalade_concrete"), MORMALADE_CONCRETE);
        Registry.register(Registry.ITEM, new Identifier(id, "mormalade_concrete"), new BlockItem(MORMALADE_CONCRETE, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "mormalade_concrete_powder"), MORMALADE_CONCRETE_POWDER);
        Registry.register(Registry.ITEM, new Identifier(id, "mormalade_concrete_powder"), new BlockItem(MORMALADE_CONCRETE_POWDER, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "olive_concrete"), OLIVE_CONCRETE);
        Registry.register(Registry.ITEM, new Identifier(id, "olive_concrete"), new BlockItem(OLIVE_CONCRETE, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "olive_concrete_powder"), OLIVE_CONCRETE_POWDER);
        Registry.register(Registry.ITEM, new Identifier(id, "olive_concrete_powder"), new BlockItem(OLIVE_CONCRETE_POWDER, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "punch_concrete"), PUNCH_CONCRETE);
        Registry.register(Registry.ITEM, new Identifier(id, "punch_concrete"), new BlockItem(PUNCH_CONCRETE, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "punch_concrete_powder"), PUNCH_CONCRETE_POWDER);
        Registry.register(Registry.ITEM, new Identifier(id, "punch_concrete_powder"), new BlockItem(PUNCH_CONCRETE_POWDER, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "violet_concrete"), VIOLET_CONCRETE);
        Registry.register(Registry.ITEM, new Identifier(id, "violet_concrete"), new BlockItem(VIOLET_CONCRETE, new Item.Settings().group(ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(id, "violet_concrete_powder"), VIOLET_CONCRETE_POWDER);
        Registry.register(Registry.ITEM, new Identifier(id, "violet_concrete_powder"), new BlockItem(VIOLET_CONCRETE_POWDER, new Item.Settings().group(ITEM_GROUP)));
         */
		Registry.register(Registry.BLOCK, new Identifier(id, "decorative_furnace"), DECORATIVE_FURNACE);
		Registry.register(Registry.ITEM, new Identifier(id, "decorative_furnace"), new BlockItem(DECORATIVE_FURNACE, new Item.Settings().group(ITEM_GROUP)));
		Registry.register(Registry.BLOCK, new Identifier(id, "decorative_blast_furnace"), DECORATIVE_BLAST_FURNACE);
		Registry.register(Registry.ITEM, new Identifier(id, "decorative_blast_furnace"), new BlockItem(DECORATIVE_BLAST_FURNACE, new Item.Settings().group(ITEM_GROUP)));
		Registry.register(Registry.BLOCK, new Identifier(id, "decorative_dispenser"), DECORATIVE_DISPENSER);
		Registry.register(Registry.ITEM, new Identifier(id, "decorative_dispenser"), new BlockItem(DECORATIVE_DISPENSER, new Item.Settings().group(ITEM_GROUP)));
		Registry.register(Registry.BLOCK, new Identifier(id, "decorative_note_block"), DECORATIVE_NOTE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(id, "decorative_note_block"), new BlockItem(DECORATIVE_NOTE_BLOCK, new Item.Settings().group(ITEM_GROUP)));
		Registry.register(Registry.BLOCK, new Identifier(id, "decorative_smoker"), DECORATIVE_SMOKER);
		Registry.register(Registry.ITEM, new Identifier(id, "decorative_smoker"), new BlockItem(DECORATIVE_SMOKER, new Item.Settings().group(ITEM_GROUP)));
		Registry.register(Registry.BLOCK, new Identifier(id, "decorative_beehive"), DECORATIVE_BEEHIVE);
		Registry.register(Registry.ITEM, new Identifier(id, "decorative_beehive"), new BlockItem(DECORATIVE_BEEHIVE, new Item.Settings().group(ITEM_GROUP)));
		Registry.register(Registry.BLOCK, new Identifier(id, "decorative_beenest"), DECORATIVE_BEENEST);
		Registry.register(Registry.ITEM, new Identifier(id, "decorative_beenest"), new BlockItem(DECORATIVE_BEENEST, new Item.Settings().group(ITEM_GROUP)));
		Registry.register(Registry.BLOCK, new Identifier(id, "decorative_observer"), DECORATIVE_OBSERVER);
		Registry.register(Registry.ITEM, new Identifier(id, "decorative_observer"), new BlockItem(DECORATIVE_OBSERVER, new Item.Settings().group(ITEM_GROUP)));
		Registry.register(Registry.BLOCK, new Identifier(id, "decorative_dropper"), DECORATIVE_DROPPER);
		Registry.register(Registry.ITEM, new Identifier(id, "decorative_dropper"), new BlockItem(DECORATIVE_DROPPER, new Item.Settings().group(ITEM_GROUP)));
	}
}