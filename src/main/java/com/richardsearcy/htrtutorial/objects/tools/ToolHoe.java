package com.richardsearcy.htrtutorial.objects.tools;

import com.richardsearcy.htrtutorial.Main;
import com.richardsearcy.htrtutorial.init.ItemInit;
import com.richardsearcy.htrtutorial.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {

    public ToolHoe(String name, ToolMaterial material) {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
