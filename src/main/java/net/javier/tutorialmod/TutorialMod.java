package net.javier.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.javier.tutorialmod.block.ModBlocks;
import net.javier.tutorialmod.item.ModArmorMaterials;
import net.javier.tutorialmod.item.ModItemGroups;
import net.javier.tutorialmod.item.ModItems;
import net.javier.tutorialmod.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModArmorMaterials.initialize();
		ModLootTableModifiers.modifyLootTables();
		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
	}
}