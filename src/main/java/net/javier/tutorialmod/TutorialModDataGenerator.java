package net.javier.tutorialmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.javier.tutorialmod.datagen.ModBlockTagProvider;
import net.javier.tutorialmod.datagen.ModItemTagProvider;
import net.javier.tutorialmod.datagen.ModLootTableProvider;
import net.javier.tutorialmod.datagen.ModModelProvider;
import net.javier.tutorialmod.datagen.ModRecipeProvider;

public class TutorialModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
