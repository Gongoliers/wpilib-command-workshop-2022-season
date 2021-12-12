package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Manipulator extends SubsystemBase {
  public Manipulator() {

  }

  /**
   * Spin the flywheel
   * @param power The power to spin (0 to 1)
   */
  public void spin(double power) {

  }

  /**
   * Extend the flywheel
   */
  public void extend(){

  }


  /**
   * Retract the flywheel
   */
  public void retract(){

  }

  /**
   * Lifts the ball to the flywheel (if any)
   */
  public void fire(){

  }

  /**
   * Determines if the ball is present
   */
  public boolean hasBall(){
    return false;
  }

  /**
   * Deterimines if the flywheel is fully extended
   */
  public boolean isFullyExtended(){
      return false;
  }

  /**
   * Deterimines if the flywheel is fully retracted
   */
  public boolean isFullyRetracted(){
    return true;
  }

}