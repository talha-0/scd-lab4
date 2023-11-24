import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class q9 {
    public static void main(String[] args) {
        String filePath = "textfile.txt";
        String newFilePath = "newtextfile.txt";

        String targetWord = "text";
        String replacementWord = "THE";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(newFilePath));
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(targetWord, replacementWord);
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}