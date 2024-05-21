package abstraction;

public class BankMain {

	public static void main(String[] args) {
	
		// we cannot instantiate national bank bcoz it is abstract class
		// but we can create object on appliance class...
		
		//its bcoz appliance class does not have any abstract class...
		//it is called as concrete class. eg: appliance
		
		//NationalBank nbank = new NationalBank();
		
		NationalBank cibc = new CIBC();
		
		//reference variable tdbank is referring to object of TD bank
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

		System.out.println("--------RBC METHODS-------");
		
		RBC rbc = new RBC();
		rbc.interestOnSaving();
		rbc.provideCheques();
		rbc.provideLoans();
		rbc.linkAccountWithSIN();
		rbc.method1();
		
		System.out.println("--------NBankInterface METHODS-------");
		
		NBankInterface rbc1 = new RBC ();
		rbc1.interestOnSaving();
		rbc1.provideCheques();
		rbc1.provideLoans();
		rbc1.method1();
		// rbc1.linkAccountWithSIN(); // from interface financialtransactions
		
		// rbc1.linkAccountWithSIN method is coming from CRA interface.
		// so that RBC getting that method from CRA. NbankInterface Interface 
		// is not accessible to the method of CRA interface. Only RBC objects 
		// can refer to the RBC class.
		//rbc1.linkAccountWithSIN();
		
		System.out.println("--------CRA METHODS-------");
		
		CRA rbc2 = new RBC();
		rbc2.linkAccountWithSIN();
		
		//rbc2.provideTfsa(); this will not possible because tfsa method is only in nbankinterface. 
		//cra variable cannot access this method in rbc from nbankinterface.
		
		// reference variable rbc2 is referring to object of RBC.
		// rbc2 is not accessible to other methods in NBankInterface
		
		System.out.println("--------Financial Transactions Interface METHODS-------");
		
//		FinancialTransactions rbc4 = new RBC();
//		rbc4.interestOnSaving();
//		rbc4.linkAccountWithSIN();
//		rbc4.provideCheques();
//		rbc4.provideLoans();
//		
		
	}

}
