package com.richardsearcy.htrtutorial.init;

import com.richardsearcy.htrtutorial.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that initializes custom blocks
 */
public class BlockInit {

    // An arraylist to hold the custom blocks
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    // Initialize the custom copper block. Creates a new BlockBase object with the name "block_copper" and material iron.
    public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);

    // Initialize the custom ores for each level of the world. Creates a new BlockOres object.
    public static final Block ORE_END = new BlockOres("ore_end", "end");
    public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
    public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
}
