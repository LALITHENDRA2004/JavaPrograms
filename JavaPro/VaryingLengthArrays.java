public class VaryingLengthArrays {
    public static void main(String[] args) {
        // Arrays of varying lengths
        int[][] arr = {{10,20},{30,50,40},{50,60,70,80}};
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}
