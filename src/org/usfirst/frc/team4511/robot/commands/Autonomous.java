package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {
    
    public  Autonomous() {
    	requires(Robot.soulTrain);
    	requires(Robot.mouth);
    	requires(Robot.lift);
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    	addSequential(new AutoBarDown());
    	addSequential(new AutoFlipDown());
    	//addSequential(new AutoFlipUp());
    	//addSequential(new AutoBarUp());
    	addSequential(new AutoDrive());
    	//addSequential(new AutoTurn());
    	//addSequential(new AutoDriveShort());
    	//addSequential(new AutoSpitOut());
    	//addSequential(new SuckStop());
        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.*/
    }
}
