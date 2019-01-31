package testi;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;

public class ajo implements Runnable{
	test asd;
	
	ajo(test i){
		asd = i;
	}
	
	@Override
	public void run() {

		UnregulatedMotor motorA = new UnregulatedMotor(MotorPort.A);
		UnregulatedMotor motorD = new UnregulatedMotor(MotorPort.D);

		LCD.drawString("kaynnista", 0, 4);
		Button.waitForAnyPress();
		
		motorA.setPower(50);
		motorD.setPower(50);
		
		LCD.drawString("sammuta", 0, 4);
		Button.waitForAnyPress();
		motorA.stop();
		motorD.stop();
		motorA.close();
		motorD.close();
		
		
	}


}
