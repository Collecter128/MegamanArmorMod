package com.collecter128.megamanarmormod.core;

import java.util.ArrayList;
import java.util.List;

import com.collecter128.megamanarmormod.MegamanArmorMod;
import com.collecter128.megamanarmormod.client.CustomPatterns;
import com.collecter128.megamanarmormod.client.models.breakman_helmet;
import com.collecter128.megamanarmormod.items.ArmorColorizer;
import com.collecter128.megamanarmormod.items.ArmorColorizerColorShift;
import com.collecter128.megamanarmormod.items.ArmorColorizerCustom;
import com.collecter128.megamanarmormod.items.ArmorColorizerDefault;
import com.collecter128.megamanarmormod.items.BassArmor;
import com.collecter128.megamanarmormod.items.BassArmorChest;
import com.collecter128.megamanarmormod.items.BassArmorFeet;
import com.collecter128.megamanarmormod.items.BassArmorLegs;
import com.collecter128.megamanarmormod.items.Buster;
import com.collecter128.megamanarmormod.items.ColorfulArmor;
import com.collecter128.megamanarmormod.items.FirstArmor;
import com.collecter128.megamanarmormod.items.IFXArmor;
import com.collecter128.megamanarmormod.items.IFZeroArmor;
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
import com.collecter128.megamanarmormod.items.QuintArmor;
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
import com.collecter128.megamanarmormod.items.ZeroArmorFirst;
import com.collecter128.megamanarmormod.items.ZeroArmorLegs;
import com.collecter128.megamanarmormod.items.ZeroArmorLegsFirst;
import com.collecter128.megamanarmormod.items.iXArmor;
import com.collecter128.megamanarmormod.items.iXArmorLegs;
import com.collecter128.megamanarmormod.materials.ArmorMaterials;

import net.minecraft.client.Minecraft;
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
	public static final RegistryObject<Item> PrototypeCircuit = Items.register("circuit_prototype",
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
	public static final RegistryObject<Item> SpecialSteel = Items.register("specialsteel",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> TitaniumX = Items.register("titaniumx",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> HyperMetal = Items.register("hypermetal",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> SigmaVirus = Items.register("virussigma",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> Limited = Items.register("limited",
			() -> new Item(new Item.Properties().group(MegamanArmorMod.MMTab)));
	
	//type
	//0-??? Color
	//-1 Does not color
	//-2 Return to default
	//-3 random??? (only kind of works)
	//-4 negative
	//Order
	//Main, Secondary, ThirdColor, WhiteColor, Glow Bits"Crystal", GreyColor
	/*Main*/ /*Secondary*/ /*ThirdColor*/ /*WhiteColor*/ /*Glow Bits*/ /*GreyColor*/
	 
	public static final RegistryObject<Item> DefaultColorizer = Items.register("colorizerdefault",
			() -> new ArmorColorizerDefault(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)));
//	public static final RegistryObject<Item> WhiteColorizer = Items.register("colorizerwhite",
//			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.MMTab)
//					, new int[]{/*Main*/16777215, /*Secondary*/16777215, 16777215, 16777215, 16777215, 16777215}));

	
	public static final RegistryObject<Item> MegamanColorizer = Items.register("colorizermegaman",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/342773, /*Secondary*/379125, /*ThirdColor*/14105660, 
							/*WhiteColor*/16777215, /*Glow Bits*/16728361, /*GreyColor*/12105912}));
	public static final RegistryObject<Item> QuintColorizer = Items.register("colorizerquint",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3709250, /*Secondary*/10413478, /*ThirdColor*/16755768,
							/*WhiteColor*/16777215, /*Glow Bits*/16764984, /*GreyColor*/12105912}));
	public static final RegistryObject<Item> MegamanEvilColorizer = Items.register("colorizermegamanevil",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/5636601, /*Secondary*/379125, /*ThirdColor*/12714489, 
							/*WhiteColor*/16777215, /*Glow Bits*/14287176, /*GreyColor*/12105912}));
	public static final RegistryObject<Item> SuperAdapterColorizer = Items.register("colorizersuperadapter",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16716820, /*Secondary*/11053224, /*ThirdColor*/16760596, 
							/*WhiteColor*/16777215, /*Glow Bits*/14365440, /*GreyColor*/12105912}));
	public static final RegistryObject<Item> RushColorizer = Items.register("colorizerrush",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16002867, /*Secondary*/16673903, /*ThirdColor*/-1, 
							/*WhiteColor*/12105912, /*Glow Bits*/16753193, /*GreyColor*/12105912}));
	// blue? 2781423
	
	public static final RegistryObject<Item> ProtomanColorizer = Items.register("colorizerprotoman",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16331285, /*Secondary*/9737364, /*ThirdColor*/16765460, 
							/*WhiteColor*/15855562, /*Glow Bits*/2359060, /*GreyColor*/12105912}));
	public static final RegistryObject<Item> BreakmanColorizer = Items.register("colorizerbreakman",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16331285, /*Secondary*/9737364, /*ThirdColor*/16765460, 
							/*WhiteColor*/15855562, /*Glow Bits*/2359060, /*GreyColor*/12105912}));

	public static final RegistryObject<Item> SuperArmColorizer = Items.register("colorizersuperarm", // Main??? 8728837
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16086016, /*Secondary*/16777215, -1, -1, -1, -1}));
	public static final RegistryObject<Item> HyperBombColorizer = Items.register("colorizerhyperbomb",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1048350, /*Secondary*/16777215, -1, -1, -1, -1}));
	public static final RegistryObject<Item> ThunderBeamColorizer = Items.register("colorizerthunderbeam",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/12105912, /*Secondary*/15914084, -1, -1, -1, -1}));
	public static final RegistryObject<Item> RollingCutterColorizer = Items.register("colorizerrollingcutter",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/8026746, /*Secondary*/16777215, -1, -1, -1, -1}));
	public static final RegistryObject<Item> IceSlasherColorizer = Items.register("colorizericeslasher",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/4092158, /*Secondary*/16777215, -1, -1, -1, -1}));
	public static final RegistryObject<Item> FireStormColorizer = Items.register("colorizerfirestorm",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16727055, /*Secondary*/16754714, -1, -1, -1, -1}));
	public static final RegistryObject<Item> TimeSlowColorizer = Items.register("colorizertimeslow",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/9915066, /*Secondary*/15895789, -1, -1, -1, -1}));
	public static final RegistryObject<Item> OilSliderColorizer = Items.register("colorizeroilslider",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/7478588, /*Secondary*/6786978, -1, -1, -1, -1}));
	
	public static final RegistryObject<Item> LeafSheildColorizer = Items.register("colorizerleafshield",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1285632, /*Secondary*/16579836, -1, -1, -1, -1}));
	public static final RegistryObject<Item> AirShooterColorizer = Items.register("colorizerairshooter",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/5212668, /*Secondary*/16579836, -1, -1, -1, -1}));
	public static final RegistryObject<Item> TimeStopperColorizer = Items.register("colorizertimestopper",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/11674775, /*Secondary*/16448250, -1, -1, -1, -1}));
	public static final RegistryObject<Item> CrashBomberColorizer = Items.register("colorizercrashbomber",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16748063, /*Secondary*/16579836, -1, -1, -1, -1}));
	public static final RegistryObject<Item> BubbleLeadColorizer = Items.register("colorizerbubblelead",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/10395294, /*Secondary*/16579836, -1, -1, -1, -1}));
	public static final RegistryObject<Item> MetalBladeColorizer = Items.register("colorizermetalblade",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/11899702, /*Secondary*/16637574, -1, -1, -1, -1}));
	public static final RegistryObject<Item> AtomicfireColorizer = Items.register("colorizeratomicfire",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16591720, /*Secondary*/16627243, -1, -1, -1, -1}));
	public static final RegistryObject<Item> QuickBoomerangColorizer = Items.register("colorizerquickboomerang",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16485805, /*Secondary*/16694736, -1, -1, -1, -1}));
	
	public static final RegistryObject<Item> Item123Colorizer = Items.register("colorizeritem123",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16719661, /*Secondary*/16579836, -1, -1, -1, -1}));
	
	public static final RegistryObject<Item> HardKnuckleColorizer = Items.register("colorizerhardknuckle",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/8944, /*Secondary*/11382189, -1, -1, -1, -1}));
	public static final RegistryObject<Item> NeedleCannonColorizer = Items.register("colorizerneedlecannon",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16748826, /*Secondary*/16448250, -1, -1, -1, -1}));
	public static final RegistryObject<Item> SparkShockColorizer = Items.register("colorizersparkshock",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16549988, /*Secondary*/16448250, -1, -1, -1, -1}));
	public static final RegistryObject<Item> MagnetMissileColorizer = Items.register("colorizermagnetmissile",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16731182, /*Secondary*/10592673, -1, -1, -1, -1}));
	public static final RegistryObject<Item> SearchSnakeColorizer = Items.register("colorizersearchsnake",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/113686, /*Secondary*/16448250, -1, -1, -1, -1}));
	public static final RegistryObject<Item> ShadowBladeColorizer = Items.register("colorizershadowblade",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/13834222, /*Secondary*/16487405, -1, -1, -1, -1}));
	public static final RegistryObject<Item> TopSpinColorizer = Items.register("colorizertopspin",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/9408399, /*Secondary*/15710392, -1, -1, -1, -1}));
	public static final RegistryObject<Item> GeminiLaserColorizer = Items.register("colorizergeminilaser",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/5238268, /*Secondary*/16448250, -1, -1, -1, -1}));
	
//	public static final RegistryObject<Item> RainFlushColorizer = Items.register("colorizerrainflush",
//	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
//			, new int[]{/*Main*/6002959, /*Secondary*/7114433, -1, -1, -1, -1}));
	
//	public static final RegistryObject<Item> RainFlushColorizer = Items.register("colorizerrainflush",
//	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
//			, new int[]{/*Main*/6002959, /*Secondary*/7114433, -1, -1, -1, -1}));
	
	public static final RegistryObject<Item> NoiseCrushColorizer = Items.register("colorizernoisecrush",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/12070624, /*Secondary*/1376196, -1, -1, -1, -1}));
	public static final RegistryObject<Item> SlashClawColorizer = Items.register("colorizerslashclaw",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1757475, /*Secondary*/13739546, -1, -1, -1, -1}));
	public static final RegistryObject<Item> ThunderBoltColorizer = Items.register("colorizerthunderbolt",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1477322, /*Secondary*/16774436, -1, -1, -1, -1}));
	public static final RegistryObject<Item> ScorchWheelColorizer = Items.register("colorizerscorchwheel",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/15742976, /*Secondary*/11315882, -1, -1, -1, -1}));
	public static final RegistryObject<Item> WildCoilColorizer = Items.register("colorizerwildcoil",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/15354084, /*Secondary*/109841, -1, -1, -1, -1}));
	public static final RegistryObject<Item> DangerWrapColorizer = Items.register("colorizerdangerwrap",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16751621, /*Secondary*/15330267, -1, -1, -1, -1}));
	public static final RegistryObject<Item> JunkShieldColorizer = Items.register("colorizerjunkshield",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/7698851, /*Secondary*/10075601, -1, -1, -1, -1}));
	public static final RegistryObject<Item> FreezeCrackerColorizer = Items.register("colorizerfreezecracker",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1563089, /*Secondary*/10074295, -1, -1, -1, -1}));
	
	public static final RegistryObject<Item>  FrozenColorizer = Items.register("colorizerfrozen",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/8306157, /*Secondary*/9168095,/*ThirdColor*/16777215, 
							/*WhiteColor*/16777215, /*Glow Bits*/3553082, /*GreyColor*/7518691}));
	public static final RegistryObject<Item>  PetrifiedColorizer = Items.register("colorizerpetrified",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/9737364, /*Secondary*/7566195,/*ThirdColor*/13092807, 
							/*WhiteColor*/16777215, /*Glow Bits*/6710886, /*GreyColor*/6710886}));
	public static final RegistryObject<Item>  StickyColorizer = Items.register("colorizersticky",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16482395, /*Secondary*/16070190,/*ThirdColor*/16409912, 
							/*WhiteColor*/16750423, /*Glow Bits*/16069120, /*GreyColor*/10898486}));
	public static final RegistryObject<Item>  OldPhotoColorizer = Items.register("colorizeroldphoto",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/8542759, /*Secondary*/10908982,/*ThirdColor*/10712638, 
							/*WhiteColor*/13345650, /*Glow Bits*/7030815, /*GreyColor*/6444358}));
	
	public static final RegistryObject<Item> IceWave = Items.register("colorizericewave",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1737675, /*Secondary*/16625195, -1, -1, -1, -1}));
	public static final RegistryObject<Item> FireSwordColorizer = Items.register("colorizerfiresword",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/16386638, /*Secondary*/16747290, -1, -1, -1, -1}));
	public static final RegistryObject<Item> TornadoHoldColorizer = Items.register("colorizertornadohold",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1216876, /*Secondary*/13785337, -1, -1, -1, -1}));
	public static final RegistryObject<Item> WaterBaloonColorizer = Items.register("colorizerwaterbaloon",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/11341309, /*Secondary*/1103260, -1, -1, -1, -1}));
	public static final RegistryObject<Item> ThunderClawColorizer = Items.register("colorizerthunderclaw",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/13725184, /*Secondary*/43248, -1, -1, -1, -1}));
	public static final RegistryObject<Item> FlashBombColorizer = Items.register("colorizerflashbomb",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/1147308, /*Secondary*/16625195, -1, -1, -1, -1}));
	public static final RegistryObject<Item> HomingSniperColorizer = Items.register("colorizerhomingsniper",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/13335066, /*Secondary*/1745611, -1, -1, -1, -1}));
	public static final RegistryObject<Item> AstroCrushColorizer = Items.register("colorizerastrocrush",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/442754, /*Secondary*/16757786, -1, -1, -1, -1}));
	public static final RegistryObject<Item> MegaBallColorizer = Items.register("colorizermegaball",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/14227325, /*Secondary*/1556185, -1, -1, -1, -1}));

	public static final RegistryObject<Item> XColorizer = Items.register("colorizerx",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/2781423, /*Secondary*/5752303, /*ThirdColor*/9614024, 
							/*WhiteColor*/16777215, /*Glow Bits*/16468504, /*GreyColor*/16777215}));
	public static final RegistryObject<Item> ZeroColorizer = Items.register("colorizerzero",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16711680, /*Secondary*/379125, /*ThirdColor*/16763151, 
							/*WhiteColor*/16777215, /*Glow Bits*/2752307, /*GreyColor*/16777215}));
	public static final RegistryObject<Item> BlackZeroColorizer = Items.register("colorizerblackzero",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3158064, /*Secondary*/379125, /*ThirdColor*/16763151, 
							/*WhiteColor*/16777215, /*Glow Bits*/2752307, /*GreyColor*/16777215}));
	public static final RegistryObject<Item> IrregularZeroColorizer = Items.register("colorizerirregularzero",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3158064, /*Secondary*/379125, /*ThirdColor*/6776040, 
							/*WhiteColor*/14737632, /*Glow Bits*/2448340, /*GreyColor*/13799118}));
	public static final RegistryObject<Item> NightmareZeroColorizer = Items.register("colorizerzeronightmare",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/11277567, /*Secondary*/9764845, /*ThirdColor*/13402830, /*WhiteColor*/9764845,
							/*Glow Bits*/1376087, /*GreyColor*/9614024}));
	
	public static final RegistryObject<Item>  VileColorizer = Items.register("colorizervile",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/8728033, /*Secondary*/5066061,/*ThirdColor*/16772915, 
							/*WhiteColor*/16777215, /*Glow Bits*/16728361, /*GreyColor*/12105912}));
	
	public static final RegistryObject<Item> RollingShieldColorizer = Items.register("colorizerrollingshield",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16727426, /*Secondary*/11325589, -1, -1, -1, -1}));
	public static final RegistryObject<Item> BoomerangCutterColorizer = Items.register("colorizerboomerangcutter",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/8290996, /*Secondary*/11063731, -1, -1, -1, -1}));
	public static final RegistryObject<Item> ShotgunIceColorizer = Items.register("colorizershotgunice",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/3661819, /*Secondary*/16042302, -1, -1, -1, -1}));
	public static final RegistryObject<Item> FireWaveColorizer = Items.register("colorizerfirewave",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16662283, /*Secondary*/16691754, -1, -1, -1, -1}));
	public static final RegistryObject<Item> StormTornadoColorizer = Items.register("colorizerstormtornado",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/10309308, /*Secondary*/15635914, -1, -1, -1, -1}));
	public static final RegistryObject<Item> ElectricSparkColorizer = Items.register("colorizerelectricspark",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16754975, /*Secondary*/15326926, -1, -1, -1, -1}));
	public static final RegistryObject<Item> ChameleonStingColorizer = Items.register("colorizerchameleonsting",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/1357897, /*Secondary*/9173186, -1, -1, -1, -1}));
	public static final RegistryObject<Item> HomingTorpedoColorizer = Items.register("colorizerhomingtorpedo",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/6978666, /*Secondary*/14070390, -1, -1, -1, -1}));
	
	public static final RegistryObject<Item> SpeedBurnerColorizer = Items.register("colorizerspeedburner",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15404288, /*Secondary*/11794431, -1, -1, -1, -1}));
	public static final RegistryObject<Item> SilkShotColorizer = Items.register("colorizersilkshot",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16342052, /*Secondary*/5439380, -1, -1, -1, -1}));
	public static final RegistryObject<Item> CrystalHunterColorizer = Items.register("colorizercrystalhunter",
	() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
			, new int[]{/*Main*/5563384, /*Secondary*/15180534, -1, -1, -1, -1}));
	public static final RegistryObject<Item> BubbleSplashColorizer = Items.register("colorizerbubblesplash",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15646225, /*Secondary*/16425956, -1, -1, -1, -1}));
	public static final RegistryObject<Item> SonicSlicerColorizer = Items.register("colorizersonicslicer",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/8080379, /*Secondary*/16752174, -1, -1, -1, -1}));
	public static final RegistryObject<Item> StrikeChainColorizer = Items.register("colorizerstrikechain",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/12554489, /*Secondary*/12237498, -1, -1, -1, -1}));
	public static final RegistryObject<Item> MagnetMineColorizer = Items.register("colorizermagnetmine",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/7237230, /*Secondary*/16577329, -1, -1, -1, -1}));
	
	public static final RegistryObject<Item> DrainedColorizer = Items.register("colorizerdrained",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/6047422, /*Secondary*/8234928, /*ThirdColor*/-1, /*WhiteColor*/14863069,
							/*Glow Bits*/12943768, /*GreyColor*/14863069}));
	public static final RegistryObject<Item> SpeedBurnerChargedColorizer = Items.register("colorizerchargedspeedburner",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/16739610, /*Secondary*/16497985, /*ThirdColor*/16771354, /*WhiteColor*/14067743,
							/*Glow Bits*/16066304, /*GreyColor*/14054431}));
	
	public static final RegistryObject<Item> TunnelFangColorizer = Items.register("colorizertunnelfang",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6094814, /*Secondary*/15836731, -1, -1, -1, -1}));
	public static final RegistryObject<Item> GravityWellsColorizer = Items.register("colorizergravitywells",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15095287, /*Secondary*/13874312, -1, -1, -1, -1}));
	public static final RegistryObject<Item> AcidBurstColorizer = Items.register("colorizeracidburst",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6946631, /*Secondary*/16759864, -1, -1, -1, -1}));
	public static final RegistryObject<Item> RaySplasherColorizer = Items.register("colorizerraysplasher",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16224776, /*Secondary*/16249608, -1, -1, -1, -1}));
	public static final RegistryObject<Item> FrostSheildColorizer = Items.register("colorizerfrostsheild",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6807766, /*Secondary*/13466071, -1, -1, -1, -1}));
	
	public static final RegistryObject<Item>HyperchipColorizer = Items.register("colorizerhyperchip",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer).isImmuneToFire()
					, new int[]{/*Main*/16755999, /*Secondary*/16764969, /*ThirdColor*/-1, /*WhiteColor*/16703105,
							/*Glow Bits*/16728361, /*GreyColor*/16703105}));
	
	public static final RegistryObject<Item> HelmetchipColorizer = Items.register("colorizerhelmetchip",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer).isImmuneToFire()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/4039746,
							/*Glow Bits*/-1, /*GreyColor*/-1}));
	
	public static final RegistryObject<Item> ArmorchipColorizer = Items.register("colorizerarmorchip",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/14076974,
							/*Glow Bits*/-1, /*GreyColor*/-1}));
	
	public static final RegistryObject<Item> LegchipColorizer = Items.register("colorizerlegchip",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/1723647,
							/*Glow Bits*/-1, /*GreyColor*/-1}));
	
	public static final RegistryObject<Item> BusterchipColorizer = Items.register("colorizerbusterchip",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/16716836,
							/*Glow Bits*/-1, /*GreyColor*/-1}));
	
	public static final RegistryObject<Item> BetaHyperchipColorizer = Items.register("colorizerbetahyperchip",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/3552822,
							/*Glow Bits*/-1, /*GreyColor*/-1}));
	//X4
	public static final RegistryObject<Item> XalternateColorizer = Items.register("colorizerxalternate",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3320059, /*Secondary*/11891667, -1, -1, -1, -1}));
//	public static final RegistryObject<Item> SoulBodyColorizer = Items.register("colorizersoulbody",
//			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
//					new int[]{/*Main*/15231782, /*Secondary*/15517269, -1, -1, -1, -1}));
	
	public static final RegistryObject<Item> MagmaBladeColorizer = Items.register("colorizermagmablade",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16680982, /*Secondary*/16708480, -1, -1, -1, -1}));
	public static final RegistryObject<Item> MeteorRainColorizer = Items.register("colorizermeteorrain",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6184797, /*Secondary*/15208194, -1, -1, -1, -1}));
	public static final RegistryObject<Item> GuardShellColorizer = Items.register("colorizerguardshell",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16739227, /*Secondary*/16773739, -1, -1, -1, -1}));
	public static final RegistryObject<Item> RayArrowColorizer = Items.register("colorizerrayarrow",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/13765375, /*Secondary*/12445138, -1, -1, -1, -1}));
	public static final RegistryObject<Item> IceBurstColorizer = Items.register("colorizericeburst",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/7458036, /*Secondary*/9676764, -1, -1, -1, -1}));
	public static final RegistryObject<Item> GroundDashColorizer = Items.register("colorizergrounddash",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/11436635, /*Secondary*/14388557, -1, -1, -1, -1}));
	public static final RegistryObject<Item> YammerOptionColorizer = Items.register("colorizeryammeroption",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/3649101, /*Secondary*/15371822, -1, -1, -1, -1}));
	public static final RegistryObject<Item> MetalAnchorColorizer = Items.register("colorizermetalanchor",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/7174330, /*Secondary*/16184763, -1, -1, -1, -1}));
	
	public static final RegistryObject<Item> VoltTornadoColorizer = Items.register("colorizervolttornado",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/15105024, /*Secondary*/13550887, -1, -1, -1, -1}));
	//??? 7830403
	public static final RegistryObject<Item> WindCutterColorizer = Items.register("colorizerwindcutter",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/7357316, /*Secondary*/13854172, -1, -1, -1, -1}));
	//??? 10386858
	
	public static final RegistryObject<Item> MagneticShockwaveColorizer = Items.register("colorizermagneticshockwave",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/12454287, /*Secondary*/16714250, -1, -1, -1, -1}));
	
	public static final RegistryObject<Item> SonicShotColorizer = Items.register("colorizersonicshot",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/1015782, /*Secondary*/2928570, -1, -1, -1, -1}));
	public static final RegistryObject<Item> TailsWindColorizer = Items.register("colorizertailswind",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16748570, /*Secondary*/16777215, -1, -1, -1, -1}));
	public static final RegistryObject<Item> PikoHammerColorizer = Items.register("colorizerpikohammer",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/14366996, /*Secondary*/16091788, -1, -1, -1, -1}));
	public static final RegistryObject<Item> SharpKnuckleColorizer = Items.register("colorizersharpknuckle",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/13378596, /*Secondary*/16777215, -1, -1, -1, -1}));
	public static final RegistryObject<Item> BlackWaveColorizer = Items.register("colorizerblackwave",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/16514301, /*Secondary*/5717630, -1, -1, -1, -1}));
	public static final RegistryObject<Item> ChaosCannonColorizer = Items.register("colorizerchaoscannon",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/5853803, /*Secondary*/13711150, -1, -1, -1, -1}));
	public static final RegistryObject<Item> ChromaCamoColorizer = Items.register("colorizerchromacamo",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/10972326, /*Secondary*/8219815, -1, -1, -1, -1}));
	public static final RegistryObject<Item> RapidStingerColorizer = Items.register("colorizerrapidstinger",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/6316646, /*Secondary*/16764457, -1, -1, -1, -1}));
	public static final RegistryObject<Item> AcousticBlasterColorizer = Items.register("colorizeracousticblaster",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/8504889, /*Secondary*/11518800, -1, -1, -1, -1}));
	public static final RegistryObject<Item> PsychoBurstColorizer = Items.register("colorizerpsychoburst",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/12972766, /*Secondary*/1406292, -1, -1, -1, -1}));
	public static final RegistryObject<Item> FireTornadoColorizer = Items.register("colorizerfiretornado",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/11956917, /*Secondary*/15582445, -1, -1, -1, -1}));
	
//	public static final RegistryObject<Item> SeieiEnbuColorizer = Items.register("colorizerseieienbu",
//			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
//					new int[]{/*Main*/6849261, /*Secondary*/4768480, -1, -1, -1, -1}));
	
	public static final RegistryObject<Item> SifttoDarkColorizer = Items.register("colorizershiftdark",
			() -> new ArmorColorizerColorShift(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					,4013373 , 10));
	public static final RegistryObject<Item> SifttoLightColorizer = Items.register("colorizershiftlight",
			() -> new ArmorColorizerColorShift(new Item.Properties().group(MegamanArmorMod.ArmorColorizer)
					,14935011 , 10));

	
	public static final RegistryObject<Item> RandomColorizer = Items.register("colorizerrandom",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer), 
					new int[]{/*Main*/-3, /*Secondary*/-3, -3, -3, -3, -3}));
	
	public static final RegistryObject<Item> NegativeColorizer = Items.register("colorizernegative",
			() -> new ArmorColorizer(new Item.Properties().group(MegamanArmorMod.ArmorColorizer).isImmuneToFire(), 
					new int[]{/*Main*/-4, /*Secondary*/-4, -4, -4, -4, -4}));
	
	public static final RegistryObject<Item> MainColorColorizer = Items.register("colorizermaincolor",
			() -> new ArmorColorizerCustom(new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
							/*Glow Bits*/-1, /*GreyColor*/-1}, "MainColor"));
	public static final RegistryObject<Item> SecondaryColorColorizer = Items.register("colorizersecondarycolor",
			() -> new ArmorColorizerCustom(new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
							/*Glow Bits*/-1, /*GreyColor*/-1}, "SecondaryColor"));
	public static final RegistryObject<Item> ThirdColorColorizer = Items.register("colorizerthirdcolor",
			() -> new ArmorColorizerCustom(new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
							/*Glow Bits*/-1, /*GreyColor*/-1}, "ThirdColor"));
	public static final RegistryObject<Item> whiteColorColorizer = Items.register("colorizerwhitecolor",
			() -> new ArmorColorizerCustom(new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
							/*Glow Bits*/-1, /*GreyColor*/-1}, "WhiteColor"));
	public static final RegistryObject<Item> GlowColorColorizer = Items.register("colorizerglowycolor",
			() -> new ArmorColorizerCustom(new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()//.setISTER(ister)
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
							/*Glow Bits*/-1, /*GreyColor*/-1}, "GlowyColor"));
	public static final RegistryObject<Item> GrayColorColorizer = Items.register("colorizergraycolor",
			() -> new ArmorColorizerCustom(new Item.Properties().group(MegamanArmorMod.MMTab).isImmuneToFire()
					, new int[]{/*Main*/-1, /*Secondary*/-1, /*ThirdColor*/-1, /*WhiteColor*/-1,
							/*Glow Bits*/-1, /*GreyColor*/-1}, "GrayColor"));
	
	public static final RegistryObject<Item> MegamanArmor_Head = Items.register("megamanarmor_head",
			() -> new MegamanArmorColor(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> MegamanArmor_Arms = Items.register("megamanarmor_arms",
			() -> new MegamanArmorColor(ArmorMaterials.MegamanArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> MegamanArmor_Body = Items.register("megamanarmor_body",
			() -> new MegamanArmorColor(ArmorMaterials.MegamanArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> MegamanArmor_Legs = Items.register("megamanarmor_legs",
			() -> new MegamanArmorLegsColor(ArmorMaterials.MegamanArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab))
			);//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> MegamanArmorEvil = Items.register("megamanevil",
			() -> new com.collecter128.megamanarmormod.items.MegamanArmorEvil(ArmorMaterials.MegamanArmor, 
					EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> QuintArmor_Head = Items.register("quintarmor_head",
			() -> new QuintArmor(ArmorMaterials.QuintArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> QuintArmor_Arms = Items.register("quintarmor_arms",
			() -> new QuintArmor(ArmorMaterials.QuintArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> QuintArmor_Body = Items.register("quintarmor_body",
			() -> new QuintArmor(ArmorMaterials.QuintArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> QuintArmor_Legs = Items.register("quintarmor_legs",
			() -> new QuintArmor(ArmorMaterials.QuintArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));
	
	
	public static final RegistryObject<Item> LightLabcoat = Items.register("drlightlabcoat",
			() -> new com.collecter128.megamanarmormod.items.LightLabcoat(ArmorMaterials.LightLabcoat, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
	
//	public static final RegistryObject<Item> RyuHeaband = Items.register("ryu_headband",
//			() -> new com.collecter128.megamanarmormod.items.RyuGi(ArmorMaterials.LightLabcoat, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));
//	public static final RegistryObject<Item> Ryugi = Items.register("ryu_gi",
//			() -> new com.collecter128.megamanarmormod.items.RyuGi(ArmorMaterials.LightLabcoat, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
//	public static final RegistryObject<Item> RyuPants = Items.register("ryu_pants",
//			() -> new com.collecter128.megamanarmormod.items.RyuGi(ArmorMaterials.LightLabcoat, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> MettaurHelmet = Items.register("mettaurhelmet",
			() -> new com.collecter128.megamanarmormod.items.MettaurHelmet(ArmorMaterials.MegamanArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));
	
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
			() -> new Buster(3, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> XArmor_Body = Items.register("xarmor_body",
			() -> new XArmorChest(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> XArmor_Legs = Items.register("xarmor_legs",
			() -> new XArmorLegs(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> iFXArmor_Body = Items.register("ifxarmor_body",
			() -> new IFXArmor(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
	
//	public static final RegistryObject<Item> XTransparentArmor_Head = Items.register("xtransparentarmor_head",
//			() -> new XArmorClear(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
//	public static final RegistryObject<Item> XTransparentArmor_Arms = Items.register("xtransparentarmor_arms",
//			() -> new XArmorClearFeet(ArmorMaterials.XArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
//	public static final RegistryObject<Item> XTransparentArmor_Body = Items.register("xtransparentarmor_body",
//			() -> new XArmorClearChest(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
//	public static final RegistryObject<Item> XTransparentArmor_Legs = Items.register("xtransparentarmor_legs",
//			() -> new XArmorClearLegs(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> Military_Buster = Items.register("military_buster",
			() -> new Buster(4, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> FirstArmor_Head = Items.register("firstarmor_head",
			() -> new FirstArmor(ArmorMaterials.FirstXArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> FirstArmor_Arms = Items.register("firstarmor_arms",
			() -> new FirstArmor(ArmorMaterials.FirstXArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> FirstArmor_Body = Items.register("firstarmor_body",
			() -> new FirstArmor(ArmorMaterials.FirstXArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> FirstArmor_Legs = Items.register("firstarmor_legs",
			() -> new FirstArmor(ArmorMaterials.FirstXArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> iXArmor_Head = Items.register("ixarmor_head",
			() -> new iXArmor(ArmorMaterials.XArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> iXArmor_Arms = Items.register("ixarmor_arms",
			() -> new iXArmor(ArmorMaterials.XArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> iXArmor_Body = Items.register("ixarmor_body",
			() -> new iXArmor(ArmorMaterials.XArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));
	public static final RegistryObject<Item> iXArmor_Legs = Items.register("ixarmor_legs",
			() -> new iXArmorLegs(ArmorMaterials.XArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));
	
	public static final RegistryObject<Item> ZeroArmorFirst_Head = Items.register("zeroarmorfirst_head",
			() -> new ZeroArmorFirst(ArmorMaterials.ZeroArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmorFirst_Arms = Items.register("zeroarmorfirst_arms",
			() -> new ZeroArmorFirst(ArmorMaterials.ZeroArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmorFirst_Body = Items.register("zeroarmorfirst_body",
			() -> new ZeroArmorFirst(ArmorMaterials.ZeroArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmorFirst_Legs = Items.register("zeroarmorfirst_legs",
			() -> new ZeroArmorLegsFirst(ArmorMaterials.ZeroArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> ZeroArmor_Head = Items.register("zeroarmor_head",
			() -> new ZeroArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.HEAD, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmor_Arms = Items.register("zeroarmor_arms",
			() -> new ZeroArmorFeet(ArmorMaterials.ZeroArmor, EquipmentSlotType.FEET, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmor_Body = Items.register("zeroarmor_body",
			() -> new ZeroArmorChest(ArmorMaterials.ZeroArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZeroArmor_Legs = Items.register("zeroarmor_legs",
			() -> new ZeroArmorLegs(ArmorMaterials.ZeroArmor, EquipmentSlotType.LEGS, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> iFZeroArmor_Body = Items.register("ifzeroarmor_body",
			() -> new IFZeroArmor(ArmorMaterials.ZeroArmor, EquipmentSlotType.CHEST, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
	public static final RegistryObject<Item> Zsaber = Items.register("zsaber",
			() -> new SwordItem(ItemTier.DIAMOND, 4, -2.4F, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZsaberPlus1 = Items.register("zsaberplus1",
			() -> new SwordItem(ItemTier.DIAMOND, 5, -2.4F, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> ZsaberPlus2 = Items.register("zsaberplus2",
			() -> new SwordItem(ItemTier.DIAMOND, 6, -2.4F, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	public static final RegistryObject<Item> Zichimonji = Items.register("zichimonji",
			() -> new SwordItem(ItemTier.DIAMOND, 5, -1.5F, new Item.Properties().group(MegamanArmorMod.MMTab)));//MegamanArmorMod.ArmorItems_Group
	
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
