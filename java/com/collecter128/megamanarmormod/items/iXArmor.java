package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.ixarmor_main;
import com.collecter128.megamanarmormod.client.models.megamanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.megamanarmor_main;
import com.collecter128.megamanarmormod.client.models.protomanarmor_Boots;
import com.collecter128.megamanarmormod.client.models.protomanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.protomanarmor_leggings;
import com.collecter128.megamanarmormod.client.models.protomanarmor_main;
import com.collecter128.megamanarmormod.client.models.zero_legfirsts;
import com.collecter128.megamanarmormod.client.models.zeroarmor;
import com.collecter128.megamanarmormod.client.models.zeroarmor_main;
import com.collecter128.megamanarmormod.client.models.zerofirst;
import com.collecter128.megamanarmormod.client.models.zerofirstchest;
import com.collecter128.megamanarmormod.client.models.zerofirstfeet;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class iXArmor extends ArmorItem{
	
	public int MainColorDefault = 2196050;//Main Body Color Greenish 
	public int SecondaryColorDefault = 8507304;// Weird Greenish color
	public int ThirdColorDefault = 14227325; // Purpleishcolor
	public int WhiteColorDefault = 15325417;// ???
	public int GlowyColorDefault = 14680095;// ???
	public int GrayColorDefault = 8479030;// ???
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;

	public iXArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		//if(armorSlot == EquipmentSlotType.HEAD) {
			ixarmor_main model = new ixarmor_main(1.0f, armorSlot);
			model.hat.visible = armorSlot == EquipmentSlotType.HEAD;

			model.young = _default.young;
	        model.crouching = _default.crouching;
	        model.riding = _default.riding;
	        model.rightArmPose = _default.rightArmPose;
	        model.leftArmPose = _default.leftArmPose;
        
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
	      
	      if(compoundnbt != null && compoundnbt.contains("GlowyColor", 99)) {

	    	  model.GlowyColor = compoundnbt.getInt("GlowyColor");

	      }
	      
	      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {

	    	  model.GrayColor = compoundnbt.getInt("GrayColor");

	      }
	      
	      if(compoundnbt != null && compoundnbt.contains("FourthColor", 99)) {

	    	  model.FourthColor = compoundnbt.getInt("FourthColor");

	      }
      
	      this.MainColor = model.MainColor;
			this.SecondaryColor = model.SecondaryColor;
			this.WhiteColor = model.WhiteColor;
			this.ThirdColor = model.ThirdColor;
			this.GlowyColor = model.GlowyColor;
			this.GrayColor = model.GrayColor;

        	return (A) model;
		//}
        
////		if(slot == EquipmentSlotType.HEAD) {
////			protomanarmor_main model = new protomanarmor_main(1.0f);
////			model.bipedHeadwear.showModel = armorSlot == EquipmentSlotType.HEAD;
////		}
////		if(slot == EquipmentSlotType.CHEST) {
////			protomanarmor_chestplate modelchestplate = new protomanarmor_chestplate(1.0f);
////			model.bipedHeadwear.showModel = armorSlot == EquipmentSlotType.CHEST;
////
////        modelchestplate.isChild = _default.isChild;
////        modelchestplate.isSneak = _default.isSneak;
////        modelchestplate.isSitting = _default.isSitting;
////        modelchestplate.rightArmPose = _default.rightArmPose;
////        modelchestplate.leftArmPose = _default.leftArmPose;
////
////        return (A) modelchestplate;
////		}
//		if(armorSlot == EquipmentSlotType.CHEST) {
//			ixarmor_chest model = new ixarmor_chest(1.0f ,armorSlot);
//			model.bipedHeadwear.showModel = armorSlot == EquipmentSlotType.CHEST;
//
//			model.isChild = _default.isChild;
//			model.isSneak = _default.isSneak;
//			model.isSitting = _default.isSitting;
//			model.rightArmPose = _default.rightArmPose;
//			model.leftArmPose = _default.leftArmPose;
//        
//			CompoundNBT compoundnbt = itemStack.getChildTag("displaymm");
//
//	      if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
//	    	  //CompoundNBT maincompund = itemStack.getChildTag("MainColor");
//	    	  //armorcolorer = compoundnbt.getInt("MainColor");
//	    	  model.MainColor = compoundnbt.getInt("MainColor");
//
//	      }
//	      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {
//
//	    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");
//
//	      }
//	      
//	      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {
//
//	    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");
//
//	      }
//	      
//	      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {
//
//	    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");
//
//	      }
//	      
//	      if(compoundnbt != null && compoundnbt.contains("GlowyColor", 99)) {
//
//	    	  model.GlowyColor = compoundnbt.getInt("GlowyColor");
//
//	      }
//	      
//	      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {
//
//	    	  model.GrayColor = compoundnbt.getInt("GrayColor");
//
//	      }
//      
//	      this.MainColor = model.MainColor;
//			this.SecondaryColor = model.SecondaryColor;
//			this.WhiteColor = model.WhiteColor;
//			this.ThirdColor = model.ThirdColor;
//			this.GlowyColor = model.GlowyColor;
//			this.GrayColor = model.GrayColor;
//
//        	return (A) model;
//		}
//		else {
//			ixarmor_feet model = new ixarmor_feet(1.0f);
//			model.bipedHeadwear.showModel = armorSlot == EquipmentSlotType.FEET;
//
//			model.isChild = _default.isChild;
//			model.isSneak = _default.isSneak;
//			model.isSitting = _default.isSitting;
//			model.rightArmPose = _default.rightArmPose;
//			model.leftArmPose = _default.leftArmPose;
//        
//			CompoundNBT compoundnbt = itemStack.getChildTag("displaymm");
//
//	      if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
//	    	  //CompoundNBT maincompund = itemStack.getChildTag("MainColor");
//	    	  //armorcolorer = compoundnbt.getInt("MainColor");
//	    	  model.MainColor = compoundnbt.getInt("MainColor");
//
//	      }
//	      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {
//
//	    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");
//
//	      }
//	      
//	      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {
//
//	    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");
//
//	      }
//	      
//	      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {
//
//	    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");
//
//	      }
//	      
//	      if(compoundnbt != null && compoundnbt.contains("GlowyColor", 99)) {
//
//	    	  model.GlowyColor = compoundnbt.getInt("GlowyColor");
//
//	      }
//	      
//	      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {
//
//	    	  model.GrayColor = compoundnbt.getInt("GrayColor");
//
//	      }
//      
//	      this.MainColor = model.MainColor;
//			this.SecondaryColor = model.SecondaryColor;
//			this.WhiteColor = model.WhiteColor;
//			this.ThirdColor = model.ThirdColor;
//			this.GlowyColor = model.GlowyColor;
//			this.GrayColor = model.GrayColor;
//
//        	return (A) model;
//		}
	}
	
//
   // @Override
    //public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
    //    return null;
    //}

//	@Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "megamanarmormod:textures/armor/ixarmor.png";
    }
	
}
