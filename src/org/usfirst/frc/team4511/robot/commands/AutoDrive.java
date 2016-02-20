package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.Robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoDrive extends Command {

    public AutoDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.soulTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Encoder wheelEncoder = new Encoder(1,2, true, EncodingType.k4X);
    	wheelEncoder.reset();
    	int maxDriveRotations = 1000;
    	while(!Robot.adHasFinished){
    		int currentAutoWheelCount = wheelEncoder.get();
    		while(currentAutoWheelCount < maxDriveRotations){
    			Robot.soulTrain.robotD.drive(1, 0);
    			if(currentAutoWheelCount >= maxDriveRotations){
    				Robot.soulTrain.stop();
    				Robot.adHasFinished = true;
    				if(Robot.adHasFinished){
    					Robot.soulTrain.stop();
    				}
    			}
    		}
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
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
