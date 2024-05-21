package schoolManagementSystem;
import java.util.List;
import java.util.ArrayList;
public class Teacher extends Person{
	
	String employeeID;
	double salary;
	
	//List<String>coursesTaught ;
	List<Double>ratings;
	

	public Teacher(String name, int age, String gender, String employeeID, double salary) 
	{
		super(name, age, gender);
		this.employeeID = employeeID;
		this.salary = salary;
		//this.coursesTaught = new ArrayList<>(coursesTaught);
		this.ratings = new ArrayList<>();
	}


	@Override
	public void describeRole() {
	}
	
	public void addRating(int rating)
	{
		ratings.add((double) rating);
	}
	
	
	public double calculateAverageRating()
	{
		if(ratings.isEmpty())
		{
			return 0;
		}
		double sum =0;
 	for(Double rating :ratings)
		{
	     sum = sum + rating;
		}
 	    double average = (double)sum/(ratings.size());
 	 //System.out.println(average);  
	    return  average;
	}
}



