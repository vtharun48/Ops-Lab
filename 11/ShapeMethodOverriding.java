

class Shape {
    public double getArea() {
        return 0.0;
    }
    
    public void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void display() {
        System.out.println("This is a circle with radius: " + radius);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
    
    @Override
    public void display() {
        System.out.println("This is a rectangle with length: " + length + " and width: " + width);
    }
}

public class ShapeMethodOverriding {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        
        System.out.println("Shape:");
        shape.display();
        System.out.println("Area: " + shape.getArea());
        
        System.out.println("\nCircle:");
        circle.display();
        System.out.println("Area: " + circle.getArea());
        
        System.out.println("\nRectangle:");
        rectangle.display();
        System.out.println("Area: " + rectangle.getArea());
        

        System.out.println("\nUsing polymorphism:");
        Shape[] shapes = {shape, circle, rectangle};
        
        for (Shape s : shapes) {
            s.display();
            System.out.println("Area: " + s.getArea());
        }
    }
}