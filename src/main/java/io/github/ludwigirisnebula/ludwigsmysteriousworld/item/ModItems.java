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

public class ModItems {
    //    Tool Material
    public static final ToolMaterial BIRCH_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL, // 挖掘限制
            59,          // 耐久（木）
            2.0F,        // 挖掘速度
            0.0F,        // 攻击加成
            15,          // 附魔能力
            ItemTags.PLANKS// 修复材料
    );

//    Items
    // INGREDIENTS
    public static final Item WHITE_DIAMOND = registerItem(
            "white_diamond", new Item.Settings()
);
//                .registryKey(RegistryKey.of(
//                        RegistryKeys.ITEM,
//                        Identifier.of(LudwigsMysteriousWorld.MOD_ID, "white_diamond")
//                ))

    // Sword
    public static final Item BIRCH_SWORD = registerItem(
        "birch_sword",new Item.Settings()
                .sword(BIRCH_TOOL_MATERIAL,3,-2.4F));
//                .registryKey(RegistryKey.of(
//                        RegistryKeys.ITEM,
//                        Identifier.of(LudwigsMysteriousWorld.MOD_ID, "birch_sword")))
//        ));


    // Special Items
    public static final Item LUDWIGS_IRIS_PICTURE = registerItem(
            "ludwigs_iris_picture", new Item.Settings()
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
    private static Item registerItem(String name, Item.Settings itemSettings){
//        --Test 2--
        RegistryKey<Item>key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LudwigsMysteriousWorld.MOD_ID, name));
        Item item = new Item(itemSettings.registryKey(key));
        return Registry.register(Registries.ITEM, key, item);
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
    }

    public static void registerModItems(){
        LudwigsMysteriousWorld.LOGGER.info(
                "Registering Mod Items for " + LudwigsMysteriousWorld.MOD_ID);

        //    Add to item group (wait to create my own item group)
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(entries -> {
            entries.add(LUDWIGS_IRIS_PICTURE);
            entries.add(WHITE_DIAMOND);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register(entries -> {
            entries.add(BIRCH_SWORD);
        });
    }
}
