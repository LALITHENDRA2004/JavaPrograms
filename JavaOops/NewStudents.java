class NewStudent {
    String name;
    int age;
    String college;
 
    NewStudent() {
       System.out.println("Default Constructor");
    }
 
    NewStudent(String name) {
       System.out.println("Parameterised Constructor 1 " + name);
    }
 
    NewStudent(String n, int a, String c) {
       System.out.println("Parameterised Constructor 2 " + n + " " + a + " " + c);
    }
} 
public class NewStudents {
    public static void main(String[] args) {
        NewStudent s1 = new NewStudent();
        NewStudent s2 = new NewStudent("Lalithendra");
        NewStudent s3 = new NewStudent("Lalithendra", 19, "ACET");

        System.out.println(s1.name + s2.name + s3.name);
        
    }
}
