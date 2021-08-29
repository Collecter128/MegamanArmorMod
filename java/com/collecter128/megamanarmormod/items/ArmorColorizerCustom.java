package com.collecter128.megamanarmormod.items;

import java.awt.Color;
import java.util.Objects;
import java.util.Random;

import com.collecter128.megamanarmormod.core.Imorecolorfularmor;
import com.collecter128.megamanarmormod.core.ItemInit;

import net.minecraft.block.AbstractBannerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.MobSpawnerTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.spawner.AbstractSpawner;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ArmorColorizerCustom extends ArmorItem implements IDyeableArmorItem{

//	public int primaryColor = 0;
//	public int secondaryColor= 0;
//	public int thiraryColor = 0;
//	public int WhiteColor = 0;
//	public int GlowyColor= 0;
//	public int GrayColor= 0;
//	public int MainColorDefault = 342773;
//	public int SecondaryColorDefault = 379125;
//	public int WhiteColorDefault = 16777215;
//	public int ThirdColorDefault = 16777215;
//	public int GlowyColorDefault = 16728361;
//	public int GrayColorDefault = 12105912;
	String colortype;
	
	public ArmorColorizerCustom(IArmorMaterial materialIn, EquipmentSlotType slot, Properties properties, int[]colors, String type) {
		super(materialIn, slot, properties.defaultMaxDamage(materialIn.getDurability(slot)));
//		this.MainColorDefault = colors[0];
//		this.SecondaryColorDefault = colors[1];
//		this.ThirdColorDefault = colors[2];
//		this.WhiteColorDefault = colors[3];
//		this.GlowyColorDefault = colors[4];
//		this.GrayColorDefault = colors[5];
//		primaryColor = MainColorDefault;
//		secondaryColor = SecondaryColorDefault;
//		thiraryColor = ThirdColorDefault;
//		WhiteColor = WhiteColorDefault;
//		GlowyColor = GlowyColorDefault;
//		GrayColor = GrayColorDefault;
		this.colortype = type;
	}
	
	/**
	    * Called when this item is used when targetting a Block
	    */
//	   public ActionResultType onItemUse(ItemUseContext context) {
		   
//	      World world = context.getWorld();
//	      if (!(world instanceof ServerWorld)) {
//	         return ActionResultType.SUCCESS;
//	      } else {
//	         ItemStack itemstack = context.getItem();
//	         BlockPos blockpos = context.getPos();
//	         Direction direction = context.getFace();
//	         BlockState blockstate = world.getBlockState(blockpos);
//	         if (blockstate.isIn(Blocks.SPAWNER)) {
//	            TileEntity tileentity = world.getTileEntity(blockpos);
//	            if (tileentity instanceof MobSpawnerTileEntity) {
//	               AbstractSpawner abstractspawner = ((MobSpawnerTileEntity)tileentity).getSpawnerBaseLogic();
//	               EntityType<?> entitytype1 = this.getType(itemstack.getTag());
//	               abstractspawner.setEntityType(entitytype1);
//	               tileentity.markDirty();
//	               world.notifyBlockUpdate(blockpos, blockstate, blockstate, 3);
//	               itemstack.shrink(1);
//	               return ActionResultType.CONSUME;
//	            }
//	         }
//
//	         BlockPos blockpos1;
//	         if (blockstate.getCollisionShape(world, blockpos).isEmpty()) {
//	            blockpos1 = blockpos;
//	         } else {
//	            blockpos1 = blockpos.offset(direction);
//	         }
//
//	         EntityType<?> entitytype = this.getType(itemstack.getTag());
//	         if (entitytype.spawn((ServerWorld)world, itemstack, context.getPlayer(), blockpos1, SpawnReason.SPAWN_EGG, true, !Objects.equals(blockpos, blockpos1) && direction == Direction.UP) != null) {
//	            itemstack.shrink(1);
//	         }
//
//	         return ActionResultType.SUCCESS;
//	      }
//	   }
	
	//0-??? Color
	//-1 Does not color
	//-2 Return to default
	//-3 random???
	//-4 Negative

	   /**
	    * Called to trigger the item's "innate" right click behavior. To handle when this item is used on a Block, see
	    * {@link #onItemUse}.
	    */
		@Override
	   public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		   ItemStack itemstack = playerIn.getHeldItem(handIn);

		   ItemStack ArmorItem = playerIn.getItemStackFromSlot(EquipmentSlotType.HEAD);
		   CompoundNBT compoundnbt = ArmorItem.getChildTag("displaymm");
		   
		   CompoundNBT compoundnbtdye = playerIn.getHeldItem(handIn).getChildTag("displaymm");
		  
   	
//		   	ArmorItem = playerIn.getItemStackFromSlot(EquipmentSlotType.HEAD);
//			compoundnbt = ArmorItem.getChildTag("displaymm");
	   		
		   	ProcessColorization(playerIn, playerIn.getHeldItem(handIn), 
		   			EquipmentSlotType.HEAD, compoundnbt, colortype);


		   	
		   	ArmorItem = playerIn.getItemStackFromSlot(EquipmentSlotType.CHEST);
			compoundnbt = ArmorItem.getChildTag("displaymm");

		   	ProcessColorization(playerIn, playerIn.getHeldItem(handIn), 
		   			EquipmentSlotType.CHEST, compoundnbt, colortype);

		   	
		   	
		   	ArmorItem = playerIn.getItemStackFromSlot(EquipmentSlotType.LEGS);
			compoundnbt = ArmorItem.getChildTag("displaymm");

		   	ProcessColorization(playerIn, playerIn.getHeldItem(handIn), 
		   			EquipmentSlotType.LEGS, compoundnbt, colortype);

		   	
		   	
		   	ArmorItem = playerIn.getItemStackFromSlot(EquipmentSlotType.FEET);
			compoundnbt = ArmorItem.getChildTag("displaymm");
			
		   	ProcessColorization(playerIn, playerIn.getHeldItem(handIn), 
		   			EquipmentSlotType.FEET, compoundnbt, colortype);

		   
		   
            return ActionResult.resultConsume(itemstack);

	   }
	   
	   public void ProcessColorization(PlayerEntity player, ItemStack helditem, EquipmentSlotType slotype, CompoundNBT nbt, String colorchanged) {

		   	CompoundNBT compoundnbtdye = helditem.getChildTag("displaymm");
			   
		   	if(nbt != null && compoundnbtdye.contains("MainColor", 99)) {
		   		int color = compoundnbtdye.getInt("MainColor");
		   		player.getItemStackFromSlot(slotype).getOrCreateChildTag("displaymm").putInt(colorchanged, color);
		   	}
		   		
	   }
	   
        
        
	   
//	   @OnlyIn(Dist.CLIENT)
//	   public int getColor(int tintIndex) {
////		   switch(tintIndex) {
////		  		case 0:
////		  			return this.primaryColor;
////		  		}
////	   			default:
////	   				return this.secondaryColor;
////		  		}
////			}
//	      return tintIndex == 0 ? this.primaryColor : this.secondaryColor;
//	   }
	   
	   @OnlyIn(Dist.CLIENT)
	   public int getColor(ItemStack itemStackIn) {
		      CompoundNBT compoundnbt = itemStackIn.getTag();
		      if (compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
		         return compoundnbt.getInt("MainColor");
		      } else {
		         return  342773;
		      }
		   }
//	   @OnlyIn(Dist.CLIENT)
//	   public int createnbttogetcolorfrom(ItemStack itemStackIn) {
//		      CompoundNBT compoundnbt = itemStackIn.getTag();
//		      itemStackIn.getOrCreateChildTag("displaymm").putInt("MainColor", colorvalue);
////		      if (compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
////		         return compoundnbt.getInt("MainColor");
////		      } else {
////		         return  342773;
////		      }
//		      itemStackIn.MainColorDefault;
//		   }
}
