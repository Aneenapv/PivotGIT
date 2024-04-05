package arithmeticOperators;

public class ArithmeticOperator {

	int a = 10;
	int b = 3;
	int sum = 0;

	// sum of two numbers
	void addTwoNumbers() {
		System.out.println("Addition");
		sum = a + b;
		System.out.println("Result = " + sum);
		System.out.println();
	}

	/*
	 * This is the logic to find the result Subtraction of two numbers
	 */

	void subtractTwoNumbers() {
		System.out.println("Subtraction");
		sum = a - b;
		System.out.println("Result = " + sum);
		System.out.println();

	}

	void multiplyTwoNumbers() {
		System.out.println("Multiplication");
		sum = a * b;
		System.out.println("Result = " + sum);
		System.out.println();
	}

	void quotientOfTwoNumbers() {
		System.out.println("Quotient");
		sum = a / b;
		System.out.println("Result = " + sum);
		System.out.println();
	}

	void RemaiderOfTwoNumbers() {

		System.out.println("Remainder");
		sum = a % b;
		System.out.println("Result = " + sum);

	}

}
