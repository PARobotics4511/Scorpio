package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IterativeTurn extends Command {

	int i = 0;
	boolean turnFinished = false;
    public IterativeTurn() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.soulTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.soulTrain.frontLeft.set(.3);
    	Robot.soulTrain.backLeft.set(.3);
    	i++;
    	if(i>=50){
    		turnFinished = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(turnFinished){
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
