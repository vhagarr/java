abstract class Animal {
    abstract void sound(); 
    public void sleep() {
        System.out.println("Sleeping...");
    }
}
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(); 
        Animal cat = new Cat(); 
        dog.sound(); 
        cat.sound(); 
        dog.sleep(); 
    }
}
