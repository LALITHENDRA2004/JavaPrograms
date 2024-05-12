class Cat {
    String name;
    int age;
}
public class Cats {
    static void change(Cat c) {
        c.name = "xyz";
    }
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.name = "abc";
        Cat c2 = c1;
        System.out.println(c1 + " " + c2); // both the objects are pointing to the same memory location
        change(c1);
        System.out.println(c1.name + " " + c2.name); // value of c1.name and c2.name is changed
    }
}
