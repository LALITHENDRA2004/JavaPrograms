public class StringBufferExamples {
    public static void main(String[] args) {
        // StringBuffer and StringBuilder acts as same
        // Difference : StringBuffer -> ThreadSafe , StringBuilder -> StringBuilder

        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb);
        sb.append(123); // appends 123 at the end of hello
        sb.append(1.2); // appends 1.2 at the end of hello123
        sb.setCharAt(0, 'p'); // replaces the char at 0th index with 'p'
        sb.deleteCharAt(0); // removes character at 0th index
        sb.insert(3, 12323);
        sb.insert(1, "pq");
        System.out.println(sb);
        String outputString = new String(sb); // converting StringBuffer to String
        System.out.println(outputString.length());

        StringBuffer s = new StringBuffer("ABC");
        String o = new String(s);
        System.out.println(o);
        s.reverse();
        System.out.println(s);
    }
}
