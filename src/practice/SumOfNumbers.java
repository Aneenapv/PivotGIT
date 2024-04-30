package practice;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		for(int i=1; i<=number; i++)
		{
			sum = sum+i;
		}
		System.out.println("sum of entered number = "+sum);
		

	}

}
