package com.richardsearcy.htrtutorial.objects.tools;

import com.richardsearcy.htrtutorial.Main;
import com.richardsearcy.htrtutorial.init.ItemInit;
import com.richardsearcy.htrtutorial.util.IHasModel;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel {

    public ToolShovel(String name, ToolMaterial material) {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tutorialtab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
