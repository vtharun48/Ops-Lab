
import java.util.Scanner;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}


class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class User {
    private String username;
    private int age;
    
    public User(String username, int age) throws InvalidUsernameException, InvalidAgeException {
        if (username == null || username.length() < 3) {
            throw new InvalidUsernameException("Username must be at least 3 characters long");
        }
        
        if (age < 18 || age > 100) {
            throw new InvalidAgeException("Age must be between 18 and 100");
        }
        
        this.username = username;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Age: " + age);
    }
}

public class CustomExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            
            User user = new User(username, age);
            System.out.println("\nUser created successfully!");
            user.displayInfo();
            
        } catch (InvalidUsernameException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please try again with a valid username.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please try again with a valid age.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
        
        System.out.println("\nProgram execution completed.");
    }
}