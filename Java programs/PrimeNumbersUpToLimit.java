import java.util.Scanner;

public class PrimeNumbersUpToLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        
        System.out.println("Prime numbers up to " + limit + " are:");
        
        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;
            
            // Check if num is divisible by any number from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
