public class Car {
    // Instance variables
    private String make;
    private String model;
    private int year;

    // Default Constructor
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Parameterized Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Copy Constructor
    public Car(Car anotherCar) {
        this.make = anotherCar.make;
        this.model = anotherCar.model;
        this.year = anotherCar.year;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        // Using the default constructor
        Car car1 = new Car();
        car1.displayInfo();

        System.out.println();

        // Using the parameterized constructor
        Car car2 = new Car("Toyota", "Camry", 2021);
        car2.displayInfo();

        System.out.println();

        // Using the copy constructor
        Car car3 = new Car(car2);
        car3.displayInfo();
    }
}
