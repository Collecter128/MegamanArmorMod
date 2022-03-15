package com.collecter128.megamanarmormod.blocks;

import java.util.Random;

import com.collecter128.megamanarmormod.core.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class blockheadarmorbreakable extends Block{
	
	   public blockheadarmorbreakable(Properties properties) {
		super(properties);
	   }
	   
//	   public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
//		      if (!worldIn.isRemote) {
//		         if (entity.) { // is wearing the firstarmor headand collide with the bottom???
//		            //this.des;     break block
//		         }
//		      }
//		   }

//	   /**
//	    * Called before the Block is set to air in the world. Called regardless of if the player's tool can actually collect
//	    * this block
//	    */
//	   public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
//	      if (!worldIn.isRemote()) {
//
//	      }
//
//	   }

}
