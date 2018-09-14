package com.richardsearcy.htrtutorial.objects.tools;

import com.richardsearcy.htrtutorial.Main;
import com.richardsearcy.htrtutorial.init.ItemInit;
import com.richardsearcy.htrtutorial.util.IHasModel;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

    public ToolPickaxe(String name, ToolMaterial material) {

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
