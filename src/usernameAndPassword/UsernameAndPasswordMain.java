package usernameAndPassword;
import java.util.*;
public class UsernameAndPasswordMain {

	public static void main(String[] args) {
		
		UsernameAndPassword user = new UsernameAndPassword();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=3;i++)
		{
		System.out.println("Enter username : ");
		String enteredUsername = sc.next();
		user.enteredUsername=enteredUsername;
		
		System.out.println("Enter password : ");
		String  enteredPassword = sc.next();
		user.enteredPassword= enteredPassword;
		user.checkUsernameAndPassword();
		}
		System.out.println("Account locked");

	}

}
