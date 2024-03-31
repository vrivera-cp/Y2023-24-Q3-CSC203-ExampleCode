package Module1;

public class For {

    public static void main(String[] args) {
        // For Loop
        for (int i = 1; i < 4; i++) {
            System.out.print(i + ", "); // Output: 1, 2, 3,
        }

        System.out.println(); // Print a new line

        // Enhanced For Loop
        int[] integers = {1, 2, 3}; // An array
        for (int integer : integers) {
            System.out.print(integer + ", "); // Output: 1, 2, 3,
        }
    }

}
