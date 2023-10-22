package net.atmospheric.oreupdate.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.atmospheric.oreupdate.villager.ModVillagers;
import net.atmospheric.oreupdate.block.ModBlocks;
import net.atmospheric.oreupdate.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MINER_VILLAGER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModBlocks.QUARTZITO, 4),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModBlocks.OLIVINA, 4),
                            2, 7, 0.075f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModBlocks.MARMORE, 4),
                            6, 5, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MINER_VILLAGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModBlocks.BISMITA, 4),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModBlocks.AZURITA, 4),
                            2, 7, 0.075f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MINER_VILLAGER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModBlocks.RUBY_BLOCK, 2),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModBlocks.JADE_BLOCK, 2),
                            2, 7, 0.075f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModBlocks.SAFIRA_BLOCK, 2),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModBlocks.PIRITA_BLOCK, 2),
                            2, 7, 0.075f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MINER_VILLAGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(ModItems.BRONZE_HELMET, 1),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 9),
                            new ItemStack(ModItems.BRONZE_CHESTPLATE, 1),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(ModItems.BRONZE_LEGGINGS, 1),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.BRONZE_BOOTS, 1),
                            6, 5, 0.05f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MINER_VILLAGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.BRONZE_SWORD, 1),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.BRONZE_PICKAXE, 1),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.BRONZE_AXE, 1),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.BRONZE_SHOVEL, 1),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.BRONZE_HOE, 1),
                            6, 5, 0.05f));
                });
    }
}
