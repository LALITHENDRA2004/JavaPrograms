class Circle {
    double radius;
    final double PI = 3.14;
 
    void printDiameter() {
       System.out.println(2 * radius);
    }
 
    void printArea() {
       System.out.println(PI * radius * radius);
    }
 
    void printPerimeter() {
       System.out.println(2 * PI * this.radius);
    }
}
class Circles {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 10;
        c1.printArea();
        c1.printDiameter();
        c1.printPerimeter();
    }
}
 