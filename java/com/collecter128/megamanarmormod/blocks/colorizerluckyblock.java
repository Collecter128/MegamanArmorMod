package com.collecter128.megamanarmormod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.collecter128.megamanarmormod.core.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
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
	   public void playerDestroy(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity p_180657_5_, ItemStack p_180657_6_) {
	   //public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
	      if (!worldIn.isClientSide) {
	    	 ItemStack itemstackIn = new ItemStack(ItemInit.DefaultColorizer.get());
	    	 Random random = new Random();
	    	 int RandomInt = random.nextInt(304);
	    	 
	    	 switch(RandomInt) {
	    	 	case -1: //like fireworks? Also Custom Name like potion or spawn egg. Spawn Eggstyle coloring???
	    	 		itemstackIn = new ItemStack(ItemInit.MegamanColorizer.get());
	    	 		itemstackIn.getOrCreateTagElement("displaymm").putInt("MainColor", 342773);
	    	 		itemstackIn.getOrCreateTagElement("displaymm").putInt("SecondaryColor", 342773);
	    	 		//"ThirdColor"
	    	 		//"FourthColor"
	    	 		//"WhiteColor"
	    	 		//"GlowyColor"
	    	 		//"GrayColor"
	    	 		//"GlowStyle"
	    	 		//tooltip.add((new TranslationTextComponent("item.megamanarmormod.colorizertext")).appendString(" ").appendString(String.valueOf((int)compoundnbt.getByte("Flight")))
	    	 		//	.mergeStyle(TextFormatting.GRAY)); // Maybe color color
	    	 		
	    	 		break;
	    	 	case 269: 
	    	 		itemstackIn = new ItemStack(ItemInit.BlankColorizer.get());
	    	 		break;
	    	 	case 0: 
	    	 		itemstackIn = new ItemStack(ItemInit.MegamanColorizer.get());
	    	 		break;
	    	 	case 271: 
	    	 		itemstackIn = new ItemStack(ItemInit.Megaman2PColorizer.get());
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
	    	 	case 268: 
	    	 		itemstackIn = new ItemStack(ItemInit.RedbullMegamanColorizer.get());
	    	 		break;
	    	 	case 4: 
	    	 		itemstackIn = new ItemStack(ItemInit.ProtomanColorizer.get());
	    	 		break;
	    	 	case 5: 
	    	 		itemstackIn = new ItemStack(ItemInit.QuintColorizer.get());
	    	 		break;
	    	 	case 254: 
	    	 		itemstackIn = new ItemStack(ItemInit.RockmanShadowColorizer.get());
	    	 		break;
	    	 	case 6: 
	    	 		itemstackIn = new ItemStack(ItemInit.BreakmanColorizer.get());
	    	 		break;
	    	 		
	    	 	case 272: 
	    	 		itemstackIn = new ItemStack(ItemInit.FiremanColorizer.get());
	    	 		break;
	    	 	case 273: 
	    	 		itemstackIn = new ItemStack(ItemInit.IcemanColorizer.get());
	    	 		break;
	    	 	case 274: 
	    	 		itemstackIn = new ItemStack(ItemInit.CutmanColorizer.get());
	    	 		break;
	    	 	case 275: 
	    	 		itemstackIn = new ItemStack(ItemInit.BombmanColorizer.get());
	    	 		break;
	    	 	case 276: 
	    	 		itemstackIn = new ItemStack(ItemInit.ElecmanColorizer.get());
	    	 		break;
	    	 	case 277: 
	    	 		itemstackIn = new ItemStack(ItemInit.GutsmanColorizer.get());
	    	 		break;

	    	 //Megaman Soccer
	    	 	case 278: 
	    	 		itemstackIn = new ItemStack(ItemInit.MegamanGoalieColorizer.get());
	    	 		break;
	    	 	case 279: 
	    	 		itemstackIn = new ItemStack(ItemInit.Megaman2PGoalieColorizer.get());
	    	 		break;
	    	 	case 280: 
	    	 		itemstackIn = new ItemStack(ItemInit.ProtomanGoalieColorizer.get());
	    	 		break;
	    	 	case 281: 
	    	 		itemstackIn = new ItemStack(ItemInit.FiremanGoalieColorizer.get());
	    	 		break;
	    	 	case 282: 
	    	 		itemstackIn = new ItemStack(ItemInit.IcemanGoalieColorizer.get());
	    	 		break;
	    	 	case 283: 
	    	 		itemstackIn = new ItemStack(ItemInit.CutmanGoalieColorizer.get());
	    	 		break;
	    	 	case 284: 
	    	 		itemstackIn = new ItemStack(ItemInit.BombmanGoalieColorizer.get());
	    	 		break;
	    	 	case 285: 
	    	 		itemstackIn = new ItemStack(ItemInit.ElecmanGoalieColorizer.get());
	    	 		break;
	    	 		
	    	 		//Rockman Xover
	    	 	case 286: 
	    	 		itemstackIn = new ItemStack(ItemInit.WoodGutsmanColorizer.get());
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
	    	 		
	    	 	case 133: 
	    	 		itemstackIn = new ItemStack(ItemInit.RainFlushColorizer.get());
	    	 		break;
	    	 	case 141: 
	    	 		itemstackIn = new ItemStack(ItemInit.DiveMissileColorizer.get());
	    	 		break;
	    	 	case 142: 
	    	 		itemstackIn = new ItemStack(ItemInit.DrillBombColorizer.get());
	    	 		break;
	    	 	case 143: 
	    	 		itemstackIn = new ItemStack(ItemInit.DustCrusherColorizer.get());
	    	 		break;
	    	 	case 144: 
	    	 		itemstackIn = new ItemStack(ItemInit.FlashStopperColorizer.get());
	    	 		break;
	    	 	case 145: 
	    	 		itemstackIn = new ItemStack(ItemInit.PharoahShotColorizer.get());
	    	 		break;
	    	 	case 146: 
	    	 		itemstackIn = new ItemStack(ItemInit.RingBoomerangColorizer.get());
	    	 		break;
	    	 	case 147: 
	    	 		itemstackIn = new ItemStack(ItemInit.SkullBarrierColorizer.get());
	    	 		break;
	    	 		
	    	 	case 134: 
	    	 		itemstackIn = new ItemStack(ItemInit.ChargeKickColorizer.get());
	    	 		break;
	    	 	case 135: 
	    	 		itemstackIn = new ItemStack(ItemInit.GravityHoldColorizer.get());
	    	 		break;
	    	 	case 136: 
	    	 		itemstackIn = new ItemStack(ItemInit.GyroAttackColorizer.get());
	    	 		break;
	    	 	case 137: 
	    	 		itemstackIn = new ItemStack(ItemInit.NapalmBombColorizer.get());
	    	 		break;
	    	 	case 138: 
	    	 		itemstackIn = new ItemStack(ItemInit.PowerStoneColorizer.get());
	    	 		break;
	    	 	case 139: 
	    	 		itemstackIn = new ItemStack(ItemInit.StarCrushColorizer.get());
	    	 		break;
	    	 	case 140: 
	    	 		itemstackIn = new ItemStack(ItemInit.WaterWaveColorizer.get());
	    	 		break;
	    	 		
	    	 	case 124: 
	    	 		itemstackIn = new ItemStack(ItemInit.BlizzardAttackColorizer.get());
	    	 		break;
	    	 	case 125: 
	    	 		itemstackIn = new ItemStack(ItemInit.CentaurFlashColorizer.get());
	    	 		break;
	    	 	case 126: 
	    	 		itemstackIn = new ItemStack(ItemInit.FlameBlastColorizer.get());
	    	 		break;
	    	 	case 127: 
	    	 		itemstackIn = new ItemStack(ItemInit.WindStormColorizer.get());
	    	 		break;
	    	 	case 128: 
	    	 		itemstackIn = new ItemStack(ItemInit.SilverTomahawkColorizer.get());
	    	 		break;
	    	 	case 129: 
	    	 		itemstackIn = new ItemStack(ItemInit.PlantBarrierColorizer.get());
	    	 		break;
	    	 	case 130: 
	    	 		itemstackIn = new ItemStack(ItemInit.KnightCrushColorizer.get());
	    	 		break;
	    	 	case 131: 
	    	 		itemstackIn = new ItemStack(ItemInit.YamatoSpearColorizer.get());
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
	    	 		
	    	 		//the power fighters 2 287
	    	 	case 287: 
	    	 		itemstackIn = new ItemStack(ItemInit.PharaohWaveColorizer.get());
	    	 		break;
	    	 	case 288: 
	    	 		itemstackIn = new ItemStack(ItemInit.CentaurArrowColorizer.get());
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
	    	 		
	    	 		//186
	    	 	case 186: 
	    	 		itemstackIn = new ItemStack(ItemInit.BlackHoleBombColorizer.get());
	    	 		break;
	    	 	case 187: 
	    	 		itemstackIn = new ItemStack(ItemInit.ConcreteShotColorizer.get());
	    	 		break;
	    	 	case 188: 
	    	 		itemstackIn = new ItemStack(ItemInit.HornetChaserColorizer.get());
	    	 		break;
	    	 	case 189: 
	    	 		itemstackIn = new ItemStack(ItemInit.JewelSatelliteColorizer.get());
	    	 		break;
	    	 	case 190: 
	    	 		itemstackIn = new ItemStack(ItemInit.LaserTridentColorizer.get());
	    	 		break;
	    	 	case 191: 
	    	 		itemstackIn = new ItemStack(ItemInit.MagmaBazookaColorizer.get());
	    	 		break;
	    	 	case 192: 
	    	 		itemstackIn = new ItemStack(ItemInit.PlugBallColorizer.get());
	    	 		break;
	    	 	case 193: 
	    	 		itemstackIn = new ItemStack(ItemInit.TornadoBlowColorizer.get());
	    	 		break;
	    	 		
	    	 		//226
	    	 	case 226: 
	    	 		itemstackIn = new ItemStack(ItemInit.ChillSpikeColorizer.get());
	    	 		break;
	    	 	case 227: 
	    	 		itemstackIn = new ItemStack(ItemInit.CommandoBombColorizer.get());
	    	 		break;
	    	 	case 228: 
	    	 		itemstackIn = new ItemStack(ItemInit.SolarBlazeColorizer.get());
	    	 		break;
	    	 	case 229: 
	    	 		itemstackIn = new ItemStack(ItemInit.ReboundStrikerColorizer.get());
	    	 		break;
	    	 	case 230: 
	    	 		itemstackIn = new ItemStack(ItemInit.ThunderWoolColorizer.get());
	    	 		break;
	    	 	case 231: 
	    	 		itemstackIn = new ItemStack(ItemInit.TripleBladeColorizer.get());
	    	 		break;
	    	 	case 232: 
	    	 		itemstackIn = new ItemStack(ItemInit.WaterShieldColorizer.get());
	    	 		break;
	    	 	case 233: 
	    	 		itemstackIn = new ItemStack(ItemInit.WheelCutterColorizer.get());
	    	 		break;
	    	 		
	    	 	case 234: 
	    	 		itemstackIn = new ItemStack(ItemInit.BalladeCrackerColorizer.get());
	    	 		break;
	    	 	case 235: 
	    	 		itemstackIn = new ItemStack(ItemInit.MirrorBusterColorizer.get());
	    	 		break;
	    	 	case 236: 
	    	 		itemstackIn = new ItemStack(ItemInit.ScrewCrusherColorizer.get());
	    	 		break;
	    	 		
	    	 	case 194: 
	    	 		itemstackIn = new ItemStack(ItemInit.BlockDropperColorizer.get());
	    	 		break;
	    	 	case 195: 
	    	 		itemstackIn = new ItemStack(ItemInit.ScrambleThunderColorizer.get());
	    	 		break;
	    	 	case 196: 
	    	 		itemstackIn = new ItemStack(ItemInit.ChainBlastColorizer.get());
	    	 		break;
	    	 	case 197: 
	    	 		itemstackIn = new ItemStack(ItemInit.AcidBarrierColorizer.get());
	    	 		break;
	    	 	case 198: 
	    	 		itemstackIn = new ItemStack(ItemInit.TundraStormColorizer.get());
	    	 		break;
	    	 	case 199: 
	    	 		itemstackIn = new ItemStack(ItemInit.BlazingTorchColorizer.get());
	    	 		break;
	    	 	case 200: 
	    	 		itemstackIn = new ItemStack(ItemInit.PileDriverColorizer.get());
	    	 		break;
	    	 	case 201: 
	    	 		itemstackIn = new ItemStack(ItemInit.BounceBallColorizer.get());
	    	 		break;
	    	 		
	    	 	case 217: 
	    	 		itemstackIn = new ItemStack(ItemInit.SparkChaserColorizer.get());
	    	 		break;
	    	 	case 218: 
	    	 		itemstackIn = new ItemStack(ItemInit.GrabBusterColorizer.get());
	    	 		break;
	    	 	case 219: 
	    	 		itemstackIn = new ItemStack(ItemInit.BubbleBombColorizer.get());
	    	 		break;
	    	 	case 220: 
	    	 		itemstackIn = new ItemStack(ItemInit.PhotonMissileColorizer.get());
	    	 		break;
	    	 	case 221: 
	    	 		itemstackIn = new ItemStack(ItemInit.ElectricShockColorizer.get());
	    	 		break;
	    	 	case 222: 
	    	 		itemstackIn = new ItemStack(ItemInit.BlackHoleColorizer.get());
	    	 		break;
	    	 	case 223: 
	    	 		itemstackIn = new ItemStack(ItemInit.DeepDiggerColorizer.get());
	    	 		break;
	    	 	case 224: 
	    	 		itemstackIn = new ItemStack(ItemInit.BreakDashColorizer.get());
	    	 		break;
	    	 	case 225: 
	    	 		itemstackIn = new ItemStack(ItemInit.SaltWaterColorizer.get());
	    	 		break;
	    	 		
	    	 	case 202: 
	    	 		itemstackIn = new ItemStack(ItemInit.TenguBladeColorizer.get());
	    	 		break;
	    	 	case 203: 
	    	 		itemstackIn = new ItemStack(ItemInit.CopyVisionColorizer.get());
	    	 		break;
	    	 	case 204: 
	    	 		itemstackIn = new ItemStack(ItemInit.LightningBoltColorizer.get());
	    	 		break;
	    	 	case 205: 
	    	 		itemstackIn = new ItemStack(ItemInit.IceWallColorizer.get());
	    	 		break;
	    	 	case 206: 
	    	 		itemstackIn = new ItemStack(ItemInit.SpreadDrillColorizer.get());
	    	 		break;
	    	 	case 207: 
	    	 		itemstackIn = new ItemStack(ItemInit.RemoteMineColorizer.get());
	    	 		break;
	    	 	case 208: 
	    	 		itemstackIn = new ItemStack(ItemInit.WaveBurnerColorizer.get());
	    	 		break;
	    	 	case 209: 
	    	 		itemstackIn = new ItemStack(ItemInit.MagicCardColorizer.get());
	    	 		break;
	    	 		
	    	 	case 210: 
	    	 		itemstackIn = new ItemStack(ItemInit.BitCannonColorizer.get());
	    	 		break;
	    	 	case 211: 
	    	 		itemstackIn = new ItemStack(ItemInit.BladeLauncherColorizer.get());
	    	 		break;
	    	 	case 212: 
	    	 		itemstackIn = new ItemStack(ItemInit.OilStreamColorizer.get());
	    	 		break;
	    	 	case 213: 
	    	 		itemstackIn = new ItemStack(ItemInit.SharkBoomerangColorizer.get());
	    	 		break;
	    	 	case 214: 
	    	 		itemstackIn = new ItemStack(ItemInit.WaterShooterColorizer.get());
	    	 		break;
	    	 	case 215: 
	    	 		itemstackIn = new ItemStack(ItemInit.TorchArmColorizer.get());
	    	 		break;
	    	 		
	    	 	case 216: 
	    	 		itemstackIn = new ItemStack(ItemInit.QuakeDrillColorizer.get());
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
	    	 		
	    	 	case 132: 
	    	 		itemstackIn = new ItemStack(ItemInit.AegisReflectorColorizer.get());
	    	 		break;
	    	 	case 175: 
	    	 		itemstackIn = new ItemStack(ItemInit.HadokenColorizer.get());
	    	 		break;
	    	 	case 176: 
	    	 		itemstackIn = new ItemStack(ItemInit.SoulSatelliteColorizer.get());
	    	 		break;
	    	 	case 177: 
	    	 		itemstackIn = new ItemStack(ItemInit.MineSweeperColorizer.get());
	    	 		break;
	    	 	case 178: 
	    	 		itemstackIn = new ItemStack(ItemInit.YogaInfernoColorizer.get());
	    	 		break;
	    	 	case 179: 
	    	 		itemstackIn = new ItemStack(ItemInit.OpticLaserColorizer.get());
	    	 		break;
	    	 	case 180: 
	    	 		itemstackIn = new ItemStack(ItemInit.LightningKickColorizer.get());
	    	 		break;
	    	 	case 181: 
	    	 		itemstackIn = new ItemStack(ItemInit.TropicHazardColorizer.get());
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
	    	 		//Truforce
	    	 	case 289: 
	    	 		itemstackIn = new ItemStack(ItemInit.XVariantColorizer.get());
	    	 		break;
	    	 		
	    	 	case 105: 
	    	 		itemstackIn = new ItemStack(ItemInit.ZeroColorizer.get());
	    	 		break;
	    	 	case 61: 
	    	 		itemstackIn = new ItemStack(ItemInit.BlackZeroColorizer.get());
	    	 		break;
	    	 	case 159: 
	    	 		itemstackIn = new ItemStack(ItemInit.AxlColorizer.get());
	    	 		break;
	    	 	case 160: 
	    	 		itemstackIn = new ItemStack(ItemInit.whiteAxlColorizer.get());
	    	 		break;
	    	 	case 62: 
	    	 		itemstackIn = new ItemStack(ItemInit.VileColorizer.get());
	    	 		break;
	    	 		
	    	 	case 255: 
		    	 	itemstackIn = new ItemStack(ItemInit.RyuColorizer.get());
		    	 	break;
	    	 	case 256: 
		    	 	itemstackIn = new ItemStack(ItemInit.Ryu2PColorizer.get());
		    	 	break;
	    	 	case 257: 
		    	 	itemstackIn = new ItemStack(ItemInit.EvilRyuColorizer.get());
		    	 	break;
	    	 		
	    	 	case 170: 
	    	 		itemstackIn = new ItemStack(ItemInit.iXColorizer.get());
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
	    	 	case 123: 
	    	 		itemstackIn = new ItemStack(ItemInit.SpinWheelColorizer.get());
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
	    	 	case 148: 
	    	 		itemstackIn = new ItemStack(ItemInit.ParasiticBombColorizer.get());
	    	 		break;
	    	 	case 149: 
	    	 		itemstackIn = new ItemStack(ItemInit.SpinningBladeColorizer.get());
	    	 		break;
	    	 	case 150: 
	    	 		itemstackIn = new ItemStack(ItemInit.TriadThunderColorizer.get());
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
	    	 		
	    	 	case 151: 
	    	 		itemstackIn = new ItemStack(ItemInit.LightningWebColorizer.get());
	    	 		break;
	    	 	case 152: 
	    	 		itemstackIn = new ItemStack(ItemInit.SoulBodyColorizer.get());
	    	 		break;
	    	 	case 153: 
	    	 		itemstackIn = new ItemStack(ItemInit.FrostTowerColorizer.get());
	    	 		break;
	    	 	case 154: 
	    	 		itemstackIn = new ItemStack(ItemInit.GroundHunterColorizer.get());
	    	 		break;
	    	 	case 155: 
	    	 		itemstackIn = new ItemStack(ItemInit.DoubleCycloneColorizer.get());
	    	 		break;
	    	 	case 156: 
	    	 		itemstackIn = new ItemStack(ItemInit.RisingFireColorizer.get());
	    	 		break;
	    	 	case 157: 
	    	 		itemstackIn = new ItemStack(ItemInit.TwinSlasherColorizer.get());
	    	 		break;
	    	 	case 158: 
	    	 		itemstackIn = new ItemStack(ItemInit.AimingLaserColorizer.get());
	    	 		break;
	    	 		
	    	 	case 162: 
	    	 		itemstackIn = new ItemStack(ItemInit.DarkHoldColorizer.get());
	    	 		break;
	    	 	case 163: 
	    	 		itemstackIn = new ItemStack(ItemInit.TriThunderColorizer.get());
	    	 		break;
	    	 	case 164: 
	    	 		itemstackIn = new ItemStack(ItemInit.CrescentShotColorizer.get());
	    	 		break;
	    	 	case 165: 
	    	 		itemstackIn = new ItemStack(ItemInit.WingSpiralColorizer.get());
	    	 		break;
	    	 	case 166: 
	    	 		itemstackIn = new ItemStack(ItemInit.FlashLaserColorizer.get());
	    	 		break;
	    	 	case 167: 
	    	 		itemstackIn = new ItemStack(ItemInit.GooShaverColorizer.get());
	    	 		break;
	    	 	case 168: 
	    	 		itemstackIn = new ItemStack(ItemInit.SpikeBallColorizer.get());
	    	 		break;
	    	 	case 169: 
	    	 		itemstackIn = new ItemStack(ItemInit.GroundFireColorizer.get());
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
	    	 	case 237: 
	    	 		itemstackIn = new ItemStack(ItemInit.GaeaSheildColorizer.get());
	    	 		break;
	    	 	case 238: 
	    	 		itemstackIn = new ItemStack(ItemInit.SpashLaserColorizer.get());
	    	 		break;
	    	 	case 239: 
	    	 		itemstackIn = new ItemStack(ItemInit.MovingWheelColorizer.get());
	    	 		break;
	    	 	case 240: 
	    	 		itemstackIn = new ItemStack(ItemInit.CircleBlazeColorizer.get());
	    	 		break;
	    	 	case 241: 
	    	 		itemstackIn = new ItemStack(ItemInit.SniperMissileColorizer.get());
	    	 		break;
	    	 	case 242: 
	    	 		itemstackIn = new ItemStack(ItemInit.ExplosionColorizer.get());
	    	 		break;
	    	 		
	    	 	case 243: 
	    	 		itemstackIn = new ItemStack(ItemInit.SqueezeBombColorizer.get());
	    	 		break;
	    	 	case 244: 
	    	 		itemstackIn = new ItemStack(ItemInit.ShadowRunnerColorizer.get());
	    	 		break;
	    	 	case 245: 
	    	 		itemstackIn = new ItemStack(ItemInit.DriftDiamondColorizer.get());
	    	 		break;
	    	 	case 246: 
	    	 		itemstackIn = new ItemStack(ItemInit.ShiningRayColorizer.get());
	    	 		break;
	    	 	case 247: 
	    	 		itemstackIn = new ItemStack(ItemInit.MeltCreeperColorizer.get());
	    	 		break;
	    	 	case 248: 
	    	 		itemstackIn = new ItemStack(ItemInit.ThunderDancerColorizer.get());
	    	 		break;
	    	 	case 249: 
	    	 		itemstackIn = new ItemStack(ItemInit.GreenSpinnerColorizer.get());
	    	 		break;
	    	 	case 250: 
	    	 		itemstackIn = new ItemStack(ItemInit.CrystalWallColorizer.get());
	    	 		break;
	    	 		
	    	 	case 121: 
	    	 		itemstackIn = new ItemStack(ItemInit.MagneticShockwaveColorizer.get());
	    	 		break;
	    	 		
	    	 	case 270: 
	    	 		itemstackIn = new ItemStack(ItemInit.MegamanZeroColorizer.get());
	    	 		break;
	    	 		
	    	 	case 251: 
	    	 		itemstackIn = new ItemStack(ItemInit.MegamanExeColorizer.get());
	    	 		break;
	    	 	case 252: 
	    	 		itemstackIn = new ItemStack(ItemInit.DarkMegamanExeColorizer.get());
	    	 		break;
	    	 	case 253: 
	    	 		itemstackIn = new ItemStack(ItemInit.DarkMegamanExeAnimeColorizer.get());
	    	 		break;
	    	 		
	    	 	case 171: 
	    	 		itemstackIn = new ItemStack(ItemInit.HeatStyleColorizer.get());
	    	 		break;
	    	 	case 172: 
	    	 		itemstackIn = new ItemStack(ItemInit.AquaStyleColorizer.get());
	    	 		break;
	    	 	case 173: 
	    	 		itemstackIn = new ItemStack(ItemInit.ElecStyleColorizer.get());
	    	 		break;
	    	 	case 174: 
	    	 		itemstackIn = new ItemStack(ItemInit.WoodStyleColorizer.get());
	    	 		break;
	    	 	case 182: 
	    	 		itemstackIn = new ItemStack(ItemInit.HeatBugStyleColorizer.get());
	    	 		break;
	    	 	case 183: 
	    	 		itemstackIn = new ItemStack(ItemInit.AquaBugStyleColorizer.get());
	    	 		break;
	    	 	case 184: 
	    	 		itemstackIn = new ItemStack(ItemInit.ElecBugStyleColorizer.get());
	    	 		break;
	    	 	case 185: 
	    	 		itemstackIn = new ItemStack(ItemInit.WoodBugStyleColorizer.get());
	    	 		break;
	    	 		
	    	 	case 291: 
	    	 		itemstackIn = new ItemStack(ItemInit.NormNaviColorizer.get());
	    	 		break;
	    	 	case 292: 
	    	 		itemstackIn = new ItemStack(ItemInit.NormNaviBColorizer.get());
	    	 		break;
	    	 	case 293: 
	    	 		itemstackIn = new ItemStack(ItemInit.NormNaviCColorizer.get());
	    	 		break;
	    	 	case 294: 
	    	 		itemstackIn = new ItemStack(ItemInit.NormNaviHeelColorizer.get());
	    	 		break;
	    	 		
	    	 	case 295: 
	    	 		itemstackIn = new ItemStack(ItemInit.NormNavi2Colorizer.get());
	    	 		break;
	    	 	case 296: 
	    	 		itemstackIn = new ItemStack(ItemInit.NormNavi3Colorizer.get());
	    	 		break;
	    	 	case 297: 
	    	 		itemstackIn = new ItemStack(ItemInit.NormNavi4Colorizer.get());
	    	 		break;
	    	 	case 298: 
	    	 		itemstackIn = new ItemStack(ItemInit.NormNavi5Colorizer.get());
	    	 		break;
	    	 		
	    	 	case 299: 
	    	 		itemstackIn = new ItemStack(ItemInit.NormNavitypeFColorizer.get());
	    	 		break;
	    	 	case 300: 
	    	 		itemstackIn = new ItemStack(ItemInit.NormNavitypeAColorizer.get());
	    	 		break;
	    	 	case 301: 
	    	 		itemstackIn = new ItemStack(ItemInit.NormNavitypeWColorizer.get());
	    	 		break;
	    	 	case 302: 
	    	 		itemstackIn = new ItemStack(ItemInit.NormNavitypeEColorizer.get());
	    	 		break;
	    	 	case 303: 
	    	 		itemstackIn = new ItemStack(ItemInit.NormNavitypeXColorizer.get());
	    	 		break;
	    	 		
	    	 	case 290: 
	    	 		itemstackIn = new ItemStack(ItemInit.StarforceGeoVersionColorizer.get());
	    	 		break;
	    	 		
	    	 	case 258: 
	    	 		itemstackIn = new ItemStack(ItemInit.VolnuttColorizer.get());
	    	 		break;
	    	 	case 259: 
	    	 		itemstackIn = new ItemStack(ItemInit.Volnutt2PColorizer.get());
	    	 		break;
	    	 	case 260: 
	    	 		itemstackIn = new ItemStack(ItemInit.BadVolnuttColorizer.get());
	    	 		break;
	    	 		
	    	 	case 261: 
	    	 		itemstackIn = new ItemStack(ItemInit.PachislotColorizer.get());
	    	 		break;
	    	 	case 262: 
	    	 		itemstackIn = new ItemStack(ItemInit.BellSparkColorizer.get());
	    	 		break;
	    	 	case 263: 
	    	 		itemstackIn = new ItemStack(ItemInit.CoinBombColorizer.get());
	    	 		break;
	    	 	case 264: 
	    	 		itemstackIn = new ItemStack(ItemInit.LeverImpactColorizer.get());
	    	 		break;
	    	 	case 265: 
	    	 		itemstackIn = new ItemStack(ItemInit.ReplayShieldColorizer.get());
	    	 		break;
	    	 	case 266: 
	    	 		itemstackIn = new ItemStack(ItemInit.ReverseBladeColorizer.get());
	    	 		break;
	    	 	case 267: 
	    	 		itemstackIn = new ItemStack(ItemInit.ChanceBigBusterColorizer.get());
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
	    	 	case 161: 
	    	 		itemstackIn = new ItemStack(ItemInit.FourthColorColorizer.get());
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
	    	  
	    	 worldIn.playSound((PlayerEntity)null, pos, SoundEvents.FIREWORK_ROCKET_LAUNCH, SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.random.nextFloat() * 0.4F);
	         player.inventory.add(itemstackIn);
	    	 //player.inventory.addItemStackToInventory(itemstackIn);
	      }

	   }

}
