

interface Vehicle {
    void start();
    void stop();
    

    default void honk() {
        System.out.println("Honk! Honk!");
    }
}

class Car implements Vehicle {
    private String brand;
    
    public Car(String brand) {
        this.brand = brand;
    }
    
    @Override
    public void start() {
        System.out.println(brand + " car starting");
    }
    
    @Override
    public void stop() {
        System.out.println(brand + " car stopping");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle starting to move");
    }
    
    @Override
    public void stop() {
        System.out.println("Bicycle stopped");
    }
    

    @Override
    public void honk() {
        System.out.println("Ring! Ring! Bicycle bell");
    }
}

public class DefaultMethodInterface {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bicycle = new Bicycle();
        
        car.start();
        car.honk();  
        car.stop();
        
        System.out.println();
        
        bicycle.start();
        bicycle.honk();  
        bicycle.stop();
    }
}