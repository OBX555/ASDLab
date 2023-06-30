
package org.gsdistance.obx.adslab.client.renderer;

import org.gsdistance.obx.adslab.entity.VampireEntity;
import org.gsdistance.obx.adslab.client.model.ModelVampire;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class VampireRenderer extends MobRenderer<VampireEntity, ModelVampire<VampireEntity>> {
	public VampireRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVampire(context.bakeLayer(ModelVampire.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<VampireEntity, ModelVampire<VampireEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("asdlab:textures/entities/vampiretecturet0.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(VampireEntity entity) {
		return new ResourceLocation("asdlab:textures/entities/vampiretecturet0.png");
	}
}
