public class CommandLineArgs {
    public static void main(String[] args) {
        // use commands to run this program
        // javac filename.java -> to compile
        // java classname arguements -> to run
        System.out.println(args.length);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a * b);
    }
}
