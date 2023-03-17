package com.collecter128.megamanarmormod.client.models;

import java.util.function.Function;

import javax.annotation.Nullable;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderState;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class xarmorclear_chestplate extends BipedModel {
	//RenderType type = RenderType.entityTranslucent(new ResourceLocation("megamanarmormod:textures/armor/xarmorclear1.png"));
	 //super(RenderType::getEntityTranslucent, modelSize, 0.0F, 64, 64);
	final static ResourceLocation ClearArmorTexture = new ResourceLocation("megamanarmormod:textures/armor/xtransparentarmor_layer_1.png");//textures/entity/llama/spit.png
	private static final RenderType field_229123_e_ = RenderType.entityTranslucent(ClearArmorTexture);
	
//	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
//	private final ModelRenderer RightLeg;
//	private final ModelRenderer LeftLeg;
	
//	 public static RenderType getArmorTransparent(ResourceLocation locationIn) {
//	      RenderType.State rendertype$state = RenderType.State.getBuilder().texture(new RenderState.TextureState(locationIn, false, false)).transparency(TRANSLUCENT_TRANSPARENCY).diffuseLighting(DIFFUSE_LIGHTING_ENABLED).alpha(DEFAULT_ALPHA).cull(CULL_DISABLED).lightmap(LIGHTMAP_ENABLED).overlay(OVERLAY_ENABLED).layer(field_239235_M_).build(true);
//	      return RenderType.makeType("armor_cutout_no_cull", DefaultVertexFormats.ENTITY, 7, 256, true, false, rendertype$state);
//	   }
	
//	public xarmorclear_chestplate(float modelSize) {
//	      this(RenderType::getEntityTranslucentCull, modelSize, 0.0F, 64, 79);
//	   }
	
//getEntityCutoutNoCull
	//getLightning
	//getEnergySwirl
	//getEntityAlpha
	//getEyes
	//getEntityTranslucentCull
	//:getItemEntityTranslucentCull
	
	
//	protected xarmorclear_chestplate(float modelSize, float yOffsetIn, int textureWidthIn, int textureHeightIn) {
//	      this(RenderType::getEntityTranslucentCull, modelSize, yOffsetIn, textureWidthIn, textureHeightIn);
//	   }
	
	//getItemEntityTranslucentCull
	//Function<ResourceLocation, RenderType> renderTypeIn, float modelSize, float yOffsetIn, int textureWidthIn, int textureHeightIn
	public xarmorclear_chestplate(Function<ResourceLocation, RenderType> renderTypeIn, float modelSize, float yOffset, int textureWidth, int textureHeight) {//
	//public xarmorclear_chestplate(float modelSize) {//
		//super(renderTypeIn, true, 16.0F, 0.0F, 2.0F, 2.0F, 24.0F)
		super(modelSize);
		//this(RenderType::getEntityCutoutNoCull, modelSize, 0.0F, 64, 79);
		//renderTypeIn = RenderType::getEntityTranslucentCull;//TRANSLUCENT(ClearArmorTexture)
		//yOffset = 0f;
		//renderTypeIn =;//TRANSLUCENT(ClearArmorTexture)
		//renderTypeIn = RenderType::getEnergySwirl;//TRANSLUCENT(ClearArmorTexture)
		//super(modelSize);
		//super(<ClearArmorTexture, RenderType::TRANSLUCENT>, modelSize, 0.0F, 64, 79);
		//renderTypeIn = 
		textureWidth = 64;
		textureHeight = 79;
		
//		@Override
//		public BipedModel(modelSize) {
//		      this(RenderType::getEntityCutoutNoCull, modelSize, 0.0F, 64, 32);
//		   }

//		   protected BipedModel(float modelSize, float yOffsetIn, int textureWidthIn, int textureHeightIn) {
//		      this(RenderType::getEntityCutoutNoCull, modelSize, yOffsetIn, textureWidthIn, textureHeightIn);
//		   }
		

//		Head = new ModelRenderer(this);
//		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
//		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//		Head.setTextureOffset(51, 7).addBox(5.4F, -5.9341F, -0.7842F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Head.setTextureOffset(34, 7).addBox(-5.981F, -5.938F, -0.747F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Head.setTextureOffset(0, 45).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
//		Head.setTextureOffset(43, 10).addBox(-1.0F, -8.8411F, -5.6852F, 2.0F, 2.0F, 1.0F, 0.1F, false);
//		Head.setTextureOffset(15, 30).addBox(-1.0872F, -9.9562F, -4.4855F, 2.0F, 5.0F, 10.0F, 0.4F, false);

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		Body.texOffs(16, 60).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		RightArm.texOffs(40, 16).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		RightArm.texOffs(40, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArm.texOffs(40, 40).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		LeftArm.texOffs(40, 48).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArm.texOffs(40, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArm.texOffs(40, 40).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

//		RightLeg = new ModelRenderer(this);
//		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
//		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		LeftLeg = new ModelRenderer(this);
//		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
//		LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
	}
	

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}
	
	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
//		this.Head.copyModelAngles(this.bipedHead);
		final ResourceLocation ClearArmorTexture = new ResourceLocation("megamanarmormod:textures/armor/xtransparentarmor_layer_1.png");//textures/entity/llama/spit.png
		this.Body.copyFrom(this.body);
		this.RightArm.copyFrom(this.rightArm);
		this.LeftArm.copyFrom(this.leftArm);
		//IVertexBuilder ivertexbuilder = buffer.getBuffer(RenderType.getEntityTranslucent(ClearArmorTexture), 0, 0 * 0.01F);
        //entitymodel.render(matrixStack, ivertexbuilder, packedLight, OverlayTexture.NO_OVERLAY, 0.5F, 0.5F, 0.5F, 1.0F);
		//IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEnergySwirl(this.func_225633_a_(), this.func_225634_a_(f), f * 0.01F));
		//IVertexBuilder ivertexbuilder = buffer.getBuffer(RenderType.getEntityTranslucent(ClearArmorTexture));
//		this.RightLeg.copyModelAngles(this.bipedRightLeg);
//		this.LeftLeg.copyModelAngles(this.bipedLeftLeg);
//		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		//IVertexBuilder ivertexbuilder1 = buffer.getBuffer(field_229123_e_);
		
		//IVertexBuilder ivertexbuilder = ItemRenderer.getArmorVertexBuilder(buffer, RenderType.getEntityTranslucentCull(ClearArmorTexture), false, packedOverlay);
		
		//Glowy Body.render(matrixStack, buffer, 15728640, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		//Body.render(matrixStack, ivertexbuilder, packedLight, packedOverlay, 0.5F, 0.5F, 0.5F, 1.0F);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		//RightArm.render(matrixStack, ivertexbuilder, packedLight, packedOverlay, 0.5F, 0.5F, 0.5F, 1.0F);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		//LeftArm.render(matrixStack, ivertexbuilder, packedLight, packedOverlay, 0.5F, 0.5F, 0.5F, 1.0F);
//		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
//		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
	
//	   public ResourceLocation getArmorResource(net.minecraft.entity.Entity entity, ItemStack stack, EquipmentSlotType slot, @Nullable String type) {
//		      ArmorItem item = (ArmorItem)stack.getItem();
//		      String texture = item.getArmorMaterial().getName();
//		      String domain = "megamanarmormod";
//		      int idx = texture.indexOf(':');
//		      if (idx != -1) {
//		         domain = texture.substring(0, idx);
//		         texture = texture.substring(idx + 1);
//		      }
//		      //String s1 = String.format("%s:textures/armor/%s_layer_%d%s.png", domain, texture, (isLegSlot(slot) ? 2 : 1), type == null ? "" : String.format("_%s", type));
//		      String s1 = String.format("megamanarmormod:textures/armor/megamanarmor_layer_%d%s.png", domain, texture, (isLegSlot(slot) ? 2 : 1), type == null ? "" : String.format("_%s", type));
//
//		      s1 = net.minecraftforge.client.ForgeHooksClient.getArmorTexture(entity, stack, s1, slot, type);
//		      ResourceLocation resourcelocation = ARMOR_TEXTURE_RES_MAP.get(s1);
//
//		      if (resourcelocation == null) {
//		         resourcelocation = new ResourceLocation(s1);
//		         ARMOR_TEXTURE_RES_MAP.put(s1, resourcelocation);
//		      }
//
//		      return resourcelocation;
//		   }
}