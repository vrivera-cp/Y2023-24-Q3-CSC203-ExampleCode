package Module1;

public class While {

    public static void main(String[] args) {
        // While Loop
        int i = 0;
        while (i <= 5) {
            System.out.println(i); // Outputs 0 - 5, inclusive
            i++; // Increment Operator
        }

        // Do-While Loop
        int j = 5;
        do {
            System.out.println(j); // Outputs 5 - 0, inclusive
            j--; // Decrement Operator
        } while (j >= 0);
    }

}
