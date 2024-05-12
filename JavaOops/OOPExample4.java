class Cat {
    String name;
    int age;
}
public class OOPExample4 {
    static void change(Cat c) {
        c.name = "Bob";
    }
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.name = "Kitty";
        Cat c2 = c1;
        System.out.println(c1 + " " + c2); // both are sharing same memory location

        c2.name = "Tom";
        System.out.println(c1.name); // modifying c2.name changes the value of c1.name also

        change(c1);
        System.out.println(c1.name); // changing the value by sending a reference of an object
    }
}
