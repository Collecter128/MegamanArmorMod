package com.collecter128.megamanarmormod.core;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;


import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MerchantOffer;
import net.minecraft.util.SoundEvents;
import net.minecraft.village.PointOfInterestType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class VillagerInit {
	public static final DeferredRegister<PointOfInterestType> Point_of_interestTypes = DeferredRegister.create(ForgeRegistries.POI_TYPES, "megamanarmormod");
	public static final DeferredRegister<VillagerProfession> VillagerProffesions = DeferredRegister.create(ForgeRegistries.PROFESSIONS, "megamanarmormod");
	
	public static final RegistryObject<PointOfInterestType> JunkShopPoE = Point_of_interestTypes.register("junks", 
			()->new PointOfInterestType("junks", PointOfInterestType.getBlockStates(BlockInit.ScapBlock.get()), 1, 1));
	public static final RegistryObject<VillagerProfession> JunkShopProffesion = VillagerProffesions.register("junkshopowner", 
			()->new VillagerProfession("junkshopowner", JunkShopPoE.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_WEAPONSMITH));
	public static void registerPOI() {
//		try {
//			ObfuscationReflectionHelper.findMethod(PointOfInterestType.class, "registerBlockStates", PointOfInterestType.class).invoke(null, JunkShopPoE.get());
//		}catch (IllegalAccessException | InvocationTargetException e){
//			e.printStackTrace();
//		}
	}
	
	public static void FillTradeData() {
		VillagerTrades.ITrade[] junkLevel1 = new VillagerTrades.ITrade[]{ //Item, Cost, #oftrades
				new VillagerTrades.EmeraldForItemsTrade(ItemInit.BrokenCutter.get(), 1, 16, 3),
				new VillagerTrades.EmeraldForItemsTrade(ItemInit.GutsPart.get(), 1, 16, 3),
				new VillagerTrades.EmeraldForItemsTrade(ItemInit.DudBomb.get(), 1, 16, 3),
				new VillagerTrades.EmeraldForItemsTrade(ItemInit.ElectricBattery.get(), 1, 16, 3),
				new VillagerTrades.EmeraldForItemsTrade(ItemInit.IceMachine.get(), 1, 16, 3),
				new VillagerTrades.EmeraldForItemsTrade(ItemInit.FirePart.get(), 1, 16, 3),
				//Cost, Amount, Trades, Exp, 
				new VillagerTrades.ItemsForEmeraldsTrade(new ItemStack(BlockInit.ScapBlock.get()), 2, 1, 12, 3)
		};
		VillagerTrades.ITrade[] junkLevel2 = new VillagerTrades.ITrade[]{//Item, Cost, #oftrades
				//Cost, Amount, Trades, Exp, 
				new VillagerTrades.ItemsForEmeraldsTrade(new ItemStack(ItemInit.CerataniumRaw.get()), 2, 1, 16, 2),
				new VillagerTrades.ItemsForEmeraldsTrade(new ItemStack(BlockInit.CustomizerOre.get()), 2, 1, 16, 1)
		};
		VillagerTrades.ITrade[] junkLevel3 = new VillagerTrades.ITrade[]{//Cost, Amount, Trades, Exp, 
				new VillagerTrades.ItemsForEmeraldsTrade(new ItemStack(ItemInit.LegendsArmor_Head.get()), 7, 1, 12, 2),
				new VillagerTrades.ItemsForEmeraldsTrade(new ItemStack(ItemInit.LegendsArmor_Body.get()), 7, 1, 12, 2),
				new VillagerTrades.ItemsForEmeraldsTrade(new ItemStack(ItemInit.LegendsArmor_Legs.get()), 7, 1, 12, 2),
				new VillagerTrades.ItemsForEmeraldsTrade(new ItemStack(ItemInit.LegendsArmor_Arms.get()), 7, 1, 12, 2)
				
		};
		VillagerTrades.ITrade[] junkLevel4 = new VillagerTrades.ITrade[]{
				new VillagerTrades.ItemsForEmeraldsTrade(new ItemStack(ItemInit.SaberPlusOne.get()), 2, 1, 12, 2),
				new VillagerTrades.ItemsForEmeraldsTrade(new ItemStack(ItemInit.SaberPlusTwo.get()), 4, 1, 12, 2)
		};
		VillagerTrades.ITrade[] junkLevel5 = new VillagerTrades.ITrade[]{
				
		};
		VillagerTrades.TRADES.put(JunkShopProffesion.get(), toIntMap(ImmutableMap.of(
				1, junkLevel1, 2, junkLevel2, 3, junkLevel3, 4, junkLevel4, 5, junkLevel5)));
	}
	private static Int2ObjectMap<VillagerTrades.ITrade[]> toIntMap(ImmutableMap<Integer, VillagerTrades.ITrade[]> p_221238_0_) {
	      return new Int2ObjectOpenHashMap<>(p_221238_0_);
	   }
	
//	public static class MultipleItemsforEmeraldsTrade implements VillagerTrades.ITrade{
//
//		private final List<Items> TradeItems;
//		private final List<Integer> ItemAmount;
//		private final List<Integer> EmeraldCost;
//		private final int Uses;
//		private final int VillagerExp;
//		public MultipleItemsforEmeraldsTrade(List<Items> Items, List<Integer> ItemAmount, List<Integer> EmeraldCost, 
//				int Uses, int VillagerExp) {
//			this.TradeItems = Items;
//			this.ItemAmount = ItemAmount;
//			this.EmeraldCost = EmeraldCost;
//			this.Uses = Uses;
//			this.VillagerExp = VillagerExp;
//		}
//		
////		@Nullable
////		@Override
////		public MerchantOffer getOffer(Entity p_221182_1_, Random random) {
////			int choose = (int) (random.nextFloat()* TradeItems.size());
////			return new MerchantOffer(new ItemStack(Items.EMERALD, EmeraldCost.get(choose)), new ItemStack(TradeItems.get(choose), this.ItemAmount.get(0)), this.Uses, this.VillagerExp, 0.05f);
////			
////		}
//		
//	}
}
