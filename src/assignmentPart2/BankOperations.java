package assignmentPart2;

import java.util.Scanner;

public abstract class BankOperations {
	
	public abstract void changePinPassword();
	
	
	Scanner sc = new Scanner(System.in);
	double total;

	 public void withdraw(double totalFundsAvailable, double withdrawAmount) {
		if (withdrawAmount >0) {
			double total = (totalFundsAvailable - withdrawAmount);
			System.out.println("New balance =" + total);
		}
		else
		{
		System.out.println("Invalid amount");
		}
	}

	public void deposit(double totalFundsAvailable, double depositAmount) {
		if (depositAmount > 0) {
			double total = totalFundsAvailable + depositAmount;
			System.out.println("New balance = " + total);
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}

	final public void viewBalance(double totalFundsAvailable) {
		System.out.println("balance= " + totalFundsAvailable);
	}

	
	

}
