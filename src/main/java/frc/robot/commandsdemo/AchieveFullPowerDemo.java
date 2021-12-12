package frc.robot.commandsdemo;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AchieveFullPowerDemo extends SequentialCommandGroup {

    public AchieveFullPowerDemo(){
        super(
            new DriveToPowerWheelDemo(),
            new ExtendSpinnerDemo(),
            new SpinToFullPowerDemo().withTimeout(3),
            new RetractSpinnerDemo()
        );
    }

}