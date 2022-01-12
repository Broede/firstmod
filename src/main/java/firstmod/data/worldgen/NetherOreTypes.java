package firstmod.data.worldgen;

import firstmod.init.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum NetherOreTypes {
	SULFUR("sulfur", Lazy.of(ModBlocks.NETHERRACK_SULFUR_ORE), 10, 0, 128, 16),
	BORITE("borite", Lazy.of(ModBlocks.NETHERRACK_BORITE_ORE), 8, 16, 112, 6),
	COBALT("cobalt", Lazy.of(ModBlocks.NETHERRACK_COBALT_ORE), 8, 16, 112, 6),
	RADIUM("radium", Lazy.of(ModBlocks.NETHERRACK_RADIUM_ORE), 8, 16, 112, 6);

    private final Lazy<Block> netherrackBlock;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int rollsPerChunk;
    private final String localName;
    
	NetherOreTypes(String localName, Lazy<Block> netherrackBlock, int maxVeinSize, int minHeight, int maxHeight, int rollsPerChunk) {
		this.localName = localName;
		this.netherrackBlock = netherrackBlock;
    	this.maxVeinSize = maxVeinSize;
		this.minHeight = minHeight;
		this.maxHeight = maxHeight;
		this.rollsPerChunk = rollsPerChunk;
    }

    public String getLocalName() {
    	return this.localName;
    }
    
    public Lazy<Block> getNetherrackBlock() {
    	return this.netherrackBlock;
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
    	return "block/netherrack_" + this.getLocalName() + "_ore";
    }
    
    public String getLocalizedOreName() {
    	return "ore/netherrack_" + this.getLocalName() + "_ore";
    }
}
