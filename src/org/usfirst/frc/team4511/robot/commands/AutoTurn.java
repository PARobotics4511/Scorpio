package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoTurn extends Command {
	//double angle;
	double count;
	boolean finished = false;
    public AutoTurn() {
    	requires(Robot.soulTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//Robot.soulTrain.gyro.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//angle = Robot.soulTrain.gyro.getAngle();
    	while(count <= 500){
    		Robot.soulTrain.robotD.tankDrive(.4, 0);
    		count++;
    	}
    	finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(finished)return true;
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
