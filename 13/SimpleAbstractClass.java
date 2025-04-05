
abstract class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    public abstract double calculateArea();
    

    public void displayColor() {
        System.out.println("Shape color is " + color);
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    public void displayDetails() {
        displayColor();
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle area: " + calculateArea());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    public void displayDetails() {
        displayColor();
        System.out.println("Rectangle length: " + length);
        System.out.println("Rectangle width: " + width);
        System.out.println("Rectangle area: " + calculateArea());
    }
}

public class SimpleAbstractClass {
    public static void main(String[] args) {
         
        Circle circle = new Circle("Blue", 5.0);
        Rectangle rectangle = new Rectangle("Green", 4.0, 6.0);
        
        System.out.println("Circle details:");
        circle.displayDetails();
        
        System.out.println("\nRectangle details:");
        rectangle.displayDetails();
    }
}