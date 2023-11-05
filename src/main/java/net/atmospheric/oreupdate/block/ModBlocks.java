package net.atmospheric.oreupdate.block;

import net.atmospheric.oreupdate.block.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.atmospheric.oreupdate.OreUpdateMod;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {


    //quartzito
    public static final Block QUARTZITO = registerBlock("quartzito",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block QUARTZITO_STAIRS = registerBlock("quartzito_stairs",
            new ModStairsBlock(ModBlocks.QUARTZITO.getDefaultState(),
                    FabricBlockSettings.of().strength(1.5f).requiresTool()));
    public static final Block QUARTZITO_SLAB = registerBlock("quartzito_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block QUARTZITO_WALL = registerBlock("quartzito_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));


    //quartzito polido
    public static final Block POLISHED_QUARTZITO = registerBlock("polished_quartzito",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block POLISHED_QUARTZITO_STAIRS = registerBlock("polished_quartzito_stairs",
            new ModStairsBlock(ModBlocks.QUARTZITO.getDefaultState(),
                    FabricBlockSettings.of().strength(1.5f).requiresTool()));
    public static final Block POLISHED_QUARTZITO_SLAB = registerBlock("polished_quartzito_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block POLISHED_QUARTZITO_WALL = registerBlock("polished_quartzito_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));


    //marmore
    public static final Block MARMORE = registerBlock("marmore",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block MARMORE_STAIRS = registerBlock("marmore_stairs",
            new ModStairsBlock(ModBlocks.QUARTZITO.getDefaultState(),
                    FabricBlockSettings.of().strength(1.5f).requiresTool()));
    public static final Block MARMORE_SLAB = registerBlock("marmore_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block MARMORE_WALL = registerBlock("marmore_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));


    //marmore polido
    public static final Block POLISHED_MARMORE = registerBlock("polished_marmore",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block POLISHED_MARMORE_STAIRS = registerBlock("polished_marmore_stairs",
            new ModStairsBlock(ModBlocks.QUARTZITO.getDefaultState(),
                    FabricBlockSettings.of().strength(1.5f).requiresTool()));
    public static final Block POLISHED_MARMORE_SLAB = registerBlock("polished_marmore_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block POLISHED_MARMORE_WALL = registerBlock("polished_marmore_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));


    //olivina
    public static final Block OLIVINA = registerBlock("olivina",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block OLIVINA_STAIRS = registerBlock("olivina_stairs",
            new ModStairsBlock(ModBlocks.QUARTZITO.getDefaultState(),
                    FabricBlockSettings.of().strength(1.5f).requiresTool()));
    public static final Block OLIVINA_SLAB = registerBlock("olivina_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block OLIVINA_WALL = registerBlock("olivina_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));


    //olivina polida
    public static final Block POLISHED_OLIVINA = registerBlock("polished_olivina",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block POLISHED_OLIVINA_STAIRS = registerBlock("polished_olivina_stairs",
            new ModStairsBlock(ModBlocks.QUARTZITO.getDefaultState(),
                    FabricBlockSettings.of().strength(1.5f).requiresTool()));
    public static final Block POLISHED_OLIVINA_SLAB = registerBlock("polished_olivina_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block POLISHED_OLIVINA_WALL = registerBlock("polished_olivina_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));


    //bismita
    public static final Block BISMITA = registerBlock("bismita",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block BISMITA_STAIRS = registerBlock("bismita_stairs",
            new ModStairsBlock(ModBlocks.QUARTZITO.getDefaultState(),
                    FabricBlockSettings.of().strength(1.5f).requiresTool()));
    public static final Block BISMITA_SLAB = registerBlock("bismita_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block BISMITA_WALL = registerBlock("bismita_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));


    //bismita polida
    public static final Block POLISHED_BISMITA = registerBlock("polished_bismita",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block POLISHED_BISMITA_STAIRS = registerBlock("polished_bismita_stairs",
            new ModStairsBlock(ModBlocks.QUARTZITO.getDefaultState(),
                    FabricBlockSettings.of().strength(1.5f).requiresTool()));
    public static final Block POLISHED_BISMITA_SLAB = registerBlock("polished_bismita_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block POLISHED_BISMITA_WALL = registerBlock("polished_bismita_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));


    //azurita
    public static final Block AZURITA = registerBlock("azurita",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block AZURITA_STAIRS = registerBlock("azurita_stairs",
            new ModStairsBlock(ModBlocks.QUARTZITO.getDefaultState(),
                    FabricBlockSettings.of().strength(1.5f).requiresTool()));
    public static final Block AZURITA_SLAB = registerBlock("azurita_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block AZURITA_WALL = registerBlock("azurita_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));


    //azurita polida
    public static final Block POLISHED_AZURITA = registerBlock("polished_azurita",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block POLISHED_AZURITA_STAIRS = registerBlock("polished_azurita_stairs",
            new ModStairsBlock(ModBlocks.QUARTZITO.getDefaultState(),
                    FabricBlockSettings.of().strength(1.5f).requiresTool()));
    public static final Block POLISHED_AZURITA_SLAB = registerBlock("polished_azurita_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));
    public static final Block POLISHED_AZURITA_WALL = registerBlock("polished_azurita_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool()));



    //estanho
    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).sounds(BlockSoundGroup.STONE).strength(3f).requiresTool()));
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).sounds(BlockSoundGroup.METAL).strength(3f).requiresTool()));
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK).sounds(BlockSoundGroup.METAL).strength(5f).requiresTool()));

    //bronze
    public static final Block CUT_BRONZE_BLOCK = registerBlock("cut_bronze_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.STONE).strength(4f).requiresTool()));
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).strength(4f).requiresTool()));
    public static final Block CUT_BRONZE_STAIRS = registerBlock("cut_bronze_stairs",
            new ModStairsBlock(Blocks.CUT_COPPER_STAIRS.getDefaultState(),
                    FabricBlockSettings.of().strength(3f).requiresTool()));
    public static final Block CUT_BRONZE_SLAB = registerBlock("cut_bronze_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.COPPER).strength(3f).requiresTool()));

    public static final Block BRONZE_ANVIL_BLOCK = registerBlock("bronze_anvil_block",
            new BronzeAnvilBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    //ruby
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block BUDDING_RUBY = registerBlock("budding_ruby",
            new BuddingRubyBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.5f).requiresTool().ticksRandomly()));
    public static final Block RUBY_CLUSTER = registerBlock("ruby_cluster",
            new RubyClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.RED).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY).requiresTool()));
    public static final Block SMALL_RUBY_BUD = registerBlock("small_ruby_bud",
            new RubyClusterBlock(3, 4, AbstractBlock.Settings.create().mapColor(MapColor.RED).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MEDIUM_RUBY_BUD = registerBlock("medium_ruby_bud",
            new RubyClusterBlock(4, 3, AbstractBlock.Settings.create().mapColor(MapColor.RED).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LARGE_RUBY_BUD = registerBlock("large_ruby_bud",
            new RubyClusterBlock(5, 3, AbstractBlock.Settings.create().mapColor(MapColor.RED).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));

    //jade
    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block BUDDING_JADE = registerBlock("budding_jade",
            new BuddingJadeBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.5f).requiresTool().ticksRandomly()));
    public static final Block JADE_CLUSTER = registerBlock("jade_cluster",
            new JadeClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.GREEN).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY).requiresTool()));
    public static final Block SMALL_JADE_BUD = registerBlock("small_jade_bud",
            new JadeClusterBlock(3, 4, AbstractBlock.Settings.create().mapColor(MapColor.GREEN).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MEDIUM_JADE_BUD = registerBlock("medium_jade_bud",
            new JadeClusterBlock(4, 3, AbstractBlock.Settings.create().mapColor(MapColor.GREEN).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LARGE_JADE_BUD = registerBlock("large_jade_bud",
            new JadeClusterBlock(5, 3, AbstractBlock.Settings.create().mapColor(MapColor.GREEN).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));

    //safira
    public static final Block SAFIRA_BLOCK = registerBlock("safira_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block BUDDING_SAFIRA = registerBlock("budding_safira",
            new BuddingSafiraBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.5f).requiresTool().ticksRandomly()));
    public static final Block SAFIRA_CLUSTER = registerBlock("safira_cluster",
            new SafiraClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.BLUE).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY).requiresTool()));
    public static final Block SMALL_SAFIRA_BUD = registerBlock("small_safira_bud",
            new SafiraClusterBlock(3, 4, AbstractBlock.Settings.create().mapColor(MapColor.BLUE).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MEDIUM_SAFIRA_BUD = registerBlock("medium_safira_bud",
            new SafiraClusterBlock(4, 3, AbstractBlock.Settings.create().mapColor(MapColor.BLUE).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LARGE_SAFIRA_BUD = registerBlock("large_safira_bud",
            new SafiraClusterBlock(5, 3, AbstractBlock.Settings.create().mapColor(MapColor.BLUE).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));

    //pirita
    public static final Block PIRITA_BLOCK = registerBlock("pirita_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.5f).requiresTool()));
    public static final Block BUDDING_PIRITA = registerBlock("budding_pirita",
            new BuddingPiritaBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.5f).requiresTool().ticksRandomly()));
    public static final Block PIRITA_CLUSTER = registerBlock("pirita_cluster",
            new PiritaClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.GRAY).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY).requiresTool()));
    public static final Block SMALL_PIRITA_BUD = registerBlock("small_pirita_bud",
            new PiritaClusterBlock(3, 4, AbstractBlock.Settings.create().mapColor(MapColor.GRAY).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MEDIUM_PIRITA_BUD = registerBlock("medium_pirita_bud",
            new PiritaClusterBlock(4, 3, AbstractBlock.Settings.create().mapColor(MapColor.GRAY).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LARGE_PIRITA_BUD = registerBlock("large_pirita_bud",
            new PiritaClusterBlock(5, 3, AbstractBlock.Settings.create().mapColor(MapColor.GRAY).solid().nonOpaque().
                    ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));

    //sulphur

    public static final Block SULPHUR_ORE = registerBlock("sulphur_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE).mapColor(MapColor.DARK_RED).
                    requiresTool().strength(3.0f, 3.0f).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    //miner villager
    public static final Block MINER_BLOCK = registerBlock("miner_block",
            new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD).sounds(BlockSoundGroup.WOOD).strength(2f).requiresTool()));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OreUpdateMod.mod_id, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OreUpdateMod.mod_id, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        OreUpdateMod.LOGGER.info("Registering ModBlocks for " + OreUpdateMod.mod_id);
    }
}