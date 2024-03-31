package Module1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        // Arrays
        int[] arr = {1, 2, 3};
        System.out.println(arr[2]); // Output: 3

        // ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1); // Lists are objects with methods
        al.add(2);
        al.add(3);
        System.out.println(al.get(2)); // Output: 3

        // Linked List
        LinkedList<Double> ll = new LinkedList<>();
        ll.add(1.0);
        ll.add(2.0);
        ll.add(3.0);
        System.out.println(ll.get(2)); // Output: 3.0

        // Initialization using the static 'List.of()'
        ArrayList<Integer> a = new ArrayList<>(List.of(1, 2, 3));
        LinkedList<Double> b = new LinkedList<>(List.of(1., 2., 3.));

        System.out.println(a); // Output: [1, 2, 3]
        System.out.println(b); // Output: [1.0, 2.0, 3.0]

        // The List Type
        List<Character> c = new ArrayList<>();
        List<String> d = new LinkedList<>();
        c.add('c');
        d.add("d");
        System.out.println(c); // Output: [c]
        System.out.println(d); // Output: [d]
    }

}
