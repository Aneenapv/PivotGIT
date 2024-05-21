package schoolManagementSystem;

public abstract class Person {
	
	String name;
	int age;
	String gender;
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public abstract void describeRole();
	

}
