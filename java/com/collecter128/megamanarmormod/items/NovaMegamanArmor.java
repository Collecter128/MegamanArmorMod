package com.collecter128.megamanarmormod.items;

import javax.annotation.Nonnull;

import com.collecter128.megamanarmormod.client.models.newarmor_leggings;
import com.collecter128.megamanarmormod.client.models.newarmor_main;
import com.collecter128.megamanarmormod.client.models.novamegaman_leggings;
import com.collecter128.megamanarmormod.client.models.novamegaman_main;
import com.collecter128.megamanarmormod.client.models.protomanNovaarmor_leggings;
import com.collecter128.megamanarmormod.client.models.protomanNovaarmor_main;
import com.collecter128.megamanarmormod.client.models.protomanarmor_Boots;
import com.collecter128.megamanarmormod.client.models.protomanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.protomanarmor_leggings;
import com.collecter128.megamanarmormod.client.models.protomanarmor_main;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class NovaMegamanArmor extends ArmorItem{
	
	public int MainColorDefault = 16100352;//Main Body Color Gold
	public int SecondaryColorDefault = 4931443;//Secondary really dark blue
	public int ThirdColorDefault =  13775416; //Dark Red
	public int WhiteColorDefault = 12828878;//Silvery
	public int GlowyColorDefault = 13775416;//Dark Red
	public int GrayColorDefault = 12828878;//Silvery
	public int FourthColorDefault = 2728758;//Dark Green
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;
	public int FourthColor = FourthColorDefault;

	public NovaMegamanArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		if(armorSlot != EquipmentSlotType.LEGS) {
			novamegaman_main model = new novamegaman_main(1.0f, armorSlot);
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
		}
		else {
			novamegaman_leggings model = new novamegaman_leggings(1.0f);
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
		      
	      
			this.MainColor = model.MainColor;
			this.SecondaryColor = model.SecondaryColor;
			this.WhiteColor = model.WhiteColor;
			this.ThirdColor = model.ThirdColor;
			this.GlowyColor = model.GlowyColor;
			this.GrayColor = model.GrayColor;

	        return (A) model;
			}
        
//		if(slot == EquipmentSlotType.HEAD) {
//			protomanarmor_main model = new protomanarmor_main(1.0f);
//			model.bipedHeadwear.showModel = armorSlot == EquipmentSlotType.HEAD;
//		}
//		if(slot == EquipmentSlotType.CHEST) {
//			protomanarmor_chestplate modelchestplate = new protomanarmor_chestplate(1.0f);
//			model.bipedHeadwear.showModel = armorSlot == EquipmentSlotType.CHEST;
//
//        modelchestplate.isChild = _default.isChild;
//        modelchestplate.isSneak = _default.isSneak;
//        modelchestplate.isSitting = _default.isSitting;
//        modelchestplate.rightArmPose = _default.rightArmPose;
//        modelchestplate.leftArmPose = _default.leftArmPose;
//
//        return (A) modelchestplate;
//		}
	}
	
//
   // @Override
    //public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
    //    return null;
    //}
	
	 @Override
	    public boolean makesPiglinsNeutral(@Nonnull ItemStack stack, @Nonnull LivingEntity wearer) {
	        return true;
	    }

//	@Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "megamanarmormod:textures/armor/nova_megamanarmor.png";
    }
	
}
