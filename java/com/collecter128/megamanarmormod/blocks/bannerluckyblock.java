package com.collecter128.megamanarmormod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.collecter128.megamanarmormod.core.BlockInit;
import com.collecter128.megamanarmormod.core.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BreakableBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class bannerluckyblock extends BreakableBlock{
	
	   public bannerluckyblock(Properties properties) {
		super(properties);
	   }

	/**
	    * Called before the Block is set to air in the world. Called regardless of if the player's tool can actually collect
	    * this block
	    */
	   public void playerDestroy(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity p_180657_5_, ItemStack p_180657_6_) {
	   //public void onRemove(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
	      if (!worldIn.isClientSide) {
	    	 ItemStack itemstackIn = new ItemStack(BlockInit.BannerLuckyBlock.get());
	    	 Random random = new Random();
	    	 int RandomInt = random.nextInt(33);
	    	 
	    	 if(RandomInt <= 32) {
	    		 itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(RandomInt).get());
	    	 }
	    	 else {
	    		 itemstackIn = new ItemStack(BlockInit.BannerLuckyBlock.get());
	    	 }
	    	 
//	    	 switch(RandomInt) {
//	    	 	case 0: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(0).get());
//	    	 		break;
//	    	 	case 1: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(1).get());
//	    	 		break;
//	    	 	case 2: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(2).get());
//	    	 		break;
//	    	 	case 3: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(3).get());
//	    	 		break;
//	    	 	case 4: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(4).get());
//	    	 		break;
//	    	 	case 5: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(5).get());
//	    	 		break;
//	    	 	case 6: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(6).get());
//	    	 		break;
//	    	 	case 7: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(7).get());
//	    	 		break;
//	    	 	case 8: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(8).get());
//	    	 		break;
//	    	 	case 9: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(9).get());
//	    	 		break;
//	    	 	case 10: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(10).get());
//	    	 		break;
//	    	 	case 11: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(11).get());
//	    	 		break;
//	    	 	case 12: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(12).get());
//	    	 		break;
//	    	 	case 13: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(13).get());
//	    	 		break;
//	    	 	case 14: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(14).get());
//	    	 		break;
//	    	 	case 15: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(15).get());
//	    	 		break;
//	    	 	case 16: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(16).get());
//	    	 		break;
	    	 	
	    	 		
	    	 	//default:
	    	 	//	itemstackIn = new ItemStack(BlockInit.BannerLuckyBlock.get());
	    	 //}
	    	  
	    	 worldIn.playSound((PlayerEntity)null, pos, SoundEvents.FIREWORK_ROCKET_LAUNCH, SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.random.nextFloat() * 0.4F);
	         player.inventory.add(itemstackIn);
	    	 //player.inventory.addItemStackToInventory(itemstackIn);
	      }

	   }

}
