package owmii.powah.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import owmii.lib.item.ItemBase;
import owmii.lib.registry.Registry;
import owmii.lib.registry.VarReg;
import owmii.powah.Powah;
import owmii.powah.armor.ModArmorMaterial;
import owmii.powah.block.Blcks;
import owmii.powah.block.Tier;

public class Itms {
    public static final Registry<Item> REG = new Registry<>(Item.class, Blcks.REG.getBlockItems(ItemGroups.MAIN), Powah.MOD_ID);
    public static final Item WRENCH = REG.register("wrench", new WrenchItem(new Item.Properties().group(ItemGroups.MAIN).maxStackSize(1)));
    public static final Item CAPACITOR_BASIC_TINY = REG.register("capacitor_basic_tiny", new CapacitorItem(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item CAPACITOR_BASIC_LARGE = REG.register("capacitor_basic_large", new CapacitorItem(new Item.Properties().group(ItemGroups.MAIN)));
    public static final VarReg<Tier, Item> CAPACITOR = REG.getVar("capacitor", variant -> new CapacitorItem(new Item.Properties().group(ItemGroups.MAIN), variant), Tier.getVariantsWithoutStarter());
    public static final VarReg<Tier, Item> BATTERY = REG.getVar("battery", variant -> new BatteryItem(new Item.Properties().group(ItemGroups.MAIN).maxStackSize(1), variant), Tier.values());
    public static final Item AERIAL_PEARL = REG.register("aerial_pearl", new AerialPearlItem(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item PLAYER_AERIAL_PEARL = REG.register("player_aerial_pearl", new AerialPearlItem(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item BLANK_CARD = REG.register("blank_card", new ItemBase(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item BINDING_CARD = REG.register("binding_card", new BindingCardItem(new Item.Properties().group(ItemGroups.MAIN).maxStackSize(1), false));
    public static final Item BINDING_CARD_DIM = REG.register("binding_card_dim", new BindingCardItem(new Item.Properties().group(ItemGroups.MAIN).maxStackSize(1), true));
    public static final Item LENS_OF_ENDER = REG.register("lens_of_ender", new LensOfEnderItem(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item PHOTOELECTRIC_PANE = REG.register("photoelectric_pane", new PhotoelectricPaneItem(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item THERMOELECTRIC_PLATE = REG.register("thermoelectric_plate", new ItemBase(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item DIELECTRIC_PASTE = REG.register("dielectric_paste", new ItemBase(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item DIELECTRIC_ROD = REG.register("dielectric_rod", new ItemBase(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item DIELECTRIC_ROD_HORIZONTAL = REG.register("dielectric_rod_horizontal", new ItemBase(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item DIELECTRIC_CASING = REG.register("dielectric_casing", new ItemBase(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_STEEL = REG.register("steel_energized", new ItemBase(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item BLAZING_CRYSTAL = REG.register("crystal_blazing", new ItemBase(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item NIOTIC_CRYSTAL = REG.register("crystal_niotic", new ItemBase(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item SPIRITED_CRYSTAL = REG.register("crystal_spirited", new ItemBase(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item NITRO_CRYSTAL = REG.register("crystal_nitro", new ItemBase(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item OVERCHARGED_CORE = REG.register("overcharged_core", new ItemBase(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENDER_CORE = REG.register("ender_core", new ItemBase(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item CHARGED_SNOWBALL = REG.register("charged_snowball", new ChargedSnowballItem(new Item.Properties().group(ItemGroups.MAIN).maxStackSize(16)));
    public static final Item URANINITE_RAW = REG.register("uraninite_raw", new UraniniteItem(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item URANINITE = REG.register("uraninite", new UraniniteItem(new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_BOOTS_STARTER = REG.register("energized_boots_starter", new ArmorItem(ModArmorMaterial.ARMOR_STARTER, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_LEGGINGS_STARTER = REG.register("energized_leggings_starter", new ArmorItem(ModArmorMaterial.ARMOR_STARTER, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_CHESTPLATE_STARTER = REG.register("energized_chestplate_starter", new ArmorItem(ModArmorMaterial.ARMOR_STARTER, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_HELMET_STARTER = REG.register("energized_helmet_starter", new ArmorItem(ModArmorMaterial.ARMOR_STARTER, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_BOOTS_BASIC = REG.register("energized_boots_basic", new ArmorItem(ModArmorMaterial.ARMOR_BASIC, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_LEGGINGS_BASIC = REG.register("energized_leggings_basic", new ArmorItem(ModArmorMaterial.ARMOR_BASIC, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_CHESTPLATE_BASIC = REG.register("energized_chestplate_basic", new ArmorItem(ModArmorMaterial.ARMOR_BASIC, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_HELMET_BASIC = REG.register("energized_helmet_basic", new ArmorItem(ModArmorMaterial.ARMOR_BASIC, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_BOOTS_HARDENED = REG.register("energized_boots_hardened", new ArmorItem(ModArmorMaterial.ARMOR_HARDENED, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_LEGGINGS_HARDENED = REG.register("energized_leggings_hardened", new ArmorItem(ModArmorMaterial.ARMOR_HARDENED, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_CHESTPLATE_HARDENED = REG.register("energized_chestplate_hardened", new ArmorItem(ModArmorMaterial.ARMOR_HARDENED, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_HELMET_HARDENED = REG.register("energized_helmet_hardened", new ArmorItem(ModArmorMaterial.ARMOR_HARDENED, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_BOOTS_BLAZING = REG.register("energized_boots_blazing", new ArmorItem(ModArmorMaterial.ARMOR_BLAZING, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_LEGGINGS_BLAZING = REG.register("energized_leggings_blazing", new ArmorItem(ModArmorMaterial.ARMOR_BLAZING, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_CHESTPLATE_BLAZING = REG.register("energized_chestplate_blazing", new ArmorItem(ModArmorMaterial.ARMOR_BLAZING, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_HELMET_BLAZING = REG.register("energized_helmet_blazing", new ArmorItem(ModArmorMaterial.ARMOR_BLAZING, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_BOOTS_NIOTIC = REG.register("energized_boots_niotic", new ArmorItem(ModArmorMaterial.ARMOR_NIOTIC, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_LEGGINGS_NIOTIC = REG.register("energized_leggings_niotic", new ArmorItem(ModArmorMaterial.ARMOR_NIOTIC, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_CHESTPLATE_NIOTIC = REG.register("energized_chestplate_niotic", new ArmorItem(ModArmorMaterial.ARMOR_NIOTIC, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_HELMET_NIOTIC = REG.register("energized_helmet_niotic", new ArmorItem(ModArmorMaterial.ARMOR_NIOTIC, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_BOOTS_SPIRITED = REG.register("energized_boots_spirited", new ArmorItem(ModArmorMaterial.ARMOR_SPIRITED, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_LEGGINGS_SPIRITED = REG.register("energized_leggings_spirited", new ArmorItem(ModArmorMaterial.ARMOR_SPIRITED, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_CHESTPLATE_SPIRITED = REG.register("energized_chestplate_spirited", new ArmorItem(ModArmorMaterial.ARMOR_SPIRITED, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_HELMET_SPIRITED = REG.register("energized_helmet_spirited", new ArmorItem(ModArmorMaterial.ARMOR_SPIRITED, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_BOOTS_NITRO = REG.register("energized_boots_nitro", new ArmorItem(ModArmorMaterial.ARMOR_NITRO, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_LEGGINGS_NITRO = REG.register("energized_leggings_nitro", new ArmorItem(ModArmorMaterial.ARMOR_NITRO, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_CHESTPLATE_NITRO = REG.register("energized_chestplate_nitro", new ArmorItem(ModArmorMaterial.ARMOR_NITRO, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_HELMET_NITRO = REG.register("energized_helmet_nitro", new ArmorItem(ModArmorMaterial.ARMOR_NITRO, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_BOOTS_OVERCHARGED = REG.register("energized_boots_overcharged", new ArmorItem(ModArmorMaterial.ARMOR_OVERCHARGED, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_LEGGINGS_OVERCHARGED = REG.register("energized_leggings_overcharged", new ArmorItem(ModArmorMaterial.ARMOR_OVERCHARGED, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_CHESTPLATE_OVERCHARGED = REG.register("energized_chestplate_overcharged", new ArmorItem(ModArmorMaterial.ARMOR_OVERCHARGED, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroups.MAIN)));
    public static final Item ENERGIZED_HELMET_OVERCHARGED = REG.register("energized_helmet_overcharged", new ArmorItem(ModArmorMaterial.ARMOR_OVERCHARGED, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroups.MAIN)));
}

