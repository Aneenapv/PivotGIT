package trial;

import java.util.Scanner;

public class LicenseTrialMain {

	public static void main(String[] args) {

		LicenseTrial license = new LicenseTrial();

				Scanner sc = new Scanner(System.in);
				System.out.println("enter your age= ");
				int age = sc.nextInt();
				license.age = age;

				if (age < 16) {
					System.out.println("Not eligible; Minimum age is 16");
				} else {

					System.out.println("Do yo have license = ");
					String doYouHaveLicense = sc.next();
					license.doYouHaveLicense = doYouHaveLicense;
					license.licenseIssue();
					}

				}
}
				



