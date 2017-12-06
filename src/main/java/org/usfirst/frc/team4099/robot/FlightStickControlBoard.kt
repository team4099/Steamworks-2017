package org.usfirst.frc.team4099.robot

import org.usfirst.frc.team4099.lib.joystick.*

class FlightStickControlBoard private constructor(): ControlBoard {
    private val steeringWheel: SteeringWheel = ThrustmasterWheel(Constants.Joysticks.DRIVER_PORT)
    private val flightStick: FlightStick = Attack3FlightStick(Constants.Joysticks.SHOTGUN_PORT)
    private val operator: Gamepad = XboxOneGamepad(2)

    override val throttle: Double
        get() = flightStick.pitch

    override val turn: Double
        get() = steeringWheel.steer

    override val toggleSlowMode: Boolean
        get() = steeringWheel.getRawButton(3)

    override val quickTurn: Boolean
        get() = Math.abs(JoystickUtils.deadbandNoShape(throttle, 0.02)) < 0.01

    override val intakeUp: Boolean
        get() = operator.dPadUp

    override val intakeDown: Boolean
        get() = operator.dPadDown

    override val toggleIntake: Boolean
        get() = operator.aButton

    override val climber: Boolean
        get() = operator.yButton

    override val toggleIntakeClosed: Boolean
        get() = operator.dPadRight || operator.dPadLeft

    companion object {
        val instance = FlightStickControlBoard()
    }

}