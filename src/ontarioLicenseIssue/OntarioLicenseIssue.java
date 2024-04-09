package ontarioLicenseIssue;

public class OntarioLicenseIssue {
	
	/*
	 * Q1. Ontario license authority checks for two things to issue a license, first
	 * is the age of person and the current level (G1 or G2 or G) . Assume different
	 * values for these two values and write code which will print, whether license
	 * will be used to the person or not and if the license is issued, which type of
	 * license the person will get i.e. whether he will get a G1 or G2 or G.
	 */
	
//	public static void main (String[] args)
//	{
//	int age = 15;
//	String currentLicense = "G2";
//	String doYouHaveLicense = "NO";
	
	
	int age;
	String doYouHaveLicense;
	String currentLicense;
	

	void licenseIssue()
	{
		if(age>=16)
		{
			if (doYouHaveLicense.equalsIgnoreCase("YES"))
              {
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
			

		}
	}
}

