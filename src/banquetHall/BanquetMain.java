package banquetHall;
import java.util.*;
public class BanquetMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter base cost = ");
		double baseCost = sc.nextDouble();
		
		System.out.println("Enter food cost = ");
		double foodCost = sc.nextDouble();
		
		System.out.println("Enter beverage cost and tip = ");
		double beveragesCostAndTip = sc.nextDouble();
		
		System.out.println("Number of guest = ");
		int numberOfGuest = sc.nextInt();
	
		Banquet banquet = new Banquet(baseCost,foodCost,beveragesCostAndTip,numberOfGuest);
		System.out.println("Total cost = " + banquet.calculateTheTotalCost());
		


	}

}
