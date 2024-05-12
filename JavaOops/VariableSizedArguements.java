public class VariableSizedArguements {
    static void add(int ... elements) {
        int sum = 0;
        for(int i = 0 ; i < elements.length ; i++) {
            sum += elements[i];
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        add(10, 20);
        add(10, 20, 30);
        add(10, 20, 30, 40);
        add(10, 20, 30, 40, 50);
    }
}
