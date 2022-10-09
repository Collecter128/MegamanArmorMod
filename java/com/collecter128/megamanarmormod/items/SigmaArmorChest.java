package com.collecter128.megamanarmormod.items;



import com.collecter128.megamanarmormod.client.models.sigma_chestcolor;
import com.collecter128.megamanarmormod.client.models.sigmaarmor_chestplate;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class SigmaArmorChest extends ArmorItem{
	
	public int MainColorDefault = 4574259;//Main Body Color 
	public int SecondaryColorDefault = 3168981; //blue bits
	public int WhiteColorDefault =  16777215;
	public int ThirdColorDefault = 13401651; //Brown
	public int GlowyColorDefault = 14691113; // It's red
	public int GrayColorDefault = 11322824; //Slightly blue
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;

	public SigmaArmorChest(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		sigma_chestcolor model = new sigma_chestcolor(1.0f);
		model.hat.visible = armorSlot == EquipmentSlotType.CHEST;

		CompoundNBT compoundnbt = itemStack.getTagElement("displaymm");

	      if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {

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

	      model.young = _default.young;
	        model.crouching = _default.crouching;
	        model.riding = _default.riding;
	        model.rightArmPose = _default.rightArmPose;
	        model.leftArmPose = _default.leftArmPose;
      
		this.MainColor = model.MainColor;
		this.SecondaryColor = model.SecondaryColor;
		this.ThirdColor = model.ThirdColor;
		this.WhiteColor = model.WhiteColor;
		this.GlowyColor = model.GlowyColor;
		this.GrayColor = model.GrayColor;

      return (A) model;

	}
	
//
   // @Override
    //public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
    //    return null;
    //}

//	@Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "megamanarmormod:textures/armor/sigma1.png";
    }
	
}
