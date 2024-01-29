// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.Ports.*;


public class Drivetrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  private CANSparkMax left1;
  private CANSparkMax left2;
  private CANSparkMax right1;
  private CANSparkMax right2;

  private DifferentialDrive drive;

  public Drivetrain() {
    left1 = new CANSparkMax(MOTOR_LEFT1, MotorType.kBrushed);
    left2 = new CANSparkMax(MOTOR_LEFT2, MotorType.kBrushed);
    right1 = new CANSparkMax(MOTOR_RIGHT1, MotorType.kBrushed);
    right2 = new CANSparkMax(MOTOR_RIGHT2, MotorType.kBrushed);

    left2.follow(left1);
    right2.follow(right1);

    drive = new DifferentialDrive(left1, right1);   
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  } 
  public void driveTank(double leftSpeed, double rightSpeed) {
    drive.tankDrive(leftSpeed, rightSpeed);
  }
}
