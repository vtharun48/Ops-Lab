
class Animal {
    protected String species;
    protected String habitat;
    
    public Animal(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
    }
    
    public void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Habitat: " + habitat);
    }
    
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Mammal extends Animal {
    protected boolean hasFur;
    protected int limbCount;
    
    public Mammal(String species, String habitat, boolean hasFur, int limbCount) {
        super(species, habitat);
        this.hasFur = hasFur;
        this.limbCount = limbCount;
    }
    
    public void displayMammalInfo() {
        displayInfo();
        System.out.println("Has fur: " + (hasFur ? "Yes" : "No"));
        System.out.println("Number of limbs: " + limbCount);
    }
    
    public void feedMilk() {
        System.out.println("This mammal can feed its young with milk");
    }
}

class Dog extends Mammal {
    private String breed;
    private String color;
    
    public Dog(String habitat, boolean hasFur, int limbCount, String breed, String color) {
        super("Canis familiaris", habitat, hasFur, limbCount);
        this.breed = breed;
        this.color = color;
    }
    
    public void displayDogInfo() {
        displayMammalInfo();
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
    
    public void wagTail() {
        System.out.println("The dog wags its tail happily");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        System.out.println("Creating a basic Animal:");
        Animal animal = new Animal("Generic Animal", "Various");
        animal.displayInfo();
        animal.makeSound();
        
        System.out.println("\nCreating a Mammal:");
        Mammal mammal = new Mammal("Generic Mammal", "Land", true, 4);
        mammal.displayMammalInfo();
        mammal.makeSound();
        mammal.feedMilk();
        
        System.out.println("\nCreating a Dog:");
        Dog dog = new Dog("Domestic", true, 4, "Golden Retriever", "Golden");
        dog.displayDogInfo();
        dog.makeSound();
        dog.feedMilk();
        dog.wagTail();
    }
}