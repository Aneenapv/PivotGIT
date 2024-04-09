package codeChallenge;

public class YukonStriker {

	double weight;
	double height;

	void yukonRequirements() 
	{
		if (weight >= 45) {
			if (height >= 36) {
				System.out.println(" You are eligible to take Yukon Striker: Enjoy ride");
			} else {
				System.out.println("Minimum height required for Yukon Striker is not meet");
			}
		} else {
			System.out.println("Minimum weight required for Yukon Striker is not meet");
		}
	}
}
