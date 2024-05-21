package staticExample;

public class Student {

// common to students
	 static String subject;
	 static String classTime;
	//final static String instructors= "ketaki";
	
// variable to students
	private String name;
	private int age;
	private String phoneNo;
	
	
	
	public Student(String name, int age, String phoneNo) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getClassTime() {
		return classTime;
	}
	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}
	
//	public String[] getInstructors() {
//		return instructors;
//	}
//	public void setInstructors(String[] instructors) {
//		this.instructors = instructors;
	//}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	

}
