package productDiscount;

public class ProductDiscount {
	
	double itemPrice;
	String promoDiscount;
	
	String isPromo;
	
	double regularDiscount;
	double Promo;
	double FinalDiscount;
	
	
	void regularDiscount()
	{
		if(isPromo.equalsIgnoreCase("NO"))
		{
			regularDiscount = (itemPrice * 0.5);
			System.out.println("Regular Discount only = "+ regularDiscount);
		}
	
		else if(isPromo.equalsIgnoreCase("YES"))
		{
		System.out.println("Entire store item 50% discount");
		regularDiscount = (itemPrice * 0.5);
		System.out.println("After 50% discount price = "+ regularDiscount);
		
		//System.out.println("Do you have promo code : ");
//		if(isPromo.equals("YES"))
//		{
		if(promoDiscount.equalsIgnoreCase("Promo5"))
		{
		System.out.println("Applied 5% discount");
		Promo = (regularDiscount * 0.05);
		FinalDiscount = (regularDiscount - Promo);
		System.out.println("Final discount price = "+FinalDiscount);
		}
		else if(promoDiscount.equalsIgnoreCase("Promo10"))
		{
		System.out.println("Applied 10% discount");
		Promo = (regularDiscount * 0.10);
		FinalDiscount = (regularDiscount - Promo);
		System.out.println("Final discount price = "+FinalDiscount);
		}
		
		else if(promoDiscount.equalsIgnoreCase("Promo20"))
		{
		System.out.println("Applied 20% discount");
		Promo = (regularDiscount * 0.20);
		FinalDiscount = (regularDiscount - Promo);
		System.out.println("Final discount price = "+FinalDiscount);
		}
	}
		
	
	}

}



/* Q2. Write a program that calculates discount applied on a product. Criteria are as below

50% discount is applied on all products.
If any of the following promo codes are applied then add the additional discount and calculate the final discounted value

Promo Code	Discount
Promo5	5%
Promo10	10%
Promo20	20%

*/