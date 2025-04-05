

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    

    public double add(double a, double b) {
        return a + b;
    }
    

    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

public class CalculatorMethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + calc.add(5, 10, 15));
        System.out.println("Sum of 5.5 and 10.5: " + calc.add(5.5, 10.5));
        
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements: " + calc.add(numbers));
    }
}