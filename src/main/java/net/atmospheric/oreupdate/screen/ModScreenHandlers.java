package net.atmospheric.oreupdate.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.atmospheric.oreupdate.OreUpdateMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<BronzeAnvilBlockScreenHandler> BRONZE_ANVIL_BLOCK_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(OreUpdateMod.mod_id, "bronze_anvil_block"),
                    new ExtendedScreenHandlerType<>(BronzeAnvilBlockScreenHandler::new));

    public static void registerScreenHandlers() {
        OreUpdateMod.LOGGER.info("Registering Screen Handlers for " + OreUpdateMod.mod_id);
    }
}