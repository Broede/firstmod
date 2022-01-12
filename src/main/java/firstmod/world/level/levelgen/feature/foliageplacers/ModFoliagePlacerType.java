package firstmod.world.level.levelgen.feature.foliageplacers;

import com.mojang.serialization.Codec;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

public class ModFoliagePlacerType<P extends FoliagePlacer> extends FoliagePlacerType<P> {
	public static final FoliagePlacerType<StraightFoliagePlacer> STRAIGHT_FOLIAGE_PLACER = register("straight_foliage_placer", StraightFoliagePlacer.CODEC);
	private final Codec<P> codec;

	private static <P extends FoliagePlacer> FoliagePlacerType<P> register(String p_68606_, Codec<P> p_68607_) {
		return Registry.register(Registry.FOLIAGE_PLACER_TYPES, p_68606_, new FoliagePlacerType<>(p_68607_));
	}

	public ModFoliagePlacerType(Codec<P> p_68603_) {
		super(p_68603_);
		this.codec = p_68603_;
	}

	public Codec<P> codec() {
		return this.codec;
	}
}
