package com.fyrexgg.Exordium.init;

import com.fyrexgg.Exordium.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //MISC
    public static final Item COLORFUL_SIGIL = new ItemBase("colorful_sigil");
    public static final Item STRAIGHT_BRANCH = new ItemBase("straight_branch");

    //Unrefined Gemstones
    public static final Item UNREFINED_BLUE_AGATE = new ItemBase("unrefined_blue_agate");

    //Refined Gemstones
    public static final Item BLUE_AGATE = new ItemBase("blue_agate");
}