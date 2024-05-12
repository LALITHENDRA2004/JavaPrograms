import java.util.Arrays;

public class VaryingLengthArrays2 {
    public static void main(String[] args) {
        // arr contains 3 one - d arrays
        int[][] arr = new int[3][]; 
        arr[0] = new int[10]; // arr[0] 10 elements
        arr[1] = new int[5];  // arr[1] 5 elements
        arr[2] = new int[2];  // arr[2] 2 elements

        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr[i].length ; j++) {
                arr[i][j] = 10;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
