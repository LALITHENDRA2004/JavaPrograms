class Person {
    String name;
    int age;
 
    void printDetails() {
       System.out.println("My name is :" + name + " and I am " + age + " years old");
    }
}

public class Persons {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Lalithendra";
        p1.age = 19;
        p1.printDetails();
    }
}
 