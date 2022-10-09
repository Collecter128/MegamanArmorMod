package com.collecter128.megamanarmormod.entity;

import java.util.Collection;
import java.util.Set;

import com.collecter128.megamanarmormod.core.EntityTypesInit;
import com.google.common.collect.Sets;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
//import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class bustershotentity extends AbstractArrowEntity{

//	public bustershotentity(EntityType<? extends AbstractArrowEntity> type, double x, double y, double z,
//			World worldIn) {
//		super(type, x, y, z, worldIn);
//	}
//	
//	public bustershotentity(World worldIn, double x, double y, double z) {
//		 super(EntityType.ARROW, x, y, z, worldIn);
//	}
//
//		   public bustershotentity(World worldIn, LivingEntity shooter) {
//		      super(EntityType.ARROW, shooter, worldIn);
//		   }
//
//		@Override
//		protected ItemStack getArrowStack() {
//			// TODO Auto-generated method stub
//			return null;
//		}
	
	   private static final DataParameter<Integer> COLOR = EntityDataManager.defineId(bustershotentity.class, DataSerializers.INT);
	   private Potion potion = Potions.EMPTY;
	   private final Set<EffectInstance> customPotionEffects = Sets.newHashSet();
	   private boolean fixedColor;
	   
	   private double damage = 2.0D;//normal arrow

	   public bustershotentity(EntityType<? extends bustershotentity> type, World worldIn) {
	      super(type, worldIn);
	      this.setNoGravity(true);
	   }

	   public bustershotentity(World worldIn, double x, double y, double z) {
	      super(EntityType.ARROW, x, y, z, worldIn);
	      //super(EntityTypesInit.BusterShot.get(), x, y, z, worldIn);
	   }

	   public bustershotentity(World worldIn, LivingEntity shooter) {
	      super(EntityType.ARROW, shooter, worldIn);
	      //super(EntityTypesInit.BusterShot.get(), shooter, worldIn);
	   }
	   public bustershotentity(World worldIn, LivingEntity shooter, float power) {
		      super(EntityType.ARROW, shooter, worldIn);
		      //super(EntityTypesInit.BusterShot.get(), shooter, worldIn);
		      this.damage = power;
		   }

	   public void setPotionEffect(ItemStack stack) {
	      if (stack.getItem() == Items.TIPPED_ARROW) {
	         this.potion = PotionUtils.getPotion(stack);
	         Collection<EffectInstance> collection = PotionUtils.getCustomEffects(stack);
	         if (!collection.isEmpty()) {
	            for(EffectInstance effectinstance : collection) {
	               this.customPotionEffects.add(new EffectInstance(effectinstance));
	            }
	         }

	         int i = getCustomColor(stack);
	         if (i == -1) {
	            this.refreshColor();
	         } else {
	            this.setFixedColor(i);
	         }
	      } else if (stack.getItem() == Items.ARROW) {
	         this.potion = Potions.EMPTY;
	         this.customPotionEffects.clear();
	         
	         this.setFixedColor(16698886); // Bustershot Yellow
	         
	         this.entityData.set(COLOR, 16698886);
	         //greensecond shot 458249
	         //Blue Third shot 1026303
	         //Pink Shot 16688583
	      }
	      
	      this.entityData.set(COLOR, 16698886);

	   }

	   public static int getCustomColor(ItemStack p_191508_0_) {
	      CompoundNBT compoundnbt = p_191508_0_.getTag();
	      return compoundnbt != null && compoundnbt.contains("CustomPotionColor", 99) ? compoundnbt.getInt("CustomPotionColor") : -1;
	   }

	   private void refreshColor() {
	      this.fixedColor = false;
	      if (this.potion == Potions.EMPTY && this.customPotionEffects.isEmpty()) {
	         this.entityData.set(COLOR, 16698886);
	      } else {
	         this.entityData.set(COLOR, PotionUtils.getColor(PotionUtils.getAllEffects(this.potion, this.customPotionEffects)));
	      }

	   }

	   public void addEffect(EffectInstance effect) {
	      this.customPotionEffects.add(effect);
	      this.getEntityData().set(COLOR, PotionUtils.getColor(PotionUtils.getAllEffects(this.potion, this.customPotionEffects)));
	   }

	   protected void registerData() {
	      super.defineSynchedData();
	      this.entityData.define(COLOR, 16698886);
	   }

	   /**
	    * Called to update the entity's position/logic.
	    */
	   public void tick() {
	      super.tick();
	      if (this.level.isClientSide) {
	         if (this.inGround) {
	            if (this.inGroundTime % 5 == 0) {
	               this.spawnPotionParticles(1);
	            }
	         } else {
	            this.spawnPotionParticles(2);
	         }
	      } else if (this.inGround && this.inGroundTime != 0 && !this.customPotionEffects.isEmpty() && this.inGroundTime >= 60) {
	         this.level.broadcastEntityEvent(this, (byte)0);
	         this.potion = Potions.EMPTY;
	         this.customPotionEffects.clear();
	         this.entityData.set(COLOR, 16698886);
	      }

	   }

	   private void spawnPotionParticles(int particleCount) {
	      int i = this.getColor();
	      if (i != -1 && particleCount > 0) {
	         double d0 = (double)(i >> 16 & 255) / 255.0D;
	         double d1 = (double)(i >> 8 & 255) / 255.0D;
	         double d2 = (double)(i >> 0 & 255) / 255.0D;

	         for(int j = 0; j < particleCount; ++j) {
	            this.level.addParticle(ParticleTypes.ENTITY_EFFECT, this.getRandomX(0.5D), this.getRandomY(), this.getRandomZ(0.5D), d0, d1, d2);
	         }

	      }
	   }

	   public int getColor() {
	      return this.entityData.get(COLOR);
	   }

	   private void setFixedColor(int p_191507_1_) {
	      this.fixedColor = true;
	      this.entityData.set(COLOR, p_191507_1_);
	   }

	   public void writeAdditional(CompoundNBT compound) {
	      super.addAdditionalSaveData(compound);
	      if (this.potion != Potions.EMPTY && this.potion != null) {
	         compound.putString("Potion", Registry.POTION.getKey(this.potion).toString());
	      }

	      if (this.fixedColor) {
	         compound.putInt("Color", this.getColor());
	      }

	      if (!this.customPotionEffects.isEmpty()) {
	         ListNBT listnbt = new ListNBT();

	         for(EffectInstance effectinstance : this.customPotionEffects) {
	            listnbt.add(effectinstance.save(new CompoundNBT()));
	         }

	         compound.put("CustomPotionEffects", listnbt);
	      }

	   }

	   /**
	    * (abstract) Protected helper method to read subclass entity data from NBT.
	    */
	   public void readAdditional(CompoundNBT compound) {
	      super.readAdditionalSaveData(compound);
	      if (compound.contains("Potion", 8)) {
	         this.potion = PotionUtils.getPotion(compound);
	      }

	      for(EffectInstance effectinstance : PotionUtils.getCustomEffects(compound)) {
	         this.addEffect(effectinstance);
	      }

	      if (compound.contains("Color", 99)) {
	         this.setFixedColor(compound.getInt("Color"));
	      } else {
	         this.refreshColor();
	      }

	   }

	   protected void arrowHit(LivingEntity living) {
	      super.doPostHurtEffects(living);

	      for(EffectInstance effectinstance : this.potion.getEffects()) {
	         living.addEffect(new EffectInstance(effectinstance.getEffect(), Math.max(effectinstance.getDuration() / 8, 1), effectinstance.getAmplifier(), effectinstance.isAmbient(), effectinstance.isVisible()));
	      }

	      if (!this.customPotionEffects.isEmpty()) {
	         for(EffectInstance effectinstance1 : this.customPotionEffects) {
	            living.addEffect(effectinstance1);
	         }
	      }

	   }

	   protected ItemStack getArrowStack() {
	      if (this.customPotionEffects.isEmpty() && this.potion == Potions.EMPTY) {
	         return new ItemStack(Items.ARROW);
	      } else {
	         ItemStack itemstack = new ItemStack(Items.TIPPED_ARROW);
	         PotionUtils.setPotion(itemstack, this.potion);
	         PotionUtils.setCustomEffects(itemstack, this.customPotionEffects);
	         if (this.fixedColor) {
	            itemstack.getOrCreateTag().putInt("CustomPotionColor", this.getColor());
	         }

	         return itemstack;
	      }
	   }

	   /**
	    * Handler for {@link World#setEntityState}
	    */
	   @OnlyIn(Dist.CLIENT)
	   public void handleStatusUpdate(byte id) {
	      if (id == 0) {
	         int i = this.getColor();
	         if (i != -1) {
	            double d0 = (double)(i >> 16 & 255) / 255.0D;
	            double d1 = (double)(i >> 8 & 255) / 255.0D;
	            double d2 = (double)(i >> 0 & 255) / 255.0D;

	            for(int j = 0; j < 20; ++j) {
	            	this.level.addParticle(ParticleTypes.ENTITY_EFFECT, this.getRandomX(0.5D), this.getRandomY(), this.getRandomZ(0.5D), d0, d1, d2);
	            }
	         }
	      } else {
	         super.handleEntityEvent(id);
	      }

	   }
	   
	   @Override
	   public double getBaseDamage() {
		   return this.damage;
	   }

	@Override
	protected ItemStack getPickupItem() {
		//return new ItemStack(Items.ARROW);
		return null;
	}
	
//	   /**
//    * The sound made when an entity is hit by this projectile
//    */
//   protected SoundEvent getHitEntitySound() {
//      return SoundEvents.ANVIL_HIT;
//   }
//	 protected SoundEvent getDefaultHitGroundSoundEvent() {
//    return SoundEvents.ARROW_HIT;
// }
//	   protected float getWaterInertia() {
//    return 0.6F;
// }

}
