package org.usfirst.frc.team4511.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4511.robot.RobotMap;
import org.usfirst.frc.team4511.robot.commands.FlipUp;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;

/**
 *
 */
public class Lift extends Subsystem {
	public CANTalon liftMotor;
	public CANTalon winchMotor;
    
	public Solenoid botSol;
	public Solenoid topSol;
	
	public Compressor comp;
	
	public Lift(){
		liftMotor = new CANTalon(RobotMap.pistonLifter);
		winchMotor = new CANTalon(RobotMap.winch);
		botSol = new Solenoid(RobotMap.solBot);
		topSol = new Solenoid(RobotMap.solTop);
		comp = new Compressor(RobotMap.compressor);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

