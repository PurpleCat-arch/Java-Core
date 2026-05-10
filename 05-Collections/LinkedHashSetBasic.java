import java.util.LinkedHashSet;

public class LinkedHashSetBasic {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("One"); // Duplicate
        
        System.out.println("LinkedHashSet (maintains order): " + set);
    }
}
