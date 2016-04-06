package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoDrive extends Command {
	double maxDriveCount = 1000;
	double currentCount;
	boolean adIsFinished;
    public AutoDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.soulTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.soulTrain.blEncoder.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	currentCount = Robot.soulTrain.blEncoder.get();
    	while(currentCount < maxDriveCount){
    		Robot.soulTrain.robotD.tankDrive(.6, .6);
    		currentCount++;
    	}
    	adIsFinished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(adIsFinished)return true;
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
