import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class q6 {
    public static void main(String[] args) {
        // Provide the path to your text file
        String filePath = "textfile.txt";

        try {
            // Open the file for reading using BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Read each line and display it on the console
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader
            reader.close();
        } catch (IOException e) {
            // Handle IOException, e.g., if the file is not found
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}