package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.megamanarmor_Boots;
import com.collecter128.megamanarmormod.client.models.megamanarmor_bootscolor;
import com.collecter128.megamanarmormod.client.models.megamanarmor_chestcolor;
import com.collecter128.megamanarmormod.client.models.megamanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.megamanarmor_leggings;
import com.collecter128.megamanarmormod.client.models.megamanarmor_main;
import com.collecter128.megamanarmormod.client.models.megamanarmor_maincolor;
import com.collecter128.megamanarmormod.client.models.vilearmor_chestplate;
import com.collecter128.megamanarmormod.client.models.vilearmor_feet;
import com.collecter128.megamanarmormod.client.models.vilearmor_main;
import com.collecter128.megamanarmormod.core.Imorecolorfularmor;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.Potions;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

//implements Imorecolorfularmor
public class VileArmor extends ArmorItem{//ArmorItem
	

	public int MainColorDefault = 8728033;
	public int SecondaryColorDefault = 5066061;
	public int WhiteColorDefault = 16777215;
	public int ThirdColorDefault = 16772915;
	public int GlowyColorDefault = 16728361;
	public int GrayColorDefault = 12105912;
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;

	public VileArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		if(slot == EquipmentSlotType.HEAD) {
			vilearmor_main model = new vilearmor_main(1.0f);
			model.hat.visible = armorSlot == EquipmentSlotType.HEAD;
        
			model.young = _default.young;
	        model.crouching = _default.crouching;
	        model.riding = _default.riding;
	        model.rightArmPose = _default.rightArmPose;
	        model.leftArmPose = _default.leftArmPose;
			
			int armorcolorer;
			
			CompoundNBT compoundnbt = itemStack.getTagElement("displaymm");
		     // compoundnbt != null && compoundnbt.contains("MainColor", 99);
		      if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
		    	  //CompoundNBT maincompund = itemStack.getChildTag("MainColor");
		    	  //armorcolorer = compoundnbt.getInt("MainColor");
		    	  model.MainColor = compoundnbt.getInt("MainColor");
					//model.MainColor = maincompund.getInt("MainColor");
		      }
		      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {

		    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");

		      }
		      
		      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {

		    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");

		      }
		      
		      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {

		    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");

		      }
		      
		      if(compoundnbt != null && compoundnbt.contains("GlowyColor", 99)) {

		    	  model.GlowyColor = compoundnbt.getInt("GlowyColor");

		      }
		      
		      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {

		    	  model.GrayColor = compoundnbt.getInt("GrayColor");

		      }
			
			this.MainColor = model.MainColor;
			this.SecondaryColor = model.SecondaryColor;
			this.ThirdColor = model.ThirdColor;
			this.WhiteColor = model.WhiteColor;
			this.GlowyColor = model.GlowyColor;
			this.GrayColor = model.GrayColor;

			return (A) model;
		}
		if(slot == EquipmentSlotType.CHEST) {
			vilearmor_chestplate model = new vilearmor_chestplate(1.0f);
			model.hat.visible = armorSlot == EquipmentSlotType.HEAD;
			
			CompoundNBT compoundnbt = itemStack.getTagElement("displaymm");

		      if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
		    	  //CompoundNBT maincompund = itemStack.getChildTag("MainColor");
		    	  //armorcolorer = compoundnbt.getInt("MainColor");
		    	  model.MainColor = compoundnbt.getInt("MainColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {

		    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {

		    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");

		      }
		      
		      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {

		    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {

		    	  model.GrayColor = compoundnbt.getInt("GrayColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("GlowyColor", 99)) {

		    	  model.GlowyColor = compoundnbt.getInt("GlowyColor");

		      }
        
		      model.young = _default.young;
		        model.crouching = _default.crouching;
		        model.riding = _default.riding;
		        model.rightArmPose = _default.rightArmPose;
		        model.leftArmPose = _default.leftArmPose;
			
			this.MainColor = model.MainColor;
			this.SecondaryColor = model.SecondaryColor;
			this.WhiteColor = model.WhiteColor;
			this.ThirdColor = model.ThirdColor;
			this.GlowyColor = model.GlowyColor;
			this.GrayColor = model.GrayColor;

			return (A) model;
		}
//		if(slot == EquipmentSlotType.LEGS) {
//			megamanarmor_leggings model = new megamanarmor_leggings(1.0f);
//			model.bipedHeadwear.showModel = armorSlot == EquipmentSlotType.HEAD;
//        
//			model.isChild = _default.isChild;
//			model.isSneak = _default.isSneak;
//			model.isSitting = _default.isSitting;
//			model.rightArmPose = _default.rightArmPose;
//			model.leftArmPose = _default.leftArmPose;
//
//			return (A) model;
//		}
		else {
			vilearmor_feet model = new vilearmor_feet(1.0f);
			model.hat.visible = armorSlot == EquipmentSlotType.HEAD;
			
			CompoundNBT compoundnbt = itemStack.getTagElement("displaymm");

		      if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
		    	  //CompoundNBT maincompund = itemStack.getChildTag("MainColor");
		    	  //armorcolorer = compoundnbt.getInt("MainColor");
		    	  model.MainColor = compoundnbt.getInt("MainColor");
	
		      }
		      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {

		    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {

		    	  model.GrayColor = compoundnbt.getInt("GrayColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {

		    	  model.GrayColor = compoundnbt.getInt("WhiteColor");

		      }
		      
		      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {

		    	  model.GrayColor = compoundnbt.getInt("ThirdColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("GlowyColor", 99)) {

		    	  model.GlowyColor = compoundnbt.getInt("GlowyColor");

		      }
        
		      model.young = _default.young;
		        model.crouching = _default.crouching;
		        model.riding = _default.riding;
		        model.rightArmPose = _default.rightArmPose;
		        model.leftArmPose = _default.leftArmPose;
			
			this.MainColor = model.MainColor;
			this.SecondaryColor = model.SecondaryColor;
			this.WhiteColor = model.WhiteColor;
			this.ThirdColor = model.ThirdColor;
			this.GlowyColor = model.GlowyColor;
			this.GrayColor = model.GrayColor;

			return (A) model;
		}
		
	}
	
	public boolean hasMainColor(ItemStack stack) {
	      CompoundNBT compoundnbt = stack.getTagElement("displaymm");
	      return compoundnbt != null && compoundnbt.contains("MainColor", 99);
	   }
	public boolean hasSecondaryColor(ItemStack stack) {
	      CompoundNBT compoundnbt = stack.getTagElement("displaymm");
	      return compoundnbt != null && compoundnbt.contains("SecondaryColor", 99);
	   }
	public boolean hasGlowyColor(ItemStack stack) {
	      CompoundNBT compoundnbt = stack.getTagElement("displaymm");
	      return compoundnbt != null && compoundnbt.contains("GlowyColor", 99);
	   }
	public boolean hasGrayColor(ItemStack stack) {
	      CompoundNBT compoundnbt = stack.getTagElement("displaymm");
	      return compoundnbt != null && compoundnbt.contains("GrayColor", 99);
	   }
	
	
	public void colorize(int[]colors, ItemStack stack) {
		stack.getOrCreateTagElement("displaymm").putInt("MainColor", colors[0]);
		stack.getOrCreateTagElement("displaymm").putInt("SecondaryColor", colors[1]);
		stack.getOrCreateTagElement("displaymm").putInt("ThirdColor", colors[2]);
		stack.getOrCreateTagElement("displaymm").putInt("WhiteColor", colors[3]);
		stack.getOrCreateTagElement("displaymm").putInt("GlowyColor", colors[4]);
		stack.getOrCreateTagElement("displaymm").putInt("GrayColor", colors[5]);
//		MainColor = colors[0];
//		SecondaryColor = colors[1];
//		GlowyColor = colors[2];
//		GrayColor = colors[3];
	}
	
	public static int[] getdefaultcolors() {
		int[] colors = new int[4];
		colors[0] = 342773;
		colors[1] = 379125;
		colors[2] = 14105660;
		colors[3] = 16777215;
		colors[4] = 16728361;
		colors[5] = 12105912;
		return colors;
	}
	
//
   // @Override
    //public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
    //    return null;
    //}
	
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
//	      return tintIndex == 0 ? this.MainColor : this.SecondaryColor;
//	   }
	   
	   public static int getColor(ItemStack itemStackIn) {
	      CompoundNBT compoundnbt = itemStackIn.getTag();
	      if (compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
	         return compoundnbt.getInt("MainColor");
	      } else {
	         return  342773;
	      }
	   }

//	@Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "megamanarmormod:textures/armor/vilearmor1.png";
    }
	
}
