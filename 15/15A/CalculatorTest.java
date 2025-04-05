
import calculator.BasicOperations;
import calculator.AdvancedOperations;

public class CalculatorTest {
    public static void main(String[] args) {
        BasicOperations basic = new BasicOperations();
        AdvancedOperations advanced = new AdvancedOperations();
        

        System.out.println("Basic Operations:");
        System.out.println("Addition: " + basic.add(10, 5));
        System.out.println("Subtraction: " + basic.subtract(10, 5));
        System.out.println("Multiplication: " + basic.multiply(10, 5));
        System.out.println("Division: " + basic.divide(10, 5));
        

        System.out.println("\nAdvanced Operations:");
        System.out.println("Square of 5: " + advanced.square(5));
        System.out.println("Cube of 5: " + advanced.cube(5));
        System.out.println("5 raised to power 3: " + advanced.power(5, 3));
        System.out.println("Square root of 25: " + advanced.squareRoot(25));
    }
}