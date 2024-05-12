import java.util.*;
public class ArrayMethods {
    public static void main(String[] args) {
        int[] A = {9, 1, 40, -2, 26, 98};

        // print the array in the form of a list
        System.out.println(Arrays.toString(A)); 

        // sorting the array from index 3 to 5
        Arrays.sort(A,3,6);
        System.out.println(Arrays.toString(A));

        // sorting the whole array in place
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));


        // filling the whole array with a value
        int x[] = new int[10];
        Arrays.fill(x, -1); 
        System.out.println(Arrays.toString(x));

        // compare(p,q) -> to compare two arrays
        // 0 --> p == q
        // 1 --> p > q
        // -1 --> p < q
        int[] p = {10, 20, 15, 40};
        int[] q = {10, 20, 30, 40};
        System.out.println(Arrays.compare(p, q));

        // Arrays.mismathch(a, b) -> returns the mismatched index first;
        System.out.println(Arrays.mismatch(p, q));

        // equals()
        // true / false
        System.out.println(Arrays.equals(p, q));

    }
}
