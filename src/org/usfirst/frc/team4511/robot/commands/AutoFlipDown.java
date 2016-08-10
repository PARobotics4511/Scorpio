package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoFlipDown extends Command {
	double count = 0;
	boolean finished = false;
    public AutoFlipDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.lift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	while(count <= 50){
    		Robot.lift.liftMotor.set(.15);
    		count++;
    	}
    	try{
    		Thread.sleep(3000);
    	}catch(InterruptedException ex){
    		Thread.currentThread().interrupt();
    	}
    	//Robot.lift.liftMotor.set(0);
    	finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(finished) return true;
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
