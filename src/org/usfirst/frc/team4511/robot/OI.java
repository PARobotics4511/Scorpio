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
    JoystickButton butt4l = new JoystickButton(jLeft, 4);
    //JoystickButton butt6l = new JoystickButton(jLeft, 6);
    JoystickButton butt7l = new JoystickButton(jLeft, 7);
    //JoystickButton butt10l = new JoystickButton(jLeft, 10);
    
    JoystickButton butt3r = new JoystickButton(jRight, 3);
    JoystickButton butt5r = new JoystickButton(jRight, 5);
    //JoystickButton butt6r = new JoystickButton(jRight, 6);
    JoystickButton butt7r = new JoystickButton(jRight, 7);
    //JoystickButton butt11r = new JoystickButton(jRight, 11);
    JoystickButton butt1r = new JoystickButton(jRight, 1);

    JoystickButton aButt = new JoystickButton(gamepad, 1);
    JoystickButton bButt = new JoystickButton(gamepad, 2);
    JoystickButton xButt = new JoystickButton(gamepad, 3);
    JoystickButton yButt = new JoystickButton(gamepad, 4);
    
    JoystickButton lBumper = new JoystickButton(gamepad, 5);
    JoystickButton rBumper = new JoystickButton(gamepad, 6);
    
    butt1l.whileHeld(new Vent());
    butt1l.whenReleased(new PistonDefault());
    butt1r.whileHeld(new Extend());
    butt1r.whenReleased(new PistonDefault());
    bButt.whenPressed(new BarUp());
    bButt.whenReleased(new BarStop());
    xButt.whenPressed(new BarDown());
    xButt.whenReleased(new BarStop());
    butt3l.whenPressed(new WinchUp());
    butt3l.whenReleased(new WinchStop());
    butt3r.whenPressed(new WinchDown());
    butt3r.whenReleased(new WinchStop());
    butt4l.whenPressed(new BarDown());
    butt4l.whenReleased(new BarStop());
    butt5r.whenPressed(new BarUp());
    butt5r.whenReleased(new BarStop());
    lBumper.whenPressed(new FlipDown());
    lBumper.whenReleased(new FlipStop());
    yButt.whenPressed(new SuckIn());
    yButt.whenReleased(new SuckStop());
    aButt.whenPressed(new SpitOut());
    aButt.whenReleased(new SuckStop());
    butt7l.whenPressed(new PullUp());
    butt7r.whenPressed(new PistonDefault());
    rBumper.whenPressed(new FlipUp());
    rBumper.whenReleased(new FlipStop());
    
    
    
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
    		return -jLeft.getY();
    	}
    	return 0;
    }
    
    public static double getYInput(){
    	if(Math.abs(jRight.getY()) > deadzone){
    		return -jRight.getY();
    	}
    	return 0;
    }
       
}
    

