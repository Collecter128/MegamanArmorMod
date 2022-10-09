package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.megamanarmor_Boots;
import com.collecter128.megamanarmormod.client.models.megamanarmor_leggings;
import com.collecter128.megamanarmormod.client.models.megamanarmor_main;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class MegamanArmorFeet extends ArmorItem{

	public MegamanArmorFeet(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		megamanarmor_Boots model = new megamanarmor_Boots(1.0f);
		model.hat.visible = armorSlot == EquipmentSlotType.FEET;
        //((PlayerEntity) entityLiving).
        model.young = _default.young;
        model.crouching = _default.crouching;
        model.riding = _default.riding;
        model.rightArmPose = _default.rightArmPose;
        model.leftArmPose = _default.leftArmPose;
        //model.rightArmPose = entityLiving.getAttribute(attribute);
        
//        model.bipedHead.copyModelAngles(_default.bipedHead);
//        model.bipedBody.copyModelAngles(_default.bipedBody);
//        model.bipedLeftArm.copyModelAngles(_default.bipedLeftArm);
//        model.bipedRightArm.copyModelAngles(_default.bipedRightArm);
//        model.bipedLeftLeg.copyModelAngles(_default.bipedLeftLeg);
//        model.bipedLeftLeg.copyModelAngles(_default.bipedRightLeg);
        
        
        //model.setModelAttributes(_default);

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
        return "megamanarmormod:textures/armor/megamanarmor_layer_1.png";
    }
	
}
