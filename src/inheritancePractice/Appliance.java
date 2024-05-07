package inheritancePractice;

public class Appliance {
	
	private String num;
	String defaultVariables;
	
	protected String modelName;
	protected String modelNumber;
	protected Double price;
	
	
	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getDefaultVariables() {
		return defaultVariables;
	}

	public void setDefaultVariables(String defaultVariables) {
		this.defaultVariables = defaultVariables;
	}
	//Is a relationship- a class inherits features to another class
	//even without creating object using extends keyword
	
	
	// has a concept / composition / has a relationship
	// a class has another class 
	Reviews customerReviews;

	public Appliance()
	{
		
	}
	
	public Appliance(String modelName, String modelNumber, Double price) {
		super();
		this.modelName = modelName;
		this.modelNumber = modelNumber;
		this.price = price;
	}

	public void displayDetails()
	{
		System.out.println("details of appliance");
		System.out.println("model name = "+modelName);
		System.out.println("model number = "+modelNumber);
		System.out.println("Original price = "+price);
	}
	
	public double displayOffer(double price)
	{
		System.out.println("details of appliance offer");
		this.price = price;
		return price;
	}

	public void displaySpecification()
	{
		System.out.println("details of appliance specification: "+modelName);
	}
	
	public void displayCustomerReviews()
	{
		System.out.println("display customer rating and reviews");
	}
}
