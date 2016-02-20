package org.usfirst.frc.team4511.robot.subsystems;

import org.usfirst.frc.team4511.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Mandible extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public CANTalon grabber = new CANTalon(RobotMap.grabberLifter);
	
	public CANTalon spinner0 = new CANTalon(RobotMap.spinnerUno);
	public CANTalon spinner1 = new CANTalon(RobotMap.spinnerDos);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

