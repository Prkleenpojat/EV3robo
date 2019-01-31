package alkuperainen;

import lejos.hardware.*;
import lejos.hardware.port.SensorPort;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.robotics.*;
import lejos.utility.*;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.internal.ev3.EV3LCD;

public class test {

	public static void main(String[] args) {
		
		test asd = new test();
		
		ColorSensor sensori = new ColorSensor(asd);
		Thread thread1 = new Thread(sensori);
		thread1.start();
		
		
		
		/*
		EV3ColorSensor color = new EV3ColorSensor(SensorPort.S1);
		color.setCurrentMode("Red");
		
		
		
		
		Button.waitForAnyPress();
		
		while(Button.ESCAPE.isUp()) {
			LCD.drawString("ambient=%.3f", 0, 4);
		}
*/
		
	}

}
