package codeChallenge;

public class Levithan {
	
	double weight;
	double height;
	
	void levithanRequirements()
	{
		if(weight>=30)
		{
			if(height>=48)
			{
				System.out.println(" You are elibible to take levithan : Enjoy ride");
			}
			else
			{
				System.out.println("Minimum height required for levithan is not meet");
			}
		}
			else
			{
				System.out.println("Minimum weight required for levithan is not meet");
			}
		}
	}


