package com.collecter128.megamanarmormod.core;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FeatureInit {
	
	public static void addOres(BiomeLoadingEvent event) {
		addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
				BlockInit.CerataniumOre.get().defaultBlockState(), 5, 0, 30, 10);
		addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
				BlockInit.BlueMysteryData.get().defaultBlockState(), 5, 0, 30, 5);
		addOre(event, OreFeatureConfig.FillerBlockType.NETHERRACK, 
				BlockInit.LimitedOre.get().defaultBlockState(), 5, 10, 50, 8);
	}
	
	public static void addOre(final BiomeLoadingEvent event, RuleTest testrule, BlockState state, int veinsize, int MinHeight, int MaxHeight, int amount) {
		event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
				Feature.ORE.configured(new OreFeatureConfig(testrule, state, veinsize))
				.decorated((Placement.RANGE.configured(new TopSolidRangeConfig(MinHeight, 0, MaxHeight))).squared().count((amount))));
		//min height, offset, maximum height, 
	}

}
