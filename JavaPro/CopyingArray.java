import java.util.Arrays;
public class CopyingArray {
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        int[] c = a.clone();
        int[] b = a; // here a and b shares same memory location

        a[3] = 50; // 50 is modified in array b also
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // if we do not want to affect the copy of the array, we should use clone() method
        System.out.println(Arrays.toString(c));

        String[] names = {"La","li","th","en","dra"};
        String[] newNames = names.clone(); 
        names[3] = "n";
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(newNames));

        

    }
}
