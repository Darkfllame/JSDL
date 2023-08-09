package com.darkfllame.jsdl;

public class WindowFlags {
	/**Fullscreen window */
	public static int WindowFullscreen = 0x00000001;
    /**Window usable with OpenGL context */
	public static int WindowOpenGl = 0x00000002;
    /**Window is visible */
    public static int WindowShown = 0x00000004;
    /**Window is not visible */
    public static int WindowHidden = 0x00000008;
    /**< no window decoration */
    public static int WindowBorderless = 0x00000010;
    /**Window can be resized */
    public static int WindowResizable = 0x00000020;
    /**Window is minimized */
    public static int WindowMinimized = 0x00000040;
    /**Window is maximized */
    public static int WindowMaximized = 0x00000080;
    /**Window has grabbed mouse input */
    public static int WindowMouseGrabbed = 0x00000100;
    /**Window has input focus */
    public static int WindowInputFocus = 0x00000200;
    /**Window has mouse focus */
    public static int WindowMouseFocus = 0x00000400;
    public static int WindowFullscreenDesktop = ( WindowFullscreen | 0x00001000 );
    /**Window not created by SDL */
    public static int WindowForeign = 0x00000800;
    /**Window should be created in high-DPI mode if supported.
    On macOS NSHighResolutionCapable must be set true in the
    application's Info.plist for this to have any effect. */
    public static int WindowAllowHighDIP = 0x00002000;
    /**Window has mouse captured (unrelated to MouseGrabbed) */
    public static int WindowMouseCapture = 0x00004000;
    /**Window should always be above others */
    public static int WindowAlwaysOnTop = 0x00008000;
    /**Window should not be added to the taskbar */
    public static int WindowSkipTaskbar = 0x00010000;
    /**Window should be treated as a utility window */
    public static int WindowUtility = 0x00020000;
    /**Window should be treated as a tooltip */
    public static int WindowTooltip = 0x00040000;
    /**Window should be treated as a popup menu */
    public static int WindowPopupMenu = 0x00080000;
    /**Window has grabbed keyboard input */
    public static int WindowKeyboardGrabbed = 0x00100000;
    /**Window usable for Vulkan surface */
    public static int WindowVulkan = 0x10000000;
    /**Window usable for Metal view */
    public static int WindowMetal = 0x20000000;

    /**< equivalent to WindowMouseGrabbed for compatibility */
    public static int WindowINPUT_GRABBED = WindowMouseGrabbed;
}