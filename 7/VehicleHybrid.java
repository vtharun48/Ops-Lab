
class Vehicle {
    protected String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

class Engine {
    protected String type;
    protected int horsePower;
    
    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }
    
    public void displayEngineInfo() {
        System.out.println("Engine Type: " + type);
        System.out.println("Horsepower: " + horsePower);
    }
}

class Car extends Vehicle {
    protected int doors;
    
    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }
    
    public void displayCarInfo() {
        displayInfo();
        System.out.println("Doors: " + doors);
    }
}

class SportsCar extends Car {
    private Engine engine;
    
    public SportsCar(String brand, int doors, String engineType, int horsePower) {
        super(brand, doors);
        this.engine = new Engine(engineType, horsePower);
    }
    
    public void displayAllInfo() {
        displayCarInfo();
        engine.displayEngineInfo();
    }
}

public class VehicleHybrid {
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar("Ferrari", 2, "V8", 700);
        myCar.displayAllInfo();
    }
}