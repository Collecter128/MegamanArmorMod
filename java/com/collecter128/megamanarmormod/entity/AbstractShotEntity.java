package com.collecter128.megamanarmormod.entity;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
//import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AbstractShotEntity{//extends ProjectileEntity

//	AbstractShotEntity(EntityType<? extends ProjectileEntity> p_i231584_1_, World p_i231584_2_) {
//		super(p_i231584_1_, p_i231584_2_);
//		// TODO Auto-generated constructor stub
//	}

//	private static final DataParameter<Byte> CRITICAL = EntityDataManager.createKey(AbstractShotEntity.class, DataSerializers.BYTE);
//	   private static final DataParameter<Byte> PIERCE_LEVEL = EntityDataManager.createKey(AbstractShotEntity.class, DataSerializers.BYTE);
//	   @Nullable
//	   private BlockState inBlockState;
//	   protected boolean inGround;
//	   protected int timeInGround;
//	   public AbstractShotEntity.PickupStatus pickupStatus = AbstractShotEntity.PickupStatus.DISALLOWED;
//	   public int arrowShake;
//	   private int ticksInGround;
//	   private double damage = 2.0D;
//	   private int knockbackStrength;
//	   private SoundEvent hitSound = this.getHitEntitySound();
//	   private IntOpenHashSet piercedEntities;
//	   private List<Entity> hitEntities;
//
//	   public AbstractShotEntity(EntityType<? extends AbstractShotEntity> type, World worldIn) {
//	      super(type, worldIn);
//	   }
//
//	   public AbstractShotEntity(EntityType<? extends AbstractShotEntity> type, double x, double y, double z, World worldIn) {
//	      this(type, worldIn);
//	      this.setPosition(x, y, z);
//	   }
//
//	   public AbstractShotEntity(EntityType<? extends AbstractShotEntity> type, LivingEntity shooter, World worldIn) {
//	      this(type, shooter.getPosX(), shooter.getPosYEye() - (double)0.1F, shooter.getPosZ(), worldIn);
//	      this.setShooter(shooter);
////	      if (shooter instanceof PlayerEntity) {
////	         this.pickupStatus = AbstractArrowEntity.PickupStatus.ALLOWED;
////	      }
//
//	   }
//
//	   public void setHitSound(SoundEvent soundIn) {
//	      this.hitSound = soundIn;
//	   }
//
//	   /**
//	    * Checks if the entity is in range to render.
//	    */
//	   @OnlyIn(Dist.CLIENT)
//	   public boolean isInRangeToRenderDist(double distance) {
//	      double d0 = this.getBoundingBox().getAverageEdgeLength() * 10.0D;
//	      if (Double.isNaN(d0)) {
//	         d0 = 1.0D;
//	      }
//
//	      d0 = d0 * 64.0D * getRenderDistanceWeight();
//	      return distance < d0 * d0;
//	   }
//
//	   protected void registerData() {
//	      this.dataManager.register(CRITICAL, (byte)0);
//	      this.dataManager.register(PIERCE_LEVEL, (byte)0);
//	   }
//
//	   /**
//	    * Similar to setArrowHeading, it's point the throwable entity to a x, y, z direction.
//	    */
//	   public void shoot(double x, double y, double z, float velocity, float inaccuracy) {
//	      super.shoot(x, y, z, velocity, inaccuracy);
//	      this.ticksInGround = 0;
//	   }
//
//	   /**
//	    * Sets a target for the client to interpolate towards over the next few ticks
//	    */
//	   @OnlyIn(Dist.CLIENT)
//	   public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch, int posRotationIncrements, boolean teleport) {
//	      this.setPosition(x, y, z);
//	      this.setRotation(yaw, pitch);
//	   }
//
//	   /**
//	    * Updates the entity motion clientside, called by packets from the server
//	    */
//	   @OnlyIn(Dist.CLIENT)
//	   public void setVelocity(double x, double y, double z) {
//	      super.setVelocity(x, y, z);
//	      this.ticksInGround = 0;
//	   }
//
//	   /**
//	    * Called to update the entity's position/logic.
//	    */
//	   public void tick() {
//	      super.tick();
//	      boolean flag = this.getNoClip();
//	      Vector3d vector3d = this.getMotion();
//	      if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F) {
//	         float f = MathHelper.sqrt(horizontalMag(vector3d));
//	         this.rotationYaw = (float)(MathHelper.atan2(vector3d.x, vector3d.z) * (double)(180F / (float)Math.PI));
//	         this.rotationPitch = (float)(MathHelper.atan2(vector3d.y, (double)f) * (double)(180F / (float)Math.PI));
//	         this.prevRotationYaw = this.rotationYaw;
//	         this.prevRotationPitch = this.rotationPitch;
//	      }
//
//	      BlockPos blockpos = this.getPosition();
//	      BlockState blockstate = this.world.getBlockState(blockpos);
//	      if (!blockstate.isAir(this.world, blockpos) && !flag) {
//	         VoxelShape voxelshape = blockstate.getCollisionShape(this.world, blockpos);
//	         if (!voxelshape.isEmpty()) {
//	            Vector3d vector3d1 = this.getPositionVec();
//
//	            for(AxisAlignedBB axisalignedbb : voxelshape.toBoundingBoxList()) {
//	               if (axisalignedbb.offset(blockpos).contains(vector3d1)) {
//	                  this.inGround = true;
//	                  break;
//	               }
//	            }
//	         }
//	      }
//
//	      if (this.arrowShake > 0) {
//	         --this.arrowShake;
//	      }
//
//	      if (this.isWet()) {
//	         this.extinguish();
//	      }
//
//	      if (this.inGround && !flag) {
//	         if (this.inBlockState != blockstate && this.func_234593_u_()) {
//	            this.func_234594_z_();
//	         } else if (!this.world.isRemote) {
//	            this.func_225516_i_();
//	         }
//
//	         ++this.timeInGround;
//	      } else {
//	         this.timeInGround = 0;
//	         Vector3d vector3d2 = this.getPositionVec();
//	         Vector3d vector3d3 = vector3d2.add(vector3d);
//	         RayTraceResult raytraceresult = this.world.rayTraceBlocks(new RayTraceContext(vector3d2, vector3d3, RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, this));
//	         if (raytraceresult.getType() != RayTraceResult.Type.MISS) {
//	            vector3d3 = raytraceresult.getHitVec();
//	         }
//
//	         while(!this.removed) {
//	            EntityRayTraceResult entityraytraceresult = this.rayTraceEntities(vector3d2, vector3d3);
//	            if (entityraytraceresult != null) {
//	               raytraceresult = entityraytraceresult;
//	            }
//
//	            if (raytraceresult != null && raytraceresult.getType() == RayTraceResult.Type.ENTITY) {
//	               Entity entity = ((EntityRayTraceResult)raytraceresult).getEntity();
//	               Entity entity1 = this.func_234616_v_();
//	               if (entity instanceof PlayerEntity && entity1 instanceof PlayerEntity && !((PlayerEntity)entity1).canAttackPlayer((PlayerEntity)entity)) {
//	                  raytraceresult = null;
//	                  entityraytraceresult = null;
//	               }
//	            }
//
//	            if (raytraceresult != null && raytraceresult.getType() != RayTraceResult.Type.MISS && !flag && !net.minecraftforge.event.ForgeEventFactory.onProjectileImpact(this, raytraceresult)) {
//	               this.onImpact(raytraceresult);
//	               this.isAirBorne = true;
//	            }
//
//	            if (entityraytraceresult == null || this.getPierceLevel() <= 0) {
//	               break;
//	            }
//
//	            raytraceresult = null;
//	         }
//
//	         vector3d = this.getMotion();
//	         double d3 = vector3d.x;
//	         double d4 = vector3d.y;
//	         double d0 = vector3d.z;
//	         if (this.getIsCritical()) {
//	            for(int i = 0; i < 4; ++i) {
//	               this.world.addParticle(ParticleTypes.CRIT, this.getPosX() + d3 * (double)i / 4.0D, this.getPosY() + d4 * (double)i / 4.0D, this.getPosZ() + d0 * (double)i / 4.0D, -d3, -d4 + 0.2D, -d0);
//	            }
//	         }
//
//	         double d5 = this.getPosX() + d3;
//	         double d1 = this.getPosY() + d4;
//	         double d2 = this.getPosZ() + d0;
//	         float f1 = MathHelper.sqrt(horizontalMag(vector3d));
//	         if (flag) {
//	            this.rotationYaw = (float)(MathHelper.atan2(-d3, -d0) * (double)(180F / (float)Math.PI));
//	         } else {
//	            this.rotationYaw = (float)(MathHelper.atan2(d3, d0) * (double)(180F / (float)Math.PI));
//	         }
//
//	         this.rotationPitch = (float)(MathHelper.atan2(d4, (double)f1) * (double)(180F / (float)Math.PI));
//	         this.rotationPitch = func_234614_e_(this.prevRotationPitch, this.rotationPitch);
//	         this.rotationYaw = func_234614_e_(this.prevRotationYaw, this.rotationYaw);
//	         float f2 = 0.99F;
//	         float f3 = 0.05F;
//	         if (this.isInWater()) {
//	            for(int j = 0; j < 4; ++j) {
//	               float f4 = 0.25F;
//	               this.world.addParticle(ParticleTypes.BUBBLE, d5 - d3 * 0.25D, d1 - d4 * 0.25D, d2 - d0 * 0.25D, d3, d4, d0);
//	            }
//
//	            f2 = this.getWaterDrag();
//	         }
//
//	         this.setMotion(vector3d.scale((double)f2));
//	         if (!this.hasNoGravity() && !flag) {
//	            Vector3d vector3d4 = this.getMotion();
//	            this.setMotion(vector3d4.x, vector3d4.y - (double)0.05F, vector3d4.z);
//	         }
//
//	         this.setPosition(d5, d1, d2);
//	         this.doBlockCollisions();
//	      }
//	   }
//
//	   private boolean func_234593_u_() {
//	      return this.inGround && this.world.hasNoCollisions((new AxisAlignedBB(this.getPositionVec(), this.getPositionVec())).grow(0.06D));
//	   }
//
//	   private void func_234594_z_() {
//	      this.inGround = false;
//	      Vector3d vector3d = this.getMotion();
//	      this.setMotion(vector3d.mul((double)(this.rand.nextFloat() * 0.2F), (double)(this.rand.nextFloat() * 0.2F), (double)(this.rand.nextFloat() * 0.2F)));
//	      this.ticksInGround = 0;
//	   }
//
//	   public void move(MoverType typeIn, Vector3d pos) {
//	      super.move(typeIn, pos);
//	      if (typeIn != MoverType.SELF && this.func_234593_u_()) {
//	         this.func_234594_z_();
//	      }
//
//	   }
//
//	   protected void func_225516_i_() {
//	      ++this.ticksInGround;
//	      if (this.ticksInGround >= 1200) {
//	         this.remove();
//	      }
//
//	   }
//
//	   private void func_213870_w() {
//	      if (this.hitEntities != null) {
//	         this.hitEntities.clear();
//	      }
//
//	      if (this.piercedEntities != null) {
//	         this.piercedEntities.clear();
//	      }
//
//	   }
//
//	   /**
//	    * Called when the arrow hits an entity
//	    */
//	   protected void onEntityHit(EntityRayTraceResult p_213868_1_) {
//	      super.onEntityHit(p_213868_1_);
//	      Entity entity = p_213868_1_.getEntity();
//	      float f = (float)this.getMotion().length();
//	      int i = MathHelper.ceil(MathHelper.clamp((double)f * this.damage, 0.0D, 2.147483647E9D));
//	      if (this.getPierceLevel() > 0) {
//	         if (this.piercedEntities == null) {
//	            this.piercedEntities = new IntOpenHashSet(5);
//	         }
//
//	         if (this.hitEntities == null) {
//	            this.hitEntities = Lists.newArrayListWithCapacity(5);
//	         }
//
//	         if (this.piercedEntities.size() >= this.getPierceLevel() + 1) {
//	            this.remove();
//	            return;
//	         }
//
//	         this.piercedEntities.add(entity.getEntityId());
//	      }
//
//	      if (this.getIsCritical()) {
//	         long j = (long)this.rand.nextInt(i / 2 + 2);
//	         i = (int)Math.min(j + (long)i, 2147483647L);
//	      }
//
//	      Entity entity1 = this.func_234616_v_();
//	      DamageSource damagesource;
//	      if (entity1 == null) {
//	         damagesource = DamageSource.GENERIC;
//	      } else {
//	         damagesource = DamageSource.GENERIC;     //.causeArrowDamage(this, entity1);
//	         if (entity1 instanceof LivingEntity) {
//	            ((LivingEntity)entity1).setLastAttackedEntity(entity);
//	         }
//	      }
//
//	      boolean flag = entity.getType() == EntityType.ENDERMAN;
//	      int k = entity.getFireTimer();
//	      if (this.isBurning() && !flag) {
//	         entity.setFire(5);
//	      }
//
//	      if (entity.attackEntityFrom(damagesource, (float)i)) {
//	         if (flag) {
//	            return;
//	         }
//
//	         if (entity instanceof LivingEntity) {
//	            LivingEntity livingentity = (LivingEntity)entity;
//	            if (!this.world.isRemote && this.getPierceLevel() <= 0) {
//	               livingentity.setArrowCountInEntity(livingentity.getArrowCountInEntity() + 1);
//	            }
//
//	            if (this.knockbackStrength > 0) {
//	               Vector3d vector3d = this.getMotion().mul(1.0D, 0.0D, 1.0D).normalize().scale((double)this.knockbackStrength * 0.6D);
//	               if (vector3d.lengthSquared() > 0.0D) {
//	                  livingentity.addVelocity(vector3d.x, 0.1D, vector3d.z);
//	               }
//	            }
//
//	            if (!this.world.isRemote && entity1 instanceof LivingEntity) {
//	               EnchantmentHelper.applyThornEnchantments(livingentity, entity1);
//	               EnchantmentHelper.applyArthropodEnchantments((LivingEntity)entity1, livingentity);
//	            }
//
//	            this.arrowHit(livingentity);
//	            if (entity1 != null && livingentity != entity1 && livingentity instanceof PlayerEntity && entity1 instanceof ServerPlayerEntity && !this.isSilent()) {
//	               ((ServerPlayerEntity)entity1).connection.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241770_g_, 0.0F));
//	            }
//
//	            if (!entity.isAlive() && this.hitEntities != null) {
//	               this.hitEntities.add(livingentity);
//	            }
//
//	            if (!this.world.isRemote && entity1 instanceof ServerPlayerEntity) {
//	               ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)entity1;
//	               if (this.hitEntities != null && this.getShotFromCrossbow()) {
//	                  CriteriaTriggers.KILLED_BY_CROSSBOW.test(serverplayerentity, this.hitEntities);
//	               } else if (!entity.isAlive() && this.getShotFromCrossbow()) {
//	                  CriteriaTriggers.KILLED_BY_CROSSBOW.test(serverplayerentity, Arrays.asList(entity));
//	               }
//	            }
//	         }
//
//	         this.playSound(this.hitSound, 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
//	         if (this.getPierceLevel() <= 0) {
//	            this.remove();
//	         }
//	      } else {
//	         entity.forceFireTicks(k);
//	         this.setMotion(this.getMotion().scale(-0.1D));
//	         this.rotationYaw += 180.0F;
//	         this.prevRotationYaw += 180.0F;
//	         if (!this.world.isRemote && this.getMotion().lengthSquared() < 1.0E-7D) {
////	            if (this.pickupStatus == AbstractShotEntity.PickupStatus.ALLOWED) {
////	               this.entityDropItem(this.getArrowStack(), 0.1F);
////	            }
//
//	            this.remove();
//	         }
//	      }
//
//	   }
//
//	   protected void func_230299_a_(BlockRayTraceResult p_230299_1_) {
//	      this.inBlockState = this.world.getBlockState(p_230299_1_.getPos());
//	      super.func_230299_a_(p_230299_1_);
//	      Vector3d vector3d = p_230299_1_.getHitVec().subtract(this.getPosX(), this.getPosY(), this.getPosZ());
//	      this.setMotion(vector3d);
//	      Vector3d vector3d1 = vector3d.normalize().scale((double)0.05F);
//	      this.setRawPosition(this.getPosX() - vector3d1.x, this.getPosY() - vector3d1.y, this.getPosZ() - vector3d1.z);
//	      this.playSound(this.getHitGroundSound(), 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
//	      this.inGround = true;
//	      this.arrowShake = 7;
//	      this.setIsCritical(false);
//	      this.setPierceLevel((byte)0);
//	      this.setHitSound(SoundEvents.ENTITY_ARROW_HIT);
//	      this.setShotFromCrossbow(false);
//	      this.func_213870_w();
//	   }
//
//	   /**
//	    * The sound made when an entity is hit by this projectile
//	    */
//	   protected SoundEvent getHitEntitySound() {
//	      return SoundEvents.ENTITY_ARROW_HIT;
//	   }
//
//	   protected final SoundEvent getHitGroundSound() {
//	      return this.hitSound;
//	   }
//
//	   protected void arrowHit(LivingEntity living) {
//	   }
//
//	   /**
//	    * Gets the EntityRayTraceResult representing the entity hit
//	    */
//	   @Nullable
//	   protected EntityRayTraceResult rayTraceEntities(Vector3d startVec, Vector3d endVec) {
//	      return ProjectileHelper.rayTraceEntities(this.world, this, startVec, endVec, this.getBoundingBox().expand(this.getMotion()).grow(1.0D), this::func_230298_a_);
//	   }
//
//	   protected boolean func_230298_a_(Entity p_230298_1_) {
//	      return super.func_230298_a_(p_230298_1_) && (this.piercedEntities == null || !this.piercedEntities.contains(p_230298_1_.getEntityId()));
//	   }
//
//	   public void writeAdditional(CompoundNBT compound) {
//	      super.writeAdditional(compound);
//	      compound.putShort("life", (short)this.ticksInGround);
//	      if (this.inBlockState != null) {
//	         compound.put("inBlockState", NBTUtil.writeBlockState(this.inBlockState));
//	      }
//
//	      compound.putByte("shake", (byte)this.arrowShake);
//	      compound.putBoolean("inGround", this.inGround);
//	      compound.putByte("pickup", (byte)this.pickupStatus.ordinal());
//	      compound.putDouble("damage", this.damage);
//	      compound.putBoolean("crit", this.getIsCritical());
//	      compound.putByte("PierceLevel", this.getPierceLevel());
//	      compound.putString("SoundEvent", Registry.SOUND_EVENT.getKey(this.hitSound).toString());
//	      compound.putBoolean("ShotFromCrossbow", this.getShotFromCrossbow());
//	   }
//
//	   /**
//	    * (abstract) Protected helper method to read subclass entity data from NBT.
//	    */
//	   public void readAdditional(CompoundNBT compound) {
//	      super.readAdditional(compound);
//	      this.ticksInGround = compound.getShort("life");
//	      if (compound.contains("inBlockState", 10)) {
//	         this.inBlockState = NBTUtil.readBlockState(compound.getCompound("inBlockState"));
//	      }
//
//	      this.arrowShake = compound.getByte("shake") & 255;
//	      this.inGround = compound.getBoolean("inGround");
//	      if (compound.contains("damage", 99)) {
//	         this.damage = compound.getDouble("damage");
//	      }
//
////	      if (compound.contains("pickup", 99)) {
////	         this.pickupStatus = AbstractShotEntity.PickupStatus.getByOrdinal(compound.getByte("pickup"));
////	      } else if (compound.contains("player", 99)) {
////	         this.pickupStatus = compound.getBoolean("player") ? AbstractShotEntity.PickupStatus.ALLOWED : AbstractShotEntity.PickupStatus.DISALLOWED;
////	      }
//
//	      this.setIsCritical(compound.getBoolean("crit"));
//	      this.setPierceLevel(compound.getByte("PierceLevel"));
//	      if (compound.contains("SoundEvent", 8)) {
//	         this.hitSound = Registry.SOUND_EVENT.getOptional(new ResourceLocation(compound.getString("SoundEvent"))).orElse(this.getHitEntitySound());
//	      }
//
//	      this.setShotFromCrossbow(compound.getBoolean("ShotFromCrossbow"));
//	   }
//
//	   public void setShooter(@Nullable Entity entityIn) {
//	      super.setShooter(entityIn);
//	      if (entityIn instanceof PlayerEntity) {
//	         //this.pickupStatus = ((PlayerEntity)entityIn).abilities.isCreativeMode ? AbstractShotEntity.PickupStatus.CREATIVE_ONLY : AbstractArrowEntity.PickupStatus.ALLOWED;
//	      }
//
//	   }
//
//	   /**
//	    * Called by a player entity when they collide with an entity
//	    */
//	   public void onCollideWithPlayer(PlayerEntity entityIn) {
//	      if (!this.world.isRemote && (this.inGround || this.getNoClip()) && this.arrowShake <= 0) {
//	         //boolean flag =  this.pickupStatus == AbstractArrowEntity.PickupStatus.ALLOWED || this.pickupStatus == AbstractArrowEntity.PickupStatus.CREATIVE_ONLY && entityIn.abilities.isCreativeMode || this.getNoClip() && this.func_234616_v_().getUniqueID() == entityIn.getUniqueID();
//	         //if (this.pickupStatus == AbstractShotEntity.PickupStatus.ALLOWED && !entityIn.inventory.addItemStackToInventory(this.getArrowStack())) {
//	          //  flag = false;
//	         //}
//
//	         //if (flag) {
//	            entityIn.onItemPickup(this, 1);
//	            this.remove();
//	         //}
//
//	      }
//	   }
//
//	   //protected abstract ItemStack getArrowStack();
//
//	   protected boolean canTriggerWalking() {
//	      return false;
//	   }
//
//	   public void setDamage(double damageIn) {
//	      this.damage = damageIn;
//	   }
//
//	   public double getDamage() {
//	      return this.damage;
//	   }
//
//	   /**
//	    * Sets the amount of knockback the arrow applies when it hits a mob.
//	    */
//	   public void setKnockbackStrength(int knockbackStrengthIn) {
//	      this.knockbackStrength = knockbackStrengthIn;
//	   }
//
//	   /**
//	    * Returns true if it's possible to attack this entity with an item.
//	    */
//	   public boolean canBeAttackedWithItem() {
//	      return false;
//	   }
//
//	   protected float getEyeHeight(Pose poseIn, EntitySize sizeIn) {
//	      return 0.13F;
//	   }
//
//	   /**
//	    * Whether the arrow has a stream of critical hit particles flying behind it.
//	    */
//	   public void setIsCritical(boolean critical) {
//	      this.setArrowFlag(1, critical);
//	   }
//
//	   public void setPierceLevel(byte level) {
//	      this.dataManager.set(PIERCE_LEVEL, level);
//	   }
//
//	   private void setArrowFlag(int p_203049_1_, boolean p_203049_2_) {
//	      byte b0 = this.dataManager.get(CRITICAL);
//	      if (p_203049_2_) {
//	         this.dataManager.set(CRITICAL, (byte)(b0 | p_203049_1_));
//	      } else {
//	         this.dataManager.set(CRITICAL, (byte)(b0 & ~p_203049_1_));
//	      }
//
//	   }
//
//	   /**
//	    * Whether the arrow has a stream of critical hit particles flying behind it.
//	    */
//	   public boolean getIsCritical() {
//	      byte b0 = this.dataManager.get(CRITICAL);
//	      return (b0 & 1) != 0;
//	   }
//
//	   /**
//	    * Whether the arrow was shot from a crossbow.
//	    */
//	   public boolean getShotFromCrossbow() {
//	      byte b0 = this.dataManager.get(CRITICAL);
//	      return (b0 & 4) != 0;
//	   }
//
//	   public byte getPierceLevel() {
//	      return this.dataManager.get(PIERCE_LEVEL);
//	   }
//
//	   public void setEnchantmentEffectsFromEntity(LivingEntity p_190547_1_, float p_190547_2_) {
//	      int i = EnchantmentHelper.getMaxEnchantmentLevel(Enchantments.POWER, p_190547_1_);
//	      int j = EnchantmentHelper.getMaxEnchantmentLevel(Enchantments.PUNCH, p_190547_1_);
//	      this.setDamage((double)(p_190547_2_ * 2.0F) + this.rand.nextGaussian() * 0.25D + (double)((float)this.world.getDifficulty().getId() * 0.11F));
//	      if (i > 0) {
//	         this.setDamage(this.getDamage() + (double)i * 0.5D + 0.5D);
//	      }
//
//	      if (j > 0) {
//	         this.setKnockbackStrength(j);
//	      }
//
//	      if (EnchantmentHelper.getMaxEnchantmentLevel(Enchantments.FLAME, p_190547_1_) > 0) {
//	         this.setFire(100);
//	      }
//
//	   }
//
//	   protected float getWaterDrag() {
//	      return 0.6F;
//	   }
//
//	   /**
//	    * Sets if this arrow can noClip
//	    */
//	   public void setNoClip(boolean noClipIn) {
//	      this.noClip = noClipIn;
//	      this.setArrowFlag(2, noClipIn);
//	   }
//
//	   /**
//	    * Whether the arrow can noClip
//	    */
//	   public boolean getNoClip() {
//	      if (!this.world.isRemote) {
//	         return this.noClip;
//	      } else {
//	         return (this.dataManager.get(CRITICAL) & 2) != 0;
//	      }
//	   }
//
//	   /**
//	    * Sets data about if this arrow entity was shot from a crossbow
//	    */
//	   public void setShotFromCrossbow(boolean fromCrossbow) {
//	      this.setArrowFlag(4, fromCrossbow);
//	   }
//
//	   public IPacket<?> createSpawnPacket() {
//	      Entity entity = this.func_234616_v_();
//	      return new SSpawnObjectPacket(this, entity == null ? 0 : entity.getEntityId());
//	   }
//
//	   public static enum PickupStatus {
//	      DISALLOWED,
//	      ALLOWED,
//	      CREATIVE_ONLY;
//
//	      public static AbstractShotEntity.PickupStatus getByOrdinal(int ordinal) {
//	         if (ordinal < 0 || ordinal > values().length) {
//	            ordinal = 0;
//	         }
//
//	         return values()[ordinal];
//	      }
//	   }
	
	//---------------------------------------------------------
	
//	 private static final DataParameter<Byte> ID_FLAGS = EntityDataManager.defineId(AbstractArrowEntity.class, DataSerializers.BYTE);
//	   private static final DataParameter<Byte> PIERCE_LEVEL = EntityDataManager.defineId(AbstractArrowEntity.class, DataSerializers.BYTE);
//	   @Nullable
//	   private BlockState lastState;
//	   protected boolean inGround;
//	   protected int inGroundTime;
//	   public AbstractArrowEntity.PickupStatus pickup = AbstractArrowEntity.PickupStatus.DISALLOWED;
//	   public int shakeTime;
//	   private int life;
//	   private double baseDamage = 2.0D;
//	   private int knockback;
//	   private SoundEvent soundEvent = this.getDefaultHitGroundSoundEvent();
//	   private IntOpenHashSet piercingIgnoreEntityIds;
//	   private List<Entity> piercedAndKilledEntities;
//
//	   protected AbstractShotEntity(EntityType<? extends AbstractShotEntity> p_i48546_1_, World p_i48546_2_) {
//	      super(p_i48546_1_, p_i48546_2_);
//	   }
//
//	   protected AbstractShotEntity(EntityType<? extends AbstractShotEntity> p_i48547_1_, double p_i48547_2_, double p_i48547_4_, double p_i48547_6_, World p_i48547_8_) {
//	      this(p_i48547_1_, p_i48547_8_);
//	      this.setPos(p_i48547_2_, p_i48547_4_, p_i48547_6_);
//	   }
//
//	   protected AbstractShotEntity(EntityType<? extends AbstractShotEntity> p_i48548_1_, LivingEntity p_i48548_2_, World p_i48548_3_) {
//	      this(p_i48548_1_, p_i48548_2_.getX(), p_i48548_2_.getEyeY() - (double)0.1F, p_i48548_2_.getZ(), p_i48548_3_);
//	      this.setOwner(p_i48548_2_);
//	      if (p_i48548_2_ instanceof PlayerEntity) {
//	         this.pickup = AbstractShotEntity.PickupStatus.ALLOWED;
//	      }
//
//	   }
//
//	   public void setSoundEvent(SoundEvent p_213869_1_) {
//	      this.soundEvent = p_213869_1_;
//	   }
//
//	   @OnlyIn(Dist.CLIENT)
//	   public boolean shouldRenderAtSqrDistance(double p_70112_1_) {
//	      double d0 = this.getBoundingBox().getSize() * 10.0D;
//	      if (Double.isNaN(d0)) {
//	         d0 = 1.0D;
//	      }
//
//	      d0 = d0 * 64.0D * getViewScale();
//	      return p_70112_1_ < d0 * d0;
//	   }
//
//	   protected void defineSynchedData() {
//	      this.entityData.define(ID_FLAGS, (byte)0);
//	      this.entityData.define(PIERCE_LEVEL, (byte)0);
//	   }
//
//	   public void shoot(double p_70186_1_, double p_70186_3_, double p_70186_5_, float p_70186_7_, float p_70186_8_) {
//	      super.shoot(p_70186_1_, p_70186_3_, p_70186_5_, p_70186_7_, p_70186_8_);
//	      this.life = 0;
//	   }
//
//	   @OnlyIn(Dist.CLIENT)
//	   public void lerpTo(double p_180426_1_, double p_180426_3_, double p_180426_5_, float p_180426_7_, float p_180426_8_, int p_180426_9_, boolean p_180426_10_) {
//	      this.setPos(p_180426_1_, p_180426_3_, p_180426_5_);
//	      this.setRot(p_180426_7_, p_180426_8_);
//	   }
//
//	   @OnlyIn(Dist.CLIENT)
//	   public void lerpMotion(double p_70016_1_, double p_70016_3_, double p_70016_5_) {
//	      super.lerpMotion(p_70016_1_, p_70016_3_, p_70016_5_);
//	      this.life = 0;
//	   }
//
//	   public void tick() {
//	      super.tick();
//	      boolean flag = this.isNoPhysics();
//	      Vector3d vector3d = this.getDeltaMovement();
//	      if (this.xRotO == 0.0F && this.yRotO == 0.0F) {
//	         float f = MathHelper.sqrt(getHorizontalDistanceSqr(vector3d));
//	         this.yRot = (float)(MathHelper.atan2(vector3d.x, vector3d.z) * (double)(180F / (float)Math.PI));
//	         this.xRot = (float)(MathHelper.atan2(vector3d.y, (double)f) * (double)(180F / (float)Math.PI));
//	         this.yRotO = this.yRot;
//	         this.xRotO = this.xRot;
//	      }
//
//	      BlockPos blockpos = this.blockPosition();
//	      BlockState blockstate = this.level.getBlockState(blockpos);
//	      if (!blockstate.isAir(this.level, blockpos) && !flag) {
//	         VoxelShape voxelshape = blockstate.getCollisionShape(this.level, blockpos);
//	         if (!voxelshape.isEmpty()) {
//	            Vector3d vector3d1 = this.position();
//
//	            for(AxisAlignedBB axisalignedbb : voxelshape.toAabbs()) {
//	               if (axisalignedbb.move(blockpos).contains(vector3d1)) {
//	                  this.inGround = true;
//	                  break;
//	               }
//	            }
//	         }
//	      }
//
//	      if (this.shakeTime > 0) {
//	         --this.shakeTime;
//	      }
//
//	      if (this.isInWaterOrRain()) {
//	         this.clearFire();
//	      }
//
//	      if (this.inGround && !flag) {
//	         if (this.lastState != blockstate && this.shouldFall()) {
//	            this.startFalling();
//	         } else if (!this.level.isClientSide) {
//	            this.tickDespawn();
//	         }
//
//	         ++this.inGroundTime;
//	      } else {
//	         this.inGroundTime = 0;
//	         Vector3d vector3d2 = this.position();
//	         Vector3d vector3d3 = vector3d2.add(vector3d);
//	         RayTraceResult raytraceresult = this.level.clip(new RayTraceContext(vector3d2, vector3d3, RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, this));
//	         if (raytraceresult.getType() != RayTraceResult.Type.MISS) {
//	            vector3d3 = raytraceresult.getLocation();
//	         }
//
//	         while(!this.removed) {
//	            EntityRayTraceResult entityraytraceresult = this.findHitEntity(vector3d2, vector3d3);
//	            if (entityraytraceresult != null) {
//	               raytraceresult = entityraytraceresult;
//	            }
//
//	            if (raytraceresult != null && raytraceresult.getType() == RayTraceResult.Type.ENTITY) {
//	               Entity entity = ((EntityRayTraceResult)raytraceresult).getEntity();
//	               Entity entity1 = this.getOwner();
//	               if (entity instanceof PlayerEntity && entity1 instanceof PlayerEntity && !((PlayerEntity)entity1).canHarmPlayer((PlayerEntity)entity)) {
//	                  raytraceresult = null;
//	                  entityraytraceresult = null;
//	               }
//	            }
//
//	            if (raytraceresult != null && raytraceresult.getType() != RayTraceResult.Type.MISS && !flag && !net.minecraftforge.event.ForgeEventFactory.onProjectileImpact(this, raytraceresult)) {
//	               this.onHit(raytraceresult);
//	               this.hasImpulse = true;
//	            }
//
//	            if (entityraytraceresult == null || this.getPierceLevel() <= 0) {
//	               break;
//	            }
//
//	            raytraceresult = null;
//	         }
//
//	         vector3d = this.getDeltaMovement();
//	         double d3 = vector3d.x;
//	         double d4 = vector3d.y;
//	         double d0 = vector3d.z;
//	         if (this.isCritArrow()) {
//	            for(int i = 0; i < 4; ++i) {
//	               this.level.addParticle(ParticleTypes.CRIT, this.getX() + d3 * (double)i / 4.0D, this.getY() + d4 * (double)i / 4.0D, this.getZ() + d0 * (double)i / 4.0D, -d3, -d4 + 0.2D, -d0);
//	            }
//	         }
//
//	         double d5 = this.getX() + d3;
//	         double d1 = this.getY() + d4;
//	         double d2 = this.getZ() + d0;
//	         float f1 = MathHelper.sqrt(getHorizontalDistanceSqr(vector3d));
//	         if (flag) {
//	            this.yRot = (float)(MathHelper.atan2(-d3, -d0) * (double)(180F / (float)Math.PI));
//	         } else {
//	            this.yRot = (float)(MathHelper.atan2(d3, d0) * (double)(180F / (float)Math.PI));
//	         }
//
//	         this.xRot = (float)(MathHelper.atan2(d4, (double)f1) * (double)(180F / (float)Math.PI));
//	         this.xRot = lerpRotation(this.xRotO, this.xRot);
//	         this.yRot = lerpRotation(this.yRotO, this.yRot);
//	         float f2 = 0.99F;
//	         float f3 = 0.05F;
//	         if (this.isInWater()) {
//	            for(int j = 0; j < 4; ++j) {
//	               float f4 = 0.25F;
//	               this.level.addParticle(ParticleTypes.BUBBLE, d5 - d3 * 0.25D, d1 - d4 * 0.25D, d2 - d0 * 0.25D, d3, d4, d0);
//	            }
//
//	            f2 = this.getWaterInertia();
//	         }
//
//	         this.setDeltaMovement(vector3d.scale((double)f2));
//	         if (!this.isNoGravity() && !flag) {
//	            Vector3d vector3d4 = this.getDeltaMovement();
//	            this.setDeltaMovement(vector3d4.x, vector3d4.y - (double)0.05F, vector3d4.z);
//	         }
//
//	         this.setPos(d5, d1, d2);
//	         this.checkInsideBlocks();
//	      }
//	   }
//
//	   private boolean shouldFall() {
//	      return this.inGround && this.level.noCollision((new AxisAlignedBB(this.position(), this.position())).inflate(0.06D));
//	   }
//
//	   private void startFalling() {
//	      this.inGround = false;
//	      Vector3d vector3d = this.getDeltaMovement();
//	      this.setDeltaMovement(vector3d.multiply((double)(this.random.nextFloat() * 0.2F), (double)(this.random.nextFloat() * 0.2F), (double)(this.random.nextFloat() * 0.2F)));
//	      this.life = 0;
//	   }
//
//	   public void move(MoverType p_213315_1_, Vector3d p_213315_2_) {
//	      super.move(p_213315_1_, p_213315_2_);
//	      if (p_213315_1_ != MoverType.SELF && this.shouldFall()) {
//	         this.startFalling();
//	      }
//
//	   }
//
//	   protected void tickDespawn() {
//	      ++this.life;
//	      if (this.life >= 1200) {
//	         this.remove();
//	      }
//
//	   }
//
//	   private void resetPiercedEntities() {
//	      if (this.piercedAndKilledEntities != null) {
//	         this.piercedAndKilledEntities.clear();
//	      }
//
//	      if (this.piercingIgnoreEntityIds != null) {
//	         this.piercingIgnoreEntityIds.clear();
//	      }
//
//	   }
//
//	   protected void onHitEntity(EntityRayTraceResult p_213868_1_) {
//	      super.onHitEntity(p_213868_1_);
//	      Entity entity = p_213868_1_.getEntity();
//	      float f = (float)this.getDeltaMovement().length();
//	      int i = MathHelper.ceil(MathHelper.clamp((double)f * this.baseDamage, 0.0D, 2.147483647E9D));
//	      if (this.getPierceLevel() > 0) {
//	         if (this.piercingIgnoreEntityIds == null) {
//	            this.piercingIgnoreEntityIds = new IntOpenHashSet(5);
//	         }
//
//	         if (this.piercedAndKilledEntities == null) {
//	            this.piercedAndKilledEntities = Lists.newArrayListWithCapacity(5);
//	         }
//
//	         if (this.piercingIgnoreEntityIds.size() >= this.getPierceLevel() + 1) {
//	            this.remove();
//	            return;
//	         }
//
//	         this.piercingIgnoreEntityIds.add(entity.getId());
//	      }
//
//	      if (this.isCritArrow()) {
//	         long j = (long)this.random.nextInt(i / 2 + 2);
//	         i = (int)Math.min(j + (long)i, 2147483647L);
//	      }
//
//	      Entity entity1 = this.getOwner();
//	      DamageSource damagesource;
//	      if (entity1 == null) {
//	         damagesource = DamageSource.MAGIC; //.arrow(this, this);
//	      } else {
//	         damagesource = DamageSource.MAGIC; //.arrow(this, entity1);
//	         if (entity1 instanceof LivingEntity) {
//	            ((LivingEntity)entity1).setLastHurtMob(entity);
//	         }
//	      }
//
//	      boolean flag = entity.getType() == EntityType.ENDERMAN;
//	      int k = entity.getRemainingFireTicks();
//	      if (this.isOnFire() && !flag) {
//	         entity.setSecondsOnFire(5);
//	      }
//
//	      if (entity.hurt(damagesource, (float)i)) {
//	         if (flag) {
//	            return;
//	         }
//
//	         if (entity instanceof LivingEntity) {
//	            LivingEntity livingentity = (LivingEntity)entity;
//	            if (!this.level.isClientSide && this.getPierceLevel() <= 0) {
//	               livingentity.setArrowCount(livingentity.getArrowCount() + 1);
//	            }
//
//	            if (this.knockback > 0) {
//	               Vector3d vector3d = this.getDeltaMovement().multiply(1.0D, 0.0D, 1.0D).normalize().scale((double)this.knockback * 0.6D);
//	               if (vector3d.lengthSqr() > 0.0D) {
//	                  livingentity.push(vector3d.x, 0.1D, vector3d.z);
//	               }
//	            }
//
//	            if (!this.level.isClientSide && entity1 instanceof LivingEntity) {
//	               EnchantmentHelper.doPostHurtEffects(livingentity, entity1);
//	               EnchantmentHelper.doPostDamageEffects((LivingEntity)entity1, livingentity);
//	            }
//
//	            this.doPostHurtEffects(livingentity);
//	            if (entity1 != null && livingentity != entity1 && livingentity instanceof PlayerEntity && entity1 instanceof ServerPlayerEntity && !this.isSilent()) {
//	               ((ServerPlayerEntity)entity1).connection.send(new SChangeGameStatePacket(SChangeGameStatePacket.ARROW_HIT_PLAYER, 0.0F));
//	            }
//
//	            if (!entity.isAlive() && this.piercedAndKilledEntities != null) {
//	               this.piercedAndKilledEntities.add(livingentity);
//	            }
//
//	            if (!this.level.isClientSide && entity1 instanceof ServerPlayerEntity) {
//	               ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)entity1;
//	               if (this.piercedAndKilledEntities != null && this.shotFromCrossbow()) {
//	                  CriteriaTriggers.KILLED_BY_CROSSBOW.trigger(serverplayerentity, this.piercedAndKilledEntities);
//	               } else if (!entity.isAlive() && this.shotFromCrossbow()) {
//	                  CriteriaTriggers.KILLED_BY_CROSSBOW.trigger(serverplayerentity, Arrays.asList(entity));
//	               }
//	            }
//	         }
//
//	         this.playSound(this.soundEvent, 1.0F, 1.2F / (this.random.nextFloat() * 0.2F + 0.9F));
//	         if (this.getPierceLevel() <= 0) {
//	            this.remove();
//	         }
//	      } else {
//	         entity.setRemainingFireTicks(k);
//	         this.setDeltaMovement(this.getDeltaMovement().scale(-0.1D));
//	         this.yRot += 180.0F;
//	         this.yRotO += 180.0F;
//	         if (!this.level.isClientSide && this.getDeltaMovement().lengthSqr() < 1.0E-7D) {
//	            if (this.pickup == AbstractArrowEntity.PickupStatus.ALLOWED) {
//	               this.spawnAtLocation(this.getPickupItem(), 0.1F);
//	            }
//
//	            this.remove();
//	         }
//	      }
//
//	   }
//
//	   protected void onHitBlock(BlockRayTraceResult p_230299_1_) {
//	      this.lastState = this.level.getBlockState(p_230299_1_.getBlockPos());
//	      super.onHitBlock(p_230299_1_);
//	      Vector3d vector3d = p_230299_1_.getLocation().subtract(this.getX(), this.getY(), this.getZ());
//	      this.setDeltaMovement(vector3d);
//	      Vector3d vector3d1 = vector3d.normalize().scale((double)0.05F);
//	      this.setPosRaw(this.getX() - vector3d1.x, this.getY() - vector3d1.y, this.getZ() - vector3d1.z);
//	      this.playSound(this.getHitGroundSoundEvent(), 1.0F, 1.2F / (this.random.nextFloat() * 0.2F + 0.9F));
//	      this.inGround = true;
//	      this.shakeTime = 7;
//	      this.setCritArrow(false);
//	      this.setPierceLevel((byte)0);
//	      this.setSoundEvent(SoundEvents.ARROW_HIT);
//	      this.setShotFromCrossbow(false);
//	      this.resetPiercedEntities();
//	   }
//
//	   protected SoundEvent getDefaultHitGroundSoundEvent() {
//	      return SoundEvents.ARROW_HIT;
//	   }
//
//	   protected final SoundEvent getHitGroundSoundEvent() {
//	      return this.soundEvent;
//	   }
//
//	   protected void doPostHurtEffects(LivingEntity p_184548_1_) {
//	   }
//
//	   @Nullable
//	   protected EntityRayTraceResult findHitEntity(Vector3d p_213866_1_, Vector3d p_213866_2_) {
//	      return ProjectileHelper.getEntityHitResult(this.level, this, p_213866_1_, p_213866_2_, this.getBoundingBox().expandTowards(this.getDeltaMovement()).inflate(1.0D), this::canHitEntity);
//	   }
//
//	   protected boolean canHitEntity(Entity p_230298_1_) {
//	      return super.canHitEntity(p_230298_1_) && (this.piercingIgnoreEntityIds == null || !this.piercingIgnoreEntityIds.contains(p_230298_1_.getId()));
//	   }
//
//	   public void addAdditionalSaveData(CompoundNBT p_213281_1_) {
//	      super.addAdditionalSaveData(p_213281_1_);
//	      p_213281_1_.putShort("life", (short)this.life);
//	      if (this.lastState != null) {
//	         p_213281_1_.put("inBlockState", NBTUtil.writeBlockState(this.lastState));
//	      }
//
//	      p_213281_1_.putByte("shake", (byte)this.shakeTime);
//	      p_213281_1_.putBoolean("inGround", this.inGround);
//	      p_213281_1_.putByte("pickup", (byte)this.pickup.ordinal());
//	      p_213281_1_.putDouble("damage", this.baseDamage);
//	      p_213281_1_.putBoolean("crit", this.isCritArrow());
//	      p_213281_1_.putByte("PierceLevel", this.getPierceLevel());
//	      p_213281_1_.putString("SoundEvent", Registry.SOUND_EVENT.getKey(this.soundEvent).toString());
//	      p_213281_1_.putBoolean("ShotFromCrossbow", this.shotFromCrossbow());
//	   }
//
//	   public void readAdditionalSaveData(CompoundNBT p_70037_1_) {
//	      super.readAdditionalSaveData(p_70037_1_);
//	      this.life = p_70037_1_.getShort("life");
//	      if (p_70037_1_.contains("inBlockState", 10)) {
//	         this.lastState = NBTUtil.readBlockState(p_70037_1_.getCompound("inBlockState"));
//	      }
//
//	      this.shakeTime = p_70037_1_.getByte("shake") & 255;
//	      this.inGround = p_70037_1_.getBoolean("inGround");
//	      if (p_70037_1_.contains("damage", 99)) {
//	         this.baseDamage = p_70037_1_.getDouble("damage");
//	      }
//
//	      if (p_70037_1_.contains("pickup", 99)) {
//	         this.pickup = AbstractArrowEntity.PickupStatus.byOrdinal(p_70037_1_.getByte("pickup"));
//	      } else if (p_70037_1_.contains("player", 99)) {
//	         this.pickup = p_70037_1_.getBoolean("player") ? AbstractArrowEntity.PickupStatus.ALLOWED : AbstractArrowEntity.PickupStatus.DISALLOWED;
//	      }
//
//	      this.setCritArrow(p_70037_1_.getBoolean("crit"));
//	      this.setPierceLevel(p_70037_1_.getByte("PierceLevel"));
//	      if (p_70037_1_.contains("SoundEvent", 8)) {
//	         this.soundEvent = Registry.SOUND_EVENT.getOptional(new ResourceLocation(p_70037_1_.getString("SoundEvent"))).orElse(this.getDefaultHitGroundSoundEvent());
//	      }
//
//	      this.setShotFromCrossbow(p_70037_1_.getBoolean("ShotFromCrossbow"));
//	   }
//
//	   public void setOwner(@Nullable Entity p_212361_1_) {
//	      super.setOwner(p_212361_1_);
//	      if (p_212361_1_ instanceof PlayerEntity) {
//	         this.pickup = ((PlayerEntity)p_212361_1_).abilities.instabuild ? AbstractArrowEntity.PickupStatus.CREATIVE_ONLY : AbstractArrowEntity.PickupStatus.ALLOWED;
//	      }
//
//	   }
//
//	   public void playerTouch(PlayerEntity p_70100_1_) {
//	      if (!this.level.isClientSide && (this.inGround || this.isNoPhysics()) && this.shakeTime <= 0) {
//	         boolean flag = this.pickup == AbstractArrowEntity.PickupStatus.ALLOWED || this.pickup == AbstractArrowEntity.PickupStatus.CREATIVE_ONLY && p_70100_1_.abilities.instabuild || this.isNoPhysics() && this.getOwner().getUUID() == p_70100_1_.getUUID();
//	         if (this.pickup == AbstractArrowEntity.PickupStatus.ALLOWED && !p_70100_1_.inventory.add(this.getPickupItem())) {
//	            flag = false;
//	         }
//
//	         if (flag) {
//	            p_70100_1_.take(this, 1);
//	            this.remove();
//	         }
//
//	      }
//	   }
//
//	   protected abstract ItemStack getPickupItem();
//
//	   protected boolean isMovementNoisy() {
//	      return false;
//	   }
//
//	   public void setBaseDamage(double p_70239_1_) {
//	      this.baseDamage = p_70239_1_;
//	   }
//
//	   public double getBaseDamage() {
//	      return this.baseDamage;
//	   }
//
//	   public void setKnockback(int p_70240_1_) {
//	      this.knockback = p_70240_1_;
//	   }
//
//	   public boolean isAttackable() {
//	      return false;
//	   }
//
//	   protected float getEyeHeight(Pose p_213316_1_, EntitySize p_213316_2_) {
//	      return 0.13F;
//	   }
//
//	   public void setCritArrow(boolean p_70243_1_) {
//	      this.setFlag(1, p_70243_1_);
//	   }
//
//	   public void setPierceLevel(byte p_213872_1_) {
//	      this.entityData.set(PIERCE_LEVEL, p_213872_1_);
//	   }
//
//	   private void setFlag(int p_203049_1_, boolean p_203049_2_) {
//	      byte b0 = this.entityData.get(ID_FLAGS);
//	      if (p_203049_2_) {
//	         this.entityData.set(ID_FLAGS, (byte)(b0 | p_203049_1_));
//	      } else {
//	         this.entityData.set(ID_FLAGS, (byte)(b0 & ~p_203049_1_));
//	      }
//
//	   }
//
//	   public boolean isCritArrow() {
//	      byte b0 = this.entityData.get(ID_FLAGS);
//	      return (b0 & 1) != 0;
//	   }
//
//	   public boolean shotFromCrossbow() {
//	      byte b0 = this.entityData.get(ID_FLAGS);
//	      return (b0 & 4) != 0;
//	   }
//
//	   public byte getPierceLevel() {
//	      return this.entityData.get(PIERCE_LEVEL);
//	   }
//
//	   public void setEnchantmentEffectsFromEntity(LivingEntity p_190547_1_, float p_190547_2_) {
//	      int i = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER_ARROWS, p_190547_1_);
//	      int j = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH_ARROWS, p_190547_1_);
//	      this.setBaseDamage((double)(p_190547_2_ * 2.0F) + this.random.nextGaussian() * 0.25D + (double)((float)this.level.getDifficulty().getId() * 0.11F));
//	      if (i > 0) {
//	         this.setBaseDamage(this.getBaseDamage() + (double)i * 0.5D + 0.5D);
//	      }
//
//	      if (j > 0) {
//	         this.setKnockback(j);
//	      }
//
//	      if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAMING_ARROWS, p_190547_1_) > 0) {
//	         this.setSecondsOnFire(100);
//	      }
//
//	   }
//
//	   protected float getWaterInertia() {
//	      return 0.6F;
//	   }
//
//	   public void setNoPhysics(boolean p_203045_1_) {
//	      this.noPhysics = p_203045_1_;
//	      this.setFlag(2, p_203045_1_);
//	   }
//
//	   public boolean isNoPhysics() {
//	      if (!this.level.isClientSide) {
//	         return this.noPhysics;
//	      } else {
//	         return (this.entityData.get(ID_FLAGS) & 2) != 0;
//	      }
//	   }
//
//	   public void setShotFromCrossbow(boolean p_213865_1_) {
//	      this.setFlag(4, p_213865_1_);
//	   }
//
//	   public IPacket<?> getAddEntityPacket() {
//	      Entity entity = this.getOwner();
//	      return new SSpawnObjectPacket(this, entity == null ? 0 : entity.getId());
//	   }
//
//	   public static enum PickupStatus {
//	      DISALLOWED,
//	      ALLOWED,
//	      CREATIVE_ONLY;
//
//	      public static AbstractArrowEntity.PickupStatus byOrdinal(int p_188795_0_) {
//	         if (p_188795_0_ < 0 || p_188795_0_ > values().length) {
//	            p_188795_0_ = 0;
//	         }
//
//	         return values()[p_188795_0_];
//	      }
//	   }
}
