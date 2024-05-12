class MethodOverloading2 {
    static void max(int a, int b) {
        System.out.println(a > b ? a : b);
    }

    static void max(int a, int b, int c) {
        if(a > b && a > c) System.out.println(a);
        else if(b > a && b > c) System.out.println(b);
        else System.out.println(c);
    }

    static void max(int[] arr,int size) {
        int mx = arr[0];
        for(int i = 1 ; i < size ; i++) {
            if(arr[i] > mx) mx = arr[i];
        }
        System.out.println(mx);
    }
    public static void main(String[] args) {
        max(10, 20);
        max(10, 20, 30);
        max(new int[]{10,20,30,40},4);
    }
}