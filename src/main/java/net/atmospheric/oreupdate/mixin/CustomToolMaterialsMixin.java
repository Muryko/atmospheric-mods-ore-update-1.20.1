package net.atmospheric.oreupdate.mixin;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterials;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import org.spongepowered.asm.mixin.injection.At;


@Debug(export = true)
@Mixin(ToolMaterials.class)
public class CustomToolMaterialsMixin {
        @ModifyVariable(method = "<init>", at = @At("HEAD"), ordinal = 1)
        private static int modifyIronMiningLevel(int mininglevel) {
                if (mininglevel >= 2) {
                        return mininglevel + 1;
                }
                else {
                        return mininglevel;
                }
        }
}