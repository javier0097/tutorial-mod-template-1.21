package net.javier.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.javier.tutorialmod.TutorialMod;
import net.javier.tutorialmod.item.custom.MetalDetectorItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems{
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new Item.Settings().maxDamage(64)));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.TOMATO)));
    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette", new Item(new Item.Settings()));
    public static final Item RUBY_STAFF = registerItem("ruby_staff",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY, 2F, 2F))));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY, 3F, 1F))));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY, 0, 0))));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY, 5F, 3F))));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY, 0, 0))));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
