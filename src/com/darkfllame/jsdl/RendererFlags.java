package com.darkfllame.jsdl;

public class RendererFlags {
    /**The renderer is a software fallback */
	public static int RendererSoftware = 0x00000001;
    /**The renderer uses hardware acceleration */
    public static int RendererAccelerated = 0x00000002;
    /**Present is synchronized with the refresh rate */
    public static int RendererPresentVSync= 0x00000004;
    /**The renderer supports rendering to texture */
    public static int RendererTargetTexture = 0x00000008;
}