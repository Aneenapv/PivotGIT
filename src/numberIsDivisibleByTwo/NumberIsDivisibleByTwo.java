package numberIsDivisibleByTwo;

public class NumberIsDivisibleByTwo {

	public static void main(String[] args) {
	
		int s = 0;
		int[] a = { 1,2,3,4,5,6,7,8,9,10};
		
		System.out.print("Numbers which are divisible by 2 = ");
		
		for(int i =0; i<10; i++)
		{
			if (a[i]%2==0 )
			   {
				System.out.print(a[i] +" ");
				s=s+1;
			   }
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("How many numbers are divisible by 2 in between 1 to 10 = "+s);
	

	}
}
			
				
		
		
	
