public class TwoDArrays1 {
    public static void main(String[] args) {
        //                     0             1
        int[][] marks = {{10, 20, 30}, {40, 50, 60}};
        //                 0   1   2     0   1   2

        System.out.println(marks[0][1]);
        System.out.println(marks[1][2]);

        for(int i = 0 ; i < 2 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
