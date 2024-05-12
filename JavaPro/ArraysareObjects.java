import java.util.Scanner;;
public class ArraysareObjects {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // Arrays are objects
        // Belong to object clas.lang packas not only this array every class is a sub class of object class
        // object class belong to javage
        Scanner read = new Scanner(System.in);
        System.out.println(read instanceof Scanner);
        System.out.println(read instanceof Object);
        System.out.println(arr instanceof Object);
        read.close();
    }
}
