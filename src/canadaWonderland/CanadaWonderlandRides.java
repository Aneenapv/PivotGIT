package canadaWonderland;

public class CanadaWonderlandRides {

	int age = 4;
	int height = 36;

//	void ticketRequiredToWonderland() {
//		Boolean isAge = (age > 3);
//		if (isAge) {
//			System.out.println("Buy an Entry Pass");
//		} else {
//			System.out.println("Admission Free");
//		}
//	}

//	void listOfRidesAndMinimumHeight() {
//		Boolean isMinimumHeight = (height >= 54);
//		if (isMinimumHeight) 

	void ticketAndMinimumHeight() {
		Boolean isAge = (age > 3);
		if (isAge) {
			System.out.println("Buy an Entry Pass");

			if (height >= 54) {
				System.out.println("Rider can enjoy Thrill rides 1. Behemoth   2. Leviathan  3. Mountain Bay Cliff");
			}
			if (height >= 48) {
				System.out.println("Rider can enjoy Blackhole water ride");
			}
			if (height >= 42) {
				System.out.println("Rider can enjoy BooBlasters on Boo Hill Kids Ride");
			}
			if (height >= 40) {
				System.out.println("Rider can enjoy Ghoster Coaster Kids Ride");
			}
			if (height >= 36) {
				System.out.println("Rider can enjoy Blast off Kids Ride");
			}
		}
			else {
				System.out.println("Admission Free");
				System.out.println("No height limit to use Pump house and spray ground in Kids Zone");
			}

		}
	}

