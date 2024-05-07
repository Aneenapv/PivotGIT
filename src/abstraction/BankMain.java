package abstraction;

public class BankMain {

	public static void main(String[] args) {
	
		// we cannot instantiate national bank bcoz it is abstract class
		// but we can create object on appliance class...
		
		//its bcoz appliance class does not have any abstract class...
		//it is called as concrete class. eg: appliance
		
		//NationalBank nbank = new NationalBank();
		
		NationalBank cibc = new CIBC();
		
		//tdbank is referring to object of TD bank
		NationalBank tdbank = new TDBank(); 
		// here run time polymorphism comes in effect
		// child class method - it is an abstract method in superclass,
		// we cannot run the unimplemented method,
		// but the child class has an implementation.
		// thats why I am invoking overridden child class method
		tdbank.interestOnSaving();
		tdbank.provideLoans();  
		
		System.out.println();
		
		CIBC cibc1 = new CIBC();
	
		cibc1.interestOnSaving();
		cibc1.provideLoans();
		cibc1.provideCheques();
		
		System.out.println();
		
		TDBank tdbank1 = new TDBank();
		
		tdbank1.interestOnSaving();
		tdbank1.provideCheques();
		tdbank1.provideLoans();

		RBC rbc = new RBC();
		rbc.interestOnSaving();
		rbc.linkAccountWithSIN();
		
		NBankInterface rbc1 = new RBC ();
		rbc1.interestOnSaving();
		//rbc1.linkAccountWithSIN();
	}

}
