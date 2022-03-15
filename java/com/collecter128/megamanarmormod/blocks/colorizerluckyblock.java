package com.collecter128.megamanarmormod.blocks;

import java.util.Random;

import com.collecter128.megamanarmormod.core.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class colorizerluckyblock extends Block{
	
	   public colorizerluckyblock(Properties properties) {
		super(properties);
	   }

	/**
	    * Called before the Block is set to air in the world. Called regardless of if the player's tool can actually collect
	    * this block
	    */
	   public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
	      if (!worldIn.isRemote()) {
	    	 ItemStack itemstackIn = new ItemStack(ItemInit.DefaultColorizer.get());
	    	 Random random = new Random();
	    	 int RandomInt = random.nextInt(122);
	    	 
	    	 switch(RandomInt) {
	    	 	case -1: //like fireworks? Also Custom Name like potion or spawn egg. Spawn Eggstyle coloring???
	    	 		itemstackIn = new ItemStack(ItemInit.MegamanColorizer.get());
	    	 		itemstackIn.getOrCreateChildTag("displaymm").putInt("MainColor", 342773);
	    	 		itemstackIn.getOrCreateChildTag("displaymm").putInt("SecondaryColor", 342773);
	    	 		//"ThirdColor"
	    	 		//"FourthColor"
	    	 		//"WhiteColor"
	    	 		//"GlowyColor"
	    	 		//"GrayColor"
	    	 		//"GlowStyle"
	    	 		//tooltip.add((new TranslationTextComponent("item.megamanarmormod.colorizertext")).appendString(" ").appendString(String.valueOf((int)compoundnbt.getByte("Flight")))
	    	 		//	.mergeStyle(TextFormatting.GRAY)); // Maybe color color
	    	 		
	    	 		break;
	    	 	case 0: 
	    	 		itemstackIn = new ItemStack(ItemInit.MegamanColorizer.get());
	    	 		break;
	    	 	case 1: 
	    	 		itemstackIn = new ItemStack(ItemInit.MegamanEvilColorizer.get());
	    	 		break;
	    	 	case 2: 
	    	 		itemstackIn = new ItemStack(ItemInit.SuperAdapterColorizer.get());
	    	 		break;
	    	 	case 3: 
	    	 		itemstackIn = new ItemStack(ItemInit.RushColorizer.get());
	    	 		break;
	    	 	case 4: 
	    	 		itemstackIn = new ItemStack(ItemInit.ProtomanColorizer.get());
	    	 		break;
	    	 	case 5: 
	    	 		itemstackIn = new ItemStack(ItemInit.QuintColorizer.get());
	    	 		break;
	    	 	case 6: 
	    	 		itemstackIn = new ItemStack(ItemInit.BreakmanColorizer.get());
	    	 		break;
	    	 		

	    	 	case 7: 
	    	 		itemstackIn = new ItemStack(ItemInit.SuperArmColorizer.get());
	    	 		break;
	    	 	case 8: 
	    	 		itemstackIn = new ItemStack(ItemInit.ThunderBeamColorizer.get());
	    	 		break;
	    	 	case 9: 
	    	 		itemstackIn = new ItemStack(ItemInit.RollingCutterColorizer.get());
	    	 		break;
	    	 	case 10: 
	    	 		itemstackIn = new ItemStack(ItemInit.HyperBombColorizer.get());
	    	 		break;
	    	 	case 11:
	    	 		itemstackIn = new ItemStack(ItemInit.FireStormColorizer.get());
	    	 		break;
	    	 	case 12: 
	    	 		itemstackIn = new ItemStack(ItemInit.IceSlasherColorizer.get());
	    	 		break;
	    	 	case 13: 
	    	 		itemstackIn = new ItemStack(ItemInit.OilSliderColorizer.get());
	    	 		break;
	    	 	case 14: 
	    	 		itemstackIn = new ItemStack(ItemInit.TimeSlowColorizer.get());
	    	 		break;
	    	 		
	    	 	case 15: 
	    	 		itemstackIn = new ItemStack(ItemInit.CrashBomberColorizer.get());
	    	 		break;
	    	 	case 16: 
	    	 		itemstackIn = new ItemStack(ItemInit.LeafSheildColorizer.get());
	    	 		break;
	    	 	case 17: 
	    	 		itemstackIn = new ItemStack(ItemInit.AirShooterColorizer.get());
	    	 		break;
	    	 	case 18: 
	    	 		itemstackIn = new ItemStack(ItemInit.BubbleLeadColorizer.get());
	    	 		break;
	    	 	case 19: 
	    	 		itemstackIn = new ItemStack(ItemInit.QuickBoomerangColorizer.get());
	    	 		break;
	    	 	case 20: 
	    	 		itemstackIn = new ItemStack(ItemInit.AtomicfireColorizer.get());
	    	 		break;
	    	 	case 21: 
	    	 		itemstackIn = new ItemStack(ItemInit.MetalBladeColorizer.get());
	    	 		break;
	    	 	case 22: 
	    	 		itemstackIn = new ItemStack(ItemInit.TimeStopperColorizer.get());
	    	 		break;
	    	 	case 23: 
	    	 		itemstackIn = new ItemStack(ItemInit.Item123Colorizer.get());
	    	 		break;
	    	 		
	    	 	case 24: 
	    	 		itemstackIn = new ItemStack(ItemInit.ShadowBladeColorizer.get());
	    	 		break;
	    	 	case 25: 
	    	 		itemstackIn = new ItemStack(ItemInit.HardKnuckleColorizer.get());
	    	 		break;
	    	 	case 26: 
	    	 		itemstackIn = new ItemStack(ItemInit.NeedleCannonColorizer.get());
	    	 		break;
	    	 	case 27: 
	    	 		itemstackIn = new ItemStack(ItemInit.SearchSnakeColorizer.get());
	    	 		break;
	    	 	case 28: 
	    	 		itemstackIn = new ItemStack(ItemInit.TopSpinColorizer.get());
	    	 		break;
	    	 	case 29: 
	    	 		itemstackIn = new ItemStack(ItemInit.MagnetMissileColorizer.get());
	    	 		break;
	    	 	case 30: 
	    	 		itemstackIn = new ItemStack(ItemInit.SparkShockColorizer.get());
	    	 		break;
	    	 	case 31: 
	    	 		itemstackIn = new ItemStack(ItemInit.GeminiLaserColorizer.get());
	    	 		break;
	    	 		
	    	 	case 32: 
	    	 		itemstackIn = new ItemStack(ItemInit.NoiseCrushColorizer.get());
	    	 		break;
	    	 	case 33: 
	    	 		itemstackIn = new ItemStack(ItemInit.WildCoilColorizer.get());
	    	 		break;
	    	 	case 34: 
	    	 		itemstackIn = new ItemStack(ItemInit.SlashClawColorizer.get());
	    	 		break;
	    	 	case 35: 
	    	 		itemstackIn = new ItemStack(ItemInit.JunkShieldColorizer.get());
	    	 		break;
	    	 	case 36: 
	    	 		itemstackIn = new ItemStack(ItemInit.DangerWrapColorizer.get());
	    	 		break;
	    	 	case 37: 
	    	 		itemstackIn = new ItemStack(ItemInit.ScorchWheelColorizer.get());
	    	 		break;
	    	 	case 38: 
	    	 		itemstackIn = new ItemStack(ItemInit.ThunderBoltColorizer.get());
	    	 		break;
	    	 	case 39: 
	    	 		itemstackIn = new ItemStack(ItemInit.FreezeCrackerColorizer.get());
	    	 		break;
	    	 		
	    	 	case 40: 
	    	 		itemstackIn = new ItemStack(ItemInit.FrozenColorizer.get());
	    	 		break;
	    	 	case 41: 
	    	 		itemstackIn = new ItemStack(ItemInit.OldPhotoColorizer.get());
	    	 		break;
	    	 	case 42: 
	    	 		itemstackIn = new ItemStack(ItemInit.PetrifiedColorizer.get());
	    	 		break;
	    	 	case 43: 
	    	 		itemstackIn = new ItemStack(ItemInit.StickyColorizer.get());
	    	 		break;
	    	 		
	    	 	case 44: 
	    	 		itemstackIn = new ItemStack(ItemInit.IceWave.get());
	    	 		break;
	    	 	case 45: 
	    	 		itemstackIn = new ItemStack(ItemInit.FireSwordColorizer.get());
	    	 		break;
	    	 	case 46: 
	    	 		itemstackIn = new ItemStack(ItemInit.MegaBallColorizer.get());
	    	 		break;
	    	 	case 47: 
	    	 		itemstackIn = new ItemStack(ItemInit.HomingSniperColorizer.get());
	    	 		break;
	    	 	case 48: 
	    	 		itemstackIn = new ItemStack(ItemInit.TornadoHoldColorizer.get());
	    	 		break;
	    	 	case 49: 
	    	 		itemstackIn = new ItemStack(ItemInit.WaterBaloonColorizer.get());
	    	 		break;
	    	 	case 50: 
	    	 		itemstackIn = new ItemStack(ItemInit.AstroCrushColorizer.get());
	    	 		break;
	    	 	case 51: 
	    	 		itemstackIn = new ItemStack(ItemInit.ThunderClawColorizer.get());
	    	 		break;
	    	 	case 52: 
	    	 		itemstackIn = new ItemStack(ItemInit.FlashBombColorizer.get());
	    	 		break;
	    	 		
	    	 	case 53: 
	    	 		itemstackIn = new ItemStack(ItemInit.SonicShotColorizer.get());
	    	 		break;
	    	 	case 54: 
	    	 		itemstackIn = new ItemStack(ItemInit.TailsWindColorizer.get());
	    	 		break;
	    	 	case 58: 
	    	 		itemstackIn = new ItemStack(ItemInit.PsychoBurstColorizer.get());
	    	 		break;
	    	 	case 55: 
	    	 		itemstackIn = new ItemStack(ItemInit.AcousticBlasterColorizer.get());
	    	 		break;
	    	 	case 91: 
	    	 		itemstackIn = new ItemStack(ItemInit.MagneticShockwaveColorizer.get());
	    	 		break;
	    	 	case 92: 
	    	 		itemstackIn = new ItemStack(ItemInit.FireTornadoColorizer.get());
	    	 		break;
	    	 	case 93: 
	    	 		itemstackIn = new ItemStack(ItemInit.ChaosCannonColorizer.get());
	    	 		break;
	    	 	case 94: 
	    	 		itemstackIn = new ItemStack(ItemInit.RapidStingerColorizer.get());
	    	 		break;
	    	 	case 56: 
	    	 		itemstackIn = new ItemStack(ItemInit.SharpKnuckleColorizer.get());
	    	 		break;
	    	 	case 95: 
	    	 		itemstackIn = new ItemStack(ItemInit.ChromaCamoColorizer.get());
	    	 		break;
	    	 	case 57: 
	    	 		itemstackIn = new ItemStack(ItemInit.PikoHammerColorizer.get());
	    	 		break;
	    	 	case 96: 
	    	 		itemstackIn = new ItemStack(ItemInit.BlackWaveColorizer.get());
	    	 		break;
	    	 		
	    	 	case 59: 
	    	 		itemstackIn = new ItemStack(ItemInit.RollingShieldColorizer.get());
	    	 		break;
	    	 	case 60: 
	    	 		itemstackIn = new ItemStack(ItemInit.BoomerangCutterColorizer.get());
	    	 		break;
	    	 	case 98: 
	    	 		itemstackIn = new ItemStack(ItemInit.ShotgunIceColorizer.get());
	    	 		break;
	    	 	case 99: 
	    	 		itemstackIn = new ItemStack(ItemInit.FireWaveColorizer.get());
	    	 		break;
	    	 	case 100: 
	    	 		itemstackIn = new ItemStack(ItemInit.StormTornadoColorizer.get());
	    	 		break;
	    	 	case 101: 
	    	 		itemstackIn = new ItemStack(ItemInit.ElectricSparkColorizer.get());
	    	 		break;
	    	 	case 102: 
	    	 		itemstackIn = new ItemStack(ItemInit.ChameleonStingColorizer.get());
	    	 		break;
	    	 	case 103: 
	    	 		itemstackIn = new ItemStack(ItemInit.HomingTorpedoColorizer.get());
	    	 		break;
	    	 		
	    	 	case 104: 
	    	 		itemstackIn = new ItemStack(ItemInit.XColorizer.get());
	    	 		break;
	    	 	case 105: 
	    	 		itemstackIn = new ItemStack(ItemInit.ZeroColorizer.get());
	    	 		break;
	    	 	case 61: 
	    	 		itemstackIn = new ItemStack(ItemInit.BlackZeroColorizer.get());
	    	 		break;
	    	 	case 62: 
	    	 		itemstackIn = new ItemStack(ItemInit.VileColorizer.get());
	    	 		break;
	    	 		
	    	 		
	    	 	case 86:
	    	 		itemstackIn = new ItemStack(ItemInit.CrystalHunterColorizer.get());
	    	 		break;
	    	 	case 89: 
	    	 		itemstackIn = new ItemStack(ItemInit.SonicSlicerColorizer.get());
	    	 		break;
	    	 	case 90: 
	    	 		itemstackIn = new ItemStack(ItemInit.SpeedBurnerChargedColorizer.get());
	    	 		break;
	    	 	case 85: 
	    	 		itemstackIn = new ItemStack(ItemInit.SpeedBurnerColorizer.get());
	    	 		break;
	    	 	case 106: 
	    	 		itemstackIn = new ItemStack(ItemInit.SilkShotColorizer.get());
	    	 		break;
	    	 	case 107: 
	    	 		itemstackIn = new ItemStack(ItemInit.BubbleSplashColorizer.get());
	    	 		break;
	    	 	case 108: 
	    	 		itemstackIn = new ItemStack(ItemInit.StrikeChainColorizer.get());
	    	 		break;
	    	 	case 109: 
	    	 		itemstackIn = new ItemStack(ItemInit.MagnetMineColorizer.get());
	    	 		break;
	    	 	case 110: 
	    	 		itemstackIn = new ItemStack(ItemInit.DrainedColorizer.get());
	    	 		break;

	    	 	case 63: 
	    	 		itemstackIn = new ItemStack(ItemInit.AcidBurstColorizer.get());
	    	 		break;
	    	 	case 64: 
	    	 		itemstackIn = new ItemStack(ItemInit.RaySplasherColorizer.get());
	    	 		break;
	    	 	case 65: 
	    	 		itemstackIn = new ItemStack(ItemInit.FrostSheildColorizer.get());
	    	 		break;
	    	 	case 87: 
	    	 		itemstackIn = new ItemStack(ItemInit.GravityWellsColorizer.get());
	    	 		break;
	    	 	case 66: 
	    	 		itemstackIn = new ItemStack(ItemInit.TunnelFangColorizer.get());
	    	 		break;
	    	 		
	    	 	case 67: 
	    	 		itemstackIn = new ItemStack(ItemInit.HyperchipColorizer.get());
	    	 		break;
	    	 		
	    	 	case 111: 
	    	 		itemstackIn = new ItemStack(ItemInit.HelmetchipColorizer.get());
	    	 		break;
	    	 	case 112: 
	    	 		itemstackIn = new ItemStack(ItemInit.ArmorchipColorizer.get());
	    	 		break;
	    	 	case 113: 
	    	 		itemstackIn = new ItemStack(ItemInit.BusterchipColorizer.get());
	    	 		break;
	    	 	case 114: 
	    	 		itemstackIn = new ItemStack(ItemInit.LegchipColorizer.get());
	    	 		break;
	    	 	case 115: 
	    	 		itemstackIn = new ItemStack(ItemInit.BetaHyperchipColorizer.get());
	    	 		break;
	    	 		
	    	 	case 80: 
	    	 		itemstackIn = new ItemStack(ItemInit.XalternateColorizer.get());
	    	 		break;
	    	 	case 81: 
	    	 		itemstackIn = new ItemStack(ItemInit.IrregularZeroColorizer.get());
	    	 		break;
	    	 	case 116: 
	    	 		itemstackIn = new ItemStack(ItemInit.NightmareZeroColorizer.get());
	    	 		break;
	    	 		
	    	 	case 68: 
	    	 		itemstackIn = new ItemStack(ItemInit.MeteorRainColorizer.get());
	    	 		break;
	    	 	case 69: 
	    	 		itemstackIn = new ItemStack(ItemInit.GroundDashColorizer.get());
	    	 		break;
	    	 	case 70: 
	    	 		itemstackIn = new ItemStack(ItemInit.IceBurstColorizer.get());
	    	 		break;
	    	 	case 71: 
	    	 		itemstackIn = new ItemStack(ItemInit.RayArrowColorizer.get());
	    	 		break;
	    	 	case 117: 
	    	 		itemstackIn = new ItemStack(ItemInit.MagmaBladeColorizer.get());
	    	 		break;
	    	 	case 118: 
	    	 		itemstackIn = new ItemStack(ItemInit.GuardShellColorizer.get());
	    	 		break;
	    	 	case 119: 
	    	 		itemstackIn = new ItemStack(ItemInit.YammerOptionColorizer.get());
	    	 		break;
	    	 	case 120: 
	    	 		itemstackIn = new ItemStack(ItemInit.MetalAnchorColorizer.get());
	    	 		break;
	    	 		
	    	 	case 72: 
	    	 		itemstackIn = new ItemStack(ItemInit.VoltTornadoColorizer.get());
	    	 		break;
	    	 	case 73: 
	    	 		itemstackIn = new ItemStack(ItemInit.WindCutterColorizer.get());
	    	 		break;
	    	 		
	    	 	case 121: 
	    	 		itemstackIn = new ItemStack(ItemInit.MagneticShockwaveColorizer.get());
	    	 		break;
	    	 		
	    	 	case 74: 
	    	 		itemstackIn = new ItemStack(ItemInit.RandomColorizer.get());
	    	 		break;
	    	 	case 84: 
	    	 		itemstackIn = new ItemStack(ItemInit.SecondaryColorColorizer.get());
	    	 		break;
	    	 	case 75: 
	    	 		itemstackIn = new ItemStack(ItemInit.ThirdColorColorizer.get());
	    	 		break;
	    	 	case 76: 
	    	 		itemstackIn = new ItemStack(ItemInit.whiteColorColorizer.get());
	    	 		break;
	    	 	case 97: 
	    	 		itemstackIn = new ItemStack(ItemInit.GlowColorColorizer.get());
	    	 		break;
	    	 	case 77: 
	    	 		itemstackIn = new ItemStack(ItemInit.SifttoLightColorizer.get());
	    	 		break;
	    	 	case 78: 
	    	 		itemstackIn = new ItemStack(ItemInit.SifttoDarkColorizer.get());
	    	 		break;
	    	 	case 79: 
	    	 		itemstackIn = new ItemStack(ItemInit.NegativeColorizer.get());
	    	 		break;
	    	 		
	    	 	default:
	    	 		itemstackIn = new ItemStack(ItemInit.DefaultColorizer.get());
	    	 }
	    	  
	         worldIn.playEvent((PlayerEntity)null, 1009, pos, 0);
	         player.inventory.addItemStackToInventory(itemstackIn);
	      }

	   }

}
