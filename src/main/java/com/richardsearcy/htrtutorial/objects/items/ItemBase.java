package com.richardsearcy.htrtutorial.objects.items;

import com.richardsearcy.htrtutorial.Main;
import com.richardsearcy.htrtutorial.init.ItemInit;
import com.richardsearcy.htrtutorial.proxy.ClientProxy;
import com.richardsearcy.htrtutorial.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
