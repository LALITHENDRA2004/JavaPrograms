class Rectangle {
    double length, width; // 2 member variables
    // 2 member functions
    void printArea() {
        System.out.println("Area is: " + length * width);
    }

    void printPerimeter() {
        System.out.println("Perimeter is: " + 2 * (length + width));
    }

}
public class OOPExample2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.width = 5.4;
        r1.length = 2.2;
        r1.printArea();
        r1.printPerimeter();
        Rectangle r2 = new Rectangle();
        r2.width = 10.2;
        r2.length = 6.7;
        r2.printPerimeter();
        r2.printArea();
    }
}
