
package org.gsdistance.obx.adslab.client.renderer;

import org.gsdistance.obx.adslab.entity.UnexperiencedVampireEntity;
import org.gsdistance.obx.adslab.client.model.Modelcustom_model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class UnexperiencedVampireRenderer extends MobRenderer<UnexperiencedVampireEntity, Modelcustom_model<UnexperiencedVampireEntity>> {
	public UnexperiencedVampireRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<UnexperiencedVampireEntity, Modelcustom_model<UnexperiencedVampireEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("asdlab:textures/entities/vampire_texture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(UnexperiencedVampireEntity entity) {
		return new ResourceLocation("asdlab:textures/entities/vampire_texture.png");
	}
}
