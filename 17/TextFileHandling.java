
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            
            System.out.println("Enter text to write to file (type 'END' on a new line to finish):");
            BufferedWriter writer = new BufferedWriter(new FileWriter("sample.txt"));
            
            String line;
            while (true) {
                line = scanner.nextLine();
                if (line.equals("END")) {
                    break;
                }
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            System.out.println("File written successfully!");
            
        
            System.out.println("\nReading file contents:");
            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
            
            String readLine;
            while ((readLine = reader.readLine()) != null) {
                System.out.println(readLine);
            }
            reader.close();
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}