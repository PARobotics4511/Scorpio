package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoDriveShort extends Command {
	double count;
	double shortCount = 1000;
    public AutoDriveShort() {
    	requires(Robot.soulTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.soulTrain.blEncoder.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	count = Robot.soulTrain.blEncoder.get();
    	while(count <= shortCount){
    		Robot.soulTrain.robotD.tankDrive(.4, .4);
    		count++;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(count >= shortCount) return true;
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
