
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.obx.adslab.init;

import org.gsdistance.obx.adslab.client.model.Modelvampiretier1;
import org.gsdistance.obx.adslab.client.model.Modelcustom_model;
import org.gsdistance.obx.adslab.client.model.ModelVampire;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AsdlabModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelVampire.LAYER_LOCATION, ModelVampire::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelvampiretier1.LAYER_LOCATION, Modelvampiretier1::createBodyLayer);
	}
}
