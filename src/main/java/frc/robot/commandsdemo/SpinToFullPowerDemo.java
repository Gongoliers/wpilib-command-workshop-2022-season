package frc.robot.commandsdemo;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class SpinToFullPowerDemo extends CommandBase {

    public SpinToFullPowerDemo(){
        addRequirements(Robot.manipulator);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        Robot.manipulator.spin(1.0);
    }

    @Override
    public void end(boolean interrupted) {
        Robot.manipulator.spin(0.0);
    }

    @Override
    public boolean isFinished() {
        return Robot.powerSensor.getPower() >= 1.0;
    }
}