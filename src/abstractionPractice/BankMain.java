package abstractionPractice;

public class BankMain {

	public static void main(String[] args) {
		
		AxisBank axis = new AxisBank();
		axis.method1();
		axis.method4();
		axis.method5();
		
// static methods can access through interfacename.method();
		Bank.method6();
		

	}

}
