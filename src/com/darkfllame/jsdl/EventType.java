package com.darkfllame.jsdl;

public class EventType {
    /**Unused (do not remove) */
	public static int FirstEvent = 0;

	 /**User-requested quit */
	public static int Quit = 0x100;

    /**The application is being terminated by the OS
     * Called on iOS in applicationWillTerminate()
     * Called on Android in onDestroy()
     */
	public static int AppTerminating = 0x101;
    /**The application is low on memory, free memory if possible.
     * Called on iOS in applicationDidReceiveMemoryWarning()
     * Called on Android in onLowMemory()
     */
	public static int AppLowMemory = 0x102;
	 /**The application is about to enter the background
      * Called on iOS in applicationWillResignActive()
      * Called on Android in onPause()
      */
	public static int AppWillEnterBackground = 0x103;
	 /**The application did enter the background and may not get CPU for some time
      * Called on iOS in applicationDidEnterBackground()
      * Called on Android in onPause()
	  */
	public static int AppDidEnterBackground = 0x104;
	 /**The application is about to enter the foreground
      * Called on iOS in applicationWillEnterForeground()
      * Called on Android in onResume()
      */
	public static int AppWillEnterForeground = 0x105;
	 /**The application is now interactive
      * Called on iOS in applicationDidBecomeActive()
      * Called on Android in onResume()
	  */
	public static int AppDidEnterForeground = 0x106;

	/**The user's locale preferences have changed. */
	public static int LocaleChanged = 0x107;

	/**Display state change */
	public static int DisplayEvent = 0x150;

	/**Window state change */
	public static int WindowEvent = 0x200;
    /**System specific event */
	public static int SysWMEvent = 0x201;

	 /**Key pressed */
	public static int KeyDown = 0x300;
    /**Key released */
	public static int KeyUp = 0x301;
    /**Keyboard text editing (composition) */
	public static int TextEditing = 0x302;
    /**Keyboard text input */
	public static int TextInput = 0x303;
    /**Keymap changed due to a system event such as an
     * input language or keyboard layout change.
     */
	public static int KeymapChanged = 0x304;
    /**Extended keyboard text editing (composition) */
	public static int TextEditingExt = 0x305;

	/**Mouse moved */
    public static int MouseMotion = 0x400;
    /**Mouse button pressed */
    public static int MouseButtonDown = 0x401;
    /**Mouse button released */
    public static int MouseButtonUp = 0x402;
    /**Mouse wheel motion */
    public static int MouseWheel = 0x403;
    
    /**Joystick axis motion */
    public static int JoyAxisMotion = 0x600;
    /**Joystick trackball motion */
    public static int JoyBallMotion = 0x601;
    /**Joystick hat position change */
    public static int JoyHatMotion = 0x602;
    /**Joystick button pressed */
    public static int JoyButtonDown = 0x603;
    /**Joystick button released */
    public static int JoyButtonUp = 0x604;
    /**A new joystick has been inserted into the system */
    public static int JoyDeviceAdded = 0x605;
    /**An opened joystick has been removed */
    public static int JoyDeviceRemoved = 0x606;
    /**Joystick battery level change */
    public static int JoyBatteryUpdate = 0x607;

    /**Game controller axis motion */
    public static int ControllerAxisMotion = 0x650;
    /**Game controller button pressed */
    public static int ControllerButtonDown = 0x651;
    /**Game controller button released */
    public static int ControllerButtonUp = 0x652;
    /**A new Game controller has been inserted into the system */
    public static int ControllerDeviceAdded = 0x653;
    /**An opened Game controller has been removed */
    public static int ControllerDeviceRemoved = 0x654;
    /**The controller mapping was updated */
    public static int ControllerDeviceRemapped = 0x655;
    /**Game controller touchpad was touched */
    public static int ControllerTouchpadDown = 0x656;
    /**Game controller touchpad finger was moved */
    public static int ControllerTouchpadMotion = 0x657;
    /**Game controller touchpad finger was lifted */
    public static int ControllerTouchpadUp = 0x658;
    /**Game controller sensor was updated */
    public static int ControllerSensorUpdate = 0x659;

    public static int FingerDown = 0x700;
    public static int FinderUp = 0x701;
    public static int FingerMotion = 0x702;

    public static int DollarGesture = 0x800;
    public static int DollarRecord = 0x801;
    public static int MultiGesture = 0x802;

    /**The clipboard or primary selection changed */
    public static int ClipboardUpdate = 0x900;

    /**The system requests a file open */
    public static int DropFile = 0x1000;
    /**text/plain drag-and-drop event */
    public static int DropText = 0x1001;
    /**A new set of drops is beginning (NULL filename) */
    public static int DropBegin = 0x1002;
    /**Current set of drops is now complete (NULL filename) */
    public static int DropComplete = 0x1003;

    /**A new audio device is available */
    public static int AudioDeviceAdded = 0x1100;
    /**An audio device has been removed. */
    public static int AudioDeviceRemoved = 0x1101;

    /**A sensor was updated */
    public static int SensorUpdate = 0x1200;

    /**The render targets have been reset and their contents need to be updated */
    public static int RenderTargetsReset = 0x2000;
    /**The device has been reset and all textures need to be recreated */
    public static int RenderDeviceReset = 0x2001;

    /**Signals the end of an event poll cycle */
    public static int PollSentinel = 0x7F00;

    /** Events UserEvent through LastEvent are for your use,
     *  and should be allocated with RegisterEvents()
     */
    public static int UserEvent = 0x8000;

    /**
     *  This last event is only for bounding internal arrays
     */
    public static int LastEvent = 0xFFFF;
}
