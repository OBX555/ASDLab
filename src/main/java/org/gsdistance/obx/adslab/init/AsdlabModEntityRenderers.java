
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.obx.adslab.init;

import org.gsdistance.obx.adslab.client.renderer.VampireTier1Renderer;
import org.gsdistance.obx.adslab.client.renderer.VampireRenderer;
import org.gsdistance.obx.adslab.client.renderer.UnexperiencedVampireRenderer;
import org.gsdistance.obx.adslab.client.renderer.LivingCheeseBlockRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AsdlabModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AsdlabModEntities.UNEXPERIENCED_VAMPIRE.get(), UnexperiencedVampireRenderer::new);
		event.registerEntityRenderer(AsdlabModEntities.VAMPIRE.get(), VampireRenderer::new);
		event.registerEntityRenderer(AsdlabModEntities.LIVING_CHEESE_BLOCK.get(), LivingCheeseBlockRenderer::new);
		event.registerEntityRenderer(AsdlabModEntities.VAMPIRE_TIER_1.get(), VampireTier1Renderer::new);
	}
}
