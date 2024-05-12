import java.util.Scanner;
import java.util.Arrays;
public class TwoDArraysReading {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int rows = read.nextInt(); // reading rows
        int columns = read.nextInt(); // reading columns

        // create a 2-D array of rows rows and columns columns
        int[][] arr = new int[rows][columns];
        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < columns ; j++) {
                arr[i][j] = read.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));

        // running a for each loop in the 2-D array
        for (int[] eachArray : arr) {
            for (int eachElement : eachArray) {
                System.out.print(eachElement + " ");
            }
            System.out.println();
        }
        read.close();
    }
}
