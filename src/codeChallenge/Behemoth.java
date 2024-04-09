package codeChallenge;

public class Behemoth {

	double weight;
	double height;
	
	void behemothRequirements()
	{
		if(weight>=35)
		{
			if(height>=42)
			{
				System.out.println(" You are elibible to take Behemoth : Enjoy ride");
			}
			else
			{
				System.out.println("Minimum height required for behemoth is not meet");
			}
		}
			else
			{
				System.out.println("Minimum weight required for behemoth is not meet");
			}
		}
	}
