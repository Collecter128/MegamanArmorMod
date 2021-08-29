package com.collecter128.megamanarmormod.core;

import java.util.ArrayList;
import java.util.List;

import com.collecter128.megamanarmormod.MegamanArmorMod;
import com.collecter128.megamanarmormod.client.CustomPatterns;
import com.collecter128.megamanarmormod.client.models.breakman_helmet;
import com.collecter128.megamanarmormod.items.ArmorColorizer;
import com.collecter128.megamanarmormod.items.ArmorColorizerCustom;
import com.collecter128.megamanarmormod.items.ArmorColorizerDefault;
import com.collecter128.megamanarmormod.items.BassArmor;
import com.collecter128.megamanarmormod.items.BassArmorChest;
import com.collecter128.megamanarmormod.items.BassArmorFeet;
import com.collecter128.megamanarmormod.items.BassArmorLegs;
import com.collecter128.megamanarmormod.items.Buster;
import com.collecter128.megamanarmormod.items.ColorfulArmor;
import com.collecter128.megamanarmormod.items.MegamanArmor;
import com.collecter128.megamanarmormod.items.MegamanArmorColor;
import com.collecter128.megamanarmormod.items.MegamanArmorFeet;
import com.collecter128.megamanarmormod.items.MegamanArmorLegs;
import com.collecter128.megamanarmormod.items.MegamanArmorLegsColor;
import com.collecter128.megamanarmormod.items.MegamanArmorchest;
import com.collecter128.megamanarmormod.items.MegamanArmorchestcolor;
import com.collecter128.megamanarmormod.items.ProtomanArmor;
import com.collecter128.megamanarmormod.items.ProtomanArmorChest;
import com.collecter128.megamanarmormod.items.ProtomanArmorFeet;
import com.collecter128.megamanarmormod.items.ProtomanArmorLegs;
import com.collecter128.megamanarmormod.items.SigmaArmor;
import com.collecter128.megamanarmormod.items.SigmaArmorChest;
import com.collecter128.megamanarmormod.items.SigmaArmorFeet;
import com.collecter128.megamanarmormod.items.SigmaArmorLegs;
import com.collecter128.megamanarmormod.items.VileArmor;
import com.collecter128.megamanarmormod.items.VileArmorLegs;
import com.collecter128.megamanarmormod.items.WilyCoat;
import com.collecter128.megamanarmormod.items.XArmor;
import com.collecter128.megamanarmormod.items.XArmorChest;
import com.collecter128.megamanarmormod.items.XArmorClear;
import com.collecter128.megamanarmormod.items.XArmorClearChest;
import com.collecter128.megamanarmormod.items.XArmorClearFeet;
import com.collecter128.megamanarmormod.items.XArmorClearLegs;
import com.collecter128.megamanarmormod.items.XArmorFeet;
import com.collecter128.megamanarmormod.items.XArmorLegs;
import com.collecter128.megamanarmormod.items.ZeroArmor;
import com.collecter128.megamanarmormod.items.ZeroArmorChest;
import com.collecter128.megamanarmormod.items.ZeroArmorFeet;
import com.collecter128.megamanarmormod.items.ZeroArmorLegs;
import com.collecter128.megamanarmormod.materials.ArmorMaterials;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BannerPatternItem;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.PotionUtils;
import net.minecraft.tileentity.BannerPattern;
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
	            				new Item.Properties().group(MegamanArmorMod.MMBannerMats)));
	            PATTERNS.add(pattern);
	            PATTERN_ITEMS.add(pattern_item);
	        }
	    }
	
	//public static final RegistryObject<Item> CircleBannerPattern = Items.register("circle_banner_pattern",
	//		() -> new BannerPatternItem(null, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> Titanium = Items.register("titanium",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));

	public static final RegistryObject<Item> TrialProductionAlloy = Items.register("alloy_trial_production",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> PrototypeAlloy = Items.register("alloy_prototype",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> BasicAlloy = Items.register("alloy_basic",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> TrialProductionCircuit = Items.register("circuit_trialproduction",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> BasicCircuit = Items.register("circuit_basic",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> TrialProductionCore = Items.register("core_trialproduction",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> PrototypeCore = Items.register("core_prototype",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> TrialProductionGear = Items.register("gear_trialproduction",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> ShockAbsorber = Items.register("shock_absorber",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Ceratanium = Items.register("ceratanium",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Fortenium = Items.register("fortenium",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Bassnium = Items.register("bassnium",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> TitaniumX = Items.register("titaniumx",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> MegamanArmor_Head = Items.register("megamanarmor_head",
			() -> new MegamanArmorColor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> MegamanArmor_Arms = Items.register("megamanarmor_arms",
			() -> new MegamanArmorColor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> MegamanArmor_Body = Items.register("megamanarmor_body",
			() -> new MegamanArmorColor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> MegamanArmor_Legs = Items.register("megamanarmor_legs",
			() -> new MegamanArmorLegsColor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab))
			//.getArmorModel(entityLiving, itemStack, armorSlot, _default)
			//.getArmorTexture(stack, entity, slot, type)
			);//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> LightLabcoat = Items.register("drlightlabcoat",
			() -> new com.collecter128.megamanarmormod.items.LightLabcoat(ArmorMaterials.LightLabcoat, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
	
	//type
	//0-??? Color
	//-1 Does not color
	//-2 Return to default
	//-3 random??? (doesn't seem to work)
	//-4 negative
	//Order
	//Main, Secondary, ThirdColor, WhiteColor, Glow Bits"Crystal", GreyColor
	/*Main*/ /*Secondary*/ /*ThirdColor*/ /*WhiteColor*/ /*Glow Bits*/ /*GreyColor*/
	 
	public static final RegistryObject<Item> DefaultColorizer = Items.register("colorizerdefault",
			() -> new ArmorColorizerDefault(new Item.Properties().group(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> RushColorizer = Items.register("colorizerrush",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab), 
					new int[]{/*Main*/16002867, /*Secondary*/16673903, /*ThirdColor*/-1, 
							/*WhiteColor*/12105912, /*Glow Bits*/2781423, /*GreyColor*/12105912}));
	
	public static final RegistryObject<Item> RollingShieldColorizer = Items.register("colorizerrollingshield",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab)
					, new int[]{/*Main*/16727426, /*Secondary*/11325589, -1, -1, -1, -1}));
	public static final RegistryObject<Item> BoomerangCutterColorizer = Items.register("colorizerboomerangcutter",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab)
					, new int[]{/*Main*/8290996, /*Secondary*/11063731, -1, -1, -1, -1}));
	public static final RegistryObject<Item> ShotgunIceColorizer = Items.register("colorizershotgunice",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab)
					, new int[]{/*Main*/3661819, /*Secondary*/16042302, -1, -1, -1, -1}));
	public static final RegistryObject<Item> FireWaveColorizer = Items.register("colorizerfirewave",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab)
					, new int[]{/*Main*/16662283, /*Secondary*/16691754, -1, -1, -1, -1}));
	public static final RegistryObject<Item> StormTornadoColorizer = Items.register("colorizerstormtornado",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab)
					, new int[]{/*Main*/10309308, /*Secondary*/15635914, -1, -1, -1, -1}));
	public static final RegistryObject<Item> ElectricSparkColorizer = Items.register("colorizerelectricspark",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab)
					, new int[]{/*Main*/16754975, /*Secondary*/15326926, -1, -1, -1, -1}));
	public static final RegistryObject<Item> ChameleonStingColorizer = Items.register("colorizerchameleonsting",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab)
					, new int[]{/*Main*/1357897, /*Secondary*/9173186, -1, -1, -1, -1}));
	public static final RegistryObject<Item> HomingTorpedoColorizer = Items.register("colorizerhomingtorpedo",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab)
					, new int[]{/*Main*/6978666, /*Secondary*/14070390, -1, -1, -1, -1}));
	
	public static final RegistryObject<Item> SpeedBurnerColorizer = Items.register("colorizerspeedburner",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab), 
					new int[]{/*Main*/15404288, /*Secondary*/11794431, -1, -1, -1, -1}));
	
	
	public static final RegistryObject<Item> DrainedColorizer = Items.register("colorizerdrained",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
					, new int[]{/*Main*/6047422, /*Secondary*/8234928, /*ThirdColor*/-1, /*WhiteColor*/14863069,
							/*Glow Bits*/12943768, /*GreyColor*/14863069}));
	
	public static final RegistryObject<Item> HyperchipColorizer = Items.register("colorizerhyperchip",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
					, new int[]{/*Main*/16755999, /*Secondary*/16764969, /*ThirdColor*/-1, /*WhiteColor*/16703105,
							/*Glow Bits*/16728361, /*GreyColor*/16703105}));
	
	public static final RegistryObject<Item> HelmetchipColorizer = Items.register("colorizerhelmetchip",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/4039746,
							/*Glow Bits*/-1, /*GreyColor*/-1}));
	
	public static final RegistryObject<Item> ArmorchipColorizer = Items.register("colorizerarmorchip",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/14076974,
							/*Glow Bits*/-1, /*GreyColor*/-1}));
	
	public static final RegistryObject<Item> LegchipColorizer = Items.register("colorizerlegchip",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/1723647,
							/*Glow Bits*/-1, /*GreyColor*/-1}));
	
	public static final RegistryObject<Item> BusterchipColorizer = Items.register("colorizerbusterchip",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/16716836,
							/*Glow Bits*/-1, /*GreyColor*/-1}));
	
	
	public static final RegistryObject<Item> BetaHyperchipColorizer = Items.register("colorizerbetahyperchip",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/3552822,
							/*Glow Bits*/-1, /*GreyColor*/-1}));
	
	public static final RegistryObject<Item> RandomColorizer = Items.register("colorizerrandom",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab), 
					new int[]{/*Main*/-3, /*Secondary*/-3, -3, -3, -3, -3}));
	
	public static final RegistryObject<Item> NegativeColorizer = Items.register("colorizernegative",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab), 
					new int[]{/*Main*/-4, /*Secondary*/-4, -4, -4, -4, -4}));
	
//	public static final RegistryObject<Item> MainColorColorizer = Items.register("colorizermaincolor",
//			() -> new ArmorColorizerCustom(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD,new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
//					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
//							/*Glow Bits*/-1, /*GreyColor*/-1}, "MainColor"));
//	public static final RegistryObject<Item> SecondaryColorColorizer = Items.register("colorizersecondarycolor",
//			() -> new ArmorColorizerCustom(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD,new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
//					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
//							/*Glow Bits*/-1, /*GreyColor*/-1}, "SecondaryColor"));
//	public static final RegistryObject<Item> ThirdColorColorizer = Items.register("colorizerthirdcolor",
//			() -> new ArmorColorizerCustom(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD,new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
//					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
//							/*Glow Bits*/-1, /*GreyColor*/-1}, "ThirdColor"));
//	public static final RegistryObject<Item> whiteColorColorizer = Items.register("colorizerwhitecolor",
//			() -> new ArmorColorizerCustom(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD,new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
//					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
//							/*Glow Bits*/-1, /*GreyColor*/-1}, "WhiteColor"));
//	public static final RegistryObject<Item> GlowColorColorizer = Items.register("colorizerglowycolor",
//			() -> new ArmorColorizerCustom(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD,new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
//					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
//							/*Glow Bits*/-1, /*GreyColor*/-1}, "GlowyColor"));
//	public static final RegistryObject<Item> GrayColorColorizer = Items.register("colorizergraycolor",
//			() -> new ArmorColorizerCustom(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD,new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
//					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
//							/*Glow Bits*/-1, /*GreyColor*/-1}, "GrayColor"));
	
	public static final RegistryObject<Item> ProtomanArmor_Head = Items.register("protomanarmor_head",
			() -> new ProtomanArmor(ArmorMaterials.ProtomanArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ProtomanArmor_Arms = Items.register("protomanarmor_arms",
			() -> new ProtomanArmorFeet(ArmorMaterials.ProtomanArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ProtomanArmor_Body = Items.register("protomanarmor_body",
			() -> new ProtomanArmorChest(ArmorMaterials.ProtomanArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> ProtomanArmor_Legs = Items.register("protomanarmor_legs",
			() -> new ProtomanArmorLegs(ArmorMaterials.ProtomanArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> BreakmanHelmet = Items.register("breakman_helmet",
			() -> new com.collecter128.megamanarmormod.items.BreakmanHelmet(ArmorMaterials.ProtomanArmor, EquipmentSlotType.HEAD, 
					new Item.Properties().group(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Wilyjacket = Items.register("wily_labcoat",
			() -> new WilyCoat(ArmorMaterials.WilyLabcoat, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> BassArmor_Head = Items.register("bassarmor_head",
			() -> new BassArmor(ArmorMaterials.BassArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> BassArmor_Arms = Items.register("bassarmor_arms",
			() -> new BassArmorFeet(ArmorMaterials.BassArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> BassArmor_Body = Items.register("bassarmor_body",
			() -> new BassArmorChest(ArmorMaterials.BassArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> BassArmor_Legs = Items.register("bassarmor_legs",
			() -> new BassArmorLegs(ArmorMaterials.BassArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> XArmor_Head = Items.register("xarmor_head",
			() -> new XArmor(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XArmor_Arms = Items.register("xarmor_arms",
			() -> new XArmorFeet(ArmorMaterials.XArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XBuster = Items.register("xbuster",
			() -> new Buster(new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> XArmor_Body = Items.register("xarmor_body",
			() -> new XArmorChest(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XArmor_Legs = Items.register("xarmor_legs",
			() -> new XArmorLegs(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));
	
//	public static final RegistryObject<Item> XTransparentArmor_Head = Items.register("xtransparentarmor_head",
//			() -> new XArmorClear(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
//	public static final RegistryObject<Item> XTransparentArmor_Arms = Items.register("xtransparentarmor_arms",
//			() -> new XArmorClearFeet(ArmorMaterials.XArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
//	public static final RegistryObject<Item> XTransparentArmor_Body = Items.register("xtransparentarmor_body",
//			() -> new XArmorClearChest(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
//	public static final RegistryObject<Item> XTransparentArmor_Legs = Items.register("xtransparentarmor_legs",
//			() -> new XArmorClearLegs(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> ZeroArmor_Head = Items.register("zeroarmor_head",
			() -> new ZeroArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmor_Arms = Items.register("zeroarmor_arms",
			() -> new ZeroArmorFeet(ArmorMaterials.ZeroArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmor_Body = Items.register("zeroarmor_body",
			() -> new ZeroArmorChest(ArmorMaterials.ZeroArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmor_Legs = Items.register("zeroarmor_legs",
			() -> new ZeroArmorLegs(ArmorMaterials.ZeroArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> Zsaber = Items.register("zsaber",
			() -> new SwordItem(ItemTier.IRON, 4, -2.4F, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZsaberPlus1 = Items.register("zsaberplus1",
			() -> new SwordItem(ItemTier.IRON, 5, -2.4F, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZsaberPlus2 = Items.register("zsaberplus2",
			() -> new SwordItem(ItemTier.IRON, 6, -2.4F, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> VileArmor_Head = Items.register("vilearmor_head",
			() -> new VileArmor(ArmorMaterials.VileArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> VileArmor_Arms = Items.register("vilearmor_arms",
			() -> new VileArmor(ArmorMaterials.VileArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> VileArmor_Body = Items.register("vilearmor_body",
			() -> new VileArmor(ArmorMaterials.VileArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> VileArmor_Legs = Items.register("vilearmor_legs",
			() -> new VileArmorLegs(ArmorMaterials.VileArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> SigmaArmor_Head = Items.register("sigmaarmor_head",
			() -> new SigmaArmor(ArmorMaterials.SigmaArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SigmaArmor_Arms = Items.register("sigmaarmor_arms",
			() -> new SigmaArmorFeet(ArmorMaterials.SigmaArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SigmaArmor_Body = Items.register("sigmaarmor_body",
			() -> new SigmaArmorChest(ArmorMaterials.SigmaArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> SigmaArmor_Legs = Items.register("sigmaarmor_legs",
			() -> new SigmaArmorLegs(ArmorMaterials.SigmaArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> Sigmasaber = Items.register("sigmasaber",
			() -> new SwordItem(ItemTier.DIAMOND, 6, -2.4F, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
}
