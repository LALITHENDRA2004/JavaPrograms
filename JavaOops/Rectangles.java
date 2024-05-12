class Rectangle {
    double length;
    double width;
 
    void printArea() {
       System.out.println("Area is: " + length * width);
    }
 
    void printPerimeter() {
       System.out.println("Perimeter is: " + 2. * (length + width));
    }
}
 
public class Rectangles {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.width = 20;
        r1.printArea();
        r1.printPerimeter();
    }
}
