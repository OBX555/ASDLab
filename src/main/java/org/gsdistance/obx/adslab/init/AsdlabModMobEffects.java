
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.obx.adslab.init;

import org.gsdistance.obx.adslab.potion.BlueiumCurseMobEffect;
import org.gsdistance.obx.adslab.AsdlabMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class AsdlabModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AsdlabMod.MODID);
	public static final RegistryObject<MobEffect> BLUEIUM_CURSE = REGISTRY.register("blueium_curse", () -> new BlueiumCurseMobEffect());
}
