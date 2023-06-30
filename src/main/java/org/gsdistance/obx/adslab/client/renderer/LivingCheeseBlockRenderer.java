
package org.gsdistance.obx.adslab.client.renderer;

import org.gsdistance.obx.adslab.entity.LivingCheeseBlockEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

public class LivingCheeseBlockRenderer extends MobRenderer<LivingCheeseBlockEntity, SlimeModel<LivingCheeseBlockEntity>> {
	public LivingCheeseBlockRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
		this.addLayer(new EyesLayer<LivingCheeseBlockEntity, SlimeModel<LivingCheeseBlockEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("asdlab:textures/entities/cheeseblockbutlivingtexture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LivingCheeseBlockEntity entity) {
		return new ResourceLocation("asdlab:textures/entities/cheeseblockbutlivingtexture.png");
	}
}
