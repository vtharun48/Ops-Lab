

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
    public void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
    
    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }
    
    public void wagTail() {
        System.out.println("Dog wags tail");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow!");
    }
    
    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }
    
    public void purr() {
        System.out.println("Cat purrs");
    }
}

public class AnimalMethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        System.out.println("Animal behaviors:");
        animal.makeSound();
        animal.eat();
        
        System.out.println("\nDog behaviors:");
        dog.makeSound();
        dog.eat();
        dog.wagTail();
        
        System.out.println("\nCat behaviors:");
        cat.makeSound();
        cat.eat();
        cat.purr();
        

        System.out.println("\nPolymorphic behaviors:");
        Animal animalDog = new Dog();
        Animal animalCat = new Cat();
        
        animalDog.makeSound();  // Calls Dog's makeSound
        animalCat.makeSound();  // Calls Cat's makeSound
    }
}