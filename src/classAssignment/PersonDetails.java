package classAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonDetails {

	public static void main(String[] args) {
	
		ArrayList<String> names = new ArrayList<String>();
           
		names.add("Aneena");
		names.add("ravneeth");
		names.add("Ashish");
		names.add("jerin");
		names.add("rajinder");
		names.add("gurleen");
		names.add("emil");
		names.add("gian");
		names.add("arshdeep");
		names.add("prabjot");
		
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ages.add(11);
		ages.add(12);
		ages.add(13);
		ages.add(14);
		ages.add(15);
		ages.add(16);
		ages.add(17);
		ages.add(18);
		ages.add(19);
		ages.add(20);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name to check whether in list or not: ");
		String nameEntered = sc.next();
		
		for(int i=0; i<=names.size();i++)
		{
		if(names.get(i).contains(nameEntered))
		{
			System.out.println("Name found");
			break;
		}
		else if(i>=(names.size()-1))
		{
			System.out.println("name not in list");
			break;
		}
		
		
	}

}
}
