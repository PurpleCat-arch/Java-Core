import java.util.HashSet;

public class HashSetBasic {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A"); // Duplicate, will not be added
        set.add("C");
        
        System.out.println("HashSet (no duplicates, unordered): " + set);
    }
}
