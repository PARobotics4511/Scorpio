package org.usfirst.frc.team4511.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Potentiometer extends Subsystem {
    
	public AnalogPotentiometer pot;
	public AnalogInput ai;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public double getPotentiometer(){
		pot = new AnalogPotentiometer(1, 270, -135);
		double degrees = pot.get();
		return degrees;
	}
	public String getSmartDashboard(){
		return pot.getSmartDashboardType();
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

