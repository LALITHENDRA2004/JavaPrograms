import java.util.Scanner;
import java.util.Arrays;
class Class{
    static int var1;
}
public class DefaultValues {
    int instanceVariable; // default value 0 is assigned for both instance and static variables
    static int staticVariable1;
    static String staticVariable2; // default value is null since String is a class
    static Scanner sc; // also null
    public static void main(String[] args) {
        int x = 10; // local variable
        System.out.println(x); // default values are not assigned to local variables

        DefaultValues obj = new DefaultValues();
        System.out.println(obj.instanceVariable);
        System.out.println(staticVariable1);
        System.out.println(staticVariable2);
        System.out.println(sc); // there is no need to use class name
        System.out.println(Class.var1); // we should use class name since the variable is in another class

        // Default values in arrays
        int[] arr1 = new int[5]; // an array of 5 zeroes is created
        String[] arr2 = new String[5]; // an array of nulls is created
        boolean[] arr3 = new boolean[5]; // default value is false
        System.out.println(Arrays.toString(arr1)); // an un-initialized array also have default values as 0
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


    }
}
