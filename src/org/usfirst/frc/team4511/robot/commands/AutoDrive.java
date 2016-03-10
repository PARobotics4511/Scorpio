package org.usfirst.frc.team4511.robot.commands;

import java.io.Console;

import org.usfirst.frc.team4511.robot.Robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoDrive extends Command {
	int maxDriveRotations = 10;
	boolean adIsFinished = false;
	
    public AutoDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.soulTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.soulTrain.wheelEncoder.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		int currentAutoWheelCount = Robot.soulTrain.wheelEncoder.get();
    		while(currentAutoWheelCount < maxDriveRotations){
    			Robot.soulTrain.robotD.drive(.2, 0);
    			if(currentAutoWheelCount >= maxDriveRotations){
    				adIsFinished = true;
    			}
    		}
    	}

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(adIsFinished){
    		return true;
		}
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.soulTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
