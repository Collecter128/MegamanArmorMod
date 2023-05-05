package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.axlarmor_leggings;
import com.collecter128.megamanarmormod.client.models.axlarmor_main;
import com.collecter128.megamanarmormod.client.models.badboxart;
import com.collecter128.megamanarmormod.client.models.badboxart_legs;

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

public class BadBoxArtArmor extends ArmorItem{
	
	public int MainColorDefault = 342773;//Main Body Coloor blue
	public int SecondaryColorDefault = 379125;//Secondary Light blue
	public int ThirdColorDefault = 15714847; //wierd yellow
	public int WhiteColorDefault = 15395563;//
	public int GlowyColorDefault = 15714847;// yellow
	public int GrayColorDefault = 11516613;//
	public int FourthColorDefault = 7249368;//???
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;
	public int FourthColor = FourthColorDefault;

	public BadBoxArtArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		if(armorSlot != EquipmentSlotType.LEGS) {
			badboxart model = new badboxart(1.0f, armorSlot);
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
	      if(compoundnbt != null && compoundnbt.contains("FourthColor", 99)) {
	    	  model.FourthColor = compoundnbt.getInt("FourthColor");

	      }
	      else
	    	  itemStack.getOrCreateTagElement("displaymm").putInt("FourthColor", FourthColorDefault);
	      
		this.MainColor = model.MainColor;
		this.SecondaryColor = model.SecondaryColor;
		this.WhiteColor = model.WhiteColor;
		this.ThirdColor = model.ThirdColor;
		this.GlowyColor = model.GlowyColor;
		this.GrayColor = model.GrayColor;

        return (A) model;
		}
		else {
			badboxart_legs model = new badboxart_legs(1.0f);
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

//	@Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "megamanarmormod:textures/armor/badboxart.png";
    }
	
}
