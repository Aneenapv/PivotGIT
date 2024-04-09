package ontarioLicense;

import java.util.Scanner;

public class OntarioLicenseMain {

	public static void main(String[] args) {
		
		OntarioLicense oL = new OntarioLicense();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your current age : ");
		int age = sc.nextInt();
		oL.age = age;
		
     	System.out.println(" Do you have license: ");  //YES/NO
		String DoYouHaveLicense = sc.next();
		oL.DoYouHaveLicense = DoYouHaveLicense;
		

//		System.out.println(" License Type  : ");
//		String licenseType1 = sc.next();
//		oL.licenseType1 = licenseType1;
		
		oL.licenseAgeLessThan16();  // minimum age is 16
		
		oL.licenseAgeEqual16();
		
		oL.licenseAgeGreaterThan16();
		
		
		
//		System.out.println(" Current License  : "); 
//		String ageEqualLicense = sc.next();
//		oL.ageEqualLicense = ageEqualLicense;
	
		
		
		
		
		
	}

}
