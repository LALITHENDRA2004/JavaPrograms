import java.util.Scanner;
class Conditional1 {
    public static void main(String args[]) {
               Scanner sc = new Scanner(System.in);
               int a = sc.nextInt();
               sc.close();
               if(a > 10){
                   System.out.println(a + " is greater than 10");
               }
               else{
                   System.out.println(a + " is less than or equal to 10");
               }

    }
}