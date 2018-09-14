package com.richardsearcy.htrtutorial.init;

import com.richardsearcy.htrtutorial.objects.armor.ArmorBase;
import com.richardsearcy.htrtutorial.objects.items.ItemBase;
import com.richardsearcy.htrtutorial.objects.tools.*;
import com.richardsearcy.htrtutorial.util.Reference;
import net.minecraft.advancements.critereon.EnchantedItemTrigger;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Materials
    public static final Item.ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("too_copper", 2, 180, 5.0F, 1.5F, 5);
    public static final ItemArmor.ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper", Reference.MODID + ":copper", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);


    // Items
    public static final Item INGOT_COPPER = new ItemBase("ingot_copper");

    // Tools
    public static final Item AXE_COPPER = new ToolAxe("axe_copper", TOOL_COPPER);
    public static final Item HOE_COPPER = new ToolHoe("hoe_copper",TOOL_COPPER);
    public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
    public static final Item SHOVEL_COPPER = new ToolShovel("shovel_copper", TOOL_COPPER);
    public static final Item SWORD_COPPER = new ToolSword("sword_copper", TOOL_COPPER);

    // Armor
    public static final Item HELMET_COPPER = new ArmorBase("helmet_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_COPPER = new ArmorBase("chestplate_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_COPPER = new ArmorBase("leggings_copper", ARMOR_COPPER, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_COPPER = new ArmorBase("boots_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.FEET);
}
