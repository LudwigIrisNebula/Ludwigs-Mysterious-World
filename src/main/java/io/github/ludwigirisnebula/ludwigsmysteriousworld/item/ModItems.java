package io.github.ludwigirisnebula.ludwigsmysteriousworld.item;

import io.github.ludwigirisnebula.ludwigsmysteriousworld.LudwigsMysteriousWorld;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

//    Items
    // Special Items
    public static final Item LUDWIGS_IRIS_PICTURE = registerItem(
            "ludwigs_iris_picture", new Item(new Item.Settings()
                .registryKey(RegistryKey.of(
                        RegistryKeys.ITEM,
                        Identifier.of(LudwigsMysteriousWorld.MOD_ID, "ludwigs_iris_picture")))
        ));

//    public static final Item LUDWIGS_IRIS_PICTURE = registerItem(
//            "ludwigs_iris_picture", new Item(new Item.Settings()));
//  --Original--



//    Main register

    private static Item registerItem(String name, Item item){
//        --Test--(and worked)
//        Identifier id = Identifier.of(LudwigsMysteriousWorld.MOD_ID, name);
//        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
//        Item.Settings settings = new Item.Settings().registryKey(key);
//        return Registry.register(
//                Registries.ITEM,
//                key,
//                item
//        );
        //        --Original--
        return Registry.register(
                Registries.ITEM,
                Identifier.of(LudwigsMysteriousWorld.MOD_ID, name), item);

    }

    public static void registerModItems(){
        LudwigsMysteriousWorld.LOGGER.info(
                "Registering Mod Items for " + LudwigsMysteriousWorld.MOD_ID);

        //    Add to item group (wait to create my own item group)
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(entries -> {
            entries.add(LUDWIGS_IRIS_PICTURE);
        });
    }
}
