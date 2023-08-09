package com.darkfllame.jsdl;

import cz.adamh.utils.NativeUtils;

class NativeBindings {
	static {
		try {
			NativeUtils.loadLibraryFromJar("/SDL2.dll");
			NativeUtils.loadLibraryFromJar("/JSDL.dll");
		} catch(Exception e) {
			e.printStackTrace();
			System.exit(298);
		}
	}

	/* Don't care of window position */
	public static int SDL_WINDOWPOS_UNDEFINED = 0x1FFF0000 | 0;
	/* Centered window position */
	public static int SDL_WINDOWPOS_CENTERED = 0x2FFF0000 | 0;

	public native static int SDL_Init(int flags);
	public native static void SDL_Quit();
	public native static int SDL_InitSubSystem(int flags);
	public native static void SDL_QuitSubSystem(int flags);
	public native static int SDL_WasInit(int flags);
	public native static String SDL_GetError();
	public native static void SDL_SetError(String error);
	public native static int SDL_PollEvent(Event event);
	
	public native static long SDL_CreateWindow(String name, int x, int y, int width, int height, int flags);
	public native static void SDL_DestroyWindow(long windowHandle);
	public native static String SDL_GetWindowTitle(long windowHandle);
	public native static void SDL_SetWindowTitle(long windowHandle, String title);
	public native static int[] SDL_GetWindowSize(long windowHandle);
	public native static void SDL_SetWindowSize(long windowHandle, int width, int height);
	public native static int[] SDL_GetWindowPosition(long windowHandle);
	public native static void SDL_SetWindowPosition(long windowHandle, int x, int h);
	public native static void SDL_SetWindowResizable(long windowHandle, boolean resizable);

	public native static long SDL_GetRenderer(long windowHandle);
	public native static long SDL_RenderGetWindow(long rendererHandle);
	
	public native static long SDL_CreateRenderer(long windowHandle, int driver, int flags);
	public native static void SDL_DestroyRenderer(long rendererHandle);
	public native static int SDL_SetRenderTarget(long rendererHandle, long textureHandle);
	public native static long SDL_GetRenderTarget(long rendererHandle);
	public native static int SDL_SetRenderDrawColor(long rendererHandle, int r, int g, int b, int a);
	public native static int[] SDL_GetRenderDrawColor(long rendererHandle);
	public native static int SDL_RenderClear(long rendererHandle);
	public native static void SDL_RenderPresent(long rendererHandle);
	public native static int SDL_RenderDrawRect(long rendererHandle, int x, int y, int w, int h);
	public native static int SDL_RenderDrawRectF(long rendererHandle, float x, float y, float w, float h);
	public native static int SDL_RenderFillRect(long rendererHandle, int x, int y, int w, int h);
	public native static int SDL_RenderFillRectF(long rendererHandle, float x, float y, float w, float h);
}