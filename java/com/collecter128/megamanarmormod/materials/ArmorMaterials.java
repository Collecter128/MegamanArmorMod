package com.collecter128.megamanarmormod.materials;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;

import com.collecter128.megamanarmormod.core.ItemInit;;

public enum ArmorMaterials implements IArmorMaterial{
	
	MegamanArmor("megamanarmor", 15, new int[] {2, 5, 6, 3}, 6, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.Ceratanium.get())),
	LightLabcoat("lightlabcoat", 6, new int[] {1, 2, 3, 1}, 3, SoundEvents.ARMOR_EQUIP_LEATHER, 0f, 0f, () -> Ingredient.of(Blocks.WHITE_WOOL)),
	ProtomanArmor("protomanarmor", 15, new int[] {2, 5, 6, 3}, 6, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.Ceratanium.get())),
	
	WilyLabcoat("wilylabcoat", 6, new int[] {1, 2, 3, 1}, 3, SoundEvents.ARMOR_EQUIP_LEATHER, 0f, 0f, () -> Ingredient.of(Blocks.WHITE_WOOL)),
	BassArmor("bassarmor", 15, new int[] {2, 5, 6, 2}, 7, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.Fortenium.get())),
	QuintArmor("quintarmor", 15, new int[] {2, 5, 6, 2}, 7, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.Ceratanium.get())),
	
	MegaArmorBase("megaarmorbase", 10, new int[] {1, 1, 1, 1}, 6, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.Ceratanium.get())),
	XArmor("xarmor", 20, new int[] {2, 5, 6, 3}, 6, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.TitaniumX.get())),
	XTransparentArmor("xtransparentarmor", 6, new int[] {2, 5, 7, 3}, 6, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.TitaniumX.get())),
	iXArmor("ixarmor", 24, new int[] {4, 7, 8, 5}, 6, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.TitaniumX.get())),
	FirstXArmor("firstarmor", 24, new int[] {3, 6, 7, 5}, 6, SoundEvents.ARMOR_EQUIP_IRON, 1f, 2.1f, () -> Ingredient.of(ItemInit.TitaniumX.get())),
	SecondXArmor("secondarmor", 27, new int[] {3, 6, 7, 5}, 8, SoundEvents.ARMOR_EQUIP_IRON, 1f, 1.1f, () -> Ingredient.of(ItemInit.TitaniumX.get())),
	ThirdXArmor("thirdarmor", 30, new int[] {3, 6, 7, 5}, 8, SoundEvents.ARMOR_EQUIP_IRON, 1f, 1.1f, () -> Ingredient.of(ItemInit.TitaniumX.get())),
	
	ZeroArmor("zeroarmor", 20, new int[] {2, 5, 7, 3}, 6, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.TitaniumX.get())),
	AxlArmor("axlarmor", 20, new int[] {2, 5, 7, 3}, 6, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.TitaniumX.get())),
	
	SigmaArmor("sigmaarmor", 24, new int[] {3, 6, 8, 4}, 8, SoundEvents.ARMOR_EQUIP_IRON, 2f, 0.2f, () -> Ingredient.of(ItemInit.TitaniumX.get())),
	VileArmor("vilearmor", 20, new int[] {2, 5, 7, 3}, 8, SoundEvents.ARMOR_EQUIP_IRON, 2f, 0.2f, () -> Ingredient.of(ItemInit.TitaniumX.get())),
	
	BiometalArmor("biometalarmor", 20, new int[] {2, 5, 7, 3}, 6, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.BlankBiometal.get())),
	
	MegamanExeArmor("megamanexearmor", 15, new int[] {2, 5, 6, 2}, 7, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.BusterData.get())),
	HubstyleArmor("hubstylearmor", 30, new int[] {3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 1f, 0.1f, () -> Ingredient.of(ItemInit.BusterData.get())),
	ProtomanExeArmor("protomanexearmor", 15, new int[] {2, 5, 6, 2}, 7, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.SwordData.get())),
	RollExeArmor("rollexearmor", 15, new int[] {2, 5, 6, 2}, 7, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.RecoverData.get())),
	NormnaviArmor("normnaviarmor", 15, new int[] {2, 5, 6, 2}, 7, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.NormalData.get())),
	
	StarforceMegamanArmor("starforcearmor", 15, new int[] {2, 5, 6, 2}, 7, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.AMWave.get())),
	StarforceFMArmor("starforcefmarmor", 15, new int[] {2, 5, 6, 2}, 7, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(ItemInit.FMWave.get()));
	
	public static final int[] basedurability = {128, 144, 160, 112};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorValue;
	private final int enchantibility;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackresistance;
	private final Ingredient RepairIngredient;

	ArmorMaterials(String name, int durabilityMultiplier, int[] armorValue, int enchantibility, SoundEvent equipSound, float toughness, float knockbackresistance, Supplier<Ingredient> RepairIngredient){
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorValue = armorValue;
		this.enchantibility = enchantibility;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackresistance = knockbackresistance;
		this.RepairIngredient = RepairIngredient.get();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackresistance;
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlotType slotIn) {
		return this.basedurability[slotIn.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType slotIn) {
		return this.armorValue[slotIn.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantibility;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.RepairIngredient;
	}

}
