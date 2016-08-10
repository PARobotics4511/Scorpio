package org.usfirst.frc.team4511.robot.subsystems;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4511.robot.RobotMap;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;

/**
 *
 */
public class Lift extends Subsystem {
	public CANTalon liftMotor;
	public CANTalon winchMotor;
    
	public Solenoid botSol;
	public Solenoid topSol;
	
	public Compressor comp;
	public Encoder winchEncoder;
	public Encoder pullUpEncoder;
	
	public Lift(){
		liftMotor = new CANTalon(RobotMap.pistonLifter);
		winchMotor = new CANTalon(RobotMap.winch);
		//botSol = new Solenoid(RobotMap.solBot);
		topSol = new Solenoid(RobotMap.solTop);
		comp = new Compressor(RobotMap.compressor);
		winchEncoder = new Encoder(3, 4, false, EncodingType.k4X);
    	pullUpEncoder = new Encoder(5, 6, false, EncodingType.k4X);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

