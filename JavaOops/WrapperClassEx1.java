class Cat1 {
    String name;
    int age;
    Cat1() {}
    Cat1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "This is " + name + "(" + age + ")"; 
    }
}
public class WrapperClassEx1 {
    static void printArray(Integer[] arr) {
        for(Integer val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void printArray(Character[] arr) {
        for(Character c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    static void printArray(Double[] arr) {
        for(Double d : arr) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    static void printArray(String[] arr) {
        for(String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    static void printArray(Cat1[] cats) {
        for(Cat1 eachCat : cats) {
            System.out.print(eachCat + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a = 10; // primitive data type
        Integer b = 20; // object
        System.out.print(a + " " + b);



        int x = 30;
        // Auto boxing
        Integer y = 40;
        // Auto unboxing
        int z = y;
        System.out.println(x + " " + z);

        // Note:
        // char[] arr = new char[5]; -> A character array
        // Character[] arr1 = new Character[5] -> A wrapper class Array
        char c = 'a';
        Character c1 = 'a';
        System.out.println(c + " " + c1);

        Integer arr[] = {10, 20, 30};
        for(Integer val : arr) {
            System.out.print(val + " ");
        } 
        System.out.println();

        Integer[] arr1 = {10, 20, 30};
        printArray(arr1); // Generic method

        Character[] arr2 = {'a','c','d'};
        printArray(arr2);

        Double[] arr3 = {1.2, 2.4, 3.2};
        printArray(arr3);

        String[] arr4 = {"Hai", "Hello"};
        printArray(arr4);

        Cat1 k1 = new Cat1("Tom", 10);
        System.out.println(k1);

        Cat1[] cats = {new Cat1("Tom", 10), new Cat1("Bob", 4)};
        printArray(cats);

    }
}
