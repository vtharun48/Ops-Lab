

interface Drawable {
    void draw();
}

interface Resizable {
    void resize(double factor);
}

class Rectangle implements Drawable, Resizable {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle of length " + length + " and width " + width);
    }
    
    @Override
    public void resize(double factor) {
        length *= factor;
        width *= factor;
        System.out.println("Rectangle resized to length " + length + " and width " + width);
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        rectangle.draw();
        rectangle.resize(2.0);
        rectangle.draw();
    }
}