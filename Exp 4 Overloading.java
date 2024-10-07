Input:-
class Shape {
    public Shape(double radius) {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
    public Shape(int length, int breadth) {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
    public Shape(int side, boolean isCube) {
        if (isCube) System.out.println("Cube Volume: " + (side * side * side));
    }
}
public class Main {
    public static void main(String[] args) {
        new Shape(5.0);        // Circle
        new Shape(4, 6);       // Rectangle
        new Shape(3, true);    // Cube
    }
}
