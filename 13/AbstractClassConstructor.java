
abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        System.out.println("Vehicle constructor called");
    }
    
    public abstract void start();
    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    private int numDoors;
    
    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year); // Call to abstract class constructor
        this.numDoors = numDoors;
        System.out.println("Car constructor called");
    }
    
    @Override
    public void start() {
        System.out.println("Insert key and turn ignition");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    
    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
        System.out.println("Motorcycle constructor called");
    }
    
    @Override
    public void start() {
        System.out.println("Push button to start engine");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

public class AbstractClassConstructor {
    public static void main(String[] args) {
        System.out.println("Creating a car:");
        Car car = new Car("Toyota", "Camry", 2023, 4);
        
        System.out.println("\nCreating a motorcycle:");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2023, false);
        
        System.out.println("\nCar details:");
        car.displayInfo();
        car.start();
        
        System.out.println("\nMotorcycle details:");
        motorcycle.displayInfo();
        motorcycle.start();
    }
}