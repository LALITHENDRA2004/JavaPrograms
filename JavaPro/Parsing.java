public class Parsing {
    public static void main(String[] args) {
        String s = "10"; 
        
        int i1 = Integer.parseInt(s); // to decimal
        System.out.println(i1);

        int i2 = Integer.parseInt(s,2); // to binary
        System.out.println(i2);

        int i3 = Integer.parseInt(s,8); // to octal
        System.out.println(i3);

        int i4= Integer.parseInt(s,16); // to hexadecimal
        System.out.println(i4);
    }
}
