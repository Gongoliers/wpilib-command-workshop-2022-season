package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AchieveFullPower extends SequentialCommandGroup {

    public AchieveFullPower(){
        addCommands(
            new DriveToPowerWheel(),
            new ExtendSpinner(),
            new SpinToFullPower(),
            new RetractSpinner()
        );
    }

}