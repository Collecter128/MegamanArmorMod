package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.firstarmor_legs;
import com.collecter128.megamanarmormod.client.models.firstarmorx_boots;
import com.collecter128.megamanarmormod.client.models.firstarmorx_chest;
import com.collecter128.megamanarmormod.client.models.firstarmorx_main;
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

public class FirstArmor extends ArmorItem{
	
	public int MainColorDefault = 2781423;
	public int SecondaryColorDefault = 5752303;
	public int WhiteColorDefault = 16777215;
	public int ThirdColorDefault = 16642337; //Yellow Bits
	public int GlowyColorDefault = 16468504;
	public int GrayColorDefault = 16777215;
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;

	public FirstArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
	if(armorSlot == EquipmentSlotType.HEAD) {
		firstarmorx_main model = new firstarmorx_main(1.0f);
		model.hat.visible = armorSlot == EquipmentSlotType.HEAD;
		
		CompoundNBT compoundnbt = itemStack.getTagElement("displaymm");

		if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
	    	  model.MainColor = compoundnbt.getInt("MainColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("MainColor", MainColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {
	    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("SecondaryColor", SecondaryColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {
	    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("WhiteColor", WhiteColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {
	    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("ThirdColor", ThirdColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("GlowyColor", 99)) {
	    	  model.GlowyColor = compoundnbt.getInt("GlowyColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("GlowyColor", GlowyColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {
	    	  model.GrayColor = compoundnbt.getInt("GrayColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("GrayColor", GrayColorDefault);
	      

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
		firstarmorx_chest model = new firstarmorx_chest(1.0f);
		model.hat.visible = armorSlot == EquipmentSlotType.HEAD;
		
		CompoundNBT compoundnbt = itemStack.getTagElement("displaymm");

		if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
	    	  model.MainColor = compoundnbt.getInt("MainColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("MainColor", MainColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {
	    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("SecondaryColor", SecondaryColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {
	    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("WhiteColor", WhiteColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {
	    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("ThirdColor", ThirdColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("GlowyColor", 99)) {
	    	  model.GlowyColor = compoundnbt.getInt("GlowyColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("GlowyColor", GlowyColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {
	    	  model.GrayColor = compoundnbt.getInt("GrayColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("GrayColor", GrayColorDefault);
	      

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
		firstarmor_legs model = new firstarmor_legs(1.0f);
		model.hat.visible = armorSlot == EquipmentSlotType.HEAD;
		
		CompoundNBT compoundnbt = itemStack.getTagElement("displaymm");

		if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
	    	  model.MainColor = compoundnbt.getInt("MainColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("MainColor", MainColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {
	    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("SecondaryColor", SecondaryColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {
	    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("WhiteColor", WhiteColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {
	    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("ThirdColor", ThirdColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("GlowyColor", 99)) {
	    	  model.GlowyColor = compoundnbt.getInt("GlowyColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("GlowyColor", GlowyColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {
	    	  model.GrayColor = compoundnbt.getInt("GrayColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("GrayColor", GrayColorDefault);
	      

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
		firstarmorx_boots model = new firstarmorx_boots(1.0f);
		model.hat.visible = armorSlot == EquipmentSlotType.HEAD;
		
		CompoundNBT compoundnbt = itemStack.getTagElement("displaymm");

		if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
	    	  model.MainColor = compoundnbt.getInt("MainColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("MainColor", MainColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {
	    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("SecondaryColor", SecondaryColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {
	    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("WhiteColor", WhiteColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {
	    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("ThirdColor", ThirdColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("GlowyColor", 99)) {
	    	  model.GlowyColor = compoundnbt.getInt("GlowyColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("GlowyColor", GlowyColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {
	    	  model.GrayColor = compoundnbt.getInt("GrayColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("GrayColor", GrayColorDefault);
	      

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
        return "megamanarmormod:textures/armor/firstarmor.png";
    }
	
}
