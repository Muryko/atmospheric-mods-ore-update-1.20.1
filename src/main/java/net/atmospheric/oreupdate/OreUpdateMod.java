package net.atmospheric.oreupdate;

import com.mojang.datafixers.util.Pair;
import net.atmospheric.oreupdate.block.entity.ModBlockEntities;
import net.atmospheric.oreupdate.item.ModItems;
import net.atmospheric.oreupdate.item.ModItemGroups;
import net.atmospheric.oreupdate.block.ModBlocks;
import net.atmospheric.oreupdate.mixin.CustomToolMaterialsMixin;
import net.atmospheric.oreupdate.mixin.accessors.StructurePoolAccessorMixin;
import net.atmospheric.oreupdate.util.ModCustomTrades;
import net.atmospheric.oreupdate.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.MinecraftServer;
import net.minecraft.structure.pool.SinglePoolElement;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.processor.StructureProcessorList;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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
		ModCustomTrades.registerCustomTrades();
		initConfiguration();
		ModBlockEntities.registerBlockEntities();
		}
	protected void initConfiguration() {
		{
			List<Pair<String, Integer>> compostPileList = List.of(
					Pair.of("plains", 10),
					Pair.of("savanna", 10),
					Pair.of("snowy", 10),
					Pair.of("taiga", 10),
					Pair.of("desert", 8));
			ServerLifecycleEvents.SERVER_STARTING.register(server -> compostPileList.forEach(villageType -> {
				LOGGER.info("Registering compost heaps in village type of {}", villageType.getFirst());
				Identifier miner_house = new Identifier(OreUpdateMod.mod_id, "village/houses/" + villageType.getFirst() + "_miner_house");
				Identifier villageHousePoolId = new Identifier("minecraft:village/" + villageType.getFirst() + "/houses");
				addToStructurePool(server, villageHousePoolId, miner_house, villageType.getSecond());
			}));
		}
	}
	protected void addToStructurePool(MinecraftServer server, Identifier poolIdentifier, Identifier nbtIdentifier, int weight) {
		RegistryEntry.Reference<StructureProcessorList> emptyProcessorList = server.getRegistryManager().get(RegistryKeys.PROCESSOR_LIST)
				.entryOf(RegistryKey.of(RegistryKeys.PROCESSOR_LIST, new Identifier("minecraft", "empty")));

		server.getRegistryManager().get(RegistryKeys.TEMPLATE_POOL).getOrEmpty(poolIdentifier)
				.ifPresentOrElse(structurePool -> {
					SinglePoolElement miner_house = StructurePoolElement.ofProcessedSingle(nbtIdentifier.toString(), emptyProcessorList)
							.apply(StructurePool.Projection.RIGID);
					List<Pair<StructurePoolElement, Integer>> elementCounts = new ArrayList<>(((StructurePoolAccessorMixin) structurePool).getElementCounts());
					elementCounts.add(Pair.of(miner_house, weight));
					((StructurePoolAccessorMixin) structurePool).setElementCounts(elementCounts);

					IntStream.range(0, weight).forEach(value -> ((StructurePoolAccessorMixin) structurePool).getElements().add(miner_house));
				}, () -> LOGGER.warn("No structure pool found for {}, no compost heaps will be added on it.", poolIdentifier));

	}

}

