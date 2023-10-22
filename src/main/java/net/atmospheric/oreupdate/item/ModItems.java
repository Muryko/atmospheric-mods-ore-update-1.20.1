package net.atmospheric.oreupdate.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.atmospheric.oreupdate.OreUpdateMod;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.atmospheric.oreupdate.item.ModToolMaterial;

public class ModItems {

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));
    public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item(new FabricItemSettings()));
    public static final Item TIN_HELMET = registerItem("tin_helmet", new ArmorItem(ModArmorMaterial.TIN, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item TIN_CHESTPLATE = registerItem("tin_chestplate", new ArmorItem(ModArmorMaterial.TIN, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item TIN_LEGGINGS = registerItem("tin_leggings", new ArmorItem(ModArmorMaterial.TIN, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item TIN_BOOTS = registerItem("tin_boots", new ArmorItem(ModArmorMaterial.TIN, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final Item TIN_PICKAXE = registerItem("tin_pickaxe", new PickaxeItem(ModToolMaterial.TIN, 2, -2, new Item.Settings()));
    public static final Item TIN_SWORD = registerItem("tin_sword", new SwordItem(ModToolMaterial.TIN, 4, -2, new Item.Settings()));
    public static final Item TIN_AXE = registerItem("tin_axe", new AxeItem(ModToolMaterial.TIN, 7, -3, new Item.Settings()));
    public static final Item TIN_SHOVEL = registerItem("tin_shovel", new ShovelItem(ModToolMaterial.TIN, 3, -3, new Item.Settings()));
    public static final Item TIN_HOE = registerItem("tin_hoe", new HoeItem(ModToolMaterial.TIN, 0, -1, new Item.Settings()));
    public static final Item COPPER_HELMET = registerItem("copper_helmet", new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate", new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings", new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots", new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new PickaxeItem(ModToolMaterial.COPPER, 2, -2, new Item.Settings()));
    public static final Item COPPER_SWORD = registerItem("copper_sword", new SwordItem(ModToolMaterial.COPPER, 4, -2, new Item.Settings()));
    public static final Item COPPER_AXE = registerItem("copper_axe", new AxeItem(ModToolMaterial.COPPER, 7, -3, new Item.Settings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(ModToolMaterial.COPPER, 3, -3, new Item.Settings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe", new HoeItem(ModToolMaterial.COPPER, 0, -1, new Item.Settings()));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));

    public static final Item BRONZE_HELMET = registerItem("bronze_helmet", new ArmorItem(ModArmorMaterial.BRONZE, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item BRONZE_CHESTPLATE = registerItem("bronze_chestplate", new ArmorItem(ModArmorMaterial.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item BRONZE_LEGGINGS = registerItem("bronze_leggings", new ArmorItem(ModArmorMaterial.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item BRONZE_BOOTS = registerItem("bronze_boots", new ArmorItem(ModArmorMaterial.BRONZE, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe", new PickaxeItem(ModToolMaterial.BRONZE, 2, -2, new Item.Settings()));
    public static final Item BRONZE_SWORD = registerItem("bronze_sword", new SwordItem(ModToolMaterial.BRONZE, 4, -2, new Item.Settings()));
    public static final Item BRONZE_AXE = registerItem("bronze_axe", new AxeItem(ModToolMaterial.BRONZE, 7, -3, new Item.Settings()));
    public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel", new ShovelItem(ModToolMaterial.BRONZE, 3, -3, new Item.Settings()));
    public static final Item BRONZE_HOE = registerItem("bronze_hoe", new HoeItem(ModToolMaterial.BRONZE, 0, -1, new Item.Settings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget", new Item(new FabricItemSettings()));

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item JADE = registerItem("jade", new Item(new FabricItemSettings()));
    public static final Item SAFIRA = registerItem("safira", new Item(new FabricItemSettings()));
    public static final Item PIRITA = registerItem("pirita", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OreUpdateMod.mod_id, name), item);
    }

    public static void registerModItems() {
        OreUpdateMod.LOGGER.info("Registering Mod Items for " + OreUpdateMod.mod_id);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}