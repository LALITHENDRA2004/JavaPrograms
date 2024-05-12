
class Person {
    // member variables / attributes
    String name; // non-static / instance member
    int age; // non-static / instance member

    // non-static / instance method
    void printDetails() {
        System.out.println("My name is :" + name + " and I am " + age + " years old");
    }
}

public class OOPExample1 {
    public static void main(String[] args) {
        Person p1 = new Person(); // creating an object of class Person
        p1.name = "Harry";
        p1.age = 18;
        System.out.println(p1.age); // 0 -> default
        System.out.println(p1.name); // null -> String
    }
}


