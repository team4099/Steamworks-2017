package org.usfirst.frc.team4099.lib.joystick


class ThrustmasterWheel(port: Int): SteeringWheel(port) {

    override val accelPedal: Double
        get() = (1 - this.getRawAxis(1)) / 2

    override val brakePedal: Double
        get() = (1 - this.getRawAxis(2)) / 2

    override val steer: Double
        get() = this.getRawAxis(0)
}