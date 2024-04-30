package practice;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
	
		int m=1, i=1,j=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println("multiplication Table");
		
		for(j=1;j<=n;j++)
		{
		for(i=1;i<=10;i++)
		{
		  m=j*i;
		  System.out.println(j + "*" + i +" = "+m);
		}
		System.out.println();
		}
		
		

	}

}
