public class MethodOverloading1 {
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static void add(double a, double b) {
        System.out.println(a + b);
    }

    static void add(int[] arr, int size) {
        int sum = 0;
        for(int element : arr) {
            sum += element;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        add(10, 20);
        add(10, 20, 30);
        add(1.2, 2.3);
        int[] arr = {10, 20, 30};
        add(arr,3);
    }
}
