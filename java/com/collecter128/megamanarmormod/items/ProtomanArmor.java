package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.megamanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.megamanarmor_main;
import com.collecter128.megamanarmormod.client.models.protomanarmor_Boots;
import com.collecter128.megamanarmormod.client.models.protomanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.protomanarmor_leggings;
import com.collecter128.megamanarmormod.client.models.protomanarmor_main;
import com.collecter128.megamanarmormod.client.models.protomanarmor_maincolor;

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

public class ProtomanArmor extends ArmorItem{
	
	public int MainColorDefault = 16331285;//Main Body Color Protoman orangishRed
	public int SecondaryColorDefault = 9737364;//Secondary Color black?
	public int WhiteColorDefault = 15855562;
	public int ThirdColorDefault = 16765460;//Scarf
	public int GlowyColorDefault = 2359060;//Glow Green Bits
	public int GrayColorDefault = 12105912;
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;

	public ProtomanArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		protomanarmor_maincolor model = new protomanarmor_maincolor(1.0f, EquipmentSlotType.HEAD);
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
		this.ThirdColor = model.ThirdColor;
		this.WhiteColor = model.WhiteColor;
		this.GlowyColor = model.GlowyColor;
		this.GrayColor = model.GrayColor;

        return (A) model;
        
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
        return "megamanarmormod:textures/armor/protomanarmor1.png";
    }
	
}
