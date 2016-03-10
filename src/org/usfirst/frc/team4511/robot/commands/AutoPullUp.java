package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.Robot;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoPullUp extends Command {
	
	int maxWinchRotations = 20;
	int maxFlipUpRange = 20; // x/1024 = 90/360
	//Encoder is 1024 CPR
	boolean pullUpIsFinished = false;
	boolean extended = false;
    public AutoPullUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.lift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.lift.winchEncoder.reset();
    	Robot.lift.pullUpEncoder.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	int currentFlipUpCount = Robot.lift.pullUpEncoder.get(); 
    	int currentWinchCount = Robot.lift.winchEncoder.get();
    	while(currentFlipUpCount <= maxFlipUpRange){
    		new FlipUp();
    	}
    	if (currentFlipUpCount >= maxFlipUpRange){
    		new Extend();
    		extended = true;
    	}
    	while(extended && currentWinchCount < maxWinchRotations){
        	new Vent();
        	new WinchUp();
        	if(currentWinchCount >= maxWinchRotations && currentFlipUpCount >= maxFlipUpRange){
        		pullUpIsFinished = true;	
        		}
    		}
    	}
   

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(pullUpIsFinished){
    		return true;
    	}
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	new WinchStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
