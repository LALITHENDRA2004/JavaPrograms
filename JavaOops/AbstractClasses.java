abstract class Animal1 {
    abstract void introduce();
}

class Cat2 extends Animal1 {
    void introduce() {
        System.out.println("Hey, I am a Cat");
    }
}

class Elephant2 extends Animal1 {
    void introduce() {
        System.out.println("Hey, I am an elephant");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Cat2 c1 = new Cat2();
        c1.introduce();
        Elephant2 e1 = new Elephant2();
        e1.introduce();
    }
}