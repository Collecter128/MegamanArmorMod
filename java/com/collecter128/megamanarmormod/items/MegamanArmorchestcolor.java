package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.megamanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.megamanarmor_chestplatecolorold;
import com.collecter128.megamanarmormod.client.models.megamanarmor_main;
import com.collecter128.megamanarmormod.core.Imorecolorfularmor;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MegamanArmorchestcolor extends DyeableArmorItem implements IDyeableArmorItem{//implements Imorecolorfularmor

	int Colors;
	
	public MegamanArmorchestcolor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		megamanarmor_chestplatecolorold model = new megamanarmor_chestplatecolorold(1.0f);
		//megamanarmor_chestplatecolorTest2 model = new megamanarmor_chestplatecolorTest2(null, 1.0f, knockbackResistance, damageReduceAmount, damageReduceAmount);
		//megamanarmor_chestplatecolorTest1 model = new megamanarmor_chestplatecolorTest1(IEntityRenderer<T, M> p_i50936_1_, A leggingsmodel, megamanarmor_chestplatecolorTest2);
		model.hat.visible = armorSlot == EquipmentSlotType.CHEST;
        //model.bipedBody..addChild(_default.bipedBody);
        //model.bipedRightArm.addChild(_default.bipedRightArm);
        //model.bipedBody = new megamanarmor_chestplate(0f).Body;
        //model.bipedRightArm = new megamanarmor_chestplate(0f).RightArm;
        //model.bipedLeftArm = new megamanarmor_chestplate(0f).LeftArm;
        ArmorItem armoritem = (ArmorItem)itemStack.getItem();
        int i = ((net.minecraft.item.IDyeableArmorItem)armoritem).getColor(itemStack);
        model.Color = i;
        model.body = new megamanarmor_chestplate(0f).Body;
        model.rightArm = new megamanarmor_chestplate(0f).RightArm;
        model.leftArm = new megamanarmor_chestplate(0f).LeftArm;
        //model.bipedLeftArm.rotateAngleX = entityLiving.
        //model.bipedRightArm.addChild(entityLiving.);
        //model.bipedLeftArm.addChild(_default.bipedLeftArm);
        //playermodel.rightArmPose
        //armorModel.bipedRightArm = new NameOfModelHere().NameOfRightArmHere;
        //armorModel.bipedLeftArm = new NameOfModelHere().NameOfLeftArmHere;
        
      // model.bipedBody.addChild(new megamanarmor_chestplate.);
      //model.bipedRightArm.showModel = armorSlot == EquipmentSlotType.CHEST;


        model.young = _default.young;
        model.crouching = _default.crouching;
        model.riding = _default.riding;
        model.rightArmPose = _default.rightArmPose;
        model.leftArmPose = _default.leftArmPose;
      //model.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
      //setColor(itemStack, 6);
        //        model.isChild = _default.isChild;
//        model.isSneak = entityLiving.isSneaking();
//        model.isSitting = _default.isSitting;
//model.rightArmPose = entityLiving.;
//        //model.leftArmPose = _default.leftArmPose;
		
      
		
		//New Code below Here
		
//		megamanarmor_chestplate model = new megamanarmor_chestplate(1.0f);
//        model.bipedBody.showModel = armorSlot == EquipmentSlotType.CHEST;
//
//       // model.bipedBody.addChild(new megamanarmor_chestplate.);
//        model.bipedRightArm.showModel = armorSlot == EquipmentSlotType.CHEST;
//        //model.bipedLeftArm = new ModelHumanoid().LeftArm
//      //model.bipedLeftArm = new megamanarmor_chestplate().LeftArm
//        model.isChild = _default.isChild;
//        model.isSneak = _default.isSneak;
//        model.isSitting = _default.isSitting;
//        model.rightArmPose = _default.rightArmPose;
//        model.leftArmPose = _default.leftArmPose;
      
//      ItemStack itemstack = entityLiving.getItemStackFromSlot(equipslottype);
//      if (itemstack.getItem() instanceof ArmorItem) {
//    	  ColorfulArmor armoritem = (ColorfulArmor)itemstack.getItem();
//         if (armoritem.getEquipmentSlot() == EquipmentSlotType.CHEST) {
//        	 //Body = getArmorModelHook(entity, itemstack, equipslottype, this.);
//            //this.getEntityModel().setModelAttributes(armormodel);
//            boolean flag1 = itemstack.hasEffect();
//           // if (armoritem instanceof net.minecraft.item.IDyeableArmorItem) {
//               int i = armoritem.getColor(itemstack);//Get Color, or default color
//               float fred = (float)(i >> 16 & 255) / 255.0F;
//               float fblue = (float)(i >> 8 & 255) / 255.0F;
//               float fgreen = (float)(i & 255) / 255.0F;
//               this.func_241738_a_(matrixStack, Irender, packedLight, flag1, model, fred, fblue, fgreen, this.getArmorTexture(itemstack, entityLiving, EquipmentSlotType.CHEST, null));//Main Blue Part
//			   this.func_241738_a_(matrixStack, Irender, packedLight, flag1, model, fred, fblue, fgreen, this.getArmorTexture(itemstack, entityLiving, EquipmentSlotType.CHEST, null));//Secondary Blue Part
//               this.func_241738_a_(matrixStack, Irender, packedLight, flag1, model, 1.0F, 1.0F, 1.0F, this.getArmorTexture(itemstack, entityLiving, EquipmentSlotType.CHEST, "overlay")); //Everything else
        return (A) model;
	}
	
//	public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, LivingEntity entityLiving, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
//	//@Override
//	//public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
////		this.Body.copyModelAngles(this.bipedBody);
////		this.RightArm.copyModelAngles(this.bipedRightArm);
////		this.LeftArm.copyModelAngles(this.bipedLeftArm);
////		Body.render(matrixStack, buffer, packedLight, packedOverlay);
////		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
////		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
//		//this.func_241739_a_(matrixStack, buffer, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
//		this.func_241739_a_(matrixStackIn, bufferIn, entityLiving, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
//	}
//	
//	   private void func_241739_a_(MatrixStack p_241739_1_, IRenderTypeBuffer Irender, LivingEntity entity, EquipmentSlotType equipslottype, int p_241739_5_, A armormodel) {
//		      ItemStack itemstack = entity.getItemStackFromSlot(equipslottype);
//		      if (itemstack.getItem() instanceof ArmorItem) {
//		         ArmorItem armoritem = (ArmorItem)itemstack.getItem();
//		         if (armoritem.getEquipmentSlot() == equipslottype) {
//		            armormodel = getArmorModelHook(entity, itemstack, equipslottype, armormodel);
//		            entity.getEntity().setModelAttributes(armormodel);
//		            this.setModelSlotVisible(armormodel, equipslottype);
//		            //boolean flag = this.isLegSlot(equipslottype);
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
//	   
//	   private void func_241738_a_(MatrixStack p_241738_1_, IRenderTypeBuffer p_241738_2_, int p_241738_3_, boolean p_241738_5_, A p_241738_6_, float p_241738_8_, float p_241738_9_, float p_241738_10_, ResourceLocation armorResource) {
//		      IVertexBuilder ivertexbuilder = ItemRenderer.getArmorVertexBuilder(p_241738_2_, RenderType.getArmorCutoutNoCull(armorResource), false, p_241738_5_);
//		      p_241738_6_.render(p_241738_1_, ivertexbuilder, p_241738_3_, OverlayTexture.NO_OVERLAY, p_241738_8_, p_241738_9_, p_241738_10_, 1.0F);
//		   }
	
//
   // @Override
    //public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
    //    return null;
    //}

////	@Nullable
//    @Override
//    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
//        return "megamanarmormod:textures/armor/megamanarmor_layer_1.png";
//    }

	@Override
	public boolean hasCustomColor(ItemStack stack) {
		return IDyeableArmorItem.super.hasCustomColor(stack);
	}

	@Override
	public int getColor(ItemStack stack) {
	      CompoundNBT compoundnbt = stack.getTagElement("display");
	      return compoundnbt != null && compoundnbt.contains("color", 99) ? compoundnbt.getInt("color") : 1581819;
	}

	@Override
	public void clearColor(ItemStack stack) {
		IDyeableArmorItem.super.clearColor(stack);
	}

	@Override
	public void setColor(ItemStack stack, int color) {
		IDyeableArmorItem.super.setColor(stack, color);
	}
	
}
