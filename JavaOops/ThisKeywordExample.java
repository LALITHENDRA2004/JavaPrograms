public class ThisKeywordExample {
    String name;
    int age;
    String campus;
    String branch;
    ThisKeywordExample(String name) {
        this.name = name;
        System.out.println(name);
    }
    ThisKeywordExample(String name, int age) {
        this(name);
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }
    ThisKeywordExample(String name, int age, String campus) {
        this(name, age);
        this.name = name;
        this.age = age;
        this.campus = campus;
        System.out.println(name + " " + age + " " + campus);
    }
    
    public static void main(String args[]) {
        ThisKeywordExample tk1 = new ThisKeywordExample("Lalithendra");
        ThisKeywordExample tk2 = new ThisKeywordExample("Lalithendra",19);
        ThisKeywordExample tk3 = new ThisKeywordExample("Lalithendra",19,"ACET");

        System.out.println(tk1.name + " " + tk2.name + " " + tk3.name);
    }
}