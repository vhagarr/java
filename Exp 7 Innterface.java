// Define the Animal interface
interface Animal {
    void sound();      // Method to define sound made by the animal
    void eat();        // Method to define what the animal eats
}

// Implement the Animal interface in Dog class
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats meat.");
    }
}

// Implement the Animal interface in Cat class
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }
}

// Implement the Animal interface in Bird class
class Bird implements Animal {
    @Override
    public void sound() {
        System.out.println("Chirp");
    }

    @Override
    public void eat() {
        System.out.println("Bird eats seeds.");
    }
}

// Main class to demonstrate the interface
public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();  // Create a Dog object
        Animal cat = new Cat();   // Create a Cat object
        Animal bird = new Bird();  // Create a Bird object

        // Demonstrate polymorphism
        Animal[] animals = {dog, cat, bird};

        for (Animal animal : animals) {
            animal.sound();  // Call the sound method
            animal.eat();    // Call the eat method
            System.out.println(); // For better readability
        }
    }
}
