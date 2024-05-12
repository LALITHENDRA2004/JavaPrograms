public class JavaStrings2 {
    public static void main(String[] args) {
        // Character Arrays -> Mutable
        // Ability to be changed even after created
        
        char[] arr = {'h','e','l','l','o'};
        int[] arr1 = {1,2,3,4};
        System.out.println(arr); // can be printed
        System.out.println(arr1); // cant be printed

        // Strings -> Immutable
        // cant be modified / changed once created

        // {"Hello" is stored in String Constant Pole(SCP)}, while creating s2, 
        // it checks whether the value ("Hello") is already present in SCP, so 
        // instead of creating new memory location, single value's memory location is 
        // shared by two variables

        String s1 = "Hello"; 
        String s2 = "Hello"; // both s1 and s2 pointing to memory location
        System.out.println(s1 == s2); // comparision is done based on memory locations

        String s3 = new String("Hello"); // s3 and s4 Stored in Heap
        String s4 = new String("Hello"); // s3 and s4 doesnt point to same memory location
        System.out.println(s3 == s4);

    }
}
