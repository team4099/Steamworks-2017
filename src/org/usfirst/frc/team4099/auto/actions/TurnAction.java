package org.usfirst.frc.team4099.auto.actions;

import org.usfirst.frc.team4099.lib.drive.DriveSignal;
import org.usfirst.frc.team4099.robot.subsystems.Drive;

/**
 * Created by plato2000 on 2/14/17.
 */
public class TurnAction implements Action {

    private Drive mDrive;
    private double degreesToTurn;
    private boolean isDone;

    public TurnAction(double degreesToTurn) {
        this.mDrive = Drive.getInstance();
        this.degreesToTurn = degreesToTurn;
        this.isDone = false;
    }

    @Override
    public boolean isFinished() {
        return isDone;
    }

    @Override
    public void update() {
        isDone = mDrive.turnAngle(degreesToTurn);
    }

    @Override
    public void done() {
        mDrive.setOpenLoop(DriveSignal.NEUTRAL);
    }

    @Override
    public void start() {
        mDrive.setAutonomous();
    }
}
