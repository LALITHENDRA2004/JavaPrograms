import java.util.Arrays;
public class CharArraytoStringandViceVersa {
    public static void main(String[] args) {
        // convert a String to a character Array
        // convert a character array to String
        String s = "hello";

        // convert to a charArray
        char[] arr = s.toCharArray();

        // Sort using Arrays.sort();
        Arrays.sort(arr); // arr = {'e','h','l','l','o'}
        
        // Convert the character back to a String
        // new String(charArray)
        System.out.println(arr); // if a char array is sent, a string is printed joining all the chars
        System.out.println(Arrays.toString(arr));

        String sortedString = new String(arr); // a string is created joing all chars
        System.out.println(sortedString);
    }
}
