package com.collecter128.megamanarmormod.core;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "megamanarmormod", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class InputEvents {

	@SubscribeEvent
	public static void onKeyPress(InputEvent.KeyInputEvent event) {
		Minecraft mc = Minecraft.getInstance();
		if(mc.level == null) return;
		onInput(mc, event.getKey(), event.getAction());
	}
	
	@SubscribeEvent
	public static void onMouseClick(InputEvent.MouseInputEvent event) {
		Minecraft mc = Minecraft.getInstance();
		if(mc.level == null) return;
		onInput(mc, event.getButton(), event.getAction());
	}
	
	private static void onInput(Minecraft mc, int key, int action) {
		if(mc.screen == null && KeybindInit.Dashkey.isDown()) {
			if((mc.player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ItemInit.ZeroArmor_Arms.get()|| 
					mc.player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ItemInit.ZeroArmorFirst_Arms.get() || 
					mc.player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ItemInit.VileArmor_Arms.get()|| 
					mc.player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ItemInit.FirstArmor_Arms.get()|| 
					mc.player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ItemInit.SecondArmor_Arms.get()|| 
					mc.player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ItemInit.ThirdArmor_Arms.get()|| 
					mc.player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ItemInit.NewArmor_Arms.get()|| 
					mc.player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ItemInit.AxlArmor_Arms.get()|| 
					mc.player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ItemInit.SigmaArmor_Arms.get()|| 
					mc.player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ItemInit.iXArmor_Arms.get()) 
					&& mc.player.isOnGround()) {
				int DashPower = 1;
				float Maxspeed = 16f;
				float f7 = mc.player.yRot;
	            float f = mc.player.xRot;
	            float f1 = -MathHelper.sin(f7 * ((float)Math.PI / 180F)) * MathHelper.cos(f * ((float)Math.PI / 180F));
	            float f2 = -MathHelper.sin(f * ((float)Math.PI / 180F));
	            float f3 = MathHelper.cos(f7 * ((float)Math.PI / 180F)) * MathHelper.cos(f * ((float)Math.PI / 180F));
	            float f4 = MathHelper.sqrt(f1 * f1 + f2 * f2 + f3 * f3);
	            float f5 = 3.0F * ((1.0F + (float)DashPower) / 4.0F);
	            f1 = f1 * (f5 / f4);
	            f2 = f2 * (f5 / f4);
	            f3 = f3 * (f5 / f4);
	            mc.player.push((double)f1, (double)f2, (double)f3);
	            //mc.player.startSpinAttack(20);
	            if (mc.player.isOnGround()) {
	               float f6 = 1.1999999F;
	               mc.player.move(MoverType.SELF, new Vector3d(0.0D, (double)1.1999999F, 0.0D));
	            }

	
	            SoundEvent soundevent;
	            if (DashPower >= 3) {
	               soundevent = SoundEvents.TRIDENT_RIPTIDE_3;
	            } else if (DashPower == 2) {
	               soundevent = SoundEvents.TRIDENT_RIPTIDE_2;
	            } else {
	               soundevent = SoundEvents.TRIDENT_RIPTIDE_1;
	            }
	            //mc.player.getItemStackFromSlot(EquipmentSlotType.FEET).damageItem(1, mc.player, ItemStack.);
	            mc.level.playSound((PlayerEntity)null, mc.player, soundevent, SoundCategory.PLAYERS, 1.0F, 1.0F);
			}
			
		}
	}
}
