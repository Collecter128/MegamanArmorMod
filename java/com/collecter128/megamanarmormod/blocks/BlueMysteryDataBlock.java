package com.collecter128.megamanarmormod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.collecter128.megamanarmormod.core.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BreakableBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
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

public class BlueMysteryDataBlock extends BreakableBlock{
	
	   public BlueMysteryDataBlock(Properties properties) {
		super(properties);
	   }

	/**
	    * Called before the Block is set to air in the world. Called regardless of if the player's tool can actually collect
	    * this block
	    */
	   public void playerDestroy(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity p_180657_5_, ItemStack p_180657_6_) {
	   //public void onRemove(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
	      if (!worldIn.isClientSide) {
	    	 ItemStack itemstackIn = new ItemStack(ItemInit.NormalData.get());
	    	 Random random = new Random();
	    	 int RandomInt = random.nextInt(7);
	    	 
	    	 switch(RandomInt) {
	    	 	case 0: 
	    	 		itemstackIn = new ItemStack(ItemInit.BusterData.get());
	    	 		break;
	    	 	case 1: 
	    	 		itemstackIn = new ItemStack(ItemInit.SwordData.get());
	    	 		break;
	    	 	case 2: 
	    	 		itemstackIn = new ItemStack(ItemInit.NormalData.get());
	    	 		break;
	    	 	case 3: 
	    	 		itemstackIn = new ItemStack(ItemInit.DarkData.get());
	    	 		break;
	    	 	case 4: 
	    	 		itemstackIn = new ItemStack(ItemInit.RecoverData.get());
	    	 		break;
	    	 	case 5: 
	    	 		itemstackIn = new ItemStack(ItemInit.PanelData.get());
	    	 		break;
	    	 	case 6: 
	    	 		itemstackIn = new ItemStack(ItemInit.VirusData.get());
	    	 		break;
	    	 	
	    	 		
	    	 	default:
	    	 		itemstackIn = new ItemStack(ItemInit.BusterData.get());
	    	 }
	    	  
	    	 worldIn.playSound((PlayerEntity)null, pos, SoundEvents.FIREWORK_ROCKET_LAUNCH, SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.random.nextFloat() * 0.4F);
	         //player.inventory.add(itemstackIn);
	         popResource(worldIn, pos, itemstackIn);
	    	 //player.inventory.addItemStackToInventory(itemstackIn);
	      }

	   }

}
