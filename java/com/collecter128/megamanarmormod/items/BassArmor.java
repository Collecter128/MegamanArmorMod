package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.bassarmor_bootscolor;
import com.collecter128.megamanarmormod.client.models.bassarmor_chestcolor;
import com.collecter128.megamanarmormod.client.models.bassarmor_color;
import com.collecter128.megamanarmormod.client.models.bassarmor_main;

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

public class BassArmor extends ArmorItem{
	
	public int MainColorDefault = 5855577;//Main Body Color black
	public int SecondaryColorDefault = 16763674;//Secondary
	public int WhiteColorDefault = 16777215; //white 
	public int ThirdColorDefault = 16771098;//golden
	public int GlowyColorDefault = 4032511;//
	public int GrayColorDefault = 13750737;//
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;

	public BassArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		if(slot == EquipmentSlotType.HEAD) {
			bassarmor_color model = new bassarmor_color(1.0f);
			model.hat.visible = armorSlot == EquipmentSlotType.HEAD;
	
			model.young = _default.young;
	        model.crouching = _default.crouching;
	        model.riding = _default.riding;
	        model.rightArmPose = _default.rightArmPose;
	        model.leftArmPose = _default.leftArmPose;
	        
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
		      
				this.MainColor = model.MainColor;
				this.SecondaryColor = model.SecondaryColor;
				this.ThirdColor = model.ThirdColor;
				this.WhiteColor = model.WhiteColor;
				this.GlowyColor = model.GlowyColor;
				this.GrayColor = model.GrayColor;
	
	        return (A) model;
		}
        
		else if(slot == EquipmentSlotType.CHEST) {
			bassarmor_chestcolor model = new bassarmor_chestcolor(1.0f);
			model.hat.visible = armorSlot == EquipmentSlotType.CHEST;

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
				this.ThirdColor = model.ThirdColor;
				this.WhiteColor = model.WhiteColor;
				this.GlowyColor = model.GlowyColor;
				this.GrayColor = model.GrayColor;

	        return (A) model;
		}
		

		
		else {
			bassarmor_bootscolor model = new bassarmor_bootscolor(1.0f);
			model.hat.visible = armorSlot == EquipmentSlotType.FEET;

//				if(slot == EquipmentSlotType.LEGS) {
//					protomanarmor_leggings model = new protomanarmor_leggings(1.0f);
//					model.bipedHeadwear.showModel = armorSlot == EquipmentSlotType.CHEST;
//				}

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
				this.ThirdColor = model.ThirdColor;
				this.WhiteColor = model.WhiteColor;
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
        return "megamanarmormod:textures/armor/bassarmor.png";
    }
	
}
