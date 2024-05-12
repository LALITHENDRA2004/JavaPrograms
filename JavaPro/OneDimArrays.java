import java.util.Scanner;
public class OneDimArrays {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = read.nextInt();
        }
    
        for(int i = 0 ; i < n ; i++) {
            System.out.println(arr[i] + " ");
        }

        for(int var : arr) {
            System.out.println(var + " ");
        }
        read.close();
    }
}
