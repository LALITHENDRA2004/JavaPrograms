public class UserDefinedMethods {
    static void sayHello() {
        System.out.println("Hello All");
    }

    static boolean isFactor(int a,int b) {
        return a % b == 0;
    }
    public static void main(String args[]) {
        sayHello(); // since it is static, we can access it without creating an object
        boolean x = isFactor(10,5); // since the main method and the user defined methods are in the same class, we can access the methods directly without using the class name also
        System.out.println(x);
    }
}
