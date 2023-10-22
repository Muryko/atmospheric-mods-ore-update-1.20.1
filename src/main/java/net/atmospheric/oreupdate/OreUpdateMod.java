package net.atmospheric.oreupdate;

import net.atmospheric.oreupdate.item.ModItems;
import net.atmospheric.oreupdate.item.ModItemGroups;
import net.atmospheric.oreupdate.block.ModBlocks;
import net.atmospheric.oreupdate.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.world.biome.BiomeKeys.*;

public class OreUpdateMod implements ModInitializer {
	public static final String mod_id = "oreupdate";
    public static final Logger LOGGER = LoggerFactory.getLogger(mod_id);

	//public static final Logger LOGGER...

	public static final RegistryKey<PlacedFeature> QUARTZITO_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("oreupdate","quartzito"));
	public static final RegistryKey<PlacedFeature> MARMORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("oreupdate","marmore"));
	public static final RegistryKey<PlacedFeature> OLIVINA_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("oreupdate","olivina"));
	public static final RegistryKey<PlacedFeature> BISMITA_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("oreupdate","bismita"));
	public static final RegistryKey<PlacedFeature> SULPHUR_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("oreupdate","sulphur_ore"));
	public static final RegistryKey<PlacedFeature> AZURITA_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("oreupdate","azurita"));
	public static final RegistryKey<PlacedFeature> TIN_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("oreupdate","tin_ore"));
	public static final RegistryKey<PlacedFeature> RUBY_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("oreupdate","ruby_geode"));
	public static final RegistryKey<PlacedFeature> JADE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("oreupdate","jade_geode"));
	public static final RegistryKey<PlacedFeature> SAFIRA_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("oreupdate","safira_geode"));
	public static final RegistryKey<PlacedFeature> PIRITA_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("oreupdate","pirita_geode"));

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, QUARTZITO_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RUBY_PLACED_KEY);
		
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, JADE_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, SAFIRA_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, PIRITA_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, MARMORE_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BAMBOO_JUNGLE, JUNGLE, SPARSE_JUNGLE), GenerationStep.Feature.UNDERGROUND_ORES, TIN_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, OLIVINA_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OCEAN, DEEP_COLD_OCEAN, DEEP_OCEAN, DEEP_FROZEN_OCEAN, LUKEWARM_OCEAN, DEEP_LUKEWARM_OCEAN, WARM_OCEAN, COLD_OCEAN, FROZEN_OCEAN),
				GenerationStep.Feature.UNDERGROUND_ORES, AZURITA_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BASALT_DELTAS), GenerationStep.Feature.UNDERGROUND_ORES, BISMITA_PLACED_KEY);

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.NETHER_WASTES, BASALT_DELTAS, CRIMSON_FOREST, WARPED_FOREST, SOUL_SAND_VALLEY), GenerationStep.Feature.UNDERGROUND_ORES, SULPHUR_PLACED_KEY);

		ModVillagers.registerVillagers();


	}
}

