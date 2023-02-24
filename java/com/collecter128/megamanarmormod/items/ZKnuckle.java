package com.collecter128.megamanarmormod.items;

import java.awt.Color;
import java.util.Objects;
import java.util.Random;

import com.collecter128.megamanarmormod.core.ItemInit;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

import net.minecraft.block.AbstractBannerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.client.renderer.entity.model.ShieldModel;
import net.minecraft.enchantment.IVanishable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.DyeColor;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.TieredItem;
import net.minecraft.item.ToolItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.MobSpawnerTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.spawner.AbstractSpawner;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ZKnuckle extends TieredItem implements IVanishable{

	private final float attackDamage;
	   private final Multimap<Attribute, AttributeModifier> defaultModifiers;
	
	public ZKnuckle(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Item.Properties p_i48460_4_) {
	      super(p_i48460_1_, p_i48460_4_);
	      this.attackDamage = (float)p_i48460_2_ + p_i48460_1_.getAttackDamageBonus();
	      Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
	      builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", (double)this.attackDamage, AttributeModifier.Operation.ADDITION));
	      builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", (double)p_i48460_3_, AttributeModifier.Operation.ADDITION));
	      this.defaultModifiers = builder.build();
		
	}
	
	public float getDamage() {
	      return this.attackDamage;
	   }
	
	public boolean hurtEnemy(ItemStack p_77644_1_, LivingEntity p_77644_2_, LivingEntity p_77644_3_) {
	      p_77644_1_.hurtAndBreak(1, p_77644_3_, (p_220045_0_) -> {
	         p_220045_0_.broadcastBreakEvent(EquipmentSlotType.MAINHAND);
	      });
	      return true;
	   }
	
	public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlotType p_111205_1_) {
	      return p_111205_1_ == EquipmentSlotType.MAINHAND ? this.defaultModifiers : super.getDefaultAttributeModifiers(p_111205_1_);
	   }
	   
	   /**
	    * Returns true if the item can be used on the given entity, e.g. shears on sheep.
	    */ 
	   public ActionResultType interactLivingEntity(ItemStack itemStack, PlayerEntity player, LivingEntity p_111207_3_, Hand p_111207_4_) {
		      if (p_111207_3_.isAlive()) {
		         if (!player.level.isClientSide) {
		        	 ItemStack Stoleitem;
		        	 int amount;
		            
		            if (p_111207_3_ instanceof MobEntity && p_111207_3_.getItemInHand(Hand.MAIN_HAND) != null) {
		               Stoleitem = p_111207_3_.getItemInHand(Hand.MAIN_HAND);
		               amount = Stoleitem.getCount();
		               player.inventory.add(Stoleitem);
		               p_111207_3_.getItemInHand(Hand.MAIN_HAND).shrink(amount);
		               //itemStack.setDamageValue(itemStack.getDamageValue() + 1);
		            }
		            else if(p_111207_3_ instanceof PlayerEntity && p_111207_3_.getItemInHand(Hand.MAIN_HAND) != null) {
		            	Stoleitem = p_111207_3_.getItemInHand(Hand.MAIN_HAND);
			            amount = Stoleitem.getCount();
			            player.inventory.add(Stoleitem);
			            p_111207_3_.getItemInHand(Hand.MAIN_HAND).shrink(amount);
			            //itemStack.setDamageValue(itemStack.getDamageValue() + 1);
		            }
		            itemStack.hurtAndBreak(1, player, (p_220045_0_) -> {
		   	         p_220045_0_.broadcastBreakEvent(EquipmentSlotType.MAINHAND);
		   	      });
		            
		         }

		         return ActionResultType.sidedSuccess(player.level.isClientSide);
		      } else {
		         return ActionResultType.PASS;
		      }
		   }
	   
        
//	   @OnlyIn(Dist.CLIENT)
//	   @Override
//	   public net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer getItemStackTileEntityRenderer() {
//	      net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer renderer = ister != null ? ister.get() : null;
//	      return renderer != null ? renderer : net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer.instance;
//	      //   private final ShieldModel modelShield = new ShieldModel();
//	      //this.modelShield.func_228293_a_().render(matrixStack, ivertexbuilder, combinedLight, combinedOverlay, 1.0F, 1.0F, 1.0F, 1.0F);
//	   }
	   
	   

}
