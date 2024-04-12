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
	int maxLimit = 0, numberOfPeople = 50;
	Scanner sc = new Scanner(System.in);

	void rideRequirements() {

		for (int i = 1; i <= numberOfPeople; i++) {
			System.out.println();
			System.out.println(i + " Enter your height in cm  = ");
			double height = sc.nextDouble();

			if ((height > 90) && (height < 200)) {
				System.out.println("Please enter into ride: Have Fun");
				System.out.println();
				 maxLimit =  maxLimit + 1;
				if ( maxLimit == 10) {
					System.out.println("STOP: Reached maximum limit for this ride");
					break;
				}

			} else {
				System.out.println("you are not allowed to use this ride");
				System.out.println();
			}
		}
	}
}
