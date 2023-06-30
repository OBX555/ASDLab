
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.obx.adslab.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AsdlabModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> RULENUMBER_1 = GameRules.register("rulenumber1", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
}
