package medicine;

public class Medicine {

	double weight;
	double thickness;
	double hardness;

	void goodTablet() {

		if ((weight >= 1401.6) && (weight <= 1518.4)) {
			System.out.println("Tablet weight is  within Range");

			if ((thickness >= 0.290) && thickness <= 0.330) {
				System.out.println("Tablet thickness is within Range");
			} else {
				System.out.println("Thickness is out of specification");
			}

			if ((hardness >= 18.0) && (hardness <= 38.0)) {
				System.out.println("Tablet hardness is within Range");
			} else {
				System.out.println("Hardness is out of specification");
			}
		} else {
			System.out.println("Weight is out of specification");
		}
	}

}
