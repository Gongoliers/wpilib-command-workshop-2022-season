package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class RetractSpinner extends CommandBase {

    public RetractSpinner(){
        addRequirements(Robot.manipulator);
    }

    @Override
    public void initialize() {
        Robot.manipulator.retract();
    }

    @Override
    public void execute() {
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return Robot.manipulator.isFullyRetracted();
    }
} 