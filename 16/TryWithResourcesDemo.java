
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


class FileProcessingException extends Exception {
    public FileProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class TryWithResourcesDemo {

    public static void processFile(String fileName) throws FileProcessingException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;
            
            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {
   
                System.out.println(lineNumber + ": " + line);
                
 
                try {
                    String[] numbers = line.split(",");
                    for (String numStr : numbers) {
                        int num = Integer.parseInt(numStr.trim());
                        if (num < 0) {
                            throw new IllegalArgumentException("Negative numbers are not allowed: " + num);
                        }
                    }
                } catch (NumberFormatException e) {
                    throw new FileProcessingException("Error parsing line " + lineNumber, e);
                }
                
                lineNumber++;
            }
        } catch (IOException e) {
            throw new FileProcessingException("Error reading file: " + fileName, e);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter file name to process: ");
            String fileName = scanner.nextLine();
            
            processFile(fileName);
            System.out.println("File processed successfully");
            
        } catch (FileProcessingException e) {
            System.out.println("Error processing file: " + e.getMessage());
            
            // Display chain of exceptions
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println("Caused by: " + cause.getMessage());
            }
        } finally {
            scanner.close();
        }
    }
}

