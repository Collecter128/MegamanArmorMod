package com.collecter128.megamanarmormod.items;

import javax.annotation.Nullable;

import com.collecter128.megamanarmormod.client.models.megamanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.megamanarmor_main;
import com.collecter128.megamanarmormod.client.models.protomanarmor_Boots;
import com.collecter128.megamanarmormod.client.models.protomanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.protomanarmor_leggings;
import com.collecter128.megamanarmormod.client.models.protomanarmor_main;
import com.collecter128.megamanarmormod.client.models.xarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.xarmorclear_chestplate;
import com.collecter128.megamanarmormod.client.models.zeroarmor_chestplate;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class XArmorClearChest extends ArmorItem{

	public XArmorClearChest(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		xarmorclear_chestplate model = new xarmorclear_chestplate(null, 1.0f, 16, 74, 114);
		RenderType type = RenderType.entityTranslucent(new ResourceLocation("megamanarmormod:textures/armor/xarmorclear1.png"));
		//xarmorclear_chestplate model = new xarmorclear_chestplate(RenderType::entityTranslucent(new ResourceLocation("megamanarmormod:textures/armor/xarmorclear1.png")), 1.0f, 16, 74, 114);
		//xarmorclear_chestplate model = new xarmorclear_chestplate(RenderType::getEntityTranslucentCull, 1.0f, 16, 74, 114);
		model.hat.visible = armorSlot == EquipmentSlotType.CHEST;
		//IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEnergySwirl(thi t), f * 0.01F));
       // entitymodel.setRotationAngles(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        //entitymodel.render(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 0.5F, 0.5F, 0.5F, 1.0F);
		model.young = _default.young;
        model.crouching = _default.crouching;
        model.riding = _default.riding;
        model.rightArmPose = _default.rightArmPose;
        model.leftArmPose = _default.leftArmPose;
        //model.getRenderType();
        //RenderType.getTranslucent();
        //RenderType.translucent();
        //model.renderType(RenderType.entityTranslucent(new ResourceLocation("megamanarmormod:textures/armor/xarmorclear1.png")));
        RenderType.entityTranslucent(new ResourceLocation("megamanarmormod:textures/armor/xarmorclear1.png"));
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
    	return "megamanarmormod:textures/armor/xarmorclear1.png";
    }
    
//    public ResourceLocation getArmorResource(net.minecraft.entity.Entity entity, ItemStack stack, EquipmentSlotType slot, @Nullable String type) {
//        ArmorItem item = (ArmorItem)stack.getItem();
//        String texture = item.getArmorMaterial().getName();
//        String domain = "minecraft";
//        int idx = texture.indexOf(':');
//        if (idx != -1) {
//           domain = texture.substring(0, idx);
//           texture = texture.substring(idx + 1);
//        }
//        String s1 = String.format("%s:textures/models/armor/%s_layer_%d%s.png", domain, texture, (isLegSlot(slot) ? 2 : 1), type == null ? "" : String.format("_%s", type));
//
//        s1 = net.minecraftforge.client.ForgeHooksClient.getArmorTexture(entity, stack, s1, slot, type);
//        ResourceLocation resourcelocation = ARMOR_TEXTURE_RES_MAP.get(s1);
//
//        if (resourcelocation == null) {
//           resourcelocation = new ResourceLocation(s1);
//           ARMOR_TEXTURE_RES_MAP.put(s1, resourcelocation);
//        }
//
//        return resourcelocation;
//     }
	
}
