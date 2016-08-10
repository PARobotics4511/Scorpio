package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoSpitOut extends Command {
	boolean finished = false;
	double count = 0;
    public AutoSpitOut() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.mouth);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	while(count <= 200){
    		Robot.mouth.spinner0.set(-1);
        	Robot.mouth.spinner1.set(1);
        	count++;
    	}
    	/*Robot.mouth.spinner0.set(0);
    	Robot.mouth.spinner1.set(0);*/
    	finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(finished) return true;
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.mouth.spinner0.set(0);
    	Robot.mouth.spinner1.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
