package dev.hephaestus.shatteredsky.mixin.client.render.model;

import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.util.SpriteIdentifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Set;

@Mixin(ModelLoader.class)
public interface ModelLoaderAccessor {
	@Accessor("DEFAULT_TEXTURES")
	static Set<SpriteIdentifier> getDefaultTextures() {
		throw new UnsupportedOperationException();
	}
}
