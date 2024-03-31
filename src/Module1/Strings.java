package Module1;

public class Strings {
    public static void main(String[] args) {
        // A String Object and Methods
        String s = "Hello";
        int size = s.length(); // 5
        char last = s.charAt(4); // 'o'

        // String Equality
        String s2 = new String("Hello"); // Instantiation
        boolean equals_operator = s == s2; // false
        boolean equals_method = s.equals(s2); // true
        System.out.println(equals_operator + " " + equals_method);

    }
}
