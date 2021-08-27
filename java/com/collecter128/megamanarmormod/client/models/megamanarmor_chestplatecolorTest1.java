package com.collecter128.megamanarmormod.client.models;

import java.util.Map;

import javax.annotation.Nullable;

import com.collecter128.megamanarmormod.items.MegamanArmorchestcolor;
import com.google.common.collect.Maps;
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

//<T extends LivingEntity, M extends BipedModel<T>, A extends BipedModel<T>> extends LayerRenderer<T, M>
public class megamanarmor_chestplatecolorTest1<T extends LivingEntity, M extends BipedModel<T>, A extends BipedModel<T>> extends LayerRenderer<T, M> {
	private static final Map<String, ResourceLocation> ARMOR_TEXTURE_RES_MAP = Maps.newHashMap();
	public final A BodyArmor;
	public final A LegsModel;
	//private final ModelRenderer Head;
	//public final ModelRenderer Body;
	//public final ModelRenderer RightArm;
	//public final ModelRenderer LeftArm;
//	//private final ModelRenderer RightLeg;
//	//private final ModelRenderer LeftLeg;
	//public BipedModel.ArmPose leftArmPose = BipedModel.ArmPose.EMPTY;
	//public BipedModel.ArmPose rightArmPose = BipedModel.ArmPose.EMPTY;
	//public boolean isSneak;
	//public float swimAnimation;
//	private static final Map<String, ResourceLocation> ARMOR_TEXTURE_RES_MAP = Maps.newHashMap();
	
//	public megamanarmor_chestplatecolorTest1(IEntityRenderer<T, M> entityRendererIn) {
//		super(entityRendererIn);
//		
//	}//extends BipedModel //<T extends LivingEntity, M extends BipedModel<T>, A extends BipedModel<T>> extends LayerRenderer<T, M>
	
	public megamanarmor_chestplatecolorTest1(IEntityRenderer<T, M> p_i50936_1_, A leggingsmodel, A armormodel) {
	      super(p_i50936_1_);
	      this.LegsModel = leggingsmodel;
	      this.BodyArmor = armormodel;
	   }
	

	public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.LEGS, packedLightIn, this.func_241736_a_(EquipmentSlotType.LEGS));
	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.FEET, packedLightIn, this.func_241736_a_(EquipmentSlotType.FEET));
	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.HEAD, packedLightIn, this.func_241736_a_(EquipmentSlotType.HEAD));
	   }

	   private void func_241739_a_(MatrixStack matrixStack, IRenderTypeBuffer Irender, T entity, EquipmentSlotType equipslottype, int p_241739_5_, A armormodel) {
		      ItemStack itemstack = entity.getItemStackFromSlot(equipslottype);
		      if (itemstack.getItem() instanceof ArmorItem) {
		         ArmorItem armoritem = (ArmorItem)itemstack.getItem();
		         if (armoritem.getEquipmentSlot() == equipslottype) {
		            armormodel = getArmorModelHook(entity, itemstack, equipslottype, armormodel);
		            this.getEntityModel().setModelAttributes(armormodel);
		            this.setModelSlotVisible(armormodel, equipslottype);
		            boolean flag = this.isLegSlot(equipslottype);
		            boolean flag1 = itemstack.hasEffect();
		            if (armoritem instanceof net.minecraft.item.IDyeableArmorItem) {
		               int i = ((net.minecraft.item.IDyeableArmorItem)armoritem).getColor(itemstack);
		               float f = (float)(i >> 16 & 255) / 255.0F;
		               float f1 = (float)(i >> 8 & 255) / 255.0F;
		               float f2 = (float)(i & 255) / 255.0F;
		               this.func_241738_a_(matrixStack, Irender, p_241739_5_, flag1, armormodel, f, f1, f2, this.getArmorResource(entity, itemstack, equipslottype, null));
		               this.func_241738_a_(matrixStack, Irender, p_241739_5_, flag1, armormodel, 1.0F, 1.0F, 1.0F, this.getArmorResource(entity, itemstack, equipslottype, "overlay"));
		            } else {
		               this.func_241738_a_(matrixStack, Irender, p_241739_5_, flag1, armormodel, 1.0F, 1.0F, 1.0F, this.getArmorResource(entity, itemstack, equipslottype, null));
		            }

		         }
		      }
		   }

	   protected void setModelSlotVisible(A modelIn, EquipmentSlotType slotIn) {
	      modelIn.setVisible(false);
	      switch(slotIn) {
//	      case HEAD:
//	         modelIn.bipedHead.showModel = true;
//	         modelIn.bipedHeadwear.showModel = true;
//	         break;
	      case CHEST:
	         modelIn.bipedBody.showModel = true;
	         modelIn.bipedRightArm.showModel = true;
	         modelIn.bipedLeftArm.showModel = true;
	         break;
//	      case LEGS:
//	         modelIn.bipedBody.showModel = true;
//	         modelIn.bipedRightLeg.showModel = true;
//	         modelIn.bipedLeftLeg.showModel = true;
//	         break;
//	      case FEET:
//	         modelIn.bipedRightLeg.showModel = true;
//	         modelIn.bipedLeftLeg.showModel = true;
	      }

	   }

	   private void func_241738_a_(MatrixStack p_241738_1_, IRenderTypeBuffer p_241738_2_, int p_241738_3_, ArmorItem p_241738_4_, boolean p_241738_5_, A p_241738_6_, boolean p_241738_7_, float p_241738_8_, float p_241738_9_, float p_241738_10_, @Nullable String p_241738_11_) {
	       func_241738_a_(p_241738_1_, p_241738_2_, p_241738_3_, p_241738_5_, p_241738_6_, p_241738_8_, p_241738_9_, p_241738_10_, this.func_241737_a_(p_241738_4_, p_241738_7_, p_241738_11_));
	   }
	   private void func_241738_a_(MatrixStack p_241738_1_, IRenderTypeBuffer p_241738_2_, int p_241738_3_, boolean p_241738_5_, A p_241738_6_, float p_241738_8_, float p_241738_9_, float p_241738_10_, ResourceLocation armorResource) {
	      IVertexBuilder ivertexbuilder = ItemRenderer.getArmorVertexBuilder(p_241738_2_, RenderType.getArmorCutoutNoCull(armorResource), false, p_241738_5_);
	      p_241738_6_.render(p_241738_1_, ivertexbuilder, p_241738_3_, OverlayTexture.NO_OVERLAY, p_241738_8_, p_241738_9_, p_241738_10_, 1.0F);
	   }

	   private A func_241736_a_(EquipmentSlotType p_241736_1_) {
	      return (A)(this.isLegSlot(p_241736_1_) ? this.LegsModel : this.BodyArmor);
	   }

	   private boolean isLegSlot(EquipmentSlotType slotIn) {
	      return slotIn == EquipmentSlotType.LEGS;
	   }
	   
	   @Deprecated //Use the more sensitive version getArmorResource below
	   private ResourceLocation func_241737_a_(ArmorItem p_241737_1_, boolean p_241737_2_, @Nullable String p_241737_3_) {
	      String s = "textures/models/armor/" + p_241737_1_.getArmorMaterial().getName() + "_layer_" + (p_241737_2_ ? 2 : 1) + (p_241737_3_ == null ? "" : "_" + p_241737_3_) + ".png";
	      return ARMOR_TEXTURE_RES_MAP.computeIfAbsent(s, ResourceLocation::new);
	   }
	   
	   /*=================================== FORGE START =========================================*/

	   /**
	    * Hook to allow item-sensitive armor model. for LayerBipedArmor.
	    */
	   protected A getArmorModelHook(T entity, ItemStack itemStack, EquipmentSlotType slot, A model) {
	      return net.minecraftforge.client.ForgeHooksClient.getArmorModel(entity, itemStack, slot, model);
	   }

	   /**
	    * More generic ForgeHook version of the above function, it allows for Items to have more control over what texture they provide.
	    *
	    * @param entity Entity wearing the armor
	    * @param stack ItemStack for the armor
	    * @param slot Slot ID that the item is in
	    * @param type Subtype, can be null or "overlay"
	    * @return ResourceLocation pointing at the armor's texture
	    */
	   public ResourceLocation getArmorResource(net.minecraft.entity.Entity entity, ItemStack stack, EquipmentSlotType slot, @Nullable String type) {
	      ArmorItem item = (ArmorItem)stack.getItem();
	      String texture = item.getArmorMaterial().getName();
	      String domain = "megamanarmormod";
	      int idx = texture.indexOf(':');
	      if (idx != -1) {
	         domain = texture.substring(0, idx);
	         texture = texture.substring(idx + 1);
	      }
	      //String s1 = String.format("%s:textures/armor/%s_layer_%d%s.png", domain, texture, (isLegSlot(slot) ? 2 : 1), type == null ? "" : String.format("_%s", type));
	      String s1 = String.format("megamanarmormod:textures/armor/megamanarmor_layer_%d%s.png", domain, texture, (isLegSlot(slot) ? 2 : 1), type == null ? "" : String.format("_%s", type));

	      s1 = net.minecraftforge.client.ForgeHooksClient.getArmorTexture(entity, stack, s1, slot, type);
	      ResourceLocation resourcelocation = ARMOR_TEXTURE_RES_MAP.get(s1);

	      if (resourcelocation == null) {
	         resourcelocation = new ResourceLocation(s1);
	         ARMOR_TEXTURE_RES_MAP.put(s1, resourcelocation);
	      }

	      return resourcelocation;
	   }

//
//	public megamanarmor_chestplatecolorTest1(float modelSize) {
//		super(modelSize);
//		textureWidth = 64;
//		textureHeight = 71;
//
////		Head = new ModelRenderer(this);
////		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
////		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
////		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
////		Head.setTextureOffset(34, 9).addBox(5.0643F, -3.9451F, -0.5752F, 1.0F, 3.0F, 3.0F, 0.5F, false);
////		Head.setTextureOffset(49, 9).addBox(-5.8938F, -3.8448F, -1.5287F, 1.0F, 3.0F, 3.0F, 0.5F, false);
////		Head.setTextureOffset(42, 8).addBox(-1.0F, -7.4829F, -5.54F, 2.0F, 2.0F, 1.0F, 0.25F, false);
////		Head.setTextureOffset(16, 32).addBox(-0.6552F, -9.5707F, -4.5F, 2.0F, 6.0F, 10.0F, 0.25F, false);
//
//		//Body = new ModelRenderer(this);
//		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		//RightArm = new ModelRenderer(this);
//		//RightArm.addChild(bipedRightArm);
//		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		//setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
//		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
//		RightArm.setTextureOffset(40, 40).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//		RightArm.setTextureOffset(40, 56).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		//LeftArm = new ModelRenderer(this);
//		//LeftArm.addChild(bipedLeftArm);
//		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
//		//setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
//		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
//		LeftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//		LeftArm.setTextureOffset(40, 32).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		//RightLeg = new ModelRenderer(this);
//		//RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		//setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
//		//RightLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		//LeftLeg = new ModelRenderer(this);
//		//LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
//		//setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
//		//LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//	}
//
////	@Override
////	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
////		//previously the render function, render code was moved to a method below
////	}
//
////	@Override
////	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
////		//Head.render(matrixStack, buffer, packedLight, packedOverlay);
////		this.Body.copyModelAngles(this.bipedBody);
////		this.RightArm.copyModelAngles(this.bipedRightArm);
////		this.LeftArm.copyModelAngles(this.bipedLeftArm);
////		Body.render(matrixStack, buffer, packedLight, packedOverlay);
////		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
////		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
////		//RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
////		//LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
//////	      this.func_241739_a_(matrixStack, buffer, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
//////	      this.func_241739_a_(matrixStack, buffer, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
//////	      this.func_241739_a_(matrixStack, buffer, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
////	}
//	
////	public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
////	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
////	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.LEGS, packedLightIn, this.func_241736_a_(EquipmentSlotType.LEGS));
////	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.FEET, packedLightIn, this.func_241736_a_(EquipmentSlotType.FEET));
////	      this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.HEAD, packedLightIn, this.func_241736_a_(EquipmentSlotType.HEAD));
////	   }
//	
////	public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn) {
////    this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, EquipmentSlotType.CHEST);
//// }
//	////public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
////
//	// private void func_241739_a_(MatrixStack matrixStack, IRenderTypeBuffer Irender, T entity, EquipmentSlotType equipslottype, int packedLight, A armormodel) {
////    ItemStack itemstack = entity.getItemStackFromSlot(equipslottype);
////    if (itemstack.getItem() instanceof ArmorItem) {
////       ArmorItem armoritem = (ArmorItem)itemstack.getItem();
////       if (armoritem.getEquipmentSlot() == equipslottype) {
////          armormodel = getArmorModelHook(entity, itemstack, equipslottype, armormodel);
////          this.getEntityModel().setModelAttributes(armormodel);
////          this.setModelSlotVisible(armormodel, equipslottype);
////          boolean flag = this.isLegSlot(equipslottype);
////          boolean flag1 = itemstack.hasEffect();
////          if (armoritem instanceof net.minecraft.item.IDyeableArmorItem) {
////             int i = ((net.minecraft.item.IDyeableArmorItem)armoritem).getColor(itemstack);
////             float fred = (float)(i >> 16 & 255) / 255.0F;
////             float fblue = (float)(i >> 8 & 255) / 255.0F;
////             float fgreen = (float)(i & 255) / 255.0F;
////             this.func_241738_a_(matrixStack, Irender, packedLight, flag1, armormodel, fred, fblue, fgreen, this.getArmorResource(entity, itemstack, equipslottype, null));
////             this.func_241738_a_(matrixStack, Irender, packedLight, flag1, armormodel, 1.0F, 1.0F, 1.0F, this.getArmorResource(entity, itemstack, equipslottype, "overlay"));
////          } else {
////             this.func_241738_a_(matrixStack, Irender, packedLight, flag1, armormodel, 1.0F, 1.0F, 1.0F, this.getArmorResource(entity, itemstack, equipslottype, null));
////          }
////
////       }
////    }
//// }
//	
//	public void render(MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight, T entitylivingbase, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
//    //this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
//   // this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.LEGS, packedLightIn, this.func_241736_a_(EquipmentSlotType.LEGS));
//    //this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.FEET, packedLightIn, this.func_241736_a_(EquipmentSlotType.FEET));
//    //this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.HEAD, packedLightIn, this.func_241736_a_(EquipmentSlotType.HEAD));
//		//this.Body.copyModelAngles(this.);
//		this.RightArm.copyModelAngles(this.bipedRightArm);
//		this.LeftArm.copyModelAngles(this.bipedLeftArm);
//		Body.render(matrixStack, buffer, packedLight, packedOverlay);
//		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
//		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.func_241739_a_(matrixStack, buffer, entitylivingbase, EquipmentSlotType.CHEST, packedLight, Body);
// }
////
////public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
//	
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
//	
////	private void funcrenderhelper (){
////	}
//// 
////	
//	private void func_241738_a_(MatrixStack matrixStack, IRenderTypeBuffer Irender, int packedLight, boolean packedOverlay, A armormodel, float red, float blue, float green, ResourceLocation armorResource) {
//	      IVertexBuilder ivertexbuilder = ItemRenderer.getArmorVertexBuilder(Irender, RenderType.getArmorCutoutNoCull(armorResource), false, packedOverlay);
//	      armormodel.render(matrixStack, ivertexbuilder, packedLight, OverlayTexture.NO_OVERLAY, red, blue, green, 1.0F);
//	   }
//	
//	//detectarmormodeltoload
////	   private A func_241736_a_(EquipmentSlotType p_241736_1_) {
////		      return (A)(this.isLegSlot(p_241736_1_) ? this.modelLeggings : this.modelArmor);
////		   }
//	
//	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
//		modelRenderer.rotateAngleX = x;
//		modelRenderer.rotateAngleY = y;
//		modelRenderer.rotateAngleZ = z;
//	}
////public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
////	@Override
////	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
////		this.Body.copyModelAngles(this.bipedBody);
////		this.RightArm.copyModelAngles(this.bipedRightArm);
////		this.LeftArm.copyModelAngles(this.bipedLeftArm);
////		Body.render(matrixStack, buffer, packedLight, packedOverlay);
////		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
////		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
////		//this.func_241739_a_(matrixStack, buffer, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
////		//this.func_241739_a_(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.func_241736_a_(EquipmentSlotType.CHEST));
////	}
//	
//	
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

//	@Override
//	public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn,
//			float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw,
//			float headPitch) {
//		// TODO Auto-generated method stub
//		
//	}
	   
	   
}