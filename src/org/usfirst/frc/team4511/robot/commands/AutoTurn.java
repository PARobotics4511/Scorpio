package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.Robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoTurn extends Command {

    public AutoTurn() {
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
    	int turnWheelCount = wheelEncoder.get(); 
    	int maxCount = 2000;
    	while(turnWheelCount < maxCount){
    		Robot.soulTrain.frontLeft.set(0.4);
    		Robot.soulTrain.backLeft.set(0.4);
    		if(turnWheelCount >= maxCount){
    			Robot.soulTrain.stop();
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
