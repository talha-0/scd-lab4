import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class q7 {
    public static void main(String[] args) {
        // Provide the path to your text file
        String filePath = "textfile.txt";

        try {
            int wordCount = 0;
            // Open the file for reading using BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Read each line and display it on the console
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                wordCount += words.length;
            }

            // Close the BufferedReader
            reader.close();
            System.out.println("Number of words in the file: " + wordCount);
        } catch (IOException e) {
            // Handle IOException, e.g., if the file is not found
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}