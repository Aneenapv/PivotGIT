package staticExample;

public class StudentMain {

	public static void main(String[] args) {
	
		Student student1 = new Student("Aneena", 21, "1234567891");
		
		Student student2 = new Student("Ravneeth", 22, "1234567892");
		
		Student student3 = new Student("Gian", 23, "1234567893");
		
		// Instead of doing thsi we can create static variables
        //student1.setClassTime("7:30 to 9:30");
		//student2.setClassTime("7:30 to 9:30");
		//student3.setClassTime("7:30 to 9:30");
		
		Student.classTime = "7:30 to 9:30";
		
		Student.subject = "java";
		
		System.out.println("name : "+student1.getName() +"| subject : "+Student.subject);
		System.out.println("name : "+student2.getName() +"| subject : "+Student.subject);
		System.out.println("name : "+student3.getName() +"| subject : "+Student.subject);
		
		Student.subject = "selenium";
		
		System.out.println("name : "+student1.getName() +"| subject : "+Student.subject);
		System.out.println("name : "+student2.getName() +"| subject : "+Student.subject);
		System.out.println("name : "+student3.getName() +"| subject : "+Student.subject);

		//Student.instructors = "manvir";
		
	 // if its final we cannot change value. it prevents assign values to it
		
		
	
	}

}
