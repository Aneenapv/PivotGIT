package inheritance;

import inheritancePractice.Appliance;

public class Airfryer2Main {

	public static void main(String[] args) {
	
		Appliance app = new Appliance();
		// app. --- no variables available 
		//bcoz variables declared in protected mode
		
		 //Airfryer air = new Airfryer();
		//air.  --- no variables available
		// bcoz they are in different package
		
		// to access we need to initialize a constructor
		
		System.out.println("From different package but inherited "
				+ "so that we can initialize protected variables");
		
		Airfryer2 air = new Airfryer2("philips", "xkx4fg",155.88);
		air.displaySpecification();
		System.out.println();
		air.displayDetails();
		System.out.println("offer = "+air.displayOffer(100));
		
		System.out.println();
		
		AmazonAirfryer amazon = new AmazonAirfryer("amazon air fryer", "ee88",200.99);
		amazon.displaySpecification();
		System.out.println();
		amazon.orderFunctionalMemory();
		amazon.displayDetails();
		System.out.println("offer =" +amazon.displayOffer(60));
		amazon.displayCustomerReviews();
	
		// app, air, amazon = object / reference variable
		
		//classname reference variable = 	new classname();
		// datatype reference variable =    new datatype();
		
		// classname is also called as datatype
		// app is reference variable of datatype Appliance
		// air is reference variable of datatype Airfryer2
		//amazon is reference variable of datatype AmazonAirfryer
		
		
		

	}

}
