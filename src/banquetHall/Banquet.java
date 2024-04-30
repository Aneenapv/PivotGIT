package banquetHall;

public class Banquet {
	
	double baseCost;
	double foodCost;
	double beveragesCostAndTip;
	double foodTax;
	double beverageAndTipTax;
	double baseBookingCost;
	double tax;
	int numberOfGuest;
	double cess;
	double totalCost;
	
	public Banquet(double baseCost, double foodCost, double beveragesCostAndTip, int numberOfGuest) {
	super();
	this.baseCost = baseCost;
	this.foodCost = foodCost;
	this.beveragesCostAndTip = beveragesCostAndTip;
	this.numberOfGuest = numberOfGuest;
    }
	
	// methods
	
	public double calculateBaseCost(double baseCost, double foodCost, double beveragesCostAndTip)
	{
		baseBookingCost = (baseCost + foodCost + beveragesCostAndTip);
		return baseBookingCost;
	}
		
	public double calculateTax(double baseBookingCost)
	{
		tax = (baseBookingCost * 0.05) ;
		return tax;
	}

	public double calculateCess(int numberOfGuest,double baseBookingCost)
	{
		if((numberOfGuest>0)&&(numberOfGuest<=40))
		{
			cess = baseBookingCost * 0.04;
		}
		else if((numberOfGuest>40)&&(numberOfGuest<=80))
		{
			cess = baseBookingCost * 0.08;
		}
		else if((numberOfGuest>80)&&(numberOfGuest<=150))
		{
			cess = baseBookingCost * 0.10;
		}
		else
		{
			cess = baseBookingCost * 0.125;
		}
		return cess;
	}
	
	public double calculateTheTotalCost()
	{
//		baseBookingCost = calculateBaseCost(baseCost,foodCost,beveragesCostAndTip);
//		tax =  calculateTax(baseBookingCost);
//		cess = calculateCess(numberOfGuest,baseBookingCost);
		
//      totalCost = (baseBookingCost + tax + cess );
		
		//or
		
	totalCost = calculateBaseCost(baseCost,foodCost,beveragesCostAndTip) + calculateTax(baseBookingCost) + calculateCess(numberOfGuest,baseBookingCost);
		
		return totalCost;
	}
}
