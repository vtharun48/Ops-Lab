
import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Exception Handling Demo:");
            System.out.println("1. Arithmetic Exception");
            System.out.println("2. ArrayIndexOutOfBounds Exception");
            System.out.println("3. NullPointer Exception");
            System.out.println("4. NumberFormat Exception");
            System.out.print("Enter your choice (1-4): ");
            
            int choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                
                    int result = 10 / 0;
                    System.out.println("Result: " + result); // This won't execute
                    break;
                    
                case 2:
           
                    int[] arr = new int[5];
                    arr[10] = 50; // Accessing 11th element in array of size 5
                    break;
                    
                case 3:
       
                    String str = null;
                    System.out.println("String length: " + str.length()); // Calling method on null object
                    break;
                    
                case 4:
            
                    String notANumber = "ABC";
                    int num = Integer.parseInt(notANumber); // Converting non-numeric string to integer
                    System.out.println("Number: " + num);
                    break;
                    
                default:
                    System.out.println("Invalid choice");
            }
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Finally block executed");
        }
        
        System.out.println("Program executed successfully");
    }
}