package schoolManagementSystem;

public class Student extends Person {
	
	String studentID;
	double percentage;
	

	public Student(String name, int age, String gender,String studentID, double percentage) {
		super(name, age, gender);
		this.studentID = studentID;
		this.percentage = percentage;
	}


	
	public void determineStream()
	{
		if(percentage>=85)
		{
			System.out.println("Allocated Stream: Non-medical");
			System.out.println(name +" can enroll in courses like Physics and Mathematics");
		}
		if((percentage<85)&&(percentage>=75))
		{
			System.out.println("Allocated Stream: Medical");
			System.out.println(name +" can enroll in courses like Biology and Chemistry");
		}
		if((percentage<75)&&(percentage>=65))
		{
			System.out.println("Allocated Stream: Commerce");
			System.out.println(name +" can enroll in courses like Economics and Business Studies");
		}
		if(percentage<65)
		{
			System.out.println("Allocated Stream: Arts");
			System.out.println(name +" can enroll in courses like History and Literature");
		}
		
	}
		
	public void rateTeacher(Teacher teacher,int rating)
	{
		teacher.addRating(rating);
	}



	@Override
	public void describeRole() {
		// TODO Auto-generated method stub
		
	}



}
