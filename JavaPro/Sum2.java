import java.util.Scanner;
class Sum2
{
     public static void main(String[] args)
     {
           Scanner sc = new Scanner(System.in); //creating an object of Scanner class
           System.out.println("Enter a and b values :");
           int a = sc.nextInt(); // using nextInt method from Scanner class using an object
           int b = sc.nextInt();
           sc.close();
           System.out.println("Sum of "+ a +" and "+ b +" is " + (a+b));

     }
}