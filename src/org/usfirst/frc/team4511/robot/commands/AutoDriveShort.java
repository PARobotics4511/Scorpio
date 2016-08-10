package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoDriveShort extends Command {
	double count;
	double shortCount = 500;
	boolean finished = false;
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
    	finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(finished) return true;
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
