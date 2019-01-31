package alkuperainen;

import java.util.Arrays;

import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.Color;
import lejos.robotics.ColorDetector;
import lejos.robotics.ColorIdentifier;

public class ColorSensor implements ColorDetector, ColorIdentifier{
	
	test asd;
	
	ColorSensor(test i){
		asd = i;
	}
	
	
	@Override
	public void run() {
		EV3ColorSensor sensor;
		float[] sample;
		//EV3ColorSensor color = new EV3ColorSensor(SensorPort.S1);
		//color.setCurrentMode("Red");
		
		
		// Luodaan ColorSensor -objekti
		public ColorSensor(Port port) {
			sensor = new EV3ColorSensor(port);
			//setRedMode();
			//setAmbientMode();
			//setFloodLight(false);	
		}
		
		public void setRedMode() {
			sensor.setCurrentMode("Red");
			sample = new float[sensor.sampleSize()];
		}
		
		public float getRed() {
			sensor.fetchSample(sample, 0);
			return sample[0];
		}
		
		
	}

}
