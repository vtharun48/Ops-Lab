import java.io.*;
import java.util.Scanner;

class Student implements Serializable {
    private int rollNo;
    private String name;
    private float marks;
    
    public Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentRecordFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
         
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.dat"));
            
            System.out.println("Enter details for 3 students:");
            for (int i = 0; i < 3; i++) {
                System.out.println("\nStudent " + (i+1) + ":");
                System.out.print("Roll No: ");
                int rollNo = scanner.nextInt();
                
                scanner.nextLine(); 
                System.out.print("Name: ");
                String name = scanner.nextLine();
                
                System.out.print("Marks: ");
                float marks = scanner.nextFloat();
                
                Student student = new Student(rollNo, name, marks);
                out.writeObject(student);
            }
            out.close();
            System.out.println("\nStudent records saved successfully!");
            
         
            System.out.println("\nReading student records from file:");
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.dat"));
            
            for (int i = 0; i < 3; i++) {
                System.out.println("\nStudent " + (i+1) + ":");
                Student student = (Student) in.readObject();
                student.display();
            }
            in.close();
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}