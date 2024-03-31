package Module1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

    public static void main(String[] args) {
        try {
            // Create a BufferedWriter object
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("datafiles/module1_out.txt"));

            // Write some data to the file
            bufferedWriter.write("Hello Mochi!");
            bufferedWriter.newLine(); // Add a new line
            bufferedWriter.write("Hello Harvest!\n");
            bufferedWriter.write("Hello Pearl!\n");

            // Flush and close the writer
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}