package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.bombman;
import com.collecter128.megamanarmormod.client.models.bombman_legs;
import com.collecter128.megamanarmormod.client.models.cutman;
import com.collecter128.megamanarmormod.client.models.cutman_legs;
import com.collecter128.megamanarmormod.client.models.elecman_legs;
import com.collecter128.megamanarmormod.client.models.elecmanarmor;
import com.collecter128.megamanarmormod.client.models.fireman;
import com.collecter128.megamanarmormod.client.models.fireman_legs;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CutmanArmor extends ArmorItem{
	
	public int MainColorDefault = 16744714;//orange
	public int SecondaryColorDefault = 16777215;//white 10598366 Gray teal
	public int WhiteColorDefault = 16777215;//White
	public int ThirdColorDefault = 16777215; //white
	public int GlowyColorDefault = 16580362;//yellow
	public int GrayColorDefault = 15592941;//gray
	public int FourthColorDefault = 15592941;//gray
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;
	public int FourthColor = FourthColorDefault;

	public CutmanArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
	if(armorSlot == EquipmentSlotType.HEAD) {
		cutman model = new cutman(1.0f, armorSlot);
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
	      
	      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {

	    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");

	      }
	      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {

	    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");

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
	
	else if(armorSlot == EquipmentSlotType.CHEST) {
		cutman model = new cutman(1.0f, armorSlot);
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
	      
	      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {

	    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");

	      }
	      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {

	    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");

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
	else if(armorSlot == EquipmentSlotType.LEGS) {
		cutman_legs model = new cutman_legs(1.0f);
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
	      
	      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {

	    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");

	      }
	      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {

	    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");

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
	else{
		cutman model = new cutman(1.0f, armorSlot);
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
	      
	      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {

	    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");

	      }
	      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {

	    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");

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
	
//
   // @Override
    //public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
    //    return null;
    //}

//	@Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "megamanarmormod:textures/armor/cutman.png";
    }
	
}
