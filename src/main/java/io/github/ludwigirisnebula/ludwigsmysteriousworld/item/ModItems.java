package io.github.ludwigirisnebula.ludwigsmysteriousworld.item;

import io.github.ludwigirisnebula.ludwigsmysteriousworld.LudwigsMysteriousWorld;
import io.github.ludwigirisnebula.ludwigsmysteriousworld.item.custom.GoldenLeafItem;
import io.github.ludwigirisnebula.ludwigsmysteriousworld.item.custom.WhiteCrystalItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;
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
//    Diamond
    public static final ToolMaterial WHITE_DIAMOND_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL, // 挖掘限制（钻石级）
            1561,        // 耐久（钻石）
            8.5F,        // 挖掘速度(a little bit higher)
            3.4F,        // 攻击加成(a little bit higher)
            12,          // 附魔能力(a little bit higher)
            ItemTags.DIAMOND_TOOL_MATERIALS // 修复材料（钻石类）
    );
    //        TODO: Wait to change it
    public static final ToolMaterial PINK_DIAMOND_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL, // 挖掘限制（钻石级）
            1561,        // 耐久（钻石）
            8.5F,        // 挖掘速度(a little bit higher)
            3.4F,        // 攻击加成(a little bit higher)
            12,          // 附魔能力(a little bit higher)
            ItemTags.DIAMOND_TOOL_MATERIALS // 修复材料（钻石类）
    );
    public static final ToolMaterial RED_DIAMOND_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL, // 挖掘限制（钻石级）
            1561,        // 耐久（钻石）
            8.5F,        // 挖掘速度(a little bit higher)
            3.4F,        // 攻击加成(a little bit higher)
            12,          // 附魔能力(a little bit higher)
            ItemTags.DIAMOND_TOOL_MATERIALS // 修复材料（钻石类）
    );
    public static final ToolMaterial RAINBOW_DIAMOND_TOOL_MATERIAL = new ToolMaterial(
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
//    TODO: Wait to change
    public static final ToolMaterial SHEEN_OBSIDIAN_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            2100,
            8.8F,           // (a little bit higher than snowflake obsidian)
            2.8F,
            10,
            ItemTags.DIAMOND_TOOL_MATERIALS //Wait to change
    );
    public static final ToolMaterial GREEN_OBSIDIAN_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1680,      // low
            9.4F,      // fastest
            2.6F,      // low
            14,        // high
            ItemTags.DIAMOND_TOOL_MATERIALS //Wait to change
    );
//    Eyestone
//    TODO: Wait to change
    public static final ToolMaterial WHITE_EYESTONE_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1680,      // low
            9.4F,      // fastest
            2.6F,      // low
            14,        // high
            ItemTags.DIAMOND_TOOL_MATERIALS //Wait to change
    );
    //    TODO: Wait to change
    public static final ToolMaterial FLUORESCENT_EYESTONE_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1680,      // low
            9.4F,      // fastest
            2.6F,      // low
            14,        // high
            ItemTags.DIAMOND_TOOL_MATERIALS //Wait to change
    );



// TODO: add tooltip to all

//    Items
    // Foods
//    TODO: add texture
    public static final Item GREEN_APPLE = registerItem(
            "green_apple", settings -> new Item(settings
                    .food(ModFoodComponents.GREEN_APPLE)) {
            @Override
            public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                textConsumer.accept(Text.translatable("tooltip.ludwigsmysteriousworld.green_apple.tooltip"));
                super.appendTooltip(stack, context, displayComponent, textConsumer, type);
            }
        }
    );//done
    public static final Item IDUNNS_APPLE = registerItem(
            "idunns_apple", settings -> new Item(settings
                    .food(ModFoodComponents.IDUNNS_APPLE,
                            ModFoodComponents.IDUNNS_APPLE_EFFECT)) {
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    textConsumer.accept(Text.translatable("tooltip.ludwigsmysteriousworld.idunns_apple.tooltip"));
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                }
            }
    );//done
    public static final Item ENCHANTED_IDUNNS_APPLE = registerItem(
            "enchanted_idunns_apple", settings -> new Item(settings
                    .food(ModFoodComponents.ENCHANTED_IDUNNS_APPLE,
                            ModFoodComponents.ENCHANTED_IDUNNS_APPLE_EFFECT)) {
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    textConsumer.accept(Text.translatable("tooltip.ludwigsmysteriousworld.enchanted_idunns_apple.tooltip"));
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                }
            }
    );

    // INGREDIENTS
//        fuel
//    TODO: add texture, and more
    public static final Item HEART_CORE_FRAGMENT = registerItem(
            "heart_core_fragment", settings -> new Item(settings) {
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                }
            }
    );

//        Ore
    public static final Item WHITE_DIAMOND = registerItem(
            "white_diamond", Item::new
    );
    public static final Item RED_DIAMOND = registerItem(
            "red_diamond", Item::new
    );
    public static final Item PINK_DIAMOND = registerItem(
            "pink_diamond", Item::new
    );
    public static final Item RAINBOW_DIAMOND = registerItem(
            "rainbow_diamond", Item::new
    );
//                .registryKey(RegistryKey.of(
//                        RegistryKeys.ITEM,
//                        Identifier.of(LudwigsMysteriousWorld.MOD_ID, "white_diamond")
//                ))

    //      Ore or Stone Like
//    TODO: add texture
    public static final Item WHITE_EYESTONE_FRAGMENT = registerItem(
            "white_eyestone_fragment", Item::new
    );
//    TODO: add texture
    public static final Item FLUORESCENT_EYESTONE_FRAGMENT = registerItem(
            "fluorescent_eyestone_fragment", Item::new
    );

//    Crystal
//    TODO: add texture
    public static final Item SKY_BLUE_CRYSTAL = registerItem(
            "sky_blue_crystal", Item::new
    );

    // Tools
//    Diamond
//        White diamond
    public static final Item WHITE_DIAMOND_SWORD = registerItem(
            "white_diamond_sword", setting -> new Item(setting
                    .sword(WHITE_DIAMOND_TOOL_MATERIAL, 3.0F, -2.4F)
                    ) {
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                }
            });
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
//      Pink Diamond
//    TODO: Wait to change it
public static final Item PINK_DIAMOND_SWORD = registerItem(
        "pink_diamond_sword", setting -> new Item(setting
                .sword(PINK_DIAMOND_TOOL_MATERIAL, 3.0F, -2.4F)
        ) {
            @Override
            public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                super.appendTooltip(stack, context, displayComponent, textConsumer, type);
            }
        });
    public static final Item PINK_DIAMOND_AXE = registerItem(
            "pink_diamond_axe", setting -> new Item(setting
                    .axe(PINK_DIAMOND_TOOL_MATERIAL, 5.0F, -3.0F))
    );
    public static final Item PINK_DIAMOND_HOE = registerItem(
            "pink_diamond_hoe", setting -> new Item(setting
                    .hoe(PINK_DIAMOND_TOOL_MATERIAL, -3.0F, 0.0F))
    );
    public static final Item PINK_DIAMOND_PICKAXE = registerItem(
            "pink_diamond_pickaxe", setting -> new Item(setting
                    .pickaxe(PINK_DIAMOND_TOOL_MATERIAL, 1.0F, -2.8F))
    );
    public static final Item PINK_DIAMOND_SHOVEL = registerItem(
            "pink_diamond_shovel", setting -> new Item(setting
                    .shovel(PINK_DIAMOND_TOOL_MATERIAL, 1.5F, -3.0F))
    );
//      Red Diamond
public static final Item RED_DIAMOND_SWORD = registerItem(
        "red_diamond_sword", setting -> new Item(setting
                .sword(RED_DIAMOND_TOOL_MATERIAL, 3.0F, -2.4F)
        ) {
            @Override
            public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                super.appendTooltip(stack, context, displayComponent, textConsumer, type);
            }
        });
    public static final Item RED_DIAMOND_AXE = registerItem(
            "red_diamond_axe", setting -> new Item(setting
                    .axe(RED_DIAMOND_TOOL_MATERIAL, 5.0F, -3.0F))
    );
    public static final Item RED_DIAMOND_HOE = registerItem(
            "red_diamond_hoe", setting -> new Item(setting
                    .hoe(RED_DIAMOND_TOOL_MATERIAL, -3.0F, 0.0F))
    );
    public static final Item RED_DIAMOND_PICKAXE = registerItem(
            "red_diamond_pickaxe", setting -> new Item(setting
                    .pickaxe(RED_DIAMOND_TOOL_MATERIAL, 1.0F, -2.8F))
    );
    public static final Item RED_DIAMOND_SHOVEL = registerItem(
            "red_diamond_shovel", setting -> new Item(setting
                    .shovel(RED_DIAMOND_TOOL_MATERIAL, 1.5F, -3.0F))
    );
//      Rainbow Diamond
public static final Item RAINBOW_DIAMOND_SWORD = registerItem(
        "rainbow_diamond_sword", setting -> new Item(setting
                .sword(RAINBOW_DIAMOND_TOOL_MATERIAL, 3.0F, -2.4F)
        ) {
            @Override
            public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                super.appendTooltip(stack, context, displayComponent, textConsumer, type);
            }
        });
    public static final Item RAINBOW_DIAMOND_AXE = registerItem(
            "rainbow_diamond_axe", setting -> new Item(setting
                    .axe(RAINBOW_DIAMOND_TOOL_MATERIAL, 5.0F, -3.0F))
    );
    public static final Item RAINBOW_DIAMOND_HOE = registerItem(
            "rainbow_diamond_hoe", setting -> new Item(setting
                    .hoe(RAINBOW_DIAMOND_TOOL_MATERIAL, -3.0F, 0.0F))
    );
    public static final Item RAINBOW_DIAMOND_PICKAXE = registerItem(
            "rainbow_diamond_pickaxe", setting -> new Item(setting
                    .pickaxe(RAINBOW_DIAMOND_TOOL_MATERIAL, 1.0F, -2.8F))
    );
    public static final Item RAINBOW_DIAMOND_SHOVEL = registerItem(
            "rainbow_diamond_shovel", setting -> new Item(setting
                    .shovel(RAINBOW_DIAMOND_TOOL_MATERIAL, 1.5F, -3.0F))
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
//        TODO: texture
    public static final Item MAHOGANY_OBSIDIAN_SWORD = registerItem(
            "mahogany_obsidian_sword", setting -> new Item(setting
                    .sword(MAHOGANY_OBSIDIAN_TOOL_MATERIAL, 3.0F, -2.4F)
            ));//done
    public static final Item MAHOGANY_OBSIDIAN_AXE = registerItem(
            "mahogany_obsidian_axe", setting -> new Item(setting
                    .axe(MAHOGANY_OBSIDIAN_TOOL_MATERIAL, 5.0F, -3.0F)
            ));//done
    public static final Item MAHOGANY_OBSIDIAN_HOE = registerItem(
            "mahogany_obsidian_hoe", setting -> new Item(setting
                    .hoe(MAHOGANY_OBSIDIAN_TOOL_MATERIAL, -3.0F, 0.0F)
            ));
    public static final Item MAHOGANY_OBSIDIAN_PICKAXE = registerItem(
            "mahogany_obsidian_pickaxe", setting -> new Item(setting
                    .pickaxe(MAHOGANY_OBSIDIAN_TOOL_MATERIAL, 1.0F, -2.8F)
            ));//done
    public static final Item MAHOGANY_OBSIDIAN_SHOVEL = registerItem(
            "mahogany_obsidian_shovel", setting -> new Item(setting
                    .shovel(MAHOGANY_OBSIDIAN_TOOL_MATERIAL, 1.5F, -3.0F)
            ));//done

    // Green Obsidian
//        TODO: texture
    public static final Item GREEN_OBSIDIAN_SWORD = registerItem(
            "green_obsidian_sword", setting -> new Item(setting
                    .sword(GREEN_OBSIDIAN_TOOL_MATERIAL, 3.0F, -2.4F)
            ));
    public static final Item GREEN_OBSIDIAN_AXE = registerItem(
            "green_obsidian_axe", setting -> new Item(setting
                    .axe(GREEN_OBSIDIAN_TOOL_MATERIAL, 5.0F, -3.0F)
            ));
    public static final Item GREEN_OBSIDIAN_HOE = registerItem(
            "green_obsidian_hoe", setting -> new Item(setting
                    .hoe(GREEN_OBSIDIAN_TOOL_MATERIAL, -3.0F, 0.0F)
            ));
    public static final Item GREEN_OBSIDIAN_PICKAXE = registerItem(
            "green_obsidian_pickaxe", setting -> new Item(setting
                    .pickaxe(GREEN_OBSIDIAN_TOOL_MATERIAL, 1.0F, -2.8F)
            ));
    public static final Item GREEN_OBSIDIAN_SHOVEL = registerItem(
            "green_obsidian_shovel", setting -> new Item(setting
                    .shovel(GREEN_OBSIDIAN_TOOL_MATERIAL, 1.5F, -3.0F)
            ));

    // Sheen Obsidian
//        TODO: texture
    public static final Item SHEEN_OBSIDIAN_SWORD = registerItem(
            "sheen_obsidian_sword", setting -> new Item(setting
                    .sword(SHEEN_OBSIDIAN_TOOL_MATERIAL, 3.0F, -2.4F)
            ));
    public static final Item SHEEN_OBSIDIAN_AXE = registerItem(
            "sheen_obsidian_axe", setting -> new Item(setting
                    .axe(SHEEN_OBSIDIAN_TOOL_MATERIAL, 5.0F, -3.0F)
            ));
    public static final Item SHEEN_OBSIDIAN_HOE = registerItem(
            "sheen_obsidian_hoe", setting -> new Item(setting
                    .hoe(SHEEN_OBSIDIAN_TOOL_MATERIAL, -3.0F, 0.0F)
            ));
    public static final Item SHEEN_OBSIDIAN_PICKAXE = registerItem(
            "sheen_obsidian_pickaxe", setting -> new Item(setting
                    .pickaxe(SHEEN_OBSIDIAN_TOOL_MATERIAL, 1.0F, -2.8F)
            ));
    public static final Item SHEEN_OBSIDIAN_SHOVEL = registerItem(
            "sheen_obsidian_shovel", setting -> new Item(setting
                    .shovel(SHEEN_OBSIDIAN_TOOL_MATERIAL, 1.5F, -3.0F)
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
    public static final Item GOLDEN_LEAF = registerItem(
            "golden_leaf", GoldenLeafItem::new
    );
//    TODO: add texture and lang
    public static final Item WHITE_CRYSTAL = registerItem(
            "white_crystal", WhiteCrystalItem::new
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
