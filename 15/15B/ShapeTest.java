
import geometry.shapes.TwoDimensional;
import geometry.shapes.ThreeDimensional;

public class ShapeTest {
    public static void main(String[] args) {
        TwoDimensional shapes2D = new TwoDimensional();
        ThreeDimensional shapes3D = new ThreeDimensional();
        
   
        System.out.println("Areas of 2D Shapes:");
        System.out.println("Circle (r=5): " + shapes2D.calculateCircleArea(5));
        System.out.println("Rectangle (l=4, w=6): " + shapes2D.calculateRectangleArea(4, 6));
        System.out.println("Triangle (b=6, h=8): " + shapes2D.calculateTriangleArea(6, 8));
        System.out.println("Square (s=5): " + shapes2D.calculateSquareArea(5));
        

        System.out.println("\nVolumes of 3D Shapes:");
        System.out.println("Sphere (r=4): " + shapes3D.calculateSphereVolume(4));
        System.out.println("Cube (s=5): " + shapes3D.calculateCubeVolume(5));
        System.out.println("Cylinder (r=3, h=7): " + shapes3D.calculateCylinderVolume(3, 7));
        System.out.println("Cone (r=3, h=9): " + shapes3D.calculateConeVolume(3, 9));
    }
}