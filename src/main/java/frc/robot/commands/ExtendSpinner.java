package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class ExtendSpinner extends CommandBase {

    public ExtendSpinner(){
        addRequirements(Robot.manipulator);
    }

    @Override
    public void initialize() {
        Robot.manipulator.extend();
    }

    @Override
    public void execute() {
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return Robot.manipulator.isFullyExtended();
    }
} 