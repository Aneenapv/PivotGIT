package collection;
import java.util.ArrayList;
public class CitiesArrayList {

	public static void main(String[] args) {
		
		
		//syntax of arraylist
		ArrayList<String> cities = new ArrayList<String>();
		
		//add element to arraylist
		cities.add("Toronto");
		cities.add("scarborough");
		cities.add("brampton");
		cities.add("oakvile");
		cities.add("missisauga");
		
		System.out.println("size of the list : "+cities.size());
		
		for(int i=0; i<cities.size();i++)
		{
			System.out.println(cities.get(i));
		}
		System.out.println(cities.toString());
		
		// add elements to arraylist cities
		cities.add("caledon");
		cities.add(2, "malton");
		
		System.out.println(cities.toString());
	
		//remove elements from arraylist cities
		
		cities.remove(1); // removed scarborough
		System.out.println(cities.toString());
		
		cities.remove(5);  //removed caledon
		cities.add(4, "halton");  //halton added to 4th position and moved missisauga to right
		System.out.println(cities.toString());

		
	}

}
