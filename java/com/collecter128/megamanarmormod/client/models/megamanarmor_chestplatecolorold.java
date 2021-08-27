package com.collecter128.megamanarmormod.client.models;

import java.util.Map;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.collecter128.megamanarmormod.items.MegamanArmorchestcolor;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.vertex.VertexBuilderUtils;

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

//<T extends LivingEntity, M extends BipedModel<T>, A extends BipedModel<T>> extends LayerRenderer<T, M>
public class megamanarmor_chestplatecolorold extends BipedModel {//extends BipedModel //<T extends LivingEntity, M extends BipedModel<T>, A extends BipedModel<T>> extends LayerRenderer<T, M>
	
	//private final ModelRenderer Head;
	public final ModelRenderer Body;
	public final ModelRenderer RightArm;
	public final ModelRenderer LeftArm;
	public int Color;
	//private final ModelRenderer RightLeg;
	//private final ModelRenderer LeftLeg;
	 private static final Map<String, ResourceLocation> ARMOR_TEXTURE_RES_MAP = Maps.newHashMap();

	public megamanarmor_chestplatecolorold(float modelSize) {
		super(modelSize);
		// super(RenderType::getEntityTranslucent, modelSize, 0.0F, 64, 64);
		textureWidth = 64;
		textureHeight = 71;
		Color = 1581819;//Main Body Color Megaman Dark Blue

//		Head = new ModelRenderer(this);
//		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
//		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//		Head.setTextureOffset(34, 9).addBox(5.0643F, -3.9451F, -0.5752F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Head.setTextureOffset(49, 9).addBox(-5.8938F, -3.8448F, -1.5287F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Head.setTextureOffset(42, 8).addBox(-1.0F, -7.4829F, -5.54F, 2.0F, 2.0F, 1.0F, 0.25F, false);
//		Head.setTextureOffset(16, 32).addBox(-0.6552F, -9.5707F, -4.5F, 2.0F, 6.0F, 10.0F, 0.25F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		RightArm = new ModelRenderer(this);
		//RightArm.addChild(bipedRightArm);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		//setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		RightArm.setTextureOffset(40, 40).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArm.setTextureOffset(40, 56).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		LeftArm = new ModelRenderer(this);
		//LeftArm.addChild(bipedLeftArm);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		//setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		LeftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArm.setTextureOffset(40, 32).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		//RightLeg = new ModelRenderer(this);
		//RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		//setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		//RightLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		//LeftLeg = new ModelRenderer(this);
		//LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		//setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		//LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

//	@Override
//	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
//		//Head.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.Body.copyModelAngles(this.bipedBody);
//		this.RightArm.copyModelAngles(this.bipedRightArm);
//		this.LeftArm.copyModelAngles(this.bipedLeftArm);
//		Body.render(matrixStack, buffer, packedLight, packedOverlay);
//		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
//		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
//		//RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
//		//LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
////	      this.func_241739_a_(matrixStack, buffer, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
////	      this.func_241739_a_(matrixStack, buffer, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
////	      this.func_241739_a_(matrixStack, buffer, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
//	}
	
//	public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
//	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
//	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.LEGS, packedLightIn, this.func_241736_a_(EquipmentSlotType.LEGS));
//	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.FEET, packedLightIn, this.func_241736_a_(EquipmentSlotType.FEET));
//	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.HEAD, packedLightIn, this.func_241736_a_(EquipmentSlotType.HEAD));
//	   }
	
//	public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn) {
//    this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, EquipmentSlotType.CHEST);
// }
	////public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
//
	// private void func_241739_a_(MatrixStack matrixStack, IRenderTypeBuffer Irender, T entity, EquipmentSlotType equipslottype, int packedLight, A armormodel) {
//    ItemStack itemstack = entity.getItemStackFromSlot(equipslottype);
//    if (itemstack.getItem() instanceof ArmorItem) {
//       ArmorItem armoritem = (ArmorItem)itemstack.getItem();
//       if (armoritem.getEquipmentSlot() == equipslottype) {
//          armormodel = getArmorModelHook(entity, itemstack, equipslottype, armormodel);
//          this.getEntityModel().setModelAttributes(armormodel);
//          this.setModelSlotVisible(armormodel, equipslottype);
//          boolean flag = this.isLegSlot(equipslottype);
//          boolean flag1 = itemstack.hasEffect();
//          if (armoritem instanceof net.minecraft.item.IDyeableArmorItem) {
//             int i = ((net.minecraft.item.IDyeableArmorItem)armoritem).getColor(itemstack);
//             float fred = (float)(i >> 16 & 255) / 255.0F;
//             float fblue = (float)(i >> 8 & 255) / 255.0F;
//             float fgreen = (float)(i & 255) / 255.0F;
//             this.func_241738_a_(matrixStack, Irender, packedLight, flag1, armormodel, fred, fblue, fgreen, this.getArmorResource(entity, itemstack, equipslottype, null));
//             this.func_241738_a_(matrixStack, Irender, packedLight, flag1, armormodel, 1.0F, 1.0F, 1.0F, this.getArmorResource(entity, itemstack, equipslottype, "overlay"));
//          } else {
//             this.func_241738_a_(matrixStack, Irender, packedLight, flag1, armormodel, 1.0F, 1.0F, 1.0F, this.getArmorResource(entity, itemstack, equipslottype, null));
//          }
//
//       }
//    }
// }
	
	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
	//public void render(MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight, T entitylivingbase, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
    //this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
   // this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.LEGS, packedLightIn, this.func_241736_a_(EquipmentSlotType.LEGS));
    //this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.FEET, packedLightIn, this.func_241736_a_(EquipmentSlotType.FEET));
    //this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.HEAD, packedLightIn, this.func_241736_a_(EquipmentSlotType.HEAD));
		this.Body.copyModelAngles(this.bipedBody);
		this.RightArm.copyModelAngles(this.bipedRightArm);
		this.LeftArm.copyModelAngles(this.bipedLeftArm);
		float fred = (float)( this.Color >> 16 & 255) / 255.0F;
        float fblue = (float)(this.Color >> 8 & 255) / 255.0F;
        float fgreen = (float)(this.Color & 255) / 255.0F;
		buffer.color(fred, fgreen, fblue, alpha);
		final ResourceLocation ArmorTexture = new ResourceLocation("megamanarmormod:textures/armor/megamanarmor_layer_1.png");//textures/entity/llama/spit.png
		final ResourceLocation ArmorTexture2 = new ResourceLocation("megamanarmormod:textures/armor/megamanarmor_layer_1_overlay.png");//textures/entity/llama/spit.png
		//IVertexBuilder ivertexbuilder = ItemRenderer.getArmorVertexBuilder(Irender, RenderType.getArmorCutoutNoCull(armorResource), false, packedOverlay);
		//IVertexBuilder ivertexbuilder = ItemRenderer.getArmorVertexBuilder(Irender, RenderType.getArmorCutoutNoCull(ArmorTexture), false, packedOverlay);
		//IVertexBuilder ivertexbuilder = ItemRenderer.getArmorVertexBuilder( , RenderType.getArmorCutoutNoCull(ArmorTexture), false, packedOverlay);
		   //public static IVertexBuilder getArmorVertexBuilder(IRenderTypeBuffer buffer, RenderType renderType, boolean noEntity, boolean withGlint) {
			//      return withGlint ? VertexBuilderUtils.newDelegate(buffer.getBuffer(noEntity ? RenderType.getArmorGlint() : RenderType.getArmorEntityGlint()), buffer.getBuffer(renderType)) : buffer.getBuffer(renderType);
			 //  }
		//this.getRenderType(ArmorTexture);
		//this.getRenderType(ArmorTexture2).equals(RenderType.getArmorCutoutNoCull(ArmorTexture));
		//this.renderType.apply(ArmorTexture);
		this.renderType.apply(ArmorTexture);
	    //armormodel.render(matrixStack, ivertexbuilder, packedLight, OverlayTexture.NO_OVERLAY, red, blue, green, 1.0F);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		//this.func_241739_a_(matrixStack, buffer, entitylivingbase, EquipmentSlotType.CHEST, packedLight, MegamanArmorchestcolorgetArmorModel(entityLivingbase, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {);
		//this.renderType = RenderType.getArmorCutoutNoCull(ArmorTexture2);//RenderType.getArmorCutoutNoCull(armorResource)
		
		//this.getRenderType(ArmorTexture2).equals(RenderType.getArmorCutoutNoCull(ArmorTexture2));
		this.renderType.apply(ArmorTexture2);
		this.Body.copyModelAngles(this.bipedBody);
		this.RightArm.copyModelAngles(this.bipedRightArm);
		this.LeftArm.copyModelAngles(this.bipedLeftArm);

	    //armormodel.render(matrixStack, ivertexbuilder, packedLight, OverlayTexture.NO_OVERLAY, red, blue, green, 1.0F);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
 }
//
//public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
	
// private void func_241739_a_(MatrixStack matrixStack, IRenderTypeBuffer Irender, T entity, EquipmentSlotType equipslottype, int packedLight, A armorpart) {//, ModelRenderer armormodel
//	      ItemStack itemstack = entity.getItemStackFromSlot(equipslottype);
//	      if (itemstack.getItem() instanceof ArmorItem) {
//	         ArmorItem armoritem = (ArmorItem)itemstack.getItem();
//	         if (armoritem.getEquipmentSlot() == equipslottype) {
//	        	 //Body = getArmorModelHook(entity, itemstack, equipslottype, this.);
//	            this.getEntityModel().setModelAttributes(armorpart);
//	            //this.setModelSlotVisible(Body, equipslottype);
//	            //boolean flag = this.isLegSlot(equipslottype);
//	            boolean flag1 = itemstack.hasEffect();
//	           // if (armoritem instanceof net.minecraft.item.IDyeableArmorItem) {
//	               int i = ((net.minecraft.item.IDyeableArmorItem)armoritem).getColor(itemstack);//Get Color, or default color
//	               float fred = (float)(i >> 16 & 255) / 255.0F;
//	               float fblue = (float)(i >> 8 & 255) / 255.0F;
//	               float fgreen = (float)(i & 255) / 255.0F;
//	               this.func_241738_a_(matrixStack, Irender, packedLight, flag1, armorpart, fred, fblue, fgreen, this.getArmorResource(entity, itemstack, equipslottype, null));//Main Blue Part
//    			  // this.func_241738_a_(matrixStack, Irender, packedLight, flag1, armorpart, fred, fblue, fgreen, this.getArmorResource(entity, itemstack, equipslottype, null));//Secondary Blue Part
//	               //this.func_241738_a_(matrixStack, Irender, packedLight, flag1, armorpart, 1.0F, 1.0F, 1.0F, this.getArmorResource(entity, itemstack, equipslottype, "overlay")); //Everything else
//	            //} else {
//	            //   this.func_241738_a_(matrixStack, Irender, packedLight, flag1, armormodel, 1.0F, 1.0F, 1.0F, this.getArmorResource(entity, itemstack, equipslottype, null));
//	            //}
//
//	         }
//	      }
//	   }
	
//	private void funcrenderhelper (){
//	}
// 
//	
//	private void func_241738_a_(MatrixStack matrixStack, IRenderTypeBuffer Irender, int packedLight, boolean packedOverlay, A armormodel, float red, float blue, float green, ResourceLocation armorResource) {
//	      IVertexBuilder ivertexbuilder = ItemRenderer.getArmorVertexBuilder(Irender, RenderType.getArmorCutoutNoCull(armorResource), false, packedOverlay);
//	      armormodel.render(matrixStack, ivertexbuilder, packedLight, OverlayTexture.NO_OVERLAY, red, blue, green, 1.0F);
//	   }
	
	//detectarmormodeltoload
//	   private A func_241736_a_(EquipmentSlotType p_241736_1_) {
//		      return (A)(this.isLegSlot(p_241736_1_) ? this.modelLeggings : this.modelArmor);
//		   }
	
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
//public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
//	@Override
//	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
//		this.Body.copyModelAngles(this.bipedBody);
//		this.RightArm.copyModelAngles(this.bipedRightArm);
//		this.LeftArm.copyModelAngles(this.bipedLeftArm);
//		Body.render(matrixStack, buffer, packedLight, packedOverlay);
//		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
//		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
//		//this.func_241739_a_(matrixStack, buffer, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
//		//this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
//	}
	
	
//	public ResourceLocation getArmorResource(net.minecraft.entity.Entity entity, ItemStack stack, EquipmentSlotType slot, @Nullable String type) {
//	      ArmorItem item = (ArmorItem)stack.getItem();
//	      String texture = item.getArmorMaterial().getName();
//	      String domain = "minecraft";
//	      int idx = texture.indexOf(':');
//	      if (idx != -1) {
//	         domain = texture.substring(0, idx);
//	         texture = texture.substring(idx + 1);
//	      }
//	      String s1 = String.format("%s:textures/models/armor/%s_layer_%d%s.png", domain, texture, (isLegSlot(slot) ? 2 : 1), type == null ? "" : String.format("_%s", type));
//
//	      s1 = net.minecraftforge.client.ForgeHooksClient.getArmorTexture(entity, stack, s1, slot, type);
//	      ResourceLocation resourcelocation = ARMOR_TEXTURE_RES_MAP.get(s1);
//
//	      if (resourcelocation == null) {
//	         resourcelocation = new ResourceLocation(s1);
//	         ARMOR_TEXTURE_RES_MAP.put(s1, resourcelocation);
//	      }
//	      return resourcelocation;
//	}
//	   //private A func_241736_a_(EquipmentSlotType p_241736_1_) {
//		//      return (A)(this.isLegSlot(p_241736_1_) ? this.modelLeggings : this.modelArmor);
//		//   }
//	
//	   private boolean isLegSlot(EquipmentSlotType slotIn) {
//		      return slotIn == EquipmentSlotType.LEGS;
//		   }
	   
	   
}