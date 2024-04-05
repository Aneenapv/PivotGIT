package test1;

public class Grade {

	double maths = 99;
	double physics = 30;
	double chemistry = 50;
	double totalMarks = (maths + physics + chemistry);

	void grade() {
		if (totalMarks >= 290) {
			System.out.println("Grade A");
		}

		else if ((totalMarks < 290) && (totalMarks >= 260)) {
			System.out.println("Grade B");
		}

		else if ((totalMarks < 260) && (totalMarks >= 200)) {
			System.out.println("Pass");

		}

		else {
			System.out.println("Fail");
		}

	}

}
