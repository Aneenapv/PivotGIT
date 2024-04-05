package comparisonOperator;

public class ComparisonOperator {

	int a = 7;
	int b = 10;
	Boolean result = false; // by default value will be false

	void isAGreaterThanB() {
		result = a > b;
		System.out.println("Is " + a + " greater than " + b + " = " + result);
	}

	void isAlessThanB() {
		result = a < b;
		System.out.println("Is " + a + " less than " + b + " = " + result);
	}

	void isAEqualtoB() {
		result = a == b;
		System.out.println("Is " + a + " equalto " + b + " = " + result);
	}
}
