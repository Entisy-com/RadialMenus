package com.entisy.radialMenus.util.firetamer.handlers;

import com.entisy.radialMenus.RadialMenus;
import com.entisy.radialMenus.test.RadialTestScreen;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Keybinds are client side only. From what I understand, packets are required to do server side stuff with keybinds
 */
public class KeyBindHandler {
    private KeyBindHandler() {}

    public static KeyMapping openRadialSkillMenu;

    public static void init() {
        /* Single Press Keybinds */


        /* Continuous Press Keybinds */
        openRadialSkillMenu = registerKey("open_player_gui_key", InputConstants.KEY_NUMPAD1, KeyMapping.CATEGORY_INTERFACE);


    }


    private static KeyMapping registerKey(String name, int keycode, String category) {
        final var key = new KeyMapping("key." + RadialMenus.MOD_ID + "." + name, keycode, category);

        ClientRegistry.registerKeyBinding(key);
        return key;
    }


    /**
     * This is for defining what a key does on press
     * This isn't in the event handler because this will likely have a lot of if statements added overtime and the content is only for keybinds
     */
    @Mod.EventBusSubscriber(modid = RadialMenus.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public class ForgeBusClientEvents {

        @SubscribeEvent
        public static void clientTick(TickEvent.ClientTickEvent event) {
            final var player = Minecraft.getInstance().player;


            //keybind.isDown() should be a continuous action rather than a single action no matter how long the keybind is pressed
            if (KeyBindHandler.openRadialSkillMenu.consumeClick()) {
                //NetworkHooks.openGui(((ServerPlayer)pPlayer), (FabricatorBlockTile)entity, pPos);
                Minecraft.getInstance().setScreen(new RadialTestScreen());
                //player.displayClientMessage(new TextComponent("Hello there... General Kenobi"), false);
            }

        }
    }
}