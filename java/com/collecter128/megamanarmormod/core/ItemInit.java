package com.collecter128.megamanarmormod.core;

import java.util.ArrayList;
import java.util.List;

import com.collecter128.megamanarmormod.MegamanArmorMod;
import com.collecter128.megamanarmormod.client.CustomPatterns;
import com.collecter128.megamanarmormod.items.*;
import com.collecter128.megamanarmormod.materials.ArmorMaterials;

import net.minecraft.client.Minecraft;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BannerPatternItem;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.PotionUtils;
import net.minecraft.tileentity.BannerPattern;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, "megamanarmormod"); //MegamanArmorMod.Mod_ID
	
	public static final List<BannerPattern> PATTERNS = new ArrayList<>();
	public static final List<RegistryObject<Item>> PATTERN_ITEMS = new ArrayList<>();


	    static {
	        for (CustomPatterns cp : CustomPatterns.values()) {
	            String name = cp.getName();
	            BannerPattern pattern = BannerPattern.create(cp.name(), name, name, true);
	            RegistryObject<Item> pattern_item = 
	            		Items.register(name + "_banner_pattern", () -> new BannerPatternItem(pattern, 
	            				new Item.Properties().tab(MegamanArmorMod.MMBannerMats)));
	            PATTERNS.add(pattern);
	            PATTERN_ITEMS.add(pattern_item);
	        }
	    }
	
	//public static final RegistryObject<Item> CircleBannerPattern = Items.register("circle_banner_pattern",
	//		() -> new BannerPatternItem(null, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> Titanium = Items.register("titanium",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> NuggetTitanium = Items.register("nugget_titanium",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));

	public static final RegistryObject<Item> TrialProductionAlloy = Items.register("alloy_trial_production",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> PrototypeAlloy = Items.register("alloy_prototype",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> BasicAlloy = Items.register("alloy_basic",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ModifiedAlloy = Items.register("alloy_modified",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> SmartAlloy = Items.register("alloy_smart",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> PrecisionAlloy = Items.register("alloy_precision",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> HighPerformanceAlloy = Items.register("alloy_high_performance",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> EvolvedAlloy = Items.register("alloy_evolved",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> SpecialAlloy = Items.register("alloy_special",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> HeterogenicAlloy = Items.register("alloy_heterogenic",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ReverseAlloy = Items.register("alloy_reverse",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> TrialProductionCircuit = Items.register("circuit_trialproduction",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> PrototypeCircuit = Items.register("circuit_prototype",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> BasicCircuit = Items.register("circuit_basic",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ModifiedCircuit = Items.register("circuit_modified",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> SmartCircuit = Items.register("circuit_smart",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> PrecisionCircuit = Items.register("circuit_precision",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> HighPerformanceCircuit = Items.register("circuit_high_performance",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> EvolvedCircuit = Items.register("circuit_evolved",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> SpecialCircuit = Items.register("circuit_special",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> HeterogenicCircuit = Items.register("circuit_heterogenic",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ReverseCircuit = Items.register("circuit_reverse",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> TrialProductionCore = Items.register("core_trialproduction",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> PrototypeCore = Items.register("core_prototype",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> BasicCore = Items.register("core_basic",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ModifiedCore = Items.register("core_modified",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> SmartCore = Items.register("core_smart",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> PrecisionCore = Items.register("core_precision",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> TrialProductionGear = Items.register("gear_trialproduction",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> PrototypeGear = Items.register("gear_prototype",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> BasicGear = Items.register("gear_basic",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ModifiedGear = Items.register("gear_modified",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> SmartGear = Items.register("gear_smart",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> PrecisionGear = Items.register("gear_precision",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> TrialProductionBattery = Items.register("battery_trial_production",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> PrototypeBattery = Items.register("battery_prototype",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> BasicBattery = Items.register("battery_basic",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ModifiedBattery = Items.register("battery_modified",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> SmartBattery = Items.register("battery_smart",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> PrecisionBattery = Items.register("battery_precision",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> TrialProductionAmplifier = Items.register("amplifier_trial_production",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> PrototypeAmplifier = Items.register("amplifier_prototype",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> BasicAmplifier = Items.register("amplifier_basic",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ModifiedAmplifier = Items.register("amplifier_modified",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> SmartAmplifier = Items.register("amplifier_smart",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> PrecisionAmplifier = Items.register("amplifier_precision",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> ElementMetal = Items.register("element_metal",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> ShockAbsorber = Items.register("shock_absorber",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ElectronicStorageBottle = Items.register("electronic_storage_bottle",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ElectronicConversionBottle = Items.register("electronic_conversion_bottle",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> CharacterPatchProgram = Items.register("patch_program_character",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> WeaponPatchProgram = Items.register("patch_program_weapon",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ArenaToken = Items.register("token_arena",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> CoopToken = Items.register("token_coop",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> LuckyToken = Items.register("token_lucky",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> DeepElement = Items.register("deep_element",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> OreCrimson = Items.register("ore_crimson",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> OreAmber = Items.register("ore_amber",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> OreAzure = Items.register("ore_azure",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> OreViridian = Items.register("ore_viridian",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> CrystalCrimson = Items.register("crystal_crimson",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> CrystalAmber = Items.register("crystal_amber",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> CrystalAzure = Items.register("crystal_azure",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> CrystalViridian = Items.register("crystal_viridian",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> CerataniumRaw = Items.register("ceratanium_raw",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> Ceratanium = Items.register("ceratanium",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> NuggetCeratanium = Items.register("nugget_ceratanium",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> Fortenium = Items.register("fortenium",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> Bassnium = Items.register("bassnium",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> SpecialSteel = Items.register("specialsteel",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> TitaniumX = Items.register("titaniumx",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> HyperMetal = Items.register("hypermetal",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> BassniumEnergy = Items.register("energy_bassnium",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> RoboenzaCure = Items.register("roboenza_cure",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> AlienEnergy = Items.register("energy_alien",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> EvilEnergy = Items.register("energy_evil",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> SigmaVirus = Items.register("virussigma",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> Limited = Items.register("limited",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> HyperLimited = Items.register("limited_hyper",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> Extreme = Items.register("extreme",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ZeroVirus = Items.register("viruszero",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> BlueNightmareSoul = Items.register("nightmaresoul_blue",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> SmallBlueNightmareSoul = Items.register("nightmaresoul_bluesmall",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> GreenNightmareSoul = Items.register("nightmaresoul_green",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> RedNightmareSoul = Items.register("nightmaresoul_red",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> BlankBiometal = Items.register("biometal_blank",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> XBiometal = Items.register("biometal_x",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ZBiometal = Items.register("biometal_z",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ColdPearl = Items.register("coldpearl",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> BlankBannerPattern = Items.register("blank_banner_pattern",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> DudBomb = Items.register("bomb_dud",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> BrokenCutter = Items.register("cutter_broken",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ElectricBattery = Items.register("electric_battery",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> FirePart = Items.register("fire_part",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> GutsPart = Items.register("guts_part",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> IceMachine = Items.register("ice_machine",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> OilCan = Items.register("oil_can",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> TimeClock = Items.register("time_clock",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> SaberPlusOne = Items.register("saberplusone",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> SaberPlusTwo = Items.register("saberplustwo",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> FakeZeroPiece1 = Items.register("fake_zero_piece1",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> FakeZeroPiece2 = Items.register("fake_zero_piece2",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> FakeZeroPiece3 = Items.register("fake_zero_piece3",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> Zenny = Items.register("zenny",
			() -> new itemZenny(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> BugFrag = Items.register("bugfrag",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> NormalData = Items.register("data_normal",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> FireData = Items.register("data_fire",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> AquaData = Items.register("data_aqua",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ElecData = Items.register("data_elec",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> WoodData = Items.register("data_wood",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> BusterData = Items.register("data_buster",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> SwordData = Items.register("data_sword",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> WindData = Items.register("data_wind",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> CurserData = Items.register("data_curser",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> BreakData = Items.register("data_break",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> RecoverData = Items.register("data_recovery",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> PlusData = Items.register("data_plus",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> InvisData = Items.register("data_invisible",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> PanelData = Items.register("data_panel",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> ObstacleData = Items.register("data_obstacle",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> DarkData = Items.register("data_dark",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> VirusData = Items.register("data_virus",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> FalzarData = Items.register("data_falzar",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> GregarData = Items.register("data_gregar",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> HubBatch = Items.register("hubbatch",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> MysteryDataPartBlue = Items.register("mysterydatapartblue",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> AMWave = Items.register("wave_am",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> FMWave = Items.register("wave_fm",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> MUWave = Items.register("wave_mu",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> NoiseWave = Items.register("wave_noise",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> MegaSnack = Items.register("mega_snack",
			() -> new Item(new Item.Properties().food(Foods.BREAD)
					.tab(MegamanArmorMod.MMMaterialsTab)));
	
	public static final RegistryObject<Item> SoccerBall = Items.register("soccer_ball",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> RCan = Items.register("rcan",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	public static final RegistryObject<Item> TeppenXCard = Items.register("teppenxcard",
			() -> new Item(new Item.Properties().tab(MegamanArmorMod.MMMaterialsTab)));
	
	//type
	//0-??? Color
	//-1 Does not color
	//-2 Return to default
	//-3 random??? (only kind of works)
	//-4 negative
	//Order
	//Main, Secondary, ThirdColor, WhiteColor, Glow Bits"Crystal", GreyColor
	/*Main*/ /*Secondary*/ /*ThirdColor*/ /*WhiteColor*/ /*Glow Bits*/ /*GreyColor*/ /*FourthColor*/
	 
	public static final RegistryObject<Item> DefaultColorizer = Items.register("colorizerdefault",
			() -> new ArmorColorizerDefault(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)));
	//Decolorizer (makes all colors = white so there is no color
	public static final RegistryObject<Item> BlankColorizer = Items.register("colorizerdecolorizer",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16777215, /*Secondary*/16777215, /*Third*/16777215, 
							/*WhiteColor*/16777215, /*Glow Bits*/16777215, /*GreyColor*/16777215, 
							/*FourthColor*/16777215, /*FifthColor*/16777215}));

	
	public static final RegistryObject<Item> MegamanColorizer = Items.register("colorizermegaman",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/342773, /*Secondary*/379125, /*ThirdColor*/14105660, 
							/*WhiteColor*/16777215, /*Glow Bits*/16728361, /*GreyColor*/12105912, 
							/*FourthColor*/379125, /*FifthColor*/-1}));
	public static final RegistryObject<Item> Megaman2PColorizer = Items.register("colorizermegaman2p",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15270184, /*Secondary*/16745895, /*ThirdColor*/14105660, 
							/*WhiteColor*/16777215, /*Glow Bits*/16728361, /*GreyColor*/12105912, 
							/*FourthColor*/16745895, /*FifthColor*/-1}));
	public static final RegistryObject<Item> QuintColorizer = Items.register("colorizerquint",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3709250, /*Secondary*/10413478, /*ThirdColor*/16755768,
							/*WhiteColor*/16777215, /*Glow Bits*/16764984, /*GreyColor*/12105912, 
							/*FourthColor*/10413478, /*FifthColor*/6832845}));
	public static final RegistryObject<Item> RockmanShadowColorizer = Items.register("colorizerrockmanshadow",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/ 4479560, /*Secondary*/4555344, /*ThirdColor*/12281637, 
							/*WhiteColor*/14996179, /*Glow Bits*/13619253, /*GreyColor*/14670057, 
							/*FourthColor*/4555344, /*FifthColor*/6832845}));
	public static final RegistryObject<Item> MegamanEvilColorizer = Items.register("colorizermegamanevil",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/5636601, /*Secondary*/379125, /*ThirdColor*/12714489, 
							/*WhiteColor*/16777215, /*Glow Bits*/14287176, /*GreyColor*/12105912, 
							/*FourthColor*/379125, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SuperAdapterColorizer = Items.register("colorizersuperadapter",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16716820, /*Secondary*/11053224, /*ThirdColor*/16760596, 
							/*WhiteColor*/16777215, /*Glow Bits*/14365440, /*GreyColor*/12105912, 
							/*FourthColor*/16673903, /*FifthColor*/-1}));
	public static final RegistryObject<Item> RushColorizer = Items.register("colorizerrush",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16002867, /*Secondary*/16777215, /*ThirdColor*/-1, 
							/*WhiteColor*/12105912, /*Glow Bits*/16753193, /*GreyColor*/12105912, 
							/*FourthColor*/16673903, /*FifthColor*/-1}));
	// blue? 2781423
	
	public static final RegistryObject<Item> RedbullMegamanColorizer = Items.register("colorizerredbull",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/4413347, /*Secondary*/13356237, /*ThirdColor*/14032731, 
							/*WhiteColor*/16777215, /*Glow Bits*/16773191, /*GreyColor*/13356237, 
							/*FourthColor*/8374492, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> RollColorizer = Items.register("colorizerroll",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16731960, /*Secondary*/12708608, /*ThirdColor*/16635420, 
							/*WhiteColor*/16777215, /*Glow Bits*/16749332, /*GreyColor*/6113907, 
							/*FourthColor*/6113907, /*FifthColor*/-1}));
	public static final RegistryObject<Item> Roll2PColorizer = Items.register("colorizerroll2p",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/9539985, /*Secondary*/3847816, /*ThirdColor*/16236377, 
							/*WhiteColor*/16777215, /*Glow Bits*/3454813, /*GreyColor*/8421504, 
							/*FourthColor*/8421504, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> ProtomanColorizer = Items.register("colorizerprotoman",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16331285, /*Secondary*/9737364, /*ThirdColor*/16765460, 
							/*WhiteColor*/15855562, /*Glow Bits*/2359060, /*GreyColor*/12105912, 
							/*FourthColor*/-1, /*FifthColor*/-1}));
	public static final RegistryObject<Item> BreakmanColorizer = Items.register("colorizerbreakman",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16331285, /*Secondary*/9737364, /*ThirdColor*/16765460, 
							/*WhiteColor*/15855562, /*Glow Bits*/2359060, /*GreyColor*/12105912, 
							/*FourthColor*/-1, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> FiremanColorizer = Items.register("colorizerfireman",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16712965, /*Secondary*/12237498, /*ThirdColor*/16767749, 
							/*WhiteColor*/15921906, /*Glow Bits*/16759813, /*GreyColor*/15592941, 
							/*FourthColor*/12237498, /*FifthColor*/-1}));
	public static final RegistryObject<Item> CutmanColorizer = Items.register("colorizercutman",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16744714, /*Secondary*/16777215, /*ThirdColor*/16777215, 
							/*WhiteColor*/16777215, /*Glow Bits*/16580362, /*GreyColor*/15592941, 
							/*FourthColor*/15592941, /*FifthColor*/-1}));
	public static final RegistryObject<Item> BombmanColorizer = Items.register("colorizerbombman",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16439823, /*Secondary*/16479267, /*ThirdColor*/4671303, 
							/*WhiteColor*/15921906, /*Glow Bits*/437505, /*GreyColor*/15592941, 
							/*FourthColor*/15592941, /*FifthColor*/-1}));
	public static final RegistryObject<Item> IcemanColorizer = Items.register("colorizericeman",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6058751, /*Secondary*/16777215, /*ThirdColor*/6058751, 
							/*WhiteColor*/16777215, /*Glow Bits*/16658443, /*GreyColor*/4931443, 
							/*FourthColor*/4931443, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ElecmanColorizer = Items.register("colorizerelecman",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16767242, /*Secondary*/6050406, /*ThirdColor*/16729861, 
							/*WhiteColor*/15921906, /*Glow Bits*/12317952, /*GreyColor*/10329770, 
							/*FourthColor*/6050406, /*FifthColor*/-1}));
	public static final RegistryObject<Item> GutsmanColorizer = Items.register("colorizergutsman",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16401152, /*Secondary*/16440832, /*ThirdColor*/5656174, 
							/*WhiteColor*/16777215, /*Glow Bits*/16738867, /*GreyColor*/13224393, 
							/*FourthColor*/13224393, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> MegamanGoalieColorizer = Items.register("colorizermegamangoalie",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/8750469, /*Secondary*/13663310, /*ThirdColor*/13968154, 
							/*WhiteColor*/16777215, /*Glow Bits*/13968154, /*GreyColor*/8224125, 
							/*FourthColor*/8750469, /*FifthColor*/-1}));
	public static final RegistryObject<Item> Megaman2PGoalieColorizer = Items.register("colorizermegaman2pgoalie",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/13614359, /*Secondary*/9027308, /*ThirdColor*/13968154, 
							/*WhiteColor*/16777215, /*Glow Bits*/13968154, /*GreyColor*/8224125, 
							/*FourthColor*/9027308, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ProtomanGoalieColorizer = Items.register("colorizerprotomangoalie",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/10495, /*Secondary*/2412831, /*ThirdColor*/16739584, 
							/*WhiteColor*/16777215, /*Glow Bits*/16749568, /*GreyColor*/11908533, 
							/*FourthColor*/11908533, /*FifthColor*/-1}));
	public static final RegistryObject<Item> FiremanGoalieColorizer = Items.register("colorizerfiremangoalie",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16739840, /*Secondary*/3384048, /*ThirdColor*/15776563, 
							/*WhiteColor*/16777215, /*Glow Bits*/3199753, /*GreyColor*/11908533, 
							/*FourthColor*/5199772, /*FifthColor*/-1}));
	public static final RegistryObject<Item> CutmanGoalieColorizer = Items.register("colorizercutmangoalie",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15466291, /*Secondary*/9418495, /*ThirdColor*/15322155, 
							/*WhiteColor*/16777215, /*Glow Bits*/16731412, /*GreyColor*/10592673, 
							/*FourthColor*/11053224, /*FifthColor*/-1}));
	public static final RegistryObject<Item> BombmanGoalieColorizer = Items.register("colorizerbombmangoalie",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/117519, /*Secondary*/12688661, /*ThirdColor*/8281006, 
							/*WhiteColor*/16777215, /*Glow Bits*/16506377, /*GreyColor*/8281006, 
							/*FourthColor*/16439828, /*FifthColor*/-1}));
	public static final RegistryObject<Item> IcemanGoalieColorizer = Items.register("colorizericemangoalie",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16753603, /*Secondary*/1769221, /*ThirdColor*/16714501, 
							/*WhiteColor*/12642520, /*Glow Bits*/16714501, /*GreyColor*/5680819, 
							/*FourthColor*/16615356, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ElecmanGoalieColorizer = Items.register("colorizerelecmangoalie",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/702719, /*Secondary*/10641921, /*ThirdColor*/15226135, 
							/*WhiteColor*/16777215, /*Glow Bits*/1800480, /*GreyColor*/16400896, 
							/*FourthColor*/16400896, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> SoccerWilyColorizer = Items.register("colorizersoccerwily",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16723659, /*Secondary*/7109589, /*ThirdColor*/16763904, 
							/*WhiteColor*/14409185, /*Glow Bits*/16763904, /*GreyColor*/9018020, 
							/*FourthColor*/15073291, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SoccerWilyGoalieColorizer = Items.register("colorizersoccerwilygoalie",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/513407, /*Secondary*/7109589, /*ThirdColor*/16763904, 
							/*WhiteColor*/14409185, /*Glow Bits*/16763904, /*GreyColor*/9018020, 
							/*FourthColor*/15073291, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> WoodGutsmanColorizer = Items.register("colorizergutsmanwood",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3577436, /*Secondary*/4521332, /*ThirdColor*/2563, 
							/*WhiteColor*/16777215, /*Glow Bits*/3577436, /*GreyColor*/16770170, 
							/*FourthColor*/2563, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> SuperArmColorizer = Items.register("colorizersuperarm", // Main??? 8728837
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16086016, /*Secondary*/16777215, -1, -1, -1, -1, 
					/*FourthColor*/16753454, /*FifthColor*/-1}));
	public static final RegistryObject<Item> HyperBombColorizer = Items.register("colorizerhyperbomb",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1048350, /*Secondary*/16777215, -1, -1, -1, -1, 
					/*FourthColor*/7339822, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ThunderBeamColorizer = Items.register("colorizerthunderbeam",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/12105912, /*Secondary*/15914084, -1, -1, -1, -1, 
					/*FourthColor*/11908533, /*FifthColor*/-1}));
	public static final RegistryObject<Item> RollingCutterColorizer = Items.register("colorizerrollingcutter",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/8026746, /*Secondary*/16777215, -1, -1, -1, -1, 
					/*FourthColor*/12566463, /*FifthColor*/-1}));
	public static final RegistryObject<Item> IceSlasherColorizer = Items.register("colorizericeslasher",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/4092158, /*Secondary*/16777215, -1, -1, -1, -1, 
					/*FourthColor*/4092158, /*FifthColor*/-1}));
	public static final RegistryObject<Item> FireStormColorizer = Items.register("colorizerfirestorm",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16727055, /*Secondary*/16754714, -1, -1, -1, -1, 
					/*FourthColor*/16727055, /*FifthColor*/-1}));
	public static final RegistryObject<Item> TimeSlowColorizer = Items.register("colorizertimeslow",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/9915066, /*Secondary*/15895789, -1, -1, -1, -1, 
					/*FourthColor*/9915066, /*FifthColor*/-1}));
	public static final RegistryObject<Item> OilSliderColorizer = Items.register("colorizeroilslider",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/7478588, /*Secondary*/6786978, -1, -1, -1, -1, 
					/*FourthColor*/7478588, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> LeafSheildColorizer = Items.register("colorizerleafshield",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1285632, /*Secondary*/16579836, -1, -1, -1, -1, 
					/*FourthColor*/14600727, /*FifthColor*/-1}));
	public static final RegistryObject<Item> AirShooterColorizer = Items.register("colorizerairshooter",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/5212668, /*Secondary*/16579836, -1, -1, -1, -1, 
					/*FourthColor*/15774986, /*FifthColor*/-1}));
	public static final RegistryObject<Item> TimeStopperColorizer = Items.register("colorizertimestopper",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/11674775, /*Secondary*/16448250, -1, -1, -1, -1, 
					/*FourthColor*/15783946, /*FifthColor*/-1}));
	public static final RegistryObject<Item> CrashBomberColorizer = Items.register("colorizercrashbomber",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16748063, /*Secondary*/16579836, -1, -1, -1, -1, 
					/*FourthColor*/15774986, /*FifthColor*/-1}));
	public static final RegistryObject<Item> BubbleLeadColorizer = Items.register("colorizerbubblelead",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/10395294, /*Secondary*/16579836, -1, -1, -1, -1, 
					/*FourthColor*/14055936, /*FifthColor*/-1}));
	public static final RegistryObject<Item> MetalBladeColorizer = Items.register("colorizermetalblade",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/11899702, /*Secondary*/16637574, -1, -1, -1, -1, 
					/*FourthColor*/16497724, /*FifthColor*/-1}));
	public static final RegistryObject<Item> AtomicfireColorizer = Items.register("colorizeratomicfire",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16591720, /*Secondary*/16627243, -1, -1, -1, -1, 
					/*FourthColor*/15774986, /*FifthColor*/-1}));
	public static final RegistryObject<Item> QuickBoomerangColorizer = Items.register("colorizerquickboomerang",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16485805, /*Secondary*/16694736, -1, -1, -1, -1, 
					/*FourthColor*/15774986, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> Item123Colorizer = Items.register("colorizeritem123",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16719661, /*Secondary*/16579836, -1, -1, -1, -1, 
					/*FourthColor*/15698694, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> HardKnuckleColorizer = Items.register("colorizerhardknuckle",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/8944, /*Secondary*/11382189, -1, -1, -1, -1, 
					/*FourthColor*/8553090, /*FifthColor*/-1}));
	public static final RegistryObject<Item> NeedleCannonColorizer = Items.register("colorizerneedlecannon",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16748826, /*Secondary*/16448250, -1, -1, -1, -1, 
					/*FourthColor*/8344622, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SparkShockColorizer = Items.register("colorizersparkshock",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16549988, /*Secondary*/16448250, -1, -1, -1, -1, 
					/*FourthColor*/14703872, /*FifthColor*/-1}));
	public static final RegistryObject<Item> MagnetMissileColorizer = Items.register("colorizermagnetmissile",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16731182, /*Secondary*/10592673, -1, -1, -1, -1, 
					/*FourthColor*/10251588, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SearchSnakeColorizer = Items.register("colorizersearchsnake",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/113686, /*Secondary*/16448250, -1, -1, -1, -1, 
					/*FourthColor*/113686, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ShadowBladeColorizer = Items.register("colorizershadowblade",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/13834222, /*Secondary*/16487405, -1, -1, -1, -1, 
					/*FourthColor*/13834222, /*FifthColor*/-1}));
	public static final RegistryObject<Item> TopSpinColorizer = Items.register("colorizertopspin",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/9408399, /*Secondary*/15710392, -1, -1, -1, -1, 
					/*FourthColor*/9408399, /*FifthColor*/-1}));
	public static final RegistryObject<Item> GeminiLaserColorizer = Items.register("colorizergeminilaser",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/5238268, /*Secondary*/16448250, -1, -1, -1, -1, 
					/*FourthColor*/5238268, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> DiveMissileColorizer = Items.register("colorizerdivemissile",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/1518507, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/1518507, /*FifthColor*/-1}));
	public static final RegistryObject<Item> DrillBombColorizer = Items.register("colorizerdrillbomb",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16732191, /*Secondary*/11317694, -1, -1, -1, -1, 
							/*FourthColor*/16732191, /*FifthColor*/-1}));
	public static final RegistryObject<Item> DustCrusherColorizer = Items.register("colorizerdustcrusher",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/7692177, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/9868950, /*FifthColor*/-1}));
	public static final RegistryObject<Item> FlashStopperColorizer = Items.register("colorizerflashstopper",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/6891663, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/6891663, /*FifthColor*/-1}));
	public static final RegistryObject<Item> RainFlushColorizer = Items.register("colorizerrainflush",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/6002959, /*Secondary*/7114433, -1, -1, -1, -1, 
					/*FourthColor*/6002959, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SkullBarrierColorizer = Items.register("colorizerskullbarrier",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/316631, /*Secondary*/3602940, -1, -1, -1, -1, 
							/*FourthColor*/6531525, /*FifthColor*/-1}));
	public static final RegistryObject<Item> RingBoomerangColorizer = Items.register("colorizerringboomerang",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/10904840, /*Secondary*/16704800, -1, -1, -1, -1, 
							/*FourthColor*/10904840, /*FifthColor*/-1}));
	public static final RegistryObject<Item> PharoahShotColorizer = Items.register("colorizerpharoahshot",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16735785, /*Secondary*/16741714, -1, -1, -1, -1, 
							/*FourthColor*/16735785, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> ChargeKickColorizer = Items.register("colorizerchargekick",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16750111, /*Secondary*/16777215, -1, -1, -1, -1, 
					/*FourthColor*/16767800, /*FifthColor*/-1}));
	//???16767800
	public static final RegistryObject<Item> GravityHoldColorizer = Items.register("colorizergravityhold",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16715767, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/16771103, /*FifthColor*/-1}));
			//???16771103
	public static final RegistryObject<Item> GyroAttackColorizer = Items.register("colorizergyroattack",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/5430811, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/15847991, /*FifthColor*/-1}));
			//???15847991
	public static final RegistryObject<Item> NapalmBombColorizer = Items.register("colorizernapalmbomb",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/6692863, /*Secondary*/16767775, -1, -1, -1, -1, 
							/*FourthColor*/16727583, /*FifthColor*/-1}));
			//???16727583
	public static final RegistryObject<Item> CrystalEyeColorizer = Items.register("colorizercrystaleye",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/5071359, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/16756546, /*FifthColor*/-1}));
			//???16756546
	public static final RegistryObject<Item> PowerStoneColorizer = Items.register("colorizerpowerstone",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/9977375, /*Secondary*/16771778, -1, -1, -1, -1, 
							/*FourthColor*/16767775, /*FifthColor*/-1}));
			//???16767775
	public static final RegistryObject<Item> StarCrushColorizer = Items.register("colorizerstarcrush",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/14984229, /*Secondary*/16773903, -1, -1, -1, -1, 
							/*FourthColor*/16724239, /*FifthColor*/-1}));
			//???16724239
	public static final RegistryObject<Item> WaterWaveColorizer = Items.register("colorizerwaterwave",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/4538799, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/4078032, /*FifthColor*/-1}));
			//???4078032
	
	public static final RegistryObject<Item> BlizzardAttackColorizer = Items.register("colorizerblizzardattack",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/10613489, /*Secondary*/16777215, -1, -1, -1, -1, 
					/*FourthColor*/15901089, /*FifthColor*/-1}));
	//??? 15901089
	public static final RegistryObject<Item> CentaurFlashColorizer = Items.register("colorizercentaurflash",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/6007615, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/16772618, /*FifthColor*/-1}));
			//??? 16772618
	public static final RegistryObject<Item> FlameBlastColorizer = Items.register("colorizerflameblast",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16748570, /*Secondary*/16768282, -1, -1, -1, -1, 
							/*FourthColor*/4899889, /*FifthColor*/-1}));
			//??? 4899889
	public static final RegistryObject<Item> WindStormColorizer = Items.register("colorizerwindstorm",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/6776150, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/6776150, /*FifthColor*/-1}));
			//??? 6776150
	public static final RegistryObject<Item> SilverTomahawkColorizer = Items.register("colorizersilvertomahawk",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/11689493, /*Secondary*/16178026, -1, -1, -1, -1, 
							/*FourthColor*/13750737, /*FifthColor*/-1}));
			//??? 13750737
	public static final RegistryObject<Item> PlantBarrierColorizer = Items.register("colorizerplantbarrier",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16475530, /*Secondary*/16568282, -1, -1, -1, -1, 
							/*FourthColor*/4496937, /*FifthColor*/-1}));
			//??? 4496937
	public static final RegistryObject<Item> KnightCrushColorizer = Items.register("colorizerknightcrush",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/6392575, /*Secondary*/12434877, -1, -1, -1, -1, 
							/*FourthColor*/16424655, /*FifthColor*/-1}));
			//??? 16424655
	public static final RegistryObject<Item> YamatoSpearColorizer = Items.register("colorizeryamatospear",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/11691674, /*Secondary*/16767984, -1, -1, -1, -1, 
							/*FourthColor*/14353664, /*FifthColor*/-1}));
			//??? 14353664
	
	public static final RegistryObject<Item> NoiseCrushColorizer = Items.register("colorizernoisecrush",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/12070624, /*Secondary*/1376196, -1, -1, -1, -1, 
					/*FourthColor*/12070624, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SlashClawColorizer = Items.register("colorizerslashclaw",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1757475, /*Secondary*/13739546, -1, -1, -1, -1, 
					/*FourthColor*/1757475, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ThunderBoltColorizer = Items.register("colorizerthunderbolt",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1477322, /*Secondary*/16774436, -1, -1, -1, -1, 
					/*FourthColor*/1477322, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ScorchWheelColorizer = Items.register("colorizerscorchwheel",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/15742976, /*Secondary*/11315882, -1, -1, -1, -1, 
					/*FourthColor*/15742976, /*FifthColor*/-1}));
	public static final RegistryObject<Item> WildCoilColorizer = Items.register("colorizerwildcoil",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/15354084, /*Secondary*/109841, -1, -1, -1, -1, 
					/*FourthColor*/15354084, /*FifthColor*/-1}));
	public static final RegistryObject<Item> DangerWrapColorizer = Items.register("colorizerdangerwrap",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16751621, /*Secondary*/15330267, -1, -1, -1, -1, 
					/*FourthColor*/16751621, /*FifthColor*/-1}));
	public static final RegistryObject<Item> JunkShieldColorizer = Items.register("colorizerjunkshield",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/7698851, /*Secondary*/10075601, -1, -1, -1, -1, 
					/*FourthColor*/7698851, /*FifthColor*/-1}));
	public static final RegistryObject<Item> FreezeCrackerColorizer = Items.register("colorizerfreezecracker",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1563089, /*Secondary*/10074295, -1, -1, -1, -1, 
					/*FourthColor*/1563089, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item>  FrozenColorizer = Items.register("colorizerfrozen",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/8306157, /*Secondary*/9168095,/*ThirdColor*/16777215, 
							/*WhiteColor*/16777215, /*Glow Bits*/3553082, /*GreyColor*/7518691, 
							/*FourthColor*/8306157, /*FifthColor*/3553082}));
	public static final RegistryObject<Item>  PetrifiedColorizer = Items.register("colorizerpetrified",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/9737364, /*Secondary*/7566195,/*ThirdColor*/13092807, 
							/*WhiteColor*/16777215, /*Glow Bits*/6710886, /*GreyColor*/6710886, 
							/*FourthColor*/9737364, /*FifthColor*/6710886}));
	public static final RegistryObject<Item>  StickyColorizer = Items.register("colorizersticky",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16482395, /*Secondary*/16070190,/*ThirdColor*/16409912, 
							/*WhiteColor*/16750423, /*Glow Bits*/16069120, /*GreyColor*/10898486, 
							/*FourthColor*/16482395, /*FifthColor*/16069120}));
	public static final RegistryObject<Item>  OldPhotoColorizer = Items.register("colorizeroldphoto",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/8542759, /*Secondary*/10908982,/*ThirdColor*/10712638, 
							/*WhiteColor*/13345650, /*Glow Bits*/7030815, /*GreyColor*/6444358, 
							/*FourthColor*/8542759, /*FifthColor*/7030815}));
	
	//Megaman 2: The power Fighters
	public static final RegistryObject<Item> PharaohWaveColorizer = Items.register("colorizerpharaohwave",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/15435264, /*Secondary*/16747627, -1, -1, -1, -1, 
							/*FourthColor*/15435264, /*FifthColor*/-1}));
	public static final RegistryObject<Item> CentaurArrowColorizer = Items.register("colorizercentaurarrow",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/4048736, /*Secondary*/7011215, -1, -1, -1, -1, 
							/*FourthColor*/4048736, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> IceWave = Items.register("colorizericewave",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/3385087, /*Secondary*/16625195, -1, -1, -1, -1, 
					/*FourthColor*/16625195, /*FifthColor*/-1}));
	public static final RegistryObject<Item> FireSwordColorizer = Items.register("colorizerfiresword",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16386638, /*Secondary*/16747290, -1, -1, -1, -1, 
					/*FourthColor*/16747290, /*FifthColor*/-1}));
	public static final RegistryObject<Item> TornadoHoldColorizer = Items.register("colorizertornadohold",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1216876, /*Secondary*/13785337, -1, -1, -1, -1, 
					/*FourthColor*/13785337, /*FifthColor*/-1}));
	public static final RegistryObject<Item> WaterBaloonColorizer = Items.register("colorizerwaterbaloon",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/11341309, /*Secondary*/1103260, -1, -1, -1, -1, 
					/*FourthColor*/1103260, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ThunderClawColorizer = Items.register("colorizerthunderclaw",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/13725184, /*Secondary*/43248, -1, -1, -1, -1, 
					/*FourthColor*/43248, /*FifthColor*/-1}));
	public static final RegistryObject<Item> FlashBombColorizer = Items.register("colorizerflashbomb",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1147308, /*Secondary*/16625195, -1, -1, -1, -1, 
					/*FourthColor*/16625195, /*FifthColor*/-1}));
	public static final RegistryObject<Item> HomingSniperColorizer = Items.register("colorizerhomingsniper",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/13335066, /*Secondary*/1745611, -1, -1, -1, -1, 
					/*FourthColor*/1745611, /*FifthColor*/-1}));
	public static final RegistryObject<Item> AstroCrushColorizer = Items.register("colorizerastrocrush",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/442754, /*Secondary*/16757786, -1, -1, -1, -1, 
					/*FourthColor*/16757786, /*FifthColor*/-1}));
	public static final RegistryObject<Item> MegaBallColorizer = Items.register("colorizermegaball",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/14227325, /*Secondary*/1556185, -1, -1, -1, -1, 
					/*FourthColor*/1556185, /*FifthColor*/-1}));

	public static final RegistryObject<Item> BlackHoleBombColorizer = Items.register("colorizerblackholebomb",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/9067433, /*Secondary*/13017055, -1, -1, -1, -1, 
					/*FourthColor*/5227609, /*FifthColor*/-1}));
	//???5227609
	public static final RegistryObject<Item> HornetChaserColorizer = Items.register("colorizerhornetchaser",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16755487, /*Secondary*/16775080, -1, -1, -1, -1, 
							/*FourthColor*/11693333, /*FifthColor*/-1}));
			//???11693333
	public static final RegistryObject<Item> ConcreteShotColorizer = Items.register("colorizerconcreteshot",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/4872007, /*Secondary*/10336154, -1, -1, -1, -1, 
							/*FourthColor*/14854424, /*FifthColor*/-1}));
			//???14854424
	public static final RegistryObject<Item> PlugBallColorizer = Items.register("colorizerplugball",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16756142, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/15337082, /*FifthColor*/-1}));
			//???15337082
	public static final RegistryObject<Item> JewelSatelliteColorizer = Items.register("colorizerjewelsatellite",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/7929013, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/16624653, /*FifthColor*/-1}));
			//???16624653
	public static final RegistryObject<Item> LaserTridentColorizer = Items.register("colorizerlasertrident",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/9344762, /*Secondary*/16569859, -1, -1, -1, -1, 
							/*FourthColor*/16553987, /*FifthColor*/-1}));
			//???16553987
	public static final RegistryObject<Item> TornadoBlowColorizer = Items.register("colorizertornadoblow",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/252672, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/672511, /*FifthColor*/-1}));
			//???672511
	public static final RegistryObject<Item> MagmaBazookaColorizer = Items.register("colorizermagmabazooka",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16719667, /*Secondary*/16762143, -1, -1, -1, -1, 
							/*FourthColor*/15503374, /*FifthColor*/-1}));
			//???15503374
	
	public static final RegistryObject<Item> ChillSpikeColorizer = Items.register("colorizerchillspike",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/3841152, /*Secondary*/64179, -1, -1, -1, -1, 
							/*FourthColor*/16490761, /*FifthColor*/-1}));
	public static final RegistryObject<Item> CommandoBombColorizer = Items.register("colorizercommandobomb",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16657424, /*Secondary*/12763842, -1, -1, -1, -1, 
							/*FourthColor*/4039746, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ReboundStrikerColorizer = Items.register("colorizerreboundstriker",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/11207557, /*Secondary*/16741794, -1, -1, -1, -1, 
							/*FourthColor*/8072882, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SolarBlazeColorizer = Items.register("colorizersolarblaze",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16515843, /*Secondary*/16558385, -1, -1, -1, -1, 
							/*FourthColor*/11112442, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ThunderWoolColorizer = Items.register("colorizerthunderwool",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/7237230, /*Secondary*/16642056, -1, -1, -1, -1, 
							/*FourthColor*/16642056, /*FifthColor*/-1}));
	public static final RegistryObject<Item> TripleBladeColorizer = Items.register("colorizertripleblade",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16056396, /*Secondary*/16769514, -1, -1, -1, -1, 
							/*FourthColor*/16104960, /*FifthColor*/-1}));
	public static final RegistryObject<Item> WaterShieldColorizer = Items.register("colorizerwatershield",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/1060305, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/16774154, /*FifthColor*/-1}));
	public static final RegistryObject<Item> WheelCutterColorizer = Items.register("colorizerwheelcutter",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/4671303, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/16515843, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> BalladeCrackerColorizer = Items.register("colorizerballadecracker",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/8542707, /*Secondary*/16182183, -1, -1, -1, -1, 
							/*FourthColor*/16763663, /*FifthColor*/-1}));
	public static final RegistryObject<Item> MirrorBusterColorizer = Items.register("colorizermirrorbuster",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/5260189, /*Secondary*/16769044, -1, -1, -1, -1, 
							/*FourthColor*/5260189, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ScrewCrusherColorizer = Items.register("colorizerscrewcrusher",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/15481895, /*Secondary*/16767958, -1, -1, -1, -1, 
							/*FourthColor*/16641875, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> BlockDropperColorizer = Items.register("colorizerblockdropper",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/589270, /*Secondary*/13816742, -1, -1, -1, -1, 
							/*FourthColor*/16305973, /*FifthColor*/-1}));
			//???16305973
	public static final RegistryObject<Item> ScrambleThunderColorizer = Items.register("colorizerscramblethunder",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/12779279, /*Secondary*/5001279, -1, -1, -1, -1, 
							/*FourthColor*/3707391, /*FifthColor*/-1}));
			//???3707391
	public static final RegistryObject<Item> ChainBlastColorizer = Items.register("colorizerchainblast",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/6816764, /*Secondary*/16515843, -1, -1, -1, -1, 
							/*FourthColor*/14803653, /*FifthColor*/-1}));
			//???14803653
	public static final RegistryObject<Item> AcidBarrierColorizer = Items.register("colorizeracidbarrier",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/60236, /*Secondary*/14375145, -1, -1, -1, -1, 
							/*FourthColor*/16055835, /*FifthColor*/-1}));
			//???16055835
	public static final RegistryObject<Item> TundraStormColorizer = Items.register("colorizertundrastorm",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/11158526, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/14631934, /*FifthColor*/-1}));
			//???14631934
	public static final RegistryObject<Item> BlazingTorchColorizer = Items.register("colorizerblazingtorch",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16724004, /*Secondary*/12763842, -1, -1, -1, -1, 
							/*FourthColor*/13372160, /*FifthColor*/-1}));
			//???13372160
	public static final RegistryObject<Item> BounceBallColorizer = Items.register("colorizerbounceball",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16721026, /*Secondary*/16711552, -1, -1, -1, -1, 
							/*FourthColor*/2424821, /*FifthColor*/-1}));
			//???2424821
	public static final RegistryObject<Item> PileDriverColorizer = Items.register("colorizerpiledriver",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16552482, /*Secondary*/7300399, -1, -1, -1, -1, 
							/*FourthColor*/16577314, /*FifthColor*/-1}));
			//???14408667
	
	public static final RegistryObject<Item> SparkChaserColorizer = Items.register("colorizersparkchaser",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/3623072, /*Secondary*/4035758, -1, -1, -1, -1, 
							/*FourthColor*/4035758, /*FifthColor*/-1}));
	public static final RegistryObject<Item> GrabBusterColorizer = Items.register("colorizergrabbuster",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/8912645, /*Secondary*/16693459, -1, -1, -1, -1, 
							/*FourthColor*/6307465, /*FifthColor*/-1}));
	public static final RegistryObject<Item> BubbleBombColorizer = Items.register("colorizerbubblebomb",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16645893, /*Secondary*/16711597, -1, -1, -1, -1, 
							/*FourthColor*/11216429, /*FifthColor*/-1}));
	public static final RegistryObject<Item> PhotonMissileColorizer = Items.register("colorizerphotonmissile",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/8413695, /*Secondary*/16761375, -1, -1, -1, -1, 
							/*FourthColor*/11216429, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ElectricShockColorizer = Items.register("colorizerelectricshock",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/2539813, /*Secondary*/16643853, -1, -1, -1, -1, 
							/*FourthColor*/64182, /*FifthColor*/-1}));
	public static final RegistryObject<Item> BlackHoleColorizer = Items.register("colorizerblackhole",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/0, /*Secondary*/16775106, -1, -1, -1, -1, 
							/*FourthColor*/9387837, /*FifthColor*/-1}));
	public static final RegistryObject<Item> DeepDiggerColorizer = Items.register("colorizerdeepdigger",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/12924715, /*Secondary*/16775301, -1, -1, -1, -1, 
							/*FourthColor*/14634006, /*FifthColor*/-1}));
	public static final RegistryObject<Item> BreakDashColorizer = Items.register("colorizerbreakdash",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/9830818, /*Secondary*/16698846, -1, -1, -1, -1, 
							/*FourthColor*/16445962, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SaltWaterColorizer = Items.register("colorizersaltwater",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/2107390, /*Secondary*/15461631, -1, -1, -1, -1, 
							/*FourthColor*/16445962, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> TenguBladeColorizer = Items.register("colorizertengublade",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/7566195, /*Secondary*/14079702, -1, -1, -1, -1, 
							/*FourthColor*/14079702, /*FifthColor*/-1}));
			//???14079702
	public static final RegistryObject<Item> CopyVisionColorizer = Items.register("colorizercopyvision",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/4431411, /*Secondary*/9109247, -1, -1, -1, -1, 
							/*FourthColor*/9109247, /*FifthColor*/-1}));
			//???9109247
	public static final RegistryObject<Item> LightningBoltColorizer = Items.register("colorizerlightningbolt",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16230146, /*Secondary*/7697781, -1, -1, -1, -1, 
							/*FourthColor*/7697781, /*FifthColor*/-1}));
			//???7697781
	public static final RegistryObject<Item> IceWallColorizer = Items.register("colorizericewall",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/3882395, /*Secondary*/14342887, -1, -1, -1, -1, 
							/*FourthColor*/714342887, /*FifthColor*/-1}));
			//???714342887
	public static final RegistryObject<Item> SpreadDrillColorizer = Items.register("colorizerspreaddrill",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/15088404, /*Secondary*/8750469, -1, -1, -1, -1, 
							/*FourthColor*/8750469, /*FifthColor*/-1}));
			//???8750469
	public static final RegistryObject<Item> RemoteMineColorizer = Items.register("colorizerremotemine",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/3684408, /*Secondary*/16724843, -1, -1, -1, -1, 
							/*FourthColor*/16724843, /*FifthColor*/-1}));
			//???16724843
	public static final RegistryObject<Item> WaveBurnerColorizer = Items.register("colorizerwaveburner",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16715567, /*Secondary*/16754759, -1, -1, -1, -1, 
							/*FourthColor*/16754759, /*FifthColor*/-1}));
			//???16754759
	public static final RegistryObject<Item> MagicCardColorizer = Items.register("colorizermagiccard",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/6381921, /*Secondary*/16740599, -1, -1, -1, -1, 
							/*FourthColor*/16740599, /*FifthColor*/-1}));
			//???16740599
	
	public static final RegistryObject<Item> BitCannonColorizer = Items.register("colorizerbitcannon",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16772961, /*Secondary*/15203837, -1, -1, -1, -1, 
							/*FourthColor*/9079434, /*FifthColor*/-1}));
			//???9079434
	public static final RegistryObject<Item> BladeLauncherColorizer = Items.register("colorizerbladelauncher",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16605943, /*Secondary*/15203837, -1, -1, -1, -1, 
							/*FourthColor*/9079434, /*FifthColor*/-1}));
			//???9079434
	public static final RegistryObject<Item> OilStreamColorizer = Items.register("colorizeroilstream",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/12540982, /*Secondary*/15203837, -1, -1, -1, -1, 
							/*FourthColor*/9079434, /*FifthColor*/-1}));
			//???9079434
	public static final RegistryObject<Item> SharkBoomerangColorizer = Items.register("colorizersharkboomerang",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/8847086, /*Secondary*/15203837, -1, -1, -1, -1, 
							/*FourthColor*/9079434, /*FifthColor*/-1}));
			//???9079434
	public static final RegistryObject<Item> WaterShooterColorizer = Items.register("colorizerwatershooter",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/4244661, /*Secondary*/15203837, -1, -1, -1, -1, 
							/*FourthColor*/9079434, /*FifthColor*/-1}));
			//???9079434
	public static final RegistryObject<Item> TorchArmColorizer = Items.register("colorizertorcharm",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16607336, /*Secondary*/15203837, -1, -1, -1, -1, 
							/*FourthColor*/9079434, /*FifthColor*/-1}));
			//???9079434
	
	public static final RegistryObject<Item> XColorizer = Items.register("colorizerx",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/2781423, /*Secondary*/5752303, /*ThirdColor*/16642337, 
							/*WhiteColor*/16777215, /*Glow Bits*/16468504, /*GreyColor*/16777215, 
							/*FourthColor*/9614024, /*FifthColor*/2935135}));
	
	public static final RegistryObject<Item> XVariantColorizer = Items.register("colorizerxvariant",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/10193272, /*Secondary*/16777215, /*ThirdColor*/14666399, 
							/*WhiteColor*/16777215, /*Glow Bits*/9737364, /*GreyColor*/16777215, 
							/*FourthColor*/16745738, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> ZeroColorizer = Items.register("colorizerzero",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16711680, /*Secondary*/2171169, /*ThirdColor*/16763151, 
							/*WhiteColor*/16777215, /*Glow Bits*/2448340, /*GreyColor*/16777215, 
							/*FourthColor*/-1, /*FifthColor*/2752307}));
	public static final RegistryObject<Item> BlackZeroColorizer = Items.register("colorizerblackzero",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3158064, /*Secondary*/2171169, /*ThirdColor*/15455871, 
							/*WhiteColor*/16777215, /*Glow Bits*/2448340, /*GreyColor*/16777215, 
							/*FourthColor*/-1, /*FifthColor*/2752307}));
	public static final RegistryObject<Item> FakeZeroColorizer = Items.register("colorizerfakezero",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3158064, /*Secondary*/2171169, /*ThirdColor*/11250603, 
							/*WhiteColor*/16777215, /*Glow Bits*/16712448, /*GreyColor*/16777215, 
							/*FourthColor*/-1, /*FifthColor*/2752307}));
	public static final RegistryObject<Item> IrregularZeroColorizer = Items.register("colorizerirregularzero",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3158064, /*Secondary*/14451901, /*ThirdColor*/6776040, 
							/*WhiteColor*/14737632, /*Glow Bits*/2448340, /*GreyColor*/16777215, 
							/*FourthColor*/-1, /*FifthColor*/14724096}));
	public static final RegistryObject<Item> NightmareZeroColorizer = Items.register("colorizerzeronightmare",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/11277567, /*Secondary*/2171169, /*ThirdColor*/13402830, /*WhiteColor*/9764845,
							/*Glow Bits*/1376087, /*GreyColor*/9614024, 
							/*FourthColor*/-1, /*FifthColor*/1376087}));
	
	public static final RegistryObject<Item> RyuColorizer = Items.register("colorizerryu",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16714296, /*Secondary*/7368816, /*ThirdColor*/16714296, 
							/*WhiteColor*/16777215, /*Glow Bits*/2086655, /*GreyColor*/16777215, 
							/*FourthColor*/9331247, /*FifthColor*/-1}));
	public static final RegistryObject<Item> Ryu2PColorizer = Items.register("colorizerryu2p",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16777215, /*Secondary*/0, /*ThirdColor*/7423539, 
							/*WhiteColor*/10405596, /*Glow Bits*/2086655, /*GreyColor*/10405596, 
							/*FourthColor*/9331247, /*FifthColor*/-1}));
	public static final RegistryObject<Item> EvilRyuColorizer = Items.register("colorizerryuevil",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16714296, 7368816, 7423539, 4539758, 2086655, 4539758, 
							9331247, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> iXColorizer = Items.register("colorizerix",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/2196050, /*Secondary*/8507304, /*ThirdColor*/14227325, 
							/*WhiteColor*/15325417, /*Glow Bits*/14680095, /*GreyColor*/8479030, 
							/*FourthColor*/8677522, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> AxlColorizer = Items.register("colorizeraxl",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/4277608, /*Secondary*/9478540, /*ThirdColor*/16756992, 
							/*WhiteColor*/15395563, /*Glow Bits*/14690596, /*GreyColor*/9212065, 
							/*FourthColor*/7249368, /*FifthColor*/-1}));
	//Blue parts 7249368
	public static final RegistryObject<Item> whiteAxlColorizer = Items.register("colorizeraxlwhite",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15790320, /*Secondary*/11045541, /*ThirdColor*/5480762, 
							/*WhiteColor*/15790320, /*Glow Bits*/7690198, /*GreyColor*/7295596, 
							/*FourthColor*/7249368, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item>  VileColorizer = Items.register("colorizervile",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/8728033, /*Secondary*/5066061,/*ThirdColor*/16772915, 
							/*WhiteColor*/16777215, /*Glow Bits*/16728361, /*GreyColor*/12105912, 
							/*FourthColor*/3892666, /*FifthColor*/6470203}));
	
	public static final RegistryObject<Item> RollingShieldColorizer = Items.register("colorizerrollingshield",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16727426, /*Secondary*/11325589, -1, -1, -1, -1, 
							/*FourthColor*/16752290, /*FifthColor*/-1}));
	public static final RegistryObject<Item> BoomerangCutterColorizer = Items.register("colorizerboomerangcutter",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/8290996, /*Secondary*/11063731, -1, -1, -1, -1, 
							/*FourthColor*/13806308, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ShotgunIceColorizer = Items.register("colorizershotgunice",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/3661819, /*Secondary*/16042302, -1, -1, -1, -1, 
							/*FourthColor*/16777215, /*FifthColor*/-1}));
	public static final RegistryObject<Item> FireWaveColorizer = Items.register("colorizerfirewave",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16662283, /*Secondary*/16691754, -1, -1, -1, -1, 
							/*FourthColor*/16683014, /*FifthColor*/-1}));
	public static final RegistryObject<Item> StormTornadoColorizer = Items.register("colorizerstormtornado",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/10309308, /*Secondary*/15635914, -1, -1, -1, -1, 
							/*FourthColor*/15304360, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ElectricSparkColorizer = Items.register("colorizerelectricspark",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16754975, /*Secondary*/15326926, -1, -1, -1, -1, 
							/*FourthColor*/16432896, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ChameleonStingColorizer = Items.register("colorizerchameleonsting",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/1357897, /*Secondary*/9173186, -1, -1, -1, -1, 
							/*FourthColor*/11196272, /*FifthColor*/-1}));
	public static final RegistryObject<Item> HomingTorpedoColorizer = Items.register("colorizerhomingtorpedo",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/6978666, /*Secondary*/14070390, -1, -1, -1, -1, 
							/*FourthColor*/12436187, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> SpeedBurnerColorizer = Items.register("colorizerspeedburner",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15404288, /*Secondary*/11794431, -1, -1, -1, -1, 
							/*FourthColor*/11794431, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SilkShotColorizer = Items.register("colorizersilkshot",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16342052, /*Secondary*/5439380, -1, -1, -1, -1, 
							/*FourthColor*/5439380, /*FifthColor*/-1}));
	public static final RegistryObject<Item> CrystalHunterColorizer = Items.register("colorizercrystalhunter",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/5563384, /*Secondary*/15180534, -1, -1, -1, -1, 
					/*FourthColor*/15180534, /*FifthColor*/-1}));
	public static final RegistryObject<Item> BubbleSplashColorizer = Items.register("colorizerbubblesplash",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15646225, /*Secondary*/16425956, -1, -1, -1, -1, 
							/*FourthColor*/16425956, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SonicSlicerColorizer = Items.register("colorizersonicslicer",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/8080379, /*Secondary*/16752174, -1, -1, -1, -1, 
							/*FourthColor*/16752174, /*FifthColor*/-1}));
	public static final RegistryObject<Item> StrikeChainColorizer = Items.register("colorizerstrikechain",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/12554489, /*Secondary*/12237498, -1, -1, -1, -1, 
							/*FourthColor*/12237498, /*FifthColor*/-1}));
	public static final RegistryObject<Item> MagnetMineColorizer = Items.register("colorizermagnetmine",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/7237230, /*Secondary*/16577329, -1, -1, -1, -1, 
							/*FourthColor*/16577329, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SpinWheelColorizer = Items.register("colorizerspinwheel",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/2275643, /*Secondary*/14858219, -1, -1, -1, -1, 
							/*FourthColor*/14858219, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> DrainedColorizer = Items.register("colorizerdrained",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/6047422, /*Secondary*/8234928, /*ThirdColor*/-1, /*WhiteColor*/14863069,
							/*Glow Bits*/12943768, /*GreyColor*/14863069, 
							/*FourthColor*/8234928, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SpeedBurnerChargedColorizer = Items.register("colorizerchargedspeedburner",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16739610, /*Secondary*/16497985, /*ThirdColor*/16771354, /*WhiteColor*/14067743,
							/*Glow Bits*/16066304, /*GreyColor*/14054431, 
							/*FourthColor*/16497985, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> TunnelFangColorizer = Items.register("colorizertunnelfang",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6094814, /*Secondary*/15836731, -1, -1, -1, -1, 
							/*FourthColor*/15836731, /*FifthColor*/-1}));
	public static final RegistryObject<Item> GravityWellsColorizer = Items.register("colorizergravitywells",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15095287, /*Secondary*/13874312, -1, -1, -1, -1, 
							/*FourthColor*/13874312, /*FifthColor*/-1}));
	public static final RegistryObject<Item> AcidBurstColorizer = Items.register("colorizeracidburst",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6946631, /*Secondary*/16759864, -1, -1, -1, -1, 
							/*FourthColor*/16759864, /*FifthColor*/-1}));
	public static final RegistryObject<Item> RaySplasherColorizer = Items.register("colorizerraysplasher",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16224776, /*Secondary*/16249608, -1, -1, -1, -1, 
							/*FourthColor*/16249608, /*FifthColor*/-1}));
	public static final RegistryObject<Item> FrostSheildColorizer = Items.register("colorizerfrostsheild",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6807766, /*Secondary*/13466071, -1, -1, -1, -1, 
							/*FourthColor*/13466071, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ParasiticBombColorizer = Items.register("colorizerparasiticbomb",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16776960, /*Secondary*/10937034, -1, -1, -1, -1, 
							/*FourthColor*/10937034, /*FifthColor*/-1}));
	public static final RegistryObject<Item> TriadThunderColorizer = Items.register("colorizertriadthunder",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/8985598, /*Secondary*/10482854, -1, -1, -1, -1, 
							/*FourthColor*/10482854, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SpinningBladeColorizer = Items.register("colorizerspinningblade",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16725514, /*Secondary*/12762557, -1, -1, -1, -1, 
							/*FourthColor*/12762557, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item>HyperchipColorizer = Items.register("colorizerhyperchip",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer).fireResistant()
					, new int[]{/*Main*/16755999, /*Secondary*/16764969, /*ThirdColor*/-1, /*WhiteColor*/16703105,
							/*Glow Bits*/16728361, /*GreyColor*/16703105, 
							/*FourthColor*/16764969, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> HelmetchipColorizer = Items.register("colorizerhelmetchip",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer).fireResistant()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/4039746,
							/*Glow Bits*/-1, /*GreyColor*/-1, 
							/*FourthColor*/-1, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> ArmorchipColorizer = Items.register("colorizerarmorchip",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/14076974,
							/*Glow Bits*/-1, /*GreyColor*/-1, /*FourthColor*/-1, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> LegchipColorizer = Items.register("colorizerlegchip",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/1723647,
							/*Glow Bits*/-1, /*GreyColor*/-1, /*FourthColor*/-1, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> BusterchipColorizer = Items.register("colorizerbusterchip",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/16716836,
							/*Glow Bits*/-1, /*GreyColor*/-1, /*FourthColor*/-1, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> BetaHyperchipColorizer = Items.register("colorizerbetahyperchip",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/3552822,
							/*Glow Bits*/-1, /*GreyColor*/-1, /*FourthColor*/-1, /*FifthColor*/-1}));
	
	//X4
	public static final RegistryObject<Item> XalternateColorizer = Items.register("colorizerxalternate",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/2781423, /*Secondary*/11891667, -1, -1, -1, -1, 
							/*FourthColor*/-1, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> LightningWebColorizer = Items.register("colorizerlightningweb",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/14406451, /*Secondary*/7368816, -1, -1, -1, -1, 
							/*FourthColor*/7368816, /*FifthColor*/-1}));
	public static final RegistryObject<Item> FrostTowerColorizer = Items.register("colorizerfrosttower",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6148303, /*Secondary*/12036285, -1, -1, -1, -1, 
							/*FourthColor*/12036285, /*FifthColor*/-1}));
	public static final RegistryObject<Item> DoubleCycloneColorizer = Items.register("colorizerdoublecyclone",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/5354030, /*Secondary*/16635671, -1, -1, -1, -1, 
							/*FourthColor*/16635671, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SoulBodyColorizer = Items.register("colorizersoulbody",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15231782, /*Secondary*/15517269, -1, -1, -1, -1, 
							/*FourthColor*/15517269, /*FifthColor*/-1}));
	public static final RegistryObject<Item> GroundHunterColorizer = Items.register("colorizergroundhunter",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/13980559, /*Secondary*/4122083, -1, -1, -1, -1, 
							/*FourthColor*/4122083, /*FifthColor*/-1}));
	public static final RegistryObject<Item> TwinSlasherColorizer = Items.register("colorizertwinslasher",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/7631736, /*Secondary*/16631580, -1, -1, -1, -1, 
							/*FourthColor*/16631580, /*FifthColor*/-1}));
	public static final RegistryObject<Item> AimingLaserColorizer = Items.register("colorizeraiminglaser",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/10569977, /*Secondary*/1506982, -1, -1, -1, -1, 
							/*FourthColor*/1506982, /*FifthColor*/-1}));
	public static final RegistryObject<Item> RisingFireColorizer = Items.register("colorizerrisingfire",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/14365493, /*Secondary*/13226628, -1, -1, -1, -1, 
							/*FourthColor*/13226628, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> DarkHoldColorizer = Items.register("colorizerdarkhold",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/13322459, /*Secondary*/16226250, -1, -1, -1, -1, 
							/*FourthColor*/16226250, /*FifthColor*/-1}));
	public static final RegistryObject<Item> TriThunderColorizer = Items.register("colorizertrithunder",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3684408, /*Secondary*/16120917, -1, -1, -1, -1, 
							/*FourthColor*/16120917, /*FifthColor*/-1}));
	public static final RegistryObject<Item> CrescentShotColorizer = Items.register("colorizercrescentshot",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/9992535, /*Secondary*/16615954, -1, -1, -1, -1, 
							/*FourthColor*/16615954, /*FifthColor*/-1}));
	public static final RegistryObject<Item> WingSpiralColorizer = Items.register("colorizerwingspiral",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/12442879, /*Secondary*/13760840, -1, -1, -1, -1, 
							/*FourthColor*/13760840, /*FifthColor*/-1}));
	public static final RegistryObject<Item> FlashLaserColorizer = Items.register("colorizerflashlaser",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16750628, /*Secondary*/7492530, -1, -1, -1, -1, 
							/*FourthColor*/7492530, /*FifthColor*/-1}));
	public static final RegistryObject<Item> GooShaverColorizer = Items.register("colorizergooshaver",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/5258649, /*Secondary*/16750628, -1, -1, -1, -1, 
							/*FourthColor*/16750628, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SpikeBallColorizer = Items.register("colorizerspikeball",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/4774748, /*Secondary*/16625620, -1, -1, -1, -1, 
							/*FourthColor*/16625620, /*FifthColor*/-1}));
	public static final RegistryObject<Item> GroundFireColorizer = Items.register("colorizergroundfire",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15861511, /*Secondary*/15891975, -1, -1, -1, -1, 
							/*FourthColor*/15891975, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> MagmaBladeColorizer = Items.register("colorizermagmablade",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16680982, /*Secondary*/16708480, -1, -1, -1, -1, 
							/*FourthColor*/16708480, /*FifthColor*/-1}));
	public static final RegistryObject<Item> MeteorRainColorizer = Items.register("colorizermeteorrain",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6184797, /*Secondary*/15208194, -1, -1, -1, -1, 
							/*FourthColor*/15208194, /*FifthColor*/-1}));
	public static final RegistryObject<Item> GuardShellColorizer = Items.register("colorizerguardshell",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16739227, /*Secondary*/16773739, -1, -1, -1, -1, 
							/*FourthColor*/16773739, /*FifthColor*/-1}));
	public static final RegistryObject<Item> RayArrowColorizer = Items.register("colorizerrayarrow",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/13765375, /*Secondary*/12445138, -1, -1, -1, -1, 
							/*FourthColor*/12445138, /*FifthColor*/-1}));
	public static final RegistryObject<Item> IceBurstColorizer = Items.register("colorizericeburst",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/7458036, /*Secondary*/9676764, -1, -1, -1, -1, 
							/*FourthColor*/9676764, /*FifthColor*/-1}));
	public static final RegistryObject<Item> GroundDashColorizer = Items.register("colorizergrounddash",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/11436635, /*Secondary*/14388557, -1, -1, -1, -1, 
							/*FourthColor*/14388557, /*FifthColor*/-1}));
	public static final RegistryObject<Item> YammerOptionColorizer = Items.register("colorizeryammeroption",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3649101, /*Secondary*/15371822, -1, -1, -1, -1, 
							/*FourthColor*/15371822, /*FifthColor*/-1}));
	public static final RegistryObject<Item> MetalAnchorColorizer = Items.register("colorizermetalanchor",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/7174330, /*Secondary*/16184763, -1, -1, -1, -1, 
							/*FourthColor*/16184763, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> VoltTornadoColorizer = Items.register("colorizervolttornado",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15105024, /*Secondary*/13550887, -1, -1, -1, -1, 
							/*FourthColor*/7830403, /*FifthColor*/-1}));
	//??? 7830403
	public static final RegistryObject<Item> GaeaSheildColorizer = Items.register("colorizergaeashield",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/2189086, /*Secondary*/2013262, -1, -1, -1, -1, 
							/*FourthColor*/16762629, /*FifthColor*/-1}));
	//??? 16762629
	public static final RegistryObject<Item> WindCutterColorizer = Items.register("colorizerwindcutter",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/7357316, /*Secondary*/13854172, -1, -1, -1, -1, 
							/*FourthColor*/10386858, /*FifthColor*/-1}));
	//??? 10386858
	public static final RegistryObject<Item> SpashLaserColorizer = Items.register("colorizersplashlaser",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/2525888, /*Secondary*/5877967, -1, -1, -1, -1, 
							/*FourthColor*/10211059, /*FifthColor*/-1}));
	//??? 10211059
	public static final RegistryObject<Item> MovingWheelColorizer = Items.register("colorizermovingwheel",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6631963, /*Secondary*/10648341, -1, -1, -1, -1, 
							/*FourthColor*/7566195, /*FifthColor*/-1}));
	//??? 7566195
	public static final RegistryObject<Item> CircleBlazeColorizer = Items.register("colorizercircleblaze",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/9837853, /*Secondary*/15425632, -1, -1, -1, -1, 
							/*FourthColor*/16561984, /*FifthColor*/-1}));
	//??? 16561984
	public static final RegistryObject<Item> SniperMissileColorizer = Items.register("colorizersnipermissile",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/5395026, /*Secondary*/9078679, -1, -1, -1, -1, 
							/*FourthColor*/13417202, /*FifthColor*/-1}));
	//??? 13417202
	public static final RegistryObject<Item> ExplosionColorizer = Items.register("colorizerexplosion",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/11541590, /*Secondary*/14505354, -1, -1, -1, -1, 
							/*FourthColor*/15899837, /*FifthColor*/-1}));
	//??? 15899837
	
	public static final RegistryObject<Item> SqueezeBombColorizer = Items.register("colorizersqueezebomb",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/10884565, /*Secondary*/16722267, -1, -1, -1, -1, 
							/*FourthColor*/11194319, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ShadowRunnerColorizer = Items.register("colorizershadowrunner",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/2500134, /*Secondary*/6184542, -1, -1, -1, -1, 
							/*FourthColor*/11194319, /*FifthColor*/-1}));
	public static final RegistryObject<Item> DriftDiamondColorizer = Items.register("colorizerdriftdiamond",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/14087663, /*Secondary*/11655158, -1, -1, -1, -1, 
							/*FourthColor*/11194319, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ShiningRayColorizer = Items.register("colorizershiningray",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/13422614, /*Secondary*/15328380, -1, -1, -1, -1, 
							/*FourthColor*/11194319, /*FifthColor*/-1}));
	public static final RegistryObject<Item> MeltCreeperColorizer = Items.register("colorizermeltcreeper",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/12713984, /*Secondary*/16731924, -1, -1, -1, -1, 
							/*FourthColor*/11194319, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ThunderDancerColorizer = Items.register("colorizerthunderdancer",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3714450, /*Secondary*/15328083, -1, -1, -1, -1, 
							/*FourthColor*/11194319, /*FifthColor*/-1}));
	public static final RegistryObject<Item> GreenSpinnerColorizer = Items.register("colorizergreenspinner",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/2199576, /*Secondary*/8709912, -1, -1, -1, -1, 
							/*FourthColor*/11194319, /*FifthColor*/-1}));
	public static final RegistryObject<Item> CrystalWallColorizer = Items.register("colorizercrystalwall",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/7750942, /*Secondary*/13927461, -1, -1, -1, -1, 
							/*FourthColor*/11194319, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> MagneticShockwaveColorizer = Items.register("colorizermagneticshockwave",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/12454287, /*Secondary*/16714250, -1, -1, -1, -1, 
							/*FourthColor*/16714250, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> QuakeDrillColorizer = Items.register("colorizerquakedrill",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6991971, /*Secondary*/15723991, -1, -1, -1, -1, 
							/*FourthColor*/11366782, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> SonicShotColorizer = Items.register("colorizersonicshot",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/1015782, /*Secondary*/2928570, -1, -1, -1, -1, 
							/*FourthColor*/2928570, /*FifthColor*/-1}));
	public static final RegistryObject<Item> TailsWindColorizer = Items.register("colorizertailswind",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16748570, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/16777215, /*FifthColor*/-1}));
	public static final RegistryObject<Item> PikoHammerColorizer = Items.register("colorizerpikohammer",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/14366996, /*Secondary*/16091788, -1, -1, -1, -1, 
							/*FourthColor*/16091788, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SharpKnuckleColorizer = Items.register("colorizersharpknuckle",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/13378596, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/13378596, /*FifthColor*/-1}));
	public static final RegistryObject<Item> BlackWaveColorizer = Items.register("colorizerblackwave",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16514301, /*Secondary*/5717630, -1, -1, -1, -1, 
							/*FourthColor*/11366782, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ChaosCannonColorizer = Items.register("colorizerchaoscannon",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/5853803, /*Secondary*/13711150, -1, -1, -1, -1, 
							/*FourthColor*/0, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ChromaCamoColorizer = Items.register("colorizerchromacamo",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/10972326, /*Secondary*/8219815, -1, -1, -1, -1, 
							/*FourthColor*/8219815, /*FifthColor*/-1}));
	public static final RegistryObject<Item> RapidStingerColorizer = Items.register("colorizerrapidstinger",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6316646, /*Secondary*/16764457, -1, -1, -1, -1, 
							/*FourthColor*/16764457, /*FifthColor*/-1}));
	public static final RegistryObject<Item> AcousticBlasterColorizer = Items.register("colorizeracousticblaster",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/8504889, /*Secondary*/11518800, -1, -1, -1, -1, 
							/*FourthColor*/11518800, /*FifthColor*/-1}));
	public static final RegistryObject<Item> PsychoBurstColorizer = Items.register("colorizerpsychoburst",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/12972766, /*Secondary*/1406292, -1, -1, -1, -1, 
							/*FourthColor*/1406292, /*FifthColor*/-1}));
	public static final RegistryObject<Item> FireTornadoColorizer = Items.register("colorizerfiretornado",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/11956917, /*Secondary*/15582445, -1, -1, -1, -1, 
							/*FourthColor*/15582445, /*FifthColor*/-1}));
	
	
	public static final RegistryObject<Item> AegisReflectorColorizer = Items.register("colorizeraegisreflector",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
			new int[]{/*Main*/7829630, /*Secondary*/11771197, -1, -1, -1, -1, 
					/*FourthColor*/11771197, /*FifthColor*/-1}));
	public static final RegistryObject<Item> TropicHazardColorizer = Items.register("colorizertropichazard",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15685889, /*Secondary*/9958207, -1, -1, -1, -1, 
							/*FourthColor*/9958207, /*FifthColor*/-1}));
	public static final RegistryObject<Item> LightningKickColorizer = Items.register("colorizerlightningkick",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/2661627, /*Secondary*/15260234, -1, -1, -1, -1, 
							/*FourthColor*/15260234, /*FifthColor*/-1}));
	public static final RegistryObject<Item> OpticLaserColorizer = Items.register("colorizeropticlaser",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15663375, /*Secondary*/16777215, -1, -1, -1, -1, 
							/*FourthColor*/16777215, /*FifthColor*/-1}));
	public static final RegistryObject<Item> YogaInfernoColorizer = Items.register("colorizeryogainferno",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/14971649, /*Secondary*/15661074, -1, -1, -1, -1, 
							/*FourthColor*/15661074, /*FifthColor*/-1}));
	public static final RegistryObject<Item> MineSweeperColorizer = Items.register("colorizerminesweeper",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/8993577, /*Secondary*/1405988, -1, -1, -1, -1, 
							/*FourthColor*/1405988, /*FifthColor*/-1}));
	public static final RegistryObject<Item> SoulSatelliteColorizer = Items.register("colorizersoulsatellite",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/12193230, /*Secondary*/16721050, -1, -1, -1, -1, 
							/*FourthColor*/16721050, /*FifthColor*/-1}));
	public static final RegistryObject<Item> HadokenColorizer = Items.register("colorizerhadoken",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6583190, /*Secondary*/10266021, -1, -1, -1, -1, 
							/*FourthColor*/10266021, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> MegamanZeroColorizer = Items.register("colorizermegamanzero",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16586572, /*Secondary*/7688571, /*ThirdColor*/15645257, 
							/*WhiteColor*/16777215, /*Glow Bits*/8049085, /*GreyColor*/9659807, 
							/*FourthColor*/11974089, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> MegamanExeColorizer = Items.register("colorizermegamanexe",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3425221, /*Secondary*/3225453, /*ThirdColor*/16630571, 
							/*WhiteColor*/2378966, /*Glow Bits*/16646401, /*GreyColor*/2378966, 
							/*FourthColor*/1244562, /*FifthColor*/-1}));
	public static final RegistryObject<Item> DarkMegamanExeColorizer = Items.register("colorizermegamanexedark",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/9272262, /*Secondary*/5985395, /*ThirdColor*/12895428, 
							/*WhiteColor*/16777215, /*Glow Bits*/8285183, /*GreyColor*/12500673, 
							/*FourthColor*/13092807, /*FifthColor*/-1}));
	public static final RegistryObject<Item> DarkMegamanExeAnimeColorizer = Items.register("colorizermegamanexedarkanime",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6960566, /*Secondary*/6902644, /*ThirdColor*/11849546, 
							/*WhiteColor*/16777215, /*Glow Bits*/8151551, /*GreyColor*/12105912, 
							/*FourthColor*/11825407, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> HeatStyleColorizer = Items.register("colorizerheatstyle",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
			new int[]{/*Main*/15741765, /*Secondary*/7614234, -1, -1, -1, -1, 
					/*FourthColor*/16744592, /*FifthColor*/-1}));
	public static final RegistryObject<Item> AquaStyleColorizer = Items.register("colorizeraquastyle",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/10399467, /*Secondary*/3225699, -1, -1, -1, -1, 
							/*FourthColor*/12767231, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ElecStyleColorizer = Items.register("colorizerelecstyle",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16697642, /*Secondary*/6898720, -1, -1, -1, -1, 
							/*FourthColor*/16773463, /*FifthColor*/-1}));
	public static final RegistryObject<Item> WoodStyleColorizer = Items.register("colorizerwoodstyle",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/2284319, /*Secondary*/1988390, -1, -1, -1, -1, 
							/*FourthColor*/11861403, /*FifthColor*/-1}));
	public static final RegistryObject<Item> HeatBugStyleColorizer = Items.register("colorizerheatbugstyle",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/12598841, /*Secondary*/4990500, -1, -1, -1, -1, 
							/*FourthColor*/16748682, /*FifthColor*/-1}));
	public static final RegistryObject<Item> AquaBugStyleColorizer = Items.register("colorizeraquabugstyle",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/10517166, /*Secondary*/4928098, -1, -1, -1, -1, 
							/*FourthColor*/13093887, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ElecBugStyleColorizer = Items.register("colorizerelecbugstyle",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/12880663, /*Secondary*/4996384, -1, -1, -1, -1, 
							/*FourthColor*/16511579, /*FifthColor*/-1}));
	public static final RegistryObject<Item> WoodBugStyleColorizer = Items.register("colorizerwoodbugstyle",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/7966566, /*Secondary*/4148021, -1, -1, -1, -1, 
							/*FourthColor*/12639404, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> RollExeColorizer = Items.register("colorizerrollexe",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16744603, /*Secondary*/16138578, /*ThirdColor*/15525763, 
							/*WhiteColor*/16777215, /*Glow Bits*/16762900, /*GreyColor*/7757920, 
							/*FourthColor*/4599860, /*FifthColor*/-1}));
	public static final RegistryObject<Item> RollExeDSColorizer = Items.register("colorizerrollexeds",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/13397465, /*Secondary*/11010216, /*ThirdColor*/16096957, 
							/*WhiteColor*/14606046, /*Glow Bits*/15635223, /*GreyColor*/8157620, 
							/*FourthColor*/5920670, /*FifthColor*/-1}));
	public static final RegistryObject<Item> RollExeSPColorizer = Items.register("colorizerrollexesp",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16129639, /*Secondary*/12390200, /*ThirdColor*/15507070, 
							/*WhiteColor*/16777215, /*Glow Bits*/15769088, /*GreyColor*/3618883, 
							/*FourthColor*/3618883, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> ProtomanExeColorizer = Items.register("colorizerprotomanexe",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/14352384, /*Secondary*/4275532, /*ThirdColor*/16631836, 
							/*WhiteColor*/16777215, /*Glow Bits*/16631836, /*GreyColor*/16777215, 
							/*FourthColor*/9068229, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ProtomanExeDSColorizer = Items.register("colorizerprotomanexeds",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15477247, /*Secondary*/4275532, /*ThirdColor*/16680464, 
							/*WhiteColor*/11779276, /*Glow Bits*/16680464, /*GreyColor*/16777215, 
							/*FourthColor*/8226455, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ProtomanExeSPColorizer = Items.register("colorizerprotomanexesp",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16748564, /*Secondary*/4275532, /*ThirdColor*/16763412, 
							/*WhiteColor*/16777215, /*Glow Bits*/16763412, /*GreyColor*/16777215, 
							/*FourthColor*/9068229, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ProtomanExeDarkBCSColorizer = Items.register("colorizerprotomanexedarkbcs",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6631422, /*Secondary*/4275532, /*ThirdColor*/16631836, 
							/*WhiteColor*/16777215, /*Glow Bits*/16631836, /*GreyColor*/16777215, 
							/*FourthColor*/6631422, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> GutsmanExeColorizer = Items.register("colorizergutsmanexe",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16637468, /*Secondary*/16590620, /*ThirdColor*/5395026, 
							/*WhiteColor*/16777215, /*Glow Bits*/4296775, /*GreyColor*/12895428, 
							/*FourthColor*/4296775, /*FifthColor*/-1}));
	public static final RegistryObject<Item> GutsmanExeDSColorizer = Items.register("colorizergutsmanexeds",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16732798, /*Secondary*/13697184, /*ThirdColor*/6050171, 
							/*WhiteColor*/12763842, /*Glow Bits*/4038243, /*GreyColor*/10458546, 
							/*FourthColor*/4038243, /*FifthColor*/-1}));
	public static final RegistryObject<Item> GutsmanExeSPColorizer = Items.register("colorizergutsmanexesp",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16752681, /*Secondary*/16739896, /*ThirdColor*/5792638, 
							/*WhiteColor*/15592942, /*Glow Bits*/5724159, /*GreyColor*/10329529, 
							/*FourthColor*/5724159, /*FifthColor*/-1}));
	public static final RegistryObject<Item> GutsmanExeUnusedColorizer = Items.register("colorizergutsmanexeunused",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/9291571, /*Secondary*/2530409, /*ThirdColor*/5395026, 
							/*WhiteColor*/16777215, /*Glow Bits*/16719124, /*GreyColor*/12895428, 
							/*FourthColor*/16719124, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> NormNaviColorizer = Items.register("colorizernormnavi",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
			new int[]{/*Main*/7130142, /*Secondary*/15389210, /*ThirdColor*/6381921, 
					/*WhiteColor*/16777215, /*Glow Bits*/2292973, /*GreyColor*/6122100, 
					/*FourthColor*/6122100, /*FifthColor*/2292973}));
	
	public static final RegistryObject<Item> NormNaviBColorizer = Items.register("colorizernormnavib",
	() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
			new int[]{/*Main*/16458556, /*Secondary*/16747185, /*ThirdColor*/3560885, 
					/*WhiteColor*/16777215, /*Glow Bits*/3538184, /*GreyColor*/6122100, 
					/*FourthColor*/6122100, /*FifthColor*/3538184}));
	public static final RegistryObject<Item> NormNaviCColorizer = Items.register("colorizernormnavic",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/11950117, /*Secondary*/9282625, /*ThirdColor*/6381921, 
							/*WhiteColor*/16777215, /*Glow Bits*/16741376, /*GreyColor*/6122100, 
							/*FourthColor*/6122100, /*FifthColor*/16741376}));
	public static final RegistryObject<Item> NormNaviHeelColorizer = Items.register("colorizernormnaviheel",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/14222021, /*Secondary*/6184542, /*ThirdColor*/13043009, 
							/*WhiteColor*/16768271, /*Glow Bits*/16768271, /*GreyColor*/6184542, 
							/*FourthColor*/6184542, /*FifthColor*/16768271}));
	
	public static final RegistryObject<Item> NormNavi2Colorizer = Items.register("colorizernormnavi2",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15073530, /*Secondary*/15389210, /*ThirdColor*/6381921, 
							/*WhiteColor*/16777215, /*Glow Bits*/2292973, /*GreyColor*/6122100, 
							/*FourthColor*/6122100, /*FifthColor*/2292973}));
	public static final RegistryObject<Item> NormNavi3Colorizer = Items.register("colorizernormnavi3",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/5461973, /*Secondary*/15389210, /*ThirdColor*/6381921, 
							/*WhiteColor*/16777215, /*Glow Bits*/2292973, /*GreyColor*/6122100, 
							/*FourthColor*/6122100, /*FifthColor*/2292973}));
	public static final RegistryObject<Item> NormNavi4Colorizer = Items.register("colorizernormnavi4",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16536323, /*Secondary*/15389210, /*ThirdColor*/6381921, 
							/*WhiteColor*/16777215, /*Glow Bits*/2292973, /*GreyColor*/6122100, 
							/*FourthColor*/6122100, /*FifthColor*/2292973}));
	public static final RegistryObject<Item> NormNavi5Colorizer = Items.register("colorizernormnavi5",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/10728114, /*Secondary*/15389210, /*ThirdColor*/6381921, 
							/*WhiteColor*/16777215, /*Glow Bits*/2292973, /*GreyColor*/6122100, 
							/*FourthColor*/6122100, /*FifthColor*/2292973}));
	
	public static final RegistryObject<Item> NormNavitypeFColorizer = Items.register("colorizernormnavitypef",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16714287, /*Secondary*/16749732, /*ThirdColor*/6381921, 
							/*WhiteColor*/16777215, /*Glow Bits*/2292973, /*GreyColor*/6122100, 
							/*FourthColor*/6122100, /*FifthColor*/2292973}));
	public static final RegistryObject<Item> NormNavitypeAColorizer = Items.register("colorizernormnavitypea",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/32435, /*Secondary*/9501693, /*ThirdColor*/6381921, 
							/*WhiteColor*/16777215, /*Glow Bits*/2292973, /*GreyColor*/6122100, 
							/*FourthColor*/6122100, /*FifthColor*/2292973}));
	public static final RegistryObject<Item> NormNavitypeWColorizer = Items.register("colorizernormnavitypew",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/7912964, /*Secondary*/14261076, /*ThirdColor*/6381921, 
							/*WhiteColor*/16777215, /*Glow Bits*/2292973, /*GreyColor*/6122100, 
							/*FourthColor*/6122100, /*FifthColor*/2292973}));
	public static final RegistryObject<Item> NormNavitypeEColorizer = Items.register("colorizernormnavitypee",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15774776, /*Secondary*/15441605, /*ThirdColor*/6381921, 
							/*WhiteColor*/16777215, /*Glow Bits*/2292973, /*GreyColor*/6122100, 
							/*FourthColor*/6122100, /*FifthColor*/2292973}));
	public static final RegistryObject<Item> NormNavitypeXColorizer = Items.register("colorizernormnavitypex",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6908265, /*Secondary*/15810881, /*ThirdColor*/6573974, 
							/*WhiteColor*/16777215, /*Glow Bits*/2292973, /*GreyColor*/6122100, 
							/*FourthColor*/6122100, /*FifthColor*/2292973}));
	
	public static final RegistryObject<Item> StarforceMegamanColorizer = Items.register("colorizerstarforcemegaman",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/708351, /*Secondary*/4013982, /*ThirdColor*/16771133, 
							/*WhiteColor*/16777215, /*Glow Bits*/16727060, /*GreyColor*/13619151, 
							/*FourthColor*/4091380, /*FifthColor*/62814}));
	public static final RegistryObject<Item> StarforceGeoVersionColorizer = Items.register("colorizerstarforcegeoversion",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/14680832, /*Secondary*/3492713, /*ThirdColor*/16757007, 
							/*WhiteColor*/2378966, /*Glow Bits*/652954, /*GreyColor*/13619151, 
							/*FourthColor*/14680832, /*FifthColor*/652954}));
	
	public static final RegistryObject<Item> VolnuttColorizer = Items.register("colorizervolnutt",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3173117, 6736383, 15693594, 16777215, 13449015, 10000825, 
							10000825, /*FifthColor*/-1}));
	public static final RegistryObject<Item> Volnutt2PColorizer = Items.register("colorizervolnutt2p",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16728622, 12365515, 15451986, 16777215, 4044864, 10000825, 
							11641995, /*FifthColor*/-1}));
	public static final RegistryObject<Item> BadVolnuttColorizer = Items.register("colorizervolnuttbad",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/7562400, 9864881, 16307237, 14273511, 13449015, 9937839, 
							9864881, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> PachislotColorizer = Items.register("colorizerpachislot",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/4356095, 3489365, 11579568, 16579836, 3407723, 5395026, 
							8584431, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> BellSparkColorizer = Items.register("colorizerbellspark",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16682779, 3489365, 11449788, -1, -1, -1, 
							16509059, /*FifthColor*/-1}));
	public static final RegistryObject<Item> CoinBombColorizer = Items.register("colorizercoinbomb",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/9457109, 3489365, 11186619, -1, -1, -1, 
							13861343, /*FifthColor*/-1}));
	public static final RegistryObject<Item> LeverImpactColorizer = Items.register("colorizerleverimpact",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15152163, 3489365, 16628769, -1, -1, -1, 
							9187110, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ReplayShieldColorizer = Items.register("colorizerreplayshield",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/5610435, 3489365, 2963615, -1, -1, -1, 
							16777215, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ReverseBladeColorizer = Items.register("colorizerreverseblade",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3521367, 3489365, 16769095, -1, -1, -1, 
							16513918, /*FifthColor*/-1}));
	public static final RegistryObject<Item> ChanceBigBusterColorizer = Items.register("colorizerchancebigbuster",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/12171702, 3489365, 13421772, -1, -1, -1, 
							7098724, /*FifthColor*/-1}));
	
	public static final RegistryObject<Item> SifttoDarkColorizer = Items.register("colorizershiftdark",
			() -> new ArmorColorizerColorShift(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					,4013373 , 10));
	public static final RegistryObject<Item> SifttoLightColorizer = Items.register("colorizershiftlight",
			() -> new ArmorColorizerColorShift(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer)
					,14935011 , 10));

	
	public static final RegistryObject<Item> RandomColorizer = Items.register("colorizerrandom",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/-3, /*Secondary*/-3, -3, -3, -3, -3, 
							/*FourthColor*/-3, /*FifthColor*/-3}));
	
	public static final RegistryObject<Item> NegativeColorizer = Items.register("colorizernegative",
			() -> new ArmorColorizer(new Item.Properties().tab(MegamanArmorMod.ArmorColorizer).fireResistant(), 
					new int[]{/*Main*/-4, /*Secondary*/-4, -4, -4, -4, -4, 
							/*FourthColor*/-4, /*FifthColor*/-4}));
	
	public static final RegistryObject<Item> MainColorColorizer = Items.register("colorizermaincolor",
			() -> new ArmorColorizerCustom(new Item.Properties().tab(MegamanArmorMod.MMTab).fireResistant()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
							/*Glow Bits*/-1, /*GreyColor*/-1, /*FourthColor*/-1
							, /*FifthColor*/-1}, "MainColor"));
	public static final RegistryObject<Item> SecondaryColorColorizer = Items.register("colorizersecondarycolor",
			() -> new ArmorColorizerCustom(new Item.Properties().tab(MegamanArmorMod.MMTab).fireResistant()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
							/*Glow Bits*/-1, /*GreyColor*/-1, /*FourthColor*/-1
							, /*FifthColor*/-1}, "SecondaryColor"));
	public static final RegistryObject<Item> ThirdColorColorizer = Items.register("colorizerthirdcolor",
			() -> new ArmorColorizerCustom(new Item.Properties().tab(MegamanArmorMod.MMTab).fireResistant()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
							/*Glow Bits*/-1, /*GreyColor*/-1, /*FourthColor*/-1
							, /*FifthColor*/-1}, "ThirdColor"));
	public static final RegistryObject<Item> whiteColorColorizer = Items.register("colorizerwhitecolor",
			() -> new ArmorColorizerCustom(new Item.Properties().tab(MegamanArmorMod.MMTab).fireResistant()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
							/*Glow Bits*/-1, /*GreyColor*/-1, /*FourthColor*/-1
							, /*FifthColor*/-1}, "WhiteColor"));
	public static final RegistryObject<Item> GlowColorColorizer = Items.register("colorizerglowycolor",
			() -> new ArmorColorizerCustom(new Item.Properties().tab(MegamanArmorMod.MMTab).fireResistant()//.setISTER(ister)
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
							/*Glow Bits*/-1, /*GreyColor*/-1, /*FourthColor*/-1
							, /*FifthColor*/-1}, "GlowyColor"));
	public static final RegistryObject<Item> GrayColorColorizer = Items.register("colorizergraycolor",
			() -> new ArmorColorizerCustom(new Item.Properties().tab(MegamanArmorMod.MMTab).fireResistant()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
							/*Glow Bits*/-1, /*GreyColor*/-1, /*FourthColor*/-1
							, /*FifthColor*/-1}, "GrayColor"));
	public static final RegistryObject<Item> FourthColorColorizer = Items.register("colorizerfourthcolor",
			() -> new ArmorColorizerCustom(new Item.Properties().tab(MegamanArmorMod.MMTab).fireResistant()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
							/*Glow Bits*/-1, /*GreyColor*/-1, /*FourthColor*/-1
							, /*FifthColor*/-1}, "FourthColor"));
	public static final RegistryObject<Item> FifthColorColorizer = Items.register("colorizerfifthcolor",
			() -> new ArmorColorizerCustom(new Item.Properties().tab(MegamanArmorMod.MMTab).fireResistant()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
							/*Glow Bits*/-1, /*GreyColor*/-1, /*FourthColor*/-1
							, /*FifthColor*/-1}, "FifthColor"));
	
	public static final RegistryObject<Item> MegamanArmor_Head = Items.register("megamanarmor_head",
			() -> new MegamanArmorColor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> MegamanArmor_Body = Items.register("megamanarmor_body",
			() -> new MegamanArmorColor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> MegamanArmor_Legs = Items.register("megamanarmor_legs",
			() -> new MegamanArmorLegsColor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> MegamanArmor_Arms = Items.register("megamanarmor_arms",
			() -> new MegamanArmorColor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> MegamanArmorEvil = Items.register("megamanevil",
			() -> new com.collecter128.megamanarmormod.items.MegamanArmorEvil(ArmorMaterials.MegamanArmor, 
					EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> QuintArmor_Head = Items.register("quintarmor_head",
			() -> new QuintArmor(ArmorMaterials.QuintArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> QuintArmor_Body = Items.register("quintarmor_body",
			() -> new QuintArmor(ArmorMaterials.QuintArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> QuintArmor_Legs = Items.register("quintarmor_legs",
			() -> new QuintArmor(ArmorMaterials.QuintArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> QuintArmor_Arms = Items.register("quintarmor_arms",
			() -> new QuintArmor(ArmorMaterials.QuintArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> RockmanShadow_Head = Items.register("rockmanshadow_helmet",
			() -> new RockmanShadow(ArmorMaterials.QuintArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> RedbullMegaman_Head = Items.register("redbullmegaman_head",
			() -> new RedbullMegamanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> RedbullMegaman_Body = Items.register("redbullmegaman_body",
			() -> new RedbullMegamanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> RedbullMegaman_Legs = Items.register("redbullmegaman_legs",
			() -> new RedbullMegamanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> RedbullMegaman_Arms = Items.register("redbullmegaman_arms",
			() -> new RedbullMegamanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> NovaMegaman_Head = Items.register("novamegaman_head",
			() -> new NovaMegamanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NovaMegaman_Body = Items.register("novamegaman_body",
			() -> new NovaMegamanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NovaMegaman_Legs = Items.register("novamegaman_legs",
			() -> new NovaMegamanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NovaMegaman_Arms = Items.register("novamegaman_arms",
			() -> new NovaMegamanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> BadBoxArt_Head = Items.register("badboxart_head",
			() -> new BadBoxArtArmor(ArmorMaterials.MegaArmorBase, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> BadBoxArt_Body = Items.register("badboxart_body",
			() -> new BadBoxArtArmor(ArmorMaterials.MegaArmorBase, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> BadBoxArt_Legs = Items.register("badboxart_legs",
			() -> new BadBoxArtArmor(ArmorMaterials.MegaArmorBase, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> BadBoxArt_Arms = Items.register("badboxart_arms",
			() -> new BadBoxArtArmor(ArmorMaterials.MegaArmorBase, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> RollArmor_Head = Items.register("roll_head",
			() -> new RollArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> RollArmor_Body = Items.register("roll_body",
			() -> new RollArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> RollArmor_Legs = Items.register("roll_legs",
			() -> new RollArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> RollArmor_Arms = Items.register("roll_arms",
			() -> new RollArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> RollsBroom = Items.register("rollbroom",
			() -> new SwordItem(ItemTier.IRON, 3, -2.4F, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> LightLabcoat = Items.register("drlightlabcoat",
			() -> new com.collecter128.megamanarmormod.items.LightLabcoat(ArmorMaterials.LightLabcoat, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> RyuHeaband = Items.register("ryu_headband",
			() -> new RyuGiarmor(ArmorMaterials.LightLabcoat, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Ryugi = Items.register("ryu_gi_armor",
			() -> new RyuGiarmor(ArmorMaterials.LightLabcoat, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> RyuPants = Items.register("ryu_pants",
			() -> new RyuGiarmor(ArmorMaterials.LightLabcoat, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> MettaurHelmet = Items.register("mettaurhelmet",
			() -> new com.collecter128.megamanarmormod.items.MettaurHelmet(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> ProtomanArmor_Head = Items.register("protomanarmor_head",
			() -> new ProtomanArmor(ArmorMaterials.ProtomanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ProtomanArmor_Body = Items.register("protomanarmor_body",
			() -> new ProtomanArmorChest(ArmorMaterials.ProtomanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ProtomanArmor_Legs = Items.register("protomanarmor_legs",
			() -> new ProtomanArmorLegs(ArmorMaterials.ProtomanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ProtomanArmor_Arms = Items.register("protomanarmor_arms",
			() -> new ProtomanArmorFeet(ArmorMaterials.ProtomanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> BreakmanHelmet = Items.register("breakman_helmet",
			() -> new com.collecter128.megamanarmormod.items.BreakmanHelmet(ArmorMaterials.ProtomanArmor, EquipmentSlotType.HEAD, 
					new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Protoshield = Items.register("protoshield",
			() -> new MegamanShield(new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> NovaProtomanArmor_Head = Items.register("protomannovaarmor_head",
			() -> new NovaProtomanArmor(ArmorMaterials.ProtomanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NovaProtomanArmor_Body = Items.register("protomannovaarmor_body",
			() -> new NovaProtomanArmor(ArmorMaterials.ProtomanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NovaProtomanArmor_Legs = Items.register("protomannovaarmor_legs",
			() -> new NovaProtomanArmor(ArmorMaterials.ProtomanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NovaProtomanArmor_Arms = Items.register("protomannovaarmor_arms",
			() -> new NovaProtomanArmor(ArmorMaterials.ProtomanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> ProtoshieldNova = Items.register("protoshield_novacorps",
			() -> new MegamanShield(new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> DuoArmor_Head = Items.register("duo_head",
			() -> new DuoArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> DuoArmor_Body = Items.register("duo_body",
			() -> new DuoArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> DuoArmor_Legs = Items.register("duo_legs",
			() -> new DuoArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> DuoArmor_Arms = Items.register("duo_arms",
			() -> new DuoArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Wilyjacket = Items.register("wily_labcoat",
			() -> new WilyCoat(ArmorMaterials.WilyLabcoat, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> SoccerWilyArmor_Head = Items.register("soccerwily_head",
			() -> new SoccerWilyArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SoccerWilyArmor_Body = Items.register("soccerwily_body",
			() -> new SoccerWilyArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SoccerWilyArmor_Legs = Items.register("soccerwily_legs",
			() -> new SoccerWilyArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SoccerWilyArmor_Arms = Items.register("soccerwily_arms",
			() -> new SoccerWilyArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> BassArmor_Head = Items.register("bassarmor_head",
			() -> new BassArmor(ArmorMaterials.BassArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> BassArmor_Body = Items.register("bassarmor_body",
			() -> new BassArmorChest(ArmorMaterials.BassArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> BassArmor_Legs = Items.register("bassarmor_legs",
			() -> new BassArmorLegs(ArmorMaterials.BassArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> BassArmor_Arms = Items.register("bassarmor_arms",
			() -> new BassArmorFeet(ArmorMaterials.BassArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> SuperBass_Head = Items.register("superbass_head",
			() -> new SuperBassArmor(ArmorMaterials.SuperBassArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SuperBass_Body = Items.register("superbass_body",
			() -> new SuperBassArmor(ArmorMaterials.SuperBassArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SuperBass_Legs = Items.register("superbass_legs",
			() -> new SuperBassArmor(ArmorMaterials.SuperBassArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SuperBass_Arms = Items.register("superbass_arms",
			() -> new SuperBassArmor(ArmorMaterials.SuperBassArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> SuperBassEvil_Head = Items.register("superbassevil_head",
			() -> new SuperBassEvilArmor(ArmorMaterials.SuperBassEvilArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SuperBassEvil_Body = Items.register("superbassevil_body",
			() -> new SuperBassEvilArmor(ArmorMaterials.SuperBassEvilArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SuperBassEvil_Legs = Items.register("superbassevil_legs",
			() -> new SuperBassEvilArmor(ArmorMaterials.SuperBassEvilArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SuperBassEvil_Arms = Items.register("superbassevil_arms",
			() -> new SuperBassEvilArmor(ArmorMaterials.SuperBassEvilArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Elecman_Head = Items.register("elecman_head",
			() -> new ElecmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Elecman_Body = Items.register("elecman_body",
			() -> new ElecmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Elecman_Legs = Items.register("elecman_legs",
			() -> new ElecmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Elecman_Arms = Items.register("elecman_arms",
			() -> new ElecmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Fireman_Head = Items.register("fireman_head",
			() -> new FiremanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Fireman_Body = Items.register("fireman_body",
			() -> new FiremanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Fireman_Legs = Items.register("fireman_legs",
			() -> new FiremanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Fireman_Arms = Items.register("fireman_arms",
			() -> new FiremanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Bombman_Head = Items.register("bombman_head",
			() -> new BombmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Bombman_Body = Items.register("bombman_body",
			() -> new BombmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Bombman_Legs = Items.register("bombman_legs",
			() -> new BombmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Bombman_Arms = Items.register("bombman_arms",
			() -> new BombmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Cutman_Head = Items.register("cutman_head",
			() -> new CutmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Cutman_Body = Items.register("cutman_body",
			() -> new CutmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Cutman_Legs = Items.register("cutman_legs",
			() -> new CutmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Cutman_Arms = Items.register("cutman_arms",
			() -> new CutmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Iceman_Head = Items.register("iceman_head",
			() -> new IcemanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Iceman_Body = Items.register("iceman_body",
			() -> new IcemanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Iceman_Legs = Items.register("iceman_legs",
			() -> new IcemanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Iceman_Arms = Items.register("iceman_arms",
			() -> new IcemanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Gutsman_Head = Items.register("gutsman_head",
			() -> new GutsmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Gutsman_Body = Items.register("gutsman_body",
			() -> new GutsmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Gutsman_Legs = Items.register("gutsman_legs",
			() -> new GutsmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Gutsman_Arms = Items.register("gutsman_arms",
			() -> new GutsmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Oilman_Head = Items.register("oilman_head",
			() -> new OilmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Oilman_Body = Items.register("oilman_body",
			() -> new OilmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Oilman_Legs = Items.register("oilman_legs",
			() -> new OilmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Oilman_Arms = Items.register("oilman_arms",
			() -> new OilmanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Timeman_Head = Items.register("timeman_head",
			() -> new TimemanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Timeman_Body = Items.register("timeman_body",
			() -> new TimemanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Timeman_Legs = Items.register("timeman_legs",
			() -> new TimemanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Timeman_Arms = Items.register("timeman_arms",
			() -> new TimemanArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> XArmor_Head = Items.register("xarmor_head",
			() -> new XArmor(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XArmor_Body = Items.register("xarmor_body",
			() -> new XArmorChest(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XArmor_Legs = Items.register("xarmor_legs",
			() -> new XArmorLegs(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XArmor_Arms = Items.register("xarmor_arms",
			() -> new XArmorFeet(ArmorMaterials.XArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> XBuster = Items.register("xbuster",
			() -> new Busterx(3, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> iFXArmor_Body = Items.register("ifxarmor_body",
			() -> new IFXArmor(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> megaArmorBase_Head = Items.register("megaarmorbase_head",
			() -> new megaarmorbaseArmor(ArmorMaterials.MegaArmorBase, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> megaArmorBase_Body = Items.register("megaarmorbase_body",
			() -> new megaarmorbaseArmor(ArmorMaterials.MegaArmorBase, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> megaArmorBase_Legs = Items.register("megaarmorbase_legs",
			() -> new megaarmorbaseArmor(ArmorMaterials.MegaArmorBase, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> megaArmorBase_Arms = Items.register("megaarmorbase_arms",
			() -> new megaarmorbaseArmor(ArmorMaterials.MegaArmorBase, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> NewArmor_Head = Items.register("newarmor_head",
			() -> new NewArmor(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NewArmor_Body = Items.register("newarmor_body",
			() -> new NewArmor(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NewArmor_Legs = Items.register("newarmor_legs",
			() -> new NewArmor(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NewArmor_Arms = Items.register("newarmor_arms",
			() -> new NewArmor(ArmorMaterials.XArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> XTeppenArmor_Head = Items.register("xteppenarmor_head",
			() -> new XTeppenArmor(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XTeppenArmor_Body = Items.register("xteppenarmor_body",
			() -> new XTeppenArmor(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XTeppenArmor_Legs = Items.register("xteppenarmor_legs",
			() -> new XTeppenArmor(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XTeppenArmor_Arms = Items.register("xteppenarmor_arms",
			() -> new XTeppenArmor(ArmorMaterials.XArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> XKeArmor_Head = Items.register("xke_head",
			() -> new XkeArmor(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XKeArmor_Body = Items.register("xke_body",
			() -> new XkeArmor(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XKeArmor_Legs = Items.register("xke_legs",
			() -> new XkeArmor(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XKeArmor_Arms = Items.register("xke_arms",
			() -> new XkeArmor(ArmorMaterials.XArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> XKaiArmor_Head = Items.register("xkai_head",
			() -> new XKaiArmor(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XKaiArmor_Body = Items.register("xkai_body",
			() -> new XKaiArmor(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XKaiArmor_Legs = Items.register("xkai_legs",
			() -> new XKaiArmor(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XKaiArmor_Arms = Items.register("xkai_arms",
			() -> new XKaiArmor(ArmorMaterials.XArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> XKeBoostArmor_Head = Items.register("xkeboost_head",
			() -> new XkeBoostArmor(ArmorMaterials.FirstXArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XKeBoostArmor_Body = Items.register("xkeboost_body",
			() -> new XkeBoostArmor(ArmorMaterials.FirstXArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XKeBoostArmor_Legs = Items.register("xkeboost_legs",
			() -> new XkeBoostArmor(ArmorMaterials.FirstXArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XKeBoostArmor_Arms = Items.register("xkeboost_arms",
			() -> new XkeBoostArmor(ArmorMaterials.FirstXArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> XTransparentArmor_Head = Items.register("xtransparentarmor_head",
			() -> new XtransparentOrange(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XTransparentArmor_Body = Items.register("xtransparentarmor_body",
			() -> new XtransparentOrange(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XTransparentArmor_Legs = Items.register("xtransparentarmor_legs",
			() -> new XtransparentOrange(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XTransparentArmor_Arms = Items.register("xtransparentarmor_arms",
			() -> new XtransparentOrange(ArmorMaterials.XArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> FirstArmor_Head = Items.register("firstarmor_head",
			() -> new FirstArmor(ArmorMaterials.FirstXArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> FirstArmor_Body = Items.register("firstarmor_body",
			() -> new FirstArmor(ArmorMaterials.FirstXArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> FirstArmor_Legs = Items.register("firstarmor_legs",
			() -> new FirstArmor(ArmorMaterials.FirstXArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> FirstArmor_Arms = Items.register("firstarmor_arms",
			() -> new FirstArmor(ArmorMaterials.FirstXArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Military_Buster = Items.register("military_buster",
			() -> new Busterx(4, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> SecondArmor_Head = Items.register("secondarmor_head",
			() -> new SecondArmor(ArmorMaterials.SecondXArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SecondArmor_Body = Items.register("secondarmor_body",
			() -> new SecondArmor(ArmorMaterials.SecondXArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SecondArmor_Legs = Items.register("secondarmor_legs",
			() -> new SecondArmor(ArmorMaterials.SecondXArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SecondArmor_Arms = Items.register("secondarmor_arms",
			() -> new SecondArmor(ArmorMaterials.SecondXArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> ThirdArmor_Head = Items.register("thirdarmor_head",
			() -> new ThirdArmor(ArmorMaterials.ThirdXArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ThirdArmor_Body = Items.register("thirdarmor_body",
			() -> new ThirdArmor(ArmorMaterials.ThirdXArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ThirdArmor_Legs = Items.register("thirdarmor_legs",
			() -> new ThirdArmor(ArmorMaterials.ThirdXArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ThirdArmor_Arms = Items.register("thirdarmor_arms",
			() -> new ThirdArmor(ArmorMaterials.ThirdXArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> FourthArmor_Head = Items.register("fourtharmor_head",
			() -> new FourthArmor(ArmorMaterials.ThirdXArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> FourthArmor_Body = Items.register("fourtharmor_body",
			() -> new FourthArmor(ArmorMaterials.ThirdXArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> FourthArmor_Legs = Items.register("fourtharmor_legs",
			() -> new FourthArmor(ArmorMaterials.ThirdXArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> FourthArmor_Arms = Items.register("fourtharmor_arms",
			() -> new FourthArmor(ArmorMaterials.ThirdXArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Replicapture_Body = Items.register("replicapture",
			() -> new Replicapture(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> iXArmor_Head = Items.register("ixarmor_head",
			() -> new iXArmor(ArmorMaterials.iXArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> iXArmor_Body = Items.register("ixarmor_body",
			() -> new iXArmor(ArmorMaterials.iXArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> iXArmor_Legs = Items.register("ixarmor_legs",
			() -> new iXArmorLegs(ArmorMaterials.iXArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> iXArmor_Arms = Items.register("ixarmor_arms",
			() -> new iXArmor(ArmorMaterials.iXArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> ZeroArmorFirst_Head = Items.register("zeroarmorfirst_head",
			() -> new ZeroArmorFirst(ArmorMaterials.ZeroArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmorFirst_Body = Items.register("zeroarmorfirst_body",
			() -> new ZeroArmorFirst(ArmorMaterials.ZeroArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmorFirst_Legs = Items.register("zeroarmorfirst_legs",
			() -> new ZeroArmorLegsFirst(ArmorMaterials.ZeroArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmorFirst_Arms = Items.register("zeroarmorfirst_arms",
			() -> new ZeroArmorFirst(ArmorMaterials.ZeroArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> ZeroArmor_Head = Items.register("zeroarmor_head",
			() -> new ZeroArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmor_Body = Items.register("zeroarmor_body",
			() -> new ZeroArmorChest(ArmorMaterials.ZeroArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmor_Legs = Items.register("zeroarmor_legs",
			() -> new ZeroArmorLegs(ArmorMaterials.ZeroArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmor_Arms = Items.register("zeroarmor_arms",
			() -> new ZeroArmorFeet(ArmorMaterials.ZeroArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> ZeroiXArmor_Body = Items.register("zeroix_body",
			() -> new ZeroiXArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> ZeroEXArmor_Head = Items.register("zeroex_head",
			() -> new ZeroEXArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroEXArmor_Body = Items.register("zeroex_body",
			() -> new ZeroEXArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroEXArmor_Legs = Items.register("zeroex_legs",
			() -> new ZeroEXArmorLegs(ArmorMaterials.ZeroArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroEXArmor_Arms = Items.register("zeroex_arms",
			() -> new ZeroEXArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> iFZeroArmor_Body = Items.register("ifzeroarmor_body",
			() -> new IFZeroArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> NovaZeroArmor_Head = Items.register("novazero_head",
			() -> new NovaZeroArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NovaZeroArmor_Body = Items.register("novazero_body",
			() -> new NovaZeroArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NovaZeroArmor_Legs = Items.register("novazero_legs",
			() -> new NovaZeroArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NovaZeroArmor_Arms = Items.register("novazero_arms",
			() -> new NovaZeroArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Zsaber = Items.register("zsaber",
			() -> new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ZsaberPlus1 = Items.register("zsaberplus1",
			() -> new SwordItem(ItemTier.DIAMOND, 4, -2.4F, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ZsaberPlus2 = Items.register("zsaberplus2",
			() -> new SwordItem(ItemTier.DIAMOND, 5, -2.4F, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Zsabermz = Items.register("zsabermz",
			() -> new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Triangularsaber = Items.register("triangular_saber",
			() -> new SwordItem(ItemTier.DIAMOND, 5, -2.4F, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> modelZsaber = Items.register("modelzsaber",
			() -> new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Zrapier = Items.register("zrapier",
			() -> new SwordItem(ItemTier.DIAMOND, 3, -1.4f, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Beamrapier = Items.register("beamrapier",
			() -> new SwordItem(ItemTier.DIAMOND, 5, -1.4f, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Zichimonji = Items.register("zichimonji",
			() -> new SwordItem(ItemTier.DIAMOND, 4, -1.5F, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Muramasa = Items.register("muramasa",
			() -> new SwordItem(ItemTier.DIAMOND, 6, -1.5F, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Doubletooth = Items.register("doubletooth",
			() -> new SwordItem(ItemTier.DIAMOND, 6, -2.4f, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> TwinFangs = Items.register("twinfangs",
			() -> new SwordItem(ItemTier.DIAMOND, 8, -2.4f, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> SoulSaber = Items.register("soulsaber",
			() -> new SwordItem(ItemTier.DIAMOND, 8, -2.4f, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> RedLotusSaber = Items.register("redlotussaber",
			() -> new SwordItem(ItemTier.NETHERITE, 10, -2.4f, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> FestiveSpeciality = Items.register("festivespecialty",
			() -> new SwordItem(ItemTier.IRON, 3, -2.4F, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> RamenGreatSword = Items.register("ramengreatsword",
			() -> new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Zknuckle = Items.register("zknuckle",
			() -> new ZKnuckle(ItemTier.DIAMOND, 4, -2.4F, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> AxlArmor_Head = Items.register("axlarmor_head",
			() -> new AxlArmor(ArmorMaterials.AxlArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> AxlArmor_Body = Items.register("axlarmor_body",
			() -> new AxlArmor(ArmorMaterials.AxlArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> AxlArmor_Legs = Items.register("axlarmor_legs",
			() -> new AxlArmor(ArmorMaterials.AxlArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> AxlArmor_Arms = Items.register("axlarmor_arms",
			() -> new AxlArmor(ArmorMaterials.AxlArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> VileArmor_Head = Items.register("vilearmor_head",
			() -> new VileArmor(ArmorMaterials.VileArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> VileArmor_Body = Items.register("vilearmor_body",
			() -> new VileArmor(ArmorMaterials.VileArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> VileArmor_Legs = Items.register("vilearmor_legs",
			() -> new VileArmorLegs(ArmorMaterials.VileArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> VileArmor_Arms = Items.register("vilearmor_arms",
			() -> new VileArmor(ArmorMaterials.VileArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> VileArmor_CannonBody = Items.register("vile_cannonbody",
			() -> new VileArmorCannon(ArmorMaterials.VileArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> SigmaArmor_Head = Items.register("sigmaarmor_head",
			() -> new SigmaArmor(ArmorMaterials.SigmaArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SigmaArmor_Body = Items.register("sigmaarmor_body",
			() -> new SigmaArmorChest(ArmorMaterials.SigmaArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SigmaArmor_Legs = Items.register("sigmaarmor_legs",
			() -> new SigmaArmorLegs(ArmorMaterials.SigmaArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SigmaArmor_Arms = Items.register("sigmaarmor_arms",
			() -> new SigmaArmorFeet(ArmorMaterials.SigmaArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Sigmasaber = Items.register("sigmasaber",
			() -> new SwordItem(ItemTier.DIAMOND, 5, -2.4F, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> Serges_Head = Items.register("serges_head",
			() -> new SergesArmor(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Serges_Body = Items.register("serges_body",
			() -> new SergesArmor(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Serges_Legs = Items.register("serges_legs",
			() -> new SergesArmor(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Serges_Arms = Items.register("serges_arms",
			() -> new SergesArmor(ArmorMaterials.XArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Serges_Hat = Items.register("serges_hat",
			() -> new SergesHat(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Violen_Head = Items.register("violen_head",
			() -> new ViolenArmor(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Violen_Body = Items.register("violen_body",
			() -> new ViolenArmor(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Violen_Legs = Items.register("violen_legs",
			() -> new ViolenArmor(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Violen_Arms = Items.register("violen_arms",
			() -> new ViolenArmor(ArmorMaterials.XArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Agile_Head = Items.register("agile_head",
			() -> new AgileArmor(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Agile_Body = Items.register("agile_body",
			() -> new AgileArmor(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Agile_Legs = Items.register("agile_legs",
			() -> new AgileArmor(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Agile_Arms = Items.register("agile_arms",
			() -> new AgileArmor(ArmorMaterials.XArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> AgileSaber = Items.register("agile_saber",
			() -> new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> MegamanZero_Head = Items.register("megamanzero_head",
			() -> new MegamanZeroArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> MegamanZero_Body = Items.register("megamanzero_body",
			() -> new MegamanZeroArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> MegamanZero_Legs = Items.register("megamanzero_legs",
			() -> new MegamanZeroArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> MegamanZero_Arms = Items.register("megamanzero_arms",
			() -> new MegamanZeroArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> CopyX_Head = Items.register("copyx_head",
			() -> new CopyXArmor(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> CopyX_Body = Items.register("copyx_body",
			() -> new CopyXArmor(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> CopyX_Legs = Items.register("copyx_legs",
			() -> new CopyXArmor(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> CopyX_Arms = Items.register("copyx_arms",
			() -> new CopyXArmor(ArmorMaterials.XArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> ModelX_Head = Items.register("modelx_head",
			() -> new ModelXArmor(ArmorMaterials.BiometalArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ModelX_Body = Items.register("modelx_body",
			() -> new ModelXArmor(ArmorMaterials.BiometalArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ModelX_Legs = Items.register("modelx_legs",
			() -> new ModelXArmor(ArmorMaterials.BiometalArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ModelX_Arms = Items.register("modelx_arms",
			() -> new ModelXArmor(ArmorMaterials.BiometalArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> ModelZ_Head = Items.register("modelz_head",
			() -> new ModelZArmor(ArmorMaterials.BiometalArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ModelZ_Body = Items.register("modelz_body",
			() -> new ModelZArmor(ArmorMaterials.BiometalArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ModelZ_Legs = Items.register("modelz_legs",
			() -> new ModelZArmor(ArmorMaterials.BiometalArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ModelZ_Arms = Items.register("modelz_arms",
			() -> new ModelZArmor(ArmorMaterials.BiometalArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> ModelZX_Head = Items.register("modelzx_head",
			() -> new ModelZXArmor(ArmorMaterials.BiometalArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ModelZX_Body = Items.register("modelzx_body",
			() -> new ModelZXArmor(ArmorMaterials.BiometalArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ModelZX_Legs = Items.register("modelzx_legs",
			() -> new ModelZXArmor(ArmorMaterials.BiometalArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ModelZX_Arms = Items.register("modelzx_arms",
			() -> new ModelZXArmor(ArmorMaterials.BiometalArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> megamanexeArmor_Head = Items.register("megamanexe_head",
			() -> new megamanexeArmor(ArmorMaterials.MegamanExeArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> megamanexeArmor_Body = Items.register("megamanexe_body",
			() -> new megamanexeArmor(ArmorMaterials.MegamanExeArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> megamanexeArmor_Legs = Items.register("megamanexe_legs",
			() -> new megamanexeArmor(ArmorMaterials.MegamanExeArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> megamanexeArmor_Arms = Items.register("megamanexe_arms",
			() -> new megamanexeArmor(ArmorMaterials.MegamanExeArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> HubstyleArmor_Head = Items.register("hubstyle_head",
			() -> new HubstyleArmor(ArmorMaterials.HubstyleArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> HubstyleArmor_Body = Items.register("hubstyle_body",
			() -> new HubstyleArmor(ArmorMaterials.HubstyleArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> HubstyleArmor_Legs = Items.register("hubstyle_legs",
			() -> new HubstyleArmor(ArmorMaterials.HubstyleArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> HubstyleArmor_Arms = Items.register("hubstyle_arms",
			() -> new HubstyleArmor(ArmorMaterials.HubstyleArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> protomanexeArmor_Head = Items.register("protomanexe_head",
			() -> new ProtomanExeArmor(ArmorMaterials.ProtomanExeArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> protomanexeArmor_Body = Items.register("protomanexe_body",
			() -> new ProtomanExeArmor(ArmorMaterials.ProtomanExeArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> protomanexeArmor_Legs = Items.register("protomanexe_legs",
			() -> new ProtomanExeArmor(ArmorMaterials.ProtomanExeArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> protomanexeArmor_Arms = Items.register("protomanexe_arms",
			() -> new ProtomanExeArmor(ArmorMaterials.ProtomanExeArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> DarkprotomanexeArmor_Head = Items.register("darkprotomanexe_head",
			() -> new DarkProtomanExeArmor(ArmorMaterials.ProtomanExeArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> DarkprotomanexeArmor_Body = Items.register("darkprotomanexe_body",
			() -> new DarkProtomanExeArmor(ArmorMaterials.ProtomanExeArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> DarkprotomanexeArmor_Legs = Items.register("darkprotomanexe_legs",
			() -> new DarkProtomanExeArmor(ArmorMaterials.ProtomanExeArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> DarkprotomanexeArmor_Arms = Items.register("darkprotomanexe_arms",
			() -> new DarkProtomanExeArmor(ArmorMaterials.ProtomanExeArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> rollexeArmor_Head = Items.register("rollexe_head",
			() -> new RollexeArmor(ArmorMaterials.RollExeArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> rollexeArmor_Body = Items.register("rollexe_body",
			() -> new RollexeArmor(ArmorMaterials.RollExeArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> rollexeArmor_Legs = Items.register("rollexe_legs",
			() -> new RollexeArmor(ArmorMaterials.RollExeArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> rollexeArmor_Arms = Items.register("rollexe_arms",
			() -> new RollexeArmor(ArmorMaterials.RollExeArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Gutsmanexe_Head = Items.register("gutsmanexe_head",
			() -> new GutsmanexeArmor(ArmorMaterials.GutsmanExeArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Gutsmanexe_Body = Items.register("gutsmanexe_body",
			() -> new GutsmanexeArmor(ArmorMaterials.GutsmanExeArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Gutsmanexe_Legs = Items.register("gutsmanexe_legs",
			() -> new GutsmanexeArmor(ArmorMaterials.GutsmanExeArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Gutsmanexe_Arms = Items.register("gutsmanexe_arms",
			() -> new GutsmanexeArmor(ArmorMaterials.GutsmanExeArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> NormnaviArmor_Head = Items.register("normnavi_head",
			() -> new NormnaviArmor(ArmorMaterials.NormnaviArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NormnaviArmor_Body = Items.register("normnavi_body",
			() -> new NormnaviArmor(ArmorMaterials.NormnaviArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NormnaviArmor_Legs = Items.register("normnavi_legs",
			() -> new NormnaviArmor(ArmorMaterials.NormnaviArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> NormnaviArmor_Arms = Items.register("normnavi_arms",
			() -> new NormnaviArmor(ArmorMaterials.NormnaviArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Zeroexe_Head = Items.register("zeroexe_head",
			() -> new ZeroexeArmor(ArmorMaterials.VirusArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Zeroexe_Body = Items.register("zeroexe_body",
			() -> new ZeroexeArmor(ArmorMaterials.VirusArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Zeroexe_Legs = Items.register("zeroexe_legs",
			() -> new ZeroexeArmor(ArmorMaterials.VirusArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Zeroexe_Arms = Items.register("zeroexe_arms",
			() -> new ZeroexeArmor(ArmorMaterials.VirusArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Starforce_Head = Items.register("starforce_head",
			() -> new StarforceArmor(ArmorMaterials.StarforceMegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Starforce_Body = Items.register("starforce_body",
			() -> new StarforceArmor(ArmorMaterials.StarforceMegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Starforce_Legs = Items.register("starforce_legs",
			() -> new StarforceArmor(ArmorMaterials.StarforceMegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Starforce_Arms = Items.register("starforce_arms",
			() -> new StarforceArmor(ArmorMaterials.StarforceMegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> HarpNote_Head = Items.register("harpnote_head",
			() -> new HarpNoteArmor(ArmorMaterials.StarforceFMArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> HarpNote_Body = Items.register("harpnote_body",
			() -> new HarpNoteArmor(ArmorMaterials.StarforceFMArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> HarpNote_Legs = Items.register("harpnote_legs",
			() -> new HarpNoteArmor(ArmorMaterials.StarforceFMArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> HarpNote_Arms = Items.register("harpnote_arms",
			() -> new HarpNoteArmor(ArmorMaterials.StarforceFMArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> LyraWeapon = Items.register("lyra_weapon",
			() -> new LyraWeapon(new Item.Properties().tab(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> LegendsArmor_Head = Items.register("legendsarmor_head",
			() -> new LegendsArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> LegendsArmor_Body = Items.register("legendsarmor_body",
			() -> new LegendsArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> LegendsArmor_Legs = Items.register("legendsarmor_legs",
			() -> new LegendsArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> LegendsArmor_Arms = Items.register("legendsarmor_arms",
			() -> new LegendsArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Shades = Items.register("shades",
			() -> new ShadesArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Over0Armor_Head = Items.register("over0_head",
			() -> new Over0Armor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Over0Armor_Body = Items.register("over0_body",
			() -> new Over0Armor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Over0Armor_Legs = Items.register("over0_legs",
			() -> new Over0Armor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Over0Armor_Arms = Items.register("over0_arms",
			() -> new Over0Armor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> PachislotArmor_Head = Items.register("pachislot_head",
			() -> new PachislotArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> PachislotArmor_Body = Items.register("pachislot_body",
			() -> new PachislotArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> PachislotArmor_Legs = Items.register("pachislot_legs",
			() -> new PachislotArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> PachislotArmor_Arms = Items.register("pachislot_arms",
			() -> new PachislotArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> AkiLight_Head = Items.register("akilight_head",
			() -> new AkiLightArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> AkiLight_Body = Items.register("akilight_body",
			() -> new AkiLightArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> AkiLight_Legs = Items.register("akilight_legs",
			() -> new AkiLightArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> AkiLight_Arms = Items.register("akilight_arms",
			() -> new AkiLightArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> ZeroFC_Head = Items.register("zerofc_head",
			() -> new ZeroFCArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ZeroFC_Body = Items.register("zerofc_body",
			() -> new ZeroFCArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ZeroFC_Legs = Items.register("zerofc_legs",
			() -> new ZeroFCArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ZeroFC_Arms = Items.register("zerofc_arms",
			() -> new ZeroFCArmor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Via_Head = Items.register("via_head",
			() -> new ViaArmor(ArmorMaterials.DeepLogArmor, EquipmentSlotType.HEAD, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Via_Body = Items.register("via_body",
			() -> new ViaArmor(ArmorMaterials.DeepLogArmor, EquipmentSlotType.CHEST, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Via_Legs = Items.register("via_legs",
			() -> new ViaArmor(ArmorMaterials.DeepLogArmor, EquipmentSlotType.LEGS, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Via_Arms = Items.register("via_arms",
			() -> new ViaArmor(ArmorMaterials.DeepLogArmor, EquipmentSlotType.FEET, new Item.Properties().tab(MegamanArmorMod.MMTab)));
	
}
