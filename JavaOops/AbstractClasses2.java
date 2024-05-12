import java.util.Scanner;

abstract class Shape{
    double area;
    abstract void takeInput();
    abstract void calculateArea();
    void displayArea(){
        System.out.println(area);
    };
}

class Square extends Shape{
    double side;
    void takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side value: ");
        side = sc.nextDouble();
    }
    void calculateArea(){
        area = side * side;
    }
   void displayArea(){
       System.out.println("Area of the Square:"+area);
   }
}

class Rectangle extends Shape{
    double len, wid;
    @Override
    void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter len and wid of the Rectangle: ");
        len = sc.nextDouble();
        wid = sc.nextDouble();
        sc.close();
    }
    @Override
    void calculateArea() {
        area = len * wid;
    }
    // @Override
   void displayArea() {
       System.out.println("Area of the Rectangle:"+area);
   }
}
public class AbstractClasses2 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.takeInput();
        sq.calculateArea();
        sq.displayArea();
        Rectangle rec = new Rectangle();
        rec.takeInput();
        rec.calculateArea();
        rec.displayArea();
    }
}
