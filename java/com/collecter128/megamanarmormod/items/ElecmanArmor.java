package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.elecman_legs;
import com.collecter128.megamanarmormod.client.models.elecmanarmor;
import com.collecter128.megamanarmormod.client.models.firstarmor_legs;
import com.collecter128.megamanarmormod.client.models.firstarmorx_boots;
import com.collecter128.megamanarmormod.client.models.firstarmorx_chest;
import com.collecter128.megamanarmormod.client.models.firstarmorx_main;
import com.collecter128.megamanarmormod.client.models.legendsarmor_legs;
import com.collecter128.megamanarmormod.client.models.legendsarmor_main;
import com.collecter128.megamanarmormod.client.models.megamanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.megamanarmor_main;
import com.collecter128.megamanarmormod.client.models.protomanarmor_Boots;
import com.collecter128.megamanarmormod.client.models.protomanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.protomanarmor_leggings;
import com.collecter128.megamanarmormod.client.models.protomanarmor_main;
import com.collecter128.megamanarmormod.client.models.xarmor_main;
import com.collecter128.megamanarmormod.client.models.xarmor_maincolor;
import com.collecter128.megamanarmormod.client.models.zeroarmor_main;

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

public class ElecmanArmor extends ArmorItem{
	
	public int MainColorDefault = 16767242;//yellow
	public int SecondaryColorDefault = 6050406;//black/purple
	public int WhiteColorDefault = 15921906;//Basic White
	public int ThirdColorDefault = 16729861; //red
	public int GlowyColorDefault = 12317952;//lime green
	public int GrayColorDefault = 10329770;//bluish gray
	public int FourthColorDefault = 6050406;//black/purple  7157; //blue?
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;
	public int FourthColor = FourthColorDefault;

	public ElecmanArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
	if(armorSlot == EquipmentSlotType.HEAD) {
		elecmanarmor model = new elecmanarmor(1.0f, armorSlot);
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
		elecmanarmor model = new elecmanarmor(1.0f, armorSlot);
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
		elecman_legs model = new elecman_legs(1.0f);
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
		elecmanarmor model = new elecmanarmor(1.0f, armorSlot);
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
        return "megamanarmormod:textures/armor/elecman.png";
    }
	
}
