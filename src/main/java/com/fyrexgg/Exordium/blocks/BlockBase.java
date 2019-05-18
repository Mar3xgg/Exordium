package com.fyrexgg.Exordium.blocks;

import com.fyrexgg.Exordium.Main;
import com.fyrexgg.Exordium.init.ModBlocks;
import com.fyrexgg.Exordium.init.ModItems;
import com.fyrexgg.Exordium.util.Models;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements Models {
    public BlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
    }

    @Override
    public void registerModels(){
        Main.proxy.registerItemRenderer(ItemBlock.getItemFromBlock(this), 0, "inventory");
    }
}
