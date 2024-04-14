package waterTankLoop;

public class WaterTankLoop {

		/*
		 * Q2) There is a water tank of capacity 100 litres. Water is filled into it
		 * using bucket which have capacity of 10 litres. Write a program which fills
		 * the tank to its capacity using these buckets. Also include a mechanism in
		 * your program to stop the tank from over flowing.
		 */

		int waterTankCapacity = 100;
		int bucketCapacity = 10;
		int numberOfBucketsToFillTheTank;
		int count; 
		
		void fillTank()
		{
		numberOfBucketsToFillTheTank = (waterTankCapacity/bucketCapacity);
		
		for ( count = 1; count < numberOfBucketsToFillTheTank; count++) {
			System.out.println((numberOfBucketsToFillTheTank - count) + " more buckets of water need to fill the tank");
		}
			if (count == 10) {
				System.out.println("STOP: Tank is full");
			}
		

	     }

}


