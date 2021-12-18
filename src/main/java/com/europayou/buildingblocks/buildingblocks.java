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

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier("buildingblocks", "general"),() -> new ItemStack(Blocks.COBBLESTONE));

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