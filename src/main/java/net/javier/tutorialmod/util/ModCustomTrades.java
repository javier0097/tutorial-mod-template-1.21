package net.javier.tutorialmod.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.javier.tutorialmod.block.ModBlocks;
import net.javier.tutorialmod.item.ModItems;
import net.javier.tutorialmod.villager.ModVillagers;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

import java.util.Optional;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 2),
                            new ItemStack(ModItems.TOMATO, 7),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 7),
                            new ItemStack(ModItems.TOMATO_SEEDS, 1),
                            2, 7, 0.075f
                    ));

                }
        );

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.GOLD_INGOT, 16),
                            Optional.of(new TradedItem(Items.DIAMOND, 12)),
                            new ItemStack(ModItems.CORN_SEEDS, 1),
                            2, 7, 0.075f
                    ));
                }
        );

//        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1,
//                factories -> {
//                    factories.add((entity, random) -> new TradeOffer(
//                            new TradedItem(ModItems.RUBY, 32),
//                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PIERCING, 2)),
//                            3, 12, 0.075f
//                    ));
//                }
//
//        );
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModItems.CORN, 32),
                            new ItemStack(ModBlocks.SOUND_BLOCK, 2),
                            3, 12, 0.075f
                    ));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModItems.RUBY_SWORD, 1),
                            new ItemStack(ModItems.RUBY_HELMET, 1),
                            2, 12, 0.075f
                    ));
                }
        );

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModItems.RAW_RUBY, 16),
                            new ItemStack(ModItems.METAL_DETECTOR, 1),
                            3, 12, 0.075f
                    ));
                }
        );

        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModItems.RAW_RUBY, 1),
                            new ItemStack(ModItems.COAL_BRIQUETTE, 1),
                            3, 12, 0.075f
                    ));
                }
        );
    }
}
