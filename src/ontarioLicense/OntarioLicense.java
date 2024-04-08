package ontarioLicense;

public class OntarioLicense {

	int age;
	String licenseType1="G2";
	String DoYouHaveLicense;
	
	
	void licenseAgeLessThan16()
	{
		if (age < 16) {
			System.out.println("Minimum age is 16");
		}

	}

	void licenseAgeGreaterThan16() {

		if (age > 16) {
			if (DoYouHaveLicense.equalsIgnoreCase("YES")) {
				if (licenseType1.equals("G1")) {
					System.out.println("You are not allowed to drive without an experienced G driver in the passenger seat ");
					System.out.println("You are eligible to take next level of License G2");
				}

				else if (licenseType1.equalsIgnoreCase("G2")) {
					System.out.println("You can Drive with your G2 and You are eligible to take next level of License G");
				}

				else if (licenseType1.equalsIgnoreCase("G")) {
					System.out.println("You can Drive with your G ; Validity of G license is 5 years : Please renew before it expire");
				}
			} else if (DoYouHaveLicense.equalsIgnoreCase("NO")) {
				System.out.println("Contact service ontario If you want to take");
			}
		}

	}

	void licenseAgeEqual16() {

		Boolean ageEqual = (age == 16);
		if (ageEqual) {
			if (DoYouHaveLicense.equalsIgnoreCase("YES")) {
				if (licenseType1.equalsIgnoreCase("G1")) {
					System.out.println("you are eligible to take G2");
				} else if (licenseType1.equalsIgnoreCase("G2")) {
					System.out.println("You can drive with G2 and you will be eligible for G after you complete 1year with G2");
				} else if (licenseType1.equalsIgnoreCase("G")) {
					System.out.println("Error : contact service ontario");
				}
			} else if (DoYouHaveLicense.equalsIgnoreCase("NO")) {
				System.out.println(" You are eligible to take G1 test");
			}
		}

	}
}

/*
 * Q1. Ontario license authority checks for two things to issue a license, first
 * is the age of person and the current level (G1 or G2 or G) . Assume different
 * values for these two values and write code which will print, whether license
 * will be used to the person or not and if the license is issued, which type of
 * license the person will get i.e. whether he will get a G1 or G2 or G.
 */