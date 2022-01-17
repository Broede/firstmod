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
import net.minecraft.world.level.levelgen.feature.TreeFeature;
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
		return ModFoliagePlacerType.STRAIGHT_FOLIAGE_PLACER;
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
	protected void placeLeavesRow(LevelSimulatedReader levelSimulatedReader, BiConsumer<BlockPos, BlockState> biConsumer, Random rand,
			TreeConfiguration treeConfiguration, BlockPos blockPos, int int1, int int2, boolean bool) {
		int i = bool ? 1 : 0;
		BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
		int maxrange = Math.abs(int1) + Math.abs(int2);

		for(int j = -int1; j <= int1 + i; ++j) {
			for(int k = -int1; k <= int1 + i; ++k) {
				if (!this.shouldSkipLocationSigned(rand, j, int2, k, int1, bool) && !this.shouldSkipSingleBlock(j, k, maxrange) ) {
					blockpos$mutableblockpos.setWithOffset(blockPos, j, int2, k);
					FoliagePlacer.tryPlaceLeaf(levelSimulatedReader, biConsumer, rand, treeConfiguration, blockpos$mutableblockpos);
				}
			}
		}
	}
	
	private boolean shouldSkipSingleBlock(int first, int second, int maxRange) {
		if ( Math.abs(first) + Math.abs(second) >= maxRange )
			return true;
		return false;
	}

	@Override
	public int foliageHeight(Random p_68568_, int p_68569_, TreeConfiguration p_68570_) {
		// TODO Auto-generated method stub
		return this.height;
	}

	@Override
	protected boolean shouldSkipLocation(Random p_68562_, int p_68563_, int p_68564_, int p_68565_, int p_68566_,
			boolean p_68567_) {
		// TODO Auto-generated method stub
		return false;
	}
}
