import java.util.Scanner;
class Nested{
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          sc.close();
          if(n > 100) {
               if(n % 2 == 0)
                  System.out.println("Number is an even number and it is greater than 100");
               else
                  System.out.println("Number is odd but it is greater than 100");
          }
          else {
              System.out.println("Number is less than 100");
          }
     }
}