package forLoop;

//import java.util.Scanner;

public class NeverEndLoop {

	public static void main(String[] args) {

      double sum =0;
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number to find the sum of number: ");
//		int n = sc.nextInt();
		
		for(double i=1; i>0; i++)
		{
			sum = sum +i;
			
		}
		System.out.println("sum = " +sum);

	}

	}

