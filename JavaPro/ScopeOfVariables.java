class Student {
    // instance variables 
    // (only come into life when an instance is created i.e, these belongs to objects)
    int age;
    String name;
    String rollNumber; 

    // class variable -> these can be accessed directly by the classname, also by an object
    // use of static -> even we create 100 instances it takes up space for space required for one instance only
    static String collegeName = "AEC"; 

    // instance method -> only comes into life when an instance is created
    void printDetails() { 
        System.out.println(age + " " + name + " " + rollNumber);
    }

    // static method -> can be accessed usign classname or object of that class
    static void printCollegeName() { 
        System.out.println(collegeName);
    }

}

public class ScopeOfVariables {
    public static void main(String[] args) {
        // creating an instance of Student class 
        // memory is allocated for each instance created while using new keyword

        // accessing static variable (can be accessed by using className)
        System.out.println(Student.collegeName);

        // static variables can also be accessed using object
        // System.out.println(s1.collegeName);

    } 
}
