
package geometry.shapes;

public class ThreeDimensional {
    public double calculateSphereVolume(double radius) {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }
    
    public double calculateCubeVolume(double side) {
        return side * side * side;
    }
    
    public double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
    
    public double calculateConeVolume(double radius, double height) {
        return (1.0/3.0) * Math.PI * radius * radius * height;
    }
}