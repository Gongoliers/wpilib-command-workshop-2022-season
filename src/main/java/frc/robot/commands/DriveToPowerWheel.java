package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class DriveToPowerWheel extends CommandBase {

    public DriveToPowerWheel(){
        addRequirements(Robot.drivetrain);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        Robot.drivetrain.drive(0.1, 0.0);
    }

    @Override
    public void end(boolean interrupted) {
        Robot.drivetrain.drive(0.0, 0.0);
    }

    @Override
    public boolean isFinished() {
        return Robot.powerSensor.isAtPowerIndicator();
    }
} 