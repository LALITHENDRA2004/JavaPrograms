public class LocalVariables {
    static void myMethod1() {
        int a = 10; // local variables
        System.out.println(a);
    }

    static void myMethod2() {
        int b = 20;
        System.out.println(b);
    }

    public static void main(String args[]) {
        int c = 30;
        System.out.println(c);
        myMethod1(); // static method
        myMethod2(); // static method
    }
}
