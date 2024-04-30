package practice;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {

		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
//		for(int i=1;i<=number;i+=2)
//		{
//			  sum = sum + i;
//		  }
//		System.out.println("sum of odd numbers= "+sum);
//		}

		
		for(int i=1;i<=number;i++)
		{
			if(i%2!=0)
			{
				sum = sum+i;
			}
		}
			System.out.println("sum of odd numbers= "+sum);	
		
	}
}

