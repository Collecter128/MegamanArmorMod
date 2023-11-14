package com.collecter128.megamanarmormod.items;

import java.util.Objects;

import com.collecter128.megamanarmormod.core.ItemInit;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
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

public class ArmorColorizerDefault extends Item{

	public int primaryColor;
	public int secondaryColor;
	public int GlowyColor;
	public int GrayColor;
	public int MainColorDefault = 342773;
	public int SecondaryColorDefault = 379125;
	public int GlowyColorDefault = 16728361;
	public int GrayColorDefault = 12105912;
	
	public ArmorColorizerDefault(Properties properties) {
		super(properties);
		
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

	   /**
	    * Called to trigger the item's "innate" right click behavior. To handle when this item is used on a Block, see
	    * {@link #onItemUse}.
	    */
	   public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
		   ItemStack itemstack = playerIn.getItemInHand(handIn);
		   ItemStack ArmorItem = playerIn.getItemBySlot(EquipmentSlotType.HEAD);
		   //if(playerIn.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ItemInit.MegamanArmor_Head.get()) {
		   
			   CompoundNBT compoundnbt = ArmorItem.getTagElement("displaymm");
			   
//			   if (compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
//			         compoundnbt.remove("MainColor");
//			         //playerIn.setItemStackToSlot(EquipmentSlotType.HEAD, ArmorItem.copy());
//			      }
			 
			   removecolor(compoundnbt, "MainColor");
			   removecolor(compoundnbt, "SecondaryColor");
			   removecolor(compoundnbt, "ThirdColor");
			   removecolor(compoundnbt, "WhiteColor");
			   removecolor(compoundnbt, "GlowyColor");
			   removecolor(compoundnbt, "GrayColor");
			   removecolor(compoundnbt, "FourthColor");
			   removecolor(compoundnbt, "FifthColor");
			   removecolor(compoundnbt, "MainColorglow");
			   removecolor(compoundnbt, "SecondaryColorglow");
			   removecolor(compoundnbt, "ThirdColorglow");
			   removecolor(compoundnbt, "WhiteColorglow");
			   removecolor(compoundnbt, "GlowyColorglow");
			   removecolor(compoundnbt, "GrayColorglow");
			   removecolor(compoundnbt, "FourthColorglow");
			   removecolor(compoundnbt, "FifthColorglow");

			   playerIn.setItemSlot(EquipmentSlotType.HEAD, ArmorItem.copy());
			   
			   ArmorItem = playerIn.getItemBySlot(EquipmentSlotType.CHEST);
			   compoundnbt = ArmorItem.getTagElement("displaymm");
			   removecolor(compoundnbt, "MainColor");
			   removecolor(compoundnbt, "SecondaryColor");
			   removecolor(compoundnbt, "ThirdColor");
			   removecolor(compoundnbt, "WhiteColor");
			   removecolor(compoundnbt, "GlowyColor");
			   removecolor(compoundnbt, "GrayColor");
			   removecolor(compoundnbt, "FourthColor");
			   removecolor(compoundnbt, "FifthColor");
			   removecolor(compoundnbt, "MainColorglow");
			   removecolor(compoundnbt, "SecondaryColorglow");
			   removecolor(compoundnbt, "ThirdColorglow");
			   removecolor(compoundnbt, "WhiteColorglow");
			   removecolor(compoundnbt, "GlowyColorglow");
			   removecolor(compoundnbt, "GrayColorglow");
			   removecolor(compoundnbt, "FourthColorglow");
			   removecolor(compoundnbt, "FifthColorglow");

			   playerIn.setItemSlot(EquipmentSlotType.CHEST, ArmorItem.copy());
			   
			   ArmorItem = playerIn.getItemBySlot(EquipmentSlotType.LEGS);
			   compoundnbt = ArmorItem.getTagElement("displaymm");
			   removecolor(compoundnbt, "MainColor");
			   removecolor(compoundnbt, "SecondaryColor");
			   removecolor(compoundnbt, "ThirdColor");
			   removecolor(compoundnbt, "WhiteColor");
			   removecolor(compoundnbt, "GlowyColor");
			   removecolor(compoundnbt, "GrayColor");
			   removecolor(compoundnbt, "FourthColor");
			   removecolor(compoundnbt, "FifthColor");
			   removecolor(compoundnbt, "MainColorglow");
			   removecolor(compoundnbt, "SecondaryColorglow");
			   removecolor(compoundnbt, "ThirdColorglow");
			   removecolor(compoundnbt, "WhiteColorglow");
			   removecolor(compoundnbt, "GlowyColorglow");
			   removecolor(compoundnbt, "GrayColorglow");
			   removecolor(compoundnbt, "FourthColorglow");
			   removecolor(compoundnbt, "FifthColorglow");

			   playerIn.setItemSlot(EquipmentSlotType.LEGS, ArmorItem.copy());
			   
			   ArmorItem = playerIn.getItemBySlot(EquipmentSlotType.FEET);
			   compoundnbt = ArmorItem.getTagElement("displaymm");
			   removecolor(compoundnbt, "MainColor");
			   removecolor(compoundnbt, "SecondaryColor");
			   removecolor(compoundnbt, "ThirdColor");
			   removecolor(compoundnbt, "WhiteColor");
			   removecolor(compoundnbt, "GlowyColor");
			   removecolor(compoundnbt, "GrayColor");
			   removecolor(compoundnbt, "FourthColor");
			   removecolor(compoundnbt, "FifthColor");
			   removecolor(compoundnbt, "MainColorglow");
			   removecolor(compoundnbt, "SecondaryColorglow");
			   removecolor(compoundnbt, "ThirdColorglow");
			   removecolor(compoundnbt, "WhiteColorglow");
			   removecolor(compoundnbt, "GlowyColorglow");
			   removecolor(compoundnbt, "GrayColorglow");
			   removecolor(compoundnbt, "FourthColorglow");
			   removecolor(compoundnbt, "FifthColorglow");

			   playerIn.setItemSlot(EquipmentSlotType.FEET, ArmorItem.copy());
			   
			   ArmorItem = playerIn.getItemBySlot(EquipmentSlotType.OFFHAND);
			   compoundnbt = ArmorItem.getTagElement("displaymm");
			   removecolor(compoundnbt, "MainColor");
			   removecolor(compoundnbt, "SecondaryColor");
			   removecolor(compoundnbt, "ThirdColor");
			   removecolor(compoundnbt, "WhiteColor");
			   removecolor(compoundnbt, "GlowyColor");
			   removecolor(compoundnbt, "GrayColor");
			   removecolor(compoundnbt, "FourthColor");
			   removecolor(compoundnbt, "FifthColor");
			   removecolor(compoundnbt, "MainColorglow");
			   removecolor(compoundnbt, "SecondaryColorglow");
			   removecolor(compoundnbt, "ThirdColorglow");
			   removecolor(compoundnbt, "WhiteColorglow");
			   removecolor(compoundnbt, "GlowyColorglow");
			   removecolor(compoundnbt, "GrayColorglow");
			   removecolor(compoundnbt, "FourthColorglow");
			   removecolor(compoundnbt, "FifthColorglow");

			   playerIn.setItemSlot(EquipmentSlotType.OFFHAND, ArmorItem.copy());

            return ActionResult.consume(itemstack);

	   }
	   
	   public void removecolor(CompoundNBT nbt, String colortype) {
		   if (nbt != null && nbt.contains(colortype, 99)) {
			   nbt.remove(colortype);
		         //playerIn.setItemStackToSlot(EquipmentSlotType.HEAD, ArmorItem.copy());
		      }
	   }
	   
	   @OnlyIn(Dist.CLIENT)
	   public int getColor(int tintIndex) {
//		   switch(tintIndex) {
//		  		case 0:
//		  			return this.primaryColor;
//		  		}
//	   			default:
//	   				return this.secondaryColor;
//		  		}
//			}
	      return tintIndex == 0 ? this.primaryColor : this.secondaryColor;
	   }
}
