package assignmentPart2;
import java.util.*;
public  class OnlineBanking extends BankOperations{
	
	private String oldPassword;
	

	public OnlineBanking(String oldPassword) {
		super();
		this.oldPassword = oldPassword;
	}

    Scanner sc =new Scanner(System.in);

	@Override
	public void changePinPassword()
	{
		System.out.println("Please update your passwword");
		System.out.println("Enter your new password to update: ");
		String newPassword = sc.nextLine();
		
		
		if(newPassword .equals(oldPassword))
		{
			System.out.println("Please provide different password not same as old password");	
		}
		else
		{
			
/* Password is not same as old password
One should not be allowed to set password 
if it is less than 8 characters
 and have these special characters (&,$, @) */
			
 
			if(newPassword.length()<8)
			{
				System.out.println("Password should be 8 characters");
			}
			else
			{
			if((newPassword.contains("@")) || (newPassword.contains("$")) || (newPassword.contains("&")))
			{	
			System.out.println("Password successfully updated");
			System.out.println("new password = "+newPassword);
		    }
			else
			{
				System.out.println("please include special characters @ $ &");
			}
		
	        }

}
}
}
