package net.atmospheric.oreupdate.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.atmospheric.oreupdate.OreUpdateMod;
import net.atmospheric.oreupdate.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<BronzeAnvilBlockEntity> BRONZE_ANVIL_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(OreUpdateMod.mod_id, "bronze_anvil_block_be"),
                    FabricBlockEntityTypeBuilder.create(BronzeAnvilBlockEntity::new,
                            ModBlocks.BRONZE_ANVIL).build());

    public static void registerBlockEntities() {
        OreUpdateMod.LOGGER.info("Registering Block Entities for " + OreUpdateMod.mod_id);
    }
}