package org.usfirst.frc.team4511.robot.commands;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoPullUp extends Command {

    public AutoPullUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	boolean extended = false;
    	Encoder winchEncoder = new Encoder(3, 4, true, EncodingType.k4X);
    	Encoder pullUpEncoder = new Encoder(5, 6, true, EncodingType.k4X);
    	winchEncoder.reset();
    	pullUpEncoder.reset();
    	int maxWinchRotations = 2560;
    	int maxFlipUpRange = 256; // x/1024 = 90/360
    	//Encoder is 1024 CPR
    	
    	int currentFlipUpCount = pullUpEncoder.get(); 
    	int currentWinchCount = winchEncoder.get();
    	while(currentFlipUpCount <= maxFlipUpRange){
    		new FlipUp();
    	}
    	if (currentFlipUpCount >= maxFlipUpRange){
    		new Extend();
    		extended = true;
    	}
    	while(extended && currentWinchCount < maxWinchRotations){
        	new PullUp();
        	new WinchUp();
        	if(currentWinchCount >= maxWinchRotations && currentFlipUpCount >= maxFlipUpRange){
        			new WinchStop();
        		}
    		}
    	}
   

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
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
