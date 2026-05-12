import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
        // --- Checked Exception ---
        // Must be handled at compile time with try-catch or throws
        System.out.println("=== Checked Exception (FileNotFoundException) ===");
        try {
            FileReader reader = new FileReader("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName());
            System.out.println("Must be caught or declared in throws clause.");
        }

        // --- Unchecked Exception ---
        // Occurs at runtime, not required to be caught
        System.out.println("\n=== Unchecked Exception (ArithmeticException) ===");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName());
            System.out.println("Not required to be caught, but good practice.");
        }

        System.out.println("\n--- Exception Hierarchy ---");
        System.out.println("Throwable");
        System.out.println("  ├── Error (unchecked)");
        System.out.println("  └── Exception (checked)");
        System.out.println("        └── RuntimeException (unchecked)");
    }
}
