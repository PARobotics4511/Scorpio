package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IterativeAD extends Command {
	int i = 0;
	boolean ADDone = false;
    public IterativeAD() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.soulTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.soulTrain.robotD.drive(.3, 0);
    	i++;
    	if(i>= 100){
    		ADDone = true;
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(ADDone){
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
