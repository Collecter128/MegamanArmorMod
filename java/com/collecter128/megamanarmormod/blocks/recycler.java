package com.collecter128.megamanarmormod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.collecter128.megamanarmormod.core.BlockInit;
import com.collecter128.megamanarmormod.core.ItemInit;
import com.collecter128.megamanarmormod.items.ArmorColorizer;
import com.collecter128.megamanarmormod.items.ArmorColorizerColorShift;
import com.collecter128.megamanarmormod.items.ArmorColorizerCopy;
import com.collecter128.megamanarmormod.items.ArmorColorizerCustom;
import com.collecter128.megamanarmormod.items.ArmorColorizerDefault;
import com.collecter128.megamanarmormod.items.ArmorColorizerGlow;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.BannerItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.BannerTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class recycler extends Block{
	
	   public recycler(Properties properties) {
		super(properties);
	   }
	   
	   public ActionResultType use(BlockState p_225533_1_, World p_225533_2_, BlockPos p_225533_3_, PlayerEntity p_225533_4_, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
		      ItemStack itemstack = p_225533_4_.getItemInHand(p_225533_5_);
		      if (itemstack.isEmpty()) {
		         return ActionResultType.PASS;
		      } else {
		         //int i = p_225533_1_.getValue(LEVEL);
		         Item item = itemstack.getItem();
		         ItemStack newItem;
		         if (item instanceof ArmorColorizer || item instanceof ArmorColorizerColorShift
		        		 || item instanceof ArmorColorizerCopy || item instanceof ArmorColorizerCustom
		        		 || item instanceof ArmorColorizerDefault|| item instanceof ArmorColorizerGlow) {
		            if (!p_225533_2_.isClientSide) {
		            	itemstack.shrink(1);
//		               if (!p_225533_4_.abilities.instabuild) {
//		                  //p_225533_4_.setItemInHand(p_225533_5_, new ItemStack(Items.BUCKET));
//		               }
		            	
		            	newItem = new ItemStack(ItemInit.Ceratanium.get(), 1);

		               //p_225533_4_.awardStat(Stats.FILL_CAULDRON);
		               //this.setWaterLevel(p_225533_2_, p_225533_3_, p_225533_1_, 3);
		               p_225533_2_.playSound((PlayerEntity)null, p_225533_3_, SoundEvents.IRON_DOOR_CLOSE, SoundCategory.BLOCKS, 1.0F, 1.0F);
		               p_225533_4_.inventory.add(newItem);
		            }

		            return ActionResultType.sidedSuccess(p_225533_2_.isClientSide);
		         }  
		         else if(item == Item.byBlock(Blocks.IRON_BLOCK)) {
		        	 if (!p_225533_2_.isClientSide) {
			            	itemstack.shrink(1);
			            	
			            	newItem = new ItemStack(BlockInit.ScapBlock.get(), 3);

			               p_225533_2_.playSound((PlayerEntity)null, p_225533_3_, SoundEvents.IRON_DOOR_CLOSE, SoundCategory.BLOCKS, 1.0F, 1.0F);
			               p_225533_4_.inventory.add(newItem);
		        	 
		        	 }
		        	 return ActionResultType.sidedSuccess(p_225533_2_.isClientSide);
		         }//turn iron into scrap
		        	 else if(item == ItemInit.DudBomb.get() || item == ItemInit.BrokenCutter.get()
		        			 || item == ItemInit.ElectricBattery.get()|| item == ItemInit.FirePart.get()
		        			 || item == ItemInit.GutsPart.get()|| item == ItemInit.IceMachine.get()
		        					 || item == ItemInit.OilCan.get()|| item == ItemInit.TimeClock.get()
		        			 || item == ItemInit.SoccerBall.get()) {
			        	 if (!p_225533_2_.isClientSide) {
				            	itemstack.shrink(1);
				            	
				            	newItem = new ItemStack(Items.IRON_INGOT, 2);

				               p_225533_2_.playSound((PlayerEntity)null, p_225533_3_, SoundEvents.IRON_DOOR_CLOSE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				               p_225533_4_.inventory.add(newItem);
			        	 
			        	 }
			        	 return ActionResultType.sidedSuccess(p_225533_2_.isClientSide);
		        	 }
		        	 else if(item == ItemInit.NormalData.get() || item == ItemInit.FireData.get()
		        			 || item == ItemInit.AquaData.get()|| item == ItemInit.ElecData.get()
		        			 || item == ItemInit.WoodData.get()|| item == ItemInit.BusterData.get()
		        			 || item == ItemInit.SwordData.get()|| item == ItemInit.WindData.get()
		        			 || item == ItemInit.CurserData.get()|| item == ItemInit.BreakData.get()
		        			 || item == ItemInit.RecoverData.get()|| item == ItemInit.PlusData.get()
		        			 || item == ItemInit.InvisData.get()|| item == ItemInit.PanelData.get()
		        			 || item == ItemInit.ObstacleData.get()|| item == ItemInit.DarkData.get()) {
			        	 if (!p_225533_2_.isClientSide) {
				            	itemstack.shrink(1);
				            	
				            	newItem = new ItemStack(ItemInit.MysteryDataPartBlue.get(), 1);

				               p_225533_2_.playSound((PlayerEntity)null, p_225533_3_, SoundEvents.EXPERIENCE_ORB_PICKUP, SoundCategory.BLOCKS, 1.0F, 1.0F);
				               p_225533_4_.inventory.add(newItem);
			        	 
			        	 }
			        	 return ActionResultType.sidedSuccess(p_225533_2_.isClientSide);
		        	 }
//		            else {
//		            if (i > 0 && item instanceof IDyeableArmorItem) {
//		               IDyeableArmorItem idyeablearmoritem = (IDyeableArmorItem)item;
//		               if (idyeablearmoritem.hasCustomColor(itemstack) && !p_225533_2_.isClientSide) {
//		                  idyeablearmoritem.clearColor(itemstack);
//		                  this.setWaterLevel(p_225533_2_, p_225533_3_, p_225533_1_, i - 1);
//		                  p_225533_4_.awardStat(Stats.CLEAN_ARMOR);
//		                  return ActionResultType.SUCCESS;
//		               }
//		            }
//
//		            if (i > 0 && item instanceof BannerItem) {
//		               if (BannerTileEntity.getPatternCount(itemstack) > 0 && !p_225533_2_.isClientSide) {
//		                  ItemStack itemstack2 = itemstack.copy();
//		                  itemstack2.setCount(1);
//		                  BannerTileEntity.removeLastPattern(itemstack2);
//		                  p_225533_4_.awardStat(Stats.CLEAN_BANNER);
//		                  if (!p_225533_4_.abilities.instabuild) {
//		                     itemstack.shrink(1);
//		                     this.setWaterLevel(p_225533_2_, p_225533_3_, p_225533_1_, i - 1);
//		                  }
//
//		                  if (itemstack.isEmpty()) {
//		                     p_225533_4_.setItemInHand(p_225533_5_, itemstack2);
//		                  } else if (!p_225533_4_.inventory.add(itemstack2)) {
//		                     p_225533_4_.drop(itemstack2, false);
//		                  } else if (p_225533_4_ instanceof ServerPlayerEntity) {
//		                     ((ServerPlayerEntity)p_225533_4_).refreshContainer(p_225533_4_.inventoryMenu);
//		                  }
//		               }
//
//		               return ActionResultType.sidedSuccess(p_225533_2_.isClientSide);
//		            } 
//		            else if (i > 0 && item instanceof BlockItem) {
//		               Block block = ((BlockItem)item).getBlock();
//		               if (block instanceof ShulkerBoxBlock && !p_225533_2_.isClientSide()) {
//		                  ItemStack itemstack1 = new ItemStack(Blocks.SHULKER_BOX, 1);
//		                  if (itemstack.hasTag()) {
//		                     itemstack1.setTag(itemstack.getTag().copy());
//		                  }
//
//		                  p_225533_4_.setItemInHand(p_225533_5_, itemstack1);
//		                  this.setWaterLevel(p_225533_2_, p_225533_3_, p_225533_1_, i - 1);
//		                  p_225533_4_.awardStat(Stats.CLEAN_SHULKER_BOX);
//		                  return ActionResultType.SUCCESS;
//		               } else {
//		                  return ActionResultType.CONSUME;
//		               }
//		            } 
		            else {
		               return ActionResultType.PASS;
		            }
		         }// If Itemstack is not empty
//		      }
		   }
	   
//	/**
//	    * Called before the Block is set to air in the world. Called regardless of if the player's tool can actually collect
//	    * this block
//	    */
//	   public void playerDestroy(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity p_180657_5_, ItemStack p_180657_6_) {
//	   //public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
//	      if (!worldIn.isClientSide) {
//	    	 ItemStack itemstackIn = new ItemStack(ItemInit.DefaultColorizer.get());
//	    	 Random random = new Random();
//	    	 int RandomInt = random.nextInt(268);
//	    	 
//	    	 switch(RandomInt) {
//	    	 	case -1: //like fireworks? Also Custom Name like potion or spawn egg. Spawn Eggstyle coloring???
//	    	 		itemstackIn = new ItemStack(ItemInit.MegamanColorizer.get());
//	    	 		itemstackIn.getOrCreateTagElement("displaymm").putInt("MainColor", 342773);
//	    	 		itemstackIn.getOrCreateTagElement("displaymm").putInt("SecondaryColor", 342773);
//	    	 		//"ThirdColor"
//	    	 		//"FourthColor"
//	    	 		//"WhiteColor"
//	    	 		//"GlowyColor"
//	    	 		//"GrayColor"
//	    	 		//"GlowStyle"
//	    	 		//tooltip.add((new TranslationTextComponent("item.megamanarmormod.colorizertext")).appendString(" ").appendString(String.valueOf((int)compoundnbt.getByte("Flight")))
//	    	 		//	.mergeStyle(TextFormatting.GRAY)); // Maybe color color
//	    	 		
//	    	 		break;
//	    	 	case 0: 
//	    	 		itemstackIn = new ItemStack(ItemInit.MegamanColorizer.get());
//	    	 		break;
//	    	 		
//	    	 	default:
//	    	 		itemstackIn = new ItemStack(ItemInit.DefaultColorizer.get());
//	    	 }
//	    	  
//	    	 worldIn.playSound((PlayerEntity)null, pos, SoundEvents.FIREWORK_ROCKET_LAUNCH, SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.random.nextFloat() * 0.4F);
//	         player.inventory.add(itemstackIn);
//	    	 //player.inventory.addItemStackToInventory(itemstackIn);
//	      }
//
//	   }

}
