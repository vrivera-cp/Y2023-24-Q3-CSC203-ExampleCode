package Module1;

public class Conditionals {

    public static void main(String[] args) {
        // Conditionals
        if (100 < 10) {
            System.out.println("a");
        } else if (100 < 1000) {
            System.out.println("b"); // Printed
        } else {
            System.out.println("c");
        }

        // Ternary Operator
        char result = 100 == 10 ? 'a' : 'b'; // false, so assigned 'b'
        System.out.println(result); // Output: b
    }

}
