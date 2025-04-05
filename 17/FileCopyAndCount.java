
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyAndCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
      
            System.out.print("Enter source file name: ");
            String sourceFile = scanner.nextLine();
            
            System.out.print("Enter destination file name: ");
            String destFile = scanner.nextLine();
            
       
            FileReader fr = new FileReader(sourceFile);
            FileWriter fw = new FileWriter(destFile);
            
          
            int character;
            int totalChars = 0;
            int alphabets = 0;
            int digits = 0;
            int spaces = 0;
            int specialChars = 0;
            
            while ((character = fr.read()) != -1) {
                
                fw.write(character);
                
                
                totalChars++;
                
                if (Character.isLetter(character)) {
                    alphabets++;
                } else if (Character.isDigit(character)) {
                    digits++;
                } else if (Character.isWhitespace(character)) {
                    spaces++;
                } else {
                    specialChars++;
                }
            }
            
          
            fr.close();
            fw.close();
            
           
            System.out.println("\nFile copied successfully!");
            System.out.println("Character count statistics:");
            System.out.println("Total characters: " + totalChars);
            System.out.println("Alphabets: " + alphabets);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);
            System.out.println("Special characters: " + specialChars);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}