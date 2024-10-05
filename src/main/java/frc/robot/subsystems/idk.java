// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Robot;
import frc.robot.RobotContainer;

public class idk extends SubsystemBase {
 public static final DoubleSolenoid m_doubleSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 3, 4);


  public idk() {
    m_doubleSolenoid.set(Value.kForward);
    
  }

  @Override
  public void periodic() {
  }

  public void setForward(){
    m_doubleSolenoid.set(DoubleSolenoid.Value.kForward);
  }

  public void setReverse(){
    m_doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
  }
}
