package findJerin;

public class FindJerin {

	public static void main(String[] args) {
	
		String[] listOfStudents = {"prabh", "manvir", "arsh","jerin", "gian"};
		
for(int counter =0; counter<=(listOfStudents.length); counter++)
{
	if(listOfStudents[counter]=="jerin")
	{
		System.out.println("jerin in list");
		break;
	}
	else if (counter>=(listOfStudents.length-1))
	{
		System.out.println("no jerin");
       break;
	}

	}

}
}
