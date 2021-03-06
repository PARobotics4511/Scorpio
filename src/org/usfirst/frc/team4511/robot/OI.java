 package org.usfirst.frc.team4511.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team4511.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    static Joystick jLeft = new Joystick(0);
    static Joystick jRight = new Joystick(1);
    static Joystick gamepad = new Joystick(2);
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    static double deadzone = .1;
   
    public OI(){  
    JoystickButton butt1l = new JoystickButton(jLeft, 1);
    JoystickButton butt3l = new JoystickButton(jLeft, 3);
    //JoystickButton butt4l = new JoystickButton(jLeft, 4);
    //JoystickButton butt6l = new JoystickButton(jLeft, 6);
    //JoystickButton butt10l = new JoystickButton(jLeft, 10);
    
    JoystickButton butt3r = new JoystickButton(jRight, 3);
    //JoystickButton butt5r = new JoystickButton(jRight, 5);

    //JoystickButton butt6r = new JoystickButton(jRight, 6);
    //JoystickButton butt11r = new JoystickButton(jRight, 11);
    JoystickButton butt1r = new JoystickButton(jRight, 1);

    JoystickButton aButt = new JoystickButton(gamepad, 1);
    JoystickButton bButt = new JoystickButton(gamepad, 2);
    JoystickButton xButt = new JoystickButton(gamepad, 3);
    JoystickButton yButt = new JoystickButton(gamepad, 4);
    
    JoystickButton lBumper = new JoystickButton(gamepad, 5);
    JoystickButton rBumper = new JoystickButton(gamepad, 6);

    JoystickButton cutter = new JoystickButton(gamepad, 7);
    
    lBumper.whileHeld(new Vent());
    //lBumper.whenReleased(new PistonDefault());
    rBumper.whileHeld(new Extend());
    //rBumper.whenReleased(new PistonDefault());
    aButt.whenPressed(new BarUp());
    aButt.whenReleased(new BarStop());
    yButt.whenPressed(new BarDown());
    yButt.whenReleased(new BarStop());
    butt3l.whenPressed(new WinchUp());
    butt3l.whenReleased(new WinchStop());
    butt3r.whenPressed(new WinchDown());
    butt3r.whenReleased(new WinchStop());
    /*butt4l.whenPressed(new BarDown());
    butt4l.whenReleased(new BarStop());
    butt5r.whenPressed(new BarUp());
    butt5r.whenReleased(new BarStop());*/
    butt1l.whenPressed(new FlipDown());
    butt1l.whenReleased(new FlipStop());
    bButt.whenPressed(new SuckIn());
    bButt.whenReleased(new SuckStop());
    xButt.whenPressed(new SpitOut());
    xButt.whenReleased(new SuckStop());
    butt1r.whenPressed(new FlipUp());
    butt1r.whenReleased(new FlipStop());
    cutter.whenPressed(new EnableCutter());
   
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    }
    
    public static double getYInput2(){
    	if(Math.abs(jLeft.getY()) > deadzone){
    		return jLeft.getY();
    	}
    	return 0;
    }
    
    public static double getYInput(){
    	if(Math.abs(jRight.getY()) > deadzone){
    		return jRight.getY();
    	}
    	return 0;
    }
    
    public static double getYInputBack1(){
    	if(Math.abs(jRight.getY()) > deadzone){
    		return -jRight.getY();
    	}
    	return 0;
    }
    
    public static double getYInputBack2(){
    	if(Math.abs(jLeft.getY()) > deadzone){
    		return -jLeft.getY();
    	}
    	return 0;
    }       
}
    

