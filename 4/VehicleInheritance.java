

class Vehicle {
    private String brand;
    private String model;
    private int year;
    
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    
    public void startEngine() {
        System.out.println("Vehicle engine started");
    }
}

class Car extends Vehicle {
    private int numDoors;
    private String fuelType;
    
    public Car(String brand, String model, int year, int numDoors, String fuelType) {
        super(brand, model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
        System.out.println("Fuel type: " + fuelType);
    }
    
    public void honk() {
        System.out.println("Car horn honking!");
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2024, 4, "Hybrid");
        System.out.println("Car Details:");
        myCar.displayInfo();
        myCar.startEngine();
        myCar.honk();
    }
}