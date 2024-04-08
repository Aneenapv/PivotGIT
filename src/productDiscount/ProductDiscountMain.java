package productDiscount;

import java.util.Scanner;

public class ProductDiscountMain {

	public static void main(String[] args) {
		
		ProductDiscount pD = new ProductDiscount();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item price = ");
		double itemPrice = sc.nextDouble();
		pD.itemPrice=itemPrice;
		
		System.out.println("Do you have Promo Code: ");
		String isPromo = sc.next();
		pD.isPromo = isPromo;
		
		System.out.println("Enter Promo Discount = ");
		String promoDiscount = sc.next();
		pD.promoDiscount = promoDiscount;
		
		pD.regularDiscount();

	}

}
