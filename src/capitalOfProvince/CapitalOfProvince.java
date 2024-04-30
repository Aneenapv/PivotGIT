package capitalOfProvince;

import java.util.*;

public class CapitalOfProvince {
	
	public static void main(String[] args)
	{
	
	String[] capitalCity = {"Toronto", "Edmonton","Halifax","Victoria", "Regina", "Winnipeg", "Quebec"};
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a city : ");
	String cityName = sc.next();
	
	
	boolean IsCapitalCityFound = false;
	for(int i=0; i<capitalCity.length;i++)
	{
	
	if(capitalCity[i].equalsIgnoreCase(cityName))
	{
		System.out.println("Entered city is capital province");
		IsCapitalCityFound = true;
		break;
	}
	}
	if(!IsCapitalCityFound)
	{
		System.out.println("Entered city is not a capital province");
	}


}

}