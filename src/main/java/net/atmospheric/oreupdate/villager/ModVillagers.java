package net.atmospheric.oreupdate.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.atmospheric.oreupdate.OreUpdateMod;
import net.atmospheric.oreupdate.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
    public static final RegistryKey<PointOfInterestType> MINER_POI_KEY = poiKey("minerpoi");
    public static final PointOfInterestType MINER_POI = registerPoi("minerpoi", ModBlocks.MINER_BLOCK);

    public static final VillagerProfession MINER_VILLAGER = registerProfession("miner_villager", MINER_POI_KEY);


    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(OreUpdateMod.mod_id, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD));
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(OreUpdateMod.mod_id, name), 1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> poiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(OreUpdateMod.mod_id, name));
    }

    public static void registerVillagers() {
        OreUpdateMod.LOGGER.info("Registering Villagers " + OreUpdateMod.mod_id);
    }
}
