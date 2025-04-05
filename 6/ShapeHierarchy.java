
class Shape {
    protected String color;
    protected boolean filled;
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public void displayInfo() {
        System.out.println("Shape Information:");
        System.out.println("Color: " + color);
        System.out.println("Filled: " + (filled ? "Yes" : "No"));
    }
    
    public double calculateArea() {
        return 0.0; // Default implementation
    }
    
    public double calculatePerimeter() {
        return 0.0; // Default implementation
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Circle Information:");
        System.out.println("Color: " + color);
        System.out.println("Filled: " + (filled ? "Yes" : "No"));
        System.out.println("Radius: " + radius);
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Rectangle Information:");
        System.out.println("Color: " + color);
        System.out.println("Filled: " + (filled ? "Yes" : "No"));
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Triangle Information:");
        System.out.println("Color: " + color);
        System.out.println("Filled: " + (filled ? "Yes" : "No"));
        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
        System.out.println("Side 3: " + side3);
    }
    
    @Override
    public double calculateArea() {
        // Using Heron's formula
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class ShapeHierarchy {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape shape = new Shape("None", false);
        Circle circle = new Circle("Red", true, 5.0);
        Rectangle rectangle = new Rectangle("Blue", true, 4.0, 6.0);
        Triangle triangle = new Triangle("Green", false, 3.0, 4.0, 5.0);
        
        // Displaying information and calculations for each shape
        System.out.println("------ Basic Shape ------");
        shape.displayInfo();
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        
        System.out.println("\n------ Circle ------");
        circle.displayInfo();
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        
        System.out.println("\n------ Rectangle ------");
        rectangle.displayInfo();
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        
        System.out.println("\n------ Triangle ------");
        triangle.displayInfo();
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}