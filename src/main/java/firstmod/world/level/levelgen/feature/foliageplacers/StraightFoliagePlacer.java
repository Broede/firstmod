package firstmod.world.level.levelgen.feature.foliageplacers;

import java.util.Random;
import java.util.function.BiConsumer;

import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

public class StraightFoliagePlacer extends FoliagePlacer {
	public static final Codec<StraightFoliagePlacer> CODEC = RecordCodecBuilder.create((p_68454_) -> {
		return blobParts(p_68454_).apply(p_68454_, StraightFoliagePlacer::new);
	});
	protected final int height;
	
	protected static <P extends StraightFoliagePlacer> P3<Mu<P>, IntProvider, IntProvider, Integer> blobParts(Instance<P> p_68454_) {
		return foliagePlacerParts(p_68454_).and(Codec.intRange(0, 16).fieldOf("height").forGetter((p_68412_) -> {
			return p_68412_.height;
		}));
	}

	public StraightFoliagePlacer(IntProvider p_161411_, IntProvider p_161412_, int height) {
		super(p_161411_, p_161412_);
		this.height = height;
	}

	@Override
	protected FoliagePlacerType<?> type() {
		// TODO Auto-generated method stub
		return null;
	}

//   protected void createFoliage(LevelSimulatedReader p_161360_, BiConsumer<BlockPos, BlockState> p_161361_, Random p_161362_, TreeConfiguration p_161363_,
	//	int p_161364_, FoliagePlacer.FoliageAttachment p_161365_, int p_161366_, int p_161367_, int p_161368_) {
	@Override
	protected void createFoliage(LevelSimulatedReader levelSimulatedReader, BiConsumer<BlockPos, BlockState> biConsumer,
			Random random, TreeConfiguration treeConfiguration, int int1, FoliageAttachment foliageAttachment, int int2,
			int int3, int int4) {
		for(int i = int4; i >= int4 - this.height; --i) {
			int j = Math.max(int3 + foliageAttachment.radiusOffset() - 1, 0);
			this.placeLeavesRow(levelSimulatedReader, biConsumer, random, treeConfiguration, foliageAttachment.pos(), j, i, false);
		}
	}

	@Override
	public int foliageHeight(Random p_68568_, int p_68569_, TreeConfiguration p_68570_) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected boolean shouldSkipLocation(Random p_68562_, int p_68563_, int p_68564_, int p_68565_, int p_68566_,
			boolean p_68567_) {
		// TODO Auto-generated method stub
		return false;
	}

}
