package amusementParkRide;

import java.util.Scanner;

public class AmusementParkRide {

	/*
	 * Q1) In Amusement park, a ride can carry max 10 people. Write a code to help
	 * the operator from over filling the ride i.e more than 10 people should not be
	 * allowed to get on the ride. Also ensure that the people getting on the ride
	 * meets the height criteria , Height of person should be greater than 90 cm but
	 * less than 200 cm.
	 */

	double height;
	int s = 0, n = 50;

	void rideRequirements()
			{
				
				for(int i = 1;i<=n; i++)
				{
					Scanner sc= new Scanner(System.in);
					System.out.println();
					System.out.println(i+" Enter your height  = ");
					double height = sc.nextDouble();
		
				if((height>=90)&&(height<=120))
				{
					System.out.println("Please enter into ride: Have Fun");
					System.out.println();
					s= s+1;
					if(s==10)
					{
						System.out.println("STOP: Reached maximum limit for this ride");
						break;
					}
					
				}
				else
				{
					System.out.println("you are not allowed to use this ride");
					System.out.println();
				}
			}
		}
}
