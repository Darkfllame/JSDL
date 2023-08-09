package com.darkfllame.jsdl;

public class InitFlags {
	public static int InitTimer = 0x00000001;
	public static int InitAudio = 0x00000010;
	  /**InitVideo implies InitEvents */
	public static int InitVideo = 0x00000020;
	  /**InitJoystick implies InitEvents */
	public static int InitJoystick = 0x00000200;
	public static int InitHaptic = 0x00001000;
	  /**InitGameController implies InitJoystick */
	public static int InitGameController = 0x00002000;
	public static int InitEvents = 0x00004000;
	public static int InitSensor = 0x00008000;
	  /**Compatibility; this flag is ignored. */
	public static int InitNoParachute = 0x00100000;
	public static int InitEverything = InitTimer | InitAudio | InitVideo | InitEvents | InitJoystick | InitHaptic | InitGameController | InitSensor;
}