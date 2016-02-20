package org.usfirst.frc.team4511.robot.subsystems;

import org.usfirst.frc.team4511.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Cam extends Subsystem {
    public Servo panServoLR;
    public Servo panServoUD;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Cam(){
    	panServoLR = new Servo(RobotMap.servoUno);
    	panServoUD = new Servo(RobotMap.servoDos);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

