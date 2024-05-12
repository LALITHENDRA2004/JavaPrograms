public class JavaStrings3 {
    public static void main(String[] args) {
        String s = "Hello";
        // Method calls
        // length() -> to get the number of characters
        System.out.println(s.length());
        // charAt(index) -> character at an index
        System.out.println(s.charAt(2));

        // toUpperCase() -> returns a new string where every char is Uppercase
        System.out.println(s.toUpperCase()); 

        // toLowerCase() -> returns a new string where every char is Lowercase
        System.out.println(s.toLowerCase());
        System.out.println(s); // Original string (s) is not modified since it is immutable

        // contains(string) -> check whether a string is present in a string
        System.out.println(s.contains(""+'H')); // only a string can be passed into it not a character

        // indexOf(character) -> returns the index of a character or a string
        System.out.println(s.indexOf("He"));
        
        // lastIndexOf(character) -> returns last occurence of a char or string
        System.out.println(s.lastIndexOf('l')); // last occurence of l

        // startsWith(string) -> returns true or false
        System.out.println(s.startsWith("Hel"));

        // endsWith(string) -> returns true of false
        System.out.println(s.endsWith("llo"));

        System.out.println(s.substring(2)); // substring from 2 to size - 1
        System.out.println(s.substring(1,4)); // from 1 to 3

        String s1 = "Hllla";
        String s2 = "ab";
        System.out.println(s1.compareTo(s2));
        // Compare String -> compareTo()
        // negative -> s1 is less than s2
        // 0 -> s1 is equal to s2
        // positive -> s1 is greater than s2
    }
}
