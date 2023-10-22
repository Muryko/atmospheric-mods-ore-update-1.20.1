package net.atmospheric.oreupdate.item;

import net.atmospheric.oreupdate.OreUpdateMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.atmospheric.oreupdate.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup OREUPDATE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OreUpdateMod.mod_id, "oreupdate"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.oreupdate"))
                    .icon(() -> new ItemStack(Items.DIAMOND)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.QUARTZITO);
                        entries.add(ModBlocks.QUARTZITO_STAIRS);
                        entries.add(ModBlocks.QUARTZITO_WALL);
                        entries.add(ModBlocks.QUARTZITO_SLAB);


                        entries.add(ModBlocks.POLISHED_QUARTZITO);
                        entries.add(ModBlocks.POLISHED_QUARTZITO_STAIRS);
                        entries.add(ModBlocks.POLISHED_QUARTZITO_WALL);
                        entries.add(ModBlocks.POLISHED_QUARTZITO_SLAB);

                        entries.add(ModBlocks.MARMORE);
                        entries.add(ModBlocks.MARMORE_STAIRS);
                        entries.add(ModBlocks.MARMORE_WALL);
                        entries.add(ModBlocks.MARMORE_SLAB);

                        entries.add(ModBlocks.POLISHED_MARMORE);
                        entries.add(ModBlocks.POLISHED_MARMORE_STAIRS);
                        entries.add(ModBlocks.POLISHED_MARMORE_WALL);
                        entries.add(ModBlocks.POLISHED_MARMORE_SLAB);

                        entries.add(ModBlocks.OLIVINA);
                        entries.add(ModBlocks.OLIVINA_STAIRS);
                        entries.add(ModBlocks.OLIVINA_WALL);
                        entries.add(ModBlocks.OLIVINA_SLAB);

                        entries.add(ModBlocks.POLISHED_OLIVINA);
                        entries.add(ModBlocks.POLISHED_OLIVINA_STAIRS);
                        entries.add(ModBlocks.POLISHED_OLIVINA_WALL);
                        entries.add(ModBlocks.POLISHED_OLIVINA_SLAB);

                        entries.add(ModBlocks.BISMITA);
                        entries.add(ModBlocks.BISMITA_STAIRS);
                        entries.add(ModBlocks.BISMITA_WALL);
                        entries.add(ModBlocks.BISMITA_SLAB);

                        entries.add(ModBlocks.POLISHED_BISMITA);
                        entries.add(ModBlocks.POLISHED_BISMITA_STAIRS);
                        entries.add(ModBlocks.POLISHED_BISMITA_WALL);
                        entries.add(ModBlocks.POLISHED_BISMITA_SLAB);

                        entries.add(ModBlocks.AZURITA);
                        entries.add(ModBlocks.AZURITA_STAIRS);
                        entries.add(ModBlocks.AZURITA_WALL);
                        entries.add(ModBlocks.AZURITA_SLAB);

                        entries.add(ModBlocks.POLISHED_AZURITA);
                        entries.add(ModBlocks.POLISHED_AZURITA_STAIRS);
                        entries.add(ModBlocks.POLISHED_AZURITA_WALL);
                        entries.add(ModBlocks.POLISHED_AZURITA_SLAB);

                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.TIN_NUGGET);
                        entries.add(ModItems.TIN_HELMET);
                        entries.add(ModItems.TIN_CHESTPLATE);
                        entries.add(ModItems.TIN_LEGGINGS);
                        entries.add(ModItems.TIN_BOOTS);
                        entries.add(ModItems.TIN_SWORD);
                        entries.add(ModItems.TIN_PICKAXE);
                        entries.add(ModItems.TIN_AXE);
                        entries.add(ModItems.TIN_SHOVEL);
                        entries.add(ModItems.TIN_HOE);

                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.COPPER_NUGGET);

                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModItems.BRONZE_NUGGET);
                        entries.add(ModBlocks.BRONZE_BLOCK);
                        entries.add(ModBlocks.CUT_BRONZE_BLOCK);
                        entries.add(ModBlocks.CUT_BRONZE_SLAB);
                        entries.add(ModBlocks.CUT_BRONZE_STAIRS);
                        entries.add(ModItems.BRONZE_HELMET);
                        entries.add(ModItems.BRONZE_CHESTPLATE);
                        entries.add(ModItems.BRONZE_LEGGINGS);
                        entries.add(ModItems.BRONZE_BOOTS);
                        entries.add(ModItems.BRONZE_SWORD);
                        entries.add(ModItems.BRONZE_PICKAXE);
                        entries.add(ModItems.BRONZE_AXE);
                        entries.add(ModItems.BRONZE_SHOVEL);
                        entries.add(ModItems.BRONZE_HOE);

                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.BUDDING_RUBY);
                        entries.add(ModBlocks.RUBY_CLUSTER);
                        entries.add(ModBlocks.LARGE_RUBY_BUD);
                        entries.add(ModBlocks.MEDIUM_RUBY_BUD);
                        entries.add(ModBlocks.SMALL_RUBY_BUD);

                        entries.add(ModItems.JADE);
                        entries.add(ModBlocks.JADE_BLOCK);
                        entries.add(ModBlocks.BUDDING_JADE);
                        entries.add(ModBlocks.JADE_CLUSTER);
                        entries.add(ModBlocks.LARGE_JADE_BUD);
                        entries.add(ModBlocks.MEDIUM_JADE_BUD);
                        entries.add(ModBlocks.SMALL_JADE_BUD);

                        entries.add(ModItems.SAFIRA);
                        entries.add(ModBlocks.SAFIRA_BLOCK);
                        entries.add(ModBlocks.BUDDING_SAFIRA);
                        entries.add(ModBlocks.SAFIRA_CLUSTER);
                        entries.add(ModBlocks.LARGE_SAFIRA_BUD);
                        entries.add(ModBlocks.MEDIUM_SAFIRA_BUD);
                        entries.add(ModBlocks.SMALL_SAFIRA_BUD);

                        entries.add(ModItems.PIRITA);
                        entries.add(ModBlocks.PIRITA_BLOCK);
                        entries.add(ModBlocks.BUDDING_PIRITA);
                        entries.add(ModBlocks.PIRITA_CLUSTER);
                        entries.add(ModBlocks.LARGE_PIRITA_BUD);
                        entries.add(ModBlocks.MEDIUM_PIRITA_BUD);
                        entries.add(ModBlocks.SMALL_PIRITA_BUD);


                        entries.add(ModBlocks.SULPHUR_ORE);

                    }).build());


    public static void registerItemGroups() {
        OreUpdateMod.LOGGER.info("Registering Item Groups for " + OreUpdateMod.mod_id);
    }
}
