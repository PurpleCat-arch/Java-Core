import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class IOExceptionDemo {
    public static void main(String[] args) {
        String filename = "io_test.txt";

        // Writing to a file
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Line 1: Hello IOException demo\n");
            writer.write("Line 2: Testing IO operations\n");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Reading from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
