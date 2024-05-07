package abstraction;

public abstract class NationalBank {

	// abstract class is a class which has one or more abstract methods
	
	double balance;
	
	public void provideLoans()
	{
		System.out.println("provide loans starting from prime rate 5%");
	}
	
	// An abstract method does not have a body curly braces{} and ends
	//in a semicolon and abstract keyword is append to it
	public abstract void interestOnSaving();

	public abstract void provideCheques();
	
	
}
