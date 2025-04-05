
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.io.File;

public class BuiltInPackageDemo1 {
    public static void main(String[] args) {
 
        System.out.println("Java.util.ArrayList Example:");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Fruits list: " + fruits);
        System.out.println("Second fruit: " + fruits.get(1));
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
        System.out.println();
        

        System.out.println("Java.util.Date Example:");
        Date currentDate = new Date();
        System.out.println("Current date and time: " + currentDate);
        System.out.println();
        
    
        System.out.println("Java.text.SimpleDateFormat Example:");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = formatter.format(currentDate);
        System.out.println("Formatted date: " + formattedDate);
        System.out.println();
        
 
        System.out.println("Java.util.Scanner Example:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
        System.out.println();
        

        System.out.println("Java.io.File Example:");
        File file = new File("test.txt");
        System.out.println("File exists: " + file.exists());
        System.out.println("File path: " + file.getAbsolutePath());
    }
}