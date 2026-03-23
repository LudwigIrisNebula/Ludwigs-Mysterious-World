package io.github.ludwigirisnebula.ludwigsmysteriousworld.block;

import io.github.ludwigirisnebula.ludwigsmysteriousworld.LudwigsMysteriousWorld;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

//  Block
    //   Building
    public static final Block WHITE_DIAMOND_BLOCK =
        registerBlock("white_diamond_block",
        AbstractBlock.Settings.create()
                .strength(4f, 3.0F) //破坏时间
                .requiresTool() //使用工具挖掘
                .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                .mapColor(MapColor.WHITE)
                .slipperiness(0.75F) //有点滑
        );
    //  Ore
    public static final Block DEEPSLATE_WHITE_DIAMOND_ORE =
            registerBlock("deepslate_white_diamond_ore",
                    AbstractBlock.Settings.create()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(4.5F, 3.0F)
                            .requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)
                            .mapColor(MapColor.GRAY)
            );
    public static final Block WHITE_DIAMOND_ORE =
            registerBlock("white_diamond_ore",
                    AbstractBlock.Settings.create()
                            .strength(3.0F, 3.0F)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
                            .mapColor(MapColor.GRAY)
            );


//  main register
    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings){
        RegistryKey<Block>key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(LudwigsMysteriousWorld.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }
//    --Original--
//    private static Block registerBlock(String name, Block block){
//        registerBlockItem(name, block);
//        return Registry.register(Registries.BLOCK, Identifier.of(LudwigsMysteriousWorld.MOD_ID, name), block);
//    }

    private static void registerBlockItem(String name, Block block){
        RegistryKey<Item>key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LudwigsMysteriousWorld.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }
//    --Original--
//    private static void registerBlockItem(String name, Block block){
//        Registry.register(Registries.ITEM, Identifier.of(LudwigsMysteriousWorld.MOD_ID, name),
//                new BlockItem(block, new Item.Settings()));
//    }

    public static void registerModBlocks(){
        LudwigsMysteriousWorld.LOGGER.info("Registering Mod Blocks for " + LudwigsMysteriousWorld.MOD_ID);

        // add to group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> {
            entries.add(ModBlocks.WHITE_DIAMOND_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register(entries -> {
                    entries.add(ModBlocks.DEEPSLATE_WHITE_DIAMOND_ORE);
                    entries.add(ModBlocks.WHITE_DIAMOND_ORE);
                });
    }
}






