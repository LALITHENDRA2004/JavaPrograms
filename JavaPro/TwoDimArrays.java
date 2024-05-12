import java.util.Arrays;
public class TwoDimArrays {
    public static void main(String[] args) {
        // Running a for each loop on 2 - dimensional Array
        String[][] characters= {{"naruto","minato","khushina"},
                                {"sasuke","itachi","madara"},
                                {"kakashi","kurama","sakura"}};

        for(String[] eachSeries : characters) {
            for(String eachCharacter : eachSeries) {
                System.out.print(eachCharacter + " ");
            }
            System.out.println();
        }

        // to print a 2-d array at once
        System.out.println(Arrays.deepToString(characters)); 
    }
}
