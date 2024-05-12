public class Parsing1 {
    public static void main(String[] args) {
        int a = 12; 
        
        String s1 = Integer.toString(a);
        System.out.println(s1);

        String s2 = Integer.toString(a,2);
        System.out.println(s2);

        String s3 = Integer.toString(a,8);
        System.out.println(s3);

        String s4 = Integer.toString(a,16);
        System.out.println(s4);
    }
}
