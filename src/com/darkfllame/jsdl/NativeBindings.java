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

	public static int SDL_WINDOWPOS_CENTERED = 0x2FFF0000 | 0;

	public native static long SDL_CreateWindow(String name, int width, int height, int flags);
	public native static void SDL_DeleteWindow(long windowHandle);
	public native static String SDL_GetWindowTitle(long windowHandle);
	public native static void SDL_SetWindowTitle(long windowHandle, String title);
	public native static int[] SDL_GetWindowSize(long windowHandle);
	public native static void SDL_SetWindowSize(long windowHandle, int width, int height);
	public native static int[] SDL_GetWindowPosition(long windowHandle);
	public native static void SDL_SetWindowPosition(long windowHandle, int x, int h);
}