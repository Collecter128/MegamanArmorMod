package com.collecter128.megamanarmormod.client.models;

import javax.annotation.Nullable;

import com.collecter128.megamanarmormod.items.MegamanArmorFeet;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class megamanarmor_Boots extends BipedModel {
	//private final ModelRenderer Head;
	//private final ModelRenderer Body;
	//private final ModelRenderer RightArm;
	//private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public megamanarmor_Boots(float modelSize) {
		super(modelSize);
		texWidth = 64;
		texHeight = 71;

//		Head = new ModelRenderer(this);
//		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
//		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//		Head.setTextureOffset(34, 9).addBox(5.0643F, -3.9451F, -0.5752F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Head.setTextureOffset(49, 9).addBox(-5.8938F, -3.8448F, -1.5287F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Head.setTextureOffset(42, 8).addBox(-1.0F, -7.4829F, -5.54F, 2.0F, 2.0F, 1.0F, 0.25F, false);
//		Head.setTextureOffset(16, 32).addBox(-0.6552F, -9.5707F, -4.5F, 2.0F, 6.0F, 10.0F, 0.25F, false);

		//Body = new ModelRenderer(this);
		//Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		//Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		//RightArm = new ModelRenderer(this);
		//RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		//setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		//RightArm.setTextureOffset(40, 40).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		//RightArm.setTextureOffset(40, 56).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		//LeftArm = new ModelRenderer(this);
		//LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		//setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		//LeftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		//LeftArm.setTextureOffset(40, 32).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		RightLeg.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		LeftLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		//Head.render(matrixStack, buffer, packedLight, packedOverlay);
		//Body.render(matrixStack, buffer, packedLight, packedOverlay);
		//RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		//LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		this.RightLeg.copyFrom(this.rightLeg);
		this.LeftLeg.copyFrom(this.leftLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		//this.func_241739_a_(matrixStack, buffer, entitylivingbaseIn, EquipmentSlotType.FEET, packedLightIn, this.func_241736_a_(EquipmentSlotType.FEET));
	}
	
//	public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
//	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
//	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.LEGS, packedLightIn, this.func_241736_a_(EquipmentSlotType.LEGS));
//	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.FEET, packedLightIn, this.func_241736_a_(EquipmentSlotType.FEET));
//	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.HEAD, packedLightIn, this.func_241736_a_(EquipmentSlotType.HEAD));
//	   }
	
	//public void render(MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
		//RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		//LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	  // }
	
//	   private void func_241739_a_(MatrixStack p_241739_1_, IRenderTypeBuffer Irender, T entity, EquipmentSlotType equipslottype, int p_241739_5_, A armormodel) {
//		      ItemStack itemstack = entity.getItemStackFromSlot(equipslottype);
//		      if (itemstack.getItem() instanceof ArmorItem) {
//		         ArmorItem armoritem = (ArmorItem)itemstack.getItem();
//		         if (armoritem.getEquipmentSlot() == equipslottype) {
//		            armormodel = getArmorModelHook(entity, itemstack, equipslottype, armormodel);
//		            this.getEntityModel().setModelAttributes(armormodel);
//		            this.setModelSlotVisible(armormodel, equipslottype);
//		            boolean flag = this.isLegSlot(equipslottype);
//		            boolean flag1 = itemstack.hasEffect();
//		            if (armoritem instanceof net.minecraft.item.IDyeableArmorItem) {
//		               int i = ((net.minecraft.item.IDyeableArmorItem)armoritem).getColor(itemstack);
//		               float f = (float)(i >> 16 & 255) / 255.0F;
//		               float f1 = (float)(i >> 8 & 255) / 255.0F;
//		               float f2 = (float)(i & 255) / 255.0F;
//		               this.func_241738_a_(p_241739_1_, Irender, p_241739_5_, flag1, armormodel, f, f1, f2, this.getArmorResource(entity, itemstack, equipslottype, null));
//		               this.func_241738_a_(p_241739_1_, Irender, p_241739_5_, flag1, armormodel, 1.0F, 1.0F, 1.0F, this.getArmorResource(entity, itemstack, equipslottype, "overlay"));
//		            } else {
//		               this.func_241738_a_(p_241739_1_, Irender, p_241739_5_, flag1, armormodel, 1.0F, 1.0F, 1.0F, this.getArmorResource(entity, itemstack, equipslottype, null));
//		            }
//
//		         }
//		      }
//		   }

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}


}