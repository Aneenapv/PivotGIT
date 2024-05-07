package abstraction;

public interface NBankInterface {
	// interface is an entity where all methods are by default abstract
	//it is higher level of abstract class
	//in interface we dont need to write abstract keyword
	// all the methods in it by default abstract

	// only declare constant values
	
	String name = "National Bank";
	
	public  void provideLoans();
	
	public  void interestOnSaving();

	public  void provideCheques();

	//public void linkAccountWithSIN();
	
	
	
}
