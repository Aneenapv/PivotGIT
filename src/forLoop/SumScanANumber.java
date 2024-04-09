package forLoop;

import java.util.Scanner;

public class SumScanANumber {

	public static void main(String[] args) {
	
		int sum =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the sum of number: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			sum = sum +i;
			
		}
		System.out.println("sum of " +n +" is = "+sum);

	}

}
