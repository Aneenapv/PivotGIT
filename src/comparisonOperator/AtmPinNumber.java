package comparisonOperator;

public class AtmPinNumber {

	int a = 125;
	int b = 126;
	Boolean result = false;

	void aEqualtoB() {
		result = (a == b);

		if (result == true) {
			System.out.println("Pin Number Verified Successfully");

		} else {
			System.out.println("Pin Incorrect");
		}

	}

}
