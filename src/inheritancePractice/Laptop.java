package inheritancePractice;

public class Laptop extends Appliance{
	
	
// method overriding or run time polymorphism 

	public void displaySpecification()
	{
		System.out.println("details of Laptop specification: "+modelName);
		System.out.println("Laptop Memory");
		System.out.println("Laptop RAM");
		System.out.println("Laptop Clock speed");
	}

	public void orderAdditionalMemory()
	{
		System.out.println("placing an order of Additional memory in laptop");
	}
}
