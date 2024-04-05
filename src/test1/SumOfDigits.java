package test1;

public class SumOfDigits {

	int n = 1234;
	int sum = 0, y;

//	    int sum = 0,y;
//		Scanner sc = new Scanner(System.in);
//		int n= sc.nextInt();
		


	void sumOfDigits() {
		
		while (n > 0) {
			y = n % 10;
			sum = sum + y;
			n = n / 10;
		}
		System.out.println("sum of digits=" + sum);
	}

}
