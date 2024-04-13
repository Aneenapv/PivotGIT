package trial;
import java.util.Scanner;
public class User {

	public class LoginProgram {
	    private static final String USERNAME = "pivotAdmin";
	    private static final String PASSWORD = "Admin123";
	    private static final int MAX_ATTEMPTS = 3;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int attempts = 0;

	        while (attempts < MAX_ATTEMPTS) {
	            System.out.print("Enter username: ");
	            String username = scanner.nextLine();
	            System.out.print("Enter password: ");
	            String password = scanner.nextLine();

	            if (username.equals(USERNAME) && password.equals(PASSWORD)) {
	                System.out.println("You are logged in to the application");
	                break;
	            } else {
	                System.out.println("Incorrect User id or password. Try again.");
	                attempts++;
	            }
	        }

	        if (attempts == MAX_ATTEMPTS) {
	            System.out.println("Account locked");
	        }
	        scanner.close();
	    }
	}

	}

