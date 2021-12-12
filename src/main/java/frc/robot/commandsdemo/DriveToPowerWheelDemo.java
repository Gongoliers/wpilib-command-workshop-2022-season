package frc.robot.commandsdemo;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class DriveToPowerWheelDemo extends CommandBase {

    public DriveToPowerWheelDemo(){
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