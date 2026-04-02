package io.github.ludwigirisnebula.ludwigsmysteriousworld.item;

import io.github.ludwigirisnebula.ludwigsmysteriousworld.LudwigsMysteriousWorld;
import io.github.ludwigirisnebula.ludwigsmysteriousworld.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {




//    Nature of the World
    public static final ItemGroup NATURE_OF_THE_WORLD = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LudwigsMysteriousWorld.MOD_ID, "nature_of_the_world"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.DEEPSLATE_WHITE_DIAMOND_ORE))
                    .displayName(Text.translatable("itemgroup.ludwigsmysteriousworld.nature_of_the_world"))
                    .entries((displayContext, entries) -> {
//                        White Diamond
                        entries.add(ModBlocks.WHITE_DIAMOND_ORE);
                        entries.add(ModBlocks.DEEPSLATE_WHITE_DIAMOND_ORE);
//                        Obsidian
                        entries.add(ModBlocks.SNOWFLAKE_OBSIDIAN);
                        entries.add(ModBlocks.MAHOGANY_OBSIDIAN);

                    })
                    .build()
            );



//    Materials & Resources
public static final ItemGroup MATERIALS_AND_RESOURCES = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(LudwigsMysteriousWorld.MOD_ID, "materials_and_resources"),
        FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModBlocks.WHITE_DIAMOND_BLOCK))
                .displayName(Text.translatable("itemgroup.ludwigsmysteriousworld.materials_and_resources"))
                .entries((displayContext, entries) -> {
//                    White Diamond
                    entries.add(ModItems.WHITE_DIAMOND);
                    entries.add(ModBlocks.WHITE_DIAMOND_BLOCK);
//                    Obsidian
                    entries.add(ModBlocks.SNOWFLAKE_OBSIDIAN);
                    entries.add(ModBlocks.MAHOGANY_OBSIDIAN);

                })
                .build()
);



//    Ludwig's Tools
public static final ItemGroup LUDWIGS_TOOLS = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(LudwigsMysteriousWorld.MOD_ID, "ludwigs_tools"),
        FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.WHITE_DIAMOND_SWORD)) //Wait to change this
                .displayName(Text.translatable("itemgroup.ludwigsmysteriousworld.ludwigs_tools"))
                .entries((displayContext, entries) -> {
//                    White Diamond
                    entries.add(ModItems.WHITE_DIAMOND_SWORD);
                    entries.add(ModItems.WHITE_DIAMOND_AXE);
                    entries.add(ModItems.WHITE_DIAMOND_PICKAXE);
                    entries.add(ModItems.WHITE_DIAMOND_SHOVEL);
                    entries.add(ModItems.WHITE_DIAMOND_HOE);

//                    Snowflake Obsidian
                    entries.add(ModItems.SNOWFLAKE_OBSIDIAN_SWORD);
                    entries.add(ModItems.SNOWFLAKE_OBSIDIAN_AXE);
                    entries.add(ModItems.SNOWFLAKE_OBSIDIAN_PICKAXE);
                    entries.add(ModItems.SNOWFLAKE_OBSIDIAN_SHOVEL);
                    entries.add(ModItems.SNOWFLAKE_OBSIDIAN_HOE);
//                    Mahogany obsidian
                    entries.add(ModItems.MAHOGANY_OBSIDIAN_SWORD);
                    entries.add(ModItems.MAHOGANY_OBSIDIAN_AXE);
                    entries.add(ModItems.MAHOGANY_OBSIDIAN_PICKAXE);
                    entries.add(ModItems.MAHOGANY_OBSIDIAN_SHOVEL);
                    entries.add(ModItems.MAHOGANY_OBSIDIAN_HOE);

//                    Birch
                    entries.add(ModItems.BIRCH_SWORD);

                })
                .build()
);



//    Ludwig's Equipment
public static final ItemGroup LUDWIGS_EQUIPMENT = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(LudwigsMysteriousWorld.MOD_ID, "ludwigs_equipment"),
        FabricItemGroup.builder()
//                .icon(() -> new ItemStack(ModItems.LUDWIGS_IRIS_PICTURE)) //Wait to change this
                .displayName(Text.translatable("itemgroup.ludwigsmysteriousworld.ludwigs_equipment"))
                .entries((displayContext, entries) -> {

                })
                .build()
);



//    Ludwig's Archive
public static final ItemGroup LUDWIGS_ARCHIVE = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(LudwigsMysteriousWorld.MOD_ID, "ludwigs_archive"),
        FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.LUDWIGS_IRIS_PICTURE)) //Wait to change this
                .displayName(Text.translatable("itemgroup.ludwigsmysteriousworld.ludwigs_archive"))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.LUDWIGS_IRIS_PICTURE);

                })
                .build()
);



//    The Heart of the World
public static final ItemGroup THE_HEART_OF_THE_WORLD = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(LudwigsMysteriousWorld.MOD_ID, "the_heart_of_the_world"),
        FabricItemGroup.builder()
//                .icon(() -> new ItemStack(ModItems.LUDWIGS_IRIS_PICTURE)) //Wait to change this
                .displayName(Text.translatable("itemgroup.ludwigsmysteriousworld.the_heart_of_the_world"))
                .entries((displayContext, entries) -> {

                })
                .build()
);



//    Starbound Relics
public static final ItemGroup STARBOUND_RELICS = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(LudwigsMysteriousWorld.MOD_ID, "starbound_relics"),
        FabricItemGroup.builder()
//                .icon(() -> new ItemStack(ModItems.LUDWIGS_IRIS_PICTURE)) //Wait to change this
                .displayName(Text.translatable("itemgroup.ludwigsmysteriousworld.starbound_relics"))
                .entries((displayContext, entries) -> {

                })
                .build()
);



//    More...







    public static void registerItemGroups(){
        LudwigsMysteriousWorld.LOGGER.info(
                "Registering Item Groups for " + LudwigsMysteriousWorld.MOD_ID);
    }
}
