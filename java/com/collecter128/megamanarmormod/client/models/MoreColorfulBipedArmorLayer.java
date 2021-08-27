package com.collecter128.megamanarmormod.client.models;

import java.util.Map;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MoreColorfulBipedArmorLayer {//extends BipedArmorLayer
//		private static final Map<String, ResourceLocation> ARMOR_TEXTURE_RES_MAP = Maps.newHashMap();
//	   private final A modelLeggings;
//	   private final A modelArmor;
//	   
//	public MoreColorfulBipedArmorLayer(IEntityRenderer p_i50936_1_, BipedModel p_i50936_2_, BipedModel p_i50936_3_) {
//		super(p_i50936_1_, p_i50936_2_, p_i50936_3_);
//		
//	}
//	
//	@Override
//	  private void func_241739_a_(MatrixStack p_241739_1_, IRenderTypeBuffer p_241739_2_, T p_241739_3_, EquipmentSlotType p_241739_4_, int p_241739_5_, A p_241739_6_) {
//	      ItemStack itemstack = p_241739_3_.getItemStackFromSlot(p_241739_4_);
//	      if (itemstack.getItem() instanceof ArmorItem) {
//	         ArmorItem armoritem = (ArmorItem)itemstack.getItem();
//	         if (armoritem.getEquipmentSlot() == p_241739_4_) {
//	            p_241739_6_ = getArmorModelHook(p_241739_3_, itemstack, p_241739_4_, p_241739_6_);
//	            this.getEntityModel().setModelAttributes(p_241739_6_);
//	            this.setModelSlotVisible(p_241739_6_, p_241739_4_);
//	            boolean flag = this.isLegSlot(p_241739_4_);
//	            boolean flag1 = itemstack.hasEffect();
//	            if (armoritem instanceof net.minecraft.item.IDyeableArmorItem) {
//	                int i = ((net.minecraft.item.IDyeableArmorItem)armoritem).getColor(itemstack);
//	                float f = (float)(i >> 16 & 255) / 255.0F;
//	                float f1 = (float)(i >> 8 & 255) / 255.0F;
//	                float f2 = (float)(i & 255) / 255.0F;
//	                this.func_241738_a_(p_241739_1_, p_241739_2_, p_241739_5_, flag1, p_241739_6_, f, f1, f2, this.getArmorResource(p_241739_3_, itemstack, p_241739_4_, null));
//	                this.func_241738_a_(p_241739_1_, p_241739_2_, p_241739_5_, flag1, p_241739_6_, 1.0F, 1.0F, 1.0F, this.getArmorResource(p_241739_3_, itemstack, p_241739_4_, "overlay"));
//	             }
//	            else if (armoritem instanceof com.collecter128.megamanarmormod.items.ColorfulArmor) {
//	               int i = ((com.collecter128.megamanarmormod.items.ColorfulArmor)armoritem).getColor(itemstack);
//	               float f = (float)(i >> 16 & 255) / 255.0F;
//	               float f1 = (float)(i >> 8 & 255) / 255.0F;
//	               float f2 = (float)(i & 255) / 255.0F;
//	               this.func_241738_a_(p_241739_1_, p_241739_2_, p_241739_5_, flag1, p_241739_6_, f, f1, f2, this.getArmorResource(p_241739_3_, itemstack, p_241739_4_, null));
//	               this.func_241738_a_(p_241739_1_, p_241739_2_, p_241739_5_, flag1, p_241739_6_, 1.0F, 1.0F, 1.0F, this.getArmorResource(p_241739_3_, itemstack, p_241739_4_, "overlay"));
//	            } else {
//	               this.func_241738_a_(p_241739_1_, p_241739_2_, p_241739_5_, flag1, p_241739_6_, 1.0F, 1.0F, 1.0F, this.getArmorResource(p_241739_3_, itemstack, p_241739_4_, null));
//	            }
//
//	         }
//	      }
//	   }

}
