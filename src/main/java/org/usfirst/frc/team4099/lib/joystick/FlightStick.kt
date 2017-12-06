package org.usfirst.frc.team4099.lib.joystick

import edu.wpi.first.wpilibj.Joystick

abstract class FlightStick(port: Int): Joystick(port) {
    abstract val pitch: Double

    abstract val yaw: Double

    abstract val roll: Double

    abstract val fThrottle: Double
}