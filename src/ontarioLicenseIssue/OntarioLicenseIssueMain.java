package ontarioLicenseIssue;

import java.util.Scanner;

public class OntarioLicenseIssueMain {

	public static void main(String[] args) {

		OntarioLicenseIssue license = new OntarioLicenseIssue();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age= ");
		int age = sc.nextInt();
		license.age = age;

		if (age < 16) {
			System.out.println("Not eligible; Minimum age is 16");
		} else {

			//Scanner scan = new Scanner(System.in);
			System.out.println("Do yo have license = ");
			String doYouHaveLicense = sc.next();
			license.doYouHaveLicense = doYouHaveLicense;

			if (doYouHaveLicense.equalsIgnoreCase("YES")) {

				System.out.println("Enter your current License = ");
				String currentLicense = sc.next();
				license.currentLicense = currentLicense;

			} else if (doYouHaveLicense.equalsIgnoreCase("NO")) {
				System.out.println("Contact service ontario If you want to take");
			}

		}

		license.licenseIssue();

	}

}
