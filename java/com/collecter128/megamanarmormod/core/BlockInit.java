package com.collecter128.megamanarmormod.core;

import com.collecter128.megamanarmormod.MegamanArmorMod;
import com.collecter128.megamanarmormod.blocks.BlueMysteryDataBlock;
import com.collecter128.megamanarmormod.blocks.GreenMysteryDataBlock;
import com.collecter128.megamanarmormod.blocks.ScrapBlock;
import com.collecter128.megamanarmormod.blocks.bannerluckyblock;
import com.collecter128.megamanarmormod.blocks.blockrotatable;
import com.collecter128.megamanarmormod.blocks.colorizerluckyblock;
import com.collecter128.megamanarmormod.blocks.recycler;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, "megamanarmormod"); //MegamanArmorMod.Mod_ID
	
	public static final RegistryObject<Block> CerataniumOre = Blocks.register("ceratanium_ore",
			() -> new Block((AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE).harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops().strength(3.0F, 3.0F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.ANCIENT_DEBRIS)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	public static final RegistryObject<Block> CerataniumBlock = Blocks.register("ceratanium_block",
			() -> new Block((AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops().strength(3.0F, 3.0F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.METAL)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	
	public static final RegistryObject<Block> TitaniumOre = Blocks.register("titanium_ore",
			() -> new Block((AbstractBlock.Properties.of(Material.STONE, MaterialColor.CLAY).harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops().strength(3.0F, 3.0F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.ANCIENT_DEBRIS)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	
	public static final RegistryObject<Block> CustomizerOre = Blocks.register("colorizerluckyblock",
			() -> new colorizerluckyblock((AbstractBlock.Properties.of(Material.METAL, MaterialColor.EMERALD)
					.strength(1.0F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.BAMBOO)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	
	public static final RegistryObject<Block> BannerLuckyBlock = Blocks.register("bannerluckyblock",
			() -> new bannerluckyblock((AbstractBlock.Properties.of(Material.WOOD, MaterialColor.GOLD)
					.strength(1.0F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.WOOD)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	
	public static final RegistryObject<Block> LimitedOre = Blocks.register("limited_ore",
			() -> new Block((AbstractBlock.Properties.of(Material.STONE, MaterialColor.EMERALD).harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops().strength(3.0F, 3.0F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.NETHER_ORE)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)

	public static final RegistryObject<Block> RuinsBlockA = Blocks.register("legendsruinsblocka",
			() -> new blockrotatable((AbstractBlock.Properties.of(Material.HEAVY_METAL, MaterialColor.COLOR_BROWN).harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops().strength(3.0F, 3.0F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.METAL)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	public static final RegistryObject<Block> RuinsBlockAPlate = Blocks.register("legendsruinsblockaplate",
			() -> new blockrotatable((AbstractBlock.Properties.of(Material.HEAVY_METAL, MaterialColor.COLOR_BROWN).harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops().strength(3.0F, 3.0F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.METAL)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	public static final RegistryObject<Block> RuinsBlockB = Blocks.register("legendsruinsblockb",
			() -> new blockrotatable((AbstractBlock.Properties.of(Material.HEAVY_METAL, MaterialColor.COLOR_BROWN).harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops().strength(3.0F, 3.0F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.METAL)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	public static final RegistryObject<Block> RuinsBlockC = Blocks.register("legendsruinsblockc",
			() -> new blockrotatable((AbstractBlock.Properties.of(Material.HEAVY_METAL, MaterialColor.COLOR_BROWN).harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops().strength(3.0F, 3.0F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.METAL)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	public static final RegistryObject<Block> RuinsBlockD = Blocks.register("legendsruinsblockd",
			() -> new blockrotatable((AbstractBlock.Properties.of(Material.HEAVY_METAL, MaterialColor.COLOR_BROWN).harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops().strength(3.0F, 3.0F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.METAL)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	
	public static final RegistryObject<Block> GreenMysteryData = Blocks.register("greenmysterydata",
			() -> new GreenMysteryDataBlock((AbstractBlock.Properties.of(Material.GLASS, MaterialColor.EMERALD)
					.strength(0.3F)) //.group(MegamanArmorMod.MMTab)
					.noOcclusion().lightLevel((p_235470_0_) -> {
					      return 10;
					   }).sound(SoundType.GLASS)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	
	public static final RegistryObject<Block> ScapBlock = Blocks.register("scrapblock",
			() -> new ScrapBlock((AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GRAY)
					.strength(0.3F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.METAL)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	
	public static final RegistryObject<Block> BlueMysteryData = Blocks.register("bluemysterydata",
			() -> new BlueMysteryDataBlock((AbstractBlock.Properties.of(Material.GLASS, MaterialColor.DIAMOND)
					.strength(0.3F)) //.group(MegamanArmorMod.MMTab)
					.noOcclusion().lightLevel((p_235470_0_) -> {
					      return 10;
					   }).sound(SoundType.GLASS)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	
	public static final RegistryObject<Block> Recycler = Blocks.register("recycler",
			() -> new recycler((AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GREEN).harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops().strength(3.0F, 3.0F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.ANVIL)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	
}
