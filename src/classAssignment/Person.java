package classAssignment;

public class Person {

	public static void main(String[] args) {
		
		String[] name = {"aneena", "ravneeth","gurleen","jerin","ashish","rajinder",
				"prabjot","gian","arshdeep","emiopl"};
		int[] age = {10,11,12,13,14,15,16,17,18,19};
		
		System.out.println(name.length);
		for(int i=0; i<=name.length;i++)
		{
		if(name[i].contains("emil"))
		{
			System.out.println("emil found");
			break;
		}
		else if(i>=(name.length-1))
		{
			System.out.println("not in list");
			break;
		}

	}

}
}
