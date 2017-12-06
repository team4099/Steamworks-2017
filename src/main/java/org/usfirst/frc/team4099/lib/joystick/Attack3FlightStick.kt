package org.usfirst.frc.team4099.lib.joystick

class Attack3FlightStick(port: Int): FlightStick(port) {

    override val pitch: Double
        get() = this.getRawAxis(1)

    override val yaw: Double
        get() = 0.0

    override val roll: Double
        get() = this.getRawAxis(0)

    override val fThrottle: Double
        get() = this.getRawAxis(2)
}