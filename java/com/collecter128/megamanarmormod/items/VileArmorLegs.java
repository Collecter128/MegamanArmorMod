package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.megamanarmor_Boots;
import com.collecter128.megamanarmormod.client.models.megamanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.megamanarmor_leggings;
import com.collecter128.megamanarmormod.client.models.megamanarmor_leggingscolor;
import com.collecter128.megamanarmormod.client.models.megamanarmor_main;
import com.collecter128.megamanarmormod.client.models.megamanarmor_maincolor;
import com.collecter128.megamanarmormod.client.models.vilearmor_leggings;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class VileArmorLegs extends ArmorItem{//ArmorItem
	
	public int MainColorDefault = 8728033;
	public int SecondaryColorDefault = 5066061;
	public int WhiteColorDefault = 16777215;
	public int ThirdColorDefault = 16772915;
	public int GlowyColorDefault = 16728361;
	public int GrayColorDefault = 12105912;
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;

	public VileArmorLegs(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		//if(slot == EquipmentSlotType.HEAD) {
			vilearmor_leggings model = new vilearmor_leggings(1.0f);
			model.hat.visible = armorSlot == EquipmentSlotType.HEAD;
			
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
			this.WhiteColor = model.WhiteColor;
			this.ThirdColor = model.ThirdColor;
			this.GlowyColor = model.GlowyColor;
			this.GrayColor = model.GrayColor;

			return (A) model;
		//}
//		if(slot == EquipmentSlotType.CHEST) {
//			megamanarmor_chestplate model = new megamanarmor_chestplate(1.0f);
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
//		else {
//			megamanarmor_Boots model = new megamanarmor_Boots(1.0f);
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
	}
	
//
   // @Override
    //public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
    //    return null;
    //}

//	@Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "megamanarmormod:textures/armor/vilearmor2.png";
    }
	
}
