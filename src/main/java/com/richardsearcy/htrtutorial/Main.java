package com.richardsearcy.htrtutorial;

import com.richardsearcy.htrtutorial.proxy.CommonProxy;
import com.richardsearcy.htrtutorial.util.Reference;
import com.richardsearcy.htrtutorial.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
    public static CommonProxy proxy;

    public static final CreativeTabs tutorialtab = new TutorialTab("tutorialtab");

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

        RegistryHandler.otherRegistries();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {}

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {}
}
