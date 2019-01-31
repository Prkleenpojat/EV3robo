package testi;

import lejos.hardware.lcd.LCD;

public class test {
	public static void main(String[] args){

		test asd = new test();
		
		ajo kaynnistys = new ajo(asd);
		Thread saie1 = new Thread(kaynnistys);
		LCD.drawString("ylempi", 0, 3);
		LCD.drawString("alempi", 0, 5);
		saie1.start();
		
	}

}
