package com.entisy.radialMenus.util.firetamer.handlers;

import com.entisy.radialMenus.RadialMenus;
import com.entisy.radialMenus.util.firetamer.SimpleSpriteObject;
import net.minecraft.resources.ResourceLocation;

public class TextureHandler {
    public static final ResourceLocation STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation OVERLAY_RL = new ResourceLocation("block/water_overlay");


    public static SimpleSpriteObject BLUE_KI_BLAST_SPRITE;


    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


    public TextureHandler() {}

    public static void init() {
        createSpriteTextureData();
    }

    private static void createSpriteTextureData() {
        BLUE_KI_BLAST_SPRITE = new SimpleSpriteObject(new ResourceLocation(RadialMenus.MOD_ID, "textures/sprites/blue_ki_blast_sprite.png"),
                0, 0, 32, 32);
    }
}