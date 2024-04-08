package heaterAndHumidifier;

import java.util.Scanner;

public class HeaterAndHumidifierMain {

	public static void main(String[] args) {
		
	

		 HeaterAndHumidifier hAh = new  HeaterAndHumidifier();
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Input Heater = ");
		 
		 double input = sc.nextDouble();
		 hAh.inputHeaterRegulator = input;
		 
		 hAh.sensorFeedbackInputHeater = 25;
		 
		 
    System.out.println("Input Humidifier = ");
		 
		 double inputHumidifier = sc.nextDouble();
		 hAh.inputHumidifierRegulator = inputHumidifier;
		 
		 hAh.sensorFeedbackInputHumidifier = 55;
		 
		 hAh.heater();
		 hAh.humidifier();
		 
		
		
		 
		
		 

	}

}
