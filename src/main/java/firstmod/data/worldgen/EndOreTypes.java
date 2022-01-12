package firstmod.data.worldgen;

import java.util.List;

import firstmod.init.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration.TargetBlockState;
import net.minecraftforge.common.util.Lazy;

public enum EndOreTypes {
	ENDERITE("enderite", Lazy.of(ModBlocks.ENDERITE_ORE), ModOreFeatures.ORE_ENDERITE_TARGET_LIST, 9, 0, 72, 6);

    private final Lazy<Block> block;
    private final List<TargetBlockState> targetList;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int rollsPerChunk;
    private final String localName;
    
	EndOreTypes(String localName, Lazy<Block> block, List<TargetBlockState> targetList, int maxVeinSize, int minHeight, int maxHeight, int rollsPerChunk) {
		this.localName = localName;
		this.block = block;
		this.targetList = targetList;
    	this.maxVeinSize = maxVeinSize;
		this.minHeight = minHeight;
		this.maxHeight = maxHeight;
		this.rollsPerChunk = rollsPerChunk;
    }

    public String getLocalName() {
    	return this.localName;
    }
    
    public Lazy<Block> getBlock() {
    	return this.block;
    }
    
    public List<TargetBlockState> getTargetList() {
    	return this.targetList;
    }
    
    public int getMaxVeinSize() {
    	return this.maxVeinSize;
    }
    
    public int getMinHeight() {
    	return this.minHeight;
    }
    
    public int getMaxHeight() {
    	return this.maxHeight;
    }
    
    public int getRollsPerChunk() {
    	return this.rollsPerChunk;
    }

    public String getLocalizedBlockName() {
    	return "block/" + this.getLocalName() + "_ore";
    }
    
    public String getLocalizedOreName() {
    	return "ore/" + this.getLocalName() + "_ore";
    }
}
