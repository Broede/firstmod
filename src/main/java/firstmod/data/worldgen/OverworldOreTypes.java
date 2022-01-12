package firstmod.data.worldgen;

import firstmod.init.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OverworldOreTypes {
	ALUMINUM_COMMON("aluminum_common", Lazy.of(ModBlocks.STONE_ALUMINUM_ORE), Lazy.of(ModBlocks.DEEPSLATE_ALUMINUM_ORE), 8, -8, 64, 12),
	ALUMINUM_MOUNTAINS("aluminum_mountains", Lazy.of(ModBlocks.STONE_ALUMINUM_ORE), Lazy.of(ModBlocks.DEEPSLATE_ALUMINUM_ORE), 8, 72, 248, 24),
	LEAD_LOWER("lead_lower", Lazy.of(ModBlocks.STONE_LEAD_ORE), Lazy.of(ModBlocks.DEEPSLATE_LEAD_ORE), 4, -32, 32, 8),
	LEAD_UPPER("lead_upper", Lazy.of(ModBlocks.STONE_LEAD_ORE), Lazy.of(ModBlocks.DEEPSLATE_LEAD_ORE), 12, 32, 96, 12),
	NICKEL("nickel", Lazy.of(ModBlocks.STONE_NICKEL_ORE), Lazy.of(ModBlocks.DEEPSLATE_NICKEL_ORE), 8, -48, 16, 8),
	PLATINUM("platinum", Lazy.of(ModBlocks.STONE_PLATINUM_ORE), Lazy.of(ModBlocks.DEEPSLATE_PLATINUM_ORE), 6, -64, -12, 10),
	RUBY_COMMON("ruby_common", Lazy.of(ModBlocks.STONE_RUBY_ORE), Lazy.of(ModBlocks.DEEPSLATE_RUBY_ORE), 6, -64, 32, 8),
	RUBY_MOUNTAINS("ruby_mountains", Lazy.of(ModBlocks.STONE_RUBY_ORE), Lazy.of(ModBlocks.DEEPSLATE_RUBY_ORE), 4, 72, 248, 12),
	SILVER_SHALLOW("silver_shallow", Lazy.of(ModBlocks.STONE_SILVER_ORE), Lazy.of(ModBlocks.DEEPSLATE_SILVER_ORE), 5, -40, 40, 6),
	SILVER_DEEP("silver_deep", Lazy.of(ModBlocks.STONE_SILVER_ORE), Lazy.of(ModBlocks.DEEPSLATE_SILVER_ORE), 9, -60, -20, 8),
	TIN("tin", Lazy.of(ModBlocks.STONE_TIN_ORE), Lazy.of(ModBlocks.DEEPSLATE_TIN_ORE), 9, 0, 128, 20),
	TITANIUM("titanium", Lazy.of(ModBlocks.STONE_TITANIUM_ORE), Lazy.of(ModBlocks.DEEPSLATE_TITANIUM_ORE), 8, -64, -16, 6);

    private final Lazy<Block> block;
    private final Lazy<Block> deepslateBlock;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int rollsPerChunk;
    private final String localName;
    
    OverworldOreTypes(String localName, Lazy<Block> block, Lazy<Block> deepslateBlock, int maxVeinSize, int minHeight, int maxHeight, int rollsPerChunk) {
    	this.localName = localName;
    	this.block = block;
    	this.deepslateBlock = deepslateBlock;
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
    
    public Lazy<Block> getDeepslateBlock() {
    	return this.deepslateBlock;
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