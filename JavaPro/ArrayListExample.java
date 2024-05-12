import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList<ReferenceType> name = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        // ArrayList<Cat> cats = new ArrayList<>(); // cats;
        // add() method -> to add new element to arraylist

        arr.add(10); // adds 10 to array
        arr.add(20); // adds 20 to array
        arr.add(30); // adds 30 to array
        arr.add(40); // adds 40 to array
        System.out.println(arr);
        // get(index) method -> to access an element at index

        System.out.println(arr.get(0)); // element at 0th index
        System.out.println(arr.get(1));
        // to check lenth of array list -> size()
        System.out.println(arr.size());
        // add()
        arr.add(0, 20); // adds 20 at 0th index
        System.out.println(arr);

        // set(ind, element) // replace element at index with ind
        arr.set(3,100);
        System.out.println(arr);

        // remove()
        // arr.remove(100); // index (creates an error)

        Integer n = 100; // to remove the value it should be converted into an object
        arr.remove(n); // object
        System.out.println(arr);

    }
}