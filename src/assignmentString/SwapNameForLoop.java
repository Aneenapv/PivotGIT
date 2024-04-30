package assignmentString;

public class SwapNameForLoop {
	

	String name;
	
	
   public SwapNameForLoop(String name) {
		super();
		this.name = name;
	}

public String nameShuffle(String name)
    {
	String[] nameArray = name.split(" ");
	
	for(int i=(nameArray.length);i<=(nameArray.length); i--)
	{
		if(i>0)
		 {
			 System.out.print(nameArray[i]);
		 }
		else
		{
		break;
		}
		 
	}
		
//	String firstName = nameArray[0];
//	String secondName =nameArray[1];
//	System.out.println("after swapping = " + secondName + " " + firstName);
     return " ";
	 }


}
