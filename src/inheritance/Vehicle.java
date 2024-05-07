package inheritance;

public class Vehicle {

		  double basePrice = 100000;

		  public void showPrice() {
		    System.out.println("The price of Vehicle is: Rs." + basePrice);
		  }
		}

	// child class
		class TwoWheeler extends Vehicle {

		  double increasePriceBy = 0.20; // 0.2 times

		  void finalPrice() {
		    basePrice = basePrice + (basePrice * increasePriceBy);
		    System.out.println(
		      "After modification, The price of bike is: Rs." + basePrice);
		  }
		  
		  // override or runtime polymorphism
		  public void showPrice() {
			    System.out.println(" trial The price of Vehicle is: Rs." + basePrice);
			  }
		}

		// child class
		class FourWheeler extends Vehicle {

		  double increasePriceBy = 1; // 1 times

		  void finalPrice() {
		    basePrice = basePrice + (basePrice * increasePriceBy);
		    System.out.println(
		      "After modification, The price of car is: Rs." + basePrice
		    );
		  }
		}

		