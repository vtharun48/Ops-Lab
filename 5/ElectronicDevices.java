

class ElectronicDevice {
    protected String brand;
    protected double price;
    protected boolean isPoweredOn;
    
    public ElectronicDevice(String brand, double price) {
        this.brand = brand;
        this.price = price;
        this.isPoweredOn = false;
    }
    
    public void powerOn() {
        isPoweredOn = true;
        System.out.println("Device powered on");
    }
    
    public void powerOff() {
        isPoweredOn = false;
        System.out.println("Device powered off");
    }
    
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Power status: " + (isPoweredOn ? "On" : "Off"));
    }
}

class Computer extends ElectronicDevice {
    protected String processor;
    protected int ramGB;
    protected int storageGB;
    
    public Computer(String brand, double price, String processor, int ramGB, int storageGB) {
        super(brand, price);
        this.processor = processor;
        this.ramGB = ramGB;
        this.storageGB = storageGB;
    }
    
    public void displayComputerDetails() {
        displayDetails();
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("Storage: " + storageGB + " GB");
    }
    
    public void runProgram(String programName) {
        if (isPoweredOn) {
            System.out.println("Running " + programName + "...");
        } else {
            System.out.println("Cannot run program. Computer is powered off.");
        }
    }
}

class Laptop extends Computer {
    private double screenSize;
    private double batteryLife;
    private double weightKg;
    
    public Laptop(String brand, double price, String processor, int ramGB, int storageGB,
                 double screenSize, double batteryLife, double weightKg) {
        super(brand, price, processor, ramGB, storageGB);
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
        this.weightKg = weightKg;
    }
    
    public void displayLaptopDetails() {
        displayComputerDetails();
        System.out.println("Screen size: " + screenSize + " inches");
        System.out.println("Battery life: " + batteryLife + " hours");
        System.out.println("Weight: " + weightKg + " kg");
    }
    
    public void openLid() {
        System.out.println("Laptop lid opened");
    }
    
    public void closeLid() {
        System.out.println("Laptop lid closed, entering sleep mode");
    }
}

public class ElectronicDevices {
    public static void main(String[] args) {
        System.out.println("Basic Electronic Device:");
        ElectronicDevice device = new ElectronicDevice("Generic", 99.99);
        device.displayDetails();
        device.powerOn();
        device.displayDetails();
        
        System.out.println("\nComputer:");
        Computer computer = new Computer("Dell", 799.99, "Intel i5", 8, 512);
        computer.displayComputerDetails();
        computer.powerOn();
        computer.runProgram("Microsoft Word");
        
        System.out.println("\nLaptop:");
        Laptop laptop = new Laptop("HP", 1299.99, "Intel i7", 16, 1024, 15.6, 8.5, 1.8);
        laptop.displayLaptopDetails();
        laptop.openLid();
        laptop.powerOn();
        laptop.runProgram("Chrome Browser");
        laptop.closeLid();
        laptop.powerOff();
    }
}