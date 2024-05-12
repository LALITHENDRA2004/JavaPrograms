class Student {
    String name;
    int age;
    String branch;
    String college;
    double cgpa;
    // default constructor
    Student() {
        System.out.println("Hey I am invoked...");
    }
    Student(String n, int a, String b, String c, double cg) {
        name = n;
        age = a;
        branch = b;
        college = c;
        cgpa = cg;
    }
}
public class Constrctor {
    public static void main(String[] args) {
        Student s1 = new Student("Lalith", 19,"CSE", "ACET", 9.0);
        System.out.println(s1.name);
        Student s2 = new Student();
        System.out.println(s2.age);
    }
}
