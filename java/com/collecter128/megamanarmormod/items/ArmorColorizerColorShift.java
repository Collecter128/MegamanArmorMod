package com.collecter128.megamanarmormod.items;

import java.awt.Color;
import java.util.Objects;
import java.util.Random;

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
import net.minecraft.item.DyeColor;
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

public class ArmorColorizerColorShift extends Item implements IDyeableArmorItem{

	public int shiftcolor = 0;
	public int shiftpercent = 0;
	
	public ArmorColorizerColorShift(Properties properties, int color, int amountbypercent) {
		super(properties);
		this.shiftcolor = color;
		this.shiftpercent = amountbypercent;

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

	   /**
	    * Called to trigger the item's "innate" right click behavior. To handle when this item is used on a Block, see
	    * {@link #onItemUse}.
	    */
	   public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
		   ItemStack itemstack = playerIn.getItemInHand(handIn);
		   
		   ItemStack ArmorItem = playerIn.getItemBySlot(EquipmentSlotType.HEAD);
		   CompoundNBT compoundnbt = ArmorItem.getTagElement("displaymm");
		   
		   	Random random = new Random(16777215);
	   		int randint = random.nextInt();//random2.nextInt()
	   		randint = random.nextInt();
//		   	
		   	ProcessColorization(playerIn, EquipmentSlotType.HEAD, compoundnbt, "MainColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.HEAD, compoundnbt, "SecondaryColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.HEAD, compoundnbt, "WhiteColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.HEAD, compoundnbt, "ThirdColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.HEAD, compoundnbt, "GlowyColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.HEAD, compoundnbt, "GrayColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.HEAD, compoundnbt, "FourthColor", shiftcolor, shiftpercent);
		   	
		   	ArmorItem = playerIn.getItemBySlot(EquipmentSlotType.CHEST);
			compoundnbt = ArmorItem.getTagElement("displaymm");
		   	ProcessColorization(playerIn, EquipmentSlotType.CHEST, compoundnbt, "MainColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.CHEST, compoundnbt, "SecondaryColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.CHEST, compoundnbt, "WhiteColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.CHEST, compoundnbt, "ThirdColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.CHEST, compoundnbt, "GlowyColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.CHEST, compoundnbt, "GrayColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.CHEST, compoundnbt, "FourthColor", shiftcolor, shiftpercent);
		   	
		   	ArmorItem = playerIn.getItemBySlot(EquipmentSlotType.LEGS);
			compoundnbt = ArmorItem.getTagElement("displaymm");
		   	ProcessColorization(playerIn, EquipmentSlotType.LEGS, compoundnbt, "MainColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.LEGS, compoundnbt, "SecondaryColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.LEGS, compoundnbt, "WhiteColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.LEGS, compoundnbt, "ThirdColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.LEGS, compoundnbt, "GlowyColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.LEGS, compoundnbt, "GrayColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.LEGS, compoundnbt, "FourthColor", shiftcolor, shiftpercent);
		   	
		   	ArmorItem = playerIn.getItemBySlot(EquipmentSlotType.FEET);
			compoundnbt = ArmorItem.getTagElement("displaymm");
		   	ProcessColorization(playerIn, EquipmentSlotType.FEET, compoundnbt, "MainColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.FEET, compoundnbt, "SecondaryColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.FEET, compoundnbt, "WhiteColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.FEET, compoundnbt, "ThirdColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.FEET, compoundnbt, "GlowyColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.FEET, compoundnbt, "GrayColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.FEET, compoundnbt, "FourthColor", shiftcolor, shiftpercent);

		   	ArmorItem = playerIn.getItemBySlot(EquipmentSlotType.OFFHAND);
			compoundnbt = ArmorItem.getTagElement("displaymm");
		   	ProcessColorization(playerIn, EquipmentSlotType.OFFHAND, compoundnbt, "MainColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.OFFHAND, compoundnbt, "SecondaryColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.OFFHAND, compoundnbt, "WhiteColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.OFFHAND, compoundnbt, "ThirdColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.OFFHAND, compoundnbt, "GlowyColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.OFFHAND, compoundnbt, "GrayColor", shiftcolor, shiftpercent);
		   	ProcessColorization(playerIn, EquipmentSlotType.OFFHAND, compoundnbt, "FourthColor", shiftcolor, shiftpercent);
		   
//		   ArmorItem = playerIn.getItemStackFromSlot(EquipmentSlotType.OFFHAND);
//		   if((playerIn.getItemStackFromSlot(EquipmentSlotType.OFFHAND).getItem() == ItemInit.MegamanArmor_Head.get()) ||
//				   (playerIn.getItemStackFromSlot(EquipmentSlotType.OFFHAND).getItem() == ItemInit.MegamanArmor_Body.get()) ||
//				   (playerIn.getItemStackFromSlot(EquipmentSlotType.OFFHAND).getItem() == ItemInit.MegamanArmor_Legs.get()) ||
//				   (playerIn.getItemStackFromSlot(EquipmentSlotType.OFFHAND).getItem() == ItemInit.MegamanArmor_Arms.get())) {
//			   ((MegamanArmorColor) ArmorItem.getItem()).colorize(colorarray, ArmorItem);
//			   playerIn.setItemStackToSlot(EquipmentSlotType.OFFHAND, ArmorItem.copy());
//		   }
		   
	       //return ActionResult.resultSuccess(ArmorItem);
//	       if (!playerIn.abilities.isCreativeMode) {
//               itemstack.shrink(1);
//            }

            //playerIn.addStat(Stats.ITEM_USED.get(this));
            return ActionResult.consume(itemstack);

	   }
	   
	   public void ProcessColorization(PlayerEntity player, EquipmentSlotType slotype, CompoundNBT nbt, String colorchanged, int colorvalue, int percent) {
		   
		   	if (nbt != null && nbt.contains(colorchanged, 99)) {
		   		Color oldcolor = new Color(nbt.getInt(colorchanged));
		   		Color newcolor = new Color(colorvalue);
		   		float NewRed = ( (oldcolor.getRed()+newcolor.getRed())/2);
		   		float NewGreen = ( (oldcolor.getGreen()+newcolor.getGreen())/2);
		   		float NewBlue = ( (oldcolor.getBlue()+newcolor.getBlue())/2);
//		   		float NewRed = ( ((oldcolor.getRed()*(100-percent))+(newcolor.getRed()*percent))/2)  /100;
		   		//		   		float NewRed = ( ((oldcolor.getRed()*(100-percent))+(newcolor.getRed()*percent))/2)  /100;
//		   		float NewGreen = ( ((oldcolor.getGreen()*(100-percent))+(newcolor.getGreen()*percent))/2)  /100;
//		   		float NewBlue = ( ((oldcolor.getBlue()*(100-percent))+(newcolor.getBlue()*percent))/2)  /100;
		   		int shiftcolor = (int) ((NewRed * 65536) + (NewGreen * 256) + NewBlue);
		   		player.getItemBySlot(slotype).getOrCreateTagElement("displaymm").putInt(colorchanged, shiftcolor);
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
