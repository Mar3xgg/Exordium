package com.fyrexgg.Exordium.items;

import com.fyrexgg.Exordium.Main;
import com.fyrexgg.Exordium.init.ModItems;
import com.fyrexgg.Exordium.util.Models;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements Models {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.DECORATIONS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
