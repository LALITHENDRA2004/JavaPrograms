class Cat {
    String name;
    int age;
    Cat(String n, int a) {
        name = n;
        age = a;
    }
    public String toString() {
        return "[" + name + "," + age + "]";
    }
}
public class UsageOfToString {
    public static void main(String[] args) {
        Cat c1 = new Cat("Alice", 7);
        System.out.println(c1);
        Cat c2 = new Cat("Bob", 4);
        System.out.println(c2);
    }
}
