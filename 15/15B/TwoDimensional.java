
package geometry.shapes;

public class TwoDimensional {
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    
    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
    
    public double calculateSquareArea(double side) {
        return side * side;
    }
}