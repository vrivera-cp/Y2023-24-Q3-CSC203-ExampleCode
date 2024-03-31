package Module1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileParsing {
    public static void main(String[] args) {
        try {
            // Create BufferedReader and FileReader objects
            BufferedReader reader = new BufferedReader(new FileReader("datafiles/module1_in.txt"));

            // Read the file line by line
            String line;
            while (reader.ready()) {
                line = reader.readLine();
                String[] parsed = line.split("\\s+"); // Split on contiguous whitespace
                System.out.println(Arrays.toString(parsed)); // Print the array
            }

            // Close the reader
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
