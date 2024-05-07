package inheritance;

import inheritancePractice.Appliance;

public class Airfryer2 extends Appliance {
	
	
	public Airfryer2(String modelName, String modelNumber, Double price) {
		super(modelName, modelNumber, price);
		
	}
	
	// why we are creating constructor in the subclass or child class. As the part of 
	//inheritance, we should get constructor from parent class to child class..... 
	
	// but in inheritance constructor act as private to that class only eventhough it is public constructor.
	// Inorder to access constructor outside class
	// constructor is never inherited by child classes, child classes can call the constructor of parent class
	// by using super keyword

	
	// annotation - helps them to know that it is an overridden method. it is not allowed to make changes.
	// override method is run time polymorphism
	// overload method is compile time polymorphism
	
	@Override
	public void displaySpecification()
	{ 
		System.out.println( );
		System.out.println("Different package but inherited "
				+ "variables from appliance by creating constructor");
		
		System.out.println("details of Airfryer specification: "+modelName);
		System.out.println("model number = "+modelNumber);
		System.out.println("Airfryer capacity");
		System.out.println("Airfryer time");
		System.out.println("Airfryer temperature");
	}
	
	public void orderFunctionalMemory()
	{
		System.out.println("placing an order of functional memory");
	}

}
