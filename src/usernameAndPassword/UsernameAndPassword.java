package usernameAndPassword;

public class UsernameAndPassword {
	
	/* Q1) Write a program which takes username and password 
	 * from user via console and compares it with a user name and password saved in your class. 
   Saved user id and password are as below
   UserId	pivotAdmin
   password	Admin123
 
 If the username and password entered by user matches with the one saved in your class, 
 then print “You are logged in to the application“ 
 other wise  print “Incorrect User id or password.Try again”.  
 Also a user gets 3 chances enter the correct user name and password. 
 If the user enters incorrect user name or password more than 3 times then print “ Account locked” */
	
	
	String savedUsername = "pivotAdmin";
	String savedPassword = "Admin123";
	String enteredUsername;
	String  enteredPassword;
	
	void checkUsernameAndPassword()
	{

		if((enteredUsername.equals("pivotAdmin")) && (enteredPassword.equals("Admin123")))
		    {
				System.out.println("You are logged in to the application");
				System.exit(0);  //break; can use only in loop
		    } 
			else
			{
				System.out.println("Incorrect User id or password:Try again");
			}
		
	}	

}
