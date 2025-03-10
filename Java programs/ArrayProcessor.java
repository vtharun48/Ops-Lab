import java.util.Scanner;

public class ArrayProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
