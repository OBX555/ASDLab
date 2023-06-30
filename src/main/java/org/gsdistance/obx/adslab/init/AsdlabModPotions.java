
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.obx.adslab.init;

import org.gsdistance.obx.adslab.AsdlabMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class AsdlabModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, AsdlabMod.MODID);
	public static final RegistryObject<Potion> BLUEIUM_CURSE_POTION = REGISTRY.register("blueium_curse_potion",
			() -> new Potion(new MobEffectInstance(AsdlabModMobEffects.BLUEIUM_CURSE.get(), 10000, 5, false, false), new MobEffectInstance(MobEffects.CONFUSION, 500, 15, false, false)));
}
