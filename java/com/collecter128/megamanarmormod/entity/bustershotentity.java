package com.collecter128.megamanarmormod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class bustershotentity extends AbstractArrowEntity{

	protected bustershotentity(EntityType<? extends AbstractArrowEntity> type, double x, double y, double z,
			World worldIn) {
		super(type, x, y, z, worldIn);
	}
	
	public bustershotentity(World worldIn, double x, double y, double z) {
		 super(EntityType.ARROW, x, y, z, worldIn);
	}

		   public bustershotentity(World worldIn, LivingEntity shooter) {
		      super(EntityType.ARROW, shooter, worldIn);
		   }

		@Override
		protected ItemStack getArrowStack() {
			// TODO Auto-generated method stub
			return null;
		}

}
