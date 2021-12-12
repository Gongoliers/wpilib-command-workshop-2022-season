package frc.robot.commandsdemo;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class RetractSpinnerDemo extends CommandBase {

    public RetractSpinnerDemo(){
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