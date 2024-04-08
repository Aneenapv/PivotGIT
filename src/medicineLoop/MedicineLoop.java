package medicineLoop;

import java.util.Scanner;

public class MedicineLoop {
	
	public static void main(String[] args)
	{
		//double weight;
		for(int i=1;i<=10;i++)
		{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter weight= ");
	double weight = sc.nextDouble();
	
	if ((weight >= 1401.6) && (weight <= 1518.4))
	  {
		System.out.println("Tablet weight is  within Range");
	  }
	else 
	{
		System.out.println("Weight is out of specification");
	}
  }
}
}
