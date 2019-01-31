import java.util.Arrays;

import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.robotics.SampleProvider;

public class ColorSensorTest {

    static Port colorSensorPort = SensorPort.S1;
    static EV3ColorSensor colorSensor;
    static SampleProvider sampleProvider;
    static int sampleSize;

    static float[] getSample() {
        // Initializes the array for holding samples
        float[] sample = new float[sampleSize];

        // Gets the sample an returns it
        sampleProvider.fetchSample(sample, 0);
        return sample;
    }

    public static void main(String[] args) {
        // Initializes the sensor & sensor mode
        colorSensor = new EV3ColorSensor(colorSensorPort);
        sampleProvider = colorSensor.getRedMode();
        sampleSize = sampleProvider.sampleSize();

        // Takes some samples and prints them
        for (int i = 0; i < 4; i++) {
            float[] sample = getSample();
            System.out.println("N=" + i + " Sample=" + Arrays.toString(sample));
        }
    }
}