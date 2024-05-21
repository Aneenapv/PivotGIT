package trial;

public class trial {
	
	
	
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

import schoolManagementSystem.Person;
import schoolManagementSystem.School;
import schoolManagementSystem.Teacher;

	// Person Class (Abstract Class)
	abstract class Person {
	    protected String name;
	    protected int age;
	    protected String gender;

	    public Person(String name, int age, String gender) {
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	    }

	    public abstract String describeRole();
	}

	// Student Class (Inherits Person)
	class Student extends Person {
	    private String studentID;
	    private double percentage;

	    public Student(String name, int age, String gender, String studentID, double percentage) {
	        super(name, age, gender);
	        this.studentID = studentID;
	        this.percentage = percentage;
	    }

	    @Override
	    public String describeRole() {
	        return "Student: " + name;
	    }

	    public String determineStream() {
	        if (percentage >= 85) {
	            return "Non-medical (Physics, Mathematics)";
	        } else if (percentage >= 75) {
	            return "Medical (Biology, Chemistry)";
	        } else if (percentage >= 65) {
	            return "Commerce (Economics, Business Studies)";
	        } else {
	            return "Arts (History, Literature)";
	        }
	    }

	    public void rateTeacher(Teacher teacher, int rating) {
	        teacher.addRating(rating);
	    }
	}

	// Teacher Class (Inherits Person)
	class Teacher extends Person {
	    private String employeeID;
	    private double salary;
	    private List<String> coursesTaught;
	    private List<Integer> ratings;

	    public Teacher(String name, int age, String gender, String employeeID, double salary, List<String> coursesTaught) {
	        super(name, age, gender);
	        this.employeeID = employeeID;
	        this.salary = salary;
	        this.coursesTaught = new ArrayList<>(coursesTaught);
	        this.ratings = new ArrayList<>();
	    }

	    @Override
	    public String describeRole() {
	        return "Teacher: " + name;
	    }

	    public void addRating(double rate1) {
	        if (rate1 >= 1 && rate1 <= 5) {
	            ratings.add(rate1);
	        }
	    }

	    public double calculateAverageRating() {
	        if (ratings.isEmpty()) {
	            return 0;
	        }
	        int sum = 0;
	        for (int rating : ratings) {
	            sum += rating;
	        }
	        return (double) sum / ratings.size();
	    }
	}

	// School Class
	class School {
	    private String name;
	    private List<Teacher> teachers;
	    private List<Student> students;

	    public School(String name) {
	        this.name = name;
	        this.teachers = new ArrayList<>();
	        this.students = new ArrayList<>();
	    }

	    public void addTeacher(Teacher teacher) {
	        teachers.add(teacher);
	    }

	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    public Teacher findTeacherByName(String name) {
	        for (Teacher teacher : teachers) {
	            if (teacher.name.equalsIgnoreCase(name)) {
	                return teacher;
	            }
	        }
	        return null;
	    }

	}

	// Main Class
	public class Main {
	    public static void main(String[] args) {
	        School school = new School("Springfield High School");

	        System.out.println("Welcome to Springfield High School Stream Allocation and Teacher Rating System!");

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Please enter the student's name: ");
	        String studentName = scanner.nextLine();
	        System.out.print("Please enter the student's age: ");
	        int studentAge = Integer.parseInt(scanner.nextLine());
	        System.out.print("Please enter the student's gender: ");
	        String studentGender = scanner.nextLine();
	        System.out.print("Please enter the student's academic percentage: ");
	        double studentPercentage = Double.parseDouble(scanner.nextLine());
	        System.out.print("Please enter the student's ID: ");
	        String studentID = scanner.nextLine();

	        Student student = new Student(studentName, studentAge, studentGender, studentID, studentPercentage);
	        school.addStudent(student);

	        String allocatedStream = student.determineStream();
	        System.out.println("\n-- Stream Allocation Result --");
	        System.out.printf("Name: %s, Age: %d, Gender: %s, Academic Percentage: %.2f%%%n", student.name, student.age, student.gender, student.percentage);
	        System.out.println("Allocated Stream: " + allocatedStream);
	        switch (allocatedStream) {
	            case "Non-medical (Physics, Mathematics)":
	                System.out.println(student.name + " can enroll in courses like Physics and Mathematics.");
	                break;
	            case "Medical (Biology, Chemistry)":
	                System.out.println(student.name + " can enroll in courses like Biology and Chemistry.");
	                break;
	            case "Commerce (Economics, Business Studies)":
	                System.out.println(student.name + " can enroll in courses like Economics and Business Studies.");
	                break;
	            case "Arts (History, Literature)":
	                System.out.println(student.name + " can enroll in courses like History and Literature.");
	                break;
	        }

	        // Adding a sample teacher to the school for demonstration
	        List<String> courses = new ArrayList<>();
	        courses.add("Math");
	        courses.add("Physics");
	        Teacher teacher = new Teacher("Alice Johnson", 30, "Female", "T001", 50000, courses);
	        school.addTeacher(teacher);

	        System.out.print("\nPlease enter the teacher's name you wish to rate: ");
	        String teacherName = scanner.nextLine();
	        Teacher teacherToRate = school.findTeacherByName(teacherName);

	        if (teacherToRate != null) {
	            System.out.printf("Please enter your rating for %s (1-5): ", teacherToRate.name);
	            int rating = Integer.parseInt(scanner.nextLine());
	            student.rateTeacher(teacherToRate, rating);

	            double averageRating = teacherToRate.calculateAverageRating();
	            System.out.println("\n-- Updated Teacher Rating --");
	            System.out.println("Teacher: " + teacherToRate.name);
	            System.out.printf("New Average Rating: %.1f%n", averageRating);
	        } else {
	            System.out.println("Teacher " + teacherName + " not found.");
	        }

	        scanner.close();

}
