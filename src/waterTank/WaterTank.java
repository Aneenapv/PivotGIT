package waterTank;

import java.util.*;

public class WaterTank {

	/*
	 * Q2) There is a water tank of capacity 100 litres. Water is filled into it
	 * using bucket which have capacity of 10 litres. Write a program which fills
	 * the tank to its capacity using these buckets. Also include a mechanism in
	 * your program to stop the tank from over flowing.
	 */

//	double waterTankCapacity=100;  //100
//	double bucketCapacity=10;     //10

	Scanner sc = new Scanner(System.in);

	void tankFill() {

		System.out.println("Enter number of buckets poured: ");
		int numberOfBucket = sc.nextInt();
		switch (numberOfBucket) {
		case 1: {
			System.out.println("9 more buckets of water need to fill the tank ");
			break;
		}
		case 2: {
			System.out.println("8 more buckets of water need to fill the tank ");
			break;
		}
		case 3: {
			System.out.println("7 more buckets of water need to fill the tank ");
			break;
		}
		case 4: {
			System.out.println("6 more buckets of water need to fill the tank ");
			break;
		}
		case 5: {
			System.out.println("5 more buckets of water need to fill the tank ");
			break;
		}
		case 6: {
			System.out.println("4 more buckets of water need to fill the tank ");
			break;
		}
		case 7: {
			System.out.println("3 more buckets of water need to fill the tank ");
			break;
		}
		case 8: {
			System.out.println("2 more buckets of water need to fill the tank ");
			break;
		}
		case 9: {
			System.out.println("1 more buckets of water need to fill the tank ");
			break;
		}
		case 10: {
			System.out.println("Stop: Tank is full");
			break;
		}

		default:
			System.out.println(" invalid entry");

		}
	}
}
