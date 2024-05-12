import java.util.Scanner;
class IsInstance
   {
        public static void main(String args[])
        { 
            IsInstance d = new IsInstance();
            System.out.println(d instanceof IsInstance);
            Scanner sc = new Scanner(System.in);
            sc.close();
            System.out.println(sc instanceof Scanner);
        }
   }



