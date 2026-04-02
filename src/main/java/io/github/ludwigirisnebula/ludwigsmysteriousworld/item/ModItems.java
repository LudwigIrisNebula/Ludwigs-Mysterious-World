package io.github.ludwigirisnebula.ludwigsmysteriousworld.item;

import io.github.ludwigirisnebula.ludwigsmysteriousworld.LudwigsMysteriousWorld;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    //    Tool Material
    public static final ToolMaterial BIRCH_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL, // 挖掘限制
            59,          // 耐久（木）
            2.0F,        // 挖掘速度(all the same)
            0.0F,        // 攻击加成
            15,          // 附魔能力
            ItemTags.PLANKS// 修复材料
    );
    public static final ToolMaterial WHITE_DIAMOND_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL, // 挖掘限制（钻石级）
            1561,        // 耐久（钻石）
            8.5F,        // 挖掘速度(a little bit higher)
            3.4F,        // 攻击加成(a little bit higher)
            12,          // 附魔能力(a little bit higher)
            ItemTags.DIAMOND_TOOL_MATERIALS // 修复材料（钻石类）
    );
//    Obsidian
    public static final ToolMaterial SNOWFLAKE_OBSIDIAN_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1950,
            8.2F,           // (a little bit lower than white diamond)
            3.1F,
            10,
            ItemTags.DIAMOND_TOOL_MATERIALS //Wait to change
    );
    public static final ToolMaterial MAHOGANY_OBSIDIAN_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            2420,
            7.6F,           // (a little bit lower than snowflake obsidian)
            3.0F,
            10,
            ItemTags.DIAMOND_TOOL_MATERIALS //Wait to change
    );



//    Items
    // INGREDIENTS
    public static final Item WHITE_DIAMOND = registerItem(
            "white_diamond", Item::new
);
//                .registryKey(RegistryKey.of(
//                        RegistryKeys.ITEM,
//                        Identifier.of(LudwigsMysteriousWorld.MOD_ID, "white_diamond")
//                ))

    // Tools
//        White diamond
    public static final Item WHITE_DIAMOND_SWORD = registerItem(
            "white_diamond_sword", setting -> new Item(setting
                    .sword(WHITE_DIAMOND_TOOL_MATERIAL, 3.0F, -2.4F)
                    ));
    public static final Item WHITE_DIAMOND_AXE = registerItem(
            "white_diamond_axe", setting -> new Item(setting
                    .axe(WHITE_DIAMOND_TOOL_MATERIAL, 5.0F, -3.0F))
    );
    public static final Item WHITE_DIAMOND_HOE = registerItem(
            "white_diamond_hoe", setting -> new Item(setting
                    .hoe(WHITE_DIAMOND_TOOL_MATERIAL, -3.0F, 0.0F))
    );
    public static final Item WHITE_DIAMOND_PICKAXE = registerItem(
            "white_diamond_pickaxe", setting -> new Item(setting
                    .pickaxe(WHITE_DIAMOND_TOOL_MATERIAL, 1.0F, -2.8F))
    );
    public static final Item WHITE_DIAMOND_SHOVEL = registerItem(
            "white_diamond_shovel", setting -> new Item(setting
                    .shovel(WHITE_DIAMOND_TOOL_MATERIAL, 1.5F, -3.0F))
    );

//        Obsidian
    // Snowflake Obsidian
    public static final Item SNOWFLAKE_OBSIDIAN_SWORD = registerItem(
            "snowflake_obsidian_sword", setting -> new Item(setting
                    .sword(SNOWFLAKE_OBSIDIAN_TOOL_MATERIAL, 3.0F, -2.4F)
            ));
    public static final Item SNOWFLAKE_OBSIDIAN_AXE = registerItem(
            "snowflake_obsidian_axe", setting -> new Item(setting
                    .axe(SNOWFLAKE_OBSIDIAN_TOOL_MATERIAL, 5.0F, -3.0F)
            ));
    public static final Item SNOWFLAKE_OBSIDIAN_HOE = registerItem(
            "snowflake_obsidian_hoe", setting -> new Item(setting
                    .hoe(SNOWFLAKE_OBSIDIAN_TOOL_MATERIAL, -3.0F, 0.0F)
            ));
    public static final Item SNOWFLAKE_OBSIDIAN_PICKAXE = registerItem(
            "snowflake_obsidian_pickaxe", setting -> new Item(setting
                    .pickaxe(SNOWFLAKE_OBSIDIAN_TOOL_MATERIAL, 1.0F, -2.8F)
            ));
    public static final Item SNOWFLAKE_OBSIDIAN_SHOVEL = registerItem(
            "snowflake_obsidian_shovel", setting -> new Item(setting
                    .shovel(SNOWFLAKE_OBSIDIAN_TOOL_MATERIAL, 1.5F, -3.0F)
            ));

    // Mahogany Obsidian
//        TODO: texture, lang
    public static final Item MAHOGANY_OBSIDIAN_SWORD = registerItem(
            "mahogany_obsidian_sword", setting -> new Item(setting
                    .sword(MAHOGANY_OBSIDIAN_TOOL_MATERIAL, 3.0F, -2.4F)
            ));
    public static final Item MAHOGANY_OBSIDIAN_AXE = registerItem(
            "mahogany_obsidian_axe", setting -> new Item(setting
                    .axe(MAHOGANY_OBSIDIAN_TOOL_MATERIAL, 5.0F, -3.0F)
            ));
    public static final Item MAHOGANY_OBSIDIAN_HOE = registerItem(
            "mahogany_obsidian_hoe", setting -> new Item(setting
                    .hoe(MAHOGANY_OBSIDIAN_TOOL_MATERIAL, -3.0F, 0.0F)
            ));
    public static final Item MAHOGANY_OBSIDIAN_PICKAXE = registerItem(
            "mahogany_obsidian_pickaxe", setting -> new Item(setting
                    .pickaxe(MAHOGANY_OBSIDIAN_TOOL_MATERIAL, 1.0F, -2.8F)
            ));
    public static final Item MAHOGANY_OBSIDIAN_SHOVEL = registerItem(
            "mahogany_obsidian_shovel", setting -> new Item(setting
                    .shovel(MAHOGANY_OBSIDIAN_TOOL_MATERIAL, 1.5F, -3.0F)
            ));


//        Birch
    public static final Item BIRCH_SWORD = registerItem(
        "birch_sword", setting -> new Item(setting
                .sword(BIRCH_TOOL_MATERIAL,3,-2.4F))
    );
//                .registryKey(RegistryKey.of(
//                        RegistryKeys.ITEM,
//                        Identifier.of(LudwigsMysteriousWorld.MOD_ID, "birch_sword")))
//        ));


    // Special Items
    public static final Item LUDWIGS_IRIS_PICTURE = registerItem(
            "ludwigs_iris_picture", Item::new
    );
//                .registryKey(RegistryKey.of(
//                        RegistryKeys.ITEM,
//                        Identifier.of(LudwigsMysteriousWorld.MOD_ID, "ludwigs_iris_picture")))
//        ));
//    --
//    public static final Item LUDWIGS_IRIS_PICTURE = registerItem(
//            "ludwigs_iris_picture", new Item(new Item.Settings()));
//  --Original--





//    Main register
private static Item registerItem(String name, Function<Item.Settings, Item> function) {
    return Registry.register(Registries.ITEM, Identifier.of(LudwigsMysteriousWorld.MOD_ID, name),
            function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LudwigsMysteriousWorld.MOD_ID, name)))));
}
//        --Test--(and it worked)
//        Identifier id = Identifier.of(LudwigsMysteriousWorld.MOD_ID, name);
//        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
//        Item.Settings settings = new Item.Settings().registryKey(key);
//        return Registry.register(
//                Registries.ITEM,
//                key,
//                item
//        );
        //        --Original--
//        return Registry.register(
//                Registries.ITEM,
//                Identifier.of(LudwigsMysteriousWorld.MOD_ID, name), item);

    public static void registerModItems(){
        LudwigsMysteriousWorld.LOGGER.info(
                "Registering Mod Items for " + LudwigsMysteriousWorld.MOD_ID);

        //    Add to item group (wait to create my own item group)
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
//                .register(entries -> {
//                    entries.add(LUDWIGS_IRIS_PICTURE);
//                    entries.add(WHITE_DIAMOND);
//                });
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
//                .register(entries -> {
//                    entries.add(BIRCH_SWORD);
//
//                    entries.add(WHITE_DIAMOND_SWORD);
//                    entries.add(WHITE_DIAMOND_AXE);
//                });
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
//                .register(entries -> {
//                    entries.add(WHITE_DIAMOND_HOE);
//                    entries.add(WHITE_DIAMOND_PICKAXE);
//                    entries.add(WHITE_DIAMOND_AXE);
//                    entries.add(WHITE_DIAMOND_SHOVEL);
//                });
    }
}
