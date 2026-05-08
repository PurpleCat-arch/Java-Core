import java.util.Arrays;
import java.util.List;

public class ArraysClassUtility {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        List<String> list = Arrays.asList(arr);
        
        System.out.println("List from Array: " + list);
        // list.add("D"); // Throws UnsupportedOperationException, size is fixed
    }
}
