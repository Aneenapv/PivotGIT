package schoolManagementSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Springfield High School Stream Allocation and Teacher Rating System!");
		System.out.println();

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the student's name: ");
		String name = sc.next();
		
		System.out.println("Please enter the student's age: ");
		int age = sc.nextInt();
		
		System.out.println("Please enter the student's gender: ");
		String gender = sc.next();
		
		System.out.println("Please enter the student's ID: ");
		String studentID = sc.next();
		
		System.out.println("Please enter the student's academic percentage: ");
		double percentage = sc.nextDouble();
		
		Student student = new Student(name, age, gender, studentID, percentage);
		School school = new School("Spring Field: School Management System");
		//school.addStudent(student);
		
		System.out.println("-- Stream Allocation Result --");
		System.out.println("Name: " +name +",Age: " +age +",Gender: " +gender +",Academic Percentage: "+percentage);
		student.determineStream();
		
		Teacher teacher1 = new Teacher("Alice Johnson", 50, "Female", "TEACHER-01", 50000);
		Teacher teacher2 = new Teacher("Thomas Kurian", 60, "male", "TEACHER-02", 60000);
		Teacher teacher3 = new Teacher("Mathew Eapen", 45, "male", "TEACHER-03", 45000);
		Teacher teacher4 = new Teacher("Jose Mathew", 54, "male", "TEACHER-04", 54000);
		Teacher teacher5 = new Teacher("Treesa Varghese", 52, "Female", "TEACHER-05", 52000);
		Teacher teacher6 = new Teacher("Moly Benny", 61, "Female", "TEACHER-06", 61000);
		
        school.addTeacher(teacher1);
        teacher1.addRating(4);
        
        school.addTeacher(teacher2);
        teacher2.addRating(3);
        
        school.addTeacher(teacher3);
        teacher3.addRating(5);
        
        school.addTeacher(teacher4);
        teacher4.addRating(4);
        
        school.addTeacher(teacher5);
        teacher5.addRating(3);
        
        school.addTeacher(teacher6);
        teacher6.addRating(4);
       
        
        System.out.println("Please enter the teacher's name you wish to rate: ");
        String teacherName = sc.next();
        Teacher rateTeacher = school.getTeacherInformation(teacherName);
//        if(rateTeacher!=null)
       // {
		System.out.println("Please enter your rating "+teacherName+" (1-5): ");
		//int rating = Integer.parseInt(sc.nextLine());
		int rating = sc.nextInt();
		
		student.rateTeacher(rateTeacher,rating);
		
	
		System.out.println("-- Updated Teacher Rating --");
		System.out.println("Teacher: "+teacherName);
		System.out.println("New Average Rating: "+rateTeacher.calculateAverageRating());
        }
//        else
//        {
//        	System.out.println("teacher not in list");
//        }
}

