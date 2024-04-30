package practice;

public class StarPattern {

	public static void main(String[] args) {
		
// output
// *
// * * 
// * * *
// * * * *
 System.out.println("1");
 
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
// output
// * * * *
// * * *
// * * 
// * 
		 System.out.println("2");
		 
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
//output
//        *
//      * *
//    * * *		
//  * * * *		
		 System.out.println("3");
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.println(" ");
			}
			System.out.println("*");
		}

	}

}
