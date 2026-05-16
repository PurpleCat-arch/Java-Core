import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class UnsupportedOperationDemo {
    public static void main(String[] args) {
        // Arrays.asList returns a fixed-size list
        List<String> fixedList = Arrays.asList("A", "B", "C");
        System.out.println("Fixed-size list: " + fixedList);

        try {
            fixedList.add("D"); // Cannot add to fixed-size list
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot add to Arrays.asList() result: " + e);
        }

        // Unmodifiable list
        List<String> unmodifiable = Collections.unmodifiableList(Arrays.asList("X", "Y", "Z"));
        System.out.println("\nUnmodifiable list: " + unmodifiable);

        try {
            unmodifiable.set(0, "Modified");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify unmodifiable list: " + e);
        }

        try {
            unmodifiable.remove(0);
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot remove from unmodifiable list: " + e);
        }
    }
}
