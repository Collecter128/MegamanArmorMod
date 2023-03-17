package com.collecter128.megamanarmormod.items;

import java.awt.Color;

import com.collecter128.megamanarmormod.client.models.Megaman_body2;
import com.collecter128.megamanarmormod.client.models.megamanarmor_Boots;
import com.collecter128.megamanarmormod.client.models.megamanarmor_bootscolor;
import com.collecter128.megamanarmormod.client.models.megamanarmor_chestcolor;
import com.collecter128.megamanarmormod.client.models.megamanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.megamanarmor_leggings;
import com.collecter128.megamanarmormod.client.models.megamanarmor_main;
import com.collecter128.megamanarmormod.client.models.megamanarmor_maincolor;
import com.collecter128.megamanarmormod.core.Imorecolorfularmor;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.Potions;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

//implements Imorecolorfularmor
public class MegamanArmorColor extends ArmorItem implements IDyeableArmorItem{//ArmorItem
	

	public int MainColorDefault = 342773;
	public int SecondaryColorDefault = 379125;
	public int WhiteColorDefault = 16777215;
	public int ThirdColorDefault = 14105660;
	public int GlowyColorDefault = 16728361;
	public int GrayColorDefault = 12105912;
	public int FourthColorDefault = 342773;
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;
	public int FourthColor = FourthColorDefault;
	public int colortime = 25;

	public MegamanArmorColor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
	}
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		if(slot == EquipmentSlotType.HEAD) {
			megamanarmor_maincolor model = new megamanarmor_maincolor(1.0f);
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
//		    	  if(compoundnbt.getInt("MainColor") == -7) {
//		    		  	int time = (int)entityLiving.world.getDayTime();
//		    		  	//24,000 max 8 x 3
//		    		  	//0 - 8,000
//		    		  	// 9,000 - 16,000
//		    		  	// 17,000 - 24,000
//		    		  	//0 - 255
//		    		  	//256 - 510
//		    		  	//511 - 765
//		    		  	//redcolor ->255 blue -> 0 greencolor ->255 redcolor ->0 Blue ->255 Green ->0
//			   			Color color = new Color(compoundnbt.getInt("MainColor"));
//			   			int nred = 255 - color.getRed();
//			   			int ngreen = 255 - color.getGreen();
//			   			int nblue = 255 - color.getBlue();
//			   			int negativevalue = (int) ((nred * 65536) + (ngreen * 256) + nblue);
		    	  
//		    	
//		    	         float fred;
//		    	         float f1green;
//		    	         float f2blue;
//		    	         int currentcolor = compoundnbt.getInt("MainColor");
////		    	         if(colortime >) {
////		    	        	 colortime = 0;
////		    	         }
//		    	         	colortime ++;
//		    	            int i1 = 25;
//		    	            int i = colortime / 25;
//		    	            int j = DyeColor.values().length;
//		    	            int k = i % j;
//		    	            int l = (i + 1) % j;
//		    	            float f3 = ((float)(colortime % 25) + partialTicks) / 25.0F;
//		    	            float[] afloat1 = SheepEntity.getDyeRgb(DyeColor.byId(k));
//		    	            float[] afloat2 = SheepEntity.getDyeRgb(DyeColor.byId(l));
//		    	            fred = afloat1[0] * (1.0F - f3) + afloat2[0] * f3;
//		    	            f1green = afloat1[1] * (1.0F - f3) + afloat2[1] * f3;
//		    	            f2blue = afloat1[2] * (1.0F - f3) + afloat2[2] * f3;
//		    	  }
		    	  model.MainColor = compoundnbt.getInt("MainColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {

		    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");

		      }
		      
		      if(compoundnbt != null && compoundnbt.contains("GlowyColor", 99)) {

		    	  model.GlowyColor = compoundnbt.getInt("GlowyColor");

		      }
		      
		      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {

		    	  model.GrayColor = compoundnbt.getInt("GrayColor");

		      }

		      //if(this.MainColor == null) {
		    	//  model.MainColor = MainColor;
		      //}
			
//			if(hasMainColor(itemStack)) {
//				CompoundNBT compoundnbt = itemStack.getChildTag("MainColor");
//				model.MainColor = compoundnbt.getInt("color");
//			}
//			if(hasSecondaryColor(itemStack)) {
//				CompoundNBT compoundnbt = itemStack.getChildTag("MainColor");
//				model.SecondaryColor = compoundnbt.getInt("color");
//			}
//			if(hasGlowyColor(itemStack)) {
//				CompoundNBT compoundnbt = itemStack.getChildTag("MainColor");
//				model.GlowyColor = compoundnbt.getInt("color");
//			}
//			if(hasGrayColor(itemStack)) {
//				CompoundNBT compoundnbt = itemStack.getChildTag("MainColor");
//				model.GrayColor = compoundnbt.getInt("color");
//			}
			//model.MainColor = 15404288;
			
			this.MainColor = model.MainColor;
			this.SecondaryColor = model.SecondaryColor;
			this.ThirdColor = model.ThirdColor;
			this.WhiteColor = model.WhiteColor;
			this.GlowyColor = model.GlowyColor;
			this.GrayColor = model.GrayColor;

			return (A) model;
		}
		if(slot == EquipmentSlotType.CHEST) {
			Megaman_body2 model = new Megaman_body2(1.0f);
			model.hat.visible = armorSlot == EquipmentSlotType.HEAD;
			
			CompoundNBT compoundnbt = itemStack.getTagElement("displaymm");

		      if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {

		    	  model.MainColor = compoundnbt.getInt("MainColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {

		    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {

		    	  model.GrayColor = compoundnbt.getInt("GrayColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("FourthColor", 99)) {

		    	  model.FourthColor = compoundnbt.getInt("FourthColor");

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
			megamanarmor_bootscolor model = new megamanarmor_bootscolor(1.0f);
			model.hat.visible = armorSlot == EquipmentSlotType.HEAD;
			
			CompoundNBT compoundnbt = itemStack.getTagElement("displaymm");

		      if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {

		    	  model.MainColor = compoundnbt.getInt("MainColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {

		    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");

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
	   
	   public int getColor(ItemStack itemStackIn) {
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
    	if(slot == EquipmentSlotType.CHEST) {
        	return "megamanarmormod:textures/armor/megamanarmor_1.png";
        }
        else
        	return "megamanarmormod:textures/armor/megamanarmor_layer_1.png";
    }
	
}
