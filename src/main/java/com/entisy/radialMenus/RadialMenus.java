package com.entisy.radialMenus;

import com.entisy.radialMenus.util.firetamer.handlers.KeyBindHandler;
import com.entisy.radialMenus.util.firetamer.handlers.TextureHandler;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
@SuppressWarnings("all")
@Mod("radialmenus")
@Mod.EventBusSubscriber(modid = RadialMenus.MOD_ID, bus = Bus.MOD)
public class RadialMenus {

    public static final String MOD_ID = "radialmenus";

    public RadialMenus() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        TextureHandler.init();
        KeyBindHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
