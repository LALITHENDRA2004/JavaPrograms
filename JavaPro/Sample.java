//import java.util.Scanner;
import java.util.Arrays;
public class Sample {
    int instanceVar = 10; 
    static int staticVar = 20; 
    void myInstanceMethod() {
        System.out.println("Hai");
    }
    static void myStaticMethod(){ 
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        // Printing
        System.out.println("Printing : ");   
        System.out.println("Hello");

        // Data types and variables
        System.out.println("\nData types and Variables : ");
        byte myByte = 58; // -2^7 to 2^7 - 1  (8 bits)
        short myShort = 20; // -2^15 to 2^15 - 1 (16 bits)
        int myInteger = 10; // -2^31 to 2^31 - 1 (32 bits)
        long myLong = 20; // -2^63 to 2^63 - 1 (64 bits)
        float myFloat = 1.2f; // -3.4e38 to 3.4e38 (32 bits)
        double myDouble = 1.2344543d; // -1.7e308 to 1.7e308 (64 bits)
        char myChar = 'a'; // (16 bits)
        boolean myBoolean = false;
        System.out.println(myByte + " " + myShort + " " + myInteger + " " + myLong + " " + myFloat + " " + myDouble + " " + myChar + " " + myBoolean);       

        // Constants
        System.out.println("\nConstants : ");
        final float pi = 3.14f;
        // pi += 1.2; // --> not posible
        System.out.println(pi + 1.2f); // possible

        // Identifiers
        System.out.println("\nIdentifiers : ");
        int myVar = 10,_Var = 20,$Var = 30;
        System.out.println(myVar + " " + _Var + " " + $Var);

        // User input
        // First import java.util.Scanner;
        //System.out.println("\nUser input : ");
        // Scanner read = new Scanner(System.in);
        // short shortVar = read.nextShort(); // for short
        // int intVar = read.nextInt(); // for integer
        // float floatVar = read.nextFloat(); // for floating value
        // double doubleVar = read.nextDouble(); // for double value
        // String stringVar1 = read.next(); // strings without spaces
        // String stringVar2 = read.nextLine(); // strings with spaces
        // read.close();
        // System.out.println(shortVar + " " + intVar + " " + floatVar + " " + doubleVar + " " + stringVar1 + " " + stringVar2);

        // Format Specifiers
        System.out.println("\nFormat Specifiers : ");
        int var1 = 10;
        float var2 = 1.2f;
        char var3 = 'a';
        String var4 = "Hello";
        System.out.printf("%010d%n",var1); // 0 -> flag , 10 -> width 
        System.out.printf("%10.2f%n",var2);// .2 -> precision
        System.out.printf("%10c%n",var3); // %n -> new line
        System.out.printf("%10s%n",var4);

        // Operators (Imp)

        // Ternary
        System.out.println("\nTernary Operator : ");
        int a = 10, b = 20; 
        System.out.println(a > b ? a : b);

        // instanceof
        System.out.println("\ninstanceof Operator : ");
        String str = "Hai";
        System.out.println(str instanceof String);

        // Methods in Math class
        System.out.println("\nMethods in Math class : ");
        int v1 = 10, v2 = 20;
        float v3 = 10.2f, v4 = 10.9f;
        System.out.println(Math.max(v1,v2)); // maximum value
        System.out.println(Math.min(v1,v2)); // minimum value
        System.out.println(Math.floor(v4)); // Nearest and smaller value (output : float)
        System.out.println(Math.ceil(v3)); // Nearest and greater value (output : float)
        System.out.println(Math.round(v3)); // Nearest value 
        System.out.println(Math.sqrt(25)); // root value (output : float)
        System.out.println(Math.pow(2,5)); // exponent  (output : float)
        System.out.println(Math.abs(-120)); // Absolute value

        // Taking an integer in the form of binary, octal and hexadecimal
        System.out.println("\nBinary, Octal and Hexadecimal : ");
        int binVar = 0b1101; // (0b for binary)
        int octVar = 0123; // (0 for octal)
        int hexVar = 0xA; // 0x for hexa decimal
        System.out.println(binVar);
        System.out.println(octVar);
        System.out.println(hexVar);

        // Integers to Strings 
        // Integer class belongs to java.lang package (by defaltly imported)
        System.out.println("\nIntegers to Strings : ");
        int i1 = 10;
        System.out.println(Integer.toString(i1)); // in decimal string
        System.out.println(Integer.toString(i1,2)); // in binary string
        System.out.println(Integer.toBinaryString(i1));
        System.out.println(Integer.toString(i1,8)); // in octal string
        System.out.println(Integer.toOctalString(i1));
        System.out.println(Integer.toString(i1,16)); // in hexadecimal string
        System.out.println(Integer.toHexString(i1));

        // Strings to Integers
        System.out.println("\nStrings to Integers : ");
        String s1 = "10";
        System.out.println(Integer.parseInt(s1)); // decimal value of decimal string
        System.out.println(Integer.parseInt(s1,2)); // decimal value of binary string
        System.out.println(Integer.parseInt(s1,8)); // decimal value of octal string
        System.out.println(Integer.parseInt(s1,16)); // decimal value of hexadecimal string


        // Scope of variables
        System.out.println("\nScope of Variables : ");
        int localVariable = 50;  // only can be accessed in this main method 
        System.out.println(localVariable);

        // instance variable -> object should be created
        Sample s = new Sample(); // creation of an instance of Sample class
        System.out.println(s.instanceVar); // accessing instance variable
        s.myInstanceMethod(); // accessing instance method

        // static variable -> no need of object creation
        // Note : see the class 'Sample' (scroll down)
        System.out.println(Sample.staticVar); // accessing the static method by class name
        System.out.println(staticVar); // since the variable is in same class, we don't have the need of using the class name also
        myStaticMethod();

        // Naming conventions

        System.out.println("\nNaming conventions : ");
        int myVariable = 10; // camel case
        s.myInstanceMethod(); // camel case
        String st = "Hai"; // title case
        System.out.println(myVariable + " " + st);

        // Conditionals

        // if, else if, else
        System.out.println("\nConditionals : ");
        int n = 10;
        if(n > 5) {
            System.out.println(true);
        }
        else if(n < 5) {
            System.out.println(false);
        }
        else {
            System.out.println("neither true nor false");
        }

        // switch case
        int x = 3;
        switch(x) 
        {
            case 1:
               System.out.println(1);
               break;
            case 2:
               System.out.println(2);
               break;
            case 3:
               System.out.println(3);
               break;
            default:
               System.out.println("Default");
               break;
        }


        // Looping statements

        // a) while loop
        // b) for loop
        // c) loop control / transfer statements (break, continue)

        
        // Arrays (a class from java.util package) --> import java.util.Arrays;

        System.out.println("\nArrays : ");
        int[] arr1 = {20, 10, 30}; // arr1 < arr2 
        int[] arr2 = {50, 60, 70}; // since arr1[0] itself < arr2[0]
        for(int eachElement : arr1) {
            System.out.print(eachElement + " ");
        }
        System.out.println();

        System.out.println(Arrays.compare(arr1, arr2));
        // p == q -> 0
        // p > q  -> 1
        // p < 1  -> -1
        Arrays.sort(arr1); // sort the array
        System.out.println(Arrays.toString(arr1)); // print the array without a loop
        Arrays.fill(arr1,4); // fills the whole array with 4
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.mismatch(arr1, arr2)); // returns the mismatched index first
        System.out.println(Arrays.equals(arr1, arr2)); // returns whether arr1 == arr2


        // 2-D Arrays
        System.out.println("\n2-D Arrays : "); 
        int[][] twoDArray = new int[2][2];
        for(int i = 0 ; i < 2 ; i++) {
            for(int j = 0 ; j < 2 ; j++) {
                twoDArray[i][j] = 0;
            }
        }

        for(int[] oneDArray : twoDArray) {
            for(int eachElement : oneDArray) {
                System.out.print(eachElement + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(twoDArray)); // to print the twoDArray without loops
        int[][] twoDArray2 = twoDArray.clone();
        twoDArray2[0][1] = 1;

        System.out.println(twoDArray[0][1]); // modifying the twoDArray2 also modifies the twoDArray
        

    }
}