package pizzaBill;

import java.util.Scanner;

public class PizzaBill {

	double sizePrice = 0;
	double toppingPrice = 0;
	double extraCheesePrice = 0;

	Scanner sc = new Scanner(System.in);

	/*
	 * Write a program to prepare the bill for a pizza shop.
	 * Assume an order and work out the final bill.
	 * Take the Cheese Pizza prices as: 
	 * Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
	 * For additional pepperoni topping: 
	 * Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
	 * Extra cheese for any size pizza: + $1
	 * For eg: If the Pizza is medium, pepperoni with extra cheese the program 
	 * should  calculate the final bill as 20+3+1 = $24 and print as
	 * “Your final bill is $24”
	 */
	
	void pizzaBill() {
		System.out.println("Enter the size of pizza: ");
		String size = sc.next();
		System.out.println("Enter Additional topping: yes or no");
		String topping = sc.next();
		System.out.println("Do you want cheese it up : yes or no");
		String extraCheese = sc.next();

		switch (size) {
		case "small": {
			System.out.println("small size pizza is $15");
			sizePrice = 15;
			if (topping.equals("yes")) {
				System.out.println("Peproni topping for small= $2");
				toppingPrice = sizePrice + 2;
			} 
			
			else if(topping=="no") {
				System.out.println("No topping added");
				toppingPrice = sizePrice;
			}
		}
		break;
		
		case "medium": {

			System.out.println("medium size pizza is $20");
			sizePrice = 20;
			if (topping=="yes") {
				System.out.println("Peproni topping for medium= $3");
				toppingPrice = sizePrice + 3;
			} 
			else if(topping=="no") {
				System.out.println("No topping added");
				toppingPrice = sizePrice;
			}
		}
		break;
		
		case "large": {

			System.out.println("large size pizza is $25");
			sizePrice = 25;
			if (topping=="yes") {
				System.out.println("Peproni topping for large= $3");
				toppingPrice = sizePrice + 3;
			} 
			else if(topping=="no") {
				System.out.println("No topping added");
				toppingPrice = sizePrice;
		      }
		}

		}
		

		switch (extraCheese) {
		case "yes": {
			System.out.println("Extra cheese for any size is $1");
			extraCheesePrice = toppingPrice + 1;
			break;
		}
		case "no": {
			System.out.println("No extra Cheese");
			extraCheesePrice = toppingPrice;
			break;
		}

//		default:
//			System.out.println("Invalid entry for extra cheese");
//			break;
		}
        System.out.println();
		System.out.println("Your Final Bill is = $" + extraCheesePrice);
	}

}


