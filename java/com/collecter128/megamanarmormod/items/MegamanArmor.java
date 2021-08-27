package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.megamanarmor_Boots;
import com.collecter128.megamanarmormod.client.models.megamanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.megamanarmor_leggings;
import com.collecter128.megamanarmormod.client.models.megamanarmor_main;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class MegamanArmor extends ArmorItem{//ArmorItem

	public MegamanArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		if(slot == EquipmentSlotType.HEAD) {
			megamanarmor_main model = new megamanarmor_main(1.0f);
			model.bipedHeadwear.showModel = armorSlot == EquipmentSlotType.HEAD;
        
			model.isChild = _default.isChild;
			model.isSneak = _default.isSneak;
			model.isSitting = _default.isSitting;
			model.rightArmPose = _default.rightArmPose;
			model.leftArmPose = _default.leftArmPose;

			return (A) model;
		}
		if(slot == EquipmentSlotType.CHEST) {
			megamanarmor_chestplate model = new megamanarmor_chestplate(1.0f);
			model.bipedHeadwear.showModel = armorSlot == EquipmentSlotType.HEAD;
        
			model.isChild = _default.isChild;
			model.isSneak = _default.isSneak;
			model.isSitting = _default.isSitting;
			model.rightArmPose = _default.rightArmPose;
			model.leftArmPose = _default.leftArmPose;

			return (A) model;
		}
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
		else {
			megamanarmor_Boots model = new megamanarmor_Boots(1.0f);
			model.bipedHeadwear.showModel = armorSlot == EquipmentSlotType.HEAD;
        
			model.isChild = _default.isChild;
			model.isSneak = _default.isSneak;
			model.isSitting = _default.isSitting;
			model.rightArmPose = _default.rightArmPose;
			model.leftArmPose = _default.leftArmPose;

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
        return "megamanarmormod:textures/armor/megamanarmor_layer_1.png";
    }
	
}
