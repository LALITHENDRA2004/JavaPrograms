class Student {
    int id;
    String name;
    String branch;
    String college;
    double cgpa;

    // setter method
    void setValues(int i, String n, String b, String c, double cg) {
       id = i;
       name = n;
       branch = b;
       college = c;
       cgpa = cg;
    }

    // getter method
    void getValues() {
       System.out.println("Id: " + id);
       System.out.println("Name: " + name);
       System.out.println("Branch: " + branch);
       System.out.println("College: " + college);
       System.out.println("CGPA: " + cgpa);
    }
}
 
public class Students {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setValues(525,"Lalithendra", "CSE", "ACET", 9.0);
        s1.getValues();
    }
}
