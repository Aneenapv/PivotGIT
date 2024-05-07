package inheritancePractice;

public class ApplianceMain {

	public static void main(String[] args) {

		// laptop
		Appliance laptop = new Appliance("AZUZ", "35FGH53", 1035.99);
		laptop.displayDetails();

		laptop.displayOffer(1000);
		System.out.println("offer= " + laptop.price);
		laptop.displaySpecification();

		System.out.println("--------------------------");

		// airfryer
		Appliance airfryer = new Appliance("Bella", "zJLK67", 110.55);
		airfryer.displayDetails();

		airfryer.displayOffer(85.55);
		System.out.println("offer= " + airfryer.price);
		airfryer.displaySpecification();

		System.out.println("------------------------------");

		// laptop extends Appliance
		// laptop inherits Appliance class

		Laptop hplaptop = new Laptop();
		hplaptop.modelName = "Hp laptop";
		hplaptop.modelNumber = "kkpp";
		hplaptop.price = 1255.69;

		hplaptop.displayDetails();
		hplaptop.displayOffer(1100);
		System.out.println("offer= " + hplaptop.price);
		hplaptop.displaySpecification();

		// airfryer extends Appliance
		// airfryer inherits Appliance class
		System.out.println("----------------------------------");

		Airfryer bellaAirfryer = new Airfryer();

		bellaAirfryer.modelName = "Bella";
		bellaAirfryer.modelNumber = "WFG777";
		bellaAirfryer.price = 115.99;

		bellaAirfryer.displayDetails();
		bellaAirfryer.displayOffer(70.99);
		// System.out.println("offer trial= "+bellaAirfryer.displayOffer(70.99));
		System.out.println("offer= " + bellaAirfryer.price);
		bellaAirfryer.displaySpecification();

		System.out.println("--------------------------------------");

		Reviews bellaAirfryerReviews = new Reviews();

		bellaAirfryerReviews.setRating(2.1);
		System.out.println("bella airfryer rating =" + bellaAirfryerReviews.getRating());

		String[] commentsAir = { "bad product", "not worth", "poor quality, not useful" };
		bellaAirfryerReviews.setComments(commentsAir);
		System.out.println("bella review =" + bellaAirfryerReviews.getComments());

		bellaAirfryer.customerReviews = bellaAirfryerReviews;

		System.out.println("------------------------------------------");

		WashingMachine wash = new WashingMachine();
		// wash.num is not available bcoz num variable is declared as private in parent
		// class.
		// if any variable is private, then we cannot access outside class even if we
		// are inherit from parent class..
		// we can use that private variables through getter and setter methods in
		// encapsulation oops concept

		wash.setNum("12");
		wash.setDefaultVariables("whirlpool");
		System.out.println("wash number = " + wash.getNum());
		System.out.println("wash brand name  =" + wash.getDefaultVariables());

		System.out.println("--------------------------------------------");

		wash.customerReviews = new Reviews();

		wash.customerReviews.setRating(3.2);
		String[] comments = { "excellent product", "value worth", "poor quality, not useful" };
		wash.customerReviews.setComments(comments);
		System.out.println("rating =" + wash.customerReviews.getRating());
		System.out.println("review = " + wash.customerReviews.getComments());

		System.out.println("---------------------------------------------");

		// I can also create object of Reviews class and call methods set and get

		Reviews customerReviewsForWM = new Reviews();

		customerReviewsForWM.setRating(4.5);
		String[] commentsTrial = { "excellent product", "value worth", "poor quality, not useful" };
		customerReviewsForWM.setComments(commentsTrial);
		System.out.println("rating trial = " + customerReviewsForWM.getRating());
		System.out.println("review trial = " + customerReviewsForWM.getComments());

		wash.customerReviews = customerReviewsForWM;

		System.out.println("------------------------------------------");

		Appliance app = new Laptop();

		app.modelName = "AMD";
		app.modelNumber = "nmh980";
		app.price = 2000.0;
		app.displayDetails();
		app.displaySpecification();

		System.out.println("offer= " + app.displayOffer(1500));

		app.customerReviews = customerReviewsForWM;

		System.out.println("------------------------------------");

		// parent reference variable
		// referring to an object of child class using parent reference variable
		Laptop lap = new Macbook(); // Is a relationship
		lap.modelName = "airlap pro";
		lap.displayCustomerReviews();
		lap.displaySpecification();
		System.out.println();

		Appliance appliance = new Macbook();
		appliance.modelName = "airlap 00";
		appliance.displayCustomerReviews();
		appliance.displaySpecification();

		System.out.println();

		Appliance appliance1 = new Laptop();
		appliance1.modelName = "airlap 11 ";
		appliance1.displayCustomerReviews();
		appliance1.displaySpecification();
		

		System.out.println();

		Appliance appliance2 = new Airfryer();
		appliance2.modelName = "airfry 22 ";
		appliance2.displayCustomerReviews();
		appliance2.displaySpecification();

		System.out.println();

		Appliance appliance3 = new WashingMachine();
		appliance3.modelName = "wash 33 ";
		appliance3.displayCustomerReviews();
		appliance3.displaySpecification();
		
		System.out.println("____________________________________");
		// parents cannot claim child properties... 
		//orderAdditional memory is method of child laptop class. 
		//so parent class appliance cannot call this method.
		
		//Laptop lap = new Macbook();
		lap.orderAdditionalMemory();

	}

}
