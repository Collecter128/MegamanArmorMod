package com.collecter128.megamanarmormod.client;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.annotation.Nullable;

import org.apache.commons.lang3.tuple.Pair;

import com.google.common.collect.Lists;

import net.minecraft.item.DyeColor;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.tileentity.BannerPattern;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum CustomPatterns {
	logocircle(true),
	logotriangle,
	drlight,
	wily,
	sigma,
	sigmawolf,
	mrx,
	doppler,
	dopplerbg,
	dopplerbg2,
	maverickhuntertop,
	maverickhunterv,
	king,
	kingstar,
	kingbg,
	cossack,
	cossackstar,
	repliforce,
	repliforcestar,
	repliforceoutline;
	
    private final boolean vanilla;

    public boolean isVanilla(){
        return this.vanilla;
    }

    CustomPatterns(){
        this(false);
    }

    CustomPatterns(boolean isVanilla){
        this.vanilla = isVanilla;
    }


    public static CustomPatterns getPattern(int index) {
        for (CustomPatterns pattern : values()) {
            if (pattern.getIndex() == index) {
                return pattern;
            }
        }
        throw new IllegalArgumentException("Sorry, not within index");
    }

    public String getName() {
        return name().toLowerCase(Locale.ROOT);
    }

    public int getIndex() {
        return ordinal();
    }
}
