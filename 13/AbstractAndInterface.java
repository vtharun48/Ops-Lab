

interface Drawable {
    void draw();
}

abstract class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    public abstract double calculateArea();
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
}

class Circle extends Shape implements Drawable {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }
}

class Rectangle extends Shape implements Drawable {
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
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle with length " + length + " and width " + width);
    }
}

public class AbstractAndInterface {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        
        circle.draw();
        System.out.println("Circle area: " + circle.calculateArea());
        
        rectangle.draw();
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        

        Shape shape1 = circle;
        Shape shape2 = rectangle;
        
        System.out.println("\nUsing polymorphism with abstract class:");
        System.out.println("Shape 1 color: " + shape1.getColor());
        System.out.println("Shape 1 area: " + shape1.calculateArea());
        
        System.out.println("Shape 2 color: " + shape2.getColor());
        System.out.println("Shape 2 area: " + shape2.calculateArea());
        

        Drawable drawable1 = circle;
        Drawable drawable2 = rectangle;
        
        System.out.println("\nUsing polymorphism with interface:");
        drawable1.draw();
        drawable2.draw();
    }
}