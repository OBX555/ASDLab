
package org.gsdistance.obx.adslab.potion;

import org.gsdistance.obx.adslab.procedures.BlueiumCurseEffectStartedappliedProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BlueiumCurseMobEffect extends MobEffect {
	public BlueiumCurseMobEffect() {
		super(MobEffectCategory.HARMFUL, -5439489);
	}

	@Override
	public String getDescriptionId() {
		return "effect.asdlab.blueium_curse";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BlueiumCurseEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
