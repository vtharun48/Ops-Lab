
import java.util.Scanner;

public class BasicExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            
            System.out.print("Enter a number to divide 100 by: ");
            int divisor = scanner.nextInt();
            int result = 100 / divisor;
            System.out.println("Result: " + result);
            
            
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.print("Enter an index to access from the array (0-4): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            System.out.println("Exception details: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
            System.out.println("Exception details: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other exception occurred!");
            System.out.println("Exception details: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, whether exception occurs or not.");
            scanner.close();
        }
        
        System.out.println("Program continues execution after exception handling.");
    }
}