// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.auto;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.Command;

public class DriveDistance extends Command {
  
  private final Drivetrain drive;
  private final double speed;
  private final double distance;

  /**
   * Creates a new command that uses the Drivetrain subsystem. 
   * This command will drive your your robot for a desired distance at a desired speed.
   * @param speed The speed at which the robot will drive
   * @param inches The number of inches the robot will drive
   * @param drive The drivetrain subsystem on which this command will run
   */
  public DriveDistance(double speed) { //13C. add another parameter here for inches
    
    this.speed = speed;
    this.distance = 0; // 13D. make the distance field save the distance parameter
    drive = Drivetrain.getInstance();
    
    addRequirements(drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    drive.arcadeDrive(0, 0);
    drive.resetEncoders();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //13E. Can you move the robot forward with the speed given?

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // 13F. Can you make the motors stop when the command ends?

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    // 13G. When should we stop moving forward?  By only looking at the left wheel?
    if( Math.abs(drive.getLeftDistanceInch()) >= 0){
      return true;
    } else {
      return false;
    }

  }
}
