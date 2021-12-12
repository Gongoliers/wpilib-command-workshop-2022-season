package frc.robot.commandsdemo;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AchieveFullPowerDemo extends SequentialCommandGroup {

    public AchieveFullPowerDemo(){
        addCommands(
            new DriveToPowerWheelDemo(),
            new ExtendSpinnerDemo(),
            new SpinToFullPowerDemo(),
            new RetractSpinnerDemo()
        );
    }

}