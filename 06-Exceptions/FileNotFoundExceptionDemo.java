import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionDemo {
    public static void main(String[] args) {
        String[] files = {"existing_test.txt", "nonexistent.txt", "another_missing.txt"};

        for (String filename : files) {
            try {
                readFile(filename);
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + filename);
            } catch (IOException e) {
                System.out.println("IO error reading: " + filename);
            }
        }
    }

    static void readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        System.out.println("First line of " + filename + ": " + line);
        reader.close();
    }
}
