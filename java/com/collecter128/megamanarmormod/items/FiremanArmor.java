package com.collecter128.megamanarmormod.items;

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

public class FiremanArmor extends ArmorItem{
	
	public int MainColorDefault = 16712965;//red
	public int SecondaryColorDefault = 12237498;//gray
	public int WhiteColorDefault = 15921906;//Basic White
	public int ThirdColorDefault = 16767749; //yellow(not used?)
	public int GlowyColorDefault = 16759813;//orange
	public int GrayColorDefault = 15592941;//also gray
	public int FourthColorDefault = 12237498;//gray again
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;
	public int FourthColor = FourthColorDefault;

	public FiremanArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
	if(armorSlot == EquipmentSlotType.HEAD) {
		fireman model = new fireman(1.0f, armorSlot);
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
		fireman model = new fireman(1.0f, armorSlot);
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
		fireman_legs model = new fireman_legs(1.0f);
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
		fireman model = new fireman(1.0f, armorSlot);
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
        return "megamanarmormod:textures/armor/fireman.png";
    }
	
}
