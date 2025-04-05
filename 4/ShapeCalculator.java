
class Shape {
    protected String name;
    protected String color;
    
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    public void displayDetails() {
        System.out.println("Shape: " + name);
        System.out.println("Color: " + color);
    }
    
    public double calculateArea() {
        return 0.0; 
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super("Rectangle", color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Blue", 5.0, 3.0);
        
        System.out.println("Shape Information:");
        rectangle.displayDetails();
        
        System.out.println("\nCalculations:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}