

class Box {
    private double width;
    private double height;
    private double depth;
    

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    

    public Box() {
        width = height = depth = 1; // Default is a 1x1x1 cube
    }
    

    public Box(double side) {
        width = height = depth = side; // All dimensions are the same
    }

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.depth = box.depth;
    }
    

    public double calculateVolume() {
        return width * height * depth;
    }
    

    public void displayBox() {
        System.out.println("Dimensions: " + width + " x " + height + " x " + depth);
        System.out.println("Volume: " + calculateVolume());
    }
}

public class BoxConstructorOverloading {
    public static void main(String[] args) {
        // Creating boxes using different constructors
        Box box1 = new Box(10, 20, 30);
        Box box2 = new Box();
        Box box3 = new Box(7);
        Box box4 = new Box(box1);
        
        System.out.println("Box 1:");
        box1.displayBox();
        
        System.out.println("\nBox 2:");
        box2.displayBox();
        
        System.out.println("\nBox 3:");
        box3.displayBox();
        
        System.out.println("\nBox 4 (copy of Box 1):");
        box4.displayBox();
    }
}