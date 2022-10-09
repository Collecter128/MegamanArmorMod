package com.collecter128.megamanarmormod.core;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.block.Block;
import net.minecraft.block.BreakableBlock;
import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.client.renderer.model.BakedQuad;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.model.ModelManager;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.registry.Registry;

public class CustomItemRenderer extends ItemRenderer{
	private final ItemColors itemColors;
	 private static final Set<Item> ITEM_MODEL_BLACKLIST = Sets.newHashSet(Items.AIR);
	 private final ItemModelMesher itemModelMesher;
	
	public CustomItemRenderer(TextureManager textureManagerIn, ModelManager modelManagerIn, ItemColors itemColorsIn) {
		super(textureManagerIn, modelManagerIn, itemColorsIn);
		this.itemModelMesher = new net.minecraftforge.client.ItemModelMesherForge(modelManagerIn);
		this.itemColors = itemColorsIn;
		
		for(Item item : Registry.ITEM) {
	         if (!ITEM_MODEL_BLACKLIST.contains(item)) {
	            this.itemModelMesher.register(item, new ModelResourceLocation(Registry.ITEM.getKey(item), "inventory"));
	         }
	      }
	}
	
	@Override
	public void render(ItemStack itemStackIn, ItemCameraTransforms.TransformType transformTypeIn, boolean leftHand, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn, IBakedModel modelIn) {
	      if (!itemStackIn.isEmpty()) {
	         matrixStackIn.pushPose();
	         boolean flag = transformTypeIn == ItemCameraTransforms.TransformType.GUI || transformTypeIn == ItemCameraTransforms.TransformType.GROUND || transformTypeIn == ItemCameraTransforms.TransformType.FIXED;
	         if (itemStackIn.getItem() == Items.TRIDENT && flag) {
	            modelIn = this.itemModelMesher.getModelManager().getModel(new ModelResourceLocation("minecraft:trident#inventory"));
	         }

	         modelIn = net.minecraftforge.client.ForgeHooksClient.handleCameraTransforms(matrixStackIn, modelIn, transformTypeIn, leftHand);
	         matrixStackIn.translate(-0.5D, -0.5D, -0.5D);
	         if (!modelIn.isCustomRenderer() && (itemStackIn.getItem() != Items.TRIDENT || flag)) {
	            boolean flag1;
	            if (transformTypeIn != ItemCameraTransforms.TransformType.GUI && !transformTypeIn.firstPerson() && itemStackIn.getItem() instanceof BlockItem) {
	               Block block = ((BlockItem)itemStackIn.getItem()).getBlock();
	               flag1 = !(block instanceof BreakableBlock) && !(block instanceof StainedGlassPaneBlock);
	            } else {
	               flag1 = true;
	            }
	            if(itemStackIn.getItem() == ItemInit.MainColorColorizer.get()) {
	            	CompoundNBT compoundnbtitem = itemStackIn.getOrCreateTagElement("color");
	     		   if(compoundnbtitem != null && compoundnbtitem.contains("color", 99)) {
	            		//combinedOverlayIn = compoundnbtitem.getInt("color");
	     			   
	            	}
	     		
	            }
	            if (modelIn.isLayered()) { net.minecraftforge.client.ForgeHooksClient.drawItemLayered(this, modelIn, itemStackIn, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, flag1); }
	            else {
	            RenderType rendertype = RenderTypeLookup.getRenderType(itemStackIn, flag1);
	            IVertexBuilder ivertexbuilder;
	            
	            if (itemStackIn.getItem() == Items.COMPASS && itemStackIn.hasFoil()) {
	               matrixStackIn.pushPose();
	               MatrixStack.Entry matrixstack$entry = matrixStackIn.last();
	               if (transformTypeIn == ItemCameraTransforms.TransformType.GUI) {
	                  matrixstack$entry.pose().multiply(0.5F);
	               } else if (transformTypeIn.firstPerson()) {
	                  matrixstack$entry.pose().multiply(0.75F);
	               }

	               if (flag1) {
	                  ivertexbuilder = getCompassFoilBufferDirect(bufferIn, rendertype, matrixstack$entry);
	               } else {
	                  ivertexbuilder = getCompassFoilBuffer(bufferIn, rendertype, matrixstack$entry);
	               }

	               matrixStackIn.popPose();
	            } else if (flag1) {
	               ivertexbuilder = getFoilBufferDirect(bufferIn, rendertype, true, itemStackIn.hasFoil());
	            } 
	            else {
	               ivertexbuilder = getFoilBuffer(bufferIn, rendertype, true, itemStackIn.hasFoil());
	            }

	            this.renderModelLists(modelIn, itemStackIn, combinedLightIn, combinedOverlayIn, matrixStackIn, ivertexbuilder);
	            }
	         } else {
	            itemStackIn.getItem().getItemStackTileEntityRenderer().renderByItem(itemStackIn, transformTypeIn, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn);
	         }

	         matrixStackIn.popPose();
	      }
	   }
	
//	public void renderQuads(MatrixStack matrixStackIn, IVertexBuilder bufferIn, List<BakedQuad> quadsIn, ItemStack itemStackIn, int combinedLightIn, int combinedOverlayIn) {
//	      boolean flag = !itemStackIn.isEmpty();
//	      MatrixStack.Entry matrixstack$entry = matrixStackIn.getLast();
//
//	      for(BakedQuad bakedquad : quadsIn) {
//	         int i = -1;
//	         if (flag && bakedquad.hasTintIndex()) {
//	            i = this.itemColors.getColor(itemStackIn, bakedquad.getTintIndex());
//	         }
//
//	         float f = (float)(i >> 16 & 255) / 255.0F;
//	         float f1 = (float)(i >> 8 & 255) / 255.0F;
//	         float f2 = (float)(i & 255) / 255.0F;
//	         bufferIn.addVertexData(matrixstack$entry, bakedquad, f, f1, f2, combinedLightIn, combinedOverlayIn, true);
//	      }
//
//	   }

	//This is from the dyable clothes mod by cheller
	//https://www.curseforge.com/minecraft/mc-mods/dyeable-clothes
	
//	public static void registerItemRenderer() {
//		//reg(ItemInit.AtomicfireColorizer.get());
//		reg(ItemInit.MainColorColorizer.get());
//
//	}
//
//	public static void reg(Item item) {
//		Minecraft
//				//.getMinecraft()
//				.getInstance().getItemRenderer()//.getRenderItem()
//				.getItemModelMesher()
//				.register(
//						item,
//						new ModelResourceLocation("megamanarmormod:"
//								+ item.getRegistryName(),//.getUnlocalizedName().substring(5)   .getString
//								"inventory"));
//		//item.;
//	}
//
//	public static void reg(Item item, String file) {
//		Minecraft
//		.getInstance().getItemRenderer()//.getRenderItem()
//		.getItemModelMesher()
//				.register(
//						item,
//						new ModelResourceLocation("megamanarmormod:"
//								+ file, "inventory"));
//	}
	
}
