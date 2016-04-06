package org.usfirst.frc.team4511.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// Drivetrain Motors
	public static int frontLeft = 1;
	public static int frontRight = 2;
	public static int backRight = 3;
	public static int backLeft = 4;
	
	
	// Winch motor
	public static int winch = 6;

	// Spinner motors
	public static int spinnerUno = 8;
	public static int spinnerDos = 9;

	// Piston Lifters
	public static int pistonLifter = 7; // Lifts component with piston on it [for use at end of match]
	public static int grabberLifter = 5; // Lifts grabber bar [for ball] on front of robot 

	// Solenoids
	public static int solBot = 0;
	public static int solTop = 1;

	public static int potentiometer = 12;
	
	public static int compressor = 0;
	
	//Servos
	public static int servoUno = 0;
	public static int servoDos = 1;
	
}
