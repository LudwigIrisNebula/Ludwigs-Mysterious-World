package io.github.ludwigirisnebula.ludwigsmysteriousworld.block;

import io.github.ludwigirisnebula.ludwigsmysteriousworld.LudwigsMysteriousWorld;
import io.github.ludwigirisnebula.ludwigsmysteriousworld.block.custom.WhiteCrystalBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
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
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.function.Function;

public class ModBlocks {

//  Block
    //   Building
    public static final Block WHITE_DIAMOND_BLOCK =
        registerBlock("white_diamond_block",
                properties -> new Block(properties
                        .strength(4f, 3.0F) //破坏时间
                        .requiresTool() //使用工具挖掘
                        .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                        .mapColor(MapColor.WHITE)
                        .slipperiness(0.75F) //有点滑
                ));
//    public static final Block WHITE_DIAMOND_BLOCK =
//        registerBlock("white_diamond_block",
//        AbstractBlock.Settings.create()
//                .strength(4f, 3.0F) //破坏时间
//                .requiresTool() //使用工具挖掘
//                .sounds(BlockSoundGroup.AMETHYST_BLOCK)
//                .mapColor(MapColor.WHITE)
//                .slipperiness(0.75F) //有点滑
//        );
    //  Nature
        //    Obsidian
    //TODO: Add texture
    public static final Block SNOWFLAKE_OBSIDIAN =
        registerBlock("snowflake_obsidian",
                properties -> new Block(
                        properties
                                .instrument(NoteBlockInstrument.BASEDRUM)
                                .strength(50.0F, 1200.0F) // Obsidian level
                                .requiresTool()
                                .sounds(BlockSoundGroup.STONE)
                                .mapColor(MapColor.BLACK)
        ));//done
    public static final Block MAHOGANY_OBSIDIAN =
        registerBlock("mahogany_obsidian",
                properties -> new Block(
                        properties
                                .instrument(NoteBlockInstrument.BASEDRUM)
                                .strength(50.0F, 1200.0F) // Obsidian level
                                .requiresTool()
                                .sounds(BlockSoundGroup.STONE)
                                .mapColor(MapColor.BLACK)
        ));//done
    public static final Block SHEEN_OBSIDIAN =
            registerBlock("sheen_obsidian",
                    properties ->new Block(
                            properties
                                    .instrument(NoteBlockInstrument.BASEDRUM)
                                    .strength(50.0F, 1200.0F) // Obsidian level
                                    .requiresTool()
                                    .sounds(BlockSoundGroup.STONE)
                                    .mapColor(MapColor.BLACK)
                    ));//done
    public static final Block GREEN_OBSIDIAN =
            registerBlock("green_obsidian",
                    properties ->new Block(
                            properties
                                    .instrument(NoteBlockInstrument.BASEDRUM)
                                    .strength(50.0F, 1200.0F) // Obsidian level
                                    .requiresTool()
                                    .sounds(BlockSoundGroup.STONE)
                                    .mapColor(MapColor.BLACK)
                    ));

        //     Mushroom
//    TODO: Wait to add this
//    public static final Block MAHOGANY_OBSIDIAN =
//            registerBlock("mahogany_obsidian",
//                    properties -> new Block(
//                            properties
//                                    .instrument(NoteBlockInstrument.BASEDRUM)
//                                    .strength(50.0F, 1200.0F) // Obsidian level
//                                    .requiresTool()
//                                    .sounds(BlockSoundGroup.STONE)
//                                    .mapColor(MapColor.BLACK)
//                    ));



        //    Ore
    public static final Block DEEPSLATE_WHITE_DIAMOND_ORE =
            registerBlock("deepslate_white_diamond_ore",
                    properties -> new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    properties
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(4.5F, 3.0F)
                            .requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)
                            .mapColor(MapColor.GRAY)
            ));
    public static final Block WHITE_DIAMOND_ORE =
            registerBlock("white_diamond_ore",
                    properties -> new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                            properties
                                    .strength(3.0F, 3.0F)
                                    .requiresTool()
                                    .sounds(BlockSoundGroup.STONE)
                                    .mapColor(MapColor.GRAY)
                    ));
//    public static final Block WHITE_DIAMOND_ORE =
//            registerBlock("white_diamond_ore",
//                    AbstractBlock.Settings.create()
//                            .strength(3.0F, 3.0F)
//                            .requiresTool()
//                            .sounds(BlockSoundGroup.STONE)
//                            .mapColor(MapColor.GRAY)
//            );


//  Special Block
//    TODO: add texture
    public static final Block WHITE_CRYSTAL_BLOCK = registerBlock("white_crystal_block",
        properties -> new WhiteCrystalBlock(properties
                .strength(1f)
                .requiresTool()
        ));





//  main register
//    --test I--
//    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings){
//        RegistryKey<Block>key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(LudwigsMysteriousWorld.MOD_ID, name));
//        Block block = new Block(blockSettings.registryKey(key));
//        registerBlockItem(name, block);
//        return Registry.register(Registries.BLOCK, key, block);
//    }
//    --Original--
//    private static Block registerBlock(String name, Block block){
//        registerBlockItem(name, block);
//        return Registry.register(Registries.BLOCK, Identifier.of(LudwigsMysteriousWorld.MOD_ID, name), block);
//    }
//    --Update Original--
private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
    Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(LudwigsMysteriousWorld.MOD_ID, name))));
    registerBlockItem(name, toRegister);
    return Registry.register(Registries.BLOCK, Identifier.of(LudwigsMysteriousWorld.MOD_ID, name), toRegister);
}

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(LudwigsMysteriousWorld.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LudwigsMysteriousWorld.MOD_ID, name)))));
    }
//    --Original--
//    private static void registerBlockItem(String name, Block block){
//        Registry.register(Registries.ITEM, Identifier.of(LudwigsMysteriousWorld.MOD_ID, name),
//                new BlockItem(block, new Item.Settings()));
//    }

    public static void registerModBlocks(){
        LudwigsMysteriousWorld.LOGGER.info("Registering Mod Blocks for " + LudwigsMysteriousWorld.MOD_ID);

        // add to group
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
//                .register(entries -> {
//                    entries.add(ModBlocks.WHITE_DIAMOND_BLOCK);
//        });
    }
}






