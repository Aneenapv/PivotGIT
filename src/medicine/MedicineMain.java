package medicine;

import java.util.Scanner;

public class MedicineMain {

	public static void main(String[] args) {
		Medicine m = new Medicine();

		Scanner sc = new Scanner(System.in);

		System.out.println("enter weight: ");
		double weight = sc.nextDouble();
		m.weight = weight;

		System.out.println("enter thickness: ");
		double thickness = sc.nextDouble();
		m.thickness = thickness;

		System.out.println("enter hardness: ");
		double hardness = sc.nextDouble();
		m.hardness = hardness;

		m.goodTablet();

	}

}
