public class IntegerLiteral {
    public static void main(String[] args) {
        int intVar1 = 123;
        System.out.println(intVar1);

        int intVar2 = 0b1100;  // 0b -> prefix -> binary literal
        System.out.println(intVar2); // converts binary to decimal

        int intVar3 = 0123; // 0 -> prefix -> octal representation (base 8)
        System.out.println(intVar3); // conversts octal to decimal
        
        int intVar4 = 0xA; // 0x -> prefix -> hexadecimal
        System.out.println(intVar4); // converts hexadecimal to decimal
    }
}
