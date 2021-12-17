package com.collecter128.megamanarmormod.items;

import java.awt.Color;
import java.util.Objects;
import java.util.Random;

import com.collecter128.megamanarmormod.core.ItemInit;

import net.minecraft.block.AbstractBannerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.client.renderer.entity.model.ShieldModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.item.ArmorStandEntity;
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

public class ArmorColorizer extends Item implements IDyeableArmorItem{

	public int primaryColor = 0;
	public int secondaryColor= 0;
	public int thiraryColor = 0;
	public int WhiteColor = 0;
	public int GlowyColor= 0;
	public int GrayColor= 0;
	public int MainColorDefault = 342773;
	public int SecondaryColorDefault = 379125;
	public int WhiteColorDefault = 16777215;
	public int ThirdColorDefault = 16777215;
	public int GlowyColorDefault = 16728361;
	public int GrayColorDefault = 12105912;
	
	public ArmorColorizer(Properties properties, int[]colors) {
		super(properties);
		this.MainColorDefault = colors[0];
		this.SecondaryColorDefault = colors[1];
		this.ThirdColorDefault = colors[2];
		this.WhiteColorDefault = colors[3];
		this.GlowyColorDefault = colors[4];
		this.GrayColorDefault = colors[5];
		primaryColor = MainColorDefault;
		secondaryColor = SecondaryColorDefault;
		thiraryColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
	}
	
//	   public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
//		      ItemStack itemstack = playerIn.getHeldItem(handIn);
//		      EquipmentSlotType equipmentslottype = MobEntity.getSlotForItemStack(itemstack);
//		      ItemStack itemstack1 = playerIn.getItemStackFromSlot(equipmentslottype);
//		      if (itemstack1.isEmpty()) {
//		         playerIn.setItemStackToSlot(equipmentslottype, itemstack.copy());
//		         itemstack.setCount(0);
//		         return ActionResult.func_233538_a_(itemstack, worldIn.isRemote());
//		      } else {
//		         return ActionResult.resultFail(itemstack);
//		      }
//		   }
	
//	/**
//	    * Called when this item is used when targetting a Block
//	    */
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
	   public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		   ItemStack itemstack = playerIn.getHeldItem(handIn);
		   int[] colorarray = new int[] {primaryColor, secondaryColor, thiraryColor, WhiteColor, GlowyColor, GrayColor};
		   ItemStack ArmorItem = playerIn.getItemStackFromSlot(EquipmentSlotType.HEAD);
		   CompoundNBT compoundnbt = ArmorItem.getChildTag("displaymm");
		   //if(playerIn.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ItemInit.MegamanArmor_Head.get()) {

		   	Random random = new Random(16777215);
		//   	Random random2 = new Random(16777215);
	   		int randint = random.nextInt();//random2.nextInt()
	   	//	randint = random2.nextInt(random.nextInt());
	   		randint = random.nextInt();
//		   	
//		   	ArmorItem = playerIn.getItemStackFromSlot(EquipmentSlotType.HEAD);
//			compoundnbt = ArmorItem.getChildTag("displaymm");
		   	ProcessColorization(playerIn, EquipmentSlotType.HEAD, compoundnbt, "MainColor", primaryColor,randint);
		   	if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
		   		itemstack.getOrCreateChildTag("display").putInt("color", primaryColor);
		   	}
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.HEAD, compoundnbt, "SecondaryColor", secondaryColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.HEAD, compoundnbt, "WhiteColor", WhiteColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.HEAD, compoundnbt, "ThirdColor", thiraryColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.HEAD, compoundnbt, "GlowyColor", GlowyColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.HEAD, compoundnbt, "GrayColor", GrayColor,randint);
		   	
		   	ArmorItem = playerIn.getItemStackFromSlot(EquipmentSlotType.CHEST);
			compoundnbt = ArmorItem.getChildTag("displaymm");
			//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.CHEST, compoundnbt, "MainColor", primaryColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.CHEST, compoundnbt, "SecondaryColor", secondaryColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.CHEST, compoundnbt, "WhiteColor", WhiteColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.CHEST, compoundnbt, "ThirdColor", thiraryColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.CHEST, compoundnbt, "GlowyColor", GlowyColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.CHEST, compoundnbt, "GrayColor", GrayColor,randint);
		   	
		   	ArmorItem = playerIn.getItemStackFromSlot(EquipmentSlotType.LEGS);
			compoundnbt = ArmorItem.getChildTag("displaymm");
			//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.LEGS, compoundnbt, "MainColor", primaryColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.LEGS, compoundnbt, "SecondaryColor", secondaryColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.LEGS, compoundnbt, "WhiteColor", WhiteColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.LEGS, compoundnbt, "ThirdColor", thiraryColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.LEGS, compoundnbt, "GlowyColor", GlowyColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.LEGS, compoundnbt, "GrayColor", GrayColor,randint);
		   	
		   	ArmorItem = playerIn.getItemStackFromSlot(EquipmentSlotType.FEET);
			compoundnbt = ArmorItem.getChildTag("displaymm");
			//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.FEET, compoundnbt, "MainColor", primaryColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.FEET, compoundnbt, "SecondaryColor", secondaryColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.FEET, compoundnbt, "WhiteColor", WhiteColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.FEET, compoundnbt, "ThirdColor", thiraryColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.FEET, compoundnbt, "GlowyColor", GlowyColor,randint);
		   	//randint = random.nextInt();
		   	ProcessColorization(playerIn, EquipmentSlotType.FEET, compoundnbt, "GrayColor", GrayColor,randint);
		   	//}
		   //}
		   
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
            return ActionResult.resultConsume(itemstack);

	   }
	   
	   public void ProcessColorization(PlayerEntity player, EquipmentSlotType slotype, CompoundNBT nbt, String colorchanged, int colorvalue, int randomvalue) {
		   	if(colorvalue >= 0) {// Change color to mach the value (similar to how vanilla armor is dyed
				   player.getItemStackFromSlot(slotype).getOrCreateChildTag("displaymm").putInt(colorchanged, colorvalue);
		   	}
		   	//-1 doesn't change the color, so it's not acted upon
		   	else if(colorvalue == -2){//return it to default
		   		if (nbt != null && nbt.contains(colorchanged, 99)) {
			         //compoundnbt.remove("MainColor");
			         player.getItemStackFromSlot(slotype).removeChildTag(colorchanged);
			         //playerIn.setItemStackToSlot(EquipmentSlotType.HEAD, ArmorItem.copy());
			      }
		   	}
		   	else if(colorvalue == -3){//Random! Using the broken not working negative
		   		if (nbt != null && nbt.contains(colorchanged, 99)) {
		   			nbt.getInt(colorchanged);
		   			float fred = (float)( nbt.getInt(colorchanged) >> 16 & 255) / 255.0F;
		   			float fblue = (float)(nbt.getInt(colorchanged) >> 8 & 255) / 255.0F;
		   			float fgreen = (float)(nbt.getInt(colorchanged) & 255) / 255.0F;
		   			float nred = 255.0F - fred;
		   			float ngreen = 255.0F - fgreen;
		   			float nblue = 255.0F - fblue;
		   			int negativevalue = (int) (ngreen * 65536 + nblue * 256 + nred);
		   			player.getItemStackFromSlot(slotype).getOrCreateChildTag("displaymm").putInt(colorchanged, negativevalue);
		   		}
		   		else
		   			player.getItemStackFromSlot(slotype).getOrCreateChildTag("displaymm").putInt(colorchanged, randomvalue);
		   	}
		   	else if(colorvalue == -4){//Negative using the formula for negative
		   		if (nbt != null && nbt.contains(colorchanged, 99)) {
		   			Color color = new Color(nbt.getInt(colorchanged));
		   			int nred = 255 - color.getRed();
		   			int ngreen = 255 - color.getGreen();
		   			int nblue = 255 - color.getBlue();
		   			int negativevalue = (int) ((nred * 65536) + (ngreen * 256) + nblue);
		   			player.getItemStackFromSlot(slotype).getOrCreateChildTag("displaymm").putInt(colorchanged, negativevalue);
		   		}
		   	}
		   	randomvalue = random.nextInt();
	   }
	   
	   /**
	    * Returns true if the item can be used on the given entity, e.g. shears on sheep.
	    */
	   public ActionResultType itemInteractionForEntity(ItemStack stack, PlayerEntity playerIn, LivingEntity target, Hand hand) {
	      //if (stack.hasDisplayName() && !(target instanceof PlayerEntity)) {
	         if (!playerIn.world.isRemote) {// && target.isAlive()
	            //target.setCustomName(stack.getDisplayName());
//	            if (target instanceof PlayerEntity) {
//	               ((MobEntity)target).enablePersistence();
//	            }
	        	 
	        	// EquipmentSlotType equipmentslottype = MobEntity.getSlotForItemStack(itemstack);
	            //if(target.getItemStackFromSlot(EquipmentSlotType.HEAD) != null) {
	            	//target.getItemStackFromSlot(EquipmentSlotType.HEAD);
	            	
	            	int randint = random.nextInt();//random2.nextInt()
	        	   	//	randint = random2.nextInt(random.nextInt());
	        	   		randint = random.nextInt();
	            	
	            	ItemStack ArmorItem = target.getItemStackFromSlot(EquipmentSlotType.HEAD);
	            	 CompoundNBT compoundnbt = ArmorItem.getChildTag("displaymm");
	            	
	    		   	ProcessColorizationOnTarget(playerIn, EquipmentSlotType.HEAD, compoundnbt, "MainColor", primaryColor,randint, ArmorItem);
	    		   	if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
	    		   		ArmorItem.getOrCreateChildTag("display").putInt("color", primaryColor);
	    		   		target.setItemStackToSlot(EquipmentSlotType.HEAD, ArmorItem);
	    		   	}
//	    		   	if(target instanceof ArmorStandEntity) {
//	    		   		ArmorStandEntity armorstand = (ArmorStandEntity) target;
//	    		   		armorstand.armorItems;
//	    		   	}
	    		   	//randint = random.nextInt();
	    		   	ProcessColorizationOnTarget(target, EquipmentSlotType.HEAD, compoundnbt, "SecondaryColor", secondaryColor,randint, ArmorItem);
	    		   	//randint = random.nextInt();
	    		   	ProcessColorizationOnTarget(target, EquipmentSlotType.HEAD, compoundnbt, "WhiteColor", WhiteColor,randint, ArmorItem);
	    		   	//randint = random.nextInt();
	    		   	ProcessColorizationOnTarget(target, EquipmentSlotType.HEAD, compoundnbt, "ThirdColor", thiraryColor,randint, ArmorItem);
	    		   	//randint = random.nextInt();
	    		   	ProcessColorizationOnTarget(target, EquipmentSlotType.HEAD, compoundnbt, "GlowyColor", GlowyColor,randint, ArmorItem);
	    		   	//randint = random.nextInt();
	    		   	ProcessColorizationOnTarget(target, EquipmentSlotType.HEAD, compoundnbt, "GrayColor", GrayColor,randint, ArmorItem);
	            }

	            //stack.shrink(1);
	        //}

	         return ActionResultType.func_233537_a_(playerIn.world.isRemote);
//	      } else {
//	         return ActionResultType.PASS;
//	      }
	   }
	   
	   public void ProcessColorizationOnTarget(Entity player, EquipmentSlotType slotype, CompoundNBT nbt, String colorchanged, int colorvalue, int randomvalue, ItemStack thisarmoritem) {
		   	if(colorvalue >= 0) {// Change color to mach the value (similar to how vanilla armor is dyed
				   //player.getItemStackFromSlot(slotype).getOrCreateChildTag("displaymm").putInt(colorchanged, colorvalue);
				   thisarmoritem.getOrCreateChildTag("displaymm").putInt(colorchanged, colorvalue);
				   player.setItemStackToSlot(slotype, thisarmoritem);
		   	}
		   	//-1 doesn't change the color, so it's not acted upon
		   	else if(colorvalue == -2){//return it to default
		   		if (nbt != null && nbt.contains(colorchanged, 99)) {
			         //compoundnbt.remove("MainColor");
			         //player.getItemStackFromSlot(slotype).removeChildTag(colorchanged);
			         thisarmoritem.removeChildTag(colorchanged);
					 player.setItemStackToSlot(slotype, thisarmoritem);
			      }
		   	}
		   	else if(colorvalue == -3){//Random! Using the broken not working negative
		   		if (nbt != null && nbt.contains(colorchanged, 99)) {
		   			nbt.getInt(colorchanged);
		   			float fred = (float)( nbt.getInt(colorchanged) >> 16 & 255) / 255.0F;
		   			float fblue = (float)(nbt.getInt(colorchanged) >> 8 & 255) / 255.0F;
		   			float fgreen = (float)(nbt.getInt(colorchanged) & 255) / 255.0F;
		   			float nred = 255.0F - fred;
		   			float ngreen = 255.0F - fgreen;
		   			float nblue = 255.0F - fblue;
		   			int negativevalue = (int) (ngreen * 65536 + nblue * 256 + nred);
		   			//player.getItemStackFromSlot(slotype).getOrCreateChildTag("displaymm").putInt(colorchanged, negativevalue);
		   			thisarmoritem.getOrCreateChildTag("displaymm").putInt(colorchanged, negativevalue);
					player.setItemStackToSlot(slotype, thisarmoritem);
		   		}
		   		else
		   		//	player.getItemStackFromSlot(slotype).getOrCreateChildTag("displaymm").putInt(colorchanged, randomvalue);
		   		thisarmoritem.getOrCreateChildTag("displaymm").putInt(colorchanged, randomvalue);
				player.setItemStackToSlot(slotype, thisarmoritem);
		   	}
		   	else if(colorvalue == -4){//Negative using the formula for negative
		   		if (nbt != null && nbt.contains(colorchanged, 99)) {
		   			Color color = new Color(nbt.getInt(colorchanged));
		   			int nred = 255 - color.getRed();
		   			int ngreen = 255 - color.getGreen();
		   			int nblue = 255 - color.getBlue();
		   			int negativevalue = (int) ((nred * 65536) + (ngreen * 256) + nblue);
		   			//player.getItemStackFromSlot(slotype).getOrCreateChildTag("displaymm").putInt(colorchanged, negativevalue);
		   			thisarmoritem.getOrCreateChildTag("displaymm").putInt(colorchanged, negativevalue);
					player.setItemStackToSlot(slotype, thisarmoritem);
		   		}
		   	}
		   	randomvalue = random.nextInt();
	   }
	   
        
//	   @OnlyIn(Dist.CLIENT)
//	   @Override
//	   public net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer getItemStackTileEntityRenderer() {
//	      net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer renderer = ister != null ? ister.get() : null;
//	      return renderer != null ? renderer : net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer.instance;
//	      //   private final ShieldModel modelShield = new ShieldModel();
//	      //this.modelShield.func_228293_a_().render(matrixStack, ivertexbuilder, combinedLight, combinedOverlay, 1.0F, 1.0F, 1.0F, 1.0F);
//	   }
	   
//	   @OnlyIn(Dist.CLIENT)
//	   //@Override
//	   public int getColor(int tintIndex) {
////		   switch(tintIndex) {
////		  		case 0:
//		   		if(tintIndex == 0) {
//		  			//return this.primaryColor;
//		  			return this.MainColorDefault;
//		  		}
////	   			default:
//	   				return this.secondaryColor;
////		  		}
////			}
//	      //return tintIndex == 0 ? this.primaryColor : this.secondaryColor;
//	   }

	   
	   @OnlyIn(Dist.CLIENT)
	   @Override
	   public int getColor(ItemStack itemStackIn) {
		      CompoundNBT compoundnbt = itemStackIn.getTag();
		      if (compoundnbt != null && compoundnbt.contains("color", 99)) {//MainColor
		         return compoundnbt.getInt("color");
		      } else {
		         return  342773;
		      }
		   }
	   
	   
	   
	   
//	   public DyeColor getColor() {
//		   CompoundNBT compoundnbt = itemStackIn.getTag();
//		   //return ((AbstractBannerBlock)this.getBlock()).getColor();
//		   }
//	   
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
