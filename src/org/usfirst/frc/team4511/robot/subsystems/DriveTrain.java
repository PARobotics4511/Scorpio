package org.usfirst.frc.team4511.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4511.robot.*;
import org.usfirst.frc.team4511.robot.commands.Drive;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {
	public CANTalon frontLeft = new CANTalon(RobotMap.frontLeft);
	public CANTalon frontRight = new CANTalon(RobotMap.frontRight);
	public CANTalon backLeft = new CANTalon(RobotMap.backLeft);
	public CANTalon backRight = new CANTalon(RobotMap.backRight);

	public RobotDrive robotD = new RobotDrive(frontLeft, backLeft, frontRight, backRight);

	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	robotD.setSafetyEnabled(true);
		setDefaultCommand(new Drive());
    }
	
	public void takeJoystick(double d, double e) {
		robotD.tankDrive(d, e);
	}
	
	public void stop() {
		robotD.drive(0, 0);
	}
}
