package frc.robot.subsystems;

// import com.ctre.phoenix6.hardware.

// import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.NeutralMode;
// import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.Ports.*;

public class Shooter extends SubsystemBase {

    private CANSparkMax top = new CANSparkMax(TopShooter, MotorType.kBrushed); // Device ID will change (constants)
    private CANSparkMax bottom = new CANSparkMax(BottomShooter, MotorType.kBrushed); // Device ID will change (constants)


    public Shooter() {
        // Shooter.setNeutralMode(NeutralMode.Brake);
    }

    public void setTop(double speed) {
        top.set(speed);
    }

    public void setBottom(double speed) {
        bottom.set(speed);
    }

    public void stop() {
        top.set(0);
        bottom.set(0);
    }

}
