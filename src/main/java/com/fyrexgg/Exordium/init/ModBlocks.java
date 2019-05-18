package com.fyrexgg.Exordium.init;

import com.fyrexgg.Exordium.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;


public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block AGATE_ORE = new BlockBase("agate_ore", Material.ROCK);
    //Needs Texture
    public static final Block TABLE = new BlockBase("table", Material.WOOD);
    public static final Block ROCK_TUMBLER = new BlockBase("rock_tumbler", Material.IRON);

}
