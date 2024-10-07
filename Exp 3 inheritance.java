class Vehicle {
    String color;
    String model;
    double price;
    public Vehicle(String color, String model, double price) {
        this.color = color;
        this.model = model;
        this.price = price;
    }
    public void showDetails() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
    }
}

class Car extends Vehicle {
    String carType;
    public Car(String color, String model, double price, String carType) {
        super(color, model, price);
        this.carType = carType;
    }
    public void showDetails() {
        super.showDetails(); 
        System.out.println("Car Type: " + carType);
    }
}
class Bike extends Vehicle {
    String bikeType;
    public Bike(String color, String model, double price, String bikeType) {
        super(color, model, price); // Call the constructor of Vehicle
        this.bikeType = bikeType;
    }
    @Override
    public void showDetails() {
        super.showDetails(); // Call the showDetails() from Vehicle
        System.out.println("Bike Type: " + bikeType);
    }
}
public class Hir_Inheritance {
    public static void main(String[] args) {
        Car car = new Car("Red", "Toyota Camry", 30000, "Sedan");
        Bike bike = new Bike("Black", "Yamaha R15", 15000, "Sport");
        System.out.println("Car Details:");
        car.showDetails();
        System.out.println("\nBike Details:");
        bike.showDetails();
    }
}
