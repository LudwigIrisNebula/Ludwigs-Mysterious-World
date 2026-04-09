package io.github.ludwigirisnebula.ludwigsmysteriousworld;

import io.github.ludwigirisnebula.ludwigsmysteriousworld.block.ModBlocks;
import io.github.ludwigirisnebula.ludwigsmysteriousworld.item.ModItemGroups;
import io.github.ludwigirisnebula.ludwigsmysteriousworld.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LudwigsMysteriousWorld implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "ludwigs-mysterious-world";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


//		fuel
		FuelRegistryEvents.BUILD.register((builder, context) -> {
			builder.add(ModItems.HEART_CORE_FRAGMENT, 70230);
		});
	}
}