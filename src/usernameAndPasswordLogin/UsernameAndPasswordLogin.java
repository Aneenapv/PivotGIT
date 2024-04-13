package usernameAndPasswordLogin;

import java.util.Scanner;

public class UsernameAndPasswordLogin {
			
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
			int i;

			Scanner sc = new Scanner(System.in);
			
			void checkUsernameAndPassword()
			{
				for(i=1;i<=3;i++)
				{
				System.out.println("Enter username : ");
				String enteredUsername = sc.next();
				
				System.out.println("Enter password : ");
				String  enteredPassword = sc.next();
				
				
				if((enteredUsername.equals("pivotAdmin")) && (enteredPassword.equals("Admin123")))
				    {
						System.out.println("You are logged in to the application");
						break;
				    } 
					else
					{
						System.out.println("Incorrect User id or password:Try again");
					}
			     }	
				
				if(i==4)
				{
					  System.out.println("Account locked");
				}
			}
		}

