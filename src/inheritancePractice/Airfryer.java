package inheritancePractice;

public class Airfryer extends Appliance {
	
	public void displaySpecification()
	{
		System.out.println("details of Airfryer specification: "+modelName);
		System.out.println("Airfryer capacity");
		System.out.println("Airfryer time");
		System.out.println("Airfryer temperature");
	}
	
	public void orderFunctionalMemory()
	{
		System.out.println("placing an order of functional memory");
	}

}
