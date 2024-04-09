package trial;

import java.util.Scanner;

public class LicenseTrial {
	
	int age;
	String doYouHaveLicense;
	String currentLicense;
	

	void licenseIssue()
	{
		if(age>=16)
		{
			if (doYouHaveLicense.equalsIgnoreCase("YES"))
              {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your current License = ");
				String currentLicense = sc.next();
			    
				if (currentLicense.equalsIgnoreCase("G1")) {
					System.out.println("You are not allowed to drive without an experienced G driver in the passenger seat ");
					System.out.println("You are eligible to take next level of License G2");
				}

				else if (currentLicense.equalsIgnoreCase("G2")) {
					System.out.println("You can Drive with your G2 and You are eligible to take next level of License G");
				}

				else if (currentLicense.equalsIgnoreCase("G")) {
					System.out.println("You can Drive with your G ; Validity of G license is 5 years : Please renew before it expire");
				}
			} 
			else if(doYouHaveLicense.equalsIgnoreCase("NO")) {
						System.out.println("Contact service ontario If you want to take");
			}
			

		}
		
	}
}




