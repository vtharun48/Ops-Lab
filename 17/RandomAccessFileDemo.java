
import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.Scanner;

public class RandomAccessFileDemo {
    private static final int RECORD_SIZE = 42;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            RandomAccessFile file = new RandomAccessFile("employees.dat", "rw");
            
            int choice;
            do {
                System.out.println("\nEmployee Record Management");
                System.out.println("1. Add Employee");
                System.out.println("2. Read Employee");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        addEmployee(file, scanner);
                        break;
                    case 2:
                        readEmployee(file, scanner);
                        break;
                    case 3:
                        updateEmployee(file, scanner);
                        break;
                    case 4:
                        deleteEmployee(file, scanner);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 5);
            
            file.close();
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    private static void addEmployee(RandomAccessFile file, Scanner scanner) throws IOException {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        
        scanner.nextLine(); 
        System.out.print("Enter employee name (max 15 chars): ");
        String name = scanner.nextLine();
        
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        
       
        file.seek(file.length());
        
       
        file.writeInt(id);
        
        
        StringBuilder namePadded = new StringBuilder(name);
        namePadded.setLength(15);
        file.writeChars(namePadded.toString());
        
        file.writeDouble(salary);
        
        System.out.println("Employee added successfully!");
    }
    
    private static void readEmployee(RandomAccessFile file, Scanner scanner) throws IOException {
        System.out.print("Enter employee ID to read: ");
        int searchId = scanner.nextInt();
        
        boolean found = false;
        for (long pos = 0; pos < file.length(); pos += RECORD_SIZE) {
            file.seek(pos);
            int id = file.readInt();
            
            if (id == searchId) {
                
                StringBuilder name = new StringBuilder();
                for (int i = 0; i < 15; i++) {
                    name.append(file.readChar());
                }
                
                double salary = file.readDouble();
                
                System.out.println("\nEmployee Details:");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name.toString().trim());
                System.out.println("Salary: " + salary);
                
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Employee not found!");
        }
    }
    
    private static void updateEmployee(RandomAccessFile file, Scanner scanner) throws IOException {
        System.out.print("Enter employee ID to update: ");
        int searchId = scanner.nextInt();
        
        boolean found = false;
        for (long pos = 0; pos < file.length(); pos += RECORD_SIZE) {
            file.seek(pos);
            int id = file.readInt();
            
            if (id == searchId) {
                scanner.nextLine(); 
                System.out.print("Enter new name (max 15 chars): ");
                String name = scanner.nextLine();
                
                System.out.print("Enter new salary: ");
                double salary = scanner.nextDouble();
                
                
                file.seek(pos);
                file.writeInt(id);
                
               
                StringBuilder namePadded = new StringBuilder(name);
                namePadded.setLength(15);
                file.writeChars(namePadded.toString());
                
                file.writeDouble(salary);
                
                System.out.println("Employee updated successfully!");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Employee not found!");
        }
    }
    
    private static void deleteEmployee(RandomAccessFile file, Scanner scanner) throws IOException {
        System.out.print("Enter employee ID to delete: ");
        int searchId = scanner.nextInt();
        
        boolean found = false;
        for (long pos = 0; pos < file.length(); pos += RECORD_SIZE) {
            file.seek(pos);
            int id = file.readInt();
            
            if (id == searchId) {
                
                file.seek(pos);
                file.writeInt(-1);
                
                System.out.println("Employee deleted successfully!");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Employee not found!");
        }
    }
}