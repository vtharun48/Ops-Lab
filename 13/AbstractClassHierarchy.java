

abstract class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public abstract void makeSound();
    
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

abstract class Mammal extends Animal {
    protected boolean hasFur;
    
    public Mammal(String name, boolean hasFur) {
        super(name);
        this.hasFur = hasFur;
    }
    
    public abstract void move();
    
    public void giveBirth() {
        System.out.println(name + " can give birth to live young");
    }
}

class Dog extends Mammal {
    private String breed;
    
    public Dog(String name, boolean hasFur, String breed) {
        super(name, hasFur);
        this.breed = breed;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " runs on four legs");
    }
    
    public void fetch() {
        System.out.println(name + " is fetching a ball");
    }
    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Has fur: " + (hasFur ? "Yes" : "No"));
    }
}

public class AbstractClassHierarchy {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", true, "Golden Retriever");
        
        System.out.println("Dog details:");
        dog.displayDetails();
        
        System.out.println("\nDog behaviors:");
        dog.makeSound();
        dog.eat();
        dog.sleep();
        dog.move();
        dog.giveBirth();
        dog.fetch();
        

        Animal animal = dog;
        Mammal mammal = dog;
        
        System.out.println("\nUsing polymorphism:");
        animal.makeSound();
        mammal.move();
    }
}