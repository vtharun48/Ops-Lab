
import java.util.Date;

class Book {
    // Private data members
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private Date dueDate;
    

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.dueDate = null;
    }
    

    public String getIsbn() { return isbn; }
    
    public String getTitle() { return title; }
    
    public String getAuthor() { return author; }
    
    public boolean isAvailable() { return isAvailable; }
    
    public Date getDueDate() { return dueDate; }
    

    public void checkOut() {
        if(isAvailable) {
            isAvailable = false;
         
            dueDate = new Date(System.currentTimeMillis() + (14 * 24 * 60 * 60 * 1000));
            System.out.println("Book checked out successfully. Due date: " + dueDate);
        } else {
            System.out.println("Book is not available for checkout");
        }
    }
    

    public void returnBook() {
        if(!isAvailable) {
            isAvailable = true;
            dueDate = null;
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Book is already in the library");
        }
    }
    

    public void displayInfo() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isAvailable ? "Available" : "Checked Out"));
        if(dueDate != null) {
            System.out.println("Due Date: " + dueDate);
        }
    }
}

public class LibraryEncapsulation {
    public static void main(String[] args) {
        Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        Book book2 = new Book("978-0596009205", "Head First Java", "Kathy Sierra");
        
        book1.displayInfo();
        System.out.println();
        
        book1.checkOut();
        book1.displayInfo();
        System.out.println();
        
        book1.checkOut(); 
        book1.returnBook();
        book1.displayInfo();
    }
}