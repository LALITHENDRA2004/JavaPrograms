class Student {
    int id;
    String name;
    String branch;
    String college;
    double cgpa;

    void setValues(int i, String n, String b, String c, double d) {
        id = i;
        name = n;
        branch = b;
        college = c;
        cgpa = d;
    }
    void getValues() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("College: " + college);
        System.out.println("CGPA: " + cgpa);
    }
}
public class JavaSettersExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setValues(1, "Lalithendra", "cse", "acet", 9.0);
        s1.getValues();

    }
}
