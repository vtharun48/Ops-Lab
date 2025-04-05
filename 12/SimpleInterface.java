

interface Drawable {
    void draw();
    double getArea();
}

class Rectangle implements Drawable {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
}

class Circle implements Drawable {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class SimpleInterface {
    public static void main(String[] args) {
        Drawable rectangle = new Rectangle(4.0, 5.0);
        Drawable circle = new Circle(3.0);
        
        rectangle.draw();
        System.out.println("Rectangle area: " + rectangle.getArea());
        
        circle.draw();
        System.out.println("Circle area: " + circle.getArea());
    }
}