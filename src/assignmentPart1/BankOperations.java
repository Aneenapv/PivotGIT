package assignmentPart1;
import java.util.*;
public class BankOperations {
	
	Scanner sc = new Scanner(System.in);
	double total;
	
	public void withdraw(double withdrawAmount, double totalFundsAvailable)
	{
	double total = (totalFundsAvailable - withdrawAmount);
		System.out.println("New balance ="+total);
	}
	
	public void deposit(double totalFundsAvailable, double depositAmount)
	{
		double total  = totalFundsAvailable + depositAmount;
		System.out.println("New balance = "+ total);
	}
	
	public void viewBalance(double totalFundsAvailable)
	{
		System.out.println("balance= "+totalFundsAvailable);
	}

}
