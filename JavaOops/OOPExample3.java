import java.util.Scanner;
class Circle {
    double radius;
    static final double PI = 3.14; // same for all circles --> static
    void printDiameter() {
        System.out.println(2 * radius);
    }
    void printArea() {
        System.out.println(PI * radius * radius);
    }
    void printPerimeter() {
        System.out.println(2 * PI * radius);
    }
}
public class OOPExample3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.print("Enter radius: ");
        c1.radius = read.nextDouble();
        c1.printDiameter();
        c1.printArea();
        c1.printPerimeter();
        read.close();
    }
}
