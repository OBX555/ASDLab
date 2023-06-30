
package org.gsdistance.obx.adslab.client.renderer;

import org.gsdistance.obx.adslab.entity.VampireTier1Entity;
import org.gsdistance.obx.adslab.client.model.Modelvampiretier1;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class VampireTier1Renderer extends MobRenderer<VampireTier1Entity, Modelvampiretier1<VampireTier1Entity>> {
	public VampireTier1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelvampiretier1(context.bakeLayer(Modelvampiretier1.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<VampireTier1Entity, Modelvampiretier1<VampireTier1Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("asdlab:textures/entities/vampiretier1texture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(VampireTier1Entity entity) {
		return new ResourceLocation("asdlab:textures/entities/vampiretier1texture.png");
	}
}
