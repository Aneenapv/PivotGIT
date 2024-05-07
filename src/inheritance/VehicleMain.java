package inheritance;

public class VehicleMain {

	public static void main(String[] args) {

			    
			    TwoWheeler bike = new TwoWheeler();
			    bike.showPrice();
			    bike.finalPrice();
			    
			    FourWheeler car = new FourWheeler();
			    car.showPrice();
			    car.finalPrice();
			    
			    Vehicle two = new TwoWheeler();
			    two.showPrice();
			   
			    Vehicle four= new FourWheeler();
			    four.showPrice();
			    
			
			    
			    
			  }

	}



