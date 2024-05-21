package abstraction;

//Interface can extend another interface
public interface NBankInterface extends FinancialTransactions{
	// interface is an entity where all methods are by default abstract
	//it is higher level of abstract class
	//in interface we dont need to write abstract keyword
	// all the methods in it by default abstract

	// only declare constant values
	
	String name = "National Bank";
	
	//double balance;  initialize final field or constant  here balance is not constant
	
	public  void provideLoans();
	
	public  void interestOnSaving();

	public  void provideCheques();
	
	// after java 8, we can add default methods in interface
	public default void method1()
	{
		System.out.println("inside default");
	}
	
	public void provideTfsa();
	
	
	
	
}
