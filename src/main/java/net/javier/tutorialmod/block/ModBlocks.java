package net.javier.tutorialmod.block;

import net.javier.tutorialmod.TutorialMod;
import net.javier.tutorialmod.block.custom.CornCropBlock;
import net.javier.tutorialmod.block.custom.SoundBlock;
import net.javier.tutorialmod.block.custom.TomatoCropBlock;
import net.javier.tutorialmod.sound.ModSounds;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.STONE).strength(2f)));

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(4f)));

    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.NETHERRACK).strength(1.5f)));

    public static final Block END_STONE_RUBY_ORE = registerBlock("end_stone_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 7), AbstractBlock.Settings.copy(Blocks.END_STONE).strength(4f)));

    public static Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(ModSounds.SOUND_BLOCK_SOUNDS)));

    public static Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new StairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(),AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static Block RUBY_BUTTON = registerBlock("ruby_button",
            new ButtonBlock( BlockSetType.IRON, 10, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static Block RUBY_FENCE = registerBlock("ruby_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static Block RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static Block RUBY_WALL = registerBlock("ruby_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static Block RUBY_DOOR = registerBlock("ruby_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque()));

    public static Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque()));

    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

    public static final Block CORN_CROP = Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, "corn_crop"),
            new CornCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

    public static Block DAHLIA = registerBlock("dahlia",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 10, AbstractBlock.Settings.copy(Blocks.ALLIUM).nonOpaque().noCollision()));

    public static final Block POTTED_DAHLIA = Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, "potted_dahlia"),
            new FlowerPotBlock(DAHLIA, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(TutorialMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks for " + TutorialMod.MOD_ID);
    }
}
