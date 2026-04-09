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
//                        Crystal
                        entries.add(ModBlocks.WHITE_CRYSTAL_BLOCK);
//                        Obsidian
                        entries.add(ModBlocks.SNOWFLAKE_OBSIDIAN);
                        entries.add(ModBlocks.MAHOGANY_OBSIDIAN);
                        entries.add(ModBlocks.SHEEN_OBSIDIAN);
                        entries.add(ModBlocks.GREEN_OBSIDIAN);
//                        Plant
    //                        Food
                        entries.add(ModItems.GREEN_APPLE);

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
//                    Crystal
                    entries.add(ModBlocks.WHITE_CRYSTAL_BLOCK);
//                    Obsidian
                    entries.add(ModBlocks.SNOWFLAKE_OBSIDIAN);
                    entries.add(ModBlocks.MAHOGANY_OBSIDIAN);
                    entries.add(ModBlocks.SHEEN_OBSIDIAN);
                    entries.add(ModBlocks.GREEN_OBSIDIAN);
//                    Heart
                    entries.add(ModItems.HEART_CORE_FRAGMENT);

                })
                .build()
);



//    Foods
public static final ItemGroup LUDWIGS_FOODS = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(LudwigsMysteriousWorld.MOD_ID, "ludwigs_foods"),
        FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.GREEN_APPLE))
                .displayName(Text.translatable("itemgroup.ludwigsmysteriousworld.ludwigs_foods"))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.GREEN_APPLE);
                    entries.add(ModItems.IDUNNS_APPLE);
                    entries.add(ModItems.ENCHANTED_IDUNNS_APPLE);

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
//                    Sheen Obsidian
                    entries.add(ModItems.SHEEN_OBSIDIAN_SWORD);
                    entries.add(ModItems.SHEEN_OBSIDIAN_AXE);
                    entries.add(ModItems.SHEEN_OBSIDIAN_PICKAXE);
                    entries.add(ModItems.SHEEN_OBSIDIAN_SHOVEL);
                    entries.add(ModItems.SHEEN_OBSIDIAN_HOE);
//                    Green Obsidian
                    entries.add(ModItems.GREEN_OBSIDIAN_SWORD);
                    entries.add(ModItems.GREEN_OBSIDIAN_AXE);
                    entries.add(ModItems.GREEN_OBSIDIAN_PICKAXE);
                    entries.add(ModItems.GREEN_OBSIDIAN_SHOVEL);
                    entries.add(ModItems.GREEN_OBSIDIAN_HOE);

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
                    entries.add(ModItems.GOLDEN_LEAF);

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
