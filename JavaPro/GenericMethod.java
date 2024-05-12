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
public class GenericMethod {
   static <T> void printArray(T[] arr) {
    for(T val : arr) {
        System.out.print(val + " ");
    }
    System.out.println();
   }
    public static void main(String[] args) {

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
