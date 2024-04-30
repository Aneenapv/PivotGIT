package assignmentString;

import java.util.Scanner;

public class VacationSpots {
	

	/*
	 * Q2) Write a function to return the city from each of these vacation spots. As
	 * shown in example below you have to extract Munich, Portland..etc. Hint: City
	 * will always be present in last square brackets in the statement.. Examples
	 * grabCity("[Last Day!] Beer Festival [Munich]") ➞ "Munich"
	 * grabCity("Cheese Factory Tour [Portland]") ➞ "Portland"
	 * grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]") ➞
	 * "Kyoto"
	 */
	String city1 = ("[Last Day!] Beer Festival [Munich]");
	String city2 = ("Cheese Factory Tour [Portland]");
	String city3 = ("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]");
	
	public void vacationSpots()
	{

	System.out.println(
			"city 1 name extracted = " + city1.substring(city1.lastIndexOf('[') + 1, (city1.lastIndexOf(']'))));
	System.out.println(
			"city 2 name extracted = " + city2.substring(city2.lastIndexOf('[') + 1, (city2.lastIndexOf(']'))));
	System.out.println(
			"city 3 name extracted = " + city3.substring(city3.lastIndexOf('[') + 1, (city3.lastIndexOf(']'))));
	}

}
