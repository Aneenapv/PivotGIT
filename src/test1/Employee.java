package test1;

public class Employee {

	int id = 2189;
	String name = "Jenny";
	double salary = 50000;
	String position = "Operator";

	int id1 = 2188;
	String name1 = "Yash";
	double salary1 = 55000;
	String position1 = "Electrician";

	int id2 = 2188;
	String name2 = "Oliver";
	double salary2 = 60000;
	String position2 = "Mechanic";

	void detailsOfJenny() {
		System.out.println("Record of Jenny");
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(position);
		System.out.println();
	}

	void detailsOfYash() {
		System.out.println("Record of Yash");
		System.out.println(id1);
		System.out.println(name1);
		System.out.println(salary1);
		System.out.println(position1);
		System.out.println();
	}

	void detailsOfOliver() {
		System.out.println("Record of Oliver");
		System.out.println(id2);
		System.out.println(name2);
		System.out.println(salary2);
		System.out.println(position2);
	}

}
