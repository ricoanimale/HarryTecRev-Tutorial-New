package com.richardsearcy.htrtutorial;

import com.richardsearcy.htrtutorial.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TutorialTab extends CreativeTabs {

    public TutorialTab(String label) {

        // Call the CreativeTabs constructor and pass the label "tutorialtab"
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {

        // Set the tab icon to a copper ingot
        return new ItemStack(ItemInit.INGOT_COPPER);
    }
}
