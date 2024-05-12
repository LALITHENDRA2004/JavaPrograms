public class MethodsInCharacterClass {
    public static void main(String[] args) {
        // Character class belong to java.lang package, so we do not need to import it
        // string s = "" , charc = '' string cant hold char and vice versa
        
        String s = "" + 'c'; // to change char to string
        System.out.println(s);
        System.out.println(Character.toString('z')); // "z" , also to change char to string
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isAlphabetic('x'));
        System.out.println(Character.isAlphabetic('9'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('$'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit(9));
    }
}
