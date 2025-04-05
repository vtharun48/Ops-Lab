
package calculator;

public class AdvancedOperations {
    public double square(double a) {
        return a * a;
    }
    
    public double cube(double a) {
        return a * a * a;
    }
    
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
    
    public double squareRoot(double a) {
        if(a < 0) {
            System.out.println("Error: Cannot find square root of negative number");
            return 0;
        }
        return Math.sqrt(a);
    }
}