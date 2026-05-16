import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        // Try-with-resources: resource is auto-closed after try block
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test_output.txt"))) {
            writer.write("Hello from try-with-resources!");
            writer.newLine();
            writer.write("Resource will be auto-closed.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
        // No need for finally block to close the writer

        System.out.println("Writer is automatically closed here.");

        // Custom AutoCloseable resource
        try (MyResource res = new MyResource("DatabaseConnection")) {
            res.doWork();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class MyResource implements AutoCloseable {
    private String name;

    MyResource(String name) {
        this.name = name;
        System.out.println("\n" + name + " opened.");
    }

    void doWork() {
        System.out.println(name + " is doing work...");
    }

    @Override
    public void close() {
        System.out.println(name + " closed automatically.");
    }
}
