package heaterAndHumidifier;

public class HeaterAndHumidifier {

	double inputHeaterRegulator;
	double sensorFeedbackInputHeater;
	
	double inputHumidifierRegulator;
	double sensorFeedbackInputHumidifier;
	
	// input regulator > control system // feedback sensor > output coil & fan 
	
	void heater()
	
	{
		Boolean isValueSet = (inputHeaterRegulator>sensorFeedbackInputHeater);
		if(isValueSet)
		{
			System.out.println("Turn on Heater");
		}
		else 
		{
			System.out.println("Turn off Heater");
		}
	}
	
	void humidifier()
	{
		Boolean isValueSetHumidifier = (inputHumidifierRegulator>sensorFeedbackInputHumidifier);
		if(isValueSetHumidifier)
		{
			System.out.println(" Turn on Humidifier");
		}
		else
		{
			System.out.println("Turn off Humidifier");
		}
	}

	}


